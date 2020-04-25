package com.google.common.collect;

import com.google.common.base.C7344g0;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(serializable = true)
/* renamed from: com.google.common.collect.l2 */
/* compiled from: HashBasedTable */
public class C7998l2<R, C, V> extends C7580b6<R, C, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: com.google.common.collect.l2$a */
    /* compiled from: HashBasedTable */
    private static class C7999a<C, V> implements C7344g0<Map<C, V>>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final int f21760a;

        C7999a(int i) {
            this.f21760a = i;
        }

        public Map<C, V> get() {
            return C7800f4.m37318b(this.f21760a);
        }
    }

    C7998l2(Map<R, Map<C, V>> map, C7999a<C, V> aVar) {
        super(map, aVar);
    }

    /* renamed from: b */
    public static <R, C, V> C7998l2<R, C, V> m38289b(C7677d6<? extends R, ? extends C, ? extends V> d6Var) {
        C7998l2<R, C, V> i = m38290i();
        i.mo29989a(d6Var);
        return i;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo29713a(Object obj, Object obj2, Object obj3) {
        return super.mo29713a(obj, obj2, obj3);
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public boolean containsValue(@C5952h Object obj) {
        return super.containsValue(obj);
    }

    /* renamed from: d */
    public boolean mo29718d(@C5952h Object obj, @C5952h Object obj2) {
        return super.mo29718d(obj, obj2);
    }

    public boolean equals(@C5952h Object obj) {
        return super.equals(obj);
    }

    /* renamed from: h */
    public boolean mo29720h(@C5952h Object obj) {
        return super.mo29720h(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ Map mo29721i(Object obj) {
        return super.mo29721i(obj);
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* renamed from: j */
    public boolean mo29723j(@C5952h Object obj) {
        return super.mo29723j(obj);
    }

    /* renamed from: k */
    public /* bridge */ /* synthetic */ Map mo29724k(Object obj) {
        return super.mo29724k(obj);
    }

    public V remove(@C5952h Object obj, @C5952h Object obj2) {
        return super.remove(obj, obj2);
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    /* renamed from: t */
    public /* bridge */ /* synthetic */ Set mo29727t() {
        return super.mo29727t();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* renamed from: u */
    public /* bridge */ /* synthetic */ Set mo29728u() {
        return super.mo29728u();
    }

    /* renamed from: v */
    public /* bridge */ /* synthetic */ Map mo29650v() {
        return super.mo29650v();
    }

    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    /* renamed from: w */
    public /* bridge */ /* synthetic */ Map mo29730w() {
        return super.mo29730w();
    }

    /* renamed from: x */
    public /* bridge */ /* synthetic */ Set mo29651x() {
        return super.mo29651x();
    }

    /* renamed from: i */
    public static <R, C, V> C7998l2<R, C, V> m38290i() {
        return new C7998l2<>(new HashMap(), new C7999a(0));
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo29989a(C7677d6 d6Var) {
        super.mo29989a(d6Var);
    }

    /* renamed from: a */
    public static <R, C, V> C7998l2<R, C, V> m38288a(int i, int i2) {
        C8277y.m39484a(i2, "expectedCellsPerRow");
        return new C7998l2<>(C7800f4.m37318b(i), new C7999a(i2));
    }

    /* renamed from: b */
    public V mo29715b(@C5952h Object obj, @C5952h Object obj2) {
        return super.mo29715b(obj, obj2);
    }
}
