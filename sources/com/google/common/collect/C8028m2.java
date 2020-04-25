package com.google.common.collect;

import com.google.common.base.C5827t;
import com.google.common.base.C7397x;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.m2 */
/* compiled from: HashBiMap */
public final class C8028m2<K, V> extends AbstractMap<K, V> implements C8139s<K, V>, Serializable {

    /* renamed from: R */
    private static final double f21805R = 1.0d;
    @C2777c("Not needed in emulated source")
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public transient int f21806N;

    /* renamed from: O */
    private transient int f21807O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public transient int f21808P;

    /* renamed from: Q */
    private transient C8139s<V, K> f21809Q;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public transient C8030b<K, V>[] f21810a;

    /* renamed from: b */
    private transient C8030b<K, V>[] f21811b;

    /* renamed from: com.google.common.collect.m2$b */
    /* compiled from: HashBiMap */
    private static final class C8030b<K, V> extends C8214u2<K, V> {

        /* renamed from: N */
        final int f21812N;

        /* renamed from: O */
        final int f21813O;
        @C5952h

        /* renamed from: P */
        C8030b<K, V> f21814P;
        @C5952h

        /* renamed from: Q */
        C8030b<K, V> f21815Q;

        C8030b(K k, int i, V v, int i2) {
            super(k, v);
            this.f21812N = i;
            this.f21813O = i2;
        }
    }

    /* renamed from: com.google.common.collect.m2$c */
    /* compiled from: HashBiMap */
    private final class C8031c extends C7828o<K, V> {

        /* renamed from: com.google.common.collect.m2$c$a */
        /* compiled from: HashBiMap */
        class C8032a extends C8041f<Entry<K, V>> {

            /* renamed from: com.google.common.collect.m2$c$a$a */
            /* compiled from: HashBiMap */
            class C8033a extends C7848g<K, V> {

                /* renamed from: a */
                C8030b<K, V> f21818a;

                C8033a(C8030b<K, V> bVar) {
                    this.f21818a = bVar;
                }

                public K getKey() {
                    return this.f21818a.f22032a;
                }

                public V getValue() {
                    return this.f21818a.f22033b;
                }

                public V setValue(V v) {
                    V v2 = this.f21818a.f22033b;
                    int b = C8028m2.m38468c((Object) v);
                    if (b == this.f21818a.f21813O && C5827t.m25562a(v, v2)) {
                        return v;
                    }
                    C7397x.m35672a(C8028m2.this.m38461b((Object) v, b) == null, "value already present: %s", v);
                    C8028m2.this.m38457a(this.f21818a);
                    C8030b<K, V> bVar = this.f21818a;
                    C8030b<K, V> bVar2 = new C8030b<>(bVar.f22032a, bVar.f21812N, v, b);
                    C8028m2.this.m38463b(bVar2);
                    C8032a aVar = C8032a.this;
                    aVar.f21829O = C8028m2.this.f21808P;
                    C8032a aVar2 = C8032a.this;
                    if (aVar2.f21828N == this.f21818a) {
                        aVar2.f21828N = bVar2;
                    }
                    this.f21818a = bVar2;
                    return v2;
                }
            }

            C8032a() {
                super();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public Entry<K, V> m38475a(C8030b<K, V> bVar) {
                return new C8033a(bVar);
            }
        }

        private C8031c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Map<K, V> mo29777b() {
            return C8028m2.this;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C8032a();
        }
    }

    /* renamed from: com.google.common.collect.m2$d */
    /* compiled from: HashBiMap */
    private final class C8034d extends AbstractMap<V, K> implements C8139s<V, K>, Serializable {

        /* renamed from: com.google.common.collect.m2$d$a */
        /* compiled from: HashBiMap */
        class C8035a extends C7828o<V, K> {

            /* renamed from: com.google.common.collect.m2$d$a$a */
            /* compiled from: HashBiMap */
            class C8036a extends C8041f<Entry<V, K>> {

                /* renamed from: com.google.common.collect.m2$d$a$a$a */
                /* compiled from: HashBiMap */
                class C8037a extends C7848g<V, K> {

                    /* renamed from: a */
                    C8030b<K, V> f21823a;

                    C8037a(C8030b<K, V> bVar) {
                        this.f21823a = bVar;
                    }

                    public V getKey() {
                        return this.f21823a.f22033b;
                    }

                    public K getValue() {
                        return this.f21823a.f22032a;
                    }

