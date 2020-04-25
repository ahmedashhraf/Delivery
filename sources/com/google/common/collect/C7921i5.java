package com.google.common.collect;

import com.google.common.base.C7397x;
import java.io.Serializable;
import java.util.Iterator;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(serializable = true)
/* renamed from: com.google.common.collect.i5 */
/* compiled from: ReverseOrdering */
final class C7921i5<T> extends C8133r4<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: N */
    final C8133r4<? super T> f21660N;

    C7921i5(C8133r4<? super T> r4Var) {
        this.f21660N = (C8133r4) C7397x.m35664a(r4Var);
    }

    /* renamed from: a */
    public <E extends T> E mo30558a(E e, E e2) {
        return this.f21660N.mo30563b(e, e2);
    }

    /* renamed from: b */
    public <E extends T> E mo30563b(E e, E e2) {
        return this.f21660N.mo30558a(e, e2);
    }

    public int compare(T t, T t2) {
        return this.f21660N.compare(t2, t);
    }

    /* renamed from: d */
    public <E extends T> E mo30566d(Iterable<E> iterable) {
        return this.f21660N.mo30567e(iterable);
    }

    /* renamed from: e */
    public <E extends T> E mo30567e(Iterable<E> iterable) {
        return this.f21660N.mo30566d(iterable);
    }

    public boolean equals(@C5952h Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7921i5)) {
            return false;
        }
        return this.f21660N.equals(((C7921i5) obj).f21660N);
    }

    /* renamed from: g */
    public <S extends T> C8133r4<S> mo30568g() {
        return this.f21660N;
    }

    public int hashCode() {
        return -this.f21660N.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21660N);
        sb.append(".reverse()");
        return sb.toString();
    }

    /* renamed from: a */
    public <E extends T> E mo30559a(E e, E e2, E e3, E... eArr) {
        return this.f21660N.mo30564b(e, e2, e3, eArr);
    }

    /* renamed from: b */
    public <E extends T> E mo30564b(E e, E e2, E e3, E... eArr) {
        return this.f21660N.mo30559a(e, e2, e3, eArr);
    }

    /* renamed from: a */
    public <E extends T> E mo30557a(Iterator<E> it) {
        return this.f21660N.mo30562b(it);
    }

    /* renamed from: b */
    public <E extends T> E mo30562b(Iterator<E> it) {
        return this.f21660N.mo30557a(it);
    }
}
