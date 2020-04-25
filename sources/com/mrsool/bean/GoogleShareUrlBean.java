package com.mrsool.bean;

import com.google.gson.p193w.C5862c;

public class GoogleShareUrlBean {
    @C5862c("code")
    private Integer code;
    @C5862c("latitude")
    private Double latitude;
    @C5862c("longitude")
    private Double longitude;
    @C5862c("message")
    private String message;

    public Integer getCode() {
        return this.code;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public String getMessage() {
        return this.message;
    }
}
