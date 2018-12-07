
package opl.com.abw.api;

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
    "tags",
    "customerId",
    "accountId",
    "productId",
    "contractId"
})
public class GenerateQuestionsRequest {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonProperty("customerId")
    private Integer customerId;
    @JsonProperty("accountId")
    private Integer accountId;
    @JsonProperty("productId")
    private Integer productId;
    @JsonProperty("contractId")
    private Integer contractId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("customerId")
    public Integer getCustomerId() {
        return customerId;
    }

    @JsonProperty("customerId")
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @JsonProperty("accountId")
    public Integer getAccountId() {
        return accountId;
    }

    @JsonProperty("accountId")
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @JsonProperty("productId")
    public Integer getProductId() {
        return productId;
    }

    @JsonProperty("productId")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @JsonProperty("contractId")
    public Integer getContractId() {
        return contractId;
    }

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
        return new ToStringBuilder(this).append("tags", tags).append("customerId", customerId).append("accountId", accountId).append("productId", productId).append("contractId", contractId).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(accountId).append(productId).append(customerId).append(contractId).append(additionalProperties).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GenerateQuestionsRequest) == false) {
            return false;
        }
        GenerateQuestionsRequest rhs = ((GenerateQuestionsRequest) other);
        return new EqualsBuilder().append(accountId, rhs.accountId).append(productId, rhs.productId).append(customerId, rhs.customerId).append(contractId, rhs.contractId).append(additionalProperties, rhs.additionalProperties).append(tags, rhs.tags).isEquals();
    }

}
