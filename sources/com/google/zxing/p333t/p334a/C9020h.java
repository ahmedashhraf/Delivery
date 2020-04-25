package com.google.zxing.p333t.p334a;

/* renamed from: com.google.zxing.t.a.h */
/* compiled from: EmailAddressParsedResult */
public final class C9020h extends C9033q {

    /* renamed from: b */
    private final String[] f23601b;

    /* renamed from: c */
    private final String[] f23602c;

    /* renamed from: d */
    private final String[] f23603d;

    /* renamed from: e */
    private final String f23604e;

    /* renamed from: f */
    private final String f23605f;

    C9020h(String str) {
        this(new String[]{str}, null, null, null, null);
    }

    /* renamed from: a */
    public String mo32877a() {
        StringBuilder sb = new StringBuilder(30);
        C9033q.m42237a(this.f23601b, sb);
        C9033q.m42237a(this.f23602c, sb);
        C9033q.m42237a(this.f23603d, sb);
        C9033q.m42236a(this.f23604e, sb);
        C9033q.m42236a(this.f23605f, sb);
        return sb.toString();
    }

    /* renamed from: c */
    public String[] mo32910c() {
        return this.f23603d;
    }

    /* renamed from: d */
    public String mo32911d() {
        return this.f23605f;
    }

    /* renamed from: e */
    public String[] mo32912e() {
        return this.f23602c;
    }

    @Deprecated
    /* renamed from: f */
    public String mo32913f() {
        String[] strArr = this.f23601b;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        return strArr[0];
    }

    @Deprecated
    /* renamed from: g */
    public String mo32914g() {
        return "mailto:";
    }

    /* renamed from: h */
    public String mo32915h() {
        return this.f23604e;
    }

    /* renamed from: i */
    public String[] mo32916i() {
        return this.f23601b;
    }

    C9020h(String[] strArr, String[] strArr2, String[] strArr3, String str, String str2) {
        super(C9034r.EMAIL_ADDRESS);
        this.f23601b = strArr;
        this.f23602c = strArr2;
        this.f23603d = strArr3;
        this.f23604e = str;
        this.f23605f = str2;
    }
}
