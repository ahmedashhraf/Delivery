package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;

public class PendingOrderNotificationBean {
    @C5860a
    @C5862c("bundled_order")
    private Boolean bundledOrder;
    @C5860a
    @C5862c("created_at")
    private String createdAt;
    @C5860a
    @C5862c("dist_pickup_dropoff")
    private Double distPickupDropoff;
    @C5860a
    @C5862c("dist_user_pickup")
    private Double distUserPickup;
    @C5860a
    @C5862c("id")

    /* renamed from: id */
    private String f27627id;
    @C5860a
    @C5862c("message")
    private String message;
    @C5860a
    @C5862c("name")
    private String name;
    @C5860a
    @C5862c("order_id")
    private String orderId;
    @C5860a
    @C5862c("pic")
    private String pic;
    @C5860a
    @C5862c("read")
    private Boolean read;
    @C5860a
    @C5862c("time_at")
    private String timeAt;
    @C5860a
    @C5862c("type")
    private String type;

    public Boolean getBundledOrder() {
        return this.bundledOrder;
    }

    public Double getDistPickupDropoff() {
        return this.distPickupDropoff;
    }

    public Double getDistUserPickup() {
        return this.distUserPickup;
    }

    public String getMessage() {
        return this.message;
    }

    public String getName() {
        return this.name;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getPic() {
        return this.pic;
    }

    public String getTimeAt() {
        return this.timeAt;
    }

    public String getType() {
        return this.type;
    }
}
