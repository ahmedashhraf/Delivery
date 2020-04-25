package com.mrsool.newBean;

import com.google.gson.p193w.C5862c;
import com.mrsool.bean.SearviceManualCommonBean;

public class SubmitRatingBean {
    @C5862c("code")
    private int code;
    @C5862c("message")
    private String message;
    @C5862c("messages")
    private String messages;
    @C5862c("service_manual")
    private SearviceManualCommonBean serviceManual;
    @C5862c("has_submited_service_review")
    private boolean serviceReviewSubmitted = true;
    @C5862c("shop")
    private ShopReviewBean shopReviewBean;
    @C5862c("service")
    private WriteRatingReviewBean writeRatingReviewBean;

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getMessages() {
        return this.messages;
    }

    public SearviceManualCommonBean getServiceManual() {
        return this.serviceManual;
    }

    public ShopReviewBean getShopReviewBean() {
        return this.shopReviewBean;
    }

    public WriteRatingReviewBean getWriteRatingReviewBean() {
        return this.writeRatingReviewBean;
    }

    public boolean isServiceReviewSubmitted() {
        return this.serviceReviewSubmitted;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setMessages(String str) {
        this.messages = str;
    }

    public void setWriteRatingReviewBean(WriteRatingReviewBean writeRatingReviewBean2) {
        this.writeRatingReviewBean = writeRatingReviewBean2;
    }
}