                    public K setValue(K k) {
                        K k2 = this.f21823a.f22032a;
                        int b = C8028m2.m38468c((Object) k);
                        if (b == this.f21823a.f21812N && C5827t.m25562a(k, k2)) {
                            return k;
                        }
                        C7397x.m35672a(C8028m2.this.m38451a((Object) k, b) == null, "value already present: %s", k);
                        C8028m2.this.m38457a(this.f21823a);
                        C8030b<K, V> bVar = this.f21823a;
                        C8028m2.this.m38463b(new C8030b<>(k, b, bVar.f22033b, bVar.f21813O));
                        C8036a aVar = C8036a.this;
                        aVar.f21829O = C8028m2.this.f21808P;
                        return k2;
                    }
                }

                C8036a() {
                    super();
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public Entry<V, K> m38481a(C8030b<K, V> bVar) {
                    return new C8037a(bVar);
                }
            }

            C8035a() {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public Map<V, K> mo29777b() {
                return C8034d.this;
            }

            public Iterator<Entry<V, K>> iterator() {
                return new C8036a();
            }
        }

        /* renamed from: com.google.common.collect.m2$d$b */
        /* compiled from: HashBiMap */
        private final class C8038b extends C7842w<V, K> {

            /* renamed from: com.google.common.collect.m2$d$b$a */
            /* compiled from: HashBiMap */
            class C8039a extends C8041f<V> {
                C8039a() {
                    super();
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public V mo30803a(C8030b<K, V> bVar) {
                    return bVar.f22033b;
                }
            }

            C8038b() {
                super(C8034d.this);
            }

            public Iterator<V> iterator() {
                return new C8039a();
            }

            public boolean remove(@C5952h Object obj) {
                C8030b b = C8028m2.this.m38461b(obj, C8028m2.m38468c(obj));
                if (b == null) {
                    return false;
                }
                C8028m2.this.m38457a(b);
                return true;
            }
        }

        private C8034d() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C8139s<K, V> mo30804a() {
            return C8028m2.this;
        }

        public void clear() {
            mo30804a().clear();
        }

        public boolean containsKey(@C5952h Object obj) {
            return mo30804a().containsValue(obj);
        }

        public Set<Entry<V, K>> entrySet() {
            return new C8035a();
        }

        public K get(@C5952h Object obj) {
            C8030b b = C8028m2.this.m38461b(obj, C8028m2.m38468c(obj));
            if (b == null) {
                return null;
            }
            return b.f22032a;
        }

        /* renamed from: k */
        public C8139s<K, V> mo29607k() {
            return mo30804a();
        }

        public Set<V> keySet() {
            return new C8038b();
        }

        public K put(@C5952h V v, @C5952h K k) {
            return C8028m2.this.m38462b(v, k, false);
        }

        public K remove(@C5952h Object obj) {
            C8030b b = C8028m2.this.m38461b(obj, C8028m2.m38468c(obj));
            if (b == null) {
                return null;
            }
            C8028m2.this.m38457a(b);
            return b.f22032a;
        }

        public int size() {
            return C8028m2.this.f21806N;
        }

        /* access modifiers changed from: 0000 */
        public Object writeReplace() {
            return new C8040e(C8028m2.this);
        }

        /* renamed from: a */
        public K mo29602a(@C5952h V v, @C5952h K k) {
            return C8028m2.this.m38462b(v, k, true);
        }

        public Set<K> values() {
            return mo30804a().keySet();
        }
    }

    /* renamed from: com.google.common.collect.m2$e */
    /* compiled from: HashBiMap */
    private static final class C8040e<K, V> implements Serializable {

        /* renamed from: a */
        private final C8028m2<K, V> f21827a;

        C8040e(C8028m2<K, V> m2Var) {
            this.f21827a = m2Var;
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return this.f21827a.mo29607k();
        }
    }

    /* renamed from: com.google.common.collect.m2$f */
    /* compiled from: HashBiMap */
    abstract class C8041f<T> implements Iterator<T> {

        /* renamed from: N */
        C8030b<K, V> f21828N = null;

        /* renamed from: O */
        int f21829O = C8028m2.this.f21808P;

        /* renamed from: a */
        int f21831a = 0;

        /* renamed from: b */
        C8030b<K, V> f21832b = null;

        C8041f() {
        }

