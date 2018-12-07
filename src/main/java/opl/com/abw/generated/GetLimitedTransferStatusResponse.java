
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
    "limitedTransferStatus"
})
public class GetLimitedTransferStatusResponse {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("limitedTransferStatus")
    private String limitedTransferStatus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("limitedTransferStatus")
    public String getLimitedTransferStatus() {
        return limitedTransferStatus;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("limitedTransferStatus")
    public void setLimitedTransferStatus(String limitedTransferStatus) {
        this.limitedTransferStatus = limitedTransferStatus;
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
        return new ToStringBuilder(this).append("limitedTransferStatus", limitedTransferStatus).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(limitedTransferStatus).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetLimitedTransferStatusResponse) == false) {
            return false;
        }
        GetLimitedTransferStatusResponse rhs = ((GetLimitedTransferStatusResponse) other);
        return new EqualsBuilder().append(limitedTransferStatus, rhs.limitedTransferStatus).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
