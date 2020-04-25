package com.mrsool.bean;

public class OrderSpinnerBean {
    private String count;
    private String title;

    public OrderSpinnerBean(String str, String str2) {
        this.title = str;
        this.count = str2;
    }

    public String getCount() {
        return this.count;
    }

    public String getTitle() {
        return this.title;
    }

    public void setCount(String str) {
        this.count = str;
    }
}
