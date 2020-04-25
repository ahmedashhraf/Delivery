package com.google.zxing.p333t.p334a;

import java.util.regex.Pattern;

/* renamed from: com.google.zxing.t.a.c0 */
/* compiled from: URIParsedResult */
public final class C9011c0 extends C9033q {

    /* renamed from: d */
    private static final Pattern f23556d = Pattern.compile(":/*([^/@]+)@[^/]+");

    /* renamed from: b */
    private final String f23557b;

    /* renamed from: c */
    private final String f23558c;

    public C9011c0(String str, String str2) {
        super(C9034r.URI);
        this.f23557b = m42096a(str);
        this.f23558c = str2;
    }

    /* renamed from: a */
    public String mo32877a() {
        StringBuilder sb = new StringBuilder(30);
        C9033q.m42236a(this.f23558c, sb);
        C9033q.m42236a(this.f23557b, sb);
        return sb.toString();
    }

    /* renamed from: c */
    public String mo32880c() {
        return this.f23558c;
    }

    /* renamed from: d */
    public String mo32881d() {
        return this.f23557b;
    }

    /* renamed from: e */
    public boolean mo32882e() {
        return f23556d.matcher(this.f23557b).find();
    }

    /* renamed from: a */
    private static String m42096a(String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(58);
        if (indexOf >= 0 && !m42097a(trim, indexOf)) {
            return trim;
        }
        StringBuilder sb = new StringBuilder("http://");
        sb.append(trim);
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m42097a(String str, int i) {
        int i2 = i + 1;
        int indexOf = str.indexOf(47, i2);
        if (indexOf < 0) {
            indexOf = str.length();
        }
        return C9037u.m42250a(str, i2, indexOf - i2);
    }
}
