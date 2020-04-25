package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.io.Serializable;

public class PaymentRegistrationDetailBean implements Serializable {
    @C5862c("data")
    private PaymentSaveData paymentSaveData;
    @C5862c("registration_status")
    private String registrationStatus;
    private String type;

    public PaymentSaveData getPaymentSaveData() {
        return this.paymentSaveData;
    }

    public String getRegistrationStatus() {
        return this.registrationStatus;
    }

    public String getType() {
        return this.type;
    }
}
