
package opl.com.abw.api;

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
    "contractId"
})
public class GetLimitedTransferStatusRequest {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractId")
    private Integer contractId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractId")
    public Integer getContractId() {
        return contractId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractId")
    public void setContractId(Integer contractId) {
        this.contractId = contractId;
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
        return new ToStringBuilder(this).append("contractId", contractId).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(contractId).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetLimitedTransferStatusRequest) == false) {
            return false;
        }
        GetLimitedTransferStatusRequest rhs = ((GetLimitedTransferStatusRequest) other);
        return new EqualsBuilder().append(contractId, rhs.contractId).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
