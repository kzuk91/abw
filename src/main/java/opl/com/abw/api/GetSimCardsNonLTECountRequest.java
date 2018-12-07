
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
    "accountId"
})
public class GetSimCardsNonLTECountRequest {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("accountId")
    private Integer accountId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("accountId")
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("accountId")
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
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
        return new ToStringBuilder(this).append("accountId", accountId).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(accountId).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetSimCardsNonLTECountRequest) == false) {
            return false;
        }
        GetSimCardsNonLTECountRequest rhs = ((GetSimCardsNonLTECountRequest) other);
        return new EqualsBuilder().append(accountId, rhs.accountId).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
