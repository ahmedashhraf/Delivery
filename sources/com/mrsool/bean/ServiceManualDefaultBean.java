package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;

public class ServiceManualDefaultBean {
    @C5860a
    @C5862c("code")
    private Integer code;
    @C5860a
    @C5862c("message")
    private String message;
    @C5860a
    @C5862c("messages")
    private String messages;
    @C5860a
    @C5862c("service_manual")
    private SearviceManualCommonBean serviceManual;

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getMessages() {
        return this.messages;
    }
}
