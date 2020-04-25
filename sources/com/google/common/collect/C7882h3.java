package com.google.common.collect;

import com.google.common.base.C5827t;
import com.google.common.base.C7397x;
import com.google.common.collect.C7707e3.C7710c;
import com.google.common.collect.C8302z2.C8303a;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.h3 */
/* compiled from: ImmutableSetMultimap */
public class C7882h3<K, V> extends C7707e3<K, V> implements C8022l5<K, V> {
    @C2777c("not needed in emulated source.")
    private static final long serialVersionUID = 0;

    /* renamed from: S */
    private final transient C7859g3<V> f21608S;

    /* renamed from: T */
    private transient C7882h3<V, K> f21609T;

    /* renamed from: U */
    private transient C7859g3<Entry<K, V>> f21610U;

    /* renamed from: com.google.common.collect.h3$a */
    /* compiled from: ImmutableSetMultimap */
    public static final class C7883a<K, V> extends C7710c<K, V> {
        /* renamed from: b */
        public C7883a<K, V> m37684b(Comparator<? super V> comparator) {
            super.mo30138b(comparator);
            return this;
        }

        /* renamed from: a */
        public C7883a<K, V> m37678a(K k, V v) {
            this.f21321a.put(C7397x.m35664a(k), C7397x.m35664a(v));
            return this;
        }

        /* renamed from: a */
        public C7883a<K, V> m37681a(Entry<? extends K, ? extends V> entry) {
            this.f21321a.put(C7397x.m35664a(entry.getKey()), C7397x.m35664a(entry.getValue()));
            return this;
        }

        /* renamed from: a */
        public C7883a<K, V> m37677a(K k, Iterable<? extends V> iterable) {
            Collection collection = this.f21321a.get(C7397x.m35664a(k));
            for (Object a : iterable) {
                collection.add(C7397x.m35664a(a));
            }
            return this;
        }

        /* renamed from: a */
        public C7883a<K, V> m37679a(K k, V... vArr) {
            return mo30132a((Object) k, (Iterable) Arrays.asList(vArr));
        }

        /* renamed from: a */
        public C7883a<K, V> m37676a(C7886h4<? extends K, ? extends V> h4Var) {
            for (Entry entry : h4Var.mo29703j().entrySet()) {
                mo30132a(entry.getKey(), (Iterable) entry.getValue());
            }
            return this;
        }

        /* renamed from: a */
        public C7883a<K, V> m37680a(Comparator<? super K> comparator) {
            this.f21322b = (Comparator) C7397x.m35664a(comparator);
            return this;
        }

        /* renamed from: a */
        public C7882h3<K, V> m37682a() {
            if (this.f21322b != null) {
                C7884b bVar = new C7884b();
                ArrayList<Entry> b = C8309z3.m39665b((Iterable<? extends E>) this.f21321a.mo29703j().entrySet());
                Collections.sort(b, C8133r4.m38939b(this.f21322b).mo30993f());
                for (Entry entry : b) {
                    bVar.mo29702b(entry.getKey(), (Iterable) entry.getValue());
                }
                this.f21321a = bVar;
            }
            return C7882h3.m37650b(this.f21321a, this.f21323c);
        }
    }

    /* renamed from: com.google.common.collect.h3$b */
    /* compiled from: ImmutableSetMultimap */
    private static class C7884b<K, V> extends C7679e<K, V> {
        private static final long serialVersionUID = 0;

        C7884b() {
            super(new LinkedHashMap());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public Collection<V> mo29915l() {
            return C8047m5.m38535e();
        }
    }

    /* renamed from: com.google.common.collect.h3$c */
    /* compiled from: ImmutableSetMultimap */
    private static final class C7885c<K, V> extends C7859g3<Entry<K, V>> {

        /* renamed from: P */
        private final transient C7882h3<K, V> f21611P;

        C7885c(C7882h3<K, V> h3Var) {
            this.f21611P = h3Var;
        }

        public boolean contains(@C5952h Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.f21611P.mo29884c(entry.getKey(), entry.getValue());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public boolean mo29686j() {
            return false;
        }

        public int size() {
            return this.f21611P.size();
        }

        public C8023l6<Entry<K, V>> iterator() {
            return this.f21611P.m36793h();
        }
    }

    C7882h3(C8302z2<K, C7859g3<V>> z2Var, int i, @C5952h Comparator<? super V> comparator) {
        super(z2Var, i);
        this.f21608S = m37641a(comparator);
    }

    /* renamed from: b */
    public static <K, V> C7882h3<K, V> m37649b(C7886h4<? extends K, ? extends V> h4Var) {
        return m37650b(h4Var, null);
    }

    /* renamed from: r */
    public static <K, V> C7883a<K, V> m37651r() {
        return new C7883a<>();
    }

