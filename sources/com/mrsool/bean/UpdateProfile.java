package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;

public class UpdateProfile {
    @C5860a
    @C5862c("auth_token")
    private String auth_token;
    @C5860a
    @C5862c("bNotification")
    private Boolean bNotification;
    @C5860a
    @C5862c("bStatus")
    private Boolean bStatus;
    @C5860a
    @C5862c("code")
    private Integer code;
    @C5860a
    @C5862c("iUserId")
    private Integer iUserId;
    @C5860a
    @C5862c("message")
    private String message;
    @C5860a
    @C5862c("vLanguage")
    private String vLanguage;
    @C5860a
    @C5862c("vProfilePic")
    private String vProfilePic;

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
