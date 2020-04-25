package com.google.zxing.p333t.p334a;

/* renamed from: com.google.zxing.t.a.m */
/* compiled from: GeoParsedResult */
public final class C9029m extends C9033q {

    /* renamed from: b */
    private final double f23640b;

    /* renamed from: c */
    private final double f23641c;

    /* renamed from: d */
    private final double f23642d;

    /* renamed from: e */
    private final String f23643e;

    C9029m(double d, double d2, double d3, String str) {
        super(C9034r.GEO);
        this.f23640b = d;
        this.f23641c = d2;
        this.f23642d = d3;
        this.f23643e = str;
    }

    /* renamed from: a */
    public String mo32877a() {
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.f23640b);
        String str = ", ";
        sb.append(str);
        sb.append(this.f23641c);
        if (this.f23642d > 0.0d) {
            sb.append(str);
            sb.append(this.f23642d);
            sb.append('m');
        }
        if (this.f23643e != null) {
            sb.append(" (");
            sb.append(this.f23643e);
            sb.append(')');
        }
        return sb.toString();
    }

    /* renamed from: c */
    public double mo32947c() {
        return this.f23642d;
    }

    /* renamed from: d */
    public String mo32948d() {
        StringBuilder sb = new StringBuilder();
        sb.append("geo:");
        sb.append(this.f23640b);
        sb.append(',');
        sb.append(this.f23641c);
        if (this.f23642d > 0.0d) {
            sb.append(',');
            sb.append(this.f23642d);
        }
        if (this.f23643e != null) {
            sb.append('?');
            sb.append(this.f23643e);
        }
        return sb.toString();
    }

    /* renamed from: e */
    public double mo32949e() {
        return this.f23640b;
    }

    /* renamed from: f */
    public double mo32950f() {
        return this.f23641c;
    }

    /* renamed from: g */
    public String mo32951g() {
        return this.f23643e;
    }
}
