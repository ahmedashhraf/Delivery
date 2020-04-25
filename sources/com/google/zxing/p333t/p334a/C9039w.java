package com.google.zxing.p333t.p334a;

import kotlin.p217i1.C14662d0;

/* renamed from: com.google.zxing.t.a.w */
/* compiled from: SMSParsedResult */
public final class C9039w extends C9033q {

    /* renamed from: b */
    private final String[] f23654b;

    /* renamed from: c */
    private final String[] f23655c;

    /* renamed from: d */
    private final String f23656d;

    /* renamed from: e */
    private final String f23657e;

    public C9039w(String str, String str2, String str3, String str4) {
        super(C9034r.SMS);
        this.f23654b = new String[]{str};
        this.f23655c = new String[]{str2};
        this.f23656d = str3;
        this.f23657e = str4;
    }

    /* renamed from: a */
    public String mo32877a() {
        StringBuilder sb = new StringBuilder(100);
        C9033q.m42237a(this.f23654b, sb);
        C9033q.m42236a(this.f23656d, sb);
        C9033q.m42236a(this.f23657e, sb);
        return sb.toString();
    }

    /* renamed from: c */
    public String mo32957c() {
        return this.f23657e;
    }

    /* renamed from: d */
    public String[] mo32958d() {
        return this.f23654b;
    }

    /* renamed from: e */
    public String mo32959e() {
        StringBuilder sb = new StringBuilder();
        sb.append("sms:");
        boolean z = false;
        boolean z2 = true;
        for (int i = 0; i < this.f23654b.length; i++) {
            if (z2) {
                z2 = false;
            } else {
                sb.append(',');
            }
            sb.append(this.f23654b[i]);
            String[] strArr = this.f23655c;
            if (!(strArr == null || strArr[i] == null)) {
                sb.append(";via=");
                sb.append(this.f23655c[i]);
            }
        }
        boolean z3 = this.f23657e != null;
        if (this.f23656d != null) {
            z = true;
        }
        if (z3 || z) {
            sb.append('?');
            if (z3) {
                sb.append("body=");
                sb.append(this.f23657e);
            }
            if (z) {
                if (z3) {
                    sb.append(C14662d0.f42852c);
                }
                sb.append("subject=");
                sb.append(this.f23656d);
            }
        }
        return sb.toString();
    }

    /* renamed from: f */
    public String mo32960f() {
        return this.f23656d;
    }

    /* renamed from: g */
    public String[] mo32961g() {
        return this.f23655c;
    }

    public C9039w(String[] strArr, String[] strArr2, String str, String str2) {
        super(C9034r.SMS);
        this.f23654b = strArr;
        this.f23655c = strArr2;
        this.f23656d = str;
        this.f23657e = str2;
    }
}
