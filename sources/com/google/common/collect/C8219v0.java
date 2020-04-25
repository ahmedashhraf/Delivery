package com.google.common.collect;

import com.google.common.base.C7397x;
import com.google.common.collect.C7982k4.C7983a;
import java.util.Collection;
import java.util.Comparator;
import p201f.p202a.C5952h;

/* renamed from: com.google.common.collect.v0 */
/* compiled from: EmptyImmutableSortedMultiset */
final class C8219v0<E> extends C8000l3<E> {

    /* renamed from: R */
    private final C8068n3<E> f22037R;

    C8219v0(Comparator<? super E> comparator) {
        this.f22037R = C8068n3.m38599a(comparator);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo29839a(Object[] objArr, int i) {
        return i;
    }

    /* renamed from: b */
    public int mo29708b(@C5952h Object obj) {
        return 0;
    }

    public boolean containsAll(Collection<?> collection) {
        return collection.isEmpty();
    }

    /* renamed from: e */
    public C8257x2<E> mo30933e() {
        return C8257x2.m39412m();
    }

    public boolean equals(@C5952h Object obj) {
        if (obj instanceof C7982k4) {
            return ((C7982k4) obj).isEmpty();
        }
        return false;
    }

    public C7983a<E> firstEntry() {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo29686j() {
        return false;
    }

    public C7983a<E> lastEntry() {
        return null;
    }

    public int size() {
        return 0;
    }

    /* renamed from: a */
    public C8000l3<E> m39202a(E e, C8209u uVar) {
        C7397x.m35664a(e);
        C7397x.m35664a(uVar);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C7983a<E> mo29709b(int i) {
        throw new AssertionError("should never be called");
    }

    public C8023l6<E> iterator() {
        return C8178t3.m39086a();
    }

    /* renamed from: b */
    public C8000l3<E> m39206b(E e, C8209u uVar) {
        C7397x.m35664a(e);
        C7397x.m35664a(uVar);
        return this;
    }

    /* renamed from: h */
    public C8068n3<E> m39210h() {
        return this.f22037R;
    }
}
