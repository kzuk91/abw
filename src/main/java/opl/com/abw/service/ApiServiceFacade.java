package opl.com.abw.service;

import opl.com.abw.generated.*;
import org.springframework.http.ResponseEntity;

public interface ApiServiceFacade {

    /**
     * Get client creation date
     *
     * @param request
     * @return
     */
    public ResponseEntity<GetAccountCreationDateResponse> getAccountCreationDate(GetAccountCreationDateRequest request, String endpoint);

    ResponseEntity<GetCustomerTypeResponse> getCustomerType(GetCustomerTypeRequest request, String endpoint);

    ResponseEntity<GetLimitedTransferStatusResponse> getLimitedTransferStatus(GetLimitedTransferStatusRequest request, String endpoint);

    ResponseEntity<GetMobileContractCountResponse> getMobileContractCount(GetMobileContractCountRequest request, String endpoint);

    ResponseEntity<GetRoamingExceededResponse> getRoamingExceeded(GetRoamingExceededRequest request, String endpoint);

    ResponseEntity<GetSimCardsNonLTECountResponse> getSimCardsNonLTE(GetSimCardsNonLTECountRequest request, String endpoint);

    ResponseEntity<GenerateQuestionsResponse> generateQuestion(GenerateQuestionsRequest request);
}
