
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
    "contractVersion",
    "devices",
    "duration",
    "endDate",
    "endDateDay",
    "endDateMonth",
    "endDateYear",
    "grossCommitment",
    "info",
    "loyaltyNum",
    "modificationDate",
    "offerId",
    "startDate",
    "startDateDay",
    "startDateMonth",
    "startDateYear",
    "status",
    "version"
})
public class FirstLoyalty {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractVersion")
    private String contractVersion;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("devices")
    private List<Device_> devices = new ArrayList<Device_>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("duration")
    private String duration;
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
    @JsonProperty("endDateDay")
    private Integer endDateDay;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endDateMonth")
    private Integer endDateMonth;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endDateYear")
    private Integer endDateYear;
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
    @JsonProperty("info")
    private String info;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("loyaltyNum")
    private String loyaltyNum;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("modificationDate")
    private ModificationDate_ modificationDate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("offerId")
    private String offerId;
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
    @JsonProperty("startDateDay")
    private Integer startDateDay;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startDateMonth")
    private Integer startDateMonth;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startDateYear")
    private Integer startDateYear;
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
    @JsonProperty("version")
    private String version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractVersion")
    public String getContractVersion() {
        return contractVersion;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractVersion")
    public void setContractVersion(String contractVersion) {
        this.contractVersion = contractVersion;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("devices")
    public List<Device_> getDevices() {
        return devices;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("devices")
    public void setDevices(List<Device_> devices) {
        this.devices = devices;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("duration")
    public void setDuration(String duration) {
        this.duration = duration;
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
    @JsonProperty("endDateDay")
    public Integer getEndDateDay() {
        return endDateDay;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endDateDay")
    public void setEndDateDay(Integer endDateDay) {
        this.endDateDay = endDateDay;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endDateMonth")
    public Integer getEndDateMonth() {
        return endDateMonth;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endDateMonth")
    public void setEndDateMonth(Integer endDateMonth) {
        this.endDateMonth = endDateMonth;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endDateYear")
    public Integer getEndDateYear() {
        return endDateYear;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endDateYear")
    public void setEndDateYear(Integer endDateYear) {
        this.endDateYear = endDateYear;
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
    @JsonProperty("info")
    public String getInfo() {
        return info;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("info")
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("loyaltyNum")
    public String getLoyaltyNum() {
        return loyaltyNum;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("loyaltyNum")
    public void setLoyaltyNum(String loyaltyNum) {
        this.loyaltyNum = loyaltyNum;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("modificationDate")
    public ModificationDate_ getModificationDate() {
        return modificationDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("modificationDate")
    public void setModificationDate(ModificationDate_ modificationDate) {
        this.modificationDate = modificationDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("offerId")
    public String getOfferId() {
        return offerId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("offerId")
    public void setOfferId(String offerId) {
        this.offerId = offerId;
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
    @JsonProperty("startDateDay")
    public Integer getStartDateDay() {
        return startDateDay;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startDateDay")
    public void setStartDateDay(Integer startDateDay) {
        this.startDateDay = startDateDay;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startDateMonth")
    public Integer getStartDateMonth() {
        return startDateMonth;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startDateMonth")
    public void setStartDateMonth(Integer startDateMonth) {
        this.startDateMonth = startDateMonth;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startDateYear")
    public Integer getStartDateYear() {
        return startDateYear;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startDateYear")
    public void setStartDateYear(Integer startDateYear) {
        this.startDateYear = startDateYear;
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
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
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
        return new ToStringBuilder(this).append("contractVersion", contractVersion).append("devices", devices).append("duration", duration).append("endDate", endDate).append("endDateDay", endDateDay).append("endDateMonth", endDateMonth).append("endDateYear", endDateYear).append("grossCommitment", grossCommitment).append("info", info).append("loyaltyNum", loyaltyNum).append("modificationDate", modificationDate).append("offerId", offerId).append("startDate", startDate).append("startDateDay", startDateDay).append("startDateMonth", startDateMonth).append("startDateYear", startDateYear).append("status", status).append("version", version).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(devices).append(endDate).append(endDateDay).append(grossCommitment).append(version).append(contractVersion).append(startDateDay).append(duration).append(modificationDate).append(loyaltyNum).append(offerId).append(endDateYear).append(additionalProperties).append(startDateMonth).append(startDateYear).append(startDate).append(endDateMonth).append(info).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FirstLoyalty) == false) {
            return false;
        }
        FirstLoyalty rhs = ((FirstLoyalty) other);
        return new EqualsBuilder().append(devices, rhs.devices).append(endDate, rhs.endDate).append(endDateDay, rhs.endDateDay).append(grossCommitment, rhs.grossCommitment).append(version, rhs.version).append(contractVersion, rhs.contractVersion).append(startDateDay, rhs.startDateDay).append(duration, rhs.duration).append(modificationDate, rhs.modificationDate).append(loyaltyNum, rhs.loyaltyNum).append(offerId, rhs.offerId).append(endDateYear, rhs.endDateYear).append(additionalProperties, rhs.additionalProperties).append(startDateMonth, rhs.startDateMonth).append(startDateYear, rhs.startDateYear).append(startDate, rhs.startDate).append(endDateMonth, rhs.endDateMonth).append(info, rhs.info).append(status, rhs.status).isEquals();
    }

}
