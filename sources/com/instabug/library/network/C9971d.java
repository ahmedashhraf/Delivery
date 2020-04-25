package com.instabug.library.network;

import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.network.d */
/* compiled from: ServerConnectionException */
public class C9971d extends Exception {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26517a;

    public C9971d() {
        boolean[] a = m46373a();
        super("Server connection error");
        a[1] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m46373a() {
        boolean[] zArr = f26517a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(6231787129831676306L, "com/instabug/library/network/ServerConnectionException", 2);
        f26517a = a;
        return a;
    }
}
