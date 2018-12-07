package opl.com.abw.utils;

import com.google.common.base.Strings;
import lombok.extern.slf4j.Slf4j;
import opl.com.abw.generated.GenerateQuestionsRequest;
import opl.com.abw.generated.GetMobileContractCountResponse;
import opl.com.abw.generated.GetRoamingExceededResponse;
import opl.com.abw.constants.Constants;
import opl.com.abw.entity.Fact;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Slf4j
public class ApiUtils {
    
    public static final String INSTANCE_LOGGER = "Type instance: {}, fact condition value: {}";

    public static String conditionCheck(Fact fact, Object value, Class<?> type) throws ParseException {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        switch (fact.getCondition().getComparator()) {
            case EQUALS:
                if (type == String.class) {
                    return fact.getCondition().getValue().equals(value) ? fact.getCondition().getQuestion().getPositiveValue() : fact.getCondition().getQuestion().getNegativeValue();
                } else if (type == Date.class) {
                    return format.parse(fact.getCondition().getValue()).equals(format.parse(value.toString())) ? fact.getCondition().getQuestion().getPositiveValue() : fact.getCondition().getQuestion().getNegativeValue();
                } else {
                    return Double.valueOf(fact.getCondition().getValue()) == Double.valueOf(value.toString()) ? fact.getCondition().getQuestion().getPositiveValue() : fact.getCondition().getQuestion().getNegativeValue();
                }
            case GREATER:
                if (type == String.class) {
                    return "";
                } else if (type == Date.class && fact.getCondition().getValue().contains("days")) {
                    String[] valueTable = fact.getCondition().getValue().split(":");
                    Calendar calendar = new GregorianCalendar();
                    calendar.add(Calendar.DATE, Integer.valueOf(valueTable[1]));
                    Date comparedDate = calendar.getTime();
                    return format.parse(value.toString()).after(comparedDate) ? fact.getCondition().getQuestion().getPositiveValue() : fact.getCondition().getQuestion().getNegativeValue();
                } else if (type == Date.class) {
                    return format.parse(fact.getCondition().getValue()).after(format.parse(value.toString())) ? fact.getCondition().getQuestion().getPositiveValue() : fact.getCondition().getQuestion().getNegativeValue();
                } else {
                    return Double.valueOf(fact.getCondition().getValue()) > Double.valueOf(value.toString()) ? fact.getCondition().getQuestion().getPositiveValue() : fact.getCondition().getQuestion().getNegativeValue();
                }
            case LESSER:
                if (type == String.class) {
                    return "";
                } else if (type == Date.class && fact.getCondition().getValue().contains("days")) {
                    String[] valueTable = fact.getCondition().getValue().split(":");
                    Date now = new Date();
                    Calendar calendar = new GregorianCalendar();
                    calendar.add(Calendar.DATE, Integer.valueOf(valueTable[1]));
                    Date comparedDate = calendar.getTime();
                    return format.parse(value.toString()).after(now) && format.parse(value.toString()).before(comparedDate) ? fact.getCondition().getQuestion().getPositiveValue() : fact.getCondition().getQuestion().getNegativeValue();
                } else if (type == Date.class) {
                    return format.parse(fact.getCondition().getValue()).before(format.parse(value.toString())) ? fact.getCondition().getQuestion().getPositiveValue() : fact.getCondition().getQuestion().getNegativeValue();
                } else {
                    return Double.valueOf(fact.getCondition().getValue()) < Double.valueOf(value.toString()) ? fact.getCondition().getQuestion().getPositiveValue() : fact.getCondition().getQuestion().getNegativeValue();
                }
            case NOT:
                if (type == String.class) {
                    return !fact.getCondition().getValue().equals(value.toString()) ? fact.getCondition().getQuestion().getPositiveValue() : fact.getCondition().getQuestion().getNegativeValue();
                } else {
                    return Double.valueOf(fact.getCondition().getValue()) != Double.valueOf(value.toString()) ? fact.getCondition().getQuestion().getPositiveValue() : fact.getCondition().getQuestion().getNegativeValue();
                }
            default:
                break;
        }
        return "";
    }

    public static boolean validateRequest(GenerateQuestionsRequest request) {
        if (request.getTags().isEmpty()) {
            log.warn("Tags are empty");
            return false;
        }
        if (Strings.isNullOrEmpty(request.getCustomerId()) || request.getCustomerId().equals(Constants.UNDEFINED)) {
            log.warn("Customer ID is missing");
            return false;
        }
        if (Strings.isNullOrEmpty(request.getContractId()) || request.getContractId().equals(Constants.UNDEFINED)) {
            log.warn("Contract ID is missing");
            return false;
        }
        if (Strings.isNullOrEmpty(request.getAccountId()) || request.getAccountId().equals(Constants.UNDEFINED)) {
            log.warn("Account ID is missing");
            return false;
        }
        if (Strings.isNullOrEmpty(request.getProductId()) || request.getProductId().equals(Constants.UNDEFINED)) {
            log.warn("Product ID is missing");
            return false;
        }
        return true;
    }

    public static Double getByValue(String name, GetRoamingExceededResponse response) {
        log.info("response: " + response);
        String[] nameTable = name.split("#");
        String objectName = nameTable[0];
        String valueName = nameTable[1];
        switch (objectName) {
            case "voiceRoamingCost":
                if (valueName.equals(Constants.GROSS))
                    return response.getVoiceRoamingCost().getGross();
                else
                    return response.getVoiceRoamingCost().getNet();
            case "smsRoamingCost":
                if (valueName.equals(Constants.GROSS))
                    return response.getSmsRoamingCost().getGross();
                else
                    return response.getSmsRoamingCost().getNet();
            case "dataRoamingCost":
                if (valueName.equals(Constants.GROSS))
                    return response.getDataRoamingCost().getGross();
                else
                    return response.getDataRoamingCost().getNet();
            case "voiceInternationalCost":
                if (valueName.equals(Constants.GROSS))
                    return response.getVoiceInternationalCost().getGross();
                else
                    return response.getVoiceInternationalCost().getNet();
            case "smsInternationalCost":
                if (valueName.equals(Constants.GROSS))
                    return response.getSmsInternationalCost().getGross();
                else
                    return response.getSmsInternationalCost().getNet();
            default:
                return 0.0;
        }

    }

    public static int getByValue(String name, GetMobileContractCountResponse response) {
        switch (name) {
            case "mobileData":
                return response.getMobileData();
            case "prePaid":
                return response.getPrePaid();
            case "postPaid":
                return response.getPostPaid();
            case "mobileHomeData":
                return response.getMobileHomeData();
            case "mobileVoice":
                return response.getMobileVoice();
            default:
                return 0;
        }
    }
}
