package com.instabug.bug.model;

import java.io.Serializable;

/* renamed from: com.instabug.bug.model.b */
/* compiled from: ReportType */
public enum C9278b implements Serializable {
    BUG("bug"),
    FEEDBACK("feedback"),
    NOT_AVAILABLE("not-available");
    
    private final String name;

    static {
        boolean[] d;
        d[4] = true;
    }

    private C9278b(String str) {
        boolean[] d = m43418d();
        this.name = str;
        d[2] = true;
    }

    public String toString() {
        boolean[] d = m43418d();
        String str = this.name;
        d[3] = true;
        return str;
    }
}
