package com.mrsool.bean;

import com.google.gson.p193w.C5862c;

public class RatingReasonBean {
    @C5862c("code")

    /* renamed from: id */
    private int f27629id;
    @C5862c("reason")
    private String reason;
    @C5862c("isSelected")
    private boolean selected = false;

    public RatingReasonBean(int i, String str, Boolean bool) {
        this.f27629id = i;
        this.reason = str;
        this.selected = bool.booleanValue();
    }

    public String getName() {
        return this.reason;
    }

    public boolean getSelected() {
        return this.selected;
    }

    public int getid() {
        return this.f27629id;
    }

    public void setSelected(Boolean bool) {
        this.selected = bool.booleanValue();
    }
}
