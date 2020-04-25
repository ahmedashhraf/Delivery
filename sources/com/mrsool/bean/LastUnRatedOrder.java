package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.io.Serializable;

public class LastUnRatedOrder implements Serializable {
    @C5862c("courier_id")
    private String courier_id;
    @C5862c("courier_name")
    private String courier_name;
    @C5862c("courier_pic")
    private String courier_pic;
    @C5862c("courier_ratings")
    private String courier_ratings;
    @C5862c("description")
    private String description;
    @C5862c("id")

    /* renamed from: id */
    private String f27622id;
    @C5862c("shop_name")
    private String shop_name;

    public String getCourier_id() {
        return this.courier_id;
    }

    public String getCourier_name() {
        return this.courier_name;
    }

    public String getCourier_pic() {
        return this.courier_pic;
    }

    public String getCourier_ratings() {
        return this.courier_ratings;
    }

    public String getDescription() {
        return this.description;
    }

    public String getId() {
        return this.f27622id;
    }

    public String getShop_name() {
        return this.shop_name;
    }
}
