package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;

public class CourierLastLocationBean {
    @C5860a
    @C5862c("latitude")
    private Double latitude;
    @C5860a
    @C5862c("longitude")
    private Double longitude;

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public void setLatitude(Double d) {
        this.latitude = d;
    }

    public void setLongitude(Double d) {
        this.longitude = d;
    }
}
