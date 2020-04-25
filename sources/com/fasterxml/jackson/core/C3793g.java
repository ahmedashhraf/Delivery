package com.fasterxml.jackson.core;

import java.io.Serializable;

/* renamed from: com.fasterxml.jackson.core.g */
/* compiled from: JsonLocation */
public class C3793g implements Serializable {

    /* renamed from: Q */
    public static final C3793g f11836Q;
    private static final long serialVersionUID = 1;

    /* renamed from: N */
    final int f11837N;

    /* renamed from: O */
    final int f11838O;

    /* renamed from: P */
    final Object f11839P;

    /* renamed from: a */
    final long f11840a;

    /* renamed from: b */
    final long f11841b;

    static {
        C3793g gVar = new C3793g("N/A", -1, -1, -1, -1);
        f11836Q = gVar;
    }

    public C3793g(Object obj, long j, int i, int i2) {
        this(obj, -1, j, i, i2);
    }

    /* renamed from: a */
    public long mo16654a() {
        return this.f11840a;
    }

    /* renamed from: d */
    public long mo16655d() {
        return this.f11841b;
    }

    /* renamed from: e */
    public int mo16656e() {
        return this.f11838O;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C3793g)) {
            return false;
        }
        C3793g gVar = (C3793g) obj;
        Object obj2 = this.f11839P;
        if (obj2 == null) {
            if (gVar.f11839P != null) {
                return false;
            }
        } else if (!obj2.equals(gVar.f11839P)) {
            return false;
        }
        if (!(this.f11837N == gVar.f11837N && this.f11838O == gVar.f11838O && this.f11841b == gVar.f11841b && mo16654a() == gVar.mo16654a())) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public int mo16658f() {
        return this.f11837N;
    }

    /* renamed from: g */
    public Object mo16659g() {
        return this.f11839P;
    }

    public int hashCode() {
        Object obj = this.f11839P;
        return ((((obj == null ? 1 : obj.hashCode()) ^ this.f11837N) + this.f11838O) ^ ((int) this.f11841b)) + ((int) this.f11840a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(80);
        sb.append("[Source: ");
        Object obj = this.f11839P;
        if (obj == null) {
            sb.append("UNKNOWN");
        } else {
            sb.append(obj.toString());
        }
        sb.append("; line: ");
        sb.append(this.f11837N);
        sb.append(", column: ");
        sb.append(this.f11838O);
        sb.append(']');
        return sb.toString();
    }

    public C3793g(Object obj, long j, long j2, int i, int i2) {
        this.f11839P = obj;
        this.f11840a = j;
        this.f11841b = j2;
        this.f11837N = i;
        this.f11838O = i2;
    }
}
