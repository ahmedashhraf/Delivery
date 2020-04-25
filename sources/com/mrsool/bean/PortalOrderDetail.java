package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.io.Serializable;

public class PortalOrderDetail implements Serializable {
    @C5862c("business_order_id")
    private String businessOrderId;
    @C5862c("created_at")
    private String createdAt;
    @C5862c("current_system_time")
    private long currentTime;
    @C5862c("id")

    /* renamed from: id */
    private String f27628id;
    @C5862c("is_deleted")
    private boolean isDeleted;
    @C5862c("order_id")
    private String orderId;
    @C5862c("reference_number")
    private String referenceNumber;
    @C5862c("status")
    private String status;
    @C5862c("details")
    private TimerDetails timerDetails = new TimerDetails();
    @C5862c("updated_at")
    private String updatedAt;

    public String getBusinessOrderId() {
        return this.businessOrderId;
    }

    public long getCurrentTime() {
        return this.currentTime;
    }

    public String getStatus() {
        return this.status;
    }

    public TimerDetails getTimerDetails() {
        return this.timerDetails;
    }

    public void setDetails(TimerDetails timerDetails2) {
        this.timerDetails = timerDetails2;
    }

    public void setId(String str) {
        this.f27628id = str;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
