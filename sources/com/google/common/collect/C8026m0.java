package com.google.common.collect;

import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

/* renamed from: com.google.common.collect.m0 */
/* compiled from: DescendingImmutableSortedSet */
class C8026m0<E> extends C8068n3<E> {

    /* renamed from: T */
    private final C8068n3<E> f21804T;

    C8026m0(C8068n3<E> n3Var) {
        super(C8133r4.m38939b(n3Var.comparator()).mo30568g());
        this.f21804T = n3Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C8068n3<E> mo30440b(E e, boolean z) {
        return this.f21804T.mo30547c(e, z).mo30788o();
    }

    /* renamed from: c */
    public E mo30442c(E e) {
        return this.f21804T.mo30445d(e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C8068n3<E> mo30444d(E e, boolean z) {
        return this.f21804T.mo30538a(e, z).mo30788o();
    }

    @C2777c("NavigableSet")
    public C8023l6<E> descendingIterator() {
        return this.f21804T.iterator();
    }

    /* renamed from: e */
    public E mo30448e(E e) {
        return this.f21804T.mo30451f(e);
    }

    /* renamed from: f */
    public E mo30451f(E e) {
        return this.f21804T.mo30448e(e);
    }

    /* access modifiers changed from: 0000 */
    public int indexOf(@C5952h Object obj) {
        int indexOf = this.f21804T.indexOf(obj);
        if (indexOf == -1) {
            return indexOf;
        }
        return (size() - 1) - indexOf;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo29686j() {
        return this.f21804T.mo29686j();
    }

    /* access modifiers changed from: 0000 */
    @C2777c("NavigableSet")
    /* renamed from: n */
    public C8068n3<E> mo30456n() {
        throw new AssertionError("should never be called");
    }

    @C2777c("NavigableSet")
    /* renamed from: o */
    public C8068n3<E> mo30788o() {
        return this.f21804T;
    }

    public int size() {
        return this.f21804T.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C8068n3<E> mo30441b(E e, boolean z, E e2, boolean z2) {
        return this.f21804T.mo30539a(e2, z2, e, z).mo30788o();
    }

    /* renamed from: d */
    public E mo30445d(E e) {
        return this.f21804T.mo30442c(e);
    }

    public C8023l6<E> iterator() {
        return this.f21804T.descendingIterator();
    }
}
