package com.google.zxing.p333t.p334a;

import com.google.zxing.C8985n;

/* renamed from: com.google.zxing.t.a.a0 */
/* compiled from: TelResultParser */
public final class C9007a0 extends C9037u {
    /* renamed from: a */
    public C9042z m42086a(C8985n nVar) {
        String str;
        String b = C9037u.m42253b(nVar);
        String str2 = "tel:";
        String str3 = "TEL:";
        if (!b.startsWith(str2) && !b.startsWith(str3)) {
            return null;
        }
        if (b.startsWith(str3)) {
            StringBuilder sb = new StringBuilder(str2);
            sb.append(b.substring(4));
            str = sb.toString();
        } else {
            str = b;
        }
        int indexOf = b.indexOf(63, 4);
        return new C9042z(indexOf < 0 ? b.substring(4) : b.substring(4, indexOf), str, null);
    }
}
