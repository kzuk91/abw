
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
    "net",
    "gross"
})
public class VoiceRoamingCost {

    @JsonProperty("net")
    private Double net;
    @JsonProperty("gross")
    private Double gross;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("net")
    public Double getNet() {
        return net;
    }

    @JsonProperty("net")
    public void setNet(Double net) {
        this.net = net;
    }

    @JsonProperty("gross")
    public Double getGross() {
        return gross;
    }

    @JsonProperty("gross")
    public void setGross(Double gross) {
        this.gross = gross;
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
        return new ToStringBuilder(this).append("net", net).append("gross", gross).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(net).append(gross).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VoiceRoamingCost) == false) {
            return false;
        }
        VoiceRoamingCost rhs = ((VoiceRoamingCost) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(net, rhs.net).append(gross, rhs.gross).isEquals();
    }

}
