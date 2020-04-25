package com.mrsool.bean;

import java.io.Serializable;

public class DeeplinkBean implements Serializable {
    private Integer code;
    private String message;
    private String url;

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getUrl() {
        return this.url;
    }
}
