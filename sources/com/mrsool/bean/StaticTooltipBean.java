package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;
import java.util.List;

public class StaticTooltipBean {
    @C5860a
    @C5862c("button_label")
    private String buttonLabel;
    @C5860a
    @C5862c("highlight")
    private List<String> highlight = null;
    @C5860a
    @C5862c("label")
    private String label;

    public String getButtonLabel() {
        return this.buttonLabel;
    }

    public List<String> getHighlight() {
        return this.highlight;
    }

    public String getLabel() {
        return this.label;
    }

    public void setButtonLabel(String str) {
        this.buttonLabel = str;
    }

    public void setHighlight(List<String> list) {
        this.highlight = list;
    }

    public void setLabel(String str) {
        this.label = str;
    }
}
