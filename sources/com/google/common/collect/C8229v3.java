package com.google.common.collect;

import com.google.common.base.C5827t;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p076c.p112d.p148d.p149a.C2778d;
import p201f.p202a.C5952h;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.v3 */
/* compiled from: LinkedHashMultimap */
public final class C8229v3<K, V> extends C7971k<K, V> {

    /* renamed from: U */
    private static final int f22047U = 16;

    /* renamed from: V */
    private static final int f22048V = 2;
    @C2778d

    /* renamed from: W */
    static final double f22049W = 1.0d;
    @C2777c("java serialization not supported")
    private static final long serialVersionUID = 1;
    @C2778d

    /* renamed from: S */
    transient int f22050S = 2;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public transient C8231b<K, V> f22051T;

    /* renamed from: com.google.common.collect.v3$a */
    /* compiled from: LinkedHashMultimap */
    class C8230a implements Iterator<Entry<K, V>> {

        /* renamed from: a */
        C8231b<K, V> f22053a = C8229v3.this.f22051T.f22060S;

        /* renamed from: b */
        C8231b<K, V> f22054b;

        C8230a() {
        }

        public boolean hasNext() {
            return this.f22053a != C8229v3.this.f22051T;
        }

        public void remove() {
            C8277y.m39486a(this.f22054b != null);
            C8229v3.this.remove(this.f22054b.getKey(), this.f22054b.getValue());
            this.f22054b = null;
        }

        public Entry<K, V> next() {
            if (hasNext()) {
                C8231b<K, V> bVar = this.f22053a;
                this.f22054b = bVar;
                this.f22053a = bVar.f22060S;
                return bVar;
            }
            throw new NoSuchElementException();
        }
    }

    @C2778d
    /* renamed from: com.google.common.collect.v3$b */
    /* compiled from: LinkedHashMultimap */
    static final class C8231b<K, V> extends C8214u2<K, V> implements C8234d<K, V> {

        /* renamed from: N */
        final int f22055N;
        @C5952h

        /* renamed from: O */
        C8231b<K, V> f22056O;

        /* renamed from: P */
        C8234d<K, V> f22057P;

        /* renamed from: Q */
        C8234d<K, V> f22058Q;

        /* renamed from: R */
        C8231b<K, V> f22059R;

        /* renamed from: S */
        C8231b<K, V> f22060S;

        C8231b(@C5952h K k, @C5952h V v, int i, @C5952h C8231b<K, V> bVar) {
            super(k, v);
            this.f22055N = i;
            this.f22056O = bVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo31132a(@C5952h Object obj, int i) {
            return this.f22055N == i && C5827t.m25562a(getValue(), obj);
        }

        /* renamed from: b */
        public void mo31134b(C8234d<K, V> dVar) {
            this.f22057P = dVar;
        }

        /* renamed from: d */
        public C8231b<K, V> mo31135d() {
            return this.f22060S;
        }

        /* renamed from: e */
        public C8234d<K, V> mo31136e() {
            return this.f22057P;
        }

        /* renamed from: f */
        public C8234d<K, V> mo31137f() {
            return this.f22058Q;
        }

        /* renamed from: a */
        public void mo31131a(C8234d<K, V> dVar) {
            this.f22058Q = dVar;
        }

        /* renamed from: b */
        public void mo31133b(C8231b<K, V> bVar) {
            this.f22060S = bVar;
        }

        /* renamed from: a */
        public C8231b<K, V> mo31129a() {
            return this.f22059R;
        }

        /* renamed from: a */
        public void mo31130a(C8231b<K, V> bVar) {
            this.f22059R = bVar;
        }
    }

    @C2778d
    /* renamed from: com.google.common.collect.v3$c */
    /* compiled from: LinkedHashMultimap */
    final class C8232c extends C8055g<V> implements C8234d<K, V> {

        /* renamed from: N */
        private int f22061N = 0;
        /* access modifiers changed from: private */

        /* renamed from: O */
        public int f22062O = 0;
        /* access modifiers changed from: private */

        /* renamed from: P */
        public C8234d<K, V> f22063P;

        /* renamed from: Q */
        private C8234d<K, V> f22064Q;

        /* renamed from: a */
        private final K f22066a;
        @C2778d

        /* renamed from: b */
        C8231b<K, V>[] f22067b;

        /* renamed from: com.google.common.collect.v3$c$a */
        /* compiled from: LinkedHashMultimap */
        class C8233a implements Iterator<V> {

            /* renamed from: N */
            int f22068N = C8232c.this.f22062O;

            /* renamed from: a */
            C8234d<K, V> f22070a = C8232c.this.f22063P;

            /* renamed from: b */
            C8231b<K, V> f22071b;

            C8233a() {
            }

