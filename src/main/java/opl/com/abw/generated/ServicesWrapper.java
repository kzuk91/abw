
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
    "activations",
    "activationsCommitmentsAmountGross",
    "activationsCommitmentsAmountNet",
    "contractGrossAmountCommitment",
    "contractNetAmountCommitment",
    "discountCommitmentAmountGross",
    "discounts",
    "subscriptions",
    "subscriptionsCommitmentAmountGross",
    "subscriptionsCommitmentAmountNet"
})
public class ServicesWrapper {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("activations")
    private List<Activation> activations = new ArrayList<Activation>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("activationsCommitmentsAmountGross")
    private Integer activationsCommitmentsAmountGross;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("activationsCommitmentsAmountNet")
    private Integer activationsCommitmentsAmountNet;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractGrossAmountCommitment")
    private Integer contractGrossAmountCommitment;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractNetAmountCommitment")
    private Integer contractNetAmountCommitment;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("discountCommitmentAmountGross")
    private Integer discountCommitmentAmountGross;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("discounts")
    private List<Discount> discounts = new ArrayList<Discount>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subscriptions")
    private List<Subscription> subscriptions = new ArrayList<Subscription>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subscriptionsCommitmentAmountGross")
    private Integer subscriptionsCommitmentAmountGross;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subscriptionsCommitmentAmountNet")
    private Integer subscriptionsCommitmentAmountNet;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("activations")
    public List<Activation> getActivations() {
        return activations;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("activations")
    public void setActivations(List<Activation> activations) {
        this.activations = activations;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("activationsCommitmentsAmountGross")
    public Integer getActivationsCommitmentsAmountGross() {
        return activationsCommitmentsAmountGross;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("activationsCommitmentsAmountGross")
    public void setActivationsCommitmentsAmountGross(Integer activationsCommitmentsAmountGross) {
        this.activationsCommitmentsAmountGross = activationsCommitmentsAmountGross;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("activationsCommitmentsAmountNet")
    public Integer getActivationsCommitmentsAmountNet() {
        return activationsCommitmentsAmountNet;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("activationsCommitmentsAmountNet")
    public void setActivationsCommitmentsAmountNet(Integer activationsCommitmentsAmountNet) {
        this.activationsCommitmentsAmountNet = activationsCommitmentsAmountNet;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractGrossAmountCommitment")
    public Integer getContractGrossAmountCommitment() {
        return contractGrossAmountCommitment;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractGrossAmountCommitment")
    public void setContractGrossAmountCommitment(Integer contractGrossAmountCommitment) {
        this.contractGrossAmountCommitment = contractGrossAmountCommitment;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractNetAmountCommitment")
    public Integer getContractNetAmountCommitment() {
        return contractNetAmountCommitment;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contractNetAmountCommitment")
    public void setContractNetAmountCommitment(Integer contractNetAmountCommitment) {
        this.contractNetAmountCommitment = contractNetAmountCommitment;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("discountCommitmentAmountGross")
    public Integer getDiscountCommitmentAmountGross() {
        return discountCommitmentAmountGross;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("discountCommitmentAmountGross")
    public void setDiscountCommitmentAmountGross(Integer discountCommitmentAmountGross) {
        this.discountCommitmentAmountGross = discountCommitmentAmountGross;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("discounts")
    public List<Discount> getDiscounts() {
        return discounts;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("discounts")
    public void setDiscounts(List<Discount> discounts) {
        this.discounts = discounts;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subscriptions")
    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subscriptions")
    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subscriptionsCommitmentAmountGross")
    public Integer getSubscriptionsCommitmentAmountGross() {
        return subscriptionsCommitmentAmountGross;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subscriptionsCommitmentAmountGross")
    public void setSubscriptionsCommitmentAmountGross(Integer subscriptionsCommitmentAmountGross) {
        this.subscriptionsCommitmentAmountGross = subscriptionsCommitmentAmountGross;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subscriptionsCommitmentAmountNet")
    public Integer getSubscriptionsCommitmentAmountNet() {
        return subscriptionsCommitmentAmountNet;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subscriptionsCommitmentAmountNet")
    public void setSubscriptionsCommitmentAmountNet(Integer subscriptionsCommitmentAmountNet) {
        this.subscriptionsCommitmentAmountNet = subscriptionsCommitmentAmountNet;
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
        return new ToStringBuilder(this).append("activations", activations).append("activationsCommitmentsAmountGross", activationsCommitmentsAmountGross).append("activationsCommitmentsAmountNet", activationsCommitmentsAmountNet).append("contractGrossAmountCommitment", contractGrossAmountCommitment).append("contractNetAmountCommitment", contractNetAmountCommitment).append("discountCommitmentAmountGross", discountCommitmentAmountGross).append("discounts", discounts).append("subscriptions", subscriptions).append("subscriptionsCommitmentAmountGross", subscriptionsCommitmentAmountGross).append("subscriptionsCommitmentAmountNet", subscriptionsCommitmentAmountNet).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(activationsCommitmentsAmountNet).append(subscriptions).append(subscriptionsCommitmentAmountGross).append(discounts).append(contractNetAmountCommitment).append(activations).append(activationsCommitmentsAmountGross).append(additionalProperties).append(contractGrossAmountCommitment).append(discountCommitmentAmountGross).append(subscriptionsCommitmentAmountNet).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServicesWrapper) == false) {
            return false;
        }
        ServicesWrapper rhs = ((ServicesWrapper) other);
        return new EqualsBuilder().append(activationsCommitmentsAmountNet, rhs.activationsCommitmentsAmountNet).append(subscriptions, rhs.subscriptions).append(subscriptionsCommitmentAmountGross, rhs.subscriptionsCommitmentAmountGross).append(discounts, rhs.discounts).append(contractNetAmountCommitment, rhs.contractNetAmountCommitment).append(activations, rhs.activations).append(activationsCommitmentsAmountGross, rhs.activationsCommitmentsAmountGross).append(additionalProperties, rhs.additionalProperties).append(contractGrossAmountCommitment, rhs.contractGrossAmountCommitment).append(discountCommitmentAmountGross, rhs.discountCommitmentAmountGross).append(subscriptionsCommitmentAmountNet, rhs.subscriptionsCommitmentAmountNet).isEquals();
    }

}
