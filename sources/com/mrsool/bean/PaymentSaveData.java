package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.io.Serializable;

public class PaymentSaveData implements Serializable {
    @C5862c("checkout_id")
    private String checkoutId;
    private String error;

    public String getCheckoutId() {
        return this.checkoutId;
    }

    public String getError() {
        return this.error;
    }
}
