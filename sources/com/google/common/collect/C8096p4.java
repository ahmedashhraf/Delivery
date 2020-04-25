package com.google.common.collect;

import java.io.Serializable;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(serializable = true)
/* renamed from: com.google.common.collect.p4 */
/* compiled from: NullsLastOrdering */
final class C8096p4<T> extends C8133r4<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: N */
    final C8133r4<? super T> f21898N;

    C8096p4(C8133r4<? super T> r4Var) {
        this.f21898N = r4Var;
    }

    public int compare(@C5952h T t, @C5952h T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return 1;
        }
        if (t2 == null) {
            return -1;
        }
        return this.f21898N.compare(t, t2);
    }

    /* renamed from: d */
    public <S extends T> C8133r4<S> mo30916d() {
        return this.f21898N.mo30916d();
    }

    /* renamed from: e */
    public <S extends T> C8133r4<S> mo30917e() {
        return this;
    }

    public boolean equals(@C5952h Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8096p4)) {
            return false;
        }
        return this.f21898N.equals(((C8096p4) obj).f21898N);
    }

    /* renamed from: g */
    public <S extends T> C8133r4<S> mo30568g() {
        return this.f21898N.mo30568g().mo30916d();
    }

    public int hashCode() {
        return this.f21898N.hashCode() ^ -921210296;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21898N);
        sb.append(".nullsLast()");
        return sb.toString();
    }
}
