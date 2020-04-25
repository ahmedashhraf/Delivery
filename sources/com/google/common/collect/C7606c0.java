package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b(serializable = true)
/* renamed from: com.google.common.collect.c0 */
/* compiled from: CompoundOrdering */
final class C7606c0<T> extends C8133r4<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: N */
    final C8257x2<Comparator<? super T>> f21188N;

    C7606c0(Comparator<? super T> comparator, Comparator<? super T> comparator2) {
        this.f21188N = C8257x2.m39394a(comparator, comparator2);
    }

    public int compare(T t, T t2) {
        int size = this.f21188N.size();
        for (int i = 0; i < size; i++) {
            int compare = ((Comparator) this.f21188N.get(i)).compare(t, t2);
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7606c0)) {
            return false;
        }
        return this.f21188N.equals(((C7606c0) obj).f21188N);
    }

    public int hashCode() {
        return this.f21188N.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ordering.compound(");
        sb.append(this.f21188N);
        sb.append(")");
        return sb.toString();
    }

    C7606c0(Iterable<? extends Comparator<? super T>> iterable) {
        this.f21188N = C8257x2.m39392a(iterable);
    }
}
