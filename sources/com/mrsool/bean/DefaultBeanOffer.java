package com.mrsool.bean;

import com.google.gson.p193w.C5862c;

public class DefaultBeanOffer {
    @C5862c("code")
    private int code;
    @C5862c("is_first")
    private boolean is_first;
    @C5862c("is_taken")
    private boolean is_taken;
    @C5862c("message")
    private String message;
    @C5862c("messages")
    private String messages;
    @C5862c("offer_id")
    private String offer_id;
    @C5862c("old_price")
    private String old_price;
    @C5862c("order_cancel")
    private boolean order_cancel;
    @C5862c("payout_modal_labels")
    private PayoutModalLabelsBean payoutModalLabels;
    @C5862c("selected_for_payout")
    private boolean selectedForPayout;

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getMessages() {
        return this.messages;
    }

    public String getOffer_id() {
        return this.offer_id;
    }

    public String getOld_price() {
        return this.old_price;
    }

    public PayoutModalLabelsBean getPayoutModalLabels() {
        return this.payoutModalLabels;
    }

    public boolean isOrder_cancel() {
        return this.order_cancel;
    }

    public boolean isSelectedForPayout() {
        return this.selectedForPayout;
    }

    public boolean is_taken() {
        return this.is_taken;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setPayoutModalLabels(PayoutModalLabelsBean payoutModalLabelsBean) {
        this.payoutModalLabels = payoutModalLabelsBean;
    }

    public void setSelectedForPayout(boolean z) {
        this.selectedForPayout = z;
    }
}
