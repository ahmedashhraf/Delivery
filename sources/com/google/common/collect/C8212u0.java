package com.google.common.collect;

import com.google.common.base.C7397x;
import java.util.Comparator;
import java.util.Map.Entry;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.u0 */
/* compiled from: EmptyImmutableSortedMap */
final class C8212u0<K, V> extends C7933j3<K, V> {

    /* renamed from: T */
    private final transient C8068n3<K> f22031T;

    C8212u0(Comparator<? super K> comparator) {
        this.f22031T = C8068n3.m38599a(comparator);
    }

    /* renamed from: a */
    public C7882h3<K, V> mo30950a() {
        return C7882h3.m37652s();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C7859g3<Entry<K, V>> mo29642d() {
        throw new AssertionError("should never be called");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo29643f() {
        return false;
    }

    public V get(@C5952h Object obj) {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public C7933j3<K, V> mo29983h() {
        return new C8212u0(C8133r4.m38939b(comparator()).mo30568g(), this);
    }

    public C7933j3<K, V> headMap(K k, boolean z) {
        C7397x.m35664a(k);
        return this;
    }

    public boolean isEmpty() {
        return true;
    }

    public int size() {
        return 0;
    }

    public C7933j3<K, V> tailMap(K k, boolean z) {
        C7397x.m35664a(k);
        return this;
    }

    public String toString() {
        return "{}";
    }

    public C7859g3<Entry<K, V>> entrySet() {
        return C7859g3.m37512m();
    }

    public C8175t2<V> values() {
        return C8257x2.m39412m();
    }

    C8212u0(Comparator<? super K> comparator, C7933j3<K, V> j3Var) {
        super(j3Var);
        this.f22031T = C8068n3.m38599a(comparator);
    }

    public C8068n3<K> keySet() {
        return this.f22031T;
    }
}
