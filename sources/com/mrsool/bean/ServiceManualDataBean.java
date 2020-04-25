package com.mrsool.bean;

public class ServiceManualDataBean {
    private String action;
    private String manualHash;
    private String manualIds;
    private String orderId;
    private String shopID;
    private String triggerType;

    public ServiceManualDataBean(String str, String str2) {
        this.manualHash = str2;
        this.action = str;
    }

    public String getAction() {
        return this.action;
    }

    public String getManualHash() {
        return this.manualHash;
    }

    public String getManualIds() {
        return this.manualIds;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getShopID() {
        return this.shopID;
    }

    public String getTriggerType() {
        return this.triggerType;
    }

    public ServiceManualDataBean(String str, String str2, String str3, String str4) {
        this.shopID = str;
        this.manualIds = str2;
        this.orderId = str3;
        this.action = str4;
    }
}
