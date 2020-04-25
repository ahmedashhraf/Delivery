package com.mrsool.bean;

import com.google.gson.p193w.C5862c;

public class BookmarkPlaceBean {
    @C5862c("address")
    private String address;
    private String deliveryArea;
    @C5862c("id")

    /* renamed from: id */
    private String f27620id;
    private boolean isBookmark = true;
    @C5862c("latitude")
    private Double latitude;
    @C5862c("longitude")
    private Double longitude;
    @C5862c("name")
    private String name;
    @C5862c("sub_address")
    private String subAddress;

    public BookmarkPlaceBean() {
        String str = "";
        this.subAddress = str;
        this.deliveryArea = str;
    }

    public String getAddress() {
        return this.address;
    }

    public String getDeliveryArea() {
        return this.deliveryArea;
    }

    public String getId() {
        return this.f27620id;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public String getName() {
        return this.name;
    }

    public String getSubAddress() {
        return this.subAddress;
    }

    public boolean isBookmark() {
        return this.isBookmark;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setBookmark(boolean z) {
        this.isBookmark = z;
    }

    public void setDeliveryArea(String str) {
        this.deliveryArea = str;
    }

    public void setLatitude(Double d) {
        this.latitude = d;
    }

    public void setLongitude(Double d) {
        this.longitude = d;
    }

    public void setSubAddress(String str) {
        this.subAddress = str;
    }
}
