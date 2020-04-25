package com.google.zxing.p333t.p334a;

import com.google.zxing.C8985n;
import java.util.regex.Pattern;

/* renamed from: com.google.zxing.t.a.j */
/* compiled from: EmailDoCoMoResultParser */
public final class C9024j extends C9006a {

    /* renamed from: f */
    private static final Pattern f23618f = Pattern.compile("[a-zA-Z0-9@.!#$%&'*+\\-/=?^_`{|}~]+");

    /* renamed from: e */
    static boolean m42192e(String str) {
        return str != null && f23618f.matcher(str).matches() && str.indexOf(64) >= 0;
    }

    /* renamed from: a */
    public C9020h m42194a(C8985n nVar) {
        String b = C9037u.m42253b(nVar);
        if (!b.startsWith("MATMSG:")) {
            return null;
        }
        String[] a = C9006a.m42083a("TO:", b, true);
        if (a == null) {
            return null;
        }
        for (String e : a) {
            if (!m42192e(e)) {
                return null;
            }
        }
        C9020h hVar = new C9020h(a, null, null, C9006a.m42084b("SUB:", b, false), C9006a.m42084b("BODY:", b, false));
        return hVar;
    }
}
