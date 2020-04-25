package com.google.zxing.p333t.p334a;

/* renamed from: com.google.zxing.t.a.h0 */
/* compiled from: VINParsedResult */
public final class C9021h0 extends C9033q {

    /* renamed from: b */
    private final String f23606b;

    /* renamed from: c */
    private final String f23607c;

    /* renamed from: d */
    private final String f23608d;

    /* renamed from: e */
    private final String f23609e;

    /* renamed from: f */
    private final String f23610f;

    /* renamed from: g */
    private final String f23611g;

    /* renamed from: h */
    private final int f23612h;

    /* renamed from: i */
    private final char f23613i;

    /* renamed from: j */
    private final String f23614j;

    public C9021h0(String str, String str2, String str3, String str4, String str5, String str6, int i, char c, String str7) {
        super(C9034r.VIN);
        this.f23606b = str;
        this.f23607c = str2;
        this.f23608d = str3;
        this.f23609e = str4;
        this.f23610f = str5;
        this.f23611g = str6;
        this.f23612h = i;
        this.f23613i = c;
        this.f23614j = str7;
    }

    /* renamed from: a */
    public String mo32877a() {
        StringBuilder sb = new StringBuilder(50);
        sb.append(this.f23607c);
        sb.append(' ');
        sb.append(this.f23608d);
        sb.append(' ');
        sb.append(this.f23609e);
        sb.append(10);
        String str = this.f23610f;
        if (str != null) {
            sb.append(str);
            sb.append(' ');
        }
        sb.append(this.f23612h);
        sb.append(' ');
        sb.append(this.f23613i);
        sb.append(' ');
        sb.append(this.f23614j);
        sb.append(10);
        return sb.toString();
    }

    /* renamed from: c */
    public String mo32917c() {
        return this.f23610f;
    }

    /* renamed from: d */
    public int mo32918d() {
        return this.f23612h;
    }

    /* renamed from: e */
    public char mo32919e() {
        return this.f23613i;
    }

    /* renamed from: f */
    public String mo32920f() {
        return this.f23614j;
    }

    /* renamed from: g */
    public String mo32921g() {
        return this.f23606b;
    }

    /* renamed from: h */
    public String mo32922h() {
        return this.f23611g;
    }

    /* renamed from: i */
    public String mo32923i() {
        return this.f23608d;
    }

    /* renamed from: j */
    public String mo32924j() {
        return this.f23609e;
    }

    /* renamed from: k */
    public String mo32925k() {
        return this.f23607c;
    }
}
