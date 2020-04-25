package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;
import java.io.Serializable;

public class SearviceManualCommonBean implements Serializable {
    @C5860a
    @C5862c("manual_hash")
    private Object manualHash;
    @C5860a
    @C5862c("manual_ids")
    private String manualIds;
    @C5860a
    @C5862c("show_manual")
    private boolean showManual;

    public Object getManualHash() {
        return this.manualHash;
    }

    public String getManualIds() {
        return this.manualIds;
    }

    public boolean isShowManual() {
        return this.showManual;
    }

    public void setManualHash(Object obj) {
        this.manualHash = obj;
    }

    public void setManualIds(String str) {
        this.manualIds = str;
    }

    public void setShowManual(boolean z) {
        this.showManual = z;
    }
}
