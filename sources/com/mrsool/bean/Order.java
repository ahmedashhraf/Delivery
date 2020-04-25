package com.mrsool.bean;

import android.text.TextUtils;
import com.google.gson.p193w.C5862c;
import com.mrsool.newBean.BundleOrderBean;
import java.io.Serializable;
import java.util.ArrayList;

public class Order implements Serializable {
    @C5862c("bundled_orders")
    private ArrayList<BundleOrderBean> bundledOrders;
    @C5862c("buyerPhone")
    private String buyerPhone;
    @C5862c("buyerVerified")
    private boolean buyerVerified;
    @C5862c("courierPhone")
    private String courierPhone;
    @C5862c("courierVerified")
    private boolean courierVerified;
    @C5862c("currency")
    private String currency;
    @C5862c("discount_type")
    private String discountType;
    @C5862c("distance_courier_shop")
    private String distance_courier_shop;
    @C5862c("distance_shop_buyer")
    private String distance_shop_buyer;
    @C5862c("expiry_time")
    private String expiry_time;
    @C5862c("fBuyerRatings")
    private String fBuyerRatings;
    @C5862c("fCourierRatings")
    private String fCourierRatings;
    private boolean hasBuyerRequestedCancel;
    @C5862c("iBuyerId")
    private String iBuyerId;
    @C5862c("iCourierId")
    private String iCourierId;
    @C5862c("iOrderId")
    private String iOrderId;
    @C5862c("bundled_order")
    private boolean isBundledOrder = false;
    @C5862c("isPackagePickedUp")
    private boolean isPackagePickedUp;
    @C5862c("latitude")
    private double latitude;
    @C5862c("longitude")
    private double longitude;
    @C5862c("orderStatus")
    private String orderStatus;
    @C5862c("order_type")
    private String orderType;
    @C5862c("platitude")
    private double platitude;
    @C5862c("plongitude")
    private double plongitude;
    @C5862c("servicePickupAvailable")
    private boolean servicePickupAvailable;
    @C5862c("txDescription")
    private String txDescription;
    @C5862c("user_rated")
    private boolean user_rated;
    @C5862c("vAddress")
    private String vAddress;
    @C5862c("vBuyerName")
    private String vBuyerName;
    @C5862c("vBuyerPic")
    private String vBuyerPic;
    @C5862c("vCourierName")
    private String vCourierName;
    @C5862c("vCourierPic")
    private String vCourierPic;
    @C5862c("vExpireIn")
    private String vExpireIn;
    @C5862c("vPickupAddress")
    private String vPickupAddress;
    @C5862c("vShopAddress")
    private String vShopAddress;
    @C5862c("vShopId")
    private String vShopId;
    @C5862c("vShopLat")
    private String vShopLat;
    @C5862c("vShopLong")
    private String vShopLong;
    @C5862c("vShopName")
    private String vShopName;
    @C5862c("vShopPic")
    private String vShopPic;
    @C5862c("vShopType")
    private String vShopType;
    @C5862c("vStatus")
    private String vStatus;
    @C5862c("vSubAddress")
    private String vSubAddress;
    @C5862c("vSubPickupAddress")
    private String vSubPickupAddress;

    public ArrayList<BundleOrderBean> getBundledOrders() {
        return this.bundledOrders;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getDiscountType() {
        return this.discountType;
    }

    public String getDistance_courier_shop() {
        return this.distance_courier_shop;
    }

    public String getDistance_shop_buyer() {
        return this.distance_shop_buyer;
    }

    public String getExpiry_time() {
        return this.expiry_time;
    }

    public String getFullDeliveryDropOffAddress() {
        if (TextUtils.isEmpty(this.vSubAddress)) {
            return this.vAddress;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.vSubAddress);
        sb.append("\n");
        sb.append(this.vAddress);
        return sb.toString();
    }

    public String getFullPickupAddress() {
        if (TextUtils.isEmpty(this.vSubPickupAddress)) {
            return this.vPickupAddress;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.vSubPickupAddress);
        sb.append("\n");
        sb.append(this.vPickupAddress);
        return sb.toString();
    }

    public boolean getHasBuyerRequestedCancel() {
        return this.hasBuyerRequestedCancel;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public boolean getPackagePickedUp() {
        return this.isPackagePickedUp;
    }

    public double getPlatitude() {
        return this.platitude;
    }

    public double getPlongitude() {
        return this.plongitude;
    }

    public boolean getServicePickupAvailable() {
        return this.servicePickupAvailable;
    }

    public String getTxDescription() {
        return this.txDescription;
    }

    public String getfBuyerRatings() {
        return this.fBuyerRatings;
    }

    public String getfCourierRatings() {
        return this.fCourierRatings;
    }

    public String getiBuyerId() {
        return this.iBuyerId;
    }

    public String getiCourierId() {
        return this.iCourierId;
    }

    public String getiOrderId() {
        return this.iOrderId;
    }

    public String getvAddress() {
        return this.vAddress;
    }

    public String getvBuyerName() {
        return this.vBuyerName;
    }

    public String getvBuyerPic() {
        return this.vBuyerPic;
    }

    public String getvCourierName() {
        return this.vCourierName;
    }

    public String getvCourierPic() {
        return this.vCourierPic;
    }

    public String getvExpireIn() {
        return this.vExpireIn;
    }

    public String getvPickupAddress() {
        return this.vPickupAddress;
    }

    public String getvShopAddress() {
        return this.vShopAddress;
    }

    public String getvShopId() {
        return this.vShopId;
    }

    public String getvShopLat() {
        return this.vShopLat;
    }

    public String getvShopLong() {
        return this.vShopLong;
    }

    public String getvShopName() {
        return this.vShopName;
    }

    public String getvShopPic() {
        return this.vShopPic;
    }

    public String getvShopType() {
        return this.vShopType;
    }

    public String getvStatus() {
        return this.vStatus;
    }

    public String getvSubPickupAddress() {
        return this.vSubPickupAddress;
    }

    public boolean isBundledOrder() {
        return this.isBundledOrder;
    }

    public boolean isBuyerVerified() {
        return this.buyerVerified;
    }

    public boolean isCourierVerified() {
        return this.courierVerified;
    }

    public boolean isUser_rated() {
        return this.user_rated;
    }

    public void setTxDescription(String str) {
        this.txDescription = str;
    }

    public void setfCourierRatings(String str) {
        this.fCourierRatings = str;
    }

    public void setiBuyerId(String str) {
        this.iBuyerId = str;
    }

    public void setiCourierId(String str) {
        this.iCourierId = str;
    }

    public void setiOrderId(String str) {
        this.iOrderId = str;
    }

    public void setvBuyerName(String str) {
        this.vBuyerName = str;
    }

    public void setvCourierName(String str) {
        this.vCourierName = str;
    }

    public void setvCourierPic(String str) {
        this.vCourierPic = str;
    }

    public void setvShopId(String str) {
        this.vShopId = str;
    }

    public void setvShopName(String str) {
        this.vShopName = str;
    }
}