    @C2777c("java.io.ObjectInputStream")
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            C8303a g = C8302z2.m39628g();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    Object[] objArr = new Object[readInt2];
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        objArr[i3] = objectInputStream.readObject();
                    }
                    C7859g3 a = m37642a(comparator, (Collection<? extends V>) Arrays.asList(objArr));
                    if (a.size() == objArr.length) {
                        g.mo30687a(readObject, a);
                        i2 += readInt2;
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Duplicate key-value pairs exist for key ");
                        sb.append(readObject);
                        throw new InvalidObjectException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid value count ");
                    sb2.append(readInt2);
                    throw new InvalidObjectException(sb2.toString());
                }
            }
            try {
                C7713f.f21325a.mo30742a(this, (Object) g.mo30690a());
                C7713f.f21326b.mo30741a(this, i2);
                C7713f.f21327c.mo30742a(this, (Object) m37641a(comparator));
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Invalid key count ");
            sb3.append(readInt);
            throw new InvalidObjectException(sb3.toString());
        }
    }

    /* renamed from: s */
    public static <K, V> C7882h3<K, V> m37652s() {
        return C8173t0.f21995V;
    }

    /* renamed from: t */
    private C7882h3<V, K> m37653t() {
        C7883a r = m37651r();
        Iterator it = m37667m().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            r.mo30133a(entry.getValue(), entry.getKey());
        }
        C7882h3<V, K> a = r.mo30137a();
        a.f21609T = this;
        return a;
    }

    @C2777c("java.io.ObjectOutputStream")
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(mo30553q());
        C7984k5.m38242a((C7886h4<K, V>) this, objectOutputStream);
    }

    /* access modifiers changed from: 0000 */
    @C5952h
    /* renamed from: q */
    public Comparator<? super V> mo30553q() {
        C7859g3<V> g3Var = this.f21608S;
        if (g3Var instanceof C8068n3) {
            return ((C8068n3) g3Var).comparator();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <K, V> C7882h3<K, V> m37650b(C7886h4<? extends K, ? extends V> h4Var, Comparator<? super V> comparator) {
        C7397x.m35664a(h4Var);
        if (h4Var.isEmpty() && comparator == null) {
            return m37652s();
        }
        if (h4Var instanceof C7882h3) {
            C7882h3<K, V> h3Var = (C7882h3) h4Var;
            if (!h3Var.mo30128l()) {
                return h3Var;
            }
        }
        C8303a g = C8302z2.m39628g();
        int i = 0;
        for (Entry entry : h4Var.mo29703j().entrySet()) {
            Object key = entry.getKey();
            C7859g3 a = m37642a(comparator, (Collection) entry.getValue());
            if (!a.isEmpty()) {
                g.mo30687a(key, a);
                i += a.size();
            }
        }
        return new C7882h3<>(g.mo30690a(), i, comparator);
    }

    /* renamed from: k */
    public C7882h3<V, K> m37663k() {
        C7882h3<V, K> h3Var = this.f21609T;
        if (h3Var != null) {
            return h3Var;
        }
        C7882h3<V, K> t = m37653t();
        this.f21609T = t;
        return t;
    }

    @Deprecated
    /* renamed from: e */
    public C7859g3<V> m37661e(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C7859g3<V> get(@C5952h K k) {
        return (C7859g3) C5827t.m25564b((C7859g3) this.f21317Q.get(k), this.f21608S);
    }

    /* renamed from: m */
    public C7859g3<Entry<K, V>> m37667m() {
        C7859g3<Entry<K, V>> g3Var = this.f21610U;
        if (g3Var != null) {
            return g3Var;
        }
        C7885c cVar = new C7885c(this);
        this.f21610U = cVar;
        return cVar;
    }

    /* renamed from: a */
    public static <K, V> C7882h3<K, V> m37644a(K k, V v) {
        C7883a r = m37651r();
        r.mo30133a((Object) k, (Object) v);
        return r.mo30137a();
    }

    /* renamed from: a */
    public static <K, V> C7882h3<K, V> m37645a(K k, V v, K k2, V v2) {
        C7883a r = m37651r();
        r.mo30133a((Object) k, (Object) v);
        r.mo30133a((Object) k2, (Object) v2);
        return r.mo30137a();
    }

    /* renamed from: a */
    public static <K, V> C7882h3<K, V> m37646a(K k, V v, K k2, V v2, K k3, V v3) {
        C7883a r = m37651r();
        r.mo30133a((Object) k, (Object) v);
        r.mo30133a((Object) k2, (Object) v2);
        r.mo30133a((Object) k3, (Object) v3);
        return r.mo30137a();
    }

    /* renamed from: a */
    public static <K, V> C7882h3<K, V> m37647a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C7883a r = m37651r();
        r.mo30133a((Object) k, (Object) v);
        r.mo30133a((Object) k2, (Object) v2);
        r.mo30133a((Object) k3, (Object) v3);
        r.mo30133a((Object) k4, (Object) v4);
        return r.mo30137a();
    }

    /* renamed from: a */
    public static <K, V> C7882h3<K, V> m37648a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C7883a r = m37651r();
        r.mo30133a((Object) k, (Object) v);
        r.mo30133a((Object) k2, (Object) v2);
        r.mo30133a((Object) k3, (Object) v3);
        r.mo30133a((Object) k4, (Object) v4);
        r.mo30133a((Object) k5, (Object) v5);
        return r.mo30137a();
    }

    @Deprecated
    /* renamed from: a */
    public C7859g3<V> m37657a(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private static <V> C7859g3<V> m37642a(@C5952h Comparator<? super V> comparator, Collection<? extends V> collection) {
        return comparator == null ? C7859g3.m37505a(collection) : C8068n3.m38602a(comparator, collection);
    }

    /* renamed from: a */
    private static <V> C7859g3<V> m37641a(@C5952h Comparator<? super V> comparator) {
        return comparator == null ? C7859g3.m37512m() : C8068n3.m38599a(comparator);
    }
}
