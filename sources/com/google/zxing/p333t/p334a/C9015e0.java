package com.google.zxing.p333t.p334a;

import com.google.zxing.C8985n;

/* renamed from: com.google.zxing.t.a.e0 */
/* compiled from: URLTOResultParser */
public final class C9015e0 extends C9037u {
    /* renamed from: a */
    public C9011c0 m42127a(C8985n nVar) {
        String b = C9037u.m42253b(nVar);
        String str = null;
        if (!b.startsWith("urlto:") && !b.startsWith("URLTO:")) {
            return null;
        }
        int indexOf = b.indexOf(58, 6);
        if (indexOf < 0) {
            return null;
        }
        if (indexOf > 6) {
            str = b.substring(6, indexOf);
        }
        return new C9011c0(b.substring(indexOf + 1), str);
    }
}
