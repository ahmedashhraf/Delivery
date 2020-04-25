package com.google.zxing.p333t.p334a;

import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.zxing.C8985n;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.zxing.t.a.d0 */
/* compiled from: URIResultParser */
public final class C9013d0 extends C9037u {

    /* renamed from: f */
    private static final Pattern f23575f = Pattern.compile("[a-zA-Z][a-zA-Z0-9+-.]+:");

    /* renamed from: g */
    private static final Pattern f23576g = Pattern.compile("([a-zA-Z0-9\\-]+\\.){1,6}[a-zA-Z]{2,}(:\\d{1,5})?(/|\\?|$)");

    /* renamed from: e */
    static boolean m42119e(String str) {
        if (str.contains(C3868i.f12248b)) {
            return false;
        }
        Matcher matcher = f23575f.matcher(str);
        if (matcher.find() && matcher.start() == 0) {
            return true;
        }
        Matcher matcher2 = f23576g.matcher(str);
        if (!matcher2.find() || matcher2.start() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public C9011c0 m42121a(C8985n nVar) {
        String b = C9037u.m42253b(nVar);
        if (b.startsWith("URL:") || b.startsWith("URI:")) {
            return new C9011c0(b.substring(4).trim(), null);
        }
        String trim = b.trim();
        if (m42119e(trim)) {
            return new C9011c0(trim, null);
        }
        return null;
    }
}
