package com.google.zxing.p333t.p334a;

import com.google.zxing.C8985n;

/* renamed from: com.google.zxing.t.a.x */
/* compiled from: SMSTOMMSTOResultParser */
public final class C9040x extends C9037u {
    /* renamed from: a */
    public C9039w m42271a(C8985n nVar) {
        String str;
        String b = C9037u.m42253b(nVar);
        if (!b.startsWith("smsto:") && !b.startsWith("SMSTO:") && !b.startsWith("mmsto:") && !b.startsWith("MMSTO:")) {
            return null;
        }
        String substring = b.substring(6);
        int indexOf = substring.indexOf(58);
        if (indexOf >= 0) {
            str = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
        } else {
            str = null;
        }
        return new C9039w(substring, (String) null, (String) null, str);
    }
}
