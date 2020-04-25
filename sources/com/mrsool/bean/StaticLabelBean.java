package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;
import java.util.List;

public class StaticLabelBean {
    @C5860a
    @C5862c("code")
    private Integer code;
    @C5860a
    @C5862c("message")
    private String message;
    @C5860a
    @C5862c("onboarding_labels")
    private List<StaticTooltipBean> onboardingLabels = null;
    @C5860a
    @C5862c("tooltip_labels")
    private TooltipLabels tooltipLabels;

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public List<StaticTooltipBean> getOnboardingLabels() {
        return this.onboardingLabels;
    }

    public TooltipLabels getTooltipLabels() {
        return this.tooltipLabels;
    }
}
