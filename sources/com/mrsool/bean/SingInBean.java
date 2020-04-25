package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;

public class SingInBean {
    @C5860a
    @C5862c("auth_token")
    private String auth_token;
    @C5860a
    @C5862c("bNearbyOrder")
    private Boolean bNearbyOrder;
    @C5860a
    @C5862c("bNotification")
    private Boolean bNotification;
    @C5860a
    @C5862c("bRegistered")
    private Boolean bRegistered;
    @C5860a
    @C5862c("bStatus")
    private Boolean bStatus;
    @C5860a
    @C5862c("code")
    private Integer code;
    @C5860a
    @C5862c("iUser")
    private Integer iUser;
    @C5860a
    @C5862c("iUserId")
    private Integer iUserId;
    @C5860a
    @C5862c("is_courier")
    private Boolean isCourier;
    @C5860a
    @C5862c("message")
    private String message;
    @C5860a
    @C5862c("vLanguage")
    private String vLanguage;

    public String getAuth_token() {
        return this.auth_token;
    }

    public Boolean getBNotification() {
        return this.bNotification;
    }

    public Boolean getBStatus() {
        return this.bStatus;
    }

    public Integer getCode() {
        return this.code;
    }

    public Boolean getCourier() {
        return this.isCourier;
    }

    public Integer getIUserId() {
        Integer num = this.iUser;
        if (num != null) {
            return num;
        }
        return this.iUserId;
    }

    public String getMessage() {
        return this.message;
    }

    public String getVLanguage() {
        return this.vLanguage;
    }

    public Boolean getbRegistered() {
        return this.bRegistered;
    }
}
