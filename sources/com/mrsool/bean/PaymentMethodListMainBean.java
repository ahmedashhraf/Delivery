package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.io.Serializable;
import java.util.List;

public class PaymentMethodListMainBean implements Serializable {
    private Integer code;
    private String message;
    @C5862c("payment_options")
    private List<PaymentListBean> paymentOptions;

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public List<PaymentListBean> getPaymentOptions() {
        return this.paymentOptions;
    }
}