            /* renamed from: b */
            private void m39275b() {
                if (C8232c.this.f22062O != this.f22068N) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                m39275b();
                return this.f22070a != C8232c.this;
            }

            public V next() {
                if (hasNext()) {
                    C8231b<K, V> bVar = (C8231b) this.f22070a;
                    V value = bVar.getValue();
                    this.f22071b = bVar;
                    this.f22070a = bVar.mo31137f();
                    return value;
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                m39275b();
                C8277y.m39486a(this.f22071b != null);
                C8232c.this.remove(this.f22071b.getValue());
                this.f22068N = C8232c.this.f22062O;
                this.f22071b = null;
            }
        }

        C8232c(K k, int i) {
            this.f22066a = k;
            this.f22063P = this;
            this.f22064Q = this;
            this.f22067b = new C8231b[C8093p2.m38751a(i, C8229v3.f22049W)];
        }

        /* renamed from: c */
        private void m39270c() {
            if (C8093p2.m38753a(this.f22061N, this.f22067b.length, C8229v3.f22049W)) {
                C8231b<K, V>[] bVarArr = new C8231b[(this.f22067b.length * 2)];
                this.f22067b = bVarArr;
                int length = bVarArr.length - 1;
                for (C8234d<K, V> dVar = this.f22063P; dVar != this; dVar = dVar.mo31137f()) {
                    C8231b<K, V> bVar = (C8231b) dVar;
                    int i = bVar.f22055N & length;
                    bVar.f22056O = bVarArr[i];
                    bVarArr[i] = bVar;
                }
            }
        }

        public boolean add(@C5952h V v) {
            int a = C8093p2.m38752a((Object) v);
            int b = m39268b() & a;
            C8231b<K, V> bVar = this.f22067b[b];
            for (C8231b<K, V> bVar2 = bVar; bVar2 != null; bVar2 = bVar2.f22056O) {
                if (bVar2.mo31132a(v, a)) {
                    return false;
                }
            }
            C8231b<K, V> bVar3 = new C8231b<>(this.f22066a, v, a, bVar);
            C8229v3.m39241b(this.f22064Q, (C8234d<K, V>) bVar3);
            C8229v3.m39241b((C8234d<K, V>) bVar3, (C8234d<K, V>) this);
            C8229v3.m39239b(C8229v3.this.f22051T.mo31129a(), bVar3);
            C8229v3.m39239b(bVar3, C8229v3.this.f22051T);
            this.f22067b[b] = bVar3;
            this.f22061N++;
            this.f22062O++;
            m39270c();
            return true;
        }

        public void clear() {
            Arrays.fill(this.f22067b, null);
            this.f22061N = 0;
            for (C8234d<K, V> dVar = this.f22063P; dVar != this; dVar = dVar.mo31137f()) {
                C8229v3.m39238b((C8231b) dVar);
            }
            C8229v3.m39241b((C8234d<K, V>) this, (C8234d<K, V>) this);
            this.f22062O++;
        }

        public boolean contains(@C5952h Object obj) {
            int a = C8093p2.m38752a(obj);
            for (C8231b<K, V> bVar = this.f22067b[m39268b() & a]; bVar != null; bVar = bVar.f22056O) {
                if (bVar.mo31132a(obj, a)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public C8234d<K, V> mo31136e() {
            return this.f22064Q;
        }

        /* renamed from: f */
        public C8234d<K, V> mo31137f() {
            return this.f22063P;
        }

        public Iterator<V> iterator() {
            return new C8233a();
        }

        public boolean remove(@C5952h Object obj) {
            int a = C8093p2.m38752a(obj);
            int b = m39268b() & a;
            C8231b<K, V> bVar = this.f22067b[b];
            C8231b<K, V> bVar2 = null;
            while (true) {
                C8231b<K, V> bVar3 = bVar2;
                bVar2 = bVar;
                C8231b<K, V> bVar4 = bVar3;
                if (bVar2 == null) {
                    return false;
                }
                if (bVar2.mo31132a(obj, a)) {
                    if (bVar4 == null) {
                        this.f22067b[b] = bVar2.f22056O;
                    } else {
                        bVar4.f22056O = bVar2.f22056O;
                    }
                    C8229v3.m39240b((C8234d<K, V>) bVar2);
                    C8229v3.m39238b(bVar2);
                    this.f22061N--;
                    this.f22062O++;
                    return true;
                }
                bVar = bVar2.f22056O;
            }
        }

        public int size() {
            return this.f22061N;
        }

        /* renamed from: b */
        private int m39268b() {
            return this.f22067b.length - 1;
        }

        /* renamed from: a */
        public void mo31131a(C8234d<K, V> dVar) {
            this.f22063P = dVar;
        }

        /* renamed from: b */
        public void mo31134b(C8234d<K, V> dVar) {
            this.f22064Q = dVar;
        }
    }

    /* renamed from: com.google.common.collect.v3$d */
    /* compiled from: LinkedHashMultimap */
    private interface C8234d<K, V> {
        /* renamed from: a */
        void mo31131a(C8234d<K, V> dVar);

        /* renamed from: b */
        void mo31134b(C8234d<K, V> dVar);

        /* renamed from: e */
        C8234d<K, V> mo31136e();

        /* renamed from: f */
        C8234d<K, V> mo31137f();
    }

    private C8229v3(int i, int i2) {
        super(new LinkedHashMap(i));
        C8277y.m39484a(i2, "expectedValuesPerKey");
        this.f22050S = i2;
        this.f22051T = new C8231b<>(null, null, 0, null);
        C8231b<K, V> bVar = this.f22051T;
        m39239b(bVar, bVar);
    }

    @C2777c("java.io.ObjectInputStream")
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f22051T = new C8231b<>(null, null, 0, null);
        C8231b<K, V> bVar = this.f22051T;
        m39239b(bVar, bVar);
        this.f22050S = objectInputStream.readInt();
        int readInt = objectInputStream.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7800f4.m37271a(readInt));
        for (int i = 0; i < readInt; i++) {
            Object readObject = objectInputStream.readObject();
            linkedHashMap.put(readObject, mo29997a((K) readObject));
        }
        int readInt2 = objectInputStream.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            Object readObject2 = objectInputStream.readObject();
            ((Collection) linkedHashMap.get(readObject2)).add(objectInputStream.readObject());
        }
        mo30000a((Map<K, Collection<V>>) linkedHashMap);
    }

