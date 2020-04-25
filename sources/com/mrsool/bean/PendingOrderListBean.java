package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.util.ArrayList;
import java.util.List;

public class PendingOrderListBean {
    @C5862c("code")
    private int code;
    @C5862c("message")
    private String message;
    @C5862c("notifications")
    private ArrayList<PendingOrderNotificationBean> notifications = null;
    @C5862c("unread")
    private int unread;
    @C5862c("user_stats")
    private UserStats userStats;

    public Integer getCode() {
        return Integer.valueOf(this.code);
    }

    public String getMessage() {
        return this.message;
    }

    public List<PendingOrderNotificationBean> getNotifications() {
        return this.notifications;
    }

    public UserStats getUserStats() {
        return this.userStats;
    }
}
