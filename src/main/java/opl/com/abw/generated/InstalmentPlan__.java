
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
    "accountId",
    "creationDate",
    "dueAmount",
    "earliestDueDateInstalment",
    "instalmentPlanId",
    "instalmentPlanType",
    "invoiceIds",
    "mobile",
    "overdueAmountToPay",
    "paidInstalments",
    "prolongation",
    "purposeId",
    "totalAmount",
    "unpaidInstalments"
})
public class InstalmentPlan__ {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("accountId")
    private String accountId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("creationDate")
    private String creationDate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dueAmount")
    private Integer dueAmount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("earliestDueDateInstalment")
    private EarliestDueDateInstalment__ earliestDueDateInstalment;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("instalmentPlanId")
    private String instalmentPlanId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("instalmentPlanType")
    private String instalmentPlanType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("invoiceIds")
    private List<String> invoiceIds = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobile")
    private Boolean mobile;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("overdueAmountToPay")
    private Integer overdueAmountToPay;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("paidInstalments")
    private List<PaidInstalment__> paidInstalments = new ArrayList<PaidInstalment__>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("prolongation")
    private Boolean prolongation;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("purposeId")
    private String purposeId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("totalAmount")
    private Integer totalAmount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("unpaidInstalments")
    private List<UnpaidInstalment__> unpaidInstalments = new ArrayList<UnpaidInstalment__>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("accountId")
    public String getAccountId() {
        return accountId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("accountId")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("creationDate")
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("creationDate")
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dueAmount")
    public Integer getDueAmount() {
        return dueAmount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dueAmount")
    public void setDueAmount(Integer dueAmount) {
        this.dueAmount = dueAmount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("earliestDueDateInstalment")
    public EarliestDueDateInstalment__ getEarliestDueDateInstalment() {
        return earliestDueDateInstalment;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("earliestDueDateInstalment")
    public void setEarliestDueDateInstalment(EarliestDueDateInstalment__ earliestDueDateInstalment) {
        this.earliestDueDateInstalment = earliestDueDateInstalment;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("instalmentPlanId")
    public String getInstalmentPlanId() {
        return instalmentPlanId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("instalmentPlanId")
    public void setInstalmentPlanId(String instalmentPlanId) {
        this.instalmentPlanId = instalmentPlanId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("instalmentPlanType")
    public String getInstalmentPlanType() {
        return instalmentPlanType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("instalmentPlanType")
    public void setInstalmentPlanType(String instalmentPlanType) {
        this.instalmentPlanType = instalmentPlanType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("invoiceIds")
    public List<String> getInvoiceIds() {
        return invoiceIds;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("invoiceIds")
    public void setInvoiceIds(List<String> invoiceIds) {
        this.invoiceIds = invoiceIds;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobile")
    public Boolean getMobile() {
        return mobile;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobile")
    public void setMobile(Boolean mobile) {
        this.mobile = mobile;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("overdueAmountToPay")
    public Integer getOverdueAmountToPay() {
        return overdueAmountToPay;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("overdueAmountToPay")
    public void setOverdueAmountToPay(Integer overdueAmountToPay) {
        this.overdueAmountToPay = overdueAmountToPay;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("paidInstalments")
    public List<PaidInstalment__> getPaidInstalments() {
        return paidInstalments;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("paidInstalments")
    public void setPaidInstalments(List<PaidInstalment__> paidInstalments) {
        this.paidInstalments = paidInstalments;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("prolongation")
    public Boolean getProlongation() {
        return prolongation;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("prolongation")
    public void setProlongation(Boolean prolongation) {
        this.prolongation = prolongation;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("purposeId")
    public String getPurposeId() {
        return purposeId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("purposeId")
    public void setPurposeId(String purposeId) {
        this.purposeId = purposeId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("totalAmount")
    public Integer getTotalAmount() {
        return totalAmount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("totalAmount")
    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("unpaidInstalments")
    public List<UnpaidInstalment__> getUnpaidInstalments() {
        return unpaidInstalments;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("unpaidInstalments")
    public void setUnpaidInstalments(List<UnpaidInstalment__> unpaidInstalments) {
        this.unpaidInstalments = unpaidInstalments;
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
        return new ToStringBuilder(this).append("accountId", accountId).append("creationDate", creationDate).append("dueAmount", dueAmount).append("earliestDueDateInstalment", earliestDueDateInstalment).append("instalmentPlanId", instalmentPlanId).append("instalmentPlanType", instalmentPlanType).append("invoiceIds", invoiceIds).append("mobile", mobile).append("overdueAmountToPay", overdueAmountToPay).append("paidInstalments", paidInstalments).append("prolongation", prolongation).append("purposeId", purposeId).append("totalAmount", totalAmount).append("unpaidInstalments", unpaidInstalments).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(unpaidInstalments).append(mobile).append(purposeId).append(prolongation).append(creationDate).append(instalmentPlanId).append(accountId).append(totalAmount).append(instalmentPlanType).append(dueAmount).append(paidInstalments).append(additionalProperties).append(overdueAmountToPay).append(earliestDueDateInstalment).append(invoiceIds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstalmentPlan__) == false) {
            return false;
        }
        InstalmentPlan__ rhs = ((InstalmentPlan__) other);
        return new EqualsBuilder().append(unpaidInstalments, rhs.unpaidInstalments).append(mobile, rhs.mobile).append(purposeId, rhs.purposeId).append(prolongation, rhs.prolongation).append(creationDate, rhs.creationDate).append(instalmentPlanId, rhs.instalmentPlanId).append(accountId, rhs.accountId).append(totalAmount, rhs.totalAmount).append(instalmentPlanType, rhs.instalmentPlanType).append(dueAmount, rhs.dueAmount).append(paidInstalments, rhs.paidInstalments).append(additionalProperties, rhs.additionalProperties).append(overdueAmountToPay, rhs.overdueAmountToPay).append(earliestDueDateInstalment, rhs.earliestDueDateInstalment).append(invoiceIds, rhs.invoiceIds).isEquals();
    }

}
