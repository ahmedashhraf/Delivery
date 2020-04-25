package com.google.common.collect;

import com.google.common.base.C5827t;
import com.google.common.collect.C7982k4.C7983a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.y1 */
/* compiled from: ForwardingMultiset */
public abstract class C8279y1<E> extends C7997l1<E> implements C7982k4<E> {

    @C2775a
    /* renamed from: com.google.common.collect.y1$a */
    /* compiled from: ForwardingMultiset */
    protected class C8280a extends C8014g<E> {
        public C8280a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C7982k4<E> mo30584b() {
            return C8279y1.this;
        }
    }

    protected C8279y1() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public String mo30760D() {
        return entrySet().toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public int mo31254E() {
        return entrySet().hashCode();
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public Iterator<E> mo31255F() {
        return C8003l4.m38365b((C7982k4<E>) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public int mo31256G() {
        return C8003l4.m38367c(this);
    }

    /* renamed from: a */
    public int mo29818a(Object obj, int i) {
        return m39518y().mo29818a(obj, i);
    }

    /* renamed from: b */
    public int mo29708b(Object obj) {
        return m39518y().mo29708b(obj);
    }

    /* renamed from: c */
    public int mo29894c(E e, int i) {
        return m39518y().mo29894c(e, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo30764d(Collection<?> collection) {
        return C8003l4.m38369c((C7982k4<?>) this, collection);
    }

    public Set<C7983a<E>> entrySet() {
        return m39518y().entrySet();
    }

    public boolean equals(@C5952h Object obj) {
        return obj == this || m39518y().equals(obj);
    }

    /* renamed from: h */
    public Set<E> mo29710h() {
        return m39518y().mo29710h();
    }

    public int hashCode() {
        return m39518y().hashCode();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo30333l(@C5952h Object obj) {
        return mo29708b(obj) > 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo30335m(Object obj) {
        return mo29818a(obj, 1) > 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo31259n(E e) {
        mo29893b(e, 1);
        return true;
    }

    /* access modifiers changed from: protected */
    @C2775a
    /* renamed from: o */
    public int mo31260o(@C5952h Object obj) {
        for (C7983a aVar : entrySet()) {
            if (C5827t.m25562a(aVar.getElement(), obj)) {
                return aVar.getCount();
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo31261p(@C5952h Object obj) {
        return C8003l4.m38360a((C7982k4<?>) this, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract C7982k4<E> m39518y();

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo30767z() {
        C8178t3.m39123c(entrySet().iterator());
    }

    /* renamed from: a */
    public boolean mo29892a(E e, int i, int i2) {
        return m39518y().mo29892a(e, i, i2);
    }

    /* renamed from: b */
    public int mo29893b(E e, int i) {
        return m39518y().mo29893b(e, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo29681c(Collection<?> collection) {
        return C8003l4.m38366b((C7982k4<?>) this, collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo31258d(E e, int i) {
        return C8003l4.m38352a(this, e, i);
    }

    /* access modifiers changed from: protected */
    @C2775a
    /* renamed from: a */
    public boolean mo30761a(Collection<? extends E> collection) {
        return C8003l4.m38362a((C7982k4<E>) this, collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo31257b(E e, int i, int i2) {
        return C8003l4.m38361a(this, e, i, i2);
    }
}
