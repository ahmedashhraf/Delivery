package com.google.common.collect;

import com.google.common.base.C7397x;
import java.io.Serializable;
import java.util.Iterator;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b(serializable = true)
/* renamed from: com.google.common.collect.h5 */
/* compiled from: ReverseNaturalOrdering */
final class C7887h5 extends C8133r4<Comparable> implements Serializable {

    /* renamed from: N */
    static final C7887h5 f21612N = new C7887h5();
    private static final long serialVersionUID = 0;

    private C7887h5() {
    }

    private Object readResolve() {
        return f21612N;
    }

    /* renamed from: c */
    public <E extends Comparable> E mo30563b(E e, E e2) {
        return (Comparable) C8071n4.f21871N.mo30558a(e, e2);
    }

    /* renamed from: g */
    public <S extends Comparable> C8133r4<S> mo30568g() {
        return C8133r4.m38943j();
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }

    /* renamed from: d */
    public <E extends Comparable> E m37709d(Iterable<E> iterable) {
        return (Comparable) C8071n4.f21871N.mo30567e(iterable);
    }

    /* renamed from: e */
    public <E extends Comparable> E m37711e(Iterable<E> iterable) {
        return (Comparable) C8071n4.f21871N.mo30566d(iterable);
    }

    /* renamed from: a */
    public int compare(Comparable comparable, Comparable comparable2) {
        C7397x.m35664a(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    /* renamed from: b */
    public <E extends Comparable> E mo30564b(E e, E e2, E e3, E... eArr) {
        return (Comparable) C8071n4.f21871N.mo30559a(e, e2, e3, eArr);
    }

    /* renamed from: b */
    public <E extends Comparable> E m37706b(Iterator<E> it) {
        return (Comparable) C8071n4.f21871N.mo30557a(it);
    }

    /* renamed from: a */
    public <E extends Comparable> E mo30559a(E e, E e2, E e3, E... eArr) {
        return (Comparable) C8071n4.f21871N.mo30564b(e, e2, e3, eArr);
    }

    /* renamed from: b */
    public <E extends Comparable> E mo30558a(E e, E e2) {
        return (Comparable) C8071n4.f21871N.mo30563b(e, e2);
    }

    /* renamed from: a */
    public <E extends Comparable> E m37700a(Iterator<E> it) {
        return (Comparable) C8071n4.f21871N.mo30562b(it);
    }
}
