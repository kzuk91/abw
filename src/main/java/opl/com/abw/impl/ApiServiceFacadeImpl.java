package opl.com.abw.impl;


import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.google.common.base.Strings;
import com.google.common.collect.Sets;
import lombok.extern.slf4j.Slf4j;
import opl.com.abw.constants.Constants;
import opl.com.abw.entity.Endpoint;
import opl.com.abw.entity.Fact;
import opl.com.abw.entity.Tag;
import opl.com.abw.generated.GenerateQuestionsRequest;
import opl.com.abw.generated.GenerateQuestionsResponse;
import opl.com.abw.generated.GetAccountCreationDateRequest;
import opl.com.abw.generated.GetAccountCreationDateResponse;
import opl.com.abw.generated.GetAccountsListRequest;
import opl.com.abw.generated.GetAccountsListResponse;
import opl.com.abw.generated.GetCustomerTypeRequest;
import opl.com.abw.generated.GetCustomerTypeResponse;
import opl.com.abw.generated.GetLimitedTransferStatusRequest;
import opl.com.abw.generated.GetLimitedTransferStatusResponse;
import opl.com.abw.generated.GetMobileContractCountRequest;
import opl.com.abw.generated.GetMobileContractCountResponse;
import opl.com.abw.generated.GetRoamingExceededRequest;
import opl.com.abw.generated.GetRoamingExceededResponse;
import opl.com.abw.generated.GetSimCardsNonLTECountRequest;
import opl.com.abw.generated.GetSimCardsNonLTECountResponse;
import opl.com.abw.service.ApiServiceFacade;
import opl.com.abw.service.TagService;
import opl.com.abw.utils.ApiUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.text.MessageFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static opl.com.abw.constants.Constants.GET_ACCOUNT_CREATION_DATE_ENDPOINT_NAME;
import static opl.com.abw.constants.Constants.GET_ACCOUNT_LIST_ENDPOINT_NAME;
import static opl.com.abw.constants.Constants.GET_CUSTOMER_TYPE_ENDPOINT_NAME;
import static opl.com.abw.constants.Constants.GET_LIMITED_TRANSFER_STATUS_ENDPOINT_NAME;
import static opl.com.abw.constants.Constants.GET_MOBILE_CONTRACT_COUNT_ENDPOINT_NAME;
import static opl.com.abw.constants.Constants.GET_ROAMING_EXCEEDED_ENDPOINT_NAME;
import static opl.com.abw.constants.Constants.GET_SIM_CARDS_NON_LTE_COUNT_ENDPOINT_NAME;

@Slf4j
@Service
public class ApiServiceFacadeImpl extends AbstractServiceFacade implements ApiServiceFacade {

    @Autowired
    private TagService tagService;

    //Constants
    private static final ResponseEntity RESULT_902 = ResponseEntity.status(902).contentType(MediaType.TEXT_PLAIN).body("Bad Request, no tags present");
    private static final ResponseEntity RESULT_903 = ResponseEntity.status(903).contentType(MediaType.TEXT_PLAIN).body("Internal error, tags not defined in Database");
    private static final ResponseEntity RESULT_904 = ResponseEntity.status(904).contentType(MediaType.TEXT_PLAIN).body("Internal error, Facts not defined for sent Tags");
    private static final ResponseEntity RESULT_905 = ResponseEntity.status(905).contentType(MediaType.TEXT_PLAIN).body("Internal error, Endpoints not defined for founded Facts");
    private static final String DATE_FORMAT_INVALID = "Date format invalid";

    //Cache
    private final Cache<String, GetAccountCreationDateResponse> cacheAccountCreationDate = Caffeine.newBuilder().maximumSize(500)
            .expireAfterWrite(1, TimeUnit.DAYS).build();
    private final Cache<String, GetCustomerTypeResponse> cacheCustomerType = Caffeine.newBuilder().maximumSize(500)
            .expireAfterWrite(1, TimeUnit.DAYS).build();
    private final Cache<String, GetLimitedTransferStatusResponse> cacheLimitedTransferStatus = Caffeine.newBuilder().maximumSize(500)
            .expireAfterWrite(1, TimeUnit.DAYS).build();
    private final Cache<String, GetMobileContractCountResponse> cacheMobileContractCount = Caffeine.newBuilder().maximumSize(500)
            .expireAfterWrite(1, TimeUnit.DAYS).build();
    private final Cache<String, GetRoamingExceededResponse> cacheRoamingExceeded = Caffeine.newBuilder().maximumSize(500)
            .expireAfterWrite(1, TimeUnit.DAYS).build();
    private final Cache<String, GetSimCardsNonLTECountResponse> cacheSimCardsNonLteCount = Caffeine.newBuilder().maximumSize(500)
            .expireAfterWrite(1, TimeUnit.DAYS).build();

