package com.google.common.collect;

import com.google.common.base.C7397x;
import com.google.common.collect.C7677d6.C7678a;
import com.google.common.collect.C8302z2.C8303a;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5967b;

@C2776b
@C5967b
/* renamed from: com.google.common.collect.k0 */
/* compiled from: DenseImmutableTable */
final class C7972k0<R, C, V> extends C7868g5<R, C, V> {
    /* access modifiers changed from: private */

    /* renamed from: O */
    public final C8302z2<R, Integer> f21724O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public final C8302z2<C, Integer> f21725P;

    /* renamed from: Q */
    private final C8302z2<R, Map<C, V>> f21726Q;

    /* renamed from: R */
    private final C8302z2<C, Map<R, V>> f21727R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public final int[] f21728S = new int[this.f21724O.size()];
    /* access modifiers changed from: private */

    /* renamed from: T */
    public final int[] f21729T = new int[this.f21725P.size()];
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final V[][] f21730U;

    /* renamed from: V */
    private final int[] f21731V;

    /* renamed from: W */
    private final int[] f21732W;

    /* renamed from: com.google.common.collect.k0$b */
    /* compiled from: DenseImmutableTable */
    private final class C7974b extends C7976d<R, V> {

        /* renamed from: R */
        private final int f21733R;

