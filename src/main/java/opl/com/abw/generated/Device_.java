
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
    "discountedEquipmentPrice",
    "displayName",
    "equipmentPrice",
    "hasInstalmentPlan",
    "instalmentPlan",
    "marketEquipmentPrice",
    "name",
    "primary",
    "serialNumber",
    "sim"
})
public class Device_ {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("discountedEquipmentPrice")
    private String discountedEquipmentPrice;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayName")
    private String displayName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("equipmentPrice")
    private String equipmentPrice;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hasInstalmentPlan")
    private Boolean hasInstalmentPlan;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("instalmentPlan")
    private InstalmentPlan_ instalmentPlan;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("marketEquipmentPrice")
    private String marketEquipmentPrice;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("primary")
    private Boolean primary;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("serialNumber")
    private String serialNumber;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sim")
    private Boolean sim;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("discountedEquipmentPrice")
    public String getDiscountedEquipmentPrice() {
        return discountedEquipmentPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("discountedEquipmentPrice")
    public void setDiscountedEquipmentPrice(String discountedEquipmentPrice) {
        this.discountedEquipmentPrice = discountedEquipmentPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("equipmentPrice")
    public String getEquipmentPrice() {
        return equipmentPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("equipmentPrice")
    public void setEquipmentPrice(String equipmentPrice) {
        this.equipmentPrice = equipmentPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hasInstalmentPlan")
    public Boolean getHasInstalmentPlan() {
        return hasInstalmentPlan;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hasInstalmentPlan")
    public void setHasInstalmentPlan(Boolean hasInstalmentPlan) {
        this.hasInstalmentPlan = hasInstalmentPlan;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("instalmentPlan")
    public InstalmentPlan_ getInstalmentPlan() {
        return instalmentPlan;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("instalmentPlan")
    public void setInstalmentPlan(InstalmentPlan_ instalmentPlan) {
        this.instalmentPlan = instalmentPlan;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("marketEquipmentPrice")
    public String getMarketEquipmentPrice() {
        return marketEquipmentPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("marketEquipmentPrice")
    public void setMarketEquipmentPrice(String marketEquipmentPrice) {
        this.marketEquipmentPrice = marketEquipmentPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("primary")
    public Boolean getPrimary() {
        return primary;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("primary")
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("serialNumber")
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("serialNumber")
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sim")
    public Boolean getSim() {
        return sim;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sim")
    public void setSim(Boolean sim) {
        this.sim = sim;
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
        return new ToStringBuilder(this).append("discountedEquipmentPrice", discountedEquipmentPrice).append("displayName", displayName).append("equipmentPrice", equipmentPrice).append("hasInstalmentPlan", hasInstalmentPlan).append("instalmentPlan", instalmentPlan).append("marketEquipmentPrice", marketEquipmentPrice).append("name", name).append("primary", primary).append("serialNumber", serialNumber).append("sim", sim).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(instalmentPlan).append(serialNumber).append(hasInstalmentPlan).append(displayName).append(sim).append(equipmentPrice).append(name).append(additionalProperties).append(marketEquipmentPrice).append(discountedEquipmentPrice).append(primary).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Device_) == false) {
            return false;
        }
        Device_ rhs = ((Device_) other);
        return new EqualsBuilder().append(instalmentPlan, rhs.instalmentPlan).append(serialNumber, rhs.serialNumber).append(hasInstalmentPlan, rhs.hasInstalmentPlan).append(displayName, rhs.displayName).append(sim, rhs.sim).append(equipmentPrice, rhs.equipmentPrice).append(name, rhs.name).append(additionalProperties, rhs.additionalProperties).append(marketEquipmentPrice, rhs.marketEquipmentPrice).append(discountedEquipmentPrice, rhs.discountedEquipmentPrice).append(primary, rhs.primary).isEquals();
    }

}