    /* renamed from: s */
    public static <K, V> C8229v3<K, V> m39242s() {
        return new C8229v3<>(16, 2);
    }

    @C2777c("java.io.ObjectOutputStream")
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f22050S);
        objectOutputStream.writeInt(keySet().size());
        for (Object writeObject : keySet()) {
            objectOutputStream.writeObject(writeObject);
        }
        objectOutputStream.writeInt(size());
        for (Entry entry : mo29704m()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo29701a(C7886h4 h4Var) {
        return super.mo29701a(h4Var);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo29702b(Object obj, Iterable iterable) {
        return super.mo29702b(obj, iterable);
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ boolean mo29884c(Object obj, Object obj2) {
        return super.mo29884c(obj, obj2);
    }

    public void clear() {
        super.clear();
        C8231b<K, V> bVar = this.f22051T;
        m39239b(bVar, bVar);
    }

    public /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ Set mo29699e(Object obj) {
        return super.mo29699e(obj);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ Set get(Object obj) {
        return super.get(obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public Iterator<Entry<K, V>> mo29807h() {
        return new C8230a();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public Iterator<V> mo30002i() {
        return C7800f4.m37319b(mo29807h());
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* renamed from: j */
    public /* bridge */ /* synthetic */ Map mo29703j() {
        return super.mo29703j();
    }

    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    /* renamed from: n */
    public /* bridge */ /* synthetic */ C7982k4 mo29889n() {
        return super.mo29889n();
    }

    public /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public Collection<V> values() {
        return super.values();
    }

    /* renamed from: b */
    public static <K, V> C8229v3<K, V> m39237b(C7886h4<? extends K, ? extends V> h4Var) {
        C8229v3<K, V> a = m39232a(h4Var.keySet().size(), 2);
        a.mo29701a((C7886h4) h4Var);
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public Set<V> m39254l() {
        return new LinkedHashSet(this.f22050S);
    }

    /* renamed from: m */
    public Set<Entry<K, V>> m39256m() {
        return super.mo29704m();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <K, V> void m39241b(C8234d<K, V> dVar, C8234d<K, V> dVar2) {
        dVar.mo31131a(dVar2);
        dVar2.mo31134b(dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <K, V> void m39239b(C8231b<K, V> bVar, C8231b<K, V> bVar2) {
        bVar.mo31133b(bVar2);
        bVar2.mo31130a(bVar);
    }

    /* renamed from: a */
    public static <K, V> C8229v3<K, V> m39232a(int i, int i2) {
        return new C8229v3<>(C7800f4.m37271a(i), C7800f4.m37271a(i2));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <K, V> void m39240b(C8234d<K, V> dVar) {
        m39241b(dVar.mo31136e(), dVar.mo31137f());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <K, V> void m39238b(C8231b<K, V> bVar) {
        m39239b(bVar.mo31129a(), bVar.mo31135d());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Collection<V> mo29997a(K k) {
        return new C8232c(k, this.f22050S);
    }

    /* renamed from: a */
    public Set<V> m39245a(@C5952h K k, Iterable<? extends V> iterable) {
        return super.mo29698a((Object) k, (Iterable) iterable);
    }
}
