
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
    "accountCode",
    "accountContracts",
    "accountId",
    "accountLabel",
    "archival",
    "customerId",
    "eInvocieEmail",
    "hasMagnumProduct",
    "magnumAccount",
    "mix",
    "mobileAccount",
    "nju",
    "prepaid",
    "selected",
    "zetafon"
})
public class GetAccountsListResponse {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("accountCode")
    private String accountCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("accountContracts")
    private List<AccountContract> accountContracts = new ArrayList<AccountContract>();
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
    @JsonProperty("accountLabel")
    private String accountLabel;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("archival")
    private Boolean archival;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("customerId")
    private String customerId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("eInvocieEmail")
    private String eInvocieEmail;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hasMagnumProduct")
    private Boolean hasMagnumProduct;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("magnumAccount")
    private Boolean magnumAccount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mix")
    private Boolean mix;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileAccount")
    private Boolean mobileAccount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("nju")
    private Boolean nju;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("prepaid")
    private Boolean prepaid;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("selected")
    private Boolean selected;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("zetafon")
    private Boolean zetafon;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("accountCode")
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("accountCode")
    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("accountContracts")
    public List<AccountContract> getAccountContracts() {
        return accountContracts;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("accountContracts")
    public void setAccountContracts(List<AccountContract> accountContracts) {
        this.accountContracts = accountContracts;
    }

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
    @JsonProperty("accountLabel")
    public String getAccountLabel() {
        return accountLabel;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("accountLabel")
    public void setAccountLabel(String accountLabel) {
        this.accountLabel = accountLabel;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("archival")
    public Boolean getArchival() {
        return archival;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("archival")
    public void setArchival(Boolean archival) {
        this.archival = archival;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("customerId")
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("customerId")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("eInvocieEmail")
    public String getEInvocieEmail() {
        return eInvocieEmail;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("eInvocieEmail")
    public void setEInvocieEmail(String eInvocieEmail) {
        this.eInvocieEmail = eInvocieEmail;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hasMagnumProduct")
    public Boolean getHasMagnumProduct() {
        return hasMagnumProduct;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hasMagnumProduct")
    public void setHasMagnumProduct(Boolean hasMagnumProduct) {
        this.hasMagnumProduct = hasMagnumProduct;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("magnumAccount")
    public Boolean getMagnumAccount() {
        return magnumAccount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("magnumAccount")
    public void setMagnumAccount(Boolean magnumAccount) {
        this.magnumAccount = magnumAccount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mix")
    public Boolean getMix() {
        return mix;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mix")
    public void setMix(Boolean mix) {
        this.mix = mix;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileAccount")
    public Boolean getMobileAccount() {
        return mobileAccount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileAccount")
    public void setMobileAccount(Boolean mobileAccount) {
        this.mobileAccount = mobileAccount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("nju")
    public Boolean getNju() {
        return nju;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("nju")
    public void setNju(Boolean nju) {
        this.nju = nju;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("prepaid")
    public Boolean getPrepaid() {
        return prepaid;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("prepaid")
    public void setPrepaid(Boolean prepaid) {
        this.prepaid = prepaid;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("selected")
    public Boolean getSelected() {
        return selected;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("selected")
    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("zetafon")
    public Boolean getZetafon() {
        return zetafon;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("zetafon")
    public void setZetafon(Boolean zetafon) {
        this.zetafon = zetafon;
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
        return new ToStringBuilder(this).append("accountCode", accountCode).append("accountContracts", accountContracts).append("accountId", accountId).append("accountLabel", accountLabel).append("archival", archival).append("customerId", customerId).append("eInvocieEmail", eInvocieEmail).append("hasMagnumProduct", hasMagnumProduct).append("magnumAccount", magnumAccount).append("mix", mix).append("mobileAccount", mobileAccount).append("nju", nju).append("prepaid", prepaid).append("selected", selected).append("zetafon", zetafon).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(eInvocieEmail).append(accountCode).append(magnumAccount).append(prepaid).append(zetafon).append(accountId).append(mobileAccount).append(customerId).append(nju).append(accountContracts).append(additionalProperties).append(archival).append(hasMagnumProduct).append(mix).append(accountLabel).append(selected).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetAccountsListResponse) == false) {
            return false;
        }
        GetAccountsListResponse rhs = ((GetAccountsListResponse) other);
        return new EqualsBuilder().append(eInvocieEmail, rhs.eInvocieEmail).append(accountCode, rhs.accountCode).append(magnumAccount, rhs.magnumAccount).append(prepaid, rhs.prepaid).append(zetafon, rhs.zetafon).append(accountId, rhs.accountId).append(mobileAccount, rhs.mobileAccount).append(customerId, rhs.customerId).append(nju, rhs.nju).append(accountContracts, rhs.accountContracts).append(additionalProperties, rhs.additionalProperties).append(archival, rhs.archival).append(hasMagnumProduct, rhs.hasMagnumProduct).append(mix, rhs.mix).append(accountLabel, rhs.accountLabel).append(selected, rhs.selected).isEquals();
    }

}
