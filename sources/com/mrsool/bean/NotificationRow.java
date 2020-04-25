package com.mrsool.bean;

import com.google.gson.p193w.C5862c;

public class NotificationRow {
    @C5862c("iNotificationId")
    private String iNotificationId;
    @C5862c("id")

    /* renamed from: id */
    private String f27623id;
    @C5862c("is_courier")
    private boolean isCourier;
    @C5862c("message")
    private String message;
    @C5862c("name")
    private Object name;
    @C5862c("pic")
    private Object pic;
    @C5862c("read")
    private Boolean read;
    @C5862c("time_at")
    private String timeAt;
    @C5862c("type")
    private String type;

    public String getId() {
        return this.f27623id;
    }

    public String getMessage() {
        return this.message;
    }

    public Object getPic() {
        return this.pic;
    }

    public Boolean getRead() {
        return this.read;
    }

    public String getTimeAt() {
        return this.timeAt;
    }

    public String getType() {
        return this.type;
    }

    public String getiNotificationId() {
        return this.iNotificationId;
    }

    public boolean isCourier() {
        return this.isCourier;
    }

    public void setRead(Boolean bool) {
        this.read = bool;
    }
}
