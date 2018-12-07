
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
    "commitmentAmount",
    "fee",
    "packageId",
    "serviceId",
    "serviceName",
    "tmCode",
    "translatedName"
})
public class ContractDiscount {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("commitmentAmount")
    private Integer commitmentAmount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fee")
    private Fee fee;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("packageId")
    private String packageId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("serviceId")
    private String serviceId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("serviceName")
    private String serviceName;
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
    @JsonProperty("translatedName")
    private String translatedName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("commitmentAmount")
    public Integer getCommitmentAmount() {
        return commitmentAmount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("commitmentAmount")
    public void setCommitmentAmount(Integer commitmentAmount) {
        this.commitmentAmount = commitmentAmount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fee")
    public Fee getFee() {
        return fee;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fee")
    public void setFee(Fee fee) {
        this.fee = fee;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("packageId")
    public String getPackageId() {
        return packageId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("packageId")
    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("serviceId")
    public String getServiceId() {
        return serviceId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("serviceId")
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("serviceName")
    public String getServiceName() {
        return serviceName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("serviceName")
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
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
    @JsonProperty("translatedName")
    public String getTranslatedName() {
        return translatedName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("translatedName")
    public void setTranslatedName(String translatedName) {
        this.translatedName = translatedName;
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
        return new ToStringBuilder(this).append("commitmentAmount", commitmentAmount).append("fee", fee).append("packageId", packageId).append("serviceId", serviceId).append("serviceName", serviceName).append("tmCode", tmCode).append("translatedName", translatedName).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tmCode).append(commitmentAmount).append(fee).append(packageId).append(additionalProperties).append(serviceId).append(serviceName).append(translatedName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContractDiscount) == false) {
            return false;
        }
        ContractDiscount rhs = ((ContractDiscount) other);
        return new EqualsBuilder().append(tmCode, rhs.tmCode).append(commitmentAmount, rhs.commitmentAmount).append(fee, rhs.fee).append(packageId, rhs.packageId).append(additionalProperties, rhs.additionalProperties).append(serviceId, rhs.serviceId).append(serviceName, rhs.serviceName).append(translatedName, rhs.translatedName).isEquals();
    }

}
