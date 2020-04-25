package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;
import java.util.ArrayList;
import java.util.List;

public class ShopBean {
    @C5860a
    @C5862c("code")
    private Integer code;
    @C5860a
    @C5862c("message")
    private String message;
    @C5860a
    @C5862c("shops")
    private List<Shop> shops = new ArrayList();
    @C5860a
    @C5862c("total_pages")
    private Integer total_pages;

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public List<Shop> getShops() {
        return this.shops;
    }
}
