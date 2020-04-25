package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.io.Serializable;

public class PaymentSaveMainBean implements Serializable {
    private Integer code;
    private String message;
    @C5862c("registration_details")
    private PaymentRegistrationDetailBean registrationDetails;

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public PaymentRegistrationDetailBean getRegistrationDetails() {
        return this.registrationDetails;
    }
}
