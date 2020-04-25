package com.fasterxml.jackson.core;

import p205i.p489f.C14066c;

/* renamed from: com.fasterxml.jackson.core.i */
/* compiled from: JsonStreamContext */
public abstract class C3798i {

    /* renamed from: c */
    protected static final int f11848c = 0;

    /* renamed from: d */
    protected static final int f11849d = 1;

    /* renamed from: e */
    protected static final int f11850e = 2;

    /* renamed from: a */
    protected int f11851a;

    /* renamed from: b */
    protected int f11852b;

    protected C3798i() {
    }

    /* renamed from: a */
    public final int mo16735a() {
        int i = this.f11852b;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* renamed from: b */
    public abstract String mo16736b();

    /* renamed from: c */
    public final int mo16737c() {
        return this.f11852b + 1;
    }

    /* renamed from: d */
    public abstract C3798i mo16738d();

    /* renamed from: e */
    public final String mo16739e() {
        int i = this.f11851a;
        if (i == 0) {
            return C14066c.f41321F;
        }
        if (i != 1) {
            return i != 2 ? "?" : "OBJECT";
        }
        return "ARRAY";
    }

    /* renamed from: f */
    public final boolean mo16740f() {
        return this.f11851a == 1;
    }

    /* renamed from: g */
    public final boolean mo16741g() {
        return this.f11851a == 2;
    }

    /* renamed from: h */
    public final boolean mo16742h() {
        return this.f11851a == 0;
    }
}
