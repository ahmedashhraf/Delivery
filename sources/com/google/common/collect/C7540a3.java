package com.google.common.collect;

import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2777c("unnecessary")
/* renamed from: com.google.common.collect.a3 */
/* compiled from: ImmutableMapEntry */
abstract class C7540a3<K, V> extends C8214u2<K, V> {

    /* renamed from: com.google.common.collect.a3$a */
    /* compiled from: ImmutableMapEntry */
    static final class C7541a<K, V> extends C7540a3<K, V> {
        C7541a(C7540a3<K, V> a3Var) {
            super(a3Var);
        }

        /* access modifiers changed from: 0000 */
        @C5952h
        /* renamed from: a */
        public C7540a3<K, V> mo29638a() {
            return null;
        }

        /* access modifiers changed from: 0000 */
        @C5952h
        /* renamed from: d */
        public C7540a3<K, V> mo29639d() {
            return null;
        }

        C7541a(K k, V v) {
            super(k, v);
        }
    }

    C7540a3(K k, V v) {
        super(k, v);
        C8277y.m39485a((Object) k, (Object) v);
    }

    /* access modifiers changed from: 0000 */
    @C5952h
    /* renamed from: a */
    public abstract C7540a3<K, V> mo29638a();

    /* access modifiers changed from: 0000 */
    @C5952h
    /* renamed from: d */
    public abstract C7540a3<K, V> mo29639d();

    C7540a3(C7540a3<K, V> a3Var) {
        super(a3Var.getKey(), a3Var.getValue());
    }
}
