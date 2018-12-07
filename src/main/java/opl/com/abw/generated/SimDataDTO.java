
package opl.com.abw.generated;

import java.util.HashMap;
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
    "activationAvailable",
    "activationVisible",
    "antiTheftLock",
    "cardSize",
    "changeAvailable",
    "changeCompatible",
    "checkIfLteSupported",
    "dealerId",
    "eSimDownloandAvailable",
    "electricalProfile",
    "graphicalProfile",
    "hlCode",
    "hrld",
    "imsi",
    "msisdn",
    "plCodes",
    "puk",
    "puk2",
    "reservedByUser",
    "sim",
    "simType",
    "simTypeShort",
    "status"
})
public class SimDataDTO {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("activationAvailable")
    private Boolean activationAvailable;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("activationVisible")
    private Boolean activationVisible;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("antiTheftLock")
    private Boolean antiTheftLock;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cardSize")
    private String cardSize;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("changeAvailable")
    private Boolean changeAvailable;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("changeCompatible")
    private Boolean changeCompatible;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("checkIfLteSupported")
    private Boolean checkIfLteSupported;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dealerId")
    private String dealerId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("eSimDownloandAvailable")
    private Boolean eSimDownloandAvailable;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("electricalProfile")
    private String electricalProfile;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("graphicalProfile")
    private String graphicalProfile;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hlCode")
    private String hlCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hrld")
    private String hrld;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("imsi")
    private String imsi;
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
    @JsonProperty("plCodes")
    private String plCodes;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("puk")
    private String puk;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("puk2")
    private String puk2;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("reservedByUser")
    private String reservedByUser;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sim")
    private String sim;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("simType")
    private String simType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("simTypeShort")
    private String simTypeShort;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("activationAvailable")
    public Boolean getActivationAvailable() {
        return activationAvailable;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("activationAvailable")
    public void setActivationAvailable(Boolean activationAvailable) {
        this.activationAvailable = activationAvailable;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("activationVisible")
    public Boolean getActivationVisible() {
        return activationVisible;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("activationVisible")
    public void setActivationVisible(Boolean activationVisible) {
        this.activationVisible = activationVisible;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("antiTheftLock")
    public Boolean getAntiTheftLock() {
        return antiTheftLock;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("antiTheftLock")
    public void setAntiTheftLock(Boolean antiTheftLock) {
        this.antiTheftLock = antiTheftLock;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cardSize")
    public String getCardSize() {
        return cardSize;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cardSize")
    public void setCardSize(String cardSize) {
        this.cardSize = cardSize;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("changeAvailable")
    public Boolean getChangeAvailable() {
        return changeAvailable;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("changeAvailable")
    public void setChangeAvailable(Boolean changeAvailable) {
        this.changeAvailable = changeAvailable;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("changeCompatible")
    public Boolean getChangeCompatible() {
        return changeCompatible;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("changeCompatible")
    public void setChangeCompatible(Boolean changeCompatible) {
        this.changeCompatible = changeCompatible;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("checkIfLteSupported")
    public Boolean getCheckIfLteSupported() {
        return checkIfLteSupported;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("checkIfLteSupported")
    public void setCheckIfLteSupported(Boolean checkIfLteSupported) {
        this.checkIfLteSupported = checkIfLteSupported;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dealerId")
    public String getDealerId() {
        return dealerId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dealerId")
    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("eSimDownloandAvailable")
    public Boolean getESimDownloandAvailable() {
        return eSimDownloandAvailable;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("eSimDownloandAvailable")
    public void setESimDownloandAvailable(Boolean eSimDownloandAvailable) {
        this.eSimDownloandAvailable = eSimDownloandAvailable;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("electricalProfile")
    public String getElectricalProfile() {
        return electricalProfile;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("electricalProfile")
    public void setElectricalProfile(String electricalProfile) {
        this.electricalProfile = electricalProfile;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("graphicalProfile")
    public String getGraphicalProfile() {
        return graphicalProfile;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("graphicalProfile")
    public void setGraphicalProfile(String graphicalProfile) {
        this.graphicalProfile = graphicalProfile;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hlCode")
    public String getHlCode() {
        return hlCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hlCode")
    public void setHlCode(String hlCode) {
        this.hlCode = hlCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hrld")
    public String getHrld() {
        return hrld;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hrld")
    public void setHrld(String hrld) {
        this.hrld = hrld;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("imsi")
    public String getImsi() {
        return imsi;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("imsi")
    public void setImsi(String imsi) {
        this.imsi = imsi;
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
    @JsonProperty("plCodes")
    public String getPlCodes() {
        return plCodes;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("plCodes")
    public void setPlCodes(String plCodes) {
        this.plCodes = plCodes;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("puk")
    public String getPuk() {
        return puk;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("puk")
    public void setPuk(String puk) {
        this.puk = puk;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("puk2")
    public String getPuk2() {
        return puk2;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("puk2")
    public void setPuk2(String puk2) {
        this.puk2 = puk2;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("reservedByUser")
    public String getReservedByUser() {
        return reservedByUser;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("reservedByUser")
    public void setReservedByUser(String reservedByUser) {
        this.reservedByUser = reservedByUser;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sim")
    public String getSim() {
        return sim;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sim")
    public void setSim(String sim) {
        this.sim = sim;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("simType")
    public String getSimType() {
        return simType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("simType")
    public void setSimType(String simType) {
        this.simType = simType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("simTypeShort")
    public String getSimTypeShort() {
        return simTypeShort;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("simTypeShort")
    public void setSimTypeShort(String simTypeShort) {
        this.simTypeShort = simTypeShort;
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
        return new ToStringBuilder(this).append("activationAvailable", activationAvailable).append("activationVisible", activationVisible).append("antiTheftLock", antiTheftLock).append("cardSize", cardSize).append("changeAvailable", changeAvailable).append("changeCompatible", changeCompatible).append("checkIfLteSupported", checkIfLteSupported).append("dealerId", dealerId).append("eSimDownloandAvailable", eSimDownloandAvailable).append("electricalProfile", electricalProfile).append("graphicalProfile", graphicalProfile).append("hlCode", hlCode).append("hrld", hrld).append("imsi", imsi).append("msisdn", msisdn).append("plCodes", plCodes).append("puk", puk).append("puk2", puk2).append("reservedByUser", reservedByUser).append("sim", sim).append("simType", simType).append("simTypeShort", simTypeShort).append("status", status).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(graphicalProfile).append(electricalProfile).append(puk).append(activationAvailable).append(changeCompatible).append(imsi).append(simTypeShort).append(sim).append(puk2).append(hlCode).append(antiTheftLock).append(msisdn).append(plCodes).append(changeAvailable).append(dealerId).append(activationVisible).append(checkIfLteSupported).append(cardSize).append(simType).append(hrld).append(eSimDownloandAvailable).append(reservedByUser).append(additionalProperties).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SimDataDTO) == false) {
            return false;
        }
        SimDataDTO rhs = ((SimDataDTO) other);
        return new EqualsBuilder().append(graphicalProfile, rhs.graphicalProfile).append(electricalProfile, rhs.electricalProfile).append(puk, rhs.puk).append(activationAvailable, rhs.activationAvailable).append(changeCompatible, rhs.changeCompatible).append(imsi, rhs.imsi).append(simTypeShort, rhs.simTypeShort).append(sim, rhs.sim).append(puk2, rhs.puk2).append(hlCode, rhs.hlCode).append(antiTheftLock, rhs.antiTheftLock).append(msisdn, rhs.msisdn).append(plCodes, rhs.plCodes).append(changeAvailable, rhs.changeAvailable).append(dealerId, rhs.dealerId).append(activationVisible, rhs.activationVisible).append(checkIfLteSupported, rhs.checkIfLteSupported).append(cardSize, rhs.cardSize).append(simType, rhs.simType).append(hrld, rhs.hrld).append(eSimDownloandAvailable, rhs.eSimDownloandAvailable).append(reservedByUser, rhs.reservedByUser).append(additionalProperties, rhs.additionalProperties).append(status, rhs.status).isEquals();
    }

}
