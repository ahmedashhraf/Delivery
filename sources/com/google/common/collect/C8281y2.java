package com.google.common.collect;

import com.google.common.collect.C7707e3.C7710c;
import com.google.common.collect.C8302z2.C8303a;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.y2 */
/* compiled from: ImmutableListMultimap */
public class C8281y2<K, V> extends C7707e3<K, V> implements C8283y3<K, V> {
    @C2777c("Not needed in emulated source")
    private static final long serialVersionUID = 0;

    /* renamed from: S */
    private transient C8281y2<V, K> f22145S;

    /* renamed from: com.google.common.collect.y2$a */
    /* compiled from: ImmutableListMultimap */
    public static final class C8282a<K, V> extends C7710c<K, V> {
        /* renamed from: b */
        public C8282a<K, V> m39555b(Comparator<? super V> comparator) {
            super.mo30138b(comparator);
            return this;
        }

        /* renamed from: a */
        public C8282a<K, V> m39549a(K k, V v) {
            super.mo30133a(k, v);
            return this;
        }

        /* renamed from: a */
        public C8282a<K, V> m39552a(Entry<? extends K, ? extends V> entry) {
            super.mo30136a(entry);
            return this;
        }

        /* renamed from: a */
        public C8282a<K, V> m39548a(K k, Iterable<? extends V> iterable) {
            super.mo30132a(k, iterable);
            return this;
        }

        /* renamed from: a */
        public C8282a<K, V> m39550a(K k, V... vArr) {
            super.mo30134a(k, vArr);
            return this;
        }

        /* renamed from: a */
        public C8282a<K, V> m39547a(C7886h4<? extends K, ? extends V> h4Var) {
            super.mo30131a(h4Var);
            return this;
        }

        /* renamed from: a */
        public C8282a<K, V> m39551a(Comparator<? super K> comparator) {
            super.mo30135a(comparator);
            return this;
        }

        /* renamed from: a */
        public C8281y2<K, V> m39553a() {
            return (C8281y2) super.mo30137a();
        }
    }

    C8281y2(C8302z2<K, C8257x2<V>> z2Var, int i) {
        super(z2Var, i);
    }

    /* renamed from: b */
    public static <K, V> C8281y2<K, V> m39526b(C7886h4<? extends K, ? extends V> h4Var) {
        if (h4Var.isEmpty()) {
            return m39528s();
        }
        if (h4Var instanceof C8281y2) {
            C8281y2<K, V> y2Var = (C8281y2) h4Var;
            if (!y2Var.mo30128l()) {
                return y2Var;
            }
        }
        C8303a g = C8302z2.m39628g();
        int i = 0;
        for (Entry entry : h4Var.mo29703j().entrySet()) {
            C8257x2 a = C8257x2.m39405a((Collection) entry.getValue());
            if (!a.isEmpty()) {
                g.mo30687a(entry.getKey(), a);
                i += a.size();
            }
        }
        return new C8281y2<>(g.mo30690a(), i);
    }

    /* renamed from: r */
    public static <K, V> C8282a<K, V> m39527r() {
        return new C8282a<>();
    }

    @C2777c("java.io.ObjectInputStream")
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
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
                    g.mo30687a(readObject, C8257x2.m39410c(objArr));
                    i2 += readInt2;
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid value count ");
                    sb.append(readInt2);
                    throw new InvalidObjectException(sb.toString());
                }
            }
            try {
                C7713f.f21325a.mo30742a(this, (Object) g.mo30690a());
                C7713f.f21326b.mo30741a(this, i2);
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid key count ");
            sb2.append(readInt);
            throw new InvalidObjectException(sb2.toString());
        }
    }

    /* renamed from: s */
    public static <K, V> C8281y2<K, V> m39528s() {
        return C8123r0.f21938T;
    }

    /* renamed from: t */
    private C8281y2<V, K> m39529t() {
        C8282a r = m39527r();
        Iterator it = m36801m().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            r.mo30133a(entry.getValue(), entry.getKey());
        }
        C8281y2<V, K> a = r.mo30137a();
        a.f22145S = this;
        return a;
    }

    @C2777c("java.io.ObjectOutputStream")
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C7984k5.m38242a((C7886h4<K, V>) this, objectOutputStream);
    }

    /* renamed from: k */
    public C8281y2<V, K> m39539k() {
        C8281y2<V, K> y2Var = this.f22145S;
        if (y2Var != null) {
            return y2Var;
        }
        C8281y2<V, K> t = m39529t();
        this.f22145S = t;
        return t;
    }

    /* renamed from: a */
    public static <K, V> C8281y2<K, V> m39521a(K k, V v) {
        C8282a r = m39527r();
        r.mo30133a((Object) k, (Object) v);
        return r.mo30137a();
    }

    @Deprecated
    /* renamed from: e */
    public C8257x2<V> m39535e(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C8257x2<V> get(@C5952h K k) {
        C8257x2<V> x2Var = (C8257x2) this.f21317Q.get(k);
        return x2Var == null ? C8257x2.m39412m() : x2Var;
    }

    /* renamed from: a */
    public static <K, V> C8281y2<K, V> m39522a(K k, V v, K k2, V v2) {
        C8282a r = m39527r();
        r.mo30133a((Object) k, (Object) v);
        r.mo30133a((Object) k2, (Object) v2);
        return r.mo30137a();
    }

    /* renamed from: a */
    public static <K, V> C8281y2<K, V> m39523a(K k, V v, K k2, V v2, K k3, V v3) {
        C8282a r = m39527r();
        r.mo30133a((Object) k, (Object) v);
        r.mo30133a((Object) k2, (Object) v2);
        r.mo30133a((Object) k3, (Object) v3);
        return r.mo30137a();
    }

    /* renamed from: a */
    public static <K, V> C8281y2<K, V> m39524a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C8282a r = m39527r();
        r.mo30133a((Object) k, (Object) v);
        r.mo30133a((Object) k2, (Object) v2);
        r.mo30133a((Object) k3, (Object) v3);
        r.mo30133a((Object) k4, (Object) v4);
        return r.mo30137a();
    }

    /* renamed from: a */
    public static <K, V> C8281y2<K, V> m39525a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C8282a r = m39527r();
        r.mo30133a((Object) k, (Object) v);
        r.mo30133a((Object) k2, (Object) v2);
        r.mo30133a((Object) k3, (Object) v3);
        r.mo30133a((Object) k4, (Object) v4);
        r.mo30133a((Object) k5, (Object) v5);
        return r.mo30137a();
    }

    @Deprecated
    /* renamed from: a */
    public C8257x2<V> m39531a(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }
}
