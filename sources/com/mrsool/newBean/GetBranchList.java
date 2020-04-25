package com.mrsool.newBean;

import com.google.gson.p193w.C5862c;
import java.util.ArrayList;

public class GetBranchList {
    @C5862c("allow_order")
    private boolean allowOrder;
    @C5862c("bar_color")
    private String barColor;
    @C5862c("branch_locations")
    private ArrayList<BranchBean> branchList = new ArrayList<>();
    @C5862c("code")
    private int code;
    @C5862c("message")
    private String message;
    @C5862c("shop_order_alert_text")
    private String shopOrderAlertText;

    public String getBarColor() {
        return this.barColor;
    }

    public ArrayList<BranchBean> getBranchList() {
        return this.branchList;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getShopOrderAlertText() {
        return this.shopOrderAlertText;
    }

    public boolean isAllowOrder() {
        return this.allowOrder;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setShopOrderAlertText(String str) {
        this.shopOrderAlertText = str;
    }
}
