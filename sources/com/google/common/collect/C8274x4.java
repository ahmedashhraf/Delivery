package com.google.common.collect;

import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.x4 */
/* compiled from: RegularImmutableAsList */
class C8274x4<E> extends C8106q2<E> {

    /* renamed from: N */
    private final C8175t2<E> f22140N;

    /* renamed from: O */
    private final C8257x2<? extends E> f22141O;

    C8274x4(C8175t2<E> t2Var, C8257x2<? extends E> x2Var) {
        this.f22140N = t2Var;
        this.f22141O = x2Var;
    }

    /* access modifiers changed from: 0000 */
    @C2777c("not present in emulated superclass")
    /* renamed from: a */
    public int mo29839a(Object[] objArr, int i) {
        return this.f22141O.mo29839a(objArr, i);
    }

    public E get(int i) {
        return this.f22141O.get(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public C8175t2<E> mo29826n() {
        return this.f22140N;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public C8257x2<? extends E> mo31243o() {
        return this.f22141O;
    }

    public C8062m6<E> listIterator(int i) {
        return this.f22141O.listIterator(i);
    }

    C8274x4(C8175t2<E> t2Var, Object[] objArr) {
        this(t2Var, C8257x2.m39407a(objArr));
    }
}
