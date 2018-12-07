
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
    "feeType",
    "grossAmount",
    "netAmount",
    "vat"
})
public class Fee {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("feeType")
    private String feeType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("grossAmount")
    private Integer grossAmount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("netAmount")
    private Integer netAmount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vat")
    private Integer vat;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("feeType")
    public String getFeeType() {
        return feeType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("feeType")
    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("grossAmount")
    public Integer getGrossAmount() {
        return grossAmount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("grossAmount")
    public void setGrossAmount(Integer grossAmount) {
        this.grossAmount = grossAmount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("netAmount")
    public Integer getNetAmount() {
        return netAmount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("netAmount")
    public void setNetAmount(Integer netAmount) {
        this.netAmount = netAmount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vat")
    public Integer getVat() {
        return vat;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vat")
    public void setVat(Integer vat) {
        this.vat = vat;
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
        return new ToStringBuilder(this).append("feeType", feeType).append("grossAmount", grossAmount).append("netAmount", netAmount).append("vat", vat).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(vat).append(grossAmount).append(additionalProperties).append(feeType).append(netAmount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fee) == false) {
            return false;
        }
        Fee rhs = ((Fee) other);
        return new EqualsBuilder().append(vat, rhs.vat).append(grossAmount, rhs.grossAmount).append(additionalProperties, rhs.additionalProperties).append(feeType, rhs.feeType).append(netAmount, rhs.netAmount).isEquals();
    }

}
