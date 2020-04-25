package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(serializable = true)
/* renamed from: com.google.common.collect.u3 */
/* compiled from: LexicographicalOrdering */
final class C8215u3<T> extends C8133r4<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: N */
    final C8133r4<? super T> f22034N;

    C8215u3(C8133r4<? super T> r4Var) {
        this.f22034N = r4Var;
    }

    /* renamed from: a */
    public int compare(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator it = iterable2.iterator();
        for (T compare : iterable) {
            if (!it.hasNext()) {
                return 1;
            }
            int compare2 = this.f22034N.compare(compare, it.next());
            if (compare2 != 0) {
                return compare2;
            }
        }
        return it.hasNext() ? -1 : 0;
    }

    public boolean equals(@C5952h Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8215u3)) {
            return false;
        }
        return this.f22034N.equals(((C8215u3) obj).f22034N);
    }

    public int hashCode() {
        return this.f22034N.hashCode() ^ 2075626741;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22034N);
        sb.append(".lexicographical()");
        return sb.toString();
    }
}
