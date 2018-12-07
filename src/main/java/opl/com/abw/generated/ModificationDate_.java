
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
    "chronology",
    "dayOfMonth",
    "dayOfWeek",
    "dayOfYear",
    "hour",
    "minute",
    "month",
    "monthValue",
    "nano",
    "second",
    "year"
})
public class ModificationDate_ {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chronology")
    private Chronology__ chronology;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dayOfMonth")
    private Integer dayOfMonth;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dayOfWeek")
    private String dayOfWeek;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dayOfYear")
    private Integer dayOfYear;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hour")
    private Integer hour;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("minute")
    private Integer minute;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("month")
    private String month;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("monthValue")
    private Integer monthValue;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("nano")
    private Integer nano;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("second")
    private Integer second;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("year")
    private Integer year;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chronology")
    public Chronology__ getChronology() {
        return chronology;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chronology")
    public void setChronology(Chronology__ chronology) {
        this.chronology = chronology;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dayOfMonth")
    public Integer getDayOfMonth() {
        return dayOfMonth;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dayOfMonth")
    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dayOfWeek")
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dayOfWeek")
    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dayOfYear")
    public Integer getDayOfYear() {
        return dayOfYear;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dayOfYear")
    public void setDayOfYear(Integer dayOfYear) {
        this.dayOfYear = dayOfYear;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hour")
    public Integer getHour() {
        return hour;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hour")
    public void setHour(Integer hour) {
        this.hour = hour;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("minute")
    public Integer getMinute() {
        return minute;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("minute")
    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("month")
    public String getMonth() {
        return month;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("month")
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("monthValue")
    public Integer getMonthValue() {
        return monthValue;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("monthValue")
    public void setMonthValue(Integer monthValue) {
        this.monthValue = monthValue;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("nano")
    public Integer getNano() {
        return nano;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("nano")
    public void setNano(Integer nano) {
        this.nano = nano;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("second")
    public Integer getSecond() {
        return second;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("second")
    public void setSecond(Integer second) {
        this.second = second;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("year")
    public Integer getYear() {
        return year;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("year")
    public void setYear(Integer year) {
        this.year = year;
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
        return new ToStringBuilder(this).append("chronology", chronology).append("dayOfMonth", dayOfMonth).append("dayOfWeek", dayOfWeek).append("dayOfYear", dayOfYear).append("hour", hour).append("minute", minute).append("month", month).append("monthValue", monthValue).append("nano", nano).append("second", second).append("year", year).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dayOfYear).append(year).append(nano).append(chronology).append(minute).append(second).append(dayOfWeek).append(hour).append(month).append(dayOfMonth).append(monthValue).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ModificationDate_) == false) {
            return false;
        }
        ModificationDate_ rhs = ((ModificationDate_) other);
        return new EqualsBuilder().append(dayOfYear, rhs.dayOfYear).append(year, rhs.year).append(nano, rhs.nano).append(chronology, rhs.chronology).append(minute, rhs.minute).append(second, rhs.second).append(dayOfWeek, rhs.dayOfWeek).append(hour, rhs.hour).append(month, rhs.month).append(dayOfMonth, rhs.dayOfMonth).append(monthValue, rhs.monthValue).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
