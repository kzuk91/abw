package opl.com.abw.enums;


public enum ConditionEnum {
        EQUALS("=="),
        GREATER(">"),
        LESSER("<"),
        NOT("!=");

    private final String param;

    ConditionEnum(String param) {
        this.param = param;
    }

    public String getParamValue() {
        return param;
    }
}