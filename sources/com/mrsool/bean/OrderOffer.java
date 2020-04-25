package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;
import java.io.Serializable;
import java.util.List;

public class OrderOffer implements Serializable {
    @C5860a
    @C5862c("DeliverWithin")
    private String DeliverWithin;
    @C5860a
    @C5862c("bWarningMessage")
    private boolean bWarningMessage;
    @C5860a
    @C5862c("ccpopup")
    private boolean ccpopup;
    @C5860a
    @C5862c("courierId")
    private String courierId;
    @C5860a
    @C5862c("courierName")
    private String courierName;
    @C5860a
    @C5862c("courierPic")
    private String courierPic;
    @C5860a
    @C5862c("courierVerified")
    private boolean courierVerified;
    @C5860a
    @C5862c("dDiscountCost")
    private double dDiscountCost;
    @C5860a
    @C5862c("dDiscountCost_txt")
    private String dDiscountCost_txt;
    @C5860a
    @C5862c("dbDeliveryCost")
    private double dbDeliveryCost;
    @C5860a
    @C5862c("dbDeliveryCost_no_vat")
    private double dbDeliveryCostNoVat;
    @C5860a
    @C5862c("dbDeliveryCost_txt")
    private String dbDeliveryCost_txt;
    @C5860a
    @C5862c("dbDistanceFromMe")
    private double dbDistanceFromMe;
    @C5862c("discount_percentage")
    private float discountPercentage;
    @C5860a
    @C5862c("fCourierRatings")
    private float fCourierRatings;
    @C5860a
    @C5862c("offer_id")
    private String offer_id;
    @C5862c("offer_received_at")
    private long offer_received_at;
    @C5860a
    @C5862c("offer_text")
    private String offer_text;
    @C5860a
    @C5862c("payment_options")
    private List<PaymentListBean> paymentOptions;
    @C5860a
    @C5862c("rejectCourier")
    private String rejectCourier;
    @C5860a
    @C5862c("reject_courier")
    private String reject_courier;
    @C5860a
    @C5862c("superseded")
    private boolean superseded;
    @C5860a
    @C5862c("user_delivery_count")
    private Integer user_delivery_count;
    @C5860a
    @C5862c("user_feedback_count")
    private Integer user_feedback_count;
    @C5860a
    @C5862c("vStatus")
    private String vStatus;

    public String getCourierId() {
        return this.courierId;
    }

    public String getCourierName() {
        return this.courierName;
    }

    public String getCourierPic() {
        return this.courierPic;
    }

    public double getDbDeliveryCost() {
        return this.dbDeliveryCost;
    }

    public double getDbDeliveryCostNoVat() {
        return this.dbDeliveryCostNoVat;
    }

    public String getDbDeliveryCost_txt() {
        return this.dbDeliveryCost_txt;
    }

    public double getDbDistanceFromMe() {
        return this.dbDistanceFromMe;
    }

    public String getDeliverWithin() {
        return this.DeliverWithin;
    }

    public float getDiscountPercentage() {
        return this.discountPercentage;
    }

    public String getOffer_id() {
        return this.offer_id;
    }

    public long getOffer_received_at() {
        return this.offer_received_at;
    }

    public String getOffer_text() {
        return this.offer_text;
    }

    public List<PaymentListBean> getPaymentOptions() {
        return this.paymentOptions;
    }

    public Integer getUser_delivery_count() {
        return this.user_delivery_count;
    }

    public double getdDiscountCost() {
        return this.dDiscountCost;
    }

    public String getdDiscountCost_txt() {
        return this.dDiscountCost_txt;
    }

    public float getfCourierRatings() {
        return this.fCourierRatings;
    }

    public String getvStatus() {
        return this.vStatus;
    }

    public boolean hasDiscount() {
        return this.dbDeliveryCost != this.dDiscountCost;
    }

    public boolean isCourierVerified() {
        return this.courierVerified;
    }

    public boolean isbWarningMessage() {
        return this.bWarningMessage;
    }
}
