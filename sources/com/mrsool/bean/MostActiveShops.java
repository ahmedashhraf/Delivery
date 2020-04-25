package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import com.mrsool.newBean.StoreCategoryBean;
import java.util.ArrayList;
import java.util.List;

public class MostActiveShops {
    @C5862c("no_nearby_stores_error_text")
    private String message;
    @C5862c("services")
    private List<MrsoolService> mrsoolServices = new ArrayList();
    @C5862c("service_available")
    private boolean serviceAvailable;
    @C5862c("nearby_shops")
    private List<Shop> shops = new ArrayList();
    @C5862c("categories")
    private List<StoreCategoryBean> storeCategories = new ArrayList();

    public String getMessage() {
        return this.message;
    }

    public List<MrsoolService> getMrsoolServices() {
        return this.mrsoolServices;
    }

    public List<Shop> getShops() {
        return this.shops;
    }

    public List<StoreCategoryBean> getStoreCategories() {
        return this.storeCategories;
    }

    public boolean isServiceAvailable() {
        return this.serviceAvailable;
    }
}
