package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.io.Serializable;

public class OrderPaymentBill implements Serializable {
    @C5862c("change_pay_app_alert")
    private String changePayAppAlert;
    @C5862c("change_pay_option")
    private boolean changePayOption;
    @C5862c("check_for_payment_status")
    private boolean checkForPaymentStatus;
    @C5862c("is_paid")
    private boolean isPaid;
    @C5862c("payment_option_name")
    private String paymentOptionName;
    @C5862c("payment_status")
    private String paymentStatus;
    @C5862c("payment_type_code")
    private String paymentTypeCode;
    @C5862c("show_pay")
    private boolean showPay;

    public String getChangePayAppAlert() {
        return this.changePayAppAlert;
    }

    public String getPaymentOptionName() {
        return this.paymentOptionName;
    }

    public String getPaymentStatus() {
        return this.paymentStatus;
    }

    public String getPaymentTypeCode() {
        return this.paymentTypeCode;
    }

    public boolean isChangePayOption() {
        return this.changePayOption;
    }

    public boolean isCheckForPaymentStatus() {
        return this.checkForPaymentStatus;
    }

    public boolean isPaid() {
        return this.isPaid;
    }

    public boolean isShowPay() {
        return this.showPay;
    }

    public void setChangePayAppAlert(String str) {
        this.changePayAppAlert = str;
    }

    public void setChangePayOption(boolean z) {
        this.changePayOption = z;
    }

    public void setCheckForPaymentStatus(boolean z) {
        this.checkForPaymentStatus = z;
    }

    public void setPaid(boolean z) {
        this.isPaid = z;
    }

    public void setPaymentOptionName(String str) {
        this.paymentOptionName = str;
    }

    public void setPaymentStatus(String str) {
        this.paymentStatus = str;
    }

    public void setPaymentTypeCode(String str) {
        this.paymentTypeCode = str;
    }

    public void setShowPay(boolean z) {
        this.showPay = z;
    }
}
