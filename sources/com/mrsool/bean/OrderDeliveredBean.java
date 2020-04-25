package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;

public class OrderDeliveredBean {
    @C5860a
    @C5862c("code")
    private Integer code;
    private Integer iTotalOrderPlaced;
    @C5860a
    @C5862c("message")
    private String message;
    @C5860a
    @C5862c("messages")
    private String messages;
    @C5860a
    @C5862c("service_manual")
    private SearviceManualCommonBean serviceManual;

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getMessages() {
        return this.messages;
    }

    public Integer getiTotalOrderPlaced() {
        return this.iTotalOrderPlaced;
    }

    public void setiTotalOrderPlaced(Integer num) {
        this.iTotalOrderPlaced = num;
    }
}
