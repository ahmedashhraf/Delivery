package com.google.zxing.p333t.p334a;

/* renamed from: com.google.zxing.t.a.z */
/* compiled from: TelParsedResult */
public final class C9042z extends C9033q {

    /* renamed from: b */
    private final String f23658b;

    /* renamed from: c */
    private final String f23659c;

    /* renamed from: d */
    private final String f23660d;

    public C9042z(String str, String str2, String str3) {
        super(C9034r.TEL);
        this.f23658b = str;
        this.f23659c = str2;
        this.f23660d = str3;
    }

    /* renamed from: a */
    public String mo32877a() {
        StringBuilder sb = new StringBuilder(20);
        C9033q.m42236a(this.f23658b, sb);
        C9033q.m42236a(this.f23660d, sb);
        return sb.toString();
    }

    /* renamed from: c */
    public String mo32962c() {
        return this.f23658b;
    }

    /* renamed from: d */
    public String mo32963d() {
        return this.f23659c;
    }

    /* renamed from: e */
    public String mo32964e() {
        return this.f23660d;
    }
}
