package com.google.common.collect;

import com.google.common.collect.C7677d6.C7678a;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: com.google.common.collect.h2 */
/* compiled from: ForwardingTable */
public abstract class C7881h2<R, C, V> extends C8301z1 implements C7677d6<R, C, V> {
    protected C7881h2() {
    }

    /* renamed from: a */
    public V mo29713a(R r, C c, V v) {
        return m37640y().mo29713a(r, c, v);
    }

    /* renamed from: b */
    public V mo29715b(Object obj, Object obj2) {
        return m37640y().mo29715b(obj, obj2);
    }

    public void clear() {
        m37640y().clear();
    }

    public boolean containsValue(Object obj) {
        return m37640y().containsValue(obj);
    }

    /* renamed from: d */
    public boolean mo29718d(Object obj, Object obj2) {
        return m37640y().mo29718d(obj, obj2);
    }

    public boolean equals(Object obj) {
        return obj == this || m37640y().equals(obj);
    }

    /* renamed from: h */
    public boolean mo29720h(Object obj) {
        return m37640y().mo29720h(obj);
    }

    public int hashCode() {
        return m37640y().hashCode();
    }

    /* renamed from: i */
    public Map<R, V> mo29721i(C c) {
        return m37640y().mo29721i(c);
    }

    public boolean isEmpty() {
        return m37640y().isEmpty();
    }

    /* renamed from: j */
    public boolean mo29723j(Object obj) {
        return m37640y().mo29723j(obj);
    }

    /* renamed from: k */
    public Map<C, V> mo29724k(R r) {
        return m37640y().mo29724k(r);
    }

    public V remove(Object obj, Object obj2) {
        return m37640y().remove(obj, obj2);
    }

    public int size() {
        return m37640y().size();
    }

    /* renamed from: t */
    public Set<C7678a<R, C, V>> mo29727t() {
        return m37640y().mo29727t();
    }

    /* renamed from: u */
    public Set<C> mo29728u() {
        return m37640y().mo29728u();
    }

    /* renamed from: v */
    public Map<R, Map<C, V>> mo29650v() {
        return m37640y().mo29650v();
    }

    public Collection<V> values() {
        return m37640y().values();
    }

    /* renamed from: w */
    public Map<C, Map<R, V>> mo29730w() {
        return m37640y().mo29730w();
    }

    /* renamed from: x */
    public Set<R> mo29651x() {
        return m37640y().mo29651x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract C7677d6<R, C, V> m37640y();

    /* renamed from: a */
    public void mo29989a(C7677d6<? extends R, ? extends C, ? extends V> d6Var) {
        m37640y().mo29989a(d6Var);
    }
}
