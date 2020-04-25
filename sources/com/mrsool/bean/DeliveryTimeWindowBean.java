package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import com.mrsool.newBean.BranchBean;
import java.util.List;

public class DeliveryTimeWindowBean {
    @C5862c("address_hash")
    private BranchBean branchBean;
    @C5862c("code")
    private Integer code;
    @C5862c("delivery_time_options")
    private List<DeliveryTimeBean> deliveryTimeOptions;
    @C5862c("message")
    private String message;

    public BranchBean getAddressHash() {
        return this.branchBean;
    }

    public Integer getCode() {
        return this.code;
    }

    public List<DeliveryTimeBean> getDeliveryTimeOptions() {
        return this.deliveryTimeOptions;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(Integer num) {
        this.code = num;
    }

    public void setDeliveryTimeOptions(List<DeliveryTimeBean> list) {
        this.deliveryTimeOptions = list;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
