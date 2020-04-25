package com.instabug.library.instacapture.p388a;

import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.instacapture.a.a */
/* compiled from: ActivityNotRunningException */
public class C9821a extends RuntimeException {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26039a;

    public C9821a() {
        m45815a()[0] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m45815a() {
        boolean[] zArr = f26039a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-2503507818106631276L, "com/instabug/library/instacapture/exception/ActivityNotRunningException", 2);
        f26039a = a;
        return a;
    }

    public C9821a(String str) {
        boolean[] a = m45815a();
        super(str);
        a[1] = true;
    }
}
