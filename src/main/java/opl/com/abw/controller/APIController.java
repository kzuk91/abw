package opl.com.abw.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import opl.com.abw.generated.*;
import opl.com.abw.entity.Endpoint;
import opl.com.abw.service.ApiServiceFacade;
import opl.com.abw.service.EndpointService;
import opl.com.abw.utils.ApiUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static opl.com.abw.constants.Constants.*;

@Slf4j
@RestController
@RequestMapping(value = "/api")
@Api(value = "/api", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class APIController {

    @Autowired
    private ApiServiceFacade apiSearchFacade;

    @Autowired
    private EndpointService endpointService;

    @Value("${abw.mocked:true}")
    private boolean mocked;

    @Value("${abw.return.not.completed.questions:true}")
    private boolean returnNotCompletedQuestions;

    public static final ResponseEntity RESULT_901 = ResponseEntity.status(901).contentType(MediaType.TEXT_PLAIN).body("Endpoint resulted with 404 Not Found");

    /**
     * Question request
     *
     * @param request
     * @param param
     * @return
     */
    @RequestMapping(value = "/generateQuestions", method = RequestMethod.POST)
    @ApiOperation(value = "Provide questions", response = GenerateQuestionsResponse.class, httpMethod = "POST", responseContainer = "List")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Questions successfully generated", response = GenerateQuestionsResponse.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "Request does not have all required fields", response = String.class),
            @ApiResponse(code = 901, message = "Endpoint resulted with 404 Not Found", response = String.class),
            @ApiResponse(code = 902, message = "Bad Request, no tags present", response = String.class),
            @ApiResponse(code = 903, message = "Internal error, tags not defined in Database", response = String.class),
            @ApiResponse(code = 904, message = "Internal error, Facts not defined for sent Tags", response = String.class),
            @ApiResponse(code = 905, message = "Internal error, Endpoints not defined for founded Facts", response = String.class)
    })
    @InputLogger
    public ResponseEntity<GenerateQuestionsResponse> generateQuestions(@RequestBody GenerateQuestionsRequest request,
                                                                       @RequestHeader(value = X_HEADER_PARAMETER, defaultValue = X_DEFAULT_HEADER_PARAMETER) String param) {
        boolean requestValid = ApiUtils.validateRequest(request);
        GenerateQuestionsResponse resp = new GenerateQuestionsResponse();
        log.info("Request recieved: " + request.toString());
        if (mocked) {
            resp.setQuestion("\"ryanair\"");
            return ResponseEntity.status(HttpStatus.OK).body(resp);
        } else if (requestValid && !returnNotCompletedQuestions) {
            resp.setAdditionalProperty("message", "Request does not have all required fields");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(resp);
        }
        return apiSearchFacade.generateQuestion(request);
    }

    /**
     * Get Account Creation Date test request
     *
     * @param request
     * @param param
     * @return
     */
    @RequestMapping(value = "/testGetAccountCreationDate", method = RequestMethod.POST)
    @ApiOperation(value = "Testing request for account creation date", response = String.class, httpMethod = "POST")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Test Successful", response = String.class),
            @ApiResponse(code = 901, message = "Endpoint resulted with 404 Not Found", response = String.class)
    })
    @InputLogger
    public ResponseEntity<GetAccountCreationDateResponse> testGetAccountCreationDate(@RequestBody GetAccountCreationDateRequest request,
                                                             @RequestHeader(value = X_HEADER_PARAMETER, defaultValue = X_DEFAULT_HEADER_PARAMETER) String param) {
        Endpoint endpoint = endpointService.getEndpointByName(GET_ACCOUNT_CREATION_DATE_ENDPOINT_NAME);
        ResponseEntity<GetAccountCreationDateResponse> response = apiSearchFacade.getAccountCreationDate(request, endpoint.getAddress());
        if (response.getStatusCode().equals(HttpStatus.NOT_FOUND))
            return RESULT_901;
        return response;
    }

    /**
     * Get Customer Type test request
     *
     * @param request
     * @param param
     * @return
     */
    @RequestMapping(value = "/testGetCustomerType", method = RequestMethod.POST)
    @ApiOperation(value = "Testing request for customer type", response = String.class, httpMethod = "POST")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Test Successful", response = String.class),
            @ApiResponse(code = 901, message = "Endpoint resulted with 404 Not Found", response = String.class)
    })
    @InputLogger
    public ResponseEntity<GetCustomerTypeResponse> testGetCustomerType(@RequestBody GetCustomerTypeRequest request,
                                                      @RequestHeader(value = X_HEADER_PARAMETER, defaultValue = X_DEFAULT_HEADER_PARAMETER) String param) {
        Endpoint endpoint = endpointService.getEndpointByName(GET_CUSTOMER_TYPE_ENDPOINT_NAME);
        ResponseEntity<GetCustomerTypeResponse> response = apiSearchFacade.getCustomerType(request, endpoint.getAddress());
        if (response.getStatusCode().equals(HttpStatus.NOT_FOUND))
            return RESULT_901;
        return response;
    }

    /**
     * Get Limited Transfer Status test request
     *
     * @param request
     * @param param
     * @return
     */
    @RequestMapping(value = "/testGetLimitedTransferStatus", method = RequestMethod.POST)
    @ApiOperation(value = "Testing request for limited transfer status", response = GetLimitedTransferStatusRequest.class, httpMethod = "POST")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Test Successful", response = String.class),
            @ApiResponse(code = 901, message = "Endpoint resulted with 404 Not Found", response = String.class)
    })
    @InputLogger
    public ResponseEntity<GetLimitedTransferStatusResponse> testGetLimitedTransferStatus(@RequestBody GetLimitedTransferStatusRequest request,
                                                               @RequestHeader(value = X_HEADER_PARAMETER, defaultValue = X_DEFAULT_HEADER_PARAMETER) String param) {
        Endpoint endpoint = endpointService.getEndpointByName(GET_LIMITED_TRANSFER_STATUS_ENDPOINT_NAME);
        ResponseEntity<GetLimitedTransferStatusResponse> response = apiSearchFacade.getLimitedTransferStatus(request, endpoint.getAddress());
        if (response.getStatusCode().equals(HttpStatus.NOT_FOUND))
            return RESULT_901;
        return response;
    }

    /**
     * Get Account Creation Date test request
     *
     * @param request
     * @param param
     * @return
     */
    @RequestMapping(value = "/testGetMobileContractCount", method = RequestMethod.POST)
    @ApiOperation(value = "Testing request for mobile contract count", response = GetMobileContractCountResponse.class, httpMethod = "POST")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Test Successful", response = GetMobileContractCountResponse.class),
            @ApiResponse(code = 901, message = "Endpoint resulted with 404 Not Found", response = String.class)
    })
    @InputLogger
    public ResponseEntity<GetMobileContractCountResponse> testGetMobileContractCount(@RequestBody GetMobileContractCountRequest request,
                                                                                     @RequestHeader(value = X_HEADER_PARAMETER, defaultValue = X_DEFAULT_HEADER_PARAMETER) String param) {
        Endpoint endpoint = endpointService.getEndpointByName(GET_MOBILE_CONTRACT_COUNT_ENDPOINT_NAME);
        ResponseEntity<GetMobileContractCountResponse> response = apiSearchFacade.getMobileContractCount(request, endpoint.getAddress());
        if (response.getStatusCode().equals(HttpStatus.NOT_FOUND))
            return RESULT_901;
        return response;
    }

    /**
     * Get Account Creation Date test request
     *
     * @param request
     * @param param
     * @return
     */
    @RequestMapping(value = "/testGetRoamingExceeded", method = RequestMethod.POST)
    @ApiOperation(value = "Testing request for roaming exceeded", response = GetRoamingExceededResponse.class, httpMethod = "POST")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Test Successful", response = GetRoamingExceededResponse.class),
            @ApiResponse(code = 901, message = "Endpoint resulted with 404 Not Found", response = String.class)
    })
    @InputLogger
    public ResponseEntity<GetRoamingExceededResponse> testGetRoamingExceeded(@RequestBody GetRoamingExceededRequest request,
                                                                             @RequestHeader(value = X_HEADER_PARAMETER, defaultValue = X_DEFAULT_HEADER_PARAMETER) String param) {
        Endpoint endpoint = endpointService.getEndpointByName(GET_ROAMING_EXCEEDED_ENDPOINT_NAME);
        ResponseEntity<GetRoamingExceededResponse> response = apiSearchFacade.getRoamingExceeded(request, endpoint.getAddress());
        if (response.getStatusCode().equals(HttpStatus.NOT_FOUND))
            return RESULT_901;
        return response;
    }

    /**
     * Get Account Creation Date test request
     *
     * @param request
     * @param param
     * @return
     */
    @RequestMapping(value = "/testGetSimCardNonLTE", method = RequestMethod.POST)
    @ApiOperation(value = "Testing request for sim card non lte", response = String.class, httpMethod = "POST")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Test Successful", response = String.class),
            @ApiResponse(code = 901, message = "Endpoint resulted with 404 Not Found", response = String.class)
    })
    @InputLogger
    public ResponseEntity<GetSimCardsNonLTECountResponse> testGetSimCardNonLTE(@RequestBody GetSimCardsNonLTECountRequest request,
                                                       @RequestHeader(value = X_HEADER_PARAMETER, defaultValue = X_DEFAULT_HEADER_PARAMETER) String param) {
        Endpoint endpoint = endpointService.getEndpointByName(GET_SIM_CARDS_NON_LTE_COUNT_ENDPOINT_NAME);
        ResponseEntity<GetSimCardsNonLTECountResponse> response = apiSearchFacade.getSimCardsNonLTE(request, endpoint.getAddress());
        if (response.getStatusCode().equals(HttpStatus.NOT_FOUND))
            return RESULT_901;
        return response;
    }

}
