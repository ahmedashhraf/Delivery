package com.google.zxing.p333t.p334a;

import com.google.zxing.C8929a;
import com.google.zxing.C8985n;
import com.google.zxing.p346y.C9103a0;

/* renamed from: com.google.zxing.t.a.t */
/* compiled from: ProductResultParser */
public final class C9036t extends C9037u {
    /* renamed from: a */
    public C9035s m42244a(C8985n nVar) {
        C8929a a = nVar.mo32819a();
        if (a != C8929a.UPC_A && a != C8929a.UPC_E && a != C8929a.EAN_8 && a != C8929a.EAN_13) {
            return null;
        }
        String b = C9037u.m42253b(nVar);
        if (!C9037u.m42256b(b, b.length())) {
            return null;
        }
        return new C9035s(b, (a == C8929a.UPC_E && b.length() == 8) ? C9103a0.m42576b(b) : b);
    }
}
