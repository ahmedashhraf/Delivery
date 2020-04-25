package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;

public class DeliveryTimeBean {
    @C5860a
    @C5862c("text")
    private String text;
    @C5860a
    @C5862c("value")
    private String value;

    public String getText() {
        return this.text;
    }

    public String getValue() {
        return this.value;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
