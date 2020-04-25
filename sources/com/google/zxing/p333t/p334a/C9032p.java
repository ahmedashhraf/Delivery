package com.google.zxing.p333t.p334a;

import com.google.zxing.C8929a;
import com.google.zxing.C8985n;

/* renamed from: com.google.zxing.t.a.p */
/* compiled from: ISBNResultParser */
public final class C9032p extends C9037u {
    /* renamed from: a */
    public C9031o m42235a(C8985n nVar) {
        if (nVar.mo32819a() != C8929a.EAN_13) {
            return null;
        }
        String b = C9037u.m42253b(nVar);
        if (b.length() != 13) {
            return null;
        }
        if (b.startsWith("978") || b.startsWith("979")) {
            return new C9031o(b);
        }
        return null;
    }
}
