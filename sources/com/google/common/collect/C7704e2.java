package com.google.common.collect;

import com.google.common.collect.C7982k4.C7983a;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b(emulated = true)
@C2775a
/* renamed from: com.google.common.collect.e2 */
/* compiled from: ForwardingSortedMultiset */
public abstract class C7704e2<E> extends C8279y1<E> implements C8240v5<E> {

    /* renamed from: com.google.common.collect.e2$a */
    /* compiled from: ForwardingSortedMultiset */
    protected abstract class C7705a extends C8064n0<E> {
        public C7705a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: J */
        public C8240v5<E> mo30126J() {
            return C7704e2.this;
        }
    }

    /* renamed from: com.google.common.collect.e2$b */
    /* compiled from: ForwardingSortedMultiset */
    protected class C7706b extends C8276a<E> {
        public C7706b() {
            super(C7704e2.this);
        }
    }

    protected C7704e2() {
    }

    /* renamed from: B */
    public C8240v5<E> mo30112B() {
        return m36768y().mo30112B();
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public C7983a<E> mo30113H() {
        Iterator it = entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        C7983a aVar = (C7983a) it.next();
        return C8003l4.m38354a(aVar.getElement(), aVar.getCount());
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public C7983a<E> mo30114I() {
        Iterator it = mo30112B().entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        C7983a aVar = (C7983a) it.next();
        return C8003l4.m38354a(aVar.getElement(), aVar.getCount());
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public C7983a<E> mo30115J() {
        Iterator it = entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        C7983a aVar = (C7983a) it.next();
        C7983a<E> a = C8003l4.m38354a(aVar.getElement(), aVar.getCount());
        it.remove();
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public C7983a<E> mo30116K() {
        Iterator it = mo30112B().entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        C7983a aVar = (C7983a) it.next();
        C7983a<E> a = C8003l4.m38354a(aVar.getElement(), aVar.getCount());
        it.remove();
        return a;
    }

    /* renamed from: a */
    public C8240v5<E> mo30117a(E e, C8209u uVar) {
        return m36768y().mo30117a(e, uVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C8240v5<E> mo30120b(E e, C8209u uVar, E e2, C8209u uVar2) {
        return mo30119b(e, uVar).mo30117a(e2, uVar2);
    }

    public Comparator<? super E> comparator() {
        return m36768y().comparator();
    }

    public C7983a<E> firstEntry() {
        return m36768y().firstEntry();
    }

    public C7983a<E> lastEntry() {
        return m36768y().lastEntry();
    }

    public C7983a<E> pollFirstEntry() {
        return m36768y().pollFirstEntry();
    }

    public C7983a<E> pollLastEntry() {
        return m36768y().pollLastEntry();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract C8240v5<E> m36766y();

    /* renamed from: a */
    public C8240v5<E> mo30118a(E e, C8209u uVar, E e2, C8209u uVar2) {
        return m36768y().mo30118a(e, uVar, e2, uVar2);
    }

    /* renamed from: b */
    public C8240v5<E> mo30119b(E e, C8209u uVar) {
        return m36768y().mo30119b(e, uVar);
    }

    /* renamed from: h */
    public SortedSet<E> m36764h() {
        return (SortedSet) super.mo29710h();
    }
}
