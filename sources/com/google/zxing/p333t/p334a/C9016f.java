package com.google.zxing.p333t.p334a;

import com.google.zxing.C8985n;

/* renamed from: com.google.zxing.t.a.f */
/* compiled from: BookmarkDoCoMoResultParser */
public final class C9016f extends C9006a {
    /* renamed from: a */
    public C9011c0 m42129a(C8985n nVar) {
        String f = nVar.mo32827f();
        if (!f.startsWith("MEBKM:")) {
            return null;
        }
        String b = C9006a.m42084b("TITLE:", f, true);
        String[] a = C9006a.m42083a("URL:", f, true);
        if (a == null) {
            return null;
        }
        String str = a[0];
        if (C9013d0.m42119e(str)) {
            return new C9011c0(str, b);
        }
        return null;
    }
}
