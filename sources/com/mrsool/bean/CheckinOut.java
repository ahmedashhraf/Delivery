package com.mrsool.bean;

import com.google.gson.p193w.C5862c;

public class CheckinOut {
    @C5862c("checked_in")
    private Boolean checkedIn;
    @C5862c("checked_in_count")
    private int checkedInCount;
    @C5862c("code")
    private int code;
    @C5862c("message")
    private String message;
    @C5862c("notify_nearby_order")
    private String notifyNearbyOrder;

    public Boolean getCheckedIn() {
        return this.checkedIn;
    }

    public int getCheckedInCount() {
        return this.checkedInCount;
    }

    public int getCode() {
        return this.code;
    }
}
