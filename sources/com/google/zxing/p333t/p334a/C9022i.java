package com.google.zxing.p333t.p334a;

import com.google.zxing.C8985n;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.google.zxing.t.a.i */
/* compiled from: EmailAddressResultParser */
public final class C9022i extends C9037u {

    /* renamed from: f */
    private static final Pattern f23615f = Pattern.compile(",");

    /* renamed from: a */
    public C9020h m42183a(C8985n nVar) {
        String str;
        String str2;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String b = C9037u.m42253b(nVar);
        String[] strArr4 = null;
        if (b.startsWith("mailto:") || b.startsWith("MAILTO:")) {
            String substring = b.substring(7);
            int indexOf = substring.indexOf(63);
            if (indexOf >= 0) {
                substring = substring.substring(0, indexOf);
            }
            try {
                String d = C9037u.m42259d(substring);
                String[] split = !d.isEmpty() ? f23615f.split(d) : null;
                Map b2 = C9037u.m42255b(b);
                if (b2 != null) {
                    if (split == null) {
                        String str3 = (String) b2.get("to");
                        if (str3 != null) {
                            split = f23615f.split(str3);
                        }
                    }
                    String str4 = (String) b2.get("cc");
                    String[] split2 = str4 != null ? f23615f.split(str4) : null;
                    String str5 = (String) b2.get("bcc");
                    if (str5 != null) {
                        strArr4 = f23615f.split(str5);
                    }
                    str = (String) b2.get("body");
                    strArr3 = split;
                    strArr = strArr4;
                    strArr2 = split2;
                    str2 = (String) b2.get("subject");
                } else {
                    strArr3 = split;
                    strArr2 = null;
                    strArr = null;
                    str2 = null;
                    str = null;
                }
                C9020h hVar = new C9020h(strArr3, strArr2, strArr, str2, str);
                return hVar;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } else if (!C9024j.m42192e(b)) {
            return null;
        } else {
            return new C9020h(b);
        }
    }
}
