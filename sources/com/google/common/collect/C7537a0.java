package com.google.common.collect;

import com.google.common.base.C7397x;
import java.io.Serializable;
import java.util.Comparator;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(serializable = true)
/* renamed from: com.google.common.collect.a0 */
/* compiled from: ComparatorOrdering */
final class C7537a0<T> extends C8133r4<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: N */
    final Comparator<T> f21094N;

    C7537a0(Comparator<T> comparator) {
        this.f21094N = (Comparator) C7397x.m35664a(comparator);
    }

    public int compare(T t, T t2) {
        return this.f21094N.compare(t, t2);
    }

    public boolean equals(@C5952h Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7537a0)) {
            return false;
        }
        return this.f21094N.equals(((C7537a0) obj).f21094N);
    }

    public int hashCode() {
        return this.f21094N.hashCode();
    }

    public String toString() {
        return this.f21094N.toString();
    }
}
