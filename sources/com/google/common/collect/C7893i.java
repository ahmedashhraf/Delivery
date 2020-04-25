package com.google.common.collect;

import com.google.common.base.C5827t;
import com.google.common.collect.C7982k4.C7983a;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.i */
/* compiled from: AbstractMultiset */
abstract class C7893i<E> extends AbstractCollection<E> implements C7982k4<E> {

    /* renamed from: a */
    private transient Set<E> f21624a;

    /* renamed from: b */
    private transient Set<C7983a<E>> f21625b;

    /* renamed from: com.google.common.collect.i$a */
    /* compiled from: AbstractMultiset */
    class C7894a extends C8014g<E> {
        C7894a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C7982k4<E> mo30584b() {
            return C7893i.this;
        }
    }

    /* renamed from: com.google.common.collect.i$b */
    /* compiled from: AbstractMultiset */
    class C7895b extends C8016h<E> {
        C7895b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C7982k4<E> mo29820b() {
            return C7893i.this;
        }

        public Iterator<C7983a<E>> iterator() {
            return C7893i.this.mo30101k();
        }

        public int size() {
            return C7893i.this.mo30100j();
        }
    }

    C7893i() {
    }

    /* renamed from: a */
    public int mo29818a(@C5952h Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public boolean add(@C5952h E e) {
        mo29893b(e, 1);
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        return C8003l4.m38362a((C7982k4<E>) this, collection);
    }

    /* renamed from: b */
    public int mo29708b(@C5952h Object obj) {
        for (C7983a aVar : entrySet()) {
            if (C5827t.m25562a(aVar.getElement(), obj)) {
                return aVar.getCount();
            }
        }
        return 0;
    }

    /* renamed from: c */
    public int mo29894c(@C5952h E e, int i) {
        return C8003l4.m38352a(this, e, i);
    }

    public void clear() {
        C8178t3.m39123c(mo30101k());
    }

    public boolean contains(@C5952h Object obj) {
        return mo29708b(obj) > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public Set<E> mo30097e() {
        return new C7894a();
    }

    public Set<C7983a<E>> entrySet() {
        Set<C7983a<E>> set = this.f21625b;
        if (set != null) {
            return set;
        }
        Set<C7983a<E>> f = mo30583f();
        this.f21625b = f;
        return f;
    }

    public boolean equals(@C5952h Object obj) {
        return C8003l4.m38360a((C7982k4<?>) this, obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public Set<C7983a<E>> mo30583f() {
        return new C7895b();
    }

    /* renamed from: h */
    public Set<E> mo29710h() {
        Set<E> set = this.f21624a;
        if (set != null) {
            return set;
        }
        Set<E> e = mo30097e();
        this.f21624a = e;
        return e;
    }

    public int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    public Iterator<E> iterator() {
        return C8003l4.m38365b((C7982k4<E>) this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public abstract int mo30100j();

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public abstract Iterator<C7983a<E>> mo30101k();

    public boolean remove(@C5952h Object obj) {
        return mo29818a(obj, 1) > 0;
    }

    public boolean removeAll(Collection<?> collection) {
        return C8003l4.m38366b((C7982k4<?>) this, collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return C8003l4.m38369c((C7982k4<?>) this, collection);
    }

    public int size() {
        return C8003l4.m38367c(this);
    }

    public String toString() {
        return entrySet().toString();
    }

    /* renamed from: a */
    public boolean mo29892a(@C5952h E e, int i, int i2) {
        return C8003l4.m38361a(this, e, i, i2);
    }

    /* renamed from: b */
    public int mo29893b(@C5952h E e, int i) {
        throw new UnsupportedOperationException();
    }
}
