package com.mrsool.bean;

public class LastCourierLocationHistoryBean {
    private String courierId;
    private Double latitude;
    private Double longitude;
    private Long timeStamp;

    public LastCourierLocationHistoryBean(Double d, Double d2, String str, Long l) {
        this.latitude = d;
        this.longitude = d2;
        this.courierId = str;
        this.timeStamp = l;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public Long getTimeStamp() {
        return this.timeStamp;
    }
}
