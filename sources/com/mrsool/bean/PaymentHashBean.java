package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;
import java.io.Serializable;

public class PaymentHashBean implements Serializable {
    public PaymentData data;
    @C5860a
    @C5862c("is_paid")
    private boolean isPaid;
    @C5860a
    @C5862c("payment_status")
    private String paymentStatus;
    private String type;

    public class PaymentData implements Serializable {
        @C5860a
        @C5862c("checkout_id")
        String checkoutId;
        String currency;
        String error;
        @C5860a
        @C5862c("payment_amount")
        double paymentAmount;

        public PaymentData() {
        }

        public String getCheckoutId() {
            return this.checkoutId;
        }

        public String getCurrency() {
            return this.currency;
        }

        public String getError() {
            return this.error;
        }

        public double getPaymentAmount() {
            return this.paymentAmount;
        }
    }

    class PaymentReceipt {
        PaymentReceipt() {
        }
    }

    public PaymentData getData() {
        return this.data;
    }

    public String getPaymentStatus() {
        return this.paymentStatus;
    }

    public String getType() {
        return this.type;
    }

    public boolean isPaid() {
        return this.isPaid;
    }
}
