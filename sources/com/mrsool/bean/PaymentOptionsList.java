package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;
import java.util.List;

public class PaymentOptionsList {
    @C5860a
    @C5862c("code")
    private Integer code;
    @C5860a
    @C5862c("message")
    private String message;
    @C5860a
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

    public void setCode(Integer num) {
        this.code = num;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setPaymentOptions(List<PaymentListBean> list) {
        this.paymentOptions = list;
    }
}
