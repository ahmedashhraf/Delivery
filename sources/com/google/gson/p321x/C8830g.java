package com.google.gson.p321x;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.google.gson.x.g */
/* compiled from: LinkedHashTreeMap */
public final class C8830g<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: T */
    private static final Comparator<Comparable> f23148T = new C8831a();

    /* renamed from: U */
    static final /* synthetic */ boolean f23149U = false;

    /* renamed from: N */
    final C8839g<K, V> f23150N;

    /* renamed from: O */
    int f23151O;

    /* renamed from: P */
    int f23152P;

    /* renamed from: Q */
    int f23153Q;

    /* renamed from: R */
    private C8834d f23154R;

    /* renamed from: S */
    private C8836e f23155S;

    /* renamed from: a */
    Comparator<? super K> f23156a;

    /* renamed from: b */
    C8839g<K, V>[] f23157b;

    /* renamed from: com.google.gson.x.g$a */
    /* compiled from: LinkedHashTreeMap */
    static class C8831a implements Comparator<Comparable> {
        C8831a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: com.google.gson.x.g$b */
    /* compiled from: LinkedHashTreeMap */
    static final class C8832b<K, V> {

        /* renamed from: a */
        private C8839g<K, V> f23158a;

        /* renamed from: b */
        private int f23159b;

        /* renamed from: c */
        private int f23160c;

        /* renamed from: d */
        private int f23161d;

        C8832b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo32536a(int i) {
            this.f23159b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.f23161d = 0;
            this.f23160c = 0;
            this.f23158a = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo32537a(C8839g<K, V> gVar) {
            gVar.f23171N = null;
            gVar.f23178a = null;
            gVar.f23179b = null;
            gVar.f23177T = 1;
            int i = this.f23159b;
            if (i > 0) {
                int i2 = this.f23161d;
                if ((i2 & 1) == 0) {
                    this.f23161d = i2 + 1;
                    this.f23159b = i - 1;
                    this.f23160c++;
                }
            }
            gVar.f23178a = this.f23158a;
            this.f23158a = gVar;
            this.f23161d++;
            int i3 = this.f23159b;
            if (i3 > 0) {
                int i4 = this.f23161d;
                if ((i4 & 1) == 0) {
                    this.f23161d = i4 + 1;
                    this.f23159b = i3 - 1;
                    this.f23160c++;
                }
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.f23161d & i6) == i6) {
                    int i7 = this.f23160c;
                    if (i7 == 0) {
                        C8839g<K, V> gVar2 = this.f23158a;
                        C8839g<K, V> gVar3 = gVar2.f23178a;
                        C8839g<K, V> gVar4 = gVar3.f23178a;
                        gVar3.f23178a = gVar4.f23178a;
                        this.f23158a = gVar3;
                        gVar3.f23179b = gVar4;
                        gVar3.f23171N = gVar2;
                        gVar3.f23177T = gVar2.f23177T + 1;
                        gVar4.f23178a = gVar3;
                        gVar2.f23178a = gVar3;
                    } else if (i7 == 1) {
                        C8839g<K, V> gVar5 = this.f23158a;
                        C8839g<K, V> gVar6 = gVar5.f23178a;
                        this.f23158a = gVar6;
                        gVar6.f23171N = gVar5;
                        gVar6.f23177T = gVar5.f23177T + 1;
                        gVar5.f23178a = gVar6;
                        this.f23160c = 0;
                    } else if (i7 == 2) {
                        this.f23160c = 0;
                    }
                    i5 *= 2;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C8839g<K, V> mo32535a() {
            C8839g<K, V> gVar = this.f23158a;
            if (gVar.f23178a == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.google.gson.x.g$c */
    /* compiled from: LinkedHashTreeMap */
    static class C8833c<K, V> {

        /* renamed from: a */
        private C8839g<K, V> f23162a;

        C8833c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo32539a(C8839g<K, V> gVar) {
            C8839g<K, V> gVar2 = null;
            while (true) {
                C8839g<K, V> gVar3 = gVar2;
                gVar2 = gVar;
                C8839g<K, V> gVar4 = gVar3;
                if (gVar2 != null) {
                    gVar2.f23178a = gVar4;
                    gVar = gVar2.f23179b;
                } else {
                    this.f23162a = gVar4;
                    return;
                }
            }
        }

        /* renamed from: a */
        public C8839g<K, V> mo32538a() {
            C8839g<K, V> gVar = this.f23162a;
            if (gVar == null) {
                return null;
            }
            C8839g<K, V> gVar2 = gVar.f23178a;
            gVar.f23178a = null;
            C8839g<K, V> gVar3 = gVar.f23171N;
            while (true) {
                C8839g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                C8839g<K, V> gVar5 = gVar4;
                if (gVar2 != null) {
                    gVar2.f23178a = gVar5;
                    gVar3 = gVar2.f23179b;
                } else {
                    this.f23162a = gVar5;
                    return gVar;
                }
            }
        }
    }

    /* renamed from: com.google.gson.x.g$d */
    /* compiled from: LinkedHashTreeMap */
    final class C8834d extends AbstractSet<Entry<K, V>> {

        /* renamed from: com.google.gson.x.g$d$a */
        /* compiled from: LinkedHashTreeMap */
        class C8835a extends C8838f<Entry<K, V>> {
            C8835a() {
                super();
            }

            public Entry<K, V> next() {
                return mo32552b();
            }
        }

        C8834d() {
        }

        public void clear() {
            C8830g.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Entry) && C8830g.this.mo32521a((Entry) obj) != null;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C8835a();
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            C8839g a = C8830g.this.mo32521a((Entry) obj);
            if (a == null) {
                return false;
            }
            C8830g.this.mo32522a(a, true);
            return true;
        }

        public int size() {
            return C8830g.this.f23151O;
        }
    }

    /* renamed from: com.google.gson.x.g$e */
    /* compiled from: LinkedHashTreeMap */
    final class C8836e extends AbstractSet<K> {

        /* renamed from: com.google.gson.x.g$e$a */
        /* compiled from: LinkedHashTreeMap */
        class C8837a extends C8838f<K> {
            C8837a() {
                super();
            }

            public K next() {
                return mo32552b().f23174Q;
            }
        }

        C8836e() {
        }

        public void clear() {
            C8830g.this.clear();
        }

        public boolean contains(Object obj) {
            return C8830g.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C8837a();
        }

        public boolean remove(Object obj) {
            return C8830g.this.mo32524c(obj) != null;
        }

        public int size() {
            return C8830g.this.f23151O;
        }
    }

    /* renamed from: com.google.gson.x.g$f */
    /* compiled from: LinkedHashTreeMap */
    private abstract class C8838f<T> implements Iterator<T> {

        /* renamed from: N */
        int f23167N;

        /* renamed from: a */
        C8839g<K, V> f23169a;

        /* renamed from: b */
        C8839g<K, V> f23170b = null;

        C8838f() {
            C8830g gVar = C8830g.this;
            this.f23169a = gVar.f23150N.f23172O;
            this.f23167N = gVar.f23152P;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C8839g<K, V> mo32552b() {
            C8839g<K, V> gVar = this.f23169a;
            C8830g gVar2 = C8830g.this;
            if (gVar == gVar2.f23150N) {
                throw new NoSuchElementException();
            } else if (gVar2.f23152P == this.f23167N) {
                this.f23169a = gVar.f23172O;
                this.f23170b = gVar;
                return gVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f23169a != C8830g.this.f23150N;
        }

        public final void remove() {
            C8839g<K, V> gVar = this.f23170b;
            if (gVar != null) {
                C8830g.this.mo32522a(gVar, true);
                this.f23170b = null;
                this.f23167N = C8830g.this.f23152P;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.google.gson.x.g$g */
    /* compiled from: LinkedHashTreeMap */
    static final class C8839g<K, V> implements Entry<K, V> {

        /* renamed from: N */
        C8839g<K, V> f23171N;

        /* renamed from: O */
        C8839g<K, V> f23172O;

        /* renamed from: P */
        C8839g<K, V> f23173P;

        /* renamed from: Q */
        final K f23174Q;

        /* renamed from: R */
        final int f23175R;

        /* renamed from: S */
        V f23176S;

        /* renamed from: T */
        int f23177T;

        /* renamed from: a */
        C8839g<K, V> f23178a;

        /* renamed from: b */
        C8839g<K, V> f23179b;

        C8839g() {
            this.f23174Q = null;
            this.f23175R = -1;
            this.f23173P = this;
            this.f23172O = this;
        }

        /* renamed from: a */
        public C8839g<K, V> mo32555a() {
            C8839g gVar = this;
            for (C8839g gVar2 = this.f23179b; gVar2 != null; gVar2 = gVar2.f23179b) {
                gVar = gVar2;
            }
            return gVar;
        }

        /* renamed from: b */
        public C8839g<K, V> mo32556b() {
            C8839g gVar = this;
            for (C8839g gVar2 = this.f23171N; gVar2 != null; gVar2 = gVar2.f23171N) {
                gVar = gVar2;
            }
            return gVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            K k = this.f23174Q;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.f23176S;
            if (v == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f23174Q;
        }

        public V getValue() {
            return this.f23176S;
        }

        public int hashCode() {
            K k = this.f23174Q;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f23176S;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f23176S;
            this.f23176S = v;
            return v2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f23174Q);
            sb.append("=");
            sb.append(this.f23176S);
            return sb.toString();
        }

        C8839g(C8839g<K, V> gVar, K k, int i, C8839g<K, V> gVar2, C8839g<K, V> gVar3) {
            this.f23178a = gVar;
            this.f23174Q = k;
            this.f23175R = i;
            this.f23177T = 1;
            this.f23172O = gVar2;
            this.f23173P = gVar3;
            gVar3.f23172O = this;
            gVar2.f23173P = this;
        }
    }

    static {
        Class<C8830g> cls = C8830g.class;
    }

    public C8830g() {
        this(f23148T);
    }

    /* renamed from: a */
    private static int m41402a(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8839g<K, V> mo32520a(K k, boolean z) {
        int i;
        C8839g<K, V> gVar;
        C8839g<K, V> gVar2;
        int i2;
        Comparator<? super K> comparator = this.f23156a;
        C8839g<K, V>[] gVarArr = this.f23157b;
        int a = m41402a(k.hashCode());
        int length = (gVarArr.length - 1) & a;
        C8839g<K, V> gVar3 = gVarArr[length];
        if (gVar3 != null) {
            Comparable comparable = comparator == f23148T ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i2 = comparable.compareTo(gVar3.f23174Q);
                } else {
                    i2 = comparator.compare(k, gVar3.f23174Q);
                }
                if (i2 == 0) {
                    return gVar3;
                }
                C8839g<K, V> gVar4 = i2 < 0 ? gVar3.f23179b : gVar3.f23171N;
                if (gVar4 == null) {
                    gVar = gVar3;
                    i = i2;
                    break;
                }
                gVar3 = gVar4;
            }
        } else {
            gVar = gVar3;
            i = 0;
        }
        if (!z) {
            return null;
        }
        C8839g<K, V> gVar5 = this.f23150N;
        if (gVar != null) {
            gVar2 = new C8839g<>(gVar, k, a, gVar5, gVar5.f23173P);
            if (i < 0) {
                gVar.f23179b = gVar2;
            } else {
                gVar.f23171N = gVar2;
            }
            m41408b(gVar, true);
        } else if (comparator != f23148T || (k instanceof Comparable)) {
            gVar2 = new C8839g<>(gVar, k, a, gVar5, gVar5.f23173P);
            gVarArr[length] = gVar2;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(k.getClass().getName());
            sb.append(" is not Comparable");
            throw new ClassCastException(sb.toString());
        }
        int i3 = this.f23151O;
        this.f23151O = i3 + 1;
        if (i3 > this.f23153Q) {
            m41403a();
        }
        this.f23152P++;
        return gVar2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C8839g<K, V> mo32523b(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo32520a((K) obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C8839g<K, V> mo32524c(Object obj) {
        C8839g<K, V> b = mo32523b(obj);
        if (b != null) {
            mo32522a(b, true);
        }
        return b;
    }

    public void clear() {
        Arrays.fill(this.f23157b, null);
        this.f23151O = 0;
        this.f23152P++;
        C8839g<K, V> gVar = this.f23150N;
        C8839g<K, V> gVar2 = gVar.f23172O;
        while (gVar2 != gVar) {
            C8839g<K, V> gVar3 = gVar2.f23172O;
            gVar2.f23173P = null;
            gVar2.f23172O = null;
            gVar2 = gVar3;
        }
        gVar.f23173P = gVar;
        gVar.f23172O = gVar;
    }

    public boolean containsKey(Object obj) {
        return mo32523b(obj) != null;
    }

    public Set<Entry<K, V>> entrySet() {
        C8834d dVar = this.f23154R;
        if (dVar != null) {
            return dVar;
        }
        C8834d dVar2 = new C8834d<>();
        this.f23154R = dVar2;
        return dVar2;
    }

    public V get(Object obj) {
        C8839g b = mo32523b(obj);
        if (b != null) {
            return b.f23176S;
        }
        return null;
    }

    public Set<K> keySet() {
        C8836e eVar = this.f23155S;
        if (eVar != null) {
            return eVar;
        }
        C8836e eVar2 = new C8836e<>();
        this.f23155S = eVar2;
        return eVar2;
    }

    public V put(K k, V v) {
        if (k != null) {
            C8839g a = mo32520a(k, true);
            V v2 = a.f23176S;
            a.f23176S = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        C8839g c = mo32524c(obj);
        if (c != null) {
            return c.f23176S;
        }
        return null;
    }

    public int size() {
        return this.f23151O;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Comparator<? super K>, code=java.util.Comparator, for r2v0, types: [java.util.Comparator<? super K>, java.util.Comparator] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8830g(java.util.Comparator r2) {
        /*
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f23151O = r0
            r1.f23152P = r0
            if (r2 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            java.util.Comparator<java.lang.Comparable> r2 = f23148T
        L_0x000d:
            r1.f23156a = r2
            com.google.gson.x.g$g r2 = new com.google.gson.x.g$g
            r2.<init>()
            r1.f23150N = r2
            r2 = 16
            com.google.gson.x.g$g[] r2 = new com.google.gson.p321x.C8830g.C8839g[r2]
            r1.f23157b = r2
            com.google.gson.x.g$g<K, V>[] r2 = r1.f23157b
            int r0 = r2.length
            int r0 = r0 / 2
            int r2 = r2.length
            int r2 = r2 / 4
            int r0 = r0 + r2
            r1.f23153Q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p321x.C8830g.<init>(java.util.Comparator):void");
    }

    /* renamed from: b */
    private boolean m41409b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    private void m41408b(C8839g<K, V> gVar, boolean z) {
        while (gVar != null) {
            C8839g<K, V> gVar2 = gVar.f23179b;
            C8839g<K, V> gVar3 = gVar.f23171N;
            int i = 0;
            int i2 = gVar2 != null ? gVar2.f23177T : 0;
            int i3 = gVar3 != null ? gVar3.f23177T : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C8839g<K, V> gVar4 = gVar3.f23179b;
                C8839g<K, V> gVar5 = gVar3.f23171N;
                int i5 = gVar5 != null ? gVar5.f23177T : 0;
                if (gVar4 != null) {
                    i = gVar4.f23177T;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    m41404a(gVar);
                } else {
                    m41407b(gVar3);
                    m41404a(gVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C8839g<K, V> gVar6 = gVar2.f23179b;
                C8839g<K, V> gVar7 = gVar2.f23171N;
                int i7 = gVar7 != null ? gVar7.f23177T : 0;
                if (gVar6 != null) {
                    i = gVar6.f23177T;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    m41407b(gVar);
                } else {
                    m41404a(gVar2);
                    m41407b(gVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                gVar.f23177T = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                gVar.f23177T = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            gVar = gVar.f23178a;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8839g<K, V> mo32521a(Entry<?, ?> entry) {
        C8839g<K, V> b = mo32523b(entry.getKey());
        if (b != null && m41409b((Object) b.f23176S, entry.getValue())) {
            return b;
        }
        return null;
    }

    /* renamed from: b */
    private void m41407b(C8839g<K, V> gVar) {
        C8839g<K, V> gVar2 = gVar.f23179b;
        C8839g<K, V> gVar3 = gVar.f23171N;
        C8839g<K, V> gVar4 = gVar2.f23179b;
        C8839g<K, V> gVar5 = gVar2.f23171N;
        gVar.f23179b = gVar5;
        if (gVar5 != null) {
            gVar5.f23178a = gVar;
        }
        m41405a(gVar, gVar2);
        gVar2.f23171N = gVar;
        gVar.f23178a = gVar2;
        int i = 0;
        gVar.f23177T = Math.max(gVar3 != null ? gVar3.f23177T : 0, gVar5 != null ? gVar5.f23177T : 0) + 1;
        int i2 = gVar.f23177T;
        if (gVar4 != null) {
            i = gVar4.f23177T;
        }
        gVar2.f23177T = Math.max(i2, i) + 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo32522a(C8839g<K, V> gVar, boolean z) {
        int i;
        if (z) {
            C8839g<K, V> gVar2 = gVar.f23173P;
            gVar2.f23172O = gVar.f23172O;
            gVar.f23172O.f23173P = gVar2;
            gVar.f23173P = null;
            gVar.f23172O = null;
        }
        C8839g<K, V> gVar3 = gVar.f23179b;
        C8839g<K, V> gVar4 = gVar.f23171N;
        C8839g<K, V> gVar5 = gVar.f23178a;
        int i2 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                m41405a(gVar, gVar3);
                gVar.f23179b = null;
            } else if (gVar4 != null) {
                m41405a(gVar, gVar4);
                gVar.f23171N = null;
            } else {
                m41405a(gVar, null);
            }
            m41408b(gVar5, false);
            this.f23151O--;
            this.f23152P++;
            return;
        }
        C8839g<K, V> b = gVar3.f23177T > gVar4.f23177T ? gVar3.mo32556b() : gVar4.mo32555a();
        mo32522a(b, false);
        C8839g<K, V> gVar6 = gVar.f23179b;
        if (gVar6 != null) {
            i = gVar6.f23177T;
            b.f23179b = gVar6;
            gVar6.f23178a = b;
            gVar.f23179b = null;
        } else {
            i = 0;
        }
        C8839g<K, V> gVar7 = gVar.f23171N;
        if (gVar7 != null) {
            i2 = gVar7.f23177T;
            b.f23171N = gVar7;
            gVar7.f23178a = b;
            gVar.f23171N = null;
        }
        b.f23177T = Math.max(i, i2) + 1;
        m41405a(gVar, b);
    }

    /* renamed from: a */
    private void m41405a(C8839g<K, V> gVar, C8839g<K, V> gVar2) {
        C8839g<K, V> gVar3 = gVar.f23178a;
        gVar.f23178a = null;
        if (gVar2 != null) {
            gVar2.f23178a = gVar3;
        }
        if (gVar3 == null) {
            int i = gVar.f23175R;
            C8839g<K, V>[] gVarArr = this.f23157b;
            gVarArr[i & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.f23179b == gVar) {
            gVar3.f23179b = gVar2;
        } else {
            gVar3.f23171N = gVar2;
        }
    }

    /* renamed from: a */
    private void m41404a(C8839g<K, V> gVar) {
        C8839g<K, V> gVar2 = gVar.f23179b;
        C8839g<K, V> gVar3 = gVar.f23171N;
        C8839g<K, V> gVar4 = gVar3.f23179b;
        C8839g<K, V> gVar5 = gVar3.f23171N;
        gVar.f23171N = gVar4;
        if (gVar4 != null) {
            gVar4.f23178a = gVar;
        }
        m41405a(gVar, gVar3);
        gVar3.f23179b = gVar;
        gVar.f23178a = gVar3;
        int i = 0;
        gVar.f23177T = Math.max(gVar2 != null ? gVar2.f23177T : 0, gVar4 != null ? gVar4.f23177T : 0) + 1;
        int i2 = gVar.f23177T;
        if (gVar5 != null) {
            i = gVar5.f23177T;
        }
        gVar3.f23177T = Math.max(i2, i) + 1;
    }

    /* renamed from: a */
    private void m41403a() {
        this.f23157b = m41406a(this.f23157b);
        C8839g<K, V>[] gVarArr = this.f23157b;
        this.f23153Q = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    /* renamed from: a */
    static <K, V> C8839g<K, V>[] m41406a(C8839g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        C8839g<K, V>[] gVarArr2 = new C8839g[(length * 2)];
        C8833c cVar = new C8833c();
        C8832b bVar = new C8832b();
        C8832b bVar2 = new C8832b();
        for (int i = 0; i < length; i++) {
            C8839g<K, V> gVar = gVarArr[i];
            if (gVar != null) {
                cVar.mo32539a(gVar);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    C8839g a = cVar.mo32538a();
                    if (a == null) {
                        break;
                    } else if ((a.f23175R & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                bVar.mo32536a(i2);
                bVar2.mo32536a(i3);
                cVar.mo32539a(gVar);
                while (true) {
                    C8839g a2 = cVar.mo32538a();
                    if (a2 == null) {
                        break;
                    } else if ((a2.f23175R & length) == 0) {
                        bVar.mo32537a(a2);
                    } else {
                        bVar2.mo32537a(a2);
                    }
                }
                C8839g<K, V> gVar2 = null;
                gVarArr2[i] = i2 > 0 ? bVar.mo32535a() : null;
                int i4 = i + length;
                if (i3 > 0) {
                    gVar2 = bVar2.mo32535a();
                }
                gVarArr2[i4] = gVar2;
            }
        }
        return gVarArr2;
    }
}
