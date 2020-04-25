package com.google.common.collect;

import com.google.common.base.C7397x;
import com.google.common.collect.C7982k4.C7983a;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.m */
/* compiled from: AbstractSortedMultiset */
abstract class C8024m<E> extends C7893i<E> implements C8240v5<E> {
    @C5841k2

    /* renamed from: N */
    final Comparator<? super E> f21801N;

    /* renamed from: O */
    private transient C8240v5<E> f21802O;

    /* renamed from: com.google.common.collect.m$a */
    /* compiled from: AbstractSortedMultiset */
    class C8025a extends C8064n0<E> {
        C8025a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: I */
        public Iterator<C7983a<E>> mo30787I() {
            return C8024m.this.mo30718m();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: J */
        public C8240v5<E> mo30126J() {
            return C8024m.this;
        }

        public Iterator<E> iterator() {
            return C8024m.this.descendingIterator();
        }
    }

    C8024m() {
        this(C8133r4.m38943j());
    }

    /* renamed from: B */
    public C8240v5<E> mo30112B() {
        C8240v5<E> v5Var = this.f21802O;
        if (v5Var != null) {
            return v5Var;
        }
        C8240v5<E> l = mo30786l();
        this.f21802O = l;
        return l;
    }

    /* renamed from: a */
    public C8240v5<E> mo30118a(@C5952h E e, C8209u uVar, @C5952h E e2, C8209u uVar2) {
        C7397x.m35664a(uVar);
        C7397x.m35664a(uVar2);
        return mo30119b(e, uVar).mo30117a(e2, uVar2);
    }

    public Comparator<? super E> comparator() {
        return this.f21801N;
    }

    /* access modifiers changed from: 0000 */
    public Iterator<E> descendingIterator() {
        return C8003l4.m38365b((C7982k4<E>) mo30112B());
    }

    public C7983a<E> firstEntry() {
        Iterator k = mo30101k();
        if (k.hasNext()) {
            return (C7983a) k.next();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public C8240v5<E> mo30786l() {
        return new C8025a();
    }

    public C7983a<E> lastEntry() {
        Iterator m = mo30718m();
        if (m.hasNext()) {
            return (C7983a) m.next();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public abstract Iterator<C7983a<E>> mo30718m();

    public C7983a<E> pollFirstEntry() {
        Iterator k = mo30101k();
        if (!k.hasNext()) {
            return null;
        }
        C7983a aVar = (C7983a) k.next();
        C7983a<E> a = C8003l4.m38354a(aVar.getElement(), aVar.getCount());
        k.remove();
        return a;
    }

    public C7983a<E> pollLastEntry() {
        Iterator m = mo30718m();
        if (!m.hasNext()) {
            return null;
        }
        C7983a aVar = (C7983a) m.next();
        C7983a<E> a = C8003l4.m38354a(aVar.getElement(), aVar.getCount());
        m.remove();
        return a;
    }

    C8024m(Comparator<? super E> comparator) {
        this.f21801N = (Comparator) C7397x.m35664a(comparator);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public SortedSet<E> m38429e() {
        return new C8276a(this);
    }

    /* renamed from: h */
    public SortedSet<E> m38431h() {
        return (SortedSet) super.mo29710h();
    }
}
