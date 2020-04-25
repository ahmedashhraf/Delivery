package com.google.common.collect;

import com.google.common.base.C7397x;
import java.io.Serializable;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b(serializable = true)
/* renamed from: com.google.common.collect.n4 */
/* compiled from: NaturalOrdering */
final class C8071n4 extends C8133r4<Comparable> implements Serializable {

    /* renamed from: N */
    static final C8071n4 f21871N = new C8071n4();
    private static final long serialVersionUID = 0;

    private C8071n4() {
    }

    private Object readResolve() {
        return f21871N;
    }

    /* renamed from: a */
    public int compare(Comparable comparable, Comparable comparable2) {
        C7397x.m35664a(comparable);
        C7397x.m35664a(comparable2);
        return comparable.compareTo(comparable2);
    }

    /* renamed from: g */
    public <S extends Comparable> C8133r4<S> mo30568g() {
        return C7887h5.f21612N;
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
