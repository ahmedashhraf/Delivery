package com.mrsool.shopmenu.bean;

import com.google.gson.p193w.C5862c;

public class GetBusinessIdBean {
    @C5862c("data")
    private BusinessIdBean businessIdBean;
    @C5862c("code")
    private int code;
    @C5862c("message")
    private String error;

    public BusinessIdBean getBusinessIdBean() {
        return this.businessIdBean;
    }

    public int getCode() {
        return this.code;
    }

    public String getError() {
        return this.error;
    }
}
