package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.util.ArrayList;
import java.util.List;

public class ShopDetails {
    @C5862c("allow_order")
    private Boolean allowOrder;
    @C5862c("bar_color")
    private String barColor;
    @C5862c("validate_payment_method")
    private Boolean checkIfHasValidCards;
    @C5862c("checked_in")
    private Boolean checkedIn;
    @C5862c("checked_in_count")
    private String checkedInCount;
    @C5862c("code")
    private int code;
    @C5862c("curfew_alerts")
    private CurfewAlerts curfewAlerts;
    @C5862c("is_promotion_available")
    private Boolean isPromotionAvailable;
    @C5862c("message")
    private String message;
    @C5862c("orders")
    private List<shopDetailPendingOrder> orders = new ArrayList();
    @C5862c("payment_validation_fail_alert")
    private String paymentMethodValidationFailedMessage;
    private PromotionBean promotion;
    @C5862c("shop")
    private Shop shop;
    @C5862c("shop_order_alert_text")
    private String shop_order_alert_text;
    @C5862c("todays_working_hours")
    private String todaysWorkingHours;

    public String getAddCardPopupButtonLabel() {
        try {
            return this.curfewAlerts.curfewLabels.addCardPopupLabels.button;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String getAddCardPopupDescription() {
        try {
            return this.curfewAlerts.curfewLabels.addCardPopupLabels.description;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String getAddCardPopupTitle() {
        try {
            return this.curfewAlerts.curfewLabels.addCardPopupLabels.title;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public Boolean getAllowOrder() {
        return this.allowOrder;
    }

    public String getBarColor() {
        return this.barColor;
    }

    public String getCashNotAllowedLabel() {
        try {
            return this.curfewAlerts.curfewLabels.cashNotAllowedLabel;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public Boolean getCheckedIn() {
        return this.checkedIn;
    }

    public String getCheckedInCount() {
        return this.checkedInCount;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public List<shopDetailPendingOrder> getOrders() {
        return this.orders;
    }

    public String getPaymentMethodValidationFailedMessage() {
        String str = this.paymentMethodValidationFailedMessage;
        return str != null ? str : "";
    }

    public PromotionBean getPromotion() {
        return this.promotion;
    }

    public boolean getPromotionAvailable() {
        return this.isPromotionAvailable.booleanValue();
    }

    public Shop getShop() {
        return this.shop;
    }

    public String getShop_order_alert_text() {
        return this.shop_order_alert_text;
    }

    public boolean getShouldCheckIfHasValidCard() {
        Boolean bool = this.checkIfHasValidCards;
        return bool != null && bool.booleanValue();
    }

    public String getTodaysWorkingHours() {
        return this.todaysWorkingHours;
    }

    public void setAllowOrder(Boolean bool) {
        this.allowOrder = bool;
    }

    public void setBarColor(String str) {
        this.barColor = str;
    }

    public void setCheckedIn(Boolean bool) {
        this.checkedIn = bool;
    }

    public void setPromotion(PromotionBean promotionBean) {
        this.promotion = promotionBean;
    }

    public void setShop_order_alert_text(String str) {
        this.shop_order_alert_text = str;
    }
}
