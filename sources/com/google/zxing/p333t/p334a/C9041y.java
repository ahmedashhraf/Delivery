package com.google.zxing.p333t.p334a;

import com.google.zxing.C8985n;

/* renamed from: com.google.zxing.t.a.y */
/* compiled from: SMTPResultParser */
public final class C9041y extends C9037u {
    /* renamed from: a */
    public C9020h m42273a(C8985n nVar) {
        String str;
        String str2;
        String b = C9037u.m42253b(nVar);
        if (!b.startsWith("smtp:") && !b.startsWith("SMTP:")) {
            return null;
        }
        String substring = b.substring(5);
        int indexOf = substring.indexOf(58);
        if (indexOf >= 0) {
            String substring2 = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
            int indexOf2 = substring2.indexOf(58);
            if (indexOf2 >= 0) {
                String substring3 = substring2.substring(indexOf2 + 1);
                str2 = substring2.substring(0, indexOf2);
                str = substring3;
            } else {
                str = null;
                str2 = substring2;
            }
        } else {
            str2 = null;
            str = null;
        }
        C9020h hVar = new C9020h(new String[]{substring}, null, null, str2, str);
        return hVar;
    }
}