    @Override
    public ResponseEntity<GetAccountCreationDateResponse> getAccountCreationDate(GetAccountCreationDateRequest request, String endpoint) {
        String key = request.getCustomerId();
        GetAccountCreationDateResponse response = cacheAccountCreationDate.getIfPresent(key);
        if (response == null) {
            UriComponentsBuilder uri = UriComponentsBuilder.fromHttpUrl(MessageFormat.format(endpoint, request.getCustomerId()));
            response = new GetAccountCreationDateResponse();
            ResponseEntity<String> externalResponse = getResponse(request, String.class, uri, false);
            response.setCreationDate(externalResponse.getBody());
            if (externalResponse.getStatusCode().equals(HttpStatus.OK)) {
                cacheAccountCreationDate.put(key, response);
            }
            return ResponseEntity.status(externalResponse.getStatusCode()).body(response);
        }
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @Override
    public ResponseEntity<GetCustomerTypeResponse> getCustomerType(GetCustomerTypeRequest request, String endpoint) {
        String key = request.getCustomerId();
        GetCustomerTypeResponse response = cacheCustomerType.getIfPresent(key);
        if (response == null) {
            UriComponentsBuilder uri = UriComponentsBuilder.fromHttpUrl(MessageFormat.format(endpoint, request.getCustomerId()));
            response = new GetCustomerTypeResponse();
            ResponseEntity<String> externalResponse = getResponse(request, String.class, uri, false);
            response.setCustomerType(externalResponse.getBody());
            if (externalResponse.getStatusCode().equals(HttpStatus.OK)) {
                cacheCustomerType.put(key, response);
            }
            return ResponseEntity.status(externalResponse.getStatusCode()).body(response);
        }
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @Override
    public ResponseEntity<GetLimitedTransferStatusResponse> getLimitedTransferStatus(GetLimitedTransferStatusRequest request, String endpoint) {
        String key = request.getContractId();
        GetLimitedTransferStatusResponse response = cacheLimitedTransferStatus.getIfPresent(key);
        if (response == null) {
            response = new GetLimitedTransferStatusResponse();
            UriComponentsBuilder uri = UriComponentsBuilder.fromHttpUrl(MessageFormat.format(endpoint, request.getContractId()));
            ResponseEntity<String> externalResponse = getResponse(request, String.class, uri, false);
            response.setLimitedTransferStatus(externalResponse.getBody());
            if (externalResponse.getStatusCode().equals(HttpStatus.OK)) {
                cacheLimitedTransferStatus.put(key, response);
            }
            return ResponseEntity.status(externalResponse.getStatusCode()).body(response);
        }
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @Override
    public ResponseEntity<GetMobileContractCountResponse> getMobileContractCount(GetMobileContractCountRequest request, String endpoint) {
        String key = request.getCustomerId();
        GetMobileContractCountResponse response = cacheMobileContractCount.getIfPresent(key);
        if (response == null) {
            UriComponentsBuilder uri = UriComponentsBuilder.fromHttpUrl(endpoint).queryParam("customerId", request.getCustomerId());
            ResponseEntity<GetMobileContractCountResponse> externalResponse = getResponse(request, GetMobileContractCountResponse.class, uri, false);
            if (externalResponse.getStatusCode().equals(HttpStatus.OK)) {
                cacheMobileContractCount.put(key, externalResponse.getBody());
            }
            return externalResponse;
        }
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @Override
    public ResponseEntity<GetRoamingExceededResponse> getRoamingExceeded(GetRoamingExceededRequest request, String endpoint) {
        String key = request.getContractId();
        GetRoamingExceededResponse response = cacheRoamingExceeded.getIfPresent(key);
        if (response == null) {
            UriComponentsBuilder uri = UriComponentsBuilder.fromHttpUrl(MessageFormat.format(endpoint, request.getContractId()));
            ResponseEntity<GetRoamingExceededResponse> externalResponse = getResponse(request, GetRoamingExceededResponse.class, uri, false);
            if (externalResponse.getStatusCode().equals(HttpStatus.OK)) {
                cacheRoamingExceeded.put(key, externalResponse.getBody());
            }
            return externalResponse;
        }
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @Override
    public ResponseEntity<GetSimCardsNonLTECountResponse> getSimCardsNonLTE(GetSimCardsNonLTECountRequest request, String endpoint) {
        String key = request.getAccountId();
        GetSimCardsNonLTECountResponse response = cacheSimCardsNonLteCount.getIfPresent(key);
        if (response == null) {
            response = new GetSimCardsNonLTECountResponse();
            UriComponentsBuilder uri = UriComponentsBuilder.fromHttpUrl(MessageFormat.format(endpoint, request.getAccountId()));
            ResponseEntity<String> externalResponse = getResponse(request, String.class, uri, false);
            response.setSimCardsCount(Integer.valueOf(externalResponse.getBody()));
            if (externalResponse.getStatusCode().equals(HttpStatus.OK)) {
                cacheSimCardsNonLteCount.put(key, response);
            }
            return ResponseEntity.status(externalResponse.getStatusCode()).body(response);
        }
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @Override
    public ResponseEntity<GenerateQuestionsResponse> generateQuestion(GenerateQuestionsRequest request) {
        GenerateQuestionsResponse response = new GenerateQuestionsResponse();
        List<String> questionsQuery = new ArrayList<>();
        if (!request.getTags().isEmpty()) {
            List<Tag> tags = new ArrayList<>();
            request.getTags().forEach(t -> {
                if (tagService.getTagByValue(t) != null) {
                    tags.add(tagService.getTagByValue(t));
                } else {
                    log.info("Tag configuration not found: " + t);
                }
            });
            log.debug("Tags found: %s", tags.toString());
            if (!tags.isEmpty()) {
                List<Fact> facts = new ArrayList<>();
                tags.forEach(t -> facts.addAll(t.getFacts()));
                log.debug("Facts found: %s", facts.toString());
                if (!facts.isEmpty()) {
                    Map<Endpoint, Set<Fact>> endpointsMap = new HashMap<>();
                    facts.forEach(f -> {
                        if (!endpointsMap.containsKey(f.getEndpoint())) {
                            log.trace("Adding endpoint: %s", f.getEndpoint().getName());
                            endpointsMap.get(f.getEndpoint()).add(f);
                        } else {
                            endpointsMap.put(f.getEndpoint(), Sets.newHashSet(f));
                            log.trace("Endpoint: %s already added", f.getEndpoint().getName());
                        }
                    });
                    if (!endpointsMap.isEmpty()) {
                        endpointsMap.forEach((key, value) -> {
                            switch (key.getName()) {
                                case GET_ACCOUNT_CREATION_DATE_ENDPOINT_NAME:
                                    if (Strings.isNullOrEmpty(request.getCustomerId()) || request.getCustomerId().equals(Constants.UNDEFINED)) {
                                        log.warn(Constants.CUSTOMER_ID_NOT_VALID_MESSAGE);
                                        break;
                                    }
                                    GetAccountCreationDateRequest reqAcd = new GetAccountCreationDateRequest();
                                    reqAcd.setCustomerId(request.getCustomerId());
                                    GetAccountCreationDateResponse resAcd = getAccountCreationDate(reqAcd, key.getAddress()).getBody();
                                    if (resAcd.getCreationDate() == null) {
                                        log.warn(Constants.RESPONSE_NULL_MESSAGE);
                                        break;
                                    }
                                    value.forEach(f -> {
                                        try {
                                            questionsQuery.add(ApiUtils.conditionCheck(f, resAcd.getCreationDate(), Date.class));
                                        } catch (ParseException e) {
                                            log.error(DATE_FORMAT_INVALID, e);
                                        }
                                    });
                                    break;
                                case GET_CUSTOMER_TYPE_ENDPOINT_NAME:
                                    if (Strings.isNullOrEmpty(request.getCustomerId()) || request.getCustomerId().equals(Constants.UNDEFINED)) {
                                        log.warn(Constants.CUSTOMER_ID_NOT_VALID_MESSAGE);
                                        break;
                                    }
                                    GetCustomerTypeRequest reqCt = new GetCustomerTypeRequest();
                                    reqCt.setCustomerId(request.getCustomerId());
                                    GetCustomerTypeResponse resCt = getCustomerType(reqCt, key.getAddress()).getBody();
                                    value.forEach(f -> {
                                        try {
                                            questionsQuery.add(ApiUtils.conditionCheck(f, resCt.getCustomerType(), String.class));
                                        } catch (ParseException e) {
                                            log.error(DATE_FORMAT_INVALID, e);
                                        }
                                    });
                                    break;
                                case GET_LIMITED_TRANSFER_STATUS_ENDPOINT_NAME:
                                    if (Strings.isNullOrEmpty(request.getContractId()) || request.getContractId().equals(Constants.UNDEFINED)) {
                                        log.warn(Constants.CONTRACT_ID_NOT_VALID_MESSAGE);
                                        break;
                                    }
                                    GetLimitedTransferStatusRequest reqLts = new GetLimitedTransferStatusRequest();
                                    reqLts.setContractId(request.getContractId());
                                    GetLimitedTransferStatusResponse resLts = getLimitedTransferStatus(reqLts, key.getAddress()).getBody();
                                    value.forEach(f -> {
                                        try {
                                            questionsQuery.add(ApiUtils.conditionCheck(f, resLts.getLimitedTransferStatus(), String.class));
                                        } catch (ParseException e) {
                                            log.error(DATE_FORMAT_INVALID, e);
                                        }
                                    });
                                    break;
                                case GET_MOBILE_CONTRACT_COUNT_ENDPOINT_NAME:
                                    if (Strings.isNullOrEmpty(request.getCustomerId()) || request.getCustomerId().equals(Constants.UNDEFINED)) {
                                        log.warn(Constants.CUSTOMER_ID_NOT_VALID_MESSAGE);
                                        break;
                                    }
                                    GetMobileContractCountRequest reqMcc = new GetMobileContractCountRequest();
                                    reqMcc.setCustomerId(request.getCustomerId());
                                    GetMobileContractCountResponse resMcc = getMobileContractCount(reqMcc, key.getAddress()).getBody();
                                    value.forEach(f -> {
                                        try {
                                            questionsQuery.add(ApiUtils.conditionCheck(f, ApiUtils.getByValue(f.getValue(), resMcc), Integer.class));
                                        } catch (ParseException e) {
                                            log.error(DATE_FORMAT_INVALID, e);
                                        }
                                    });
                                    break;
                                case GET_ROAMING_EXCEEDED_ENDPOINT_NAME:
                                    if (Strings.isNullOrEmpty(request.getContractId()) || request.getContractId().equals(Constants.UNDEFINED)) {
                                        log.warn(Constants.CONTRACT_ID_NOT_VALID_MESSAGE);
                                        break;
                                    }
                                    GetRoamingExceededRequest reqRe = new GetRoamingExceededRequest();
                                    reqRe.setContractId(request.getContractId());
                                    GetRoamingExceededResponse resRe = getRoamingExceeded(reqRe, key.getAddress()).getBody();
                                    value.forEach(f -> {
                                        try {
                                            questionsQuery.add(ApiUtils.conditionCheck(f, ApiUtils.getByValue(f.getValue(), resRe), Integer.class));
                                        } catch (ParseException e) {
                                            log.error(DATE_FORMAT_INVALID, e);
                                        }
                                    });
                                    break;
                                case GET_SIM_CARDS_NON_LTE_COUNT_ENDPOINT_NAME:
                                    if (Strings.isNullOrEmpty(request.getCustomerId()) || request.getCustomerId().equals(Constants.UNDEFINED)) {
                                        log.warn(Constants.CUSTOMER_ID_NOT_VALID_MESSAGE);
                                        break;
                                    }
                                    GetAccountsListRequest reqal = new GetAccountsListRequest();
                                    reqal.setCustomerId(request.getCustomerId());
                                    GetAccountsListResponse resAl = ;

                                    break;
                                case GET_ACCOUNT_LIST_ENDPOINT_NAME:
                                    if (Strings.isNullOrEmpty(request.getAccountId()) || request.getAccountId().equals(Constants.UNDEFINED)) {
                                        log.warn(Constants.ACCOUNT_ID_NOT_VALID_MESSAGE);
                                        break;
                                    }

                                    break;
                                default:
                                    log.warn("Endpoint not served");
                                    break;
                            }
                        });
                    } else {
                        return RESULT_905;
                    }
                } else {
                    return RESULT_904;
                }
            } else {
                return RESULT_903;
            }
        } else {
            return RESULT_902;
        }
        response.setQuestion(StringUtils.join(questionsQuery.toArray(), " "));
        log.info("Question generated: {}", questionsQuery.toString());
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
