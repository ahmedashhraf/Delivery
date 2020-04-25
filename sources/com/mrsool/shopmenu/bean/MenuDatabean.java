package com.mrsool.shopmenu.bean;

import com.google.gson.p193w.C5862c;

public class MenuDatabean {
    @C5862c("business_account_id")
    private String businessAccountId;
    @C5862c("business_branch_id")
    private String businessBranchId;
    @C5862c("is_menu_updated")
    private boolean isMenuUpdated;
    @C5862c("menu_url")
    private String menuUrl;
    private String shopId;

    public String getBusinessAccountId() {
        return this.businessAccountId;
    }

    public String getBusinessBranchId() {
        return this.businessBranchId;
    }

    public String getMenuUrl() {
        return this.menuUrl;
    }

    public String getShopId() {
        return this.shopId;
    }

    public boolean isMenuUpdated() {
        return this.isMenuUpdated;
    }

    public void setBusinessAccountId(String str) {
        this.businessAccountId = str;
    }

    public void setBusinessBranchId(String str) {
        this.businessBranchId = str;
    }

    public void setMenuUpdated(boolean z) {
        this.isMenuUpdated = z;
    }

    public void setMenuUrl(String str) {
        this.menuUrl = str;
    }

    public void setShopId(String str) {
        this.shopId = str;
    }
}
