package com.mrsool.bean;

import com.google.gson.p193w.C5862c;

public class VerifyOTP {
    @C5862c("auth_token")
    private String auth_token;
    @C5862c("bNotification")
    private Boolean bNotification;
    @C5862c("bProfileComplete")
    private Boolean bProfileComplete;
    @C5862c("bStatus")
    private Boolean bStatus;
    @C5862c("code")
    private int code;
    @C5862c("is_courier")
    private Boolean is_courier;
    @C5862c("message")
    private String message;
    @C5862c("vLanguage")
    private Object vLanguage;

    public String getAuth_token() {
        return this.auth_token;
    }

    public Boolean getBNotification() {
        return this.bNotification;
    }

    public Boolean getBProfileComplete() {
        return this.bProfileComplete;
    }

    public int getCode() {
        return this.code;
    }

    public Boolean getIs_courier() {
        return this.is_courier;
    }

    public String getMessage() {
        return this.message;
    }
}
