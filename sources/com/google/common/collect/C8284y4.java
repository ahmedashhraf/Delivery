package com.google.common.collect;

import java.io.Serializable;
import java.util.Map.Entry;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.y4 */
/* compiled from: RegularImmutableBiMap */
class C8284y4<K, V> extends C8125r2<K, V> {

    /* renamed from: X */
    static final double f22146X = 1.2d;

    /* renamed from: R */
    private final transient C7540a3<K, V>[] f22147R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public final transient C7540a3<K, V>[] f22148S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public final transient C7540a3<K, V>[] f22149T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final transient int f22150U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final transient int f22151V;

    /* renamed from: W */
    private transient C8125r2<V, K> f22152W;

    /* renamed from: com.google.common.collect.y4$a */
    /* compiled from: RegularImmutableBiMap */
    class C8285a extends C7556b3<K, V> {
        C8285a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public C8257x2<Entry<K, V>> mo29646f() {
            return new C8274x4((C8175t2<E>) this, (Object[]) C8284y4.this.f22149T);
        }

        public int hashCode() {
            return C8284y4.this.f22151V;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public boolean mo29841k() {
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public C8302z2<K, V> mo29648n() {
            return C8284y4.this;
        }

        public C8023l6<Entry<K, V>> iterator() {
            return mo30933e().iterator();
        }
    }

    /* renamed from: com.google.common.collect.y4$b */
    /* compiled from: RegularImmutableBiMap */
    private final class C8286b extends C8125r2<V, K> {

        /* renamed from: com.google.common.collect.y4$b$a */
        /* compiled from: RegularImmutableBiMap */
        final class C8287a extends C7556b3<V, K> {

            /* renamed from: com.google.common.collect.y4$b$a$a */
            /* compiled from: RegularImmutableBiMap */
            class C8288a extends C8106q2<Entry<V, K>> {
                C8288a() {
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: n */
                public C8175t2<Entry<V, K>> mo29826n() {
                    return C8287a.this;
                }

                public Entry<V, K> get(int i) {
                    C7540a3 a3Var = C8284y4.this.f22149T[i];
                    return C7800f4.m37291a(a3Var.getValue(), a3Var.getKey());
                }
            }

            C8287a() {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: f */
            public C8257x2<Entry<V, K>> mo29646f() {
                return new C8288a();
            }

            public int hashCode() {
                return C8284y4.this.f22151V;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: k */
            public boolean mo29841k() {
                return true;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: n */
            public C8302z2<V, K> mo29648n() {
                return C8286b.this;
            }

            public C8023l6<Entry<V, K>> iterator() {
                return mo30933e().iterator();
            }
        }

        private C8286b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C7859g3<Entry<V, K>> mo29642d() {
            return new C8287a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public boolean mo29643f() {
            return false;
        }

        public K get(@C5952h Object obj) {
            if (obj == null) {
                return null;
            }
            for (C7540a3 a3Var = C8284y4.this.f22148S[C8093p2.m38750a(obj.hashCode()) & C8284y4.this.f22150U]; a3Var != null; a3Var = a3Var.mo29639d()) {
                if (obj.equals(a3Var.getValue())) {
                    return a3Var.getKey();
                }
            }
            return null;
        }

        public int size() {
            return m39574k().size();
        }

        /* access modifiers changed from: 0000 */
        public Object writeReplace() {
            return new C8289c(C8284y4.this);
        }

        /* synthetic */ C8286b(C8284y4 y4Var, C8285a aVar) {
            this();
        }

        /* renamed from: k */
        public C8125r2<K, V> m39574k() {
            return C8284y4.this;
        }
    }

    /* renamed from: com.google.common.collect.y4$c */
    /* compiled from: RegularImmutableBiMap */
    private static class C8289c<K, V> implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: a */
        private final C8125r2<K, V> f22157a;

        C8289c(C8125r2<K, V> r2Var) {
            this.f22157a = r2Var;
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return this.f22157a.m38923k();
        }
    }

    /* renamed from: com.google.common.collect.y4$d */
    /* compiled from: RegularImmutableBiMap */
    private static final class C8290d<K, V> extends C7540a3<K, V> {
        @C5952h

        /* renamed from: N */
        private final C7540a3<K, V> f22158N;
        @C5952h

        /* renamed from: O */
        private final C7540a3<K, V> f22159O;

        C8290d(K k, V v, @C5952h C7540a3<K, V> a3Var, @C5952h C7540a3<K, V> a3Var2) {
            super(k, v);
            this.f22158N = a3Var;
            this.f22159O = a3Var2;
        }

        /* access modifiers changed from: 0000 */
        @C5952h
        /* renamed from: a */
        public C7540a3<K, V> mo29638a() {
            return this.f22158N;
        }

        /* access modifiers changed from: 0000 */
        @C5952h
        /* renamed from: d */
        public C7540a3<K, V> mo29639d() {
            return this.f22159O;
        }

        C8290d(C7540a3<K, V> a3Var, @C5952h C7540a3<K, V> a3Var2, @C5952h C7540a3<K, V> a3Var3) {
            super(a3Var);
            this.f22158N = a3Var2;
            this.f22159O = a3Var3;
        }
    }

    C8284y4(C7541a<?, ?>... aVarArr) {
        this(aVarArr.length, aVarArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo29643f() {
        return false;
    }

    @C5952h
    public V get(@C5952h Object obj) {
        if (obj == null) {
            return null;
        }
        for (C7540a3<K, V> a3Var = this.f22147R[C8093p2.m38750a(obj.hashCode()) & this.f22150U]; a3Var != null; a3Var = a3Var.mo29638a()) {
            if (obj.equals(a3Var.getKey())) {
                return a3Var.getValue();
            }
        }
        return null;
    }

    public int size() {
        return this.f22149T.length;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.google.common.collect.a3$a<?, ?>[], code=com.google.common.collect.a3<K, V>[], for r19v0, types: [com.google.common.collect.a3$a<?, ?>[], com.google.common.collect.a3<K, V>[]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C8284y4(int r18, com.google.common.collect.C7540a3<K, V>[] r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r17.<init>()
            r2 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            int r2 = com.google.common.collect.C8093p2.m38751a(r1, r2)
            int r3 = r2 + -1
            r0.f22150U = r3
            com.google.common.collect.a3[] r3 = m39559a(r2)
            com.google.common.collect.a3[] r2 = m39559a(r2)
            com.google.common.collect.a3[] r4 = m39559a(r18)
            r5 = 0
            r6 = 0
        L_0x0022:
            if (r5 >= r1) goto L_0x0099
            r7 = r19[r5]
            java.lang.Object r8 = r7.getKey()
            java.lang.Object r9 = r7.getValue()
            int r10 = r8.hashCode()
            int r11 = r9.hashCode()
            int r12 = com.google.common.collect.C8093p2.m38750a(r10)
            int r13 = r0.f22150U
            r12 = r12 & r13
            int r13 = com.google.common.collect.C8093p2.m38750a(r11)
            int r14 = r0.f22150U
            r13 = r13 & r14
            r14 = r3[r12]
            r15 = r14
        L_0x0047:
            if (r15 == 0) goto L_0x0063
            java.lang.Object r1 = r15.getKey()
            boolean r1 = r8.equals(r1)
            r1 = r1 ^ 1
            r16 = r8
            java.lang.String r8 = "key"
            com.google.common.collect.C8302z2.m39623a(r1, r8, r7, r15)
            com.google.common.collect.a3 r15 = r15.mo29638a()
            r1 = r18
            r8 = r16
            goto L_0x0047
        L_0x0063:
            r1 = r2[r13]
            r8 = r1
        L_0x0066:
            if (r8 == 0) goto L_0x0080
            java.lang.Object r15 = r8.getValue()
            boolean r15 = r9.equals(r15)
            r15 = r15 ^ 1
            r16 = r9
            java.lang.String r9 = "value"
            com.google.common.collect.C8302z2.m39623a(r15, r9, r7, r8)
            com.google.common.collect.a3 r8 = r8.mo29639d()
            r9 = r16
            goto L_0x0066
        L_0x0080:
            if (r14 != 0) goto L_0x0085
            if (r1 != 0) goto L_0x0085
            goto L_0x008b
        L_0x0085:
            com.google.common.collect.y4$d r8 = new com.google.common.collect.y4$d
            r8.<init>(r7, r14, r1)
            r7 = r8
        L_0x008b:
            r3[r12] = r7
            r2[r13] = r7
            r4[r5] = r7
            r1 = r10 ^ r11
            int r6 = r6 + r1
            int r5 = r5 + 1
            r1 = r18
            goto L_0x0022
        L_0x0099:
            r0.f22147R = r3
            r0.f22148S = r2
            r0.f22149T = r4
            r0.f22151V = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C8284y4.<init>(int, com.google.common.collect.a3$a[]):void");
    }

    /* renamed from: a */
    private static <K, V> C7540a3<K, V>[] m39559a(int i) {
        return new C7540a3[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C7859g3<Entry<K, V>> mo29642d() {
        return new C8285a();
    }

    /* renamed from: k */
    public C8125r2<V, K> m39567k() {
        C8125r2<V, K> r2Var = this.f22152W;
        if (r2Var != null) {
            return r2Var;
        }
        C8286b bVar = new C8286b(this, null);
        this.f22152W = bVar;
        return bVar;
    }

    C8284y4(Entry<?, ?>[] entryArr) {
        C8284y4 y4Var = this;
        Entry<?, ?>[] entryArr2 = entryArr;
        int length = entryArr2.length;
        int a = C8093p2.m38751a(length, f22146X);
        y4Var.f22150U = a - 1;
        C7540a3<K, V>[] a2 = m39559a(a);
        C7540a3<K, V>[] a3 = m39559a(a);
        C7540a3<K, V>[] a4 = m39559a(length);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Entry<?, ?> entry = entryArr2[i];
            Object key = entry.getKey();
            Object value = entry.getValue();
            C8277y.m39485a(key, value);
            int hashCode = key.hashCode();
            int hashCode2 = value.hashCode();
            int a5 = C8093p2.m38750a(hashCode) & y4Var.f22150U;
            int a6 = C8093p2.m38750a(hashCode2) & y4Var.f22150U;
            C7540a3<K, V> a3Var = a2[a5];
            C7540a3<K, V> a3Var2 = a3Var;
            while (a3Var2 != null) {
                int i3 = length;
                C8302z2.m39623a(!key.equals(a3Var2.getKey()), "key", entry, (Entry<?, ?>) a3Var2);
                a3Var2 = a3Var2.mo29638a();
                length = i3;
            }
            int i4 = length;
            C7540a3<K, V> a3Var3 = a3[a6];
            C7540a3<K, V> a3Var4 = a3Var3;
            while (a3Var4 != null) {
                int i5 = i2;
                C8302z2.m39623a(!value.equals(a3Var4.getValue()), "value", entry, (Entry<?, ?>) a3Var4);
                a3Var4 = a3Var4.mo29639d();
                i2 = i5;
            }
            int i6 = i2;
            C7540a3<K, V> aVar = (a3Var == null && a3Var3 == null) ? new C7541a<>(key, value) : new C8290d<>(key, value, a3Var, a3Var3);
            a2[a5] = aVar;
            a3[a6] = aVar;
            a4[i] = aVar;
            i2 = i6 + (hashCode ^ hashCode2);
            i++;
            y4Var = this;
            entryArr2 = entryArr;
            length = i4;
        }
        int i7 = i2;
        y4Var.f22147R = a2;
        y4Var.f22148S = a3;
        y4Var.f22149T = a4;
        y4Var.f22151V = i7;
    }
}
