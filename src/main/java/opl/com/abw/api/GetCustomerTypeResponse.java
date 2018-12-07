
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
    "customerType"
})
public class GetCustomerTypeResponse {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("customerType")
    private String customerType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("customerType")
    public String getCustomerType() {
        return customerType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("customerType")
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
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
        return new ToStringBuilder(this).append("customerType", customerType).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(customerType).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetCustomerTypeResponse) == false) {
            return false;
        }
        GetCustomerTypeResponse rhs = ((GetCustomerTypeResponse) other);
        return new EqualsBuilder().append(customerType, rhs.customerType).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
