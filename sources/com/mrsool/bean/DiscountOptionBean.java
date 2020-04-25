package com.mrsool.bean;

import com.google.gson.p193w.C5862c;

public class DiscountOptionBean {
    @C5862c("amount")
    private String amount;
    @C5862c("currency")
    private String currency;
    @C5862c("default")
    private boolean defualtValue;
    @C5862c("discount_type")
    private String discountType;
    @C5862c("main_label")
    private String label;

    public String getAmount() {
        return this.amount;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getDiscountType() {
        return this.discountType;
    }

    public String getLabel() {
        return this.label;
    }

    public boolean isDefualtValue() {
        return this.defualtValue;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setCurrency(String str) {
        this.currency = str;
    }

    public void setDefualtValue(boolean z) {
        this.defualtValue = z;
    }

    public void setDiscountType(String str) {
        this.discountType = str;
    }

    public void setLabel(String str) {
        this.label = str;
    }
}
