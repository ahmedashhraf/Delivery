package com.google.zxing.p333t.p334a;

/* renamed from: com.google.zxing.t.a.j0 */
/* compiled from: WifiParsedResult */
public final class C9025j0 extends C9033q {

    /* renamed from: b */
    private final String f23619b;

    /* renamed from: c */
    private final String f23620c;

    /* renamed from: d */
    private final String f23621d;

    /* renamed from: e */
    private final boolean f23622e;

    public C9025j0(String str, String str2, String str3) {
        this(str, str2, str3, false);
    }

    /* renamed from: a */
    public String mo32877a() {
        StringBuilder sb = new StringBuilder(80);
        C9033q.m42236a(this.f23619b, sb);
        C9033q.m42236a(this.f23620c, sb);
        C9033q.m42236a(this.f23621d, sb);
        C9033q.m42236a(Boolean.toString(this.f23622e), sb);
        return sb.toString();
    }

    /* renamed from: c */
    public String mo32926c() {
        return this.f23620c;
    }

    /* renamed from: d */
    public String mo32927d() {
        return this.f23621d;
    }

    /* renamed from: e */
    public String mo32928e() {
        return this.f23619b;
    }

    /* renamed from: f */
    public boolean mo32929f() {
        return this.f23622e;
    }

    public C9025j0(String str, String str2, String str3, boolean z) {
        super(C9034r.WIFI);
        this.f23619b = str2;
        this.f23620c = str;
        this.f23621d = str3;
        this.f23622e = z;
    }
}
