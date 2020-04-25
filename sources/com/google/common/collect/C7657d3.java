package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map.Entry;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.d3 */
/* compiled from: ImmutableMapValues */
final class C7657d3<K, V> extends C8175t2<V> {

    /* renamed from: b */
    private final C8302z2<K, V> f21241b;

    /* renamed from: com.google.common.collect.d3$a */
    /* compiled from: ImmutableMapValues */
    class C7658a extends C8106q2<V> {

        /* renamed from: N */
        final /* synthetic */ C8257x2 f21242N;

        C7658a(C8257x2 x2Var) {
            this.f21242N = x2Var;
        }

        public V get(int i) {
            return ((Entry) this.f21242N.get(i)).getValue();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public C8175t2<V> mo29826n() {
            return C7657d3.this;
        }
    }

    @C2777c("serialization")
    /* renamed from: com.google.common.collect.d3$b */
    /* compiled from: ImmutableMapValues */
    private static class C7659b<V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final C8302z2<?, V> f21244a;

        C7659b(C8302z2<?, V> z2Var) {
            this.f21244a = z2Var;
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return this.f21244a.values();
        }
    }

    C7657d3(C8302z2<K, V> z2Var) {
        this.f21241b = z2Var;
    }

    public boolean contains(@C5952h Object obj) {
        return obj != null && C8178t3.m39108a((Iterator<?>) iterator(), obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C8257x2<V> mo29646f() {
        return new C7658a(this.f21241b.entrySet().mo30933e());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo29686j() {
        return true;
    }

    public int size() {
        return this.f21241b.size();
    }

    /* access modifiers changed from: 0000 */
    @C2777c("serialization")
    public Object writeReplace() {
        return new C7659b(this.f21241b);
    }

    public C8023l6<V> iterator() {
        return C7800f4.m37280a(this.f21241b.entrySet().iterator());
    }
}
