package com.google.common.collect;

import java.util.Map.Entry;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.a5 */
/* compiled from: RegularImmutableMap */
final class C7543a5<K, V> extends C8302z2<K, V> {

    /* renamed from: T */
    private static final double f21097T = 1.2d;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final transient C7540a3<K, V>[] f21098Q;

    /* renamed from: R */
    private final transient C7540a3<K, V>[] f21099R;

    /* renamed from: S */
    private final transient int f21100S;

    /* renamed from: com.google.common.collect.a5$b */
    /* compiled from: RegularImmutableMap */
    private class C7545b extends C7556b3<K, V> {
        private C7545b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public C8257x2<Entry<K, V>> mo29646f() {
            return new C8274x4((C8175t2<E>) this, (Object[]) C7543a5.this.f21098Q);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public C8302z2<K, V> mo29648n() {
            return C7543a5.this;
        }

        public C8023l6<Entry<K, V>> iterator() {
            return mo30933e().iterator();
        }
    }

    /* renamed from: com.google.common.collect.a5$c */
    /* compiled from: RegularImmutableMap */
    private static final class C7546c<K, V> extends C7540a3<K, V> {

        /* renamed from: N */
        private final C7540a3<K, V> f21102N;

        C7546c(K k, V v, C7540a3<K, V> a3Var) {
            super(k, v);
            this.f21102N = a3Var;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C7540a3<K, V> mo29638a() {
            return this.f21102N;
        }

        /* access modifiers changed from: 0000 */
        @C5952h
        /* renamed from: d */
        public C7540a3<K, V> mo29639d() {
            return null;
        }

        C7546c(C7540a3<K, V> a3Var, C7540a3<K, V> a3Var2) {
            super(a3Var);
            this.f21102N = a3Var2;
        }
    }

    C7543a5(C7541a<?, ?>... aVarArr) {
        this(aVarArr.length, aVarArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C7859g3<Entry<K, V>> mo29642d() {
        return new C7545b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo29643f() {
        return false;
    }

    public V get(@C5952h Object obj) {
        if (obj == null) {
            return null;
        }
        for (C7540a3<K, V> a3Var = this.f21099R[C8093p2.m38750a(obj.hashCode()) & this.f21100S]; a3Var != null; a3Var = a3Var.mo29638a()) {
            if (obj.equals(a3Var.getKey())) {
                return a3Var.getValue();
            }
        }
        return null;
    }

    public int size() {
        return this.f21098Q.length;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.google.common.collect.a3$a<?, ?>[], code=com.google.common.collect.a3[], for r8v0, types: [com.google.common.collect.a3$a<?, ?>[], com.google.common.collect.a3[]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C7543a5(int r7, com.google.common.collect.C7540a3[] r8) {
        /*
            r6 = this;
            r6.<init>()
            com.google.common.collect.a3[] r0 = r6.m36232a(r7)
            r6.f21098Q = r0
            r0 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            int r0 = com.google.common.collect.C8093p2.m38751a(r7, r0)
            com.google.common.collect.a3[] r1 = r6.m36232a(r0)
            r6.f21099R = r1
            int r0 = r0 + -1
            r6.f21100S = r0
            r0 = 0
        L_0x001d:
            if (r0 >= r7) goto L_0x004b
            r1 = r8[r0]
            java.lang.Object r2 = r1.getKey()
            int r3 = r2.hashCode()
            int r3 = com.google.common.collect.C8093p2.m38750a(r3)
            int r4 = r6.f21100S
            r3 = r3 & r4
            com.google.common.collect.a3<K, V>[] r4 = r6.f21099R
            r4 = r4[r3]
            if (r4 != 0) goto L_0x0037
            goto L_0x003d
        L_0x0037:
            com.google.common.collect.a5$c r5 = new com.google.common.collect.a5$c
            r5.<init>(r1, r4)
            r1 = r5
        L_0x003d:
            com.google.common.collect.a3<K, V>[] r5 = r6.f21099R
            r5[r3] = r1
            com.google.common.collect.a3<K, V>[] r3 = r6.f21098Q
            r3[r0] = r1
            r6.m36231a(r2, r1, r4)
            int r0 = r0 + 1
            goto L_0x001d
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C7543a5.<init>(int, com.google.common.collect.a3$a[]):void");
    }

    /* renamed from: a */
    private void m36231a(K k, C7540a3<K, V> a3Var, C7540a3<K, V> a3Var2) {
        while (a3Var2 != null) {
            C8302z2.m39623a(!k.equals(a3Var2.getKey()), "key", (Entry<?, ?>) a3Var, (Entry<?, ?>) a3Var2);
            a3Var2 = a3Var2.mo29638a();
        }
    }

    /* renamed from: a */
    private C7540a3<K, V>[] m36232a(int i) {
        return new C7540a3[i];
    }

    C7543a5(Entry<?, ?>[] entryArr) {
        int length = entryArr.length;
        this.f21098Q = m36232a(length);
        int a = C8093p2.m38751a(length, f21097T);
        this.f21099R = m36232a(a);
        this.f21100S = a - 1;
        for (int i = 0; i < length; i++) {
            Entry<?, ?> entry = entryArr[i];
            Object key = entry.getKey();
            Object value = entry.getValue();
            C8277y.m39485a(key, value);
            int a2 = C8093p2.m38750a(key.hashCode()) & this.f21100S;
            C7540a3<K, V> a3Var = this.f21099R[a2];
            C7540a3<K, V> aVar = a3Var == null ? new C7541a<>(key, value) : new C7546c<>(key, value, a3Var);
            this.f21099R[a2] = aVar;
            this.f21098Q[i] = aVar;
            m36231a(key, aVar, a3Var);
        }
    }
}
