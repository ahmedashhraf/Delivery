package com.instabug.bug.model;

import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.bug.model.a */
/* compiled from: ExtraReportField */
public class C9277a {

    /* renamed from: f */
    private static transient /* synthetic */ boolean[] f24552f;

    /* renamed from: a */
    private String f24553a;

    /* renamed from: b */
    private CharSequence f24554b;

    /* renamed from: c */
    private CharSequence f24555c;

    /* renamed from: d */
    private String f24556d;

    /* renamed from: e */
    private boolean f24557e;

    public C9277a(CharSequence charSequence, boolean z) {
        boolean[] f = m43411f();
        this.f24554b = charSequence;
        this.f24557e = z;
        f[0] = true;
    }

    /* renamed from: f */
    private static /* synthetic */ boolean[] m43411f() {
        boolean[] zArr = f24552f;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-4475519910046538388L, "com/instabug/bug/model/ExtraReportField", 9);
        f24552f = a;
        return a;
    }

    /* renamed from: a */
    public String mo33546a() {
        boolean[] f = m43411f();
        String str = this.f24553a;
        f[2] = true;
        return str;
    }

    /* renamed from: b */
    public String mo33548b() {
        boolean[] f = m43411f();
        String str = this.f24556d;
        f[5] = true;
        return str;
    }

    /* renamed from: c */
    public CharSequence mo33549c() {
        boolean[] f = m43411f();
        CharSequence charSequence = this.f24554b;
        f[6] = true;
        return charSequence;
    }

    /* renamed from: d */
    public CharSequence mo33550d() {
        boolean[] f = m43411f();
        CharSequence charSequence = this.f24555c;
        f[7] = true;
        return charSequence;
    }

    /* renamed from: e */
    public boolean mo33551e() {
        boolean[] f = m43411f();
        boolean z = this.f24557e;
        f[8] = true;
        return z;
    }

    /* renamed from: a */
    public void mo33547a(String str) {
        boolean[] f = m43411f();
        this.f24556d = str;
        f[3] = true;
    }

    public C9277a(CharSequence charSequence, CharSequence charSequence2, boolean z, String str) {
        boolean[] f = m43411f();
        this.f24554b = charSequence;
        this.f24555c = charSequence2;
        this.f24557e = z;
        this.f24553a = str;
        f[1] = true;
    }
}
