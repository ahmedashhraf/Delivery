package com.mrsool.shopmenu.bean;

public class MenuDefaulBean {
    private Integer code;
    private MenuDatabean data;
    private String error;

    public Integer getCode() {
        return this.code;
    }

    public MenuDatabean getData() {
        return this.data;
    }

    public String getError() {
        return this.error;
    }

    public void setCode(Integer num) {
        this.code = num;
    }

    public void setData(MenuDatabean menuDatabean) {
        this.data = menuDatabean;
    }

    public void setError(String str) {
        this.error = str;
    }
}
