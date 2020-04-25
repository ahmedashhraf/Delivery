package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;

public class LastAnnouncementRating {
    @C5860a
    @C5862c("announcement")
    private AnnouncementBean announcement;
    @C5860a
    @C5862c("code")
    private Integer code;
    @C5860a
    @C5862c("order")
    private LastUnRatedOrder order;

    public AnnouncementBean getAnnouncement() {
        return this.announcement;
    }

    public Integer getCode() {
        return this.code;
    }

    public LastUnRatedOrder getOrder() {
        return this.order;
    }
}
