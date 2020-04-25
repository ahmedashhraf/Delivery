package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.io.Serializable;

public class TimerDetails implements Serializable {
    @C5862c("order_expire_min")
    private int orderExpireMin;
    @C5862c("order_expired_at")
    private String orderExpiredAt;
    @C5862c("rejection_reason")
    private String rejectionReason;

    public int getOrderExpireMin() {
        return this.orderExpireMin;
    }

    public long getOrderExpiredAt() {
        return Long.parseLong(this.orderExpiredAt);
    }
}
