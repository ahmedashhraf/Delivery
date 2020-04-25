package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.io.Serializable;

public class OrderDetailBill implements Serializable {
    @C5862c("bill_warning_label")
    private String billWarningLabel;
    @C5862c("dbDeliveryCost")
    private String dbDeliveryCost;
    @C5862c("dbOrderCost")
    private String dbOrderCost;
    @C5862c("dbTotalCost")
    private String dbTotalCost;
    @C5862c("discount_amount")
    private String discountAmount;
    @C5862c("image")
    private String image;
    @C5862c("tax_number")
    private String taxNumber;
    @C5862c("vStatus")
    private String vStatus;
    @C5862c("vat_amount")
    private String vatAmount;

    public String getBillWarningLabel() {
        return this.billWarningLabel;
    }

    public String getDbDeliveryCost() {
        return this.dbDeliveryCost;
    }

    public String getDbOrderCost() {
        return this.dbOrderCost;
    }

    public String getDbTotalCost() {
        return this.dbTotalCost;
    }

    public String getDiscountAmount() {
        return this.discountAmount;
    }

    public String getImage() {
        return this.image;
    }

    public String getTaxNumber() {
        return this.taxNumber;
    }

    public String getVatAmount() {
        return this.vatAmount;
    }

    public String getvStatus() {
        return this.vStatus;
    }

    public void setBillWarningLabel(String str) {
        this.billWarningLabel = str;
    }

    public void setDbDeliveryCost(String str) {
        this.dbDeliveryCost = str;
    }

    public void setDbOrderCost(String str) {
        this.dbOrderCost = str;
    }

    public void setDbTotalCost(String str) {
        this.dbTotalCost = str;
    }

    public void setDiscountAmount(String str) {
        this.discountAmount = str;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setTaxNumber(String str) {
        this.taxNumber = str;
    }

    public void setVatAmount(String str) {
        this.vatAmount = str;
    }

    public void setvStatus(String str) {
        this.vStatus = str;
    }
}
