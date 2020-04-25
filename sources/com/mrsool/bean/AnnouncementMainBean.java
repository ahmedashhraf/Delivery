package com.mrsool.bean;

import com.google.gson.p193w.C5862c;

public class AnnouncementMainBean {
    @C5862c("announcement")
    private AnnouncementBean announcement;
    @C5862c("code")
    private int code;
    @C5862c("message")
    private String message;

    public AnnouncementBean getAnnouncement() {
        return this.announcement;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
