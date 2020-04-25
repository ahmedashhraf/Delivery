package com.google.common.collect;

import com.google.common.collect.C7982k4.C7983a;
import p201f.p202a.C5952h;

/* renamed from: com.google.common.collect.l0 */
/* compiled from: DescendingImmutableSortedMultiset */
final class C7996l0<E> extends C8000l3<E> {

    /* renamed from: R */
    private final transient C8000l3<E> f21759R;

    C7996l0(C8000l3<E> l3Var) {
        this.f21759R = l3Var;
    }

    public C7983a<E> firstEntry() {
        return this.f21759R.lastEntry();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo29686j() {
        return this.f21759R.mo29686j();
    }

    public C7983a<E> lastEntry() {
        return this.f21759R.firstEntry();
    }

    public int size() {
        return this.f21759R.size();
    }

    /* renamed from: B */
    public C8000l3<E> m38264B() {
        return this.f21759R;
    }

    /* renamed from: a */
    public C8000l3<E> m38266a(E e, C8209u uVar) {
        return this.f21759R.m38329b(e, uVar).m38323B();
    }

    /* renamed from: b */
    public int mo29708b(@C5952h Object obj) {
        return this.f21759R.mo29708b(obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C7983a<E> mo29709b(int i) {
        return (C7983a) this.f21759R.entrySet().mo30933e().mo30925k().get(i);
    }

    /* renamed from: h */
    public C8068n3<E> m38273h() {
        return this.f21759R.m38332h().mo30788o();
    }

    /* renamed from: b */
    public C8000l3<E> m38270b(E e, C8209u uVar) {
        return this.f21759R.m38326a(e, uVar).m38323B();
    }
}
