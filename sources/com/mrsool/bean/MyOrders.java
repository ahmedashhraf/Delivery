package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;
import java.util.ArrayList;
import java.util.List;

public class MyOrders {
    @C5860a
    @C5862c("active")
    private List<MyOrdersActive> active = new ArrayList();
    @C5860a
    @C5862c("code")
    private Integer code;
    @C5860a
    @C5862c("inactive")
    private List<MyOrdersInactive> inactive = new ArrayList();

    public List<MyOrdersActive> getActive() {
        return this.active;
    }

    public List<MyOrdersInactive> getInactive() {
        return this.inactive;
    }
}
