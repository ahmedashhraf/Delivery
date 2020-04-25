package com.google.common.collect;

import java.io.Serializable;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(serializable = true)
/* renamed from: com.google.common.collect.o4 */
/* compiled from: NullsFirstOrdering */
final class C8085o4<T> extends C8133r4<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: N */
    final C8133r4<? super T> f21886N;

    C8085o4(C8133r4<? super T> r4Var) {
        this.f21886N = r4Var;
    }

    public int compare(@C5952h T t, @C5952h T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return this.f21886N.compare(t, t2);
    }

    /* renamed from: d */
    public <S extends T> C8133r4<S> mo30916d() {
        return this;
    }

    /* renamed from: e */
    public <S extends T> C8133r4<S> mo30917e() {
        return this.f21886N.mo30917e();
    }

    public boolean equals(@C5952h Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8085o4)) {
            return false;
        }
        return this.f21886N.equals(((C8085o4) obj).f21886N);
    }

    /* renamed from: g */
    public <S extends T> C8133r4<S> mo30568g() {
        return this.f21886N.mo30568g().mo30917e();
    }

    public int hashCode() {
        return this.f21886N.hashCode() ^ 957692532;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21886N);
        sb.append(".nullsFirst()");
        return sb.toString();
    }
}
