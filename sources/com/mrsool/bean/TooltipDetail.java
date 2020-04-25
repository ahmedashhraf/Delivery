package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.io.Serializable;
import java.util.ArrayList;

public class TooltipDetail implements Serializable {
    @C5862c("highlight")
    private ArrayList<String> highlight;
    @C5862c("label")
    private String label;

    public ArrayList<String> getHighlight() {
        return this.highlight;
    }

    public String getLabel() {
        return this.label;
    }
}
