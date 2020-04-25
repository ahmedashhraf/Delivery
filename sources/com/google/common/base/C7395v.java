package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(serializable = true)
/* renamed from: com.google.common.base.v */
/* compiled from: PairwiseEquivalence */
final class C7395v<T> extends C7359j<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    final C7359j<? super T> f20852a;

    C7395v(C7359j<? super T> jVar) {
        this.f20852a = (C7359j) C7397x.m35664a(jVar);
    }

    public boolean equals(@C5952h Object obj) {
        if (!(obj instanceof C7395v)) {
            return false;
        }
        return this.f20852a.equals(((C7395v) obj).f20852a);
    }

    public int hashCode() {
        return this.f20852a.hashCode() ^ 1185147655;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20852a);
        sb.append(".pairwise()");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo29251a(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        do {
            boolean z = false;
            if (!it.hasNext() || !it2.hasNext()) {
                if (!it.hasNext() && !it2.hasNext()) {
                    z = true;
                }
                return z;
            }
        } while (this.f20852a.mo29253b(it.next(), it2.next()));
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo29248a(Iterable<T> iterable) {
        int i = 78721;
        for (T c : iterable) {
            i = (i * 24943) + this.f20852a.mo29254c(c);
        }
        return i;
    }
}
