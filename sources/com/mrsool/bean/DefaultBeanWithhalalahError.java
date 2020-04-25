package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;

public class DefaultBeanWithhalalahError {
    @C5860a
    @C5862c("code")
    private Integer code;
    @C5860a
    @C5862c("halalah_error")
    private boolean halalahError;
    @C5860a
    @C5862c("message")
    private String message;

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public boolean isHalalahError() {
        return this.halalahError;
    }

    public void setCode(Integer num) {
        this.code = num;
    }

    public void setHalalahError(boolean z) {
        this.halalahError = z;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
