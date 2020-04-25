package com.google.common.collect;

import java.io.Serializable;
import java.util.Map.Entry;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.c3 */
/* compiled from: ImmutableMapKeySet */
final class C7618c3<K, V> extends C7859g3<K> {

    /* renamed from: P */
    private final C8302z2<K, V> f21203P;

    /* renamed from: com.google.common.collect.c3$a */
    /* compiled from: ImmutableMapKeySet */
    class C7619a extends C8106q2<K> {

        /* renamed from: N */
        final /* synthetic */ C8257x2 f21204N;

        C7619a(C8257x2 x2Var) {
            this.f21204N = x2Var;
        }

        public K get(int i) {
            return ((Entry) this.f21204N.get(i)).getKey();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public C8175t2<K> mo29826n() {
            return C7618c3.this;
        }
    }

    @C2777c("serialization")
    /* renamed from: com.google.common.collect.c3$b */
    /* compiled from: ImmutableMapKeySet */
    private static class C7620b<K> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final C8302z2<K, ?> f21206a;

        C7620b(C8302z2<K, ?> z2Var) {
            this.f21206a = z2Var;
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return this.f21206a.keySet();
        }
    }

    C7618c3(C8302z2<K, V> z2Var) {
        this.f21203P = z2Var;
    }

    public boolean contains(@C5952h Object obj) {
        return this.f21203P.containsKey(obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C8257x2<K> mo29646f() {
        return new C7619a(this.f21203P.entrySet().mo30933e());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo29686j() {
        return true;
    }

    public int size() {
        return this.f21203P.size();
    }

    /* access modifiers changed from: 0000 */
    @C2777c("serialization")
    public Object writeReplace() {
        return new C7620b(this.f21203P);
    }

    public C8023l6<K> iterator() {
        return mo30933e().iterator();
    }
}
