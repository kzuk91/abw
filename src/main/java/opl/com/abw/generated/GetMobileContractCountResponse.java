
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
    "prePaid",
    "postPaid",
    "mobileVoice",
    "mobileData",
    "mobileHomeData"
})
public class GetMobileContractCountResponse {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("prePaid")
    private Integer prePaid;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("postPaid")
    private Integer postPaid;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileVoice")
    private Integer mobileVoice;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileData")
    private Integer mobileData;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileHomeData")
    private Integer mobileHomeData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("prePaid")
    public Integer getPrePaid() {
        return prePaid;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("prePaid")
    public void setPrePaid(Integer prePaid) {
        this.prePaid = prePaid;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("postPaid")
    public Integer getPostPaid() {
        return postPaid;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("postPaid")
    public void setPostPaid(Integer postPaid) {
        this.postPaid = postPaid;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileVoice")
    public Integer getMobileVoice() {
        return mobileVoice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileVoice")
    public void setMobileVoice(Integer mobileVoice) {
        this.mobileVoice = mobileVoice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileData")
    public Integer getMobileData() {
        return mobileData;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileData")
    public void setMobileData(Integer mobileData) {
        this.mobileData = mobileData;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileHomeData")
    public Integer getMobileHomeData() {
        return mobileHomeData;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobileHomeData")
    public void setMobileHomeData(Integer mobileHomeData) {
        this.mobileHomeData = mobileHomeData;
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
        return new ToStringBuilder(this).append("prePaid", prePaid).append("postPaid", postPaid).append("mobileVoice", mobileVoice).append("mobileData", mobileData).append("mobileHomeData", mobileHomeData).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mobileVoice).append(postPaid).append(mobileData).append(prePaid).append(mobileHomeData).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetMobileContractCountResponse) == false) {
            return false;
        }
        GetMobileContractCountResponse rhs = ((GetMobileContractCountResponse) other);
        return new EqualsBuilder().append(mobileVoice, rhs.mobileVoice).append(postPaid, rhs.postPaid).append(mobileData, rhs.mobileData).append(prePaid, rhs.prePaid).append(mobileHomeData, rhs.mobileHomeData).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