        /* renamed from: b */
        private void m38483b() {
            if (C8028m2.this.f21808P != this.f21829O) {
                throw new ConcurrentModificationException();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract T mo30803a(C8030b<K, V> bVar);

        public boolean hasNext() {
            m38483b();
            if (this.f21832b != null) {
                return true;
            }
            while (this.f21831a < C8028m2.this.f21810a.length) {
                C8030b[] b = C8028m2.this.f21810a;
                int i = this.f21831a;
                if (b[i] != null) {
                    C8030b<K, V>[] b2 = C8028m2.this.f21810a;
                    int i2 = this.f21831a;
                    this.f21831a = i2 + 1;
                    this.f21832b = b2[i2];
                    return true;
                }
                this.f21831a = i + 1;
            }
            return false;
        }

        public T next() {
            m38483b();
            if (hasNext()) {
                C8030b<K, V> bVar = this.f21832b;
                this.f21832b = bVar.f21814P;
                this.f21828N = bVar;
                return mo30803a(bVar);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            m38483b();
            C8277y.m39486a(this.f21828N != null);
            C8028m2.this.m38457a(this.f21828N);
            this.f21829O = C8028m2.this.f21808P;
            this.f21828N = null;
        }
    }

    /* renamed from: com.google.common.collect.m2$g */
    /* compiled from: HashBiMap */
    private final class C8042g extends C7842w<K, V> {

        /* renamed from: com.google.common.collect.m2$g$a */
        /* compiled from: HashBiMap */
        class C8043a extends C8041f<K> {
            C8043a() {
                super();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public K mo30803a(C8030b<K, V> bVar) {
                return bVar.f22032a;
            }
        }

        C8042g() {
            super(C8028m2.this);
        }

        public Iterator<K> iterator() {
            return new C8043a();
        }

        public boolean remove(@C5952h Object obj) {
            C8030b a = C8028m2.this.m38451a(obj, C8028m2.m38468c(obj));
            if (a == null) {
                return false;
            }
            C8028m2.this.m38457a(a);
            return true;
        }
    }

    private C8028m2(int i) {
        m38469c(i);
    }

    /* renamed from: d */
    private void m38470d() {
        C8030b<K, V>[] bVarArr = this.f21810a;
        if (C8093p2.m38753a(this.f21806N, bVarArr.length, f21805R)) {
            int length = bVarArr.length * 2;
            this.f21810a = m38465b(length);
            this.f21811b = m38465b(length);
            this.f21807O = length - 1;
            this.f21806N = 0;
            for (C8030b<K, V> bVar : bVarArr) {
                while (bVar != null) {
                    C8030b<K, V> bVar2 = bVar.f21814P;
                    m38463b(bVar);
                    bVar = bVar2;
                }
            }
            this.f21808P++;
        }
    }

    @C2777c("java.io.ObjectInputStream")
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int a = C7984k5.m38238a(objectInputStream);
        m38469c(a);
        C7984k5.m38247a((Map<K, V>) this, objectInputStream, a);
    }

    @C2777c("java.io.ObjectOutputStream")
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C7984k5.m38248a((Map<K, V>) this, objectOutputStream);
    }

    public void clear() {
        this.f21806N = 0;
        Arrays.fill(this.f21810a, null);
        Arrays.fill(this.f21811b, null);
        this.f21808P++;
    }

    public boolean containsKey(@C5952h Object obj) {
        return m38451a(obj, m38468c(obj)) != null;
    }

    public boolean containsValue(@C5952h Object obj) {
        return m38461b(obj, m38468c(obj)) != null;
    }

    public Set<Entry<K, V>> entrySet() {
        return new C8031c();
    }

    @C5952h
    public V get(@C5952h Object obj) {
        C8030b a = m38451a(obj, m38468c(obj));
        if (a == null) {
            return null;
        }
        return a.f22033b;
    }

    /* renamed from: k */
    public C8139s<V, K> mo29607k() {
        C8139s<V, K> sVar = this.f21809Q;
        if (sVar != null) {
            return sVar;
        }
        C8034d dVar = new C8034d();
        this.f21809Q = dVar;
        return dVar;
    }

    public Set<K> keySet() {
        return new C8042g();
    }

    public V put(@C5952h K k, @C5952h V v) {
        return m38456a(k, v, false);
    }

    public V remove(@C5952h Object obj) {
        C8030b a = m38451a(obj, m38468c(obj));
        if (a == null) {
            return null;
        }
        m38457a(a);
        return a.f22033b;
    }

    public int size() {
        return this.f21806N;
    }

    /* renamed from: c */
    private void m38469c(int i) {
        C8277y.m39484a(i, "expectedSize");
        int a = C8093p2.m38751a(i, f21805R);
        this.f21810a = m38465b(a);
        this.f21811b = m38465b(a);
        this.f21807O = a - 1;
        this.f21808P = 0;
        this.f21806N = 0;
    }

    public Set<V> values() {
        return mo29607k().keySet();
    }

    /* renamed from: a */
    public static <K, V> C8028m2<K, V> m38452a() {
        return m38453a(16);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m38463b(C8030b<K, V> bVar) {
        int i = bVar.f21812N;
        int i2 = this.f21807O;
        int i3 = i & i2;
        C8030b<K, V>[] bVarArr = this.f21810a;
        bVar.f21814P = bVarArr[i3];
        bVarArr[i3] = bVar;
        int i4 = bVar.f21813O & i2;
        C8030b<K, V>[] bVarArr2 = this.f21811b;
        bVar.f21815Q = bVarArr2[i4];
        bVarArr2[i4] = bVar;
        this.f21806N++;
        this.f21808P++;
    }

    /* renamed from: a */
    public static <K, V> C8028m2<K, V> m38453a(int i) {
        return new C8028m2<>(i);
    }

    /* renamed from: a */
    public static <K, V> C8028m2<K, V> m38454a(Map<? extends K, ? extends V> map) {
        C8028m2<K, V> a = m38453a(map.size());
        a.putAll(map);
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m38457a(C8030b<K, V> bVar) {
        C8030b<K, V> bVar2;
        int i = bVar.f21812N & this.f21807O;
        C8030b<K, V> bVar3 = null;
        C8030b<K, V> bVar4 = null;
        for (C8030b<K, V> bVar5 = this.f21810a[i]; bVar5 != bVar; bVar5 = bVar5.f21814P) {
            bVar4 = bVar5;
        }
        if (bVar4 == null) {
            this.f21810a[i] = bVar.f21814P;
        } else {
            bVar4.f21814P = bVar.f21814P;
        }
        int i2 = bVar.f21813O & this.f21807O;
        C8030b<K, V> bVar6 = this.f21811b[i2];
        while (true) {
            C8030b<K, V> bVar7 = bVar3;
            bVar3 = bVar6;
            bVar2 = bVar7;
            if (bVar3 == bVar) {
                break;
            }
            bVar6 = bVar3.f21815Q;
        }
        if (bVar2 == null) {
            this.f21811b[i2] = bVar.f21815Q;
        } else {
            bVar2.f21815Q = bVar.f21815Q;
        }
        this.f21806N--;
        this.f21808P++;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m38468c(@C5952h Object obj) {
        return C8093p2.m38750a(obj == null ? 0 : obj.hashCode());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C8030b<K, V> m38461b(@C5952h Object obj, int i) {
        for (C8030b<K, V> bVar = this.f21811b[this.f21807O & i]; bVar != null; bVar = bVar.f21815Q) {
            if (i == bVar.f21813O && C5827t.m25562a(obj, bVar.f22033b)) {
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    @C5952h
    /* renamed from: b */
    public K m38462b(@C5952h V v, @C5952h K k, boolean z) {
        K k2;
        int c = m38468c((Object) v);
        int c2 = m38468c((Object) k);
        C8030b b = m38461b((Object) v, c);
        if (b != null && c2 == b.f21812N && C5827t.m25562a(k, b.f22032a)) {
            return k;
        }
        C8030b a = m38451a((Object) k, c2);
        if (a != null) {
            if (z) {
                m38457a(a);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("value already present: ");
                sb.append(k);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (b != null) {
            m38457a(b);
        }
        m38463b(new C8030b<>(k, c2, v, c));
        m38470d();
        if (b == null) {
            k2 = null;
        } else {
            k2 = b.f22032a;
        }
        return k2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C8030b<K, V> m38451a(@C5952h Object obj, int i) {
        for (C8030b<K, V> bVar = this.f21810a[this.f21807O & i]; bVar != null; bVar = bVar.f21814P) {
            if (i == bVar.f21812N && C5827t.m25562a(obj, bVar.f22032a)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public V mo29602a(@C5952h K k, @C5952h V v) {
        return m38456a(k, v, true);
    }

    /* renamed from: a */
    private V m38456a(@C5952h K k, @C5952h V v, boolean z) {
        V v2;
        int c = m38468c((Object) k);
        int c2 = m38468c((Object) v);
        C8030b a = m38451a((Object) k, c);
        if (a != null && c2 == a.f21813O && C5827t.m25562a(v, a.f22033b)) {
            return v;
        }
        C8030b b = m38461b((Object) v, c2);
        if (b != null) {
            if (z) {
                m38457a(b);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("value already present: ");
                sb.append(v);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (a != null) {
            m38457a(a);
        }
        m38463b(new C8030b<>(k, c, v, c2));
        m38470d();
        if (a == null) {
            v2 = null;
        } else {
            v2 = a.f22033b;
        }
        return v2;
    }

    /* renamed from: b */
    private C8030b<K, V>[] m38465b(int i) {
        return new C8030b[i];
    }
}
