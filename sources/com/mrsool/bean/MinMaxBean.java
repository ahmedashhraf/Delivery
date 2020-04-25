package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import com.mrsool.newBean.CourierWalkThroughBean;

public class MinMaxBean {
    @C5862c("alreadyTakenMessage")
    private String alreadyTakenMessage;
    @C5862c("already_taken")
    private Integer already_taken;
    @C5862c("code")
    private Integer code;
    @C5862c("comm_ratio")
    private String commRatio;
    @C5862c("commission")
    private double commission = 0.0d;
    @C5862c("courier_walkthrough")
    private CourierWalkThroughBean courierWalkThroughBean;
    @C5862c("message")
    private String message;
    @C5862c("order_status")
    private String order_status;
    @C5862c("service_fees")
    private double serviceFees = 0.0d;
    @C5862c("show_you_get")
    private Boolean showYouGet;
    @C5862c("vat")
    private double vat = 0.0d;

    public String getAlreadyTakenMessage() {
        return this.alreadyTakenMessage;
    }

    public Integer getAlready_taken() {
        return this.already_taken;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getCommRatio() {
        return this.commRatio;
    }

    public double getCommission() {
        return this.commission;
    }

    public CourierWalkThroughBean getCourierWalkThroughBean() {
        return this.courierWalkThroughBean;
    }

    public String getMessage() {
        return this.message;
    }

    public String getOrder_status() {
        return this.order_status;
    }

    public double getServiceFees() {
        return this.serviceFees;
    }

    public Boolean getShowYouGet() {
        return this.showYouGet;
    }

    public double getVat() {
        return this.vat;
    }
}
