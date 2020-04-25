package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;

public class PaymentStatusBean {
    @C5860a
    @C5862c("code")
    private Integer code;
    @C5860a
    @C5862c("is_paid")
    private boolean isPaid;
    @C5860a
    @C5862c("message")
    private String message;
    @C5860a
    @C5862c("payment_hash")
    private ShowPayBean paymentHash;

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public ShowPayBean getPaymentHash() {
        return this.paymentHash;
    }
}
