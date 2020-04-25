package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;
import java.io.Serializable;

public class ShowPayBean implements Serializable {
    @C5860a
    @C5862c("data")
    private PaymentData PaymentData;
    @C5860a
    @C5862c("is_paid")
    private boolean isPaid;
    private String type;

    public PaymentData getPaymentData() {
        return this.PaymentData;
    }

    public boolean isPaid() {
        return this.isPaid;
    }
}
