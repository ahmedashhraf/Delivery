package com.google.common.collect;

import com.google.common.base.C7397x;
import com.google.common.collect.C7982k4.C7983a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.e3 */
/* compiled from: ImmutableMultimap */
public abstract class C7707e3<K, V> extends C7874h<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: Q */
    final transient C8302z2<K, ? extends C8175t2<V>> f21317Q;

    /* renamed from: R */
    final transient int f21318R;

    /* renamed from: com.google.common.collect.e3$a */
    /* compiled from: ImmutableMultimap */
    class C7708a extends C7714g<Entry<K, V>> {
        C7708a() {
            super(C7707e3.this, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Entry<K, V> m36805a(K k, V v) {
            return C7800f4.m37291a(k, v);
        }
    }

    /* renamed from: com.google.common.collect.e3$b */
    /* compiled from: ImmutableMultimap */
    class C7709b extends C7714g<V> {
        C7709b() {
            super(C7707e3.this, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public V mo30130a(K k, V v) {
            return v;
        }
    }

    /* renamed from: com.google.common.collect.e3$c */
    /* compiled from: ImmutableMultimap */
    public static class C7710c<K, V> {

        /* renamed from: a */
        C7886h4<K, V> f21321a = new C7884b();

        /* renamed from: b */
        Comparator<? super K> f21322b;

        /* renamed from: c */
        Comparator<? super V> f21323c;

        /* renamed from: a */
        public C7710c<K, V> mo30133a(K k, V v) {
            C8277y.m39485a((Object) k, (Object) v);
            this.f21321a.put(k, v);
            return this;
        }

        /* renamed from: b */
        public C7710c<K, V> mo30138b(Comparator<? super V> comparator) {
            this.f21323c = (Comparator) C7397x.m35664a(comparator);
            return this;
        }

        /* renamed from: a */
        public C7710c<K, V> mo30136a(Entry<? extends K, ? extends V> entry) {
            return mo30133a((K) entry.getKey(), (V) entry.getValue());
        }

        /* renamed from: a */
        public C7710c<K, V> mo30132a(K k, Iterable<? extends V> iterable) {
            if (k != null) {
                Collection collection = this.f21321a.get(k);
                for (Object next : iterable) {
                    C8277y.m39485a((Object) k, next);
                    collection.add(next);
                }
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("null key in entry: null=");
            sb.append(C8145s3.m39049l(iterable));
            throw new NullPointerException(sb.toString());
        }

        /* renamed from: a */
        public C7710c<K, V> mo30134a(K k, V... vArr) {
            return mo30132a(k, (Iterable<? extends V>) Arrays.asList(vArr));
        }

        /* renamed from: a */
        public C7710c<K, V> mo30131a(C7886h4<? extends K, ? extends V> h4Var) {
            for (Entry entry : h4Var.mo29703j().entrySet()) {
                mo30132a((K) entry.getKey(), (Iterable) entry.getValue());
            }
            return this;
        }

        /* renamed from: a */
        public C7710c<K, V> mo30135a(Comparator<? super K> comparator) {
            this.f21322b = (Comparator) C7397x.m35664a(comparator);
            return this;
        }

        /* renamed from: a */
        public C7707e3<K, V> mo30137a() {
            if (this.f21323c != null) {
                for (List sort : this.f21321a.mo29703j().values()) {
                    Collections.sort(sort, this.f21323c);
                }
            }
            if (this.f21322b != null) {
                C7711d dVar = new C7711d();
                ArrayList<Entry> b = C8309z3.m39665b((Iterable<? extends E>) this.f21321a.mo29703j().entrySet());
                Collections.sort(b, C8133r4.m38939b(this.f21322b).mo30993f());
                for (Entry entry : b) {
                    dVar.mo29702b(entry.getKey(), (Iterable) entry.getValue());
                }
                this.f21321a = dVar;
            }
            return C7707e3.m36775b(this.f21321a);
        }
    }

    /* renamed from: com.google.common.collect.e3$d */
    /* compiled from: ImmutableMultimap */
    private static class C7711d<K, V> extends C7679e<K, V> {
        private static final long serialVersionUID = 0;

        C7711d() {
            super(new LinkedHashMap());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public Collection<V> mo29915l() {
            return C8309z3.m39648a();
        }
    }

    /* renamed from: com.google.common.collect.e3$e */
    /* compiled from: ImmutableMultimap */
    private static class C7712e<K, V> extends C8175t2<Entry<K, V>> {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        final C7707e3<K, V> f21324b;

        C7712e(C7707e3<K, V> e3Var) {
            this.f21324b = e3Var;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.f21324b.mo29884c(entry.getKey(), entry.getValue());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public boolean mo29686j() {
            return this.f21324b.mo30128l();
        }

        public int size() {
            return this.f21324b.size();
        }

        public C8023l6<Entry<K, V>> iterator() {
            return this.f21324b.m36793h();
        }
    }

    @C2777c("java serialization is not supported")
    /* renamed from: com.google.common.collect.e3$f */
    /* compiled from: ImmutableMultimap */
    static class C7713f {

        /* renamed from: a */
        static final C7986b<C7707e3> f21325a = C7984k5.m38239a(C7707e3.class, "map");

        /* renamed from: b */
        static final C7986b<C7707e3> f21326b = C7984k5.m38239a(C7707e3.class, "size");

        /* renamed from: c */
        static final C7986b<C7882h3> f21327c = C7984k5.m38239a(C7882h3.class, "emptySet");

        C7713f() {
        }
    }

    /* renamed from: com.google.common.collect.e3$g */
    /* compiled from: ImmutableMultimap */
    private abstract class C7714g<T> extends C8023l6<T> {

        /* renamed from: N */
        Iterator<V> f21328N;

        /* renamed from: a */
        final Iterator<Entry<K, Collection<V>>> f21330a;

        /* renamed from: b */
        K f21331b;

        private C7714g() {
            this.f21330a = C7707e3.this.m36797j().entrySet().iterator();
            this.f21331b = null;
            this.f21328N = C8178t3.m39086a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract T mo30130a(K k, V v);

        public boolean hasNext() {
            return this.f21330a.hasNext() || this.f21328N.hasNext();
        }

        public T next() {
            if (!this.f21328N.hasNext()) {
                Entry entry = (Entry) this.f21330a.next();
                this.f21331b = entry.getKey();
                this.f21328N = ((Collection) entry.getValue()).iterator();
            }
            return mo30130a(this.f21331b, this.f21328N.next());
        }

        /* synthetic */ C7714g(C7707e3 e3Var, C7708a aVar) {
            this();
        }
    }

    /* renamed from: com.google.common.collect.e3$h */
    /* compiled from: ImmutableMultimap */
    class C7715h extends C7793f3<K> {
        C7715h() {
        }

        /* renamed from: b */
        public int mo29708b(@C5952h Object obj) {
            Collection collection = (Collection) C7707e3.this.f21317Q.get(obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        public boolean contains(@C5952h Object obj) {
            return C7707e3.this.containsKey(obj);
        }

        /* renamed from: h */
        public Set<K> mo29710h() {
            return C7707e3.this.keySet();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public boolean mo29686j() {
            return true;
        }

        public int size() {
            return C7707e3.this.size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C7983a<K> mo29709b(int i) {
            Entry entry = (Entry) C7707e3.this.f21317Q.entrySet().mo30933e().get(i);
            return C8003l4.m38354a(entry.getKey(), ((Collection) entry.getValue()).size());
        }
    }

    /* renamed from: com.google.common.collect.e3$i */
    /* compiled from: ImmutableMultimap */
    private static final class C7716i<K, V> extends C8175t2<V> {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        private final transient C7707e3<K, V> f21333b;

        C7716i(C7707e3<K, V> e3Var) {
            this.f21333b = e3Var;
        }

        /* access modifiers changed from: 0000 */
        @C2777c("not present in emulated superclass")
        /* renamed from: a */
        public int mo29839a(Object[] objArr, int i) {
            Iterator it = this.f21333b.f21317Q.values().iterator();
            while (it.hasNext()) {
                i = ((C8175t2) it.next()).mo29839a(objArr, i);
            }
            return i;
        }

        public boolean contains(@C5952h Object obj) {
            return this.f21333b.containsValue(obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public boolean mo29686j() {
            return true;
        }

        public int size() {
            return this.f21333b.size();
        }

        public C8023l6<V> iterator() {
            return this.f21333b.m36795i();
        }
    }

    C7707e3(C8302z2<K, ? extends C8175t2<V>> z2Var, int i) {
        this.f21317Q = z2Var;
        this.f21318R = i;
    }

    /* renamed from: b */
    public static <K, V> C7707e3<K, V> m36775b(C7886h4<? extends K, ? extends V> h4Var) {
        if (h4Var instanceof C7707e3) {
            C7707e3<K, V> e3Var = (C7707e3) h4Var;
            if (!e3Var.mo30128l()) {
                return e3Var;
            }
        }
        return C8281y2.m39526b(h4Var);
    }

    /* renamed from: r */
    public static <K, V> C7710c<K, V> m36776r() {
        return new C7710c<>();
    }

    /* renamed from: s */
    public static <K, V> C7707e3<K, V> m36777s() {
        return C8281y2.m39528s();
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ boolean mo29884c(Object obj, Object obj2) {
        return super.mo29884c(obj, obj2);
    }

    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(@C5952h Object obj) {
        return this.f21317Q.containsKey(obj);
    }

    public boolean containsValue(@C5952h Object obj) {
        return obj != null && super.containsValue(obj);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public abstract C8175t2<V> get(K k);

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* renamed from: k */
    public abstract C7707e3<V, K> mo30127k();

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo30128l() {
        return this.f21317Q.mo29643f();
    }

    @Deprecated
    public boolean put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.f21318R;
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* renamed from: a */
    public static <K, V> C7707e3<K, V> m36770a(K k, V v) {
        return C8281y2.m39521a(k, v);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C8175t2<Entry<K, V>> m36785d() {
        return new C7712e(this);
    }

    @Deprecated
    /* renamed from: e */
    public C8175t2<V> m36787e(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C7793f3<K> m36789f() {
        return new C7715h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public C8175t2<V> m36791g() {
        return new C7716i(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public C8023l6<Entry<K, V>> m36793h() {
        return new C7708a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public C8023l6<V> m36795i() {
        return new C7709b();
    }

    /* renamed from: j */
    public C8302z2<K, Collection<V>> m36797j() {
        return this.f21317Q;
    }

    public C7859g3<K> keySet() {
        return this.f21317Q.keySet();
    }

    /* renamed from: m */
    public C8175t2<Entry<K, V>> m36801m() {
        return (C8175t2) super.mo29704m();
    }

    /* renamed from: n */
    public C7793f3<K> m36803n() {
        return (C7793f3) super.mo29889n();
    }

    public C8175t2<V> values() {
        return (C8175t2) super.values();
    }

    /* renamed from: a */
    public static <K, V> C7707e3<K, V> m36771a(K k, V v, K k2, V v2) {
        return C8281y2.m39522a(k, v, k2, v2);
    }

    /* renamed from: a */
    public static <K, V> C7707e3<K, V> m36772a(K k, V v, K k2, V v2, K k3, V v3) {
        return C8281y2.m39523a(k, v, k2, v2, k3, v3);
    }

    /* renamed from: a */
    public static <K, V> C7707e3<K, V> m36773a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return C8281y2.m39524a(k, v, k2, v2, k3, v3, k4, v4);
    }

    @Deprecated
    /* renamed from: b */
    public boolean mo29702b(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static <K, V> C7707e3<K, V> m36774a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return C8281y2.m39525a(k, v, k2, v2, k3, v3, k4, v4, k5, v5);
    }

    @Deprecated
    /* renamed from: a */
    public C8175t2<V> m36779a(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo29701a(C7886h4<? extends K, ? extends V> h4Var) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Map<K, Collection<V>> mo29800a() {
        throw new AssertionError("should never be called");
    }
}
