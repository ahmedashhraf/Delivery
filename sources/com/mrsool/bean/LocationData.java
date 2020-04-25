package com.mrsool.bean;

public class LocationData {
    private String current_user_id;
    private String latitude;
    private String longitude;
    private String sent_at;
    private String token;

    public LocationData(String str, String str2, String str3, String str4, String str5) {
        this.token = str;
        this.latitude = str2;
        this.longitude = str3;
        this.sent_at = str4;
        this.current_user_id = str5;
    }

    public String getToken() {
        return this.token;
    }

    public void setLatitude(String str) {
        this.latitude = str;
    }

    public void setLongitude(String str) {
        this.longitude = str;
    }

    public void setSent_at(String str) {
        this.sent_at = str;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
