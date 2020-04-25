package com.mrsool.bean;

import com.google.gson.p193w.C5862c;

public class UserStats {
    @C5862c("is_online")
    private boolean isOnline;
    @C5862c("bNotification")
    private boolean isOrderNotification;
    @C5862c("online_screen_labels")
    private OnlineScreenLabels onlineScreenLabels;
    @C5862c("tooltip_res")
    private TooltipRes tooltipRes;

    public boolean getOnline() {
        return this.isOnline;
    }

    public OnlineScreenLabels getOnlineScreenLabels() {
        return this.onlineScreenLabels;
    }

    public boolean getOrderNotification() {
        return this.isOrderNotification;
    }

    public TooltipRes getTooltipRes() {
        return this.tooltipRes;
    }
}
