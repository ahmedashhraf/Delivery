package com.google.common.collect;

import com.google.common.collect.C7982k4.C7983a;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.x5 */
/* compiled from: SortedMultisets */
final class C8275x5 {

    /* renamed from: com.google.common.collect.x5$a */
    /* compiled from: SortedMultisets */
    static class C8276a<E> extends C8014g<E> implements SortedSet<E> {

        /* renamed from: a */
        private final C8240v5<E> f22142a;

        C8276a(C8240v5<E> v5Var) {
            this.f22142a = v5Var;
        }

        public Comparator<? super E> comparator() {
            return mo30584b().comparator();
        }

        public E first() {
            return C8275x5.m39481c(mo30584b().firstEntry());
        }

        public SortedSet<E> headSet(E e) {
            return mo30584b().mo30117a(e, C8209u.OPEN).mo29710h();
        }

        public E last() {
            return C8275x5.m39481c(mo30584b().lastEntry());
        }

        public SortedSet<E> subSet(E e, E e2) {
            return mo30584b().mo30118a(e, C8209u.CLOSED, e2, C8209u.OPEN).mo29710h();
        }

        public SortedSet<E> tailSet(E e) {
            return mo30584b().mo30119b(e, C8209u.CLOSED).mo29710h();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C8240v5<E> m39483b() {
            return this.f22142a;
        }
    }

    private C8275x5() {
    }

    /* renamed from: b */
    private static <E> E m39480b(@C5952h C7983a<E> aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.getElement();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static <E> E m39481c(C7983a<E> aVar) {
        if (aVar != null) {
            return aVar.getElement();
        }
        throw new NoSuchElementException();
    }
}
