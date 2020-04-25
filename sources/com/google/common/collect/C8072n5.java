package com.google.common.collect;

import java.util.Map.Entry;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.n5 */
/* compiled from: SingletonImmutableBiMap */
final class C8072n5<K, V> extends C8125r2<K, V> {

    /* renamed from: R */
    final transient K f21872R;

    /* renamed from: S */
    final transient V f21873S;

    /* renamed from: T */
    transient C8125r2<V, K> f21874T;

    C8072n5(K k, V v) {
        C8277y.m39485a((Object) k, (Object) v);
        this.f21872R = k;
        this.f21873S = v;
    }

    public boolean containsKey(@C5952h Object obj) {
        return this.f21872R.equals(obj);
    }

    public boolean containsValue(@C5952h Object obj) {
        return this.f21873S.equals(obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C7859g3<Entry<K, V>> mo29642d() {
        return C7859g3.m37499a(C7800f4.m37291a(this.f21872R, this.f21873S));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C7859g3<K> mo30737e() {
        return C7859g3.m37499a(this.f21872R);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo29643f() {
        return false;
    }

    public V get(@C5952h Object obj) {
        if (this.f21872R.equals(obj)) {
            return this.f21873S;
        }
        return null;
    }

    public int size() {
        return 1;
    }

    /* renamed from: k */
    public C8125r2<V, K> m38647k() {
        C8125r2<V, K> r2Var = this.f21874T;
        if (r2Var != null) {
            return r2Var;
        }
        C8072n5 n5Var = new C8072n5(this.f21873S, this.f21872R, this);
        this.f21874T = n5Var;
        return n5Var;
    }

    private C8072n5(K k, V v, C8125r2<V, K> r2Var) {
        this.f21872R = k;
        this.f21873S = v;
        this.f21874T = r2Var;
    }

    C8072n5(Entry<? extends K, ? extends V> entry) {
        this(entry.getKey(), entry.getValue());
    }
}
