package com.mrsool.bean;

import java.io.Serializable;

public class InvoiceBean implements Serializable {
    private String currency;
    private String key;
    private String value;

    public String getCurrency() {
        return this.currency;
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public void setCurrency(String str) {
        this.currency = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
