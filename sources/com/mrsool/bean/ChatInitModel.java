package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ChatInitModel implements Serializable {
    @C5862c("order_offer")
    private OrderOffer OrderOffer;
    @C5862c("allow_decimal_del_cost")
    private boolean allowDecimalDelCost;
    @C5862c("allow_order")
    private Boolean allowOrder;
    @C5862c("alreadyTaken")
    private Integer alreadyTaken;
    @C5862c("alreadyTakenMessage")
    private String alreadyTakenMessage;
    @C5862c("android_google_direction_key")
    private String androidGoogleDirectionKey;
    @C5862c("bar_color")
    private String barColor;
    @C5862c("bill_msg_coupon_title")
    private String bill_msg_coupon_title;
    @C5862c("change_pay_app_alert")
    private String changePayAppAlert;
    @C5862c("change_pay_option")
    private boolean changePayOption;
    @C5862c("code")
    private Integer code;
    @C5862c("cost_with_vat_text")
    private String cost_with_vat_text;
    @C5862c("courierCancel")
    private Integer courierCancel;
    @C5862c("courierCancelMessage")
    private String courierCancelMessage;
    @C5862c("courier_pnotification")
    private boolean courier_pnotification;
    @C5862c("disable_chat")
    private boolean disableChat;
    @C5862c("disable_chat_label")
    private String disableChatLabel;
    @C5862c("discount_type")
    private String discount_type;
    @C5862c("enable_voice_note")
    private boolean enableVoiceNote;
    @C5862c("has_coupon")
    private boolean hasCoupon;
    @C5862c("has_courier_changed_by_buyer")
    private boolean hasCourierChangedByBuyer;
    @C5862c("has_courier_withdrawn")
    private boolean hasCourierWithdrawn;
    @C5862c("has_multiple_offers")
    private boolean has_multiple_offers;
    @C5862c("hide_map_location")
    private Boolean hide_map_location;
    @C5862c("hide_view")
    private boolean hide_view;
    @C5862c("hide_withdraw_cancel_courier")
    private Integer hide_withdraw_cancel_courier;
    @C5862c("hwcc_buyer")
    private String hwcc_buyer;
    @C5862c("hwcc_courier")
    private String hwcc_courier;
    @C5862c("is_paid")
    private boolean isPaid;
    @C5862c("is_boms_linked")
    private boolean is_boms_linked;
    @C5862c("issue_bill_option")
    private Boolean issue_bill_option;
    @C5862c("message")
    private String message;
    @C5862c("messages")
    private ArrayList<messages> messages;
    @C5862c("min_del_cost")
    private double min_del_cost;
    @C5862c("msg_images")
    private List<MessageImagesBean> msgImages;
    @C5862c("multiple_offers_count")
    private Integer multiple_offers_count;
    @C5862c("next_quick_action")
    private NextQuickActionBean nextQuickAction;
    @C5862c("no_chat_in_order")
    private Boolean noChatInOrder;
    @C5862c("offer_delay_sec")
    private long offerDelaySec;
    @C5862c("offer_issue")
    private String offer_issue;
    @C5862c("offer_range_text")
    private String offer_range_text;
    @C5862c("order")
    private Order order;
    @C5862c("order_bill")
    private OrderBill orderBill;
    @C5860a
    @C5862c("detailed_bill")
    private OrderDetailBill orderDetailBill;
    @C5860a
    @C5862c("order_dialog_flags")
    private OrderDialogFlags orderDialogFlags;
    @C5862c("order_payment")
    private OrderPaymentBill orderPayment;
    @C5862c("order_track")
    private OrderTrackBean order_track;
    @C5862c("package_picked_option")
    private Boolean package_picked_option;
    @C5862c("pending_order_text")
    private String pending_order_text;
    @C5862c("pnotification")
    private boolean pnotification;
    @C5862c("portal_order_detail")
    private PortalOrderDetail portalOrderDetail;
    @C5862c("reoffer_text")
    private String reoffer_text;
    @C5862c("service_manual")
    private SearviceManualCommonBean serviceManual;
    @C5862c("shop_order_alert_text")
    private String shopOrderAlertText;
    @C5862c("show_item_list")
    private boolean showItemList;
    @C5862c("show_pay")
    private boolean showPay;
    @C5862c("submit_delay_sec")
    private long submitDelaySec;
    @C5862c("superseded_text")
    private String superseded_text;
    @C5862c("tooltip_res")
    private TooltipDetail tooltipDetail;
    @C5862c("popup_res")
    private TooltipPopupDetail tooltipPopupDetail;
    @C5862c("user_delivery_count")
    private Integer user_delivery_count;
    @C5862c("user_feedback_count")
    private Integer user_feedback_count;
    @C5862c("vat_calculation_check")
    private boolean vat_calculation_check;
    @C5862c("vat_rate")
    private Float vat_rate;
    @C5862c("welcome_popup_title")
    private String welcomePopupTitle;

    public Integer getAlreadyTaken() {
        return this.alreadyTaken;
    }

    public String getAlreadyTakenMessage() {
        return this.alreadyTakenMessage;
    }

    public String getAndroidGoogleDirectionKey() {
        return this.androidGoogleDirectionKey;
    }

    public String getBarColor() {
        return this.barColor;
    }

    public String getBill_msg_coupon_title() {
        return this.bill_msg_coupon_title;
    }

    public String getChangePayAppAlert() {
        return this.changePayAppAlert;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getCost_with_vat_text() {
        return this.cost_with_vat_text;
    }

    public Integer getCourierCancel() {
        return this.courierCancel;
    }

    public String getCourierCancelMessage() {
        return this.courierCancelMessage;
    }

    public String getDisableChatLabel() {
        return this.disableChatLabel;
    }

    public String getDiscountType() {
        return this.discount_type;
    }

    public Boolean getHide_map_location() {
        return this.hide_map_location;
    }

    public Integer getHide_withdraw_cancel_courier() {
        return this.hide_withdraw_cancel_courier;
    }

    public String getHwcc_buyer() {
        return this.hwcc_buyer;
    }

    public String getHwcc_courier() {
        return this.hwcc_courier;
    }

    public Boolean getIssue_bill_option() {
        return this.issue_bill_option;
    }

    public String getMessage() {
        return this.message;
    }

    public ArrayList<messages> getMessages() {
        return this.messages;
    }

    public double getMin_del_cost() {
        return this.min_del_cost;
    }

    public List<MessageImagesBean> getMsgImages() {
        return this.msgImages;
    }

    public Integer getMultiple_offers_count() {
        return this.multiple_offers_count;
    }

    public NextQuickActionBean getNextQuickAction() {
        return this.nextQuickAction;
    }

    public Boolean getNoChatInOrder() {
        return this.noChatInOrder;
    }

    public long getOfferDelaySec() {
        return this.offerDelaySec;
    }

    public String getOffer_issue() {
        return this.offer_issue;
    }

    public Order getOrder() {
        return this.order;
    }

    public OrderBill getOrderBill() {
        return this.orderBill;
    }

    public OrderDetailBill getOrderDetailBill() {
        return this.orderDetailBill;
    }

    public OrderDialogFlags getOrderDialogFlags() {
        return this.orderDialogFlags;
    }

    public OrderOffer getOrderOffer() {
        return this.OrderOffer;
    }

    public OrderPaymentBill getOrderPayment() {
        return this.orderPayment;
    }

    public OrderTrackBean getOrder_track() {
        return this.order_track;
    }

    public Boolean getPackage_picked_option() {
        return this.package_picked_option;
    }

    public String getPending_order_text() {
        return this.pending_order_text;
    }

    public PortalOrderDetail getPortalOrderDetail() {
        return this.portalOrderDetail;
    }

    public String getReoffer_text() {
        return this.reoffer_text;
    }

    public SearviceManualCommonBean getServiceManual() {
        return this.serviceManual;
    }

    public String getShopOrderAlertText() {
        return this.shopOrderAlertText;
    }

    public boolean getShowItemList() {
        return this.showItemList;
    }

    public long getSubmitDelaySec() {
        return this.submitDelaySec;
    }

    public String getSuperseded_text() {
        return this.superseded_text;
    }

    public TooltipDetail getTooltipDetail() {
        return this.tooltipDetail;
    }

    public TooltipPopupDetail getTooltipPopupDetail() {
        return this.tooltipPopupDetail;
    }

    public Integer getUser_delivery_count() {
        return this.user_delivery_count;
    }

    public Integer getUser_feedback_count() {
        return this.user_feedback_count;
    }

    public String getWelcomePopupTitle() {
        return this.welcomePopupTitle;
    }

    public boolean hasCoupon() {
        return this.hasCoupon;
    }

    public boolean isAllowDecimalDelCost() {
        return this.allowDecimalDelCost;
    }

    public boolean isBomsLinked() {
        return this.is_boms_linked;
    }

    public boolean isChangePayOption() {
        return this.changePayOption;
    }

    public boolean isCourier_pnotification() {
        return this.courier_pnotification;
    }

    public boolean isDisableChat() {
        return this.disableChat;
    }

    public boolean isEnableVoiceNote() {
        return this.enableVoiceNote;
    }

    public boolean isHasCourierChangedByBuyer() {
        return this.hasCourierChangedByBuyer;
    }

    public boolean isHasCourierWithdrawn() {
        return this.hasCourierWithdrawn;
    }

    public boolean isHas_multiple_offers() {
        return this.has_multiple_offers;
    }

    public boolean isPaid() {
        return this.isPaid;
    }

    public boolean isShowPay() {
        return this.showPay;
    }

    public boolean isVat_calculation_check() {
        return this.vat_calculation_check;
    }

    public void setDisableChat(boolean z) {
        this.disableChat = z;
    }

    public void setNoChatInOrder(Boolean bool) {
        this.noChatInOrder = bool;
    }

    public void setOfferDelaySec(long j) {
        this.offerDelaySec = j;
    }

    public void setOrder(Order order2) {
        this.order = order2;
    }

    public void setOrderBill(OrderBill orderBill2) {
        this.orderBill = orderBill2;
    }

    public void setOrderDetailBill(OrderDetailBill orderDetailBill2) {
        this.orderDetailBill = orderDetailBill2;
    }

    public void setOrderDialogFlags(OrderDialogFlags orderDialogFlags2) {
        this.orderDialogFlags = orderDialogFlags2;
    }

    public void setOrderOffer(OrderOffer orderOffer) {
        this.OrderOffer = orderOffer;
    }

    public void setPaid(boolean z) {
        this.isPaid = z;
    }

    public void setShowPay(boolean z) {
        this.showPay = z;
    }

    public void setSubmitDelaySec(long j) {
        this.submitDelaySec = j;
    }
}
