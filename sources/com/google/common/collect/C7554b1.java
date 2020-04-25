package com.google.common.collect;

import com.google.common.collect.C8302z2.C8303a;
import java.io.Serializable;
import java.util.List;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(serializable = true)
/* renamed from: com.google.common.collect.b1 */
/* compiled from: ExplicitOrdering */
final class C7554b1<T> extends C8133r4<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: N */
    final C8302z2<T, Integer> f21110N;

    C7554b1(List<T> list) {
        this(m36284b(list));
    }

    /* renamed from: a */
    private int m36283a(T t) {
        Integer num = (Integer) this.f21110N.get(t);
        if (num != null) {
            return num.intValue();
        }
        throw new C8137c(t);
    }

    /* renamed from: b */
    private static <T> C8302z2<T, Integer> m36284b(List<T> list) {
        C8303a g = C8302z2.m39628g();
        int i = 0;
        for (T a : list) {
            int i2 = i + 1;
            g.mo30687a(a, Integer.valueOf(i));
            i = i2;
        }
        return g.mo30690a();
    }

    public int compare(T t, T t2) {
        return m36283a(t) - m36283a(t2);
    }

    public boolean equals(@C5952h Object obj) {
        if (!(obj instanceof C7554b1)) {
            return false;
        }
        return this.f21110N.equals(((C7554b1) obj).f21110N);
    }

    public int hashCode() {
        return this.f21110N.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ordering.explicit(");
        sb.append(this.f21110N.keySet());
        sb.append(")");
        return sb.toString();
    }

    C7554b1(C8302z2<T, Integer> z2Var) {
        this.f21110N = z2Var;
    }
}
