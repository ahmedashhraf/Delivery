package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;
import java.util.List;

public class ChangeCourierBean {
    @C5860a
    @C5862c("courier_id")
    private Integer courier_id;
    @C5860a
    @C5862c("courier_name")
    private String courier_name;
    @C5860a
    @C5862c("courier_order_count")
    private Integer courier_order_count;
    @C5860a
    @C5862c("courier_pic")
    private String courier_pic;
    @C5860a
    @C5862c("courier_rating")
    private Double courier_rating;
    @C5862c("dDiscountCost")
    private double discountCost;
    @C5860a
    @C5862c("distance")
    private Double distance;
    @C5860a
    @C5862c("offer_type_label")
    private String offerTypeLabel;
    @C5860a
    @C5862c("offer_type_label_color")
    private String offerTypeLabelColor;
    @C5862c("offer_cost")
    private double offer_cost;
    @C5860a
    @C5862c("offer_id")
    private String offer_id;
    @C5860a
    @C5862c("order_id")
    private Integer order_id;
    @C5860a
    @C5862c("payment_options")
    private List<PaymentListBean> paymentOptions;
    @C5860a
    @C5862c("time_to_arrive")
    private String time_to_arrive;
    @C5860a
    @C5862c("verified")
    private Boolean verified;

    public Integer getCourier_id() {
        return this.courier_id;
    }

    public String getCourier_name() {
        return this.courier_name;
    }

    public Integer getCourier_order_count() {
        return this.courier_order_count;
    }

    public String getCourier_pic() {
        return this.courier_pic;
    }

    public Double getCourier_rating() {
        return this.courier_rating;
    }

    public double getDiscountCost() {
        return this.discountCost;
    }

    public Double getDistance() {
        return this.distance;
    }

    public String getOfferTypeLabel() {
        return this.offerTypeLabel;
    }

    public String getOfferTypeLabelColor() {
        return this.offerTypeLabelColor;
    }

    public double getOffer_cost() {
        return this.offer_cost;
    }

    public String getOffer_id() {
        return this.offer_id;
    }

    public Integer getOrder_id() {
        return this.order_id;
    }

    public List<PaymentListBean> getPaymentOptions() {
        return this.paymentOptions;
    }

    public String getTime_to_arrive() {
        return this.time_to_arrive;
    }

    public Boolean getVerified() {
        return this.verified;
    }

    public void setCourier_id(Integer num) {
        this.courier_id = num;
    }

    public void setOfferTypeLabel(String str) {
        this.offerTypeLabel = str;
    }

    public void setOfferTypeLabelColor(String str) {
        this.offerTypeLabelColor = str;
    }

    public void setOffer_id(String str) {
        this.offer_id = str;
    }

    public void setOrder_id(Integer num) {
        this.order_id = num;
    }
}
