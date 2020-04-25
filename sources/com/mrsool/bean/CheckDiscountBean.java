package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.util.List;

public class CheckDiscountBean {
    @C5862c("allow_amount")
    private Boolean allowAmount;
    @C5862c("allow_none")
    private Boolean allowNone;
    @C5862c("allow_percent")
    private Boolean allowPercent;
    @C5862c("amount_label")
    private String amountLabel;
    @C5862c("bookmarks")
    private BookmarkMainBean bookmarks;
    @C5862c("code")
    private Integer code;
    @C5862c("delivery_time_options")
    private List<DeliveryTimeBean> delivery_time_options;
    @C5862c("discount_options")
    private List<DiscountOptionBean> discountOptions;
    @C5862c("message")
    private String message;
    @C5862c("payment_options")
    private List<PaymentListBean> paymentOptions;
    @C5862c("percent_label")
    private String percentLabel;
    @C5862c("percent_amount")
    private String percent_amount;
    @C5862c("shop_discount")
    private boolean shopDiscount;

    public BookmarkMainBean getBookmarks() {
        return this.bookmarks;
    }

    public Integer getCode() {
        return this.code;
    }

    public List<DeliveryTimeBean> getDelivery_time_options() {
        return this.delivery_time_options;
    }

    public List<DiscountOptionBean> getDiscountOptions() {
        return this.discountOptions;
    }

    public String getMessage() {
        return this.message;
    }

    public List<PaymentListBean> getPaymentOptions() {
        return this.paymentOptions;
    }

    public boolean isShopDiscount() {
        return this.shopDiscount;
    }

    public void setDelivery_time_options(List<DeliveryTimeBean> list) {
        this.delivery_time_options = list;
    }
}