        C7974b(int i) {
            super(C7972k0.this.f21729T[i]);
            this.f21733R = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public V mo30735b(int i) {
            return C7972k0.this.f21730U[i][this.f21733R];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public boolean mo29643f() {
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public C8302z2<R, Integer> mo29983h() {
            return C7972k0.this.f21724O;
        }
    }

    /* renamed from: com.google.common.collect.k0$c */
    /* compiled from: DenseImmutableTable */
    private final class C7975c extends C7976d<C, Map<R, V>> {
        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public boolean mo29643f() {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public C8302z2<C, Integer> mo29983h() {
            return C7972k0.this.f21725P;
        }

        private C7975c() {
            super(C7972k0.this.f21729T.length);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Map<R, V> m38207b(int i) {
            return new C7974b(i);
        }
    }

    /* renamed from: com.google.common.collect.k0$d */
    /* compiled from: DenseImmutableTable */
    private static abstract class C7976d<K, V> extends C8302z2<K, V> {

        /* renamed from: Q */
        private final int f21736Q;

        /* renamed from: com.google.common.collect.k0$d$a */
        /* compiled from: DenseImmutableTable */
        class C7977a extends C7556b3<K, V> {

            /* renamed from: com.google.common.collect.k0$d$a$a */
            /* compiled from: DenseImmutableTable */
            class C7978a extends C7603c<Entry<K, V>> {

                /* renamed from: N */
                private int f21738N = -1;

                /* renamed from: O */
                private final int f21739O = C7976d.this.mo29983h().size();

                C7978a() {
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public Entry<K, V> m38218b() {
                    int i = this.f21738N;
                    while (true) {
                        this.f21738N = i + 1;
                        int i2 = this.f21738N;
                        if (i2 >= this.f21739O) {
                            return (Entry) mo29793c();
                        }
                        Object b = C7976d.this.mo30735b(i2);
                        if (b != null) {
                            return C7800f4.m37291a(C7976d.this.mo30736a(this.f21738N), b);
                        }
                        i = this.f21738N;
                    }
                }
            }

            C7977a() {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: n */
            public C8302z2<K, V> mo29648n() {
                return C7976d.this;
            }

            public C8023l6<Entry<K, V>> iterator() {
                return new C7978a();
            }
        }

        C7976d(int i) {
            this.f21736Q = i;
        }

        /* renamed from: j */
        private boolean m38210j() {
            return this.f21736Q == mo29983h().size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public K mo30736a(int i) {
            return mo29983h().keySet().mo30933e().get(i);
        }

        /* access modifiers changed from: 0000 */
        @C5952h
        /* renamed from: b */
        public abstract V mo30735b(int i);

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C7859g3<Entry<K, V>> mo29642d() {
            return new C7977a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public C7859g3<K> mo30737e() {
            return m38210j() ? mo29983h().keySet() : super.mo30737e();
        }

        public V get(@C5952h Object obj) {
            Integer num = (Integer) mo29983h().get(obj);
            if (num == null) {
                return null;
            }
            return mo30735b(num.intValue());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public abstract C8302z2<K, Integer> mo29983h();

        public int size() {
            return this.f21736Q;
        }
    }

    /* renamed from: com.google.common.collect.k0$e */
    /* compiled from: DenseImmutableTable */
    private final class C7979e extends C7976d<C, V> {

        /* renamed from: R */
        private final int f21741R;

        C7979e(int i) {
            super(C7972k0.this.f21728S[i]);
            this.f21741R = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public V mo30735b(int i) {
            return C7972k0.this.f21730U[this.f21741R][i];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public boolean mo29643f() {
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public C8302z2<C, Integer> mo29983h() {
            return C7972k0.this.f21725P;
        }
    }

    /* renamed from: com.google.common.collect.k0$f */
    /* compiled from: DenseImmutableTable */
    private final class C7980f extends C7976d<R, Map<C, V>> {
        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public boolean mo29643f() {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public C8302z2<R, Integer> mo29983h() {
            return C7972k0.this.f21724O;
        }

        private C7980f() {
            super(C7972k0.this.f21728S.length);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Map<C, V> m38223b(int i) {
            return new C7979e(i);
        }
    }

    C7972k0(C8257x2<C7678a<R, C, V>> x2Var, C7859g3<R> g3Var, C7859g3<C> g3Var2) {
        this.f21730U = (Object[][]) Array.newInstance(Object.class, new int[]{g3Var.size(), g3Var2.size()});
        this.f21724O = m38190a(g3Var);
        this.f21725P = m38190a(g3Var2);
        int[] iArr = new int[x2Var.size()];
        int[] iArr2 = new int[x2Var.size()];
        for (int i = 0; i < x2Var.size(); i++) {
            C7678a aVar = (C7678a) x2Var.get(i);
            Object d = aVar.mo29993d();
            Object a = aVar.mo29992a();
            int intValue = ((Integer) this.f21724O.get(d)).intValue();
            int intValue2 = ((Integer) this.f21725P.get(a)).intValue();
            C7397x.m35672a(this.f21730U[intValue][intValue2] == null, "duplicate key: (%s, %s)", d, a);
            this.f21730U[intValue][intValue2] = aVar.getValue();
            int[] iArr3 = this.f21728S;
            iArr3[intValue] = iArr3[intValue] + 1;
            int[] iArr4 = this.f21729T;
            iArr4[intValue2] = iArr4[intValue2] + 1;
            iArr[i] = intValue;
            iArr2[i] = intValue2;
        }
        this.f21731V = iArr;
        this.f21732W = iArr2;
        this.f21726Q = new C7980f();
        this.f21727R = new C7975c();
    }

    public int size() {
        return this.f21731V.length;
    }

    /* renamed from: a */
    private static <E> C8302z2<E, Integer> m38190a(C7859g3<E> g3Var) {
        C8303a g = C8302z2.m39628g();
        Iterator it = g3Var.iterator();
        int i = 0;
        while (it.hasNext()) {
            g.mo30687a(it.next(), Integer.valueOf(i));
            i++;
        }
        return g.mo30690a();
    }

    /* renamed from: b */
    public V mo29715b(@C5952h Object obj, @C5952h Object obj2) {
        Integer num = (Integer) this.f21724O.get(obj);
        Integer num2 = (Integer) this.f21725P.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.f21730U[num.intValue()][num2.intValue()];
    }

    /* renamed from: v */
    public C8302z2<R, Map<C, V>> m38200v() {
        return this.f21726Q;
    }

    /* renamed from: w */
    public C8302z2<C, Map<R, V>> m38202w() {
        return this.f21727R;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public V mo30513b(int i) {
        return this.f21730U[this.f21731V[i]][this.f21732W[i]];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C7678a<R, C, V> mo30512a(int i) {
        int i2 = this.f21731V[i];
        int i3 = this.f21732W[i];
        return C8094p3.m38754b(m38785x().mo30933e().get(i2), m38779u().mo30933e().get(i3), this.f21730U[i2][i3]);
    }
}
