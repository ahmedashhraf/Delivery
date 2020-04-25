package com.mrsool.bean;

import java.io.Serializable;

public class CTEventBean implements Serializable {
    private String additionalDetail;
    private String commingFrom;
    private String listIndex;

    public CTEventBean(String str, String str2) {
        this.commingFrom = str;
        this.additionalDetail = str2;
    }

    public String getAdditionalDetail() {
        return this.additionalDetail;
    }

    public String getCommingFrom() {
        return this.commingFrom;
    }

    public String getListIndex() {
        return this.listIndex;
    }

    public CTEventBean(String str, String str2, String str3) {
        this.commingFrom = str;
        this.additionalDetail = str2;
        this.listIndex = str3;
    }
}
