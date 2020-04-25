package com.fasterxml.jackson.core;

import java.io.Serializable;

/* renamed from: com.fasterxml.jackson.core.o */
/* compiled from: Version */
public class C3804o implements Comparable<C3804o>, Serializable {

    /* renamed from: R */
    private static final C3804o f11853R;
    private static final long serialVersionUID = 1;

    /* renamed from: N */
    protected final int f11854N;

    /* renamed from: O */
    protected final String f11855O;

    /* renamed from: P */
    protected final String f11856P;

    /* renamed from: Q */
    protected final String f11857Q;

    /* renamed from: a */
    protected final int f11858a;

    /* renamed from: b */
    protected final int f11859b;

    static {
        C3804o oVar = new C3804o(0, 0, 0, null, null, null);
        f11853R = oVar;
    }

    @Deprecated
    public C3804o(int i, int i2, int i3, String str) {
        this(i, i2, i3, str, null, null);
    }

    /* renamed from: p */
    public static C3804o m16119p() {
        return f11853R;
    }

    /* renamed from: a */
    public int compareTo(C3804o oVar) {
        if (oVar == this) {
            return 0;
        }
        int compareTo = this.f11855O.compareTo(oVar.f11855O);
        if (compareTo == 0) {
            compareTo = this.f11856P.compareTo(oVar.f11856P);
            if (compareTo == 0) {
                compareTo = this.f11858a - oVar.f11858a;
                if (compareTo == 0) {
                    compareTo = this.f11859b - oVar.f11859b;
                    if (compareTo == 0) {
                        compareTo = this.f11854N - oVar.f11854N;
                    }
                }
            }
        }
        return compareTo;
    }

    /* renamed from: d */
    public String mo16790d() {
        return this.f11856P;
    }

    /* renamed from: e */
    public String mo16791e() {
        return this.f11855O;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != C3804o.class) {
            return false;
        }
        C3804o oVar = (C3804o) obj;
        if (!(oVar.f11858a == this.f11858a && oVar.f11859b == this.f11859b && oVar.f11854N == this.f11854N && oVar.f11856P.equals(this.f11856P) && oVar.f11855O.equals(this.f11855O))) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public int mo16793f() {
        return this.f11858a;
    }

    /* renamed from: g */
    public int mo16794g() {
        return this.f11859b;
    }

    /* renamed from: h */
    public int mo16795h() {
        return this.f11854N;
    }

    public int hashCode() {
        return this.f11856P.hashCode() ^ (((this.f11855O.hashCode() + this.f11858a) - this.f11859b) + this.f11854N);
    }

    /* renamed from: j */
    public boolean mo16797j() {
        String str = this.f11857Q;
        return str != null && str.length() > 0;
    }

    /* renamed from: k */
    public boolean mo16798k() {
        return this == f11853R;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11858a);
        sb.append('.');
        sb.append(this.f11859b);
        sb.append('.');
        sb.append(this.f11854N);
        if (mo16797j()) {
            sb.append('-');
            sb.append(this.f11857Q);
        }
        return sb.toString();
    }

    public C3804o(int i, int i2, int i3, String str, String str2, String str3) {
        this.f11858a = i;
        this.f11859b = i2;
        this.f11854N = i3;
        this.f11857Q = str;
        String str4 = "";
        if (str2 == null) {
            str2 = str4;
        }
        this.f11855O = str2;
        if (str3 != null) {
            str4 = str3;
        }
        this.f11856P = str4;
    }
}
