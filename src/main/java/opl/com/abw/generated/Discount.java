
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
    "commitmentGrossAmount",
    "serviceName"
})
public class Discount {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("commitmentGrossAmount")
    private Integer commitmentGrossAmount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("serviceName")
    private String serviceName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("commitmentGrossAmount")
    public Integer getCommitmentGrossAmount() {
        return commitmentGrossAmount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("commitmentGrossAmount")
    public void setCommitmentGrossAmount(Integer commitmentGrossAmount) {
        this.commitmentGrossAmount = commitmentGrossAmount;
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
        return new ToStringBuilder(this).append("commitmentGrossAmount", commitmentGrossAmount).append("serviceName", serviceName).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(serviceName).append(commitmentGrossAmount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Discount) == false) {
            return false;
        }
        Discount rhs = ((Discount) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(serviceName, rhs.serviceName).append(commitmentGrossAmount, rhs.commitmentGrossAmount).isEquals();
    }

}
