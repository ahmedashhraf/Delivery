package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;

public class MenuItemsBean {
    @C5860a
    @C5862c("image")
    private String image;
    @C5860a
    @C5862c("title")
    private String title;

    public MenuItemsBean(String str, String str2) {
        this.title = str;
        this.image = str2;
    }

    public String getImage() {
        return this.image;
    }
}
