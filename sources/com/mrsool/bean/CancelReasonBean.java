package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;

public class CancelReasonBean {
    @C5860a
    @C5862c("code")
    private String code;
    @C5860a
    @C5862c("reason")
    private String reason;

    public CancelReasonBean(String str, String str2) {
        this.code = str;
        this.reason = str2;
    }

    public String getCode() {
        return this.code;
    }

    public String getReason() {
        return this.reason;
    }
}
