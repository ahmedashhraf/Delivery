package com.google.common.collect;

import java.io.Serializable;
import java.util.List;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(serializable = true)
/* renamed from: com.google.common.collect.p */
/* compiled from: AllEqualOrdering */
final class C8088p extends C8133r4<Object> implements Serializable {

    /* renamed from: N */
    static final C8088p f21889N = new C8088p();
    private static final long serialVersionUID = 0;

    C8088p() {
    }

    private Object readResolve() {
        return f21889N;
    }

    /* renamed from: a */
    public <E> C8257x2<E> mo30930a(Iterable<E> iterable) {
        return C8257x2.m39392a(iterable);
    }

    public int compare(@C5952h Object obj, @C5952h Object obj2) {
        return 0;
    }

    /* renamed from: f */
    public <E> List<E> mo30931f(Iterable<E> iterable) {
        return C8309z3.m39665b(iterable);
    }

    /* renamed from: g */
    public <S> C8133r4<S> mo30568g() {
        return this;
    }

    public String toString() {
        return "Ordering.allEqual()";
    }
}
