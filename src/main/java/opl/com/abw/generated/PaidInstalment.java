
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
    "accountId",
    "amount",
    "dueDate",
    "instalmentNum",
    "instalmentPlanId",
    "invoiceAccountingId",
    "openAmount"
})
public class PaidInstalment {

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
    @JsonProperty("amount")
    private Integer amount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dueDate")
    private String dueDate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("instalmentNum")
    private Integer instalmentNum;
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
    @JsonProperty("invoiceAccountingId")
    private String invoiceAccountingId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("openAmount")
    private Integer openAmount;
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
    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dueDate")
    public String getDueDate() {
        return dueDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dueDate")
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("instalmentNum")
    public Integer getInstalmentNum() {
        return instalmentNum;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("instalmentNum")
    public void setInstalmentNum(Integer instalmentNum) {
        this.instalmentNum = instalmentNum;
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
    @JsonProperty("invoiceAccountingId")
    public String getInvoiceAccountingId() {
        return invoiceAccountingId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("invoiceAccountingId")
    public void setInvoiceAccountingId(String invoiceAccountingId) {
        this.invoiceAccountingId = invoiceAccountingId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("openAmount")
    public Integer getOpenAmount() {
        return openAmount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("openAmount")
    public void setOpenAmount(Integer openAmount) {
        this.openAmount = openAmount;
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
        return new ToStringBuilder(this).append("accountId", accountId).append("amount", amount).append("dueDate", dueDate).append("instalmentNum", instalmentNum).append("instalmentPlanId", instalmentPlanId).append("invoiceAccountingId", invoiceAccountingId).append("openAmount", openAmount).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(instalmentNum).append(instalmentPlanId).append(accountId).append(amount).append(dueDate).append(invoiceAccountingId).append(additionalProperties).append(openAmount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PaidInstalment) == false) {
            return false;
        }
        PaidInstalment rhs = ((PaidInstalment) other);
        return new EqualsBuilder().append(instalmentNum, rhs.instalmentNum).append(instalmentPlanId, rhs.instalmentPlanId).append(accountId, rhs.accountId).append(amount, rhs.amount).append(dueDate, rhs.dueDate).append(invoiceAccountingId, rhs.invoiceAccountingId).append(additionalProperties, rhs.additionalProperties).append(openAmount, rhs.openAmount).isEquals();
    }

}
