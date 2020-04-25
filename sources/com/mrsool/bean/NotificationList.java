package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.util.ArrayList;
import java.util.List;

public class NotificationList {
    @C5862c("code")
    private int code;
    @C5862c("message")
    private String message;
    @C5862c("notifications")
    private List<NotificationRow> notifications = new ArrayList();
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

    public List<NotificationRow> getNotifications() {
        return this.notifications;
    }
}
