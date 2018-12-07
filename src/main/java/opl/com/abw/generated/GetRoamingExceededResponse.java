
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
    "smsRoamingCost",
    "voiceRoamingCost",
    "dataRoamingCost",
    "smsInternationalCost",
    "voiceInternationalCost"
})
public class GetRoamingExceededResponse {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("smsRoamingCost")
    private SmsRoamingCost smsRoamingCost;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("voiceRoamingCost")
    private VoiceRoamingCost voiceRoamingCost;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dataRoamingCost")
    private DataRoamingCost dataRoamingCost;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("smsInternationalCost")
    private SmsInternationalCost smsInternationalCost;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("voiceInternationalCost")
    private VoiceInternationalCost voiceInternationalCost;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("smsRoamingCost")
    public SmsRoamingCost getSmsRoamingCost() {
        return smsRoamingCost;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("smsRoamingCost")
    public void setSmsRoamingCost(SmsRoamingCost smsRoamingCost) {
        this.smsRoamingCost = smsRoamingCost;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("voiceRoamingCost")
    public VoiceRoamingCost getVoiceRoamingCost() {
        return voiceRoamingCost;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("voiceRoamingCost")
    public void setVoiceRoamingCost(VoiceRoamingCost voiceRoamingCost) {
        this.voiceRoamingCost = voiceRoamingCost;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dataRoamingCost")
    public DataRoamingCost getDataRoamingCost() {
        return dataRoamingCost;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dataRoamingCost")
    public void setDataRoamingCost(DataRoamingCost dataRoamingCost) {
        this.dataRoamingCost = dataRoamingCost;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("smsInternationalCost")
    public SmsInternationalCost getSmsInternationalCost() {
        return smsInternationalCost;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("smsInternationalCost")
    public void setSmsInternationalCost(SmsInternationalCost smsInternationalCost) {
        this.smsInternationalCost = smsInternationalCost;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("voiceInternationalCost")
    public VoiceInternationalCost getVoiceInternationalCost() {
        return voiceInternationalCost;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("voiceInternationalCost")
    public void setVoiceInternationalCost(VoiceInternationalCost voiceInternationalCost) {
        this.voiceInternationalCost = voiceInternationalCost;
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
        return new ToStringBuilder(this).append("smsRoamingCost", smsRoamingCost).append("voiceRoamingCost", voiceRoamingCost).append("dataRoamingCost", dataRoamingCost).append("smsInternationalCost", smsInternationalCost).append("voiceInternationalCost", voiceInternationalCost).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(smsRoamingCost).append(voiceInternationalCost).append(smsInternationalCost).append(voiceRoamingCost).append(additionalProperties).append(dataRoamingCost).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetRoamingExceededResponse) == false) {
            return false;
        }
        GetRoamingExceededResponse rhs = ((GetRoamingExceededResponse) other);
        return new EqualsBuilder().append(smsRoamingCost, rhs.smsRoamingCost).append(voiceInternationalCost, rhs.voiceInternationalCost).append(smsInternationalCost, rhs.smsInternationalCost).append(voiceRoamingCost, rhs.voiceRoamingCost).append(additionalProperties, rhs.additionalProperties).append(dataRoamingCost, rhs.dataRoamingCost).isEquals();
    }

}
