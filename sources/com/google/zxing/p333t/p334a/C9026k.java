package com.google.zxing.p333t.p334a;

import java.util.Map;

/* renamed from: com.google.zxing.t.a.k */
/* compiled from: ExpandedProductParsedResult */
public final class C9026k extends C9033q {

    /* renamed from: q */
    public static final String f23623q = "KG";

    /* renamed from: r */
    public static final String f23624r = "LB";

    /* renamed from: b */
    private final String f23625b;

    /* renamed from: c */
    private final String f23626c;

    /* renamed from: d */
    private final String f23627d;

    /* renamed from: e */
    private final String f23628e;

    /* renamed from: f */
    private final String f23629f;

    /* renamed from: g */
    private final String f23630g;

    /* renamed from: h */
    private final String f23631h;

    /* renamed from: i */
    private final String f23632i;

    /* renamed from: j */
    private final String f23633j;

    /* renamed from: k */
    private final String f23634k;

    /* renamed from: l */
    private final String f23635l;

    /* renamed from: m */
    private final String f23636m;

    /* renamed from: n */
    private final String f23637n;

    /* renamed from: o */
    private final String f23638o;

    /* renamed from: p */
    private final Map<String, String> f23639p;

    public C9026k(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Map<String, String> map) {
        super(C9034r.PRODUCT);
        this.f23625b = str;
        this.f23626c = str2;
        this.f23627d = str3;
        this.f23628e = str4;
        this.f23629f = str5;
        this.f23630g = str6;
        this.f23631h = str7;
        this.f23632i = str8;
        this.f23633j = str9;
        this.f23634k = str10;
        this.f23635l = str11;
        this.f23636m = str12;
        this.f23637n = str13;
        this.f23638o = str14;
        this.f23639p = map;
    }

    /* renamed from: a */
    private static boolean m42201a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: c */
    public String mo32930c() {
        return this.f23631h;
    }

    /* renamed from: d */
    public String mo32931d() {
        return this.f23632i;
    }

    /* renamed from: e */
    public String mo32932e() {
        return this.f23628e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9026k)) {
            return false;
        }
        C9026k kVar = (C9026k) obj;
        if (!m42201a(this.f23626c, kVar.f23626c) || !m42201a(this.f23627d, kVar.f23627d) || !m42201a(this.f23628e, kVar.f23628e) || !m42201a(this.f23629f, kVar.f23629f) || !m42201a(this.f23631h, kVar.f23631h) || !m42201a(this.f23632i, kVar.f23632i) || !m42201a(this.f23633j, kVar.f23633j) || !m42201a(this.f23634k, kVar.f23634k) || !m42201a(this.f23635l, kVar.f23635l) || !m42201a(this.f23636m, kVar.f23636m) || !m42201a(this.f23637n, kVar.f23637n) || !m42201a(this.f23638o, kVar.f23638o) || !m42201a(this.f23639p, kVar.f23639p)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo32934f() {
        return this.f23630g;
    }

    /* renamed from: g */
    public String mo32935g() {
        return this.f23636m;
    }

    /* renamed from: h */
    public String mo32936h() {
        return this.f23638o;
    }

    public int hashCode() {
        return ((((((((((((m42200a(this.f23626c) ^ 0) ^ m42200a(this.f23627d)) ^ m42200a(this.f23628e)) ^ m42200a(this.f23629f)) ^ m42200a(this.f23631h)) ^ m42200a(this.f23632i)) ^ m42200a(this.f23633j)) ^ m42200a(this.f23634k)) ^ m42200a(this.f23635l)) ^ m42200a(this.f23636m)) ^ m42200a(this.f23637n)) ^ m42200a(this.f23638o)) ^ m42200a(this.f23639p);
    }

    /* renamed from: i */
    public String mo32938i() {
        return this.f23637n;
    }

    /* renamed from: j */
    public String mo32939j() {
        return this.f23626c;
    }

    /* renamed from: k */
    public String mo32940k() {
        return this.f23629f;
    }

    /* renamed from: l */
    public String mo32941l() {
        return this.f23625b;
    }

    /* renamed from: m */
    public String mo32942m() {
        return this.f23627d;
    }

    /* renamed from: n */
    public Map<String, String> mo32943n() {
        return this.f23639p;
    }

    /* renamed from: o */
    public String mo32944o() {
        return this.f23633j;
    }

    /* renamed from: p */
    public String mo32945p() {
        return this.f23635l;
    }

    /* renamed from: q */
    public String mo32946q() {
        return this.f23634k;
    }

    /* renamed from: a */
    private static int m42200a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: a */
    public String mo32877a() {
        return String.valueOf(this.f23625b);
    }
}
