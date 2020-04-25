package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.util.ArrayList;
import java.util.List;

public class TooltipRes {
    @C5862c("highlight")
    private List<String> highlight = new ArrayList();
    @C5862c("label")
    private String label;

    public List<String> getHighlight() {
        return this.highlight;
    }

    public String getLabel() {
        return this.label;
    }

    public void setHighlight(List<String> list) {
        this.highlight = list;
    }

    public void setLabel(String str) {
        this.label = str;
    }
}
