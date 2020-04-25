package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;

public class CouponDetailMainBean {
    @C5860a
    @C5862c("code")
    private Integer code;
    @C5860a
    @C5862c("coupon")
    private CouponDetailBean coupon;
    @C5860a
    @C5862c("message")
    private String message;

    public Integer getCode() {
        return this.code;
    }

    public CouponDetailBean getCoupon() {
        return this.coupon;
    }

    public String getMessage() {
        return this.message;
    }
}
