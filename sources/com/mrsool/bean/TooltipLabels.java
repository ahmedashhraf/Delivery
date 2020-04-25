package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;

public class TooltipLabels {
    @C5860a
    @C5862c("chatbot_tooltip")
    private StaticTooltipBean chatbotTooltip;
    @C5860a
    @C5862c("courier_tooltip")
    private StaticTooltipBean courierTooltip;
    @C5860a
    @C5862c("search_tooltip")
    private StaticTooltipBean searchTooltip;
    @C5860a
    @C5862c("waiting_order_tooltip")
    private StaticTooltipBean waitingOrderTooltip;

    public StaticTooltipBean getChatbotTooltip() {
        return this.chatbotTooltip;
    }

    public StaticTooltipBean getCourierTooltip() {
        return this.courierTooltip;
    }

    public StaticTooltipBean getSearchTooltip() {
        return this.searchTooltip;
    }

    public StaticTooltipBean getWaitingOrderTooltip() {
        return this.waitingOrderTooltip;
    }

    public void setChatbotTooltip(StaticTooltipBean staticTooltipBean) {
        this.chatbotTooltip = staticTooltipBean;
    }

    public void setCourierTooltip(StaticTooltipBean staticTooltipBean) {
        this.courierTooltip = staticTooltipBean;
    }

    public void setSearchTooltip(StaticTooltipBean staticTooltipBean) {
        this.searchTooltip = staticTooltipBean;
    }
}
