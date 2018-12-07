
package opl.com.abw.generated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "activationDateTime",
    "actualAndExceededGrossCommitmentSum",
    "actualAndExceededGrossCommitmentSumWithDiscounts",
    "contractActivationFee",
    "contractBreachDate",
    "contractDiscounts",
    "contractId",
    "contractType",
    "currentLoyalty",
    "deviceSerialNumber",
    "endDate",
    "exceededGrossCommitment",
    "exceededGrossCommitmentOrZero",
    "exceededMobileMagnumLineTotalCost",
    "firstLoyalty",
    "grossCommitment",
    "grossCommitmentOrZero",
    "grossCommitmentWithDiscounts",
    "grossCommitmentWithDiscountsOrZero",
    "grossCommitmentWithoutDiscounts",
    "homeZoneVasStatus",
    "imeiStateDTO",
    "loyalties",
    "mobileMagnum",
    "msisdn",
    "officeZoneVasStatus",
    "pageId",
    "parentAccountId",
    "partOfMagnum",
    "penalty",
    "primaryDeviceName",
    "retentionFlag",
    "retentionStartDate",
    "servicesWrapper",
    "simDataDTO",
    "startDate",
    "status",
    "statusChangeDateTime",
    "tariffId",
    "tariffName",
    "tariffType",
    "tariffTypeData",
    "tmCode",
    "vasOrangeZoneStatus"
})
public class AccountContract {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("activationDateTime")
    private ActivationDateTime activationDateTime;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("actualAndExceededGrossCommitmentSum")
    private Integer actualAndExceededGrossCommitmentSum;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("actualAndExceededGrossCommitmentSumWithDiscounts")
    private Integer actualAndExceededGrossCommitmentSumWithDiscounts;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractActivationFee")
    private Integer contractActivationFee;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractBreachDate")
    private String contractBreachDate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractDiscounts")
    private List<ContractDiscount> contractDiscounts = new ArrayList<ContractDiscount>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractId")
    private String contractId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractType")
    private String contractType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("currentLoyalty")
    private CurrentLoyalty currentLoyalty;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("deviceSerialNumber")
    private String deviceSerialNumber;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    private String endDate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("exceededGrossCommitment")
    private Integer exceededGrossCommitment;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("exceededGrossCommitmentOrZero")
    private Integer exceededGrossCommitmentOrZero;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("exceededMobileMagnumLineTotalCost")
    private Integer exceededMobileMagnumLineTotalCost;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("firstLoyalty")
    private FirstLoyalty firstLoyalty;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("grossCommitment")
    private Integer grossCommitment;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("grossCommitmentOrZero")
    private Integer grossCommitmentOrZero;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("grossCommitmentWithDiscounts")
    private Integer grossCommitmentWithDiscounts;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("grossCommitmentWithDiscountsOrZero")
    private Integer grossCommitmentWithDiscountsOrZero;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("grossCommitmentWithoutDiscounts")
    private Integer grossCommitmentWithoutDiscounts;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("homeZoneVasStatus")
    private String homeZoneVasStatus;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("imeiStateDTO")
    private String imeiStateDTO;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("loyalties")
    private List<Loyalty> loyalties = new ArrayList<Loyalty>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileMagnum")
    private Boolean mobileMagnum;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("msisdn")
    private String msisdn;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("officeZoneVasStatus")
    private String officeZoneVasStatus;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pageId")
    private String pageId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("parentAccountId")
    private String parentAccountId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("partOfMagnum")
    private Boolean partOfMagnum;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("penalty")
    private String penalty;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("primaryDeviceName")
    private String primaryDeviceName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("retentionFlag")
    private String retentionFlag;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("retentionStartDate")
    private RetentionStartDate retentionStartDate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("servicesWrapper")
    private ServicesWrapper servicesWrapper;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("simDataDTO")
    private SimDataDTO simDataDTO;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    private String startDate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    private String status;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("statusChangeDateTime")
    private StatusChangeDateTime statusChangeDateTime;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tariffId")
    private String tariffId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tariffName")
    private String tariffName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tariffType")
    private String tariffType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tariffTypeData")
    private Boolean tariffTypeData;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tmCode")
    private String tmCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vasOrangeZoneStatus")
    private String vasOrangeZoneStatus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("activationDateTime")
    public ActivationDateTime getActivationDateTime() {
        return activationDateTime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("activationDateTime")
    public void setActivationDateTime(ActivationDateTime activationDateTime) {
        this.activationDateTime = activationDateTime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("actualAndExceededGrossCommitmentSum")
    public Integer getActualAndExceededGrossCommitmentSum() {
        return actualAndExceededGrossCommitmentSum;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("actualAndExceededGrossCommitmentSum")
    public void setActualAndExceededGrossCommitmentSum(Integer actualAndExceededGrossCommitmentSum) {
        this.actualAndExceededGrossCommitmentSum = actualAndExceededGrossCommitmentSum;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("actualAndExceededGrossCommitmentSumWithDiscounts")
    public Integer getActualAndExceededGrossCommitmentSumWithDiscounts() {
        return actualAndExceededGrossCommitmentSumWithDiscounts;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("actualAndExceededGrossCommitmentSumWithDiscounts")
    public void setActualAndExceededGrossCommitmentSumWithDiscounts(Integer actualAndExceededGrossCommitmentSumWithDiscounts) {
        this.actualAndExceededGrossCommitmentSumWithDiscounts = actualAndExceededGrossCommitmentSumWithDiscounts;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractActivationFee")
    public Integer getContractActivationFee() {
        return contractActivationFee;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractActivationFee")
    public void setContractActivationFee(Integer contractActivationFee) {
        this.contractActivationFee = contractActivationFee;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractBreachDate")
    public String getContractBreachDate() {
        return contractBreachDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractBreachDate")
    public void setContractBreachDate(String contractBreachDate) {
        this.contractBreachDate = contractBreachDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractDiscounts")
    public List<ContractDiscount> getContractDiscounts() {
        return contractDiscounts;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractDiscounts")
    public void setContractDiscounts(List<ContractDiscount> contractDiscounts) {
        this.contractDiscounts = contractDiscounts;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractId")
    public String getContractId() {
        return contractId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractId")
    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractType")
    public String getContractType() {
        return contractType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractType")
    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("currentLoyalty")
    public CurrentLoyalty getCurrentLoyalty() {
        return currentLoyalty;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("currentLoyalty")
    public void setCurrentLoyalty(CurrentLoyalty currentLoyalty) {
        this.currentLoyalty = currentLoyalty;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("deviceSerialNumber")
    public String getDeviceSerialNumber() {
        return deviceSerialNumber;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("deviceSerialNumber")
    public void setDeviceSerialNumber(String deviceSerialNumber) {
        this.deviceSerialNumber = deviceSerialNumber;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    public String getEndDate() {
        return endDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("exceededGrossCommitment")
    public Integer getExceededGrossCommitment() {
        return exceededGrossCommitment;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("exceededGrossCommitment")
    public void setExceededGrossCommitment(Integer exceededGrossCommitment) {
        this.exceededGrossCommitment = exceededGrossCommitment;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("exceededGrossCommitmentOrZero")
    public Integer getExceededGrossCommitmentOrZero() {
        return exceededGrossCommitmentOrZero;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("exceededGrossCommitmentOrZero")
    public void setExceededGrossCommitmentOrZero(Integer exceededGrossCommitmentOrZero) {
        this.exceededGrossCommitmentOrZero = exceededGrossCommitmentOrZero;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("exceededMobileMagnumLineTotalCost")
    public Integer getExceededMobileMagnumLineTotalCost() {
        return exceededMobileMagnumLineTotalCost;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("exceededMobileMagnumLineTotalCost")
    public void setExceededMobileMagnumLineTotalCost(Integer exceededMobileMagnumLineTotalCost) {
        this.exceededMobileMagnumLineTotalCost = exceededMobileMagnumLineTotalCost;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("firstLoyalty")
    public FirstLoyalty getFirstLoyalty() {
        return firstLoyalty;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("firstLoyalty")
    public void setFirstLoyalty(FirstLoyalty firstLoyalty) {
        this.firstLoyalty = firstLoyalty;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("grossCommitment")
    public Integer getGrossCommitment() {
        return grossCommitment;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("grossCommitment")
    public void setGrossCommitment(Integer grossCommitment) {
        this.grossCommitment = grossCommitment;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("grossCommitmentOrZero")
    public Integer getGrossCommitmentOrZero() {
        return grossCommitmentOrZero;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("grossCommitmentOrZero")
    public void setGrossCommitmentOrZero(Integer grossCommitmentOrZero) {
        this.grossCommitmentOrZero = grossCommitmentOrZero;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("grossCommitmentWithDiscounts")
    public Integer getGrossCommitmentWithDiscounts() {
        return grossCommitmentWithDiscounts;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("grossCommitmentWithDiscounts")
    public void setGrossCommitmentWithDiscounts(Integer grossCommitmentWithDiscounts) {
        this.grossCommitmentWithDiscounts = grossCommitmentWithDiscounts;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("grossCommitmentWithDiscountsOrZero")
    public Integer getGrossCommitmentWithDiscountsOrZero() {
        return grossCommitmentWithDiscountsOrZero;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("grossCommitmentWithDiscountsOrZero")
    public void setGrossCommitmentWithDiscountsOrZero(Integer grossCommitmentWithDiscountsOrZero) {
        this.grossCommitmentWithDiscountsOrZero = grossCommitmentWithDiscountsOrZero;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("grossCommitmentWithoutDiscounts")
    public Integer getGrossCommitmentWithoutDiscounts() {
        return grossCommitmentWithoutDiscounts;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("grossCommitmentWithoutDiscounts")
    public void setGrossCommitmentWithoutDiscounts(Integer grossCommitmentWithoutDiscounts) {
        this.grossCommitmentWithoutDiscounts = grossCommitmentWithoutDiscounts;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("homeZoneVasStatus")
    public String getHomeZoneVasStatus() {
        return homeZoneVasStatus;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("homeZoneVasStatus")
    public void setHomeZoneVasStatus(String homeZoneVasStatus) {
        this.homeZoneVasStatus = homeZoneVasStatus;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("imeiStateDTO")
    public String getImeiStateDTO() {
        return imeiStateDTO;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("imeiStateDTO")
    public void setImeiStateDTO(String imeiStateDTO) {
        this.imeiStateDTO = imeiStateDTO;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("loyalties")
    public List<Loyalty> getLoyalties() {
        return loyalties;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("loyalties")
    public void setLoyalties(List<Loyalty> loyalties) {
        this.loyalties = loyalties;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileMagnum")
    public Boolean getMobileMagnum() {
        return mobileMagnum;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileMagnum")
    public void setMobileMagnum(Boolean mobileMagnum) {
        this.mobileMagnum = mobileMagnum;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("msisdn")
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("msisdn")
    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("officeZoneVasStatus")
    public String getOfficeZoneVasStatus() {
        return officeZoneVasStatus;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("officeZoneVasStatus")
    public void setOfficeZoneVasStatus(String officeZoneVasStatus) {
        this.officeZoneVasStatus = officeZoneVasStatus;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pageId")
    public String getPageId() {
        return pageId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pageId")
    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("parentAccountId")
    public String getParentAccountId() {
        return parentAccountId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("parentAccountId")
    public void setParentAccountId(String parentAccountId) {
        this.parentAccountId = parentAccountId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("partOfMagnum")
    public Boolean getPartOfMagnum() {
        return partOfMagnum;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("partOfMagnum")
    public void setPartOfMagnum(Boolean partOfMagnum) {
        this.partOfMagnum = partOfMagnum;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("penalty")
    public String getPenalty() {
        return penalty;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("penalty")
    public void setPenalty(String penalty) {
        this.penalty = penalty;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("primaryDeviceName")
    public String getPrimaryDeviceName() {
        return primaryDeviceName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("primaryDeviceName")
    public void setPrimaryDeviceName(String primaryDeviceName) {
        this.primaryDeviceName = primaryDeviceName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("retentionFlag")
    public String getRetentionFlag() {
        return retentionFlag;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("retentionFlag")
    public void setRetentionFlag(String retentionFlag) {
        this.retentionFlag = retentionFlag;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("retentionStartDate")
    public RetentionStartDate getRetentionStartDate() {
        return retentionStartDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("retentionStartDate")
    public void setRetentionStartDate(RetentionStartDate retentionStartDate) {
        this.retentionStartDate = retentionStartDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("servicesWrapper")
    public ServicesWrapper getServicesWrapper() {
        return servicesWrapper;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("servicesWrapper")
    public void setServicesWrapper(ServicesWrapper servicesWrapper) {
        this.servicesWrapper = servicesWrapper;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("simDataDTO")
    public SimDataDTO getSimDataDTO() {
        return simDataDTO;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("simDataDTO")
    public void setSimDataDTO(SimDataDTO simDataDTO) {
        this.simDataDTO = simDataDTO;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("statusChangeDateTime")
    public StatusChangeDateTime getStatusChangeDateTime() {
        return statusChangeDateTime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("statusChangeDateTime")
    public void setStatusChangeDateTime(StatusChangeDateTime statusChangeDateTime) {
        this.statusChangeDateTime = statusChangeDateTime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tariffId")
    public String getTariffId() {
        return tariffId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tariffId")
    public void setTariffId(String tariffId) {
        this.tariffId = tariffId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tariffName")
    public String getTariffName() {
        return tariffName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tariffName")
    public void setTariffName(String tariffName) {
        this.tariffName = tariffName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tariffType")
    public String getTariffType() {
        return tariffType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tariffType")
    public void setTariffType(String tariffType) {
        this.tariffType = tariffType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tariffTypeData")
    public Boolean getTariffTypeData() {
        return tariffTypeData;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tariffTypeData")
    public void setTariffTypeData(Boolean tariffTypeData) {
        this.tariffTypeData = tariffTypeData;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tmCode")
    public String getTmCode() {
        return tmCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tmCode")
    public void setTmCode(String tmCode) {
        this.tmCode = tmCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vasOrangeZoneStatus")
    public String getVasOrangeZoneStatus() {
        return vasOrangeZoneStatus;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vasOrangeZoneStatus")
    public void setVasOrangeZoneStatus(String vasOrangeZoneStatus) {
        this.vasOrangeZoneStatus = vasOrangeZoneStatus;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("activationDateTime", activationDateTime).append("actualAndExceededGrossCommitmentSum", actualAndExceededGrossCommitmentSum).append("actualAndExceededGrossCommitmentSumWithDiscounts", actualAndExceededGrossCommitmentSumWithDiscounts).append("contractActivationFee", contractActivationFee).append("contractBreachDate", contractBreachDate).append("contractDiscounts", contractDiscounts).append("contractId", contractId).append("contractType", contractType).append("currentLoyalty", currentLoyalty).append("deviceSerialNumber", deviceSerialNumber).append("endDate", endDate).append("exceededGrossCommitment", exceededGrossCommitment).append("exceededGrossCommitmentOrZero", exceededGrossCommitmentOrZero).append("exceededMobileMagnumLineTotalCost", exceededMobileMagnumLineTotalCost).append("firstLoyalty", firstLoyalty).append("grossCommitment", grossCommitment).append("grossCommitmentOrZero", grossCommitmentOrZero).append("grossCommitmentWithDiscounts", grossCommitmentWithDiscounts).append("grossCommitmentWithDiscountsOrZero", grossCommitmentWithDiscountsOrZero).append("grossCommitmentWithoutDiscounts", grossCommitmentWithoutDiscounts).append("homeZoneVasStatus", homeZoneVasStatus).append("imeiStateDTO", imeiStateDTO).append("loyalties", loyalties).append("mobileMagnum", mobileMagnum).append("msisdn", msisdn).append("officeZoneVasStatus", officeZoneVasStatus).append("pageId", pageId).append("parentAccountId", parentAccountId).append("partOfMagnum", partOfMagnum).append("penalty", penalty).append("primaryDeviceName", primaryDeviceName).append("retentionFlag", retentionFlag).append("retentionStartDate", retentionStartDate).append("servicesWrapper", servicesWrapper).append("simDataDTO", simDataDTO).append("startDate", startDate).append("status", status).append("statusChangeDateTime", statusChangeDateTime).append("tariffId", tariffId).append("tariffName", tariffName).append("tariffType", tariffType).append("tariffTypeData", tariffTypeData).append("tmCode", tmCode).append("vasOrangeZoneStatus", vasOrangeZoneStatus).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(imeiStateDTO).append(statusChangeDateTime).append(tariffType).append(endDate).append(contractType).append(penalty).append(primaryDeviceName).append(grossCommitment).append(parentAccountId).append(tariffTypeData).append(currentLoyalty).append(simDataDTO).append(contractActivationFee).append(exceededGrossCommitmentOrZero).append(tmCode).append(retentionStartDate).append(actualAndExceededGrossCommitmentSum).append(tariffId).append(firstLoyalty).append(msisdn).append(exceededGrossCommitment).append(activationDateTime).append(loyalties).append(partOfMagnum).append(grossCommitmentWithoutDiscounts).append(exceededMobileMagnumLineTotalCost).append(mobileMagnum).append(retentionFlag).append(pageId).append(servicesWrapper).append(grossCommitmentWithDiscountsOrZero).append(deviceSerialNumber).append(actualAndExceededGrossCommitmentSumWithDiscounts).append(contractDiscounts).append(officeZoneVasStatus).append(tariffName).append(grossCommitmentOrZero).append(contractId).append(grossCommitmentWithDiscounts).append(additionalProperties).append(contractBreachDate).append(vasOrangeZoneStatus).append(homeZoneVasStatus).append(startDate).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountContract) == false) {
            return false;
        }
        AccountContract rhs = ((AccountContract) other);
        return new EqualsBuilder().append(imeiStateDTO, rhs.imeiStateDTO).append(statusChangeDateTime, rhs.statusChangeDateTime).append(tariffType, rhs.tariffType).append(endDate, rhs.endDate).append(contractType, rhs.contractType).append(penalty, rhs.penalty).append(primaryDeviceName, rhs.primaryDeviceName).append(grossCommitment, rhs.grossCommitment).append(parentAccountId, rhs.parentAccountId).append(tariffTypeData, rhs.tariffTypeData).append(currentLoyalty, rhs.currentLoyalty).append(simDataDTO, rhs.simDataDTO).append(contractActivationFee, rhs.contractActivationFee).append(exceededGrossCommitmentOrZero, rhs.exceededGrossCommitmentOrZero).append(tmCode, rhs.tmCode).append(retentionStartDate, rhs.retentionStartDate).append(actualAndExceededGrossCommitmentSum, rhs.actualAndExceededGrossCommitmentSum).append(tariffId, rhs.tariffId).append(firstLoyalty, rhs.firstLoyalty).append(msisdn, rhs.msisdn).append(exceededGrossCommitment, rhs.exceededGrossCommitment).append(activationDateTime, rhs.activationDateTime).append(loyalties, rhs.loyalties).append(partOfMagnum, rhs.partOfMagnum).append(grossCommitmentWithoutDiscounts, rhs.grossCommitmentWithoutDiscounts).append(exceededMobileMagnumLineTotalCost, rhs.exceededMobileMagnumLineTotalCost).append(mobileMagnum, rhs.mobileMagnum).append(retentionFlag, rhs.retentionFlag).append(pageId, rhs.pageId).append(servicesWrapper, rhs.servicesWrapper).append(grossCommitmentWithDiscountsOrZero, rhs.grossCommitmentWithDiscountsOrZero).append(deviceSerialNumber, rhs.deviceSerialNumber).append(actualAndExceededGrossCommitmentSumWithDiscounts, rhs.actualAndExceededGrossCommitmentSumWithDiscounts).append(contractDiscounts, rhs.contractDiscounts).append(officeZoneVasStatus, rhs.officeZoneVasStatus).append(tariffName, rhs.tariffName).append(grossCommitmentOrZero, rhs.grossCommitmentOrZero).append(contractId, rhs.contractId).append(grossCommitmentWithDiscounts, rhs.grossCommitmentWithDiscounts).append(additionalProperties, rhs.additionalProperties).append(contractBreachDate, rhs.contractBreachDate).append(vasOrangeZoneStatus, rhs.vasOrangeZoneStatus).append(homeZoneVasStatus, rhs.homeZoneVasStatus).append(startDate, rhs.startDate).append(status, rhs.status).isEquals();
    }

}
