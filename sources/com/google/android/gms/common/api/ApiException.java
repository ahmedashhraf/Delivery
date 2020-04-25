package com.google.android.gms.common.api;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

public class ApiException extends Exception {

    /* renamed from: a */
    protected final Status f12775a;

    public ApiException(@C0193h0 Status status) {
        int O = status.mo17612O();
        String P = status.mo17613P() != null ? status.mo17613P() : "";
        StringBuilder sb = new StringBuilder(String.valueOf(P).length() + 13);
        sb.append(O);
        sb.append(": ");
        sb.append(P);
        super(sb.toString());
        this.f12775a = status;
    }

    /* renamed from: a */
    public int mo17594a() {
        return this.f12775a.mo17612O();
    }

    @Deprecated
    @C0195i0
    /* renamed from: d */
    public String mo17595d() {
        return this.f12775a.mo17613P();
    }
}
