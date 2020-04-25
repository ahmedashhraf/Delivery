package com.mrsool.bean;

import com.google.gson.p193w.C5862c;

public class NotificationBean {
    @C5862c("bAnnouncement")
    private boolean bAnnouncement;
    @C5862c("bNearbyOrder")
    private boolean bNearbyOrder;
    @C5862c("bNotification")
    private boolean bNotification;
    @C5862c("code")
    private Integer code;
    @C5862c("message")
    private String message;

    public Integer getCode() {
        return this.code;
    }

    public boolean isbAnnouncement() {
        return this.bAnnouncement;
    }

    public boolean isbNearbyOrder() {
        return this.bNearbyOrder;
    }

    public boolean isbNotification() {
        return this.bNotification;
    }
}
