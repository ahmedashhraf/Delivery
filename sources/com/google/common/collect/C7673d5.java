package com.google.common.collect;

import com.google.common.base.C7397x;
import java.util.Map.Entry;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.d5 */
/* compiled from: RegularImmutableSortedMap */
final class C7673d5<K, V> extends C7933j3<K, V> {

    /* renamed from: T */
    private final transient C7846f5<K> f21264T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final transient C8257x2<V> f21265U;

    /* renamed from: com.google.common.collect.d5$b */
    /* compiled from: RegularImmutableSortedMap */
    private class C7675b extends C7556b3<K, V> {

        /* renamed from: com.google.common.collect.d5$b$a */
        /* compiled from: RegularImmutableSortedMap */
        class C7676a extends C8106q2<Entry<K, V>> {

            /* renamed from: N */
            private final C8257x2<K> f21267N = C7673d5.this.keySet().mo30933e();

            C7676a() {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: n */
            public C8175t2<Entry<K, V>> mo29826n() {
                return C7675b.this;
            }

            public Entry<K, V> get(int i) {
                return C7800f4.m37291a(this.f21267N.get(i), C7673d5.this.f21265U.get(i));
            }
        }

        private C7675b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public C8257x2<Entry<K, V>> mo29646f() {
            return new C7676a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public C8302z2<K, V> mo29648n() {
            return C7673d5.this;
        }

        public C8023l6<Entry<K, V>> iterator() {
            return mo30933e().iterator();
        }
    }

    C7673d5(C7846f5<K> f5Var, C8257x2<V> x2Var) {
        this.f21264T = f5Var;
        this.f21265U = x2Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C7859g3<Entry<K, V>> mo29642d() {
        return new C7675b();
    }

    public V get(@C5952h Object obj) {
        int indexOf = this.f21264T.indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        return this.f21265U.get(indexOf);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public C7933j3<K, V> mo29983h() {
        return new C7673d5((C7846f5) this.f21264T.mo30788o(), this.f21265U.mo30925k(), this);
    }

    public C7933j3<K, V> headMap(K k, boolean z) {
        return m36653a(0, this.f21264T.mo30447e(C7397x.m35664a(k), z));
    }

    public C7933j3<K, V> tailMap(K k, boolean z) {
        return m36653a(this.f21264T.mo30450f(C7397x.m35664a(k), z), size());
    }

    /* renamed from: a */
    private C7933j3<K, V> m36653a(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i == i2) {
            return C7933j3.m37952a(comparator());
        }
        return C7933j3.m37946a(this.f21264T.mo30439a(i, i2), this.f21265U.subList(i, i2));
    }

    public C8175t2<V> values() {
        return this.f21265U;
    }

    public C8068n3<K> keySet() {
        return this.f21264T;
    }

    C7673d5(C7846f5<K> f5Var, C8257x2<V> x2Var, C7933j3<K, V> j3Var) {
        super(j3Var);
        this.f21264T = f5Var;
        this.f21265U = x2Var;
    }
}
