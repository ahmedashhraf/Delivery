package com.mrsool.bean;

import com.google.gson.p193w.C5862c;

public class shopDetailPendingOrder {
    @C5862c("bundled_order")
    private Boolean bundledOrder;
    @C5862c("distance_courier_shop")
    private Double distanceCourierShop;
    @C5862c("distance_shop_buyer")
    private Double distanceShopBuyer;
    @C5862c("distance_courier_buyer")
    private Double distance_courier_buyer;
    @C5862c("dtExpDate")
    private String dtExpDate;
    @C5862c("dtOrderDate")
    private String dtOrderDate;
    @C5862c("iBuyerId")
    private String iBuyerId;
    @C5862c("iOrderId")
    private String iOrderId;
    @C5862c("offer_submitted")
    private Boolean offerSubmitted;
    @C5862c("order_description")
    private String order_description;
    @C5862c("show_dropoff_pin")
    private Boolean showDropoffPin;
    @C5862c("show_pickup_pin")
    private Boolean showPickupPin;
    @C5862c("show_you_pin")
    private Boolean showYouPin;
    @C5862c("total_distance")
    private Double totalDistance;
    @C5862c("vArea")
    private String vArea;
    @C5862c("vExpireIn")
    private String vExpireIn;
    @C5862c("vFullName")
    private String vFullName;
    @C5862c("vProfilePic")
    private String vProfilePic;
    @C5862c("whosOrder")
    private int whosOrder;

    public Boolean getBundledOrder() {
        return this.bundledOrder;
    }

    public Double getDistanceCourierShop() {
        return this.distanceCourierShop;
    }

    public Double getDistanceShopBuyer() {
        return this.distanceShopBuyer;
    }

    public Double getDistance_courier_buyer() {
        return this.distance_courier_buyer;
    }

    public String getIOrderId() {
        return this.iOrderId;
    }

    public Boolean getOfferSubmitted() {
        return this.offerSubmitted;
    }

    public String getOrder_description() {
        return this.order_description;
    }

    public Boolean getShowDropoffPin() {
        return this.showDropoffPin;
    }

    public Boolean getShowPickupPin() {
        return this.showPickupPin;
    }

    public Boolean getShowYouPin() {
        return this.showYouPin;
    }

    public Double getTotalDistance() {
        return this.totalDistance;
    }

    public String getVExpireIn() {
        return this.vExpireIn;
    }

    public String getVFullName() {
        return this.vFullName;
    }

    public String getVProfilePic() {
        return this.vProfilePic;
    }

    public int getWhosOrder() {
        return this.whosOrder;
    }
}
