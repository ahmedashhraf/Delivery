package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.util.List;

public class MyCouponsMainBean {
    @C5862c("available_coupon")
    private List<CouponDetailBean> available_coupon;
    @C5862c("code")
    private int code;
    @C5862c("coupons")
    private List<CouponDetailBean> coupons;
    @C5862c("message")
    private String message;

    public List<CouponDetailBean> getAvailable_coupon() {
        return this.available_coupon;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
