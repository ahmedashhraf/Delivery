package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;

public class MyOrdersActive {
    @C5860a
    @C5862c("autostart_tracking")
    private boolean autostart_tracking;
    @C5860a
    @C5862c("autostop_tracking")
    private boolean autostop_tracking;
    @C5860a
    @C5862c("coupon_exists")
    private boolean coupon_exists;
    @C5860a
    @C5862c("distance")
    private float distance;
    @C5860a
    @C5862c("dtOrderDateTime")
    private String dtOrderDateTime;
    @C5860a
    @C5862c("iOrderId")
    private String iOrderId;
    @C5860a
    @C5862c("iToUserId")
    private String iToUserId;
    @C5860a
    @C5862c("lastMessageTimestamp")
    private String lastMessageTimestamp;
    @C5860a
    @C5862c("orderStatus")
    private String orderStatus;
    @C5860a
    @C5862c("orderTimeStatus")
    private String orderTimeStatus;
    @C5860a
    @C5862c("otherOrderStatus")
    private String otherOrderStatus;
    @C5860a
    @C5862c("status_color")
    private String status_color;
    @C5860a
    @C5862c("track_order")
    private boolean track_order;
    @C5860a
    @C5862c("txOrderDescription")
    private String txOrderDescription;
    @C5860a
    @C5862c("unread")
    private Integer unread;
    @C5860a
    @C5862c("vBuyerArea")
    private String vBuyerArea;
    @C5860a
    @C5862c("vBuyerFullName")
    private String vBuyerFullName;
    @C5860a
    @C5862c("vBuyerProfilePic")
    private String vBuyerProfilePic;
    @C5860a
    @C5862c("vShopName")
    private String vShopName;
    @C5860a
    @C5862c("vShopPic")
    private String vShopPic;
    @C5860a
    @C5862c("vStatus")
    private String vStatus;

    public float getDistance() {
        return this.distance;
    }

    public String getDtOrderDateTime() {
        return this.dtOrderDateTime;
    }

    public String getIOrderId() {
        return this.iOrderId;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public String getOrderTimeStatus() {
        return this.orderTimeStatus;
    }

    public String getOtherOrderStatus() {
        return this.otherOrderStatus;
    }

    public String getStatus_color() {
        return this.status_color;
    }

    public String getTxOrderDescription() {
        return this.txOrderDescription;
    }

    public Integer getUnread() {
        return this.unread;
    }

    public String getVBuyerFullName() {
        return this.vBuyerFullName;
    }

    public String getVBuyerProfilePic() {
        return this.vBuyerProfilePic;
    }

    public String getVShopName() {
        return this.vShopName;
    }

    public String getVShopPic() {
        return this.vShopPic;
    }

    public boolean isAutostart_tracking() {
        return this.autostart_tracking;
    }

    public boolean isAutostop_tracking() {
        return this.autostop_tracking;
    }

    public boolean isTrack_order() {
        return this.track_order;
    }

    public void setAutostop_tracking(boolean z) {
        this.autostop_tracking = z;
    }

    public void setTrack_order(boolean z) {
        this.track_order = z;
    }

    public void setUnread(Integer num) {
        this.unread = num;
    }
}
