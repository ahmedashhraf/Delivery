package com.google.gson.p321x;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.google.gson.x.h */
/* compiled from: LinkedTreeMap */
public final class C8840h<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: S */
    private static final Comparator<Comparable> f23180S = new C8841a();

    /* renamed from: T */
    static final /* synthetic */ boolean f23181T = false;

    /* renamed from: N */
    int f23182N;

    /* renamed from: O */
    int f23183O;

    /* renamed from: P */
    final C8847e<K, V> f23184P;

    /* renamed from: Q */
    private C8842b f23185Q;

    /* renamed from: R */
    private C8844c f23186R;

    /* renamed from: a */
    Comparator<? super K> f23187a;

    /* renamed from: b */
    C8847e<K, V> f23188b;

    /* renamed from: com.google.gson.x.h$a */
    /* compiled from: LinkedTreeMap */
    static class C8841a implements Comparator<Comparable> {
        C8841a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: com.google.gson.x.h$b */
    /* compiled from: LinkedTreeMap */
    class C8842b extends AbstractSet<Entry<K, V>> {

        /* renamed from: com.google.gson.x.h$b$a */
        /* compiled from: LinkedTreeMap */
        class C8843a extends C8846d<Entry<K, V>> {
            C8843a() {
                super();
            }

            public Entry<K, V> next() {
                return mo32590b();
            }
        }

        C8842b() {
        }

        public void clear() {
            C8840h.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Entry) && C8840h.this.mo32564a((Entry) obj) != null;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C8843a();
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            C8847e a = C8840h.this.mo32564a((Entry) obj);
            if (a == null) {
                return false;
            }
            C8840h.this.mo32565a(a, true);
            return true;
        }

        public int size() {
            return C8840h.this.f23182N;
        }
    }

    /* renamed from: com.google.gson.x.h$c */
    /* compiled from: LinkedTreeMap */
    final class C8844c extends AbstractSet<K> {

        /* renamed from: com.google.gson.x.h$c$a */
        /* compiled from: LinkedTreeMap */
        class C8845a extends C8846d<K> {
            C8845a() {
                super();
            }

            public K next() {
                return mo32590b().f23200Q;
            }
        }

        C8844c() {
        }

        public void clear() {
            C8840h.this.clear();
        }

        public boolean contains(Object obj) {
            return C8840h.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C8845a();
        }

        public boolean remove(Object obj) {
            return C8840h.this.mo32567c(obj) != null;
        }

        public int size() {
            return C8840h.this.f23182N;
        }
    }

    /* renamed from: com.google.gson.x.h$d */
    /* compiled from: LinkedTreeMap */
    private abstract class C8846d<T> implements Iterator<T> {

        /* renamed from: N */
        int f23193N;

        /* renamed from: a */
        C8847e<K, V> f23195a;

        /* renamed from: b */
        C8847e<K, V> f23196b = null;

        C8846d() {
            C8840h hVar = C8840h.this;
            this.f23195a = hVar.f23184P.f23198O;
            this.f23193N = hVar.f23183O;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C8847e<K, V> mo32590b() {
            C8847e<K, V> eVar = this.f23195a;
            C8840h hVar = C8840h.this;
            if (eVar == hVar.f23184P) {
                throw new NoSuchElementException();
            } else if (hVar.f23183O == this.f23193N) {
                this.f23195a = eVar.f23198O;
                this.f23196b = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f23195a != C8840h.this.f23184P;
        }

        public final void remove() {
            C8847e<K, V> eVar = this.f23196b;
            if (eVar != null) {
                C8840h.this.mo32565a(eVar, true);
                this.f23196b = null;
                this.f23193N = C8840h.this.f23183O;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.google.gson.x.h$e */
    /* compiled from: LinkedTreeMap */
    static final class C8847e<K, V> implements Entry<K, V> {

        /* renamed from: N */
        C8847e<K, V> f23197N;

        /* renamed from: O */
        C8847e<K, V> f23198O;

        /* renamed from: P */
        C8847e<K, V> f23199P;

        /* renamed from: Q */
        final K f23200Q;

        /* renamed from: R */
        V f23201R;

        /* renamed from: S */
        int f23202S;

        /* renamed from: a */
        C8847e<K, V> f23203a;

        /* renamed from: b */
        C8847e<K, V> f23204b;

        C8847e() {
            this.f23200Q = null;
            this.f23199P = this;
            this.f23198O = this;
        }

        /* renamed from: a */
        public C8847e<K, V> mo32593a() {
            C8847e eVar = this;
            for (C8847e eVar2 = this.f23204b; eVar2 != null; eVar2 = eVar2.f23204b) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* renamed from: b */
        public C8847e<K, V> mo32594b() {
            C8847e eVar = this;
            for (C8847e eVar2 = this.f23197N; eVar2 != null; eVar2 = eVar2.f23197N) {
                eVar = eVar2;
            }
            return eVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            K k = this.f23200Q;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.f23201R;
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
            return this.f23200Q;
        }

        public V getValue() {
            return this.f23201R;
        }

        public int hashCode() {
            K k = this.f23200Q;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f23201R;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f23201R;
            this.f23201R = v;
            return v2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f23200Q);
            sb.append("=");
            sb.append(this.f23201R);
            return sb.toString();
        }

        C8847e(C8847e<K, V> eVar, K k, C8847e<K, V> eVar2, C8847e<K, V> eVar3) {
            this.f23203a = eVar;
            this.f23200Q = k;
            this.f23202S = 1;
            this.f23198O = eVar2;
            this.f23199P = eVar3;
            eVar3.f23198O = this;
            eVar2.f23199P = this;
        }
    }

    static {
        Class<C8840h> cls = C8840h.class;
    }

    public C8840h() {
        this(f23180S);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8847e<K, V> mo32563a(K k, boolean z) {
        int i;
        C8847e<K, V> eVar;
        Comparator<? super K> comparator = this.f23187a;
        C8847e<K, V> eVar2 = this.f23188b;
        if (eVar2 != null) {
            Comparable comparable = comparator == f23180S ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(eVar2.f23200Q);
                } else {
                    i = comparator.compare(k, eVar2.f23200Q);
                }
                if (i == 0) {
                    return eVar2;
                }
                C8847e<K, V> eVar3 = i < 0 ? eVar2.f23204b : eVar2.f23197N;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C8847e<K, V> eVar4 = this.f23184P;
        if (eVar2 != null) {
            eVar = new C8847e<>(eVar2, k, eVar4, eVar4.f23199P);
            if (i < 0) {
                eVar2.f23204b = eVar;
            } else {
                eVar2.f23197N = eVar;
            }
            m41427b(eVar2, true);
        } else if (comparator != f23180S || (k instanceof Comparable)) {
            eVar = new C8847e<>(eVar2, k, eVar4, eVar4.f23199P);
            this.f23188b = eVar;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(k.getClass().getName());
            sb.append(" is not Comparable");
            throw new ClassCastException(sb.toString());
        }
        this.f23182N++;
        this.f23183O++;
        return eVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C8847e<K, V> mo32566b(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo32563a((K) obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C8847e<K, V> mo32567c(Object obj) {
        C8847e<K, V> b = mo32566b(obj);
        if (b != null) {
            mo32565a(b, true);
        }
        return b;
    }

    public void clear() {
        this.f23188b = null;
        this.f23182N = 0;
        this.f23183O++;
        C8847e<K, V> eVar = this.f23184P;
        eVar.f23199P = eVar;
        eVar.f23198O = eVar;
    }

    public boolean containsKey(Object obj) {
        return mo32566b(obj) != null;
    }

    public Set<Entry<K, V>> entrySet() {
        C8842b bVar = this.f23185Q;
        if (bVar != null) {
            return bVar;
        }
        C8842b bVar2 = new C8842b<>();
        this.f23185Q = bVar2;
        return bVar2;
    }

    public V get(Object obj) {
        C8847e b = mo32566b(obj);
        if (b != null) {
            return b.f23201R;
        }
        return null;
    }

    public Set<K> keySet() {
        C8844c cVar = this.f23186R;
        if (cVar != null) {
            return cVar;
        }
        C8844c cVar2 = new C8844c<>();
        this.f23186R = cVar2;
        return cVar2;
    }

    public V put(K k, V v) {
        if (k != null) {
            C8847e a = mo32563a(k, true);
            V v2 = a.f23201R;
            a.f23201R = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        C8847e c = mo32567c(obj);
        if (c != null) {
            return c.f23201R;
        }
        return null;
    }

    public int size() {
        return this.f23182N;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Comparator<? super K>, code=java.util.Comparator, for r2v0, types: [java.util.Comparator<? super K>, java.util.Comparator] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8840h(java.util.Comparator r2) {
        /*
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f23182N = r0
            r1.f23183O = r0
            com.google.gson.x.h$e r0 = new com.google.gson.x.h$e
            r0.<init>()
            r1.f23184P = r0
            if (r2 == 0) goto L_0x0012
            goto L_0x0014
        L_0x0012:
            java.util.Comparator<java.lang.Comparable> r2 = f23180S
        L_0x0014:
            r1.f23187a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p321x.C8840h.<init>(java.util.Comparator):void");
    }

    /* renamed from: b */
    private boolean m41428b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    private void m41427b(C8847e<K, V> eVar, boolean z) {
        while (eVar != null) {
            C8847e<K, V> eVar2 = eVar.f23204b;
            C8847e<K, V> eVar3 = eVar.f23197N;
            int i = 0;
            int i2 = eVar2 != null ? eVar2.f23202S : 0;
            int i3 = eVar3 != null ? eVar3.f23202S : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C8847e<K, V> eVar4 = eVar3.f23204b;
                C8847e<K, V> eVar5 = eVar3.f23197N;
                int i5 = eVar5 != null ? eVar5.f23202S : 0;
                if (eVar4 != null) {
                    i = eVar4.f23202S;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    m41424a(eVar);
                } else {
                    m41426b(eVar3);
                    m41424a(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C8847e<K, V> eVar6 = eVar2.f23204b;
                C8847e<K, V> eVar7 = eVar2.f23197N;
                int i7 = eVar7 != null ? eVar7.f23202S : 0;
                if (eVar6 != null) {
                    i = eVar6.f23202S;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    m41426b(eVar);
                } else {
                    m41424a(eVar2);
                    m41426b(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.f23202S = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f23202S = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f23203a;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8847e<K, V> mo32564a(Entry<?, ?> entry) {
        C8847e<K, V> b = mo32566b(entry.getKey());
        if (b != null && m41428b((Object) b.f23201R, entry.getValue())) {
            return b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo32565a(C8847e<K, V> eVar, boolean z) {
        int i;
        if (z) {
            C8847e<K, V> eVar2 = eVar.f23199P;
            eVar2.f23198O = eVar.f23198O;
            eVar.f23198O.f23199P = eVar2;
        }
        C8847e<K, V> eVar3 = eVar.f23204b;
        C8847e<K, V> eVar4 = eVar.f23197N;
        C8847e<K, V> eVar5 = eVar.f23203a;
        int i2 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                m41425a(eVar, eVar3);
                eVar.f23204b = null;
            } else if (eVar4 != null) {
                m41425a(eVar, eVar4);
                eVar.f23197N = null;
            } else {
                m41425a(eVar, null);
            }
            m41427b(eVar5, false);
            this.f23182N--;
            this.f23183O++;
            return;
        }
        C8847e<K, V> b = eVar3.f23202S > eVar4.f23202S ? eVar3.mo32594b() : eVar4.mo32593a();
        mo32565a(b, false);
        C8847e<K, V> eVar6 = eVar.f23204b;
        if (eVar6 != null) {
            i = eVar6.f23202S;
            b.f23204b = eVar6;
            eVar6.f23203a = b;
            eVar.f23204b = null;
        } else {
            i = 0;
        }
        C8847e<K, V> eVar7 = eVar.f23197N;
        if (eVar7 != null) {
            i2 = eVar7.f23202S;
            b.f23197N = eVar7;
            eVar7.f23203a = b;
            eVar.f23197N = null;
        }
        b.f23202S = Math.max(i, i2) + 1;
        m41425a(eVar, b);
    }

    /* renamed from: b */
    private void m41426b(C8847e<K, V> eVar) {
        C8847e<K, V> eVar2 = eVar.f23204b;
        C8847e<K, V> eVar3 = eVar.f23197N;
        C8847e<K, V> eVar4 = eVar2.f23204b;
        C8847e<K, V> eVar5 = eVar2.f23197N;
        eVar.f23204b = eVar5;
        if (eVar5 != null) {
            eVar5.f23203a = eVar;
        }
        m41425a(eVar, eVar2);
        eVar2.f23197N = eVar;
        eVar.f23203a = eVar2;
        int i = 0;
        eVar.f23202S = Math.max(eVar3 != null ? eVar3.f23202S : 0, eVar5 != null ? eVar5.f23202S : 0) + 1;
        int i2 = eVar.f23202S;
        if (eVar4 != null) {
            i = eVar4.f23202S;
        }
        eVar2.f23202S = Math.max(i2, i) + 1;
    }

    /* renamed from: a */
    private void m41425a(C8847e<K, V> eVar, C8847e<K, V> eVar2) {
        C8847e<K, V> eVar3 = eVar.f23203a;
        eVar.f23203a = null;
        if (eVar2 != null) {
            eVar2.f23203a = eVar3;
        }
        if (eVar3 == null) {
            this.f23188b = eVar2;
        } else if (eVar3.f23204b == eVar) {
            eVar3.f23204b = eVar2;
        } else {
            eVar3.f23197N = eVar2;
        }
    }

    /* renamed from: a */
    private void m41424a(C8847e<K, V> eVar) {
        C8847e<K, V> eVar2 = eVar.f23204b;
        C8847e<K, V> eVar3 = eVar.f23197N;
        C8847e<K, V> eVar4 = eVar3.f23204b;
        C8847e<K, V> eVar5 = eVar3.f23197N;
        eVar.f23197N = eVar4;
        if (eVar4 != null) {
            eVar4.f23203a = eVar;
        }
        m41425a(eVar, eVar3);
        eVar3.f23204b = eVar;
        eVar.f23203a = eVar3;
        int i = 0;
        eVar.f23202S = Math.max(eVar2 != null ? eVar2.f23202S : 0, eVar4 != null ? eVar4.f23202S : 0) + 1;
        int i2 = eVar.f23202S;
        if (eVar5 != null) {
            i = eVar5.f23202S;
        }
        eVar3.f23202S = Math.max(i2, i) + 1;
    }
}
