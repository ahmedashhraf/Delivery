package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;
import java.io.Serializable;

public class PaymentListBean implements Serializable {
    private String code;

    /* renamed from: id */
    private Integer f27626id;
    @C5860a
    @C5862c("is_activated")
    private boolean isActivated;
    private String name;
    @C5860a
    @C5862c("payment_icon_url")
    private String paymentIconUrl;
    @C5860a
    @C5862c("show_in_new_order")
    private boolean showInNewOrder;
    @C5860a
    @C5862c("show_option")
    private boolean showOption;

    public PaymentListBean() {
    }

    public String getCode() {
        return this.code;
    }

    public Integer getId() {
        return this.f27626id;
    }

    public String getName() {
        return this.name;
    }

    public String getPaymentIconUrl() {
        return this.paymentIconUrl;
    }

    public boolean isActivated() {
        return this.isActivated;
    }

    public boolean isCash() {
        return getCode() != null && getCode().equalsIgnoreCase("cash");
    }

    public boolean isShowInNewOrder() {
        return this.showInNewOrder;
    }

    public boolean isShowOption() {
        return this.showOption;
    }

    public void setActivated(boolean z) {
        this.isActivated = z;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setId(Integer num) {
        this.f27626id = num;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPaymentIconUrl(String str) {
        this.paymentIconUrl = str;
    }

    public void setShowInNewOrder(boolean z) {
        this.showInNewOrder = z;
    }

    public void setShowOption(boolean z) {
        this.showOption = z;
    }

    public PaymentListBean(int i, String str) {
        this.name = str;
        this.f27626id = Integer.valueOf(i);
    }
}
