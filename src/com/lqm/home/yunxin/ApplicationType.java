package com.lqm.home.yunxin;

/**
 * @author Firrela
 * @time 2016/3/7.
 */
public enum ApplicationType {

    JSON("application/json"), XML("application/xml"), TEXT("text/xml"), FORM("application/x-www-form-urlencoded");

    private String type;

    private ApplicationType(String type) {
        this.type = type;
    }

    public String val() {
        return type;
    }

}
