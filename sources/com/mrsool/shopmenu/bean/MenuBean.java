package com.mrsool.shopmenu.bean;

import com.google.gson.p193w.C5862c;
import java.util.ArrayList;

public class MenuBean {
    @C5862c("menu_item_category")
    private ArrayList<MenuCategoryBean> arrayListCategoryBean;
    @C5862c("business_account_id")
    private String businessAccountId;
    @C5862c("business_branch_id")
    private String businessBranchId;
    @C5862c("vat_multiplier")
    private double vatMultiplier = 0.0d;

    public ArrayList<MenuCategoryBean> getArrayListCategoryBean() {
        return this.arrayListCategoryBean;
    }

    public String getBusinessAccountId() {
        return this.businessAccountId;
    }

    public String getBusinessBranchId() {
        return this.businessBranchId;
    }

    public double getVatMultiplier() {
        return this.vatMultiplier;
    }

    public void setArrayListCategoryBean(ArrayList<MenuCategoryBean> arrayList) {
        this.arrayListCategoryBean = arrayList;
    }

    public void setBusinessAccountId(String str) {
        this.businessAccountId = str;
    }

    public void setBusinessBranchId(String str) {
        this.businessBranchId = str;
    }
}
