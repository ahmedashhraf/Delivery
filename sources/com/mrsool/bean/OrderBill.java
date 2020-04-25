package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;
import java.io.Serializable;

public class OrderBill implements Serializable {
    @C5860a
    @C5862c("dbDeliveryCost")
    private double dbDeliveryCost;
    @C5860a
    @C5862c("dbOrderCost")
    private double dbOrderCost;
    @C5860a
    @C5862c("dbTotalCost")
    private double dbTotalCost;
    @C5860a
    @C5862c("image")
    private String image;
    @C5860a
    @C5862c("tax_number")
    private String taxNumber;
    @C5860a
    @C5862c("vStatus")
    private String vStatus;

    public double getDbDeliveryCost() {
        return this.dbDeliveryCost;
    }

    public double getDbOrderCost() {
        return this.dbOrderCost;
    }

    public double getDbTotalCost() {
        return this.dbTotalCost;
    }

    public String getImage() {
        return this.image;
    }

    public String getTaxNumber() {
        return this.taxNumber;
    }

    public String getvStatus() {
        return this.vStatus;
    }
}
