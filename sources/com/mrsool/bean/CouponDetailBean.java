package com.mrsool.bean;

import com.google.gson.p193w.C5862c;

public class CouponDetailBean {
    @C5862c("coupon_currency")
    private String couponCurrency;
    @C5862c("coupon_name")
    private String coupon_name;
    @C5862c("coupon_number")
    private String coupon_number;
    @C5862c("coupon_type")
    private Integer coupon_type;
    @C5862c("coupon_value")
    private String coupon_value;
    @C5862c("description")
    private String description;
    @C5862c("expiration_date")
    private long expiration_date;
    private boolean isNotUsed;

    public String getCouponCurrency() {
        return this.couponCurrency;
    }

    public String getCoupon_name() {
        return this.coupon_name;
    }

    public String getCoupon_number() {
        return this.coupon_number;
    }

    public Integer getCoupon_type() {
        Integer num = this.coupon_type;
        return num == null ? Integer.valueOf(-1) : num;
    }

    public String getCoupon_value() {
        return this.coupon_value;
    }

    public long getExpiration_date() {
        return this.expiration_date;
    }

    public void setNotUsed(boolean z) {
        this.isNotUsed = z;
    }
}
