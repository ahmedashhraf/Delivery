package com.mrsool.bean;

import com.google.gson.p193w.C5862c;

public class PostOrder {
    @C5862c("code")
    private Integer code;
    private String iOrderId;
    @C5862c("message")
    private String message;
    @C5862c("show_fail_popup")
    private Boolean showFailPopup;

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public Boolean getShowFailPopup() {
        return this.showFailPopup;
    }

    public String getiOrderId() {
        return this.iOrderId;
    }
}
