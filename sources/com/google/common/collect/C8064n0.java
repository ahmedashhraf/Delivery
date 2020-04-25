package com.google.common.collect;

import com.google.common.collect.C7982k4.C7983a;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.n0 */
/* compiled from: DescendingMultiset */
abstract class C8064n0<E> extends C8279y1<E> implements C8240v5<E> {

    /* renamed from: N */
    private transient Set<C7983a<E>> f21858N;

    /* renamed from: a */
    private transient Comparator<? super E> f21859a;

    /* renamed from: b */
    private transient SortedSet<E> f21860b;

    /* renamed from: com.google.common.collect.n0$a */
    /* compiled from: DescendingMultiset */
    class C8065a extends C8016h<E> {
        C8065a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C7982k4<E> mo29820b() {
            return C8064n0.this;
        }

        public Iterator<C7983a<E>> iterator() {
            return C8064n0.this.mo30787I();
        }

        public int size() {
            return C8064n0.this.mo30126J().entrySet().size();
        }
    }

    C8064n0() {
    }

    /* renamed from: B */
    public C8240v5<E> mo30112B() {
        return mo30126J();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public Set<C7983a<E>> mo30877H() {
        return new C8065a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: I */
    public abstract Iterator<C7983a<E>> mo30787I();

    /* access modifiers changed from: 0000 */
    /* renamed from: J */
    public abstract C8240v5<E> mo30126J();

    /* renamed from: a */
    public C8240v5<E> mo30117a(E e, C8209u uVar) {
        return mo30126J().mo30119b(e, uVar).mo30112B();
    }

    /* renamed from: b */
    public C8240v5<E> mo30119b(E e, C8209u uVar) {
        return mo30126J().mo30117a(e, uVar).mo30112B();
    }

    public Comparator<? super E> comparator() {
        Comparator<? super E> comparator = this.f21859a;
        if (comparator != null) {
            return comparator;
        }
        C8133r4 g = C8133r4.m38939b(mo30126J().comparator()).mo30568g();
        this.f21859a = g;
        return g;
    }

    public Set<C7983a<E>> entrySet() {
        Set<C7983a<E>> set = this.f21858N;
        if (set != null) {
            return set;
        }
        Set<C7983a<E>> H = mo30877H();
        this.f21858N = H;
        return H;
    }

    public C7983a<E> firstEntry() {
        return mo30126J().lastEntry();
    }

    public Iterator<E> iterator() {
        return C8003l4.m38365b((C7982k4<E>) this);
    }

    public C7983a<E> lastEntry() {
        return mo30126J().firstEntry();
    }

    public C7983a<E> pollFirstEntry() {
        return mo30126J().pollLastEntry();
    }

    public C7983a<E> pollLastEntry() {
        return mo30126J().pollFirstEntry();
    }

    public Object[] toArray() {
        return mo30759C();
    }

    public String toString() {
        return entrySet().toString();
    }

    /* renamed from: a */
    public C8240v5<E> mo30118a(E e, C8209u uVar, E e2, C8209u uVar2) {
        return mo30126J().mo30118a(e2, uVar2, e, uVar).mo30112B();
    }

    /* renamed from: h */
    public SortedSet<E> m38572h() {
        SortedSet<E> sortedSet = this.f21860b;
        if (sortedSet != null) {
            return sortedSet;
        }
        C8276a aVar = new C8276a(this);
        this.f21860b = aVar;
        return aVar;
    }

    public <T> T[] toArray(T[] tArr) {
        return mo30762a(tArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public C7982k4<E> m38575y() {
        return mo30126J();
    }
}
