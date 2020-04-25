package com.mrsool.shopmenu.bean;

import com.facebook.appevents.AppEventsConstants;
import com.google.gson.p193w.C5862c;
import com.mrsool.shopmenu.C11411s;
import java.util.ArrayList;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.Enabled;

public class MenuItemBean {
    public static final Double PRICE_HIDE_VALUE = Double.valueOf(-1.0d);
    @C5862c("menu_addons")
    private ArrayList<MenuAddonsBean> arrayListAddons;
    @C5862c("menu_tags")
    private ArrayList<MenuTagsBean> arrayListTags;
    @C5862c("menu_varities")
    private ArrayList<MenuVarietyBean> arrayListVariety;
    @C5862c("business_account_id")
    private String businessAccountId;
    @C5862c("calories")
    private String calories;
    private int childPosition = 0;
    @C5862c("currency")
    private String currency;
    @C5862c("default_variety_id")
    private String defaultVarietyId;
    private String errorMessage;
    private C11411s errorType;
    @C5862c("id")

    /* renamed from: id */
    private String f31658id;
    @C5862c("is_active")
    private boolean isActive;
    private boolean isEditVisible;
    private boolean isSelected;
    private double itemPrice = 0.0d;
    @C5862c("long_desc")
    private String longDesc;
    @C5862c("name")
    private String name;
    private int orderCount = 0;
    private int parentPosition = 0;
    @C5862c("photo_url")
    private String photoUrl;
    @C5862c("preparation_time")
    private String preparationTime;
    @C5862c("price")
    private String price;
    @C5862c("short_desc")
    private String shortDesc;
    private boolean shouldHidePrice = false;
    @C5862c("disable_status")
    private String status;
    private int userChildPosition = 0;
    private String varietyDisplay;

    public MenuItemBean() {
        String str = "";
        this.errorMessage = str;
        this.errorType = C11411s.NONE;
        this.varietyDisplay = str;
        this.status = Enabled.ELEMENT;
        this.arrayListVariety = new ArrayList<>();
        this.arrayListAddons = new ArrayList<>();
        this.arrayListTags = new ArrayList<>();
    }

    public ArrayList<MenuAddonsBean> getArrayListAddons() {
        return this.arrayListAddons;
    }

    public ArrayList<MenuTagsBean> getArrayListTags() {
        return this.arrayListTags;
    }

    public ArrayList<MenuVarietyBean> getArrayListVariety() {
        return this.arrayListVariety;
    }

    public String getBusinessAccountId() {
        return this.businessAccountId;
    }

    public String getCalories() {
        return this.calories;
    }

    public int getChildPosition() {
        return this.childPosition;
    }

    public String getCurrency() {
        if (this.currency.equals("")) {
            this.currency = "SAR";
        }
        return this.currency;
    }

    public String getDefaultVarietyId() {
        return this.defaultVarietyId;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public C11411s getErrorType() {
        return this.errorType;
    }

    public String getId() {
        return this.f31658id;
    }

    public double getItemPrice() {
        return this.itemPrice;
    }

    public String getLongDesc() {
        return this.longDesc;
    }

    public String getName() {
        return this.name;
    }

    public int getOrderCount() {
        return this.orderCount;
    }

    public int getParentPosition() {
        return this.parentPosition;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public String getPreparationTime() {
        return this.preparationTime;
    }

    public String getPrice() {
        if (shouldHidePriceZero()) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        return this.price;
    }

    public String getShortDesc() {
        return this.shortDesc;
    }

    public String getStatus() {
        return this.status;
    }

    public double getTotalAmount() {
        double parseDouble = Double.parseDouble(getPrice());
        double d = (double) this.orderCount;
        Double.isNaN(d);
        return parseDouble * d;
    }

    public int getUserChildPosition() {
        return this.userChildPosition;
    }

    public String getVarietyDisplay() {
        return this.varietyDisplay;
    }

    public boolean isActive() {
        return this.isActive;
    }

    public boolean isEditVisible() {
        return this.isEditVisible;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setActive(boolean z) {
        this.isActive = z;
    }

    public void setArrayListAddons(ArrayList<MenuAddonsBean> arrayList) {
        this.arrayListAddons = arrayList;
    }

    public void setArrayListTags(ArrayList<MenuTagsBean> arrayList) {
        this.arrayListTags = arrayList;
    }

    public void setArrayListVariety(ArrayList<MenuVarietyBean> arrayList) {
        this.arrayListVariety = arrayList;
    }

    public void setBusinessAccountId(String str) {
        this.businessAccountId = str;
    }

    public void setCalories(String str) {
        this.calories = str;
    }

    public void setChildPosition(int i) {
        this.childPosition = i;
    }

    public void setCurrency(String str) {
        this.currency = str;
    }

    public void setDefaultVarietyId(String str) {
        this.defaultVarietyId = str;
    }

    public void setEditVisible(boolean z) {
        this.isEditVisible = z;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setErrorType(C11411s sVar) {
        this.errorType = sVar;
    }

    public void setId(String str) {
        this.f31658id = str;
    }

    public void setItemPrice(double d) {
        this.itemPrice = d;
    }

    public void setLongDesc(String str) {
        this.longDesc = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOrderCount(int i) {
        this.orderCount = i;
    }

    public void setParentPosition(int i) {
        this.parentPosition = i;
    }

    public void setPhotoUrl(String str) {
        this.photoUrl = str;
    }

    public void setPreparationTime(String str) {
        this.preparationTime = str;
    }

    public void setPrice(String str) {
        if (shouldHidePriceZero()) {
            setShouldHidePriceZero();
        }
        this.price = str;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }

    public void setShortDesc(String str) {
        this.shortDesc = str;
    }

    public void setShouldHidePriceZero() {
        this.shouldHidePrice = true;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setUserChildPosition(int i) {
        this.userChildPosition = i;
    }

    public void setVarietyDisplay(String str) {
        this.varietyDisplay = str;
    }

    public boolean shouldHidePriceZero() {
        boolean z = false;
        try {
            if (this.shouldHidePrice || Double.parseDouble(this.price) == PRICE_HIDE_VALUE.doubleValue()) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
