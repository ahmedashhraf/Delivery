package com.google.common.collect;

import com.google.common.base.C7397x;
import com.google.common.collect.C7677d6.C7678a;
import java.util.Map;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: com.google.common.collect.q5 */
/* compiled from: SingletonImmutableTable */
class C8110q5<R, C, V> extends C8094p3<R, C, V> {

    /* renamed from: O */
    final R f21912O;

    /* renamed from: P */
    final C f21913P;

    /* renamed from: Q */
    final V f21914Q;

    C8110q5(R r, C c, V v) {
        this.f21912O = C7397x.m35664a(r);
        this.f21913P = C7397x.m35664a(c);
        this.f21914Q = C7397x.m35664a(v);
    }

    public int size() {
        return 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C7859g3<C7678a<R, C, V>> m38842d() {
        return C7859g3.m37499a(C8094p3.m38754b(this.f21912O, this.f21913P, this.f21914Q));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C8175t2<V> m38844e() {
        return C7859g3.m37499a(this.f21914Q);
    }

    /* renamed from: i */
    public C8302z2<R, V> m38846i(C c) {
        C7397x.m35664a(c);
        return mo29720h(c) ? C8302z2.m39626c(this.f21912O, this.f21914Q) : C8302z2.m39630i();
    }

    /* renamed from: v */
    public C8302z2<R, Map<C, V>> m38848v() {
        return C8302z2.m39626c(this.f21912O, C8302z2.m39626c(this.f21913P, this.f21914Q));
    }

    /* renamed from: w */
    public C8302z2<C, Map<R, V>> m38850w() {
        return C8302z2.m39626c(this.f21913P, C8302z2.m39626c(this.f21912O, this.f21914Q));
    }

    C8110q5(C7678a<R, C, V> aVar) {
        this(aVar.mo29993d(), aVar.mo29992a(), aVar.getValue());
    }
}
