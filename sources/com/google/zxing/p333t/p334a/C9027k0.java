package com.google.zxing.p333t.p334a;

import com.google.zxing.C8985n;

/* renamed from: com.google.zxing.t.a.k0 */
/* compiled from: WifiResultParser */
public final class C9027k0 extends C9037u {
    /* renamed from: a */
    public C9025j0 m42219a(C8985n nVar) {
        String b = C9037u.m42253b(nVar);
        if (!b.startsWith("WIFI:")) {
            return null;
        }
        String b2 = C9037u.m42254b("S:", b, ';', false);
        if (b2 == null || b2.isEmpty()) {
            return null;
        }
        String b3 = C9037u.m42254b("P:", b, ';', false);
        String b4 = C9037u.m42254b("T:", b, ';', false);
        if (b4 == null) {
            b4 = "nopass";
        }
        return new C9025j0(b4, b2, b3, Boolean.parseBoolean(C9037u.m42254b("H:", b, ';', false)));
    }
}
