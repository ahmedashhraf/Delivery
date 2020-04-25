package com.google.common.collect;

import com.google.common.base.C7359j;
import com.google.common.base.C7365j0;
import com.google.common.base.C7397x;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import p076c.p112d.p148d.p149a.C2778d;
import p076c.p112d.p148d.p150g.C6637f;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.common.collect.e4 */
/* compiled from: MapMakerInternalMap */
class C7717e4<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* renamed from: d0 */
    static final int f21334d0 = 1073741824;

    /* renamed from: e0 */
    static final int f21335e0 = 65536;

    /* renamed from: f0 */
    static final int f21336f0 = 3;

    /* renamed from: g0 */
    static final int f21337g0 = 63;

    /* renamed from: h0 */
    static final int f21338h0 = 16;

    /* renamed from: i0 */
    static final long f21339i0 = 60;

    /* renamed from: j0 */
    private static final Logger f21340j0 = Logger.getLogger(C7717e4.class.getName());

    /* renamed from: k0 */
    static final C7725d0<Object, Object> f21341k0 = new C7718a();

    /* renamed from: l0 */
    static final Queue<? extends Object> f21342l0 = new C7720b();
    private static final long serialVersionUID = 5;

    /* renamed from: N */
    final transient C7756p<K, V>[] f21343N;

    /* renamed from: O */
    final int f21344O;

    /* renamed from: P */
    final C7359j<Object> f21345P;

    /* renamed from: Q */
    final C7359j<Object> f21346Q = this.f21348S.mo30305d();

    /* renamed from: R */
    final C7763w f21347R;

    /* renamed from: S */
    final C7763w f21348S;

    /* renamed from: T */
    final int f21349T;

    /* renamed from: U */
    final long f21350U;

    /* renamed from: V */
    final long f21351V;

    /* renamed from: W */
    final Queue<C7672g<K, V>> f21352W;

    /* renamed from: X */
    final C7671f<K, V> f21353X;

    /* renamed from: Y */
    final transient C7728f f21354Y;

    /* renamed from: Z */
    final C7365j0 f21355Z;

    /* renamed from: a */
    final transient int f21356a;

    /* renamed from: a0 */
    transient Set<K> f21357a0;

    /* renamed from: b */
    final transient int f21358b;

    /* renamed from: b0 */
    transient Collection<V> f21359b0;

    /* renamed from: c0 */
    transient Set<Entry<K, V>> f21360c0;

    /* renamed from: com.google.common.collect.e4$a */
    /* compiled from: MapMakerInternalMap */
    static class C7718a implements C7725d0<Object, Object> {
        C7718a() {
        }

        /* renamed from: a */
        public C7725d0<Object, Object> mo29921a(ReferenceQueue<Object> referenceQueue, @C5952h Object obj, C7755o<Object, Object> oVar) {
            return this;
        }

        /* renamed from: a */
        public Object mo29922a() {
            return null;
        }

        /* renamed from: a */
        public void mo29923a(C7725d0<Object, Object> d0Var) {
        }

        /* renamed from: b */
        public C7755o<Object, Object> mo29924b() {
            return null;
        }

        /* renamed from: c */
        public boolean mo29925c() {
            return false;
        }

        public Object get() {
            return null;
        }
    }

    /* renamed from: com.google.common.collect.e4$a0 */
    /* compiled from: MapMakerInternalMap */
    static final class C7719a0<K, V> extends C7767x<K, V> implements C7755o<K, V> {

        /* renamed from: P */
        volatile long f21361P = Long.MAX_VALUE;
        @C5966a("Segment.this")

        /* renamed from: Q */
        C7755o<K, V> f21362Q = C7717e4.m36830l();
        @C5966a("Segment.this")

        /* renamed from: R */
        C7755o<K, V> f21363R = C7717e4.m36830l();
        @C5966a("Segment.this")

        /* renamed from: S */
        C7755o<K, V> f21364S = C7717e4.m36830l();
        @C5966a("Segment.this")

        /* renamed from: T */
        C7755o<K, V> f21365T = C7717e4.m36830l();

        C7719a0(K k, int i, @C5952h C7755o<K, V> oVar) {
            super(k, i, oVar);
        }

        /* renamed from: a */
        public void mo30178a(long j) {
            this.f21361P = j;
        }

        /* renamed from: b */
        public void mo30180b(C7755o<K, V> oVar) {
            this.f21364S = oVar;
        }

        /* renamed from: c */
        public void mo30181c(C7755o<K, V> oVar) {
            this.f21362Q = oVar;
        }

        /* renamed from: d */
        public void mo30182d(C7755o<K, V> oVar) {
            this.f21363R = oVar;
        }

        /* renamed from: g */
        public C7755o<K, V> mo30183g() {
            return this.f21365T;
        }

        /* renamed from: h */
        public C7755o<K, V> mo30184h() {
            return this.f21364S;
        }

        /* renamed from: j */
        public C7755o<K, V> mo30185j() {
            return this.f21362Q;
        }

        /* renamed from: k */
        public long mo30186k() {
            return this.f21361P;
        }

        /* renamed from: p */
        public C7755o<K, V> mo30187p() {
            return this.f21363R;
        }

        /* renamed from: a */
        public void mo30179a(C7755o<K, V> oVar) {
            this.f21365T = oVar;
        }
    }

    /* renamed from: com.google.common.collect.e4$b */
    /* compiled from: MapMakerInternalMap */
    static class C7720b extends AbstractQueue<Object> {
        C7720b() {
        }

        public Iterator<Object> iterator() {
            return C8178t3.m39086a();
        }

        public boolean offer(Object obj) {
            return true;
        }

        public Object peek() {
            return null;
        }

        public Object poll() {
            return null;
        }

        public int size() {
            return 0;
        }
    }

    /* renamed from: com.google.common.collect.e4$b0 */
    /* compiled from: MapMakerInternalMap */
    static final class C7721b0<K, V> implements C7725d0<K, V> {

        /* renamed from: a */
        final V f21366a;

        C7721b0(V v) {
            this.f21366a = v;
        }

        /* renamed from: a */
        public C7725d0<K, V> mo29921a(ReferenceQueue<V> referenceQueue, V v, C7755o<K, V> oVar) {
            return this;
        }

        /* renamed from: a */
        public V mo29922a() {
            return get();
        }

        /* renamed from: a */
        public void mo29923a(C7725d0<K, V> d0Var) {
        }

        /* renamed from: b */
        public C7755o<K, V> mo29924b() {
            return null;
        }

        /* renamed from: c */
        public boolean mo29925c() {
            return false;
        }

        public V get() {
            return this.f21366a;
        }
    }

    /* renamed from: com.google.common.collect.e4$c */
    /* compiled from: MapMakerInternalMap */
    static abstract class C7722c<K, V> implements C7755o<K, V> {
        C7722c() {
        }

        /* renamed from: a */
        public void mo30193a(C7725d0<K, V> d0Var) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo30180b(C7755o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public void mo30181c(C7755o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public C7755o<K, V> mo30194d() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public C7725d0<K, V> mo30195e() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public int mo30196f() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public C7755o<K, V> mo30183g() {
            throw new UnsupportedOperationException();
        }

        public K getKey() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: h */
        public C7755o<K, V> mo30184h() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: j */
        public C7755o<K, V> mo30185j() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: k */
        public long mo30186k() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: p */
        public C7755o<K, V> mo30187p() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo30178a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo30182d(C7755o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo30179a(C7755o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.common.collect.e4$c0 */
    /* compiled from: MapMakerInternalMap */
    final class C7723c0 extends C7750k<V> {
        C7723c0() {
            super();
        }

        public V next() {
            return mo30242c().getValue();
        }
    }

    /* renamed from: com.google.common.collect.e4$d */
    /* compiled from: MapMakerInternalMap */
    static abstract class C7724d<K, V> extends C8027m1<K, V> implements Serializable {
        private static final long serialVersionUID = 3;

        /* renamed from: N */
        final C7359j<Object> f21368N;

        /* renamed from: O */
        final C7359j<Object> f21369O;

        /* renamed from: P */
        final long f21370P;

        /* renamed from: Q */
        final long f21371Q;

        /* renamed from: R */
        final int f21372R;

        /* renamed from: S */
        final int f21373S;

        /* renamed from: T */
        final C7671f<? super K, ? super V> f21374T;

        /* renamed from: U */
        transient ConcurrentMap<K, V> f21375U;

        /* renamed from: a */
        final C7763w f21376a;

        /* renamed from: b */
        final C7763w f21377b;

        C7724d(C7763w wVar, C7763w wVar2, C7359j<Object> jVar, C7359j<Object> jVar2, long j, long j2, int i, int i2, C7671f<? super K, ? super V> fVar, ConcurrentMap<K, V> concurrentMap) {
            this.f21376a = wVar;
            this.f21377b = wVar2;
            this.f21368N = jVar;
            this.f21369O = jVar2;
            this.f21370P = j;
            this.f21371Q = j2;
            this.f21372R = i;
            this.f21373S = i2;
            this.f21374T = fVar;
            this.f21375U = concurrentMap;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30200a(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeInt(this.f21375U.size());
            for (Entry entry : this.f21375U.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C7660d4 mo30201b(ObjectInputStream objectInputStream) throws IOException {
            C7660d4 a = new C7660d4().m36623b(objectInputStream.readInt()).mo29946a(this.f21376a).mo29951b(this.f21377b).m36616a(this.f21368N).m36614a(this.f21373S);
            a.mo29947a(this.f21374T);
            long j = this.f21370P;
            if (j > 0) {
                a.m36624b(j, TimeUnit.NANOSECONDS);
            }
            long j2 = this.f21371Q;
            if (j2 > 0) {
                a.m36615a(j2, TimeUnit.NANOSECONDS);
            }
            int i = this.f21372R;
            if (i != -1) {
                a.m36626c(i);
            }
            return a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public ConcurrentMap<K, V> m36892y() {
            return this.f21375U;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30199a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            while (true) {
                Object readObject = objectInputStream.readObject();
                if (readObject != null) {
                    this.f21375U.put(readObject, objectInputStream.readObject());
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.google.common.collect.e4$d0 */
    /* compiled from: MapMakerInternalMap */
    interface C7725d0<K, V> {
        /* renamed from: a */
        C7725d0<K, V> mo29921a(ReferenceQueue<V> referenceQueue, @C5952h V v, C7755o<K, V> oVar);

        /* renamed from: a */
        V mo29922a() throws ExecutionException;

        /* renamed from: a */
        void mo29923a(@C5952h C7725d0<K, V> d0Var);

        /* renamed from: b */
        C7755o<K, V> mo29924b();

        /* renamed from: c */
        boolean mo29925c();

        V get();
    }

    /* renamed from: com.google.common.collect.e4$e */
    /* compiled from: MapMakerInternalMap */
    static final class C7726e implements Runnable {

        /* renamed from: a */
        final WeakReference<C7717e4<?, ?>> f21378a;

        public C7726e(C7717e4<?, ?> e4Var) {
            this.f21378a = new WeakReference<>(e4Var);
        }

        public void run() {
            C7717e4 e4Var = (C7717e4) this.f21378a.get();
            if (e4Var != null) {
                for (C7756p<K, V> q : e4Var.f21343N) {
                    q.mo30299q();
                }
                return;
            }
            throw new CancellationException();
        }
    }

    /* renamed from: com.google.common.collect.e4$e0 */
    /* compiled from: MapMakerInternalMap */
    final class C7727e0 extends AbstractCollection<V> {
        C7727e0() {
        }

        public void clear() {
            C7717e4.this.clear();
        }

        public boolean contains(Object obj) {
            return C7717e4.this.containsValue(obj);
        }

        public boolean isEmpty() {
            return C7717e4.this.isEmpty();
        }

        public Iterator<V> iterator() {
            return new C7723c0();
        }

        public int size() {
            return C7717e4.this.size();
        }
    }

    /* renamed from: com.google.common.collect.e4$f */
    /* compiled from: MapMakerInternalMap */
    enum C7728f {
        STRONG {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7755o<K, V> mo30209a(C7756p<K, V> pVar, K k, int i, @C5952h C7755o<K, V> oVar) {
                return new C7767x(k, i, oVar);
            }
        },
        STRONG_EXPIRABLE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7755o<K, V> mo30209a(C7756p<K, V> pVar, K k, int i, @C5952h C7755o<K, V> oVar) {
                return new C7769z(k, i, oVar);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7755o<K, V> mo30208a(C7756p<K, V> pVar, C7755o<K, V> oVar, C7755o<K, V> oVar2) {
                C7755o<K, V> a = super.mo30208a(pVar, oVar, oVar2);
                mo30211b(oVar, a);
                return a;
            }
        },
        STRONG_EVICTABLE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7755o<K, V> mo30209a(C7756p<K, V> pVar, K k, int i, @C5952h C7755o<K, V> oVar) {
                return new C7768y(k, i, oVar);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7755o<K, V> mo30208a(C7756p<K, V> pVar, C7755o<K, V> oVar, C7755o<K, V> oVar2) {
                C7755o<K, V> a = super.mo30208a(pVar, oVar, oVar2);
                mo30210a(oVar, a);
                return a;
            }
        },
        STRONG_EXPIRABLE_EVICTABLE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7755o<K, V> mo30209a(C7756p<K, V> pVar, K k, int i, @C5952h C7755o<K, V> oVar) {
                return new C7719a0(k, i, oVar);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7755o<K, V> mo30208a(C7756p<K, V> pVar, C7755o<K, V> oVar, C7755o<K, V> oVar2) {
                C7755o<K, V> a = super.mo30208a(pVar, oVar, oVar2);
                mo30211b(oVar, a);
                mo30210a(oVar, a);
                return a;
            }
        },
        WEAK {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7755o<K, V> mo30209a(C7756p<K, V> pVar, K k, int i, @C5952h C7755o<K, V> oVar) {
                return new C7737f0(pVar.f21423R, k, i, oVar);
            }
        },
        WEAK_EXPIRABLE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7755o<K, V> mo30209a(C7756p<K, V> pVar, K k, int i, @C5952h C7755o<K, V> oVar) {
                return new C7741h0(pVar.f21423R, k, i, oVar);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7755o<K, V> mo30208a(C7756p<K, V> pVar, C7755o<K, V> oVar, C7755o<K, V> oVar2) {
                C7755o<K, V> a = super.mo30208a(pVar, oVar, oVar2);
                mo30211b(oVar, a);
                return a;
            }
        },
        WEAK_EVICTABLE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7755o<K, V> mo30209a(C7756p<K, V> pVar, K k, int i, @C5952h C7755o<K, V> oVar) {
                return new C7739g0(pVar.f21423R, k, i, oVar);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7755o<K, V> mo30208a(C7756p<K, V> pVar, C7755o<K, V> oVar, C7755o<K, V> oVar2) {
                C7755o<K, V> a = super.mo30208a(pVar, oVar, oVar2);
                mo30210a(oVar, a);
                return a;
            }
        },
        WEAK_EXPIRABLE_EVICTABLE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7755o<K, V> mo30209a(C7756p<K, V> pVar, K k, int i, @C5952h C7755o<K, V> oVar) {
                return new C7745i0(pVar.f21423R, k, i, oVar);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7755o<K, V> mo30208a(C7756p<K, V> pVar, C7755o<K, V> oVar, C7755o<K, V> oVar2) {
                C7755o<K, V> a = super.mo30208a(pVar, oVar, oVar2);
                mo30211b(oVar, a);
                mo30210a(oVar, a);
                return a;
            }
        };
        
        static final int EVICTABLE_MASK = 2;
        static final int EXPIRABLE_MASK = 1;
        static final C7728f[][] factories = null;

        static {
            C7728f fVar;
            C7728f fVar2;
            C7728f fVar3;
            C7728f fVar4;
            C7728f fVar5;
            C7728f fVar6;
            C7728f fVar7;
            C7728f fVar8;
            factories = new C7728f[][]{new C7728f[]{fVar, fVar2, fVar3, fVar4}, new C7728f[0], new C7728f[]{fVar5, fVar6, fVar7, fVar8}};
        }

        /* renamed from: a */
        static C7728f m36898a(C7763w wVar, boolean z, boolean z2) {
            return factories[wVar.ordinal()][z | (z2 ? (char) 2 : 0)];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract <K, V> C7755o<K, V> mo30209a(C7756p<K, V> pVar, K k, int i, @C5952h C7755o<K, V> oVar);

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: b */
        public <K, V> void mo30211b(C7755o<K, V> oVar, C7755o<K, V> oVar2) {
            oVar2.mo30178a(oVar.mo30186k());
            C7717e4.m36826c(oVar.mo30187p(), oVar2);
            C7717e4.m36826c(oVar2, oVar.mo30185j());
            C7717e4.m36828f(oVar);
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: a */
        public <K, V> C7755o<K, V> mo30208a(C7756p<K, V> pVar, C7755o<K, V> oVar, C7755o<K, V> oVar2) {
            return mo30209a(pVar, oVar.getKey(), oVar.mo30196f(), oVar2);
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: a */
        public <K, V> void mo30210a(C7755o<K, V> oVar, C7755o<K, V> oVar2) {
            C7717e4.m36824b(oVar.mo30183g(), oVar2);
            C7717e4.m36824b(oVar2, oVar.mo30184h());
            C7717e4.m36827e(oVar);
        }
    }

    /* renamed from: com.google.common.collect.e4$f0 */
    /* compiled from: MapMakerInternalMap */
    static class C7737f0<K, V> extends WeakReference<K> implements C7755o<K, V> {

        /* renamed from: N */
        volatile C7725d0<K, V> f21380N = C7717e4.m36831m();

        /* renamed from: a */
        final int f21381a;

        /* renamed from: b */
        final C7755o<K, V> f21382b;

        C7737f0(ReferenceQueue<K> referenceQueue, K k, int i, @C5952h C7755o<K, V> oVar) {
            super(k, referenceQueue);
            this.f21381a = i;
            this.f21382b = oVar;
        }

        /* renamed from: a */
        public void mo30178a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo30180b(C7755o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public void mo30181c(C7755o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo30182d(C7755o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public C7725d0<K, V> mo30195e() {
            return this.f21380N;
        }

        /* renamed from: f */
        public int mo30196f() {
            return this.f21381a;
        }

        /* renamed from: g */
        public C7755o<K, V> mo30183g() {
            throw new UnsupportedOperationException();
        }

        public K getKey() {
            return get();
        }

        /* renamed from: h */
        public C7755o<K, V> mo30184h() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: j */
        public C7755o<K, V> mo30185j() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: k */
        public long mo30186k() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: p */
        public C7755o<K, V> mo30187p() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo30179a(C7755o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public C7755o<K, V> mo30194d() {
            return this.f21382b;
        }

        /* renamed from: a */
        public void mo30193a(C7725d0<K, V> d0Var) {
            C7725d0<K, V> d0Var2 = this.f21380N;
            this.f21380N = d0Var;
            d0Var2.mo29923a(d0Var);
        }
    }

    /* renamed from: com.google.common.collect.e4$g */
    /* compiled from: MapMakerInternalMap */
    final class C7738g extends C7750k<Entry<K, V>> {
        C7738g() {
            super();
        }

        public Entry<K, V> next() {
            return mo30242c();
        }
    }

    /* renamed from: com.google.common.collect.e4$g0 */
    /* compiled from: MapMakerInternalMap */
    static final class C7739g0<K, V> extends C7737f0<K, V> implements C7755o<K, V> {
        @C5966a("Segment.this")

        /* renamed from: O */
        C7755o<K, V> f21384O = C7717e4.m36830l();
        @C5966a("Segment.this")

        /* renamed from: P */
        C7755o<K, V> f21385P = C7717e4.m36830l();

        C7739g0(ReferenceQueue<K> referenceQueue, K k, int i, @C5952h C7755o<K, V> oVar) {
            super(referenceQueue, k, i, oVar);
        }

        /* renamed from: a */
        public void mo30179a(C7755o<K, V> oVar) {
            this.f21385P = oVar;
        }

        /* renamed from: b */
        public void mo30180b(C7755o<K, V> oVar) {
            this.f21384O = oVar;
        }

        /* renamed from: g */
        public C7755o<K, V> mo30183g() {
            return this.f21385P;
        }

        /* renamed from: h */
        public C7755o<K, V> mo30184h() {
            return this.f21384O;
        }
    }

    /* renamed from: com.google.common.collect.e4$h */
    /* compiled from: MapMakerInternalMap */
    final class C7740h extends AbstractSet<Entry<K, V>> {
        C7740h() {
        }

        public void clear() {
            C7717e4.this.clear();
        }

        public boolean contains(Object obj) {
            boolean z = false;
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            if (key == null) {
                return false;
            }
            Object obj2 = C7717e4.this.get(key);
            if (obj2 != null && C7717e4.this.f21346Q.mo29253b(entry.getValue(), obj2)) {
                z = true;
            }
            return z;
        }

        public boolean isEmpty() {
            return C7717e4.this.isEmpty();
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C7738g();
        }

        public boolean remove(Object obj) {
            boolean z = false;
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            if (key != null && C7717e4.this.remove(key, entry.getValue())) {
                z = true;
            }
            return z;
        }

        public int size() {
            return C7717e4.this.size();
        }
    }

    /* renamed from: com.google.common.collect.e4$h0 */
    /* compiled from: MapMakerInternalMap */
    static final class C7741h0<K, V> extends C7737f0<K, V> implements C7755o<K, V> {

        /* renamed from: O */
        volatile long f21387O = Long.MAX_VALUE;
        @C5966a("Segment.this")

        /* renamed from: P */
        C7755o<K, V> f21388P = C7717e4.m36830l();
        @C5966a("Segment.this")

        /* renamed from: Q */
        C7755o<K, V> f21389Q = C7717e4.m36830l();

        C7741h0(ReferenceQueue<K> referenceQueue, K k, int i, @C5952h C7755o<K, V> oVar) {
            super(referenceQueue, k, i, oVar);
        }

        /* renamed from: a */
        public void mo30178a(long j) {
            this.f21387O = j;
        }

        /* renamed from: c */
        public void mo30181c(C7755o<K, V> oVar) {
            this.f21388P = oVar;
        }

        /* renamed from: d */
        public void mo30182d(C7755o<K, V> oVar) {
            this.f21389Q = oVar;
        }

        /* renamed from: j */
        public C7755o<K, V> mo30185j() {
            return this.f21388P;
        }

        /* renamed from: k */
        public long mo30186k() {
            return this.f21387O;
        }

        /* renamed from: p */
        public C7755o<K, V> mo30187p() {
            return this.f21389Q;
        }
    }

    /* renamed from: com.google.common.collect.e4$i */
    /* compiled from: MapMakerInternalMap */
    static final class C7742i<K, V> extends AbstractQueue<C7755o<K, V>> {

        /* renamed from: a */
        final C7755o<K, V> f21390a = new C7743a();

        /* renamed from: com.google.common.collect.e4$i$a */
        /* compiled from: MapMakerInternalMap */
        class C7743a extends C7722c<K, V> {

            /* renamed from: a */
            C7755o<K, V> f21392a = this;

            /* renamed from: b */
            C7755o<K, V> f21393b = this;

            C7743a() {
            }

            /* renamed from: a */
            public void mo30179a(C7755o<K, V> oVar) {
                this.f21393b = oVar;
            }

            /* renamed from: b */
            public void mo30180b(C7755o<K, V> oVar) {
                this.f21392a = oVar;
            }

            /* renamed from: g */
            public C7755o<K, V> mo30183g() {
                return this.f21393b;
            }

            /* renamed from: h */
            public C7755o<K, V> mo30184h() {
                return this.f21392a;
            }
        }

        /* renamed from: com.google.common.collect.e4$i$b */
        /* compiled from: MapMakerInternalMap */
        class C7744b extends C7923j<C7755o<K, V>> {
            C7744b(C7755o oVar) {
                super(oVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public C7755o<K, V> mo29469a(C7755o<K, V> oVar) {
                C7755o<K, V> h = oVar.mo30184h();
                if (h == C7742i.this.f21390a) {
                    return null;
                }
                return h;
            }
        }

        C7742i() {
        }

        /* renamed from: a */
        public boolean offer(C7755o<K, V> oVar) {
            C7717e4.m36824b(oVar.mo30183g(), oVar.mo30184h());
            C7717e4.m36824b(this.f21390a.mo30183g(), oVar);
            C7717e4.m36824b(oVar, this.f21390a);
            return true;
        }

        public void clear() {
            C7755o<K, V> h = this.f21390a.mo30184h();
            while (true) {
                C7755o<K, V> oVar = this.f21390a;
                if (h != oVar) {
                    C7755o h2 = h.mo30184h();
                    C7717e4.m36827e(h);
                    h = h2;
                } else {
                    oVar.mo30180b(oVar);
                    C7755o<K, V> oVar2 = this.f21390a;
                    oVar2.mo30179a(oVar2);
                    return;
                }
            }
        }

        public boolean contains(Object obj) {
            return ((C7755o) obj).mo30184h() != C7754n.INSTANCE;
        }

        public boolean isEmpty() {
            return this.f21390a.mo30184h() == this.f21390a;
        }

        public Iterator<C7755o<K, V>> iterator() {
            return new C7744b(peek());
        }

        public boolean remove(Object obj) {
            C7755o oVar = (C7755o) obj;
            C7755o g = oVar.mo30183g();
            C7755o h = oVar.mo30184h();
            C7717e4.m36824b(g, h);
            C7717e4.m36827e(oVar);
            return h != C7754n.INSTANCE;
        }

        public int size() {
            int i = 0;
            for (C7755o<K, V> h = this.f21390a.mo30184h(); h != this.f21390a; h = h.mo30184h()) {
                i++;
            }
            return i;
        }

        public C7755o<K, V> peek() {
            C7755o<K, V> h = this.f21390a.mo30184h();
            if (h == this.f21390a) {
                return null;
            }
            return h;
        }

        public C7755o<K, V> poll() {
            C7755o<K, V> h = this.f21390a.mo30184h();
            if (h == this.f21390a) {
                return null;
            }
            remove(h);
            return h;
        }
    }

    /* renamed from: com.google.common.collect.e4$i0 */
    /* compiled from: MapMakerInternalMap */
    static final class C7745i0<K, V> extends C7737f0<K, V> implements C7755o<K, V> {

        /* renamed from: O */
        volatile long f21395O = Long.MAX_VALUE;
        @C5966a("Segment.this")

        /* renamed from: P */
        C7755o<K, V> f21396P = C7717e4.m36830l();
        @C5966a("Segment.this")

        /* renamed from: Q */
        C7755o<K, V> f21397Q = C7717e4.m36830l();
        @C5966a("Segment.this")

        /* renamed from: R */
        C7755o<K, V> f21398R = C7717e4.m36830l();
        @C5966a("Segment.this")

        /* renamed from: S */
        C7755o<K, V> f21399S = C7717e4.m36830l();

        C7745i0(ReferenceQueue<K> referenceQueue, K k, int i, @C5952h C7755o<K, V> oVar) {
            super(referenceQueue, k, i, oVar);
        }

        /* renamed from: a */
        public void mo30178a(long j) {
            this.f21395O = j;
        }

        /* renamed from: b */
        public void mo30180b(C7755o<K, V> oVar) {
            this.f21398R = oVar;
        }

        /* renamed from: c */
        public void mo30181c(C7755o<K, V> oVar) {
            this.f21396P = oVar;
        }

        /* renamed from: d */
        public void mo30182d(C7755o<K, V> oVar) {
            this.f21397Q = oVar;
        }

        /* renamed from: g */
        public C7755o<K, V> mo30183g() {
            return this.f21399S;
        }

        /* renamed from: h */
        public C7755o<K, V> mo30184h() {
            return this.f21398R;
        }

        /* renamed from: j */
        public C7755o<K, V> mo30185j() {
            return this.f21396P;
        }

        /* renamed from: k */
        public long mo30186k() {
            return this.f21395O;
        }

        /* renamed from: p */
        public C7755o<K, V> mo30187p() {
            return this.f21397Q;
        }

        /* renamed from: a */
        public void mo30179a(C7755o<K, V> oVar) {
            this.f21399S = oVar;
        }
    }

    /* renamed from: com.google.common.collect.e4$j */
    /* compiled from: MapMakerInternalMap */
    static final class C7746j<K, V> extends AbstractQueue<C7755o<K, V>> {

        /* renamed from: a */
        final C7755o<K, V> f21400a = new C7747a();

        /* renamed from: com.google.common.collect.e4$j$a */
        /* compiled from: MapMakerInternalMap */
        class C7747a extends C7722c<K, V> {

            /* renamed from: a */
            C7755o<K, V> f21402a = this;

            /* renamed from: b */
            C7755o<K, V> f21403b = this;

            C7747a() {
            }

            /* renamed from: a */
            public void mo30178a(long j) {
            }

            /* renamed from: c */
            public void mo30181c(C7755o<K, V> oVar) {
                this.f21402a = oVar;
            }

            /* renamed from: d */
            public void mo30182d(C7755o<K, V> oVar) {
                this.f21403b = oVar;
            }

            /* renamed from: j */
            public C7755o<K, V> mo30185j() {
                return this.f21402a;
            }

            /* renamed from: k */
            public long mo30186k() {
                return Long.MAX_VALUE;
            }

            /* renamed from: p */
            public C7755o<K, V> mo30187p() {
                return this.f21403b;
            }
        }

        /* renamed from: com.google.common.collect.e4$j$b */
        /* compiled from: MapMakerInternalMap */
        class C7748b extends C7923j<C7755o<K, V>> {
            C7748b(C7755o oVar) {
                super(oVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public C7755o<K, V> mo29469a(C7755o<K, V> oVar) {
                C7755o<K, V> j = oVar.mo30185j();
                if (j == C7746j.this.f21400a) {
                    return null;
                }
                return j;
            }
        }

        C7746j() {
        }

        /* renamed from: a */
        public boolean offer(C7755o<K, V> oVar) {
            C7717e4.m36826c(oVar.mo30187p(), oVar.mo30185j());
            C7717e4.m36826c(this.f21400a.mo30187p(), oVar);
            C7717e4.m36826c(oVar, this.f21400a);
            return true;
        }

        public void clear() {
            C7755o<K, V> j = this.f21400a.mo30185j();
            while (true) {
                C7755o<K, V> oVar = this.f21400a;
                if (j != oVar) {
                    C7755o j2 = j.mo30185j();
                    C7717e4.m36828f(j);
                    j = j2;
                } else {
                    oVar.mo30181c(oVar);
                    C7755o<K, V> oVar2 = this.f21400a;
                    oVar2.mo30182d(oVar2);
                    return;
                }
            }
        }

        public boolean contains(Object obj) {
            return ((C7755o) obj).mo30185j() != C7754n.INSTANCE;
        }

        public boolean isEmpty() {
            return this.f21400a.mo30185j() == this.f21400a;
        }

        public Iterator<C7755o<K, V>> iterator() {
            return new C7748b(peek());
        }

        public boolean remove(Object obj) {
            C7755o oVar = (C7755o) obj;
            C7755o p = oVar.mo30187p();
            C7755o j = oVar.mo30185j();
            C7717e4.m36826c(p, j);
            C7717e4.m36828f(oVar);
            return j != C7754n.INSTANCE;
        }

        public int size() {
            int i = 0;
            for (C7755o<K, V> j = this.f21400a.mo30185j(); j != this.f21400a; j = j.mo30185j()) {
                i++;
            }
            return i;
        }

        public C7755o<K, V> peek() {
            C7755o<K, V> j = this.f21400a.mo30185j();
            if (j == this.f21400a) {
                return null;
            }
            return j;
        }

        public C7755o<K, V> poll() {
            C7755o<K, V> j = this.f21400a.mo30185j();
            if (j == this.f21400a) {
                return null;
            }
            remove(j);
            return j;
        }
    }

    /* renamed from: com.google.common.collect.e4$j0 */
    /* compiled from: MapMakerInternalMap */
    static final class C7749j0<K, V> extends WeakReference<V> implements C7725d0<K, V> {

        /* renamed from: a */
        final C7755o<K, V> f21405a;

        C7749j0(ReferenceQueue<V> referenceQueue, V v, C7755o<K, V> oVar) {
            super(v, referenceQueue);
            this.f21405a = oVar;
        }

        /* renamed from: a */
        public void mo29923a(C7725d0<K, V> d0Var) {
            clear();
        }

        /* renamed from: b */
        public C7755o<K, V> mo29924b() {
            return this.f21405a;
        }

        /* renamed from: c */
        public boolean mo29925c() {
            return false;
        }

        /* renamed from: a */
        public C7725d0<K, V> mo29921a(ReferenceQueue<V> referenceQueue, V v, C7755o<K, V> oVar) {
            return new C7749j0(referenceQueue, v, oVar);
        }

        /* renamed from: a */
        public V mo29922a() {
            return get();
        }
    }

    /* renamed from: com.google.common.collect.e4$k */
    /* compiled from: MapMakerInternalMap */
    abstract class C7750k<E> implements Iterator<E> {

        /* renamed from: N */
        C7756p<K, V> f21406N;

        /* renamed from: O */
        AtomicReferenceArray<C7755o<K, V>> f21407O;

        /* renamed from: P */
        C7755o<K, V> f21408P;

        /* renamed from: Q */
        C7751k0 f21409Q;

        /* renamed from: R */
        C7751k0 f21410R;

        /* renamed from: a */
        int f21412a;

        /* renamed from: b */
        int f21413b = -1;

        C7750k() {
            this.f21412a = C7717e4.this.f21343N.length - 1;
            mo30241b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo30240a(C7755o<K, V> oVar) {
            boolean z;
            try {
                Object key = oVar.getKey();
                Object a = C7717e4.this.mo30147a(oVar);
                if (a != null) {
                    this.f21409Q = new C7751k0<>(key, a);
                    z = true;
                } else {
                    z = false;
                }
                return z;
            } finally {
                this.f21406N.mo30296n();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo30241b() {
            this.f21409Q = null;
            if (!mo30243d() && !mo30244g()) {
                while (true) {
                    int i = this.f21412a;
                    if (i < 0) {
                        break;
                    }
                    C7756p<K, V>[] pVarArr = C7717e4.this.f21343N;
                    this.f21412a = i - 1;
                    this.f21406N = pVarArr[i];
                    if (this.f21406N.f21430b != 0) {
                        this.f21407O = this.f21406N.f21421P;
                        this.f21413b = this.f21407O.length() - 1;
                        if (mo30244g()) {
                            break;
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C7751k0 mo30242c() {
            C7751k0 k0Var = this.f21409Q;
            if (k0Var != null) {
                this.f21410R = k0Var;
                mo30241b();
                return this.f21410R;
            }
            throw new NoSuchElementException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo30243d() {
            C7755o<K, V> oVar = this.f21408P;
            if (oVar != null) {
                while (true) {
                    this.f21408P = oVar.mo30194d();
                    C7755o<K, V> oVar2 = this.f21408P;
                    if (oVar2 == null) {
                        break;
                    } else if (mo30240a(oVar2)) {
                        return true;
                    } else {
                        oVar = this.f21408P;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public boolean mo30244g() {
            while (true) {
                int i = this.f21413b;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<C7755o<K, V>> atomicReferenceArray = this.f21407O;
                this.f21413b = i - 1;
                C7755o<K, V> oVar = (C7755o) atomicReferenceArray.get(i);
                this.f21408P = oVar;
                if (oVar == null || (!mo30240a(this.f21408P) && !mo30243d())) {
                }
            }
            return true;
        }

        public boolean hasNext() {
            return this.f21409Q != null;
        }

        public abstract E next();

        public void remove() {
            C8277y.m39486a(this.f21410R != null);
            C7717e4.this.remove(this.f21410R.getKey());
            this.f21410R = null;
        }
    }

    /* renamed from: com.google.common.collect.e4$k0 */
    /* compiled from: MapMakerInternalMap */
    final class C7751k0 extends C7848g<K, V> {

        /* renamed from: a */
        final K f21415a;

        /* renamed from: b */
        V f21416b;

        C7751k0(K k, V v) {
            this.f21415a = k;
            this.f21416b = v;
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!this.f21415a.equals(entry.getKey()) || !this.f21416b.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f21415a;
        }

        public V getValue() {
            return this.f21416b;
        }

        public int hashCode() {
            return this.f21415a.hashCode() ^ this.f21416b.hashCode();
        }

        public V setValue(V v) {
            V put = C7717e4.this.put(this.f21415a, v);
            this.f21416b = v;
            return put;
        }
    }

    /* renamed from: com.google.common.collect.e4$l */
    /* compiled from: MapMakerInternalMap */
    final class C7752l extends C7750k<K> {
        C7752l() {
            super();
        }

        public K next() {
            return mo30242c().getKey();
        }
    }

    /* renamed from: com.google.common.collect.e4$m */
    /* compiled from: MapMakerInternalMap */
    final class C7753m extends AbstractSet<K> {
        C7753m() {
        }

        public void clear() {
            C7717e4.this.clear();
        }

        public boolean contains(Object obj) {
            return C7717e4.this.containsKey(obj);
        }

        public boolean isEmpty() {
            return C7717e4.this.isEmpty();
        }

        public Iterator<K> iterator() {
            return new C7752l();
        }

        public boolean remove(Object obj) {
            return C7717e4.this.remove(obj) != null;
        }

        public int size() {
            return C7717e4.this.size();
        }
    }

    /* renamed from: com.google.common.collect.e4$n */
    /* compiled from: MapMakerInternalMap */
    private enum C7754n implements C7755o<Object, Object> {
        INSTANCE;

        /* renamed from: a */
        public void mo30178a(long j) {
        }

        /* renamed from: a */
        public void mo30193a(C7725d0<Object, Object> d0Var) {
        }

        /* renamed from: a */
        public void mo30179a(C7755o<Object, Object> oVar) {
        }

        /* renamed from: b */
        public void mo30180b(C7755o<Object, Object> oVar) {
        }

        /* renamed from: c */
        public void mo30181c(C7755o<Object, Object> oVar) {
        }

        /* renamed from: d */
        public C7755o<Object, Object> mo30194d() {
            return null;
        }

        /* renamed from: d */
        public void mo30182d(C7755o<Object, Object> oVar) {
        }

        /* renamed from: e */
        public C7725d0<Object, Object> mo30195e() {
            return null;
        }

        /* renamed from: f */
        public int mo30196f() {
            return 0;
        }

        /* renamed from: g */
        public C7755o<Object, Object> mo30183g() {
            return this;
        }

        public Object getKey() {
            return null;
        }

        /* renamed from: h */
        public C7755o<Object, Object> mo30184h() {
            return this;
        }

        /* renamed from: j */
        public C7755o<Object, Object> mo30185j() {
            return this;
        }

        /* renamed from: k */
        public long mo30186k() {
            return 0;
        }

        /* renamed from: p */
        public C7755o<Object, Object> mo30187p() {
            return this;
        }
    }

    /* renamed from: com.google.common.collect.e4$o */
    /* compiled from: MapMakerInternalMap */
    interface C7755o<K, V> {
        /* renamed from: a */
        void mo30178a(long j);

        /* renamed from: a */
        void mo30193a(C7725d0<K, V> d0Var);

        /* renamed from: a */
        void mo30179a(C7755o<K, V> oVar);

        /* renamed from: b */
        void mo30180b(C7755o<K, V> oVar);

        /* renamed from: c */
        void mo30181c(C7755o<K, V> oVar);

        /* renamed from: d */
        C7755o<K, V> mo30194d();

        /* renamed from: d */
        void mo30182d(C7755o<K, V> oVar);

        /* renamed from: e */
        C7725d0<K, V> mo30195e();

        /* renamed from: f */
        int mo30196f();

        /* renamed from: g */
        C7755o<K, V> mo30183g();

        K getKey();

        /* renamed from: h */
        C7755o<K, V> mo30184h();

        /* renamed from: j */
        C7755o<K, V> mo30185j();

        /* renamed from: k */
        long mo30186k();

        /* renamed from: p */
        C7755o<K, V> mo30187p();
    }

    /* renamed from: com.google.common.collect.e4$p */
    /* compiled from: MapMakerInternalMap */
    static class C7756p<K, V> extends ReentrantLock {

        /* renamed from: N */
        int f21419N;

        /* renamed from: O */
        int f21420O;

        /* renamed from: P */
        volatile AtomicReferenceArray<C7755o<K, V>> f21421P;

        /* renamed from: Q */
        final int f21422Q;

        /* renamed from: R */
        final ReferenceQueue<K> f21423R;

        /* renamed from: S */
        final ReferenceQueue<V> f21424S;

        /* renamed from: T */
        final Queue<C7755o<K, V>> f21425T;

        /* renamed from: U */
        final AtomicInteger f21426U = new AtomicInteger();
        @C5966a("Segment.this")

        /* renamed from: V */
        final Queue<C7755o<K, V>> f21427V;
        @C5966a("Segment.this")

        /* renamed from: W */
        final Queue<C7755o<K, V>> f21428W;

        /* renamed from: a */
        final C7717e4<K, V> f21429a;

        /* renamed from: b */
        volatile int f21430b;

        C7756p(C7717e4<K, V> e4Var, int i, int i2) {
            this.f21429a = e4Var;
            this.f21422Q = i2;
            mo30265a(mo30277b(i));
            ReferenceQueue<V> referenceQueue = null;
            this.f21423R = e4Var.mo30165h() ? new ReferenceQueue<>() : null;
            if (e4Var.mo30166i()) {
                referenceQueue = new ReferenceQueue<>();
            }
            this.f21424S = referenceQueue;
            this.f21425T = (e4Var.mo30149a() || e4Var.mo30161e()) ? new ConcurrentLinkedQueue<>() : C7717e4.m36829j();
            this.f21427V = e4Var.mo30149a() ? new C7742i<>() : C7717e4.m36829j();
            this.f21428W = e4Var.mo30160d() ? new C7746j<>() : C7717e4.m36829j();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30265a(AtomicReferenceArray<C7755o<K, V>> atomicReferenceArray) {
            this.f21420O = (atomicReferenceArray.length() * 3) / 4;
            int i = this.f21420O;
            if (i == this.f21422Q) {
                this.f21420O = i + 1;
            }
            this.f21421P = atomicReferenceArray;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public AtomicReferenceArray<C7755o<K, V>> mo30277b(int i) {
            return new AtomicReferenceArray<>(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo30281c(C7755o<K, V> oVar) {
            if (this.f21429a.mo30161e()) {
                mo30261a(oVar, this.f21429a.f21350U);
            }
            this.f21425T.add(oVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo30283d() {
            do {
            } while (this.f21423R.poll() != null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo30286e() {
            if (this.f21429a.mo30165h()) {
                mo30283d();
            }
            if (this.f21429a.mo30166i()) {
                mo30288f();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo30288f() {
            do {
            } while (this.f21424S.poll() != null);
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: g */
        public void mo30289g() {
            int i = 0;
            do {
                Reference poll = this.f21423R.poll();
                if (poll != null) {
                    this.f21429a.mo30159d((C7755o) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: h */
        public void mo30290h() {
            while (true) {
                C7755o oVar = (C7755o) this.f21425T.poll();
                if (oVar != null) {
                    if (this.f21427V.contains(oVar)) {
                        this.f21427V.add(oVar);
                    }
                    if (this.f21429a.mo30161e() && this.f21428W.contains(oVar)) {
                        this.f21428W.add(oVar);
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: i */
        public void mo30291i() {
            if (this.f21429a.mo30165h()) {
                mo30289g();
            }
            if (this.f21429a.mo30166i()) {
                mo30292j();
            }
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: j */
        public void mo30292j() {
            int i = 0;
            do {
                Reference poll = this.f21424S.poll();
                if (poll != null) {
                    this.f21429a.mo30148a((C7725d0) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: k */
        public boolean mo30293k() {
            if (!this.f21429a.mo30149a() || this.f21430b < this.f21422Q) {
                return false;
            }
            mo30290h();
            C7755o oVar = (C7755o) this.f21427V.remove();
            if (mo30268a(oVar, oVar.mo30196f(), C7665e.SIZE)) {
                return true;
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: l */
        public void mo30294l() {
            AtomicReferenceArray<C7755o<K, V>> atomicReferenceArray = this.f21421P;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i = this.f21430b;
                AtomicReferenceArray<C7755o<K, V>> b = mo30277b(length << 1);
                this.f21420O = (b.length() * 3) / 4;
                int length2 = b.length() - 1;
                for (int i2 = 0; i2 < length; i2++) {
                    C7755o oVar = (C7755o) atomicReferenceArray.get(i2);
                    if (oVar != null) {
                        C7755o d = oVar.mo30194d();
                        int f = oVar.mo30196f() & length2;
                        if (d == null) {
                            b.set(f, oVar);
                        } else {
                            C7755o oVar2 = oVar;
                            while (d != null) {
                                int f2 = d.mo30196f() & length2;
                                if (f2 != f) {
                                    oVar2 = d;
                                    f = f2;
                                }
                                d = d.mo30194d();
                            }
                            b.set(f, oVar2);
                            while (oVar != oVar2) {
                                int f3 = oVar.mo30196f() & length2;
                                C7755o a = mo30256a(oVar, (C7755o) b.get(f3));
                                if (a != null) {
                                    b.set(f3, a);
                                } else {
                                    mo30287e(oVar);
                                    i--;
                                }
                                oVar = oVar.mo30194d();
                            }
                        }
                    }
                }
                this.f21421P = b;
                this.f21430b = i;
            }
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: m */
        public void mo30295m() {
            C7755o oVar;
            mo30290h();
            if (!this.f21428W.isEmpty()) {
                long a = this.f21429a.f21355Z.mo23201a();
                do {
                    oVar = (C7755o) this.f21428W.peek();
                    if (oVar == null || !this.f21429a.mo30150a(oVar, a)) {
                        return;
                    }
                } while (mo30268a(oVar, oVar.mo30196f(), C7665e.EXPIRED));
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public void mo30296n() {
            if ((this.f21426U.incrementAndGet() & 63) == 0) {
                mo30299q();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public void mo30297o() {
            mo30301s();
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: p */
        public void mo30298p() {
            mo30300r();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: q */
        public void mo30299q() {
            mo30300r();
            mo30301s();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: r */
        public void mo30300r() {
            if (tryLock()) {
                try {
                    mo30291i();
                    mo30295m();
                    this.f21426U.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: s */
        public void mo30301s() {
            if (!isHeldByCurrentThread()) {
                this.f21429a.mo30164g();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: t */
        public void mo30302t() {
            if (tryLock()) {
                try {
                    mo30291i();
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: u */
        public void mo30303u() {
            if (tryLock()) {
                try {
                    mo30295m();
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: b */
        public void mo30278b(C7755o<K, V> oVar) {
            this.f21427V.add(oVar);
            if (this.f21429a.mo30161e()) {
                mo30261a(oVar, this.f21429a.f21350U);
                this.f21428W.add(oVar);
            }
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: d */
        public void mo30284d(C7755o<K, V> oVar) {
            mo30290h();
            this.f21427V.add(oVar);
            if (this.f21429a.mo30160d()) {
                mo30261a(oVar, this.f21429a.mo30161e() ? this.f21429a.f21350U : this.f21429a.f21351V);
                this.f21428W.add(oVar);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C7755o<K, V> mo30280c(Object obj, int i) {
            if (this.f21430b != 0) {
                for (C7755o<K, V> a = mo30255a(i); a != null; a = a.mo30194d()) {
                    if (a.mo30196f() == i) {
                        Object key = a.getKey();
                        if (key == null) {
                            mo30302t();
                        } else if (this.f21429a.f21345P.mo29253b(obj, key)) {
                            return a;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: a */
        public C7755o<K, V> mo30257a(K k, int i, @C5952h C7755o<K, V> oVar) {
            return this.f21429a.f21354Y.mo30209a(this, k, i, oVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public V mo30285e(Object obj, int i) {
            C7665e eVar;
            lock();
            try {
                mo30298p();
                AtomicReferenceArray<C7755o<K, V>> atomicReferenceArray = this.f21421P;
                int length = (atomicReferenceArray.length() - 1) & i;
                C7755o oVar = (C7755o) atomicReferenceArray.get(length);
                C7755o oVar2 = oVar;
                while (true) {
                    if (oVar2 == null) {
                        break;
                    }
                    Object key = oVar2.getKey();
                    if (oVar2.mo30196f() != i || key == null || !this.f21429a.f21345P.mo29253b(obj, key)) {
                        oVar2 = oVar2.mo30194d();
                    } else {
                        C7725d0 e = oVar2.mo30195e();
                        V v = e.get();
                        if (v != null) {
                            eVar = C7665e.EXPLICIT;
                        } else if (mo30266a(e)) {
                            eVar = C7665e.COLLECTED;
                        }
                        this.f21419N++;
                        mo30264a((K) key, i, v, eVar);
                        int i2 = this.f21430b - 1;
                        atomicReferenceArray.set(length, mo30274b(oVar, oVar2));
                        this.f21430b = i2;
                        return v;
                    }
                }
                unlock();
                mo30297o();
                return null;
            } finally {
                unlock();
                mo30297o();
            }
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: a */
        public C7755o<K, V> mo30256a(C7755o<K, V> oVar, C7755o<K, V> oVar2) {
            if (oVar.getKey() == null) {
                return null;
            }
            C7725d0 e = oVar.mo30195e();
            Object obj = e.get();
            if (obj == null && !e.mo29925c()) {
                return null;
            }
            C7755o<K, V> a = this.f21429a.f21354Y.mo30208a(this, oVar, oVar2);
            a.mo30193a(e.mo29921a(this.f21424S, obj, a));
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public V mo30275b(Object obj, int i) {
            try {
                C7755o d = mo30282d(obj, i);
                if (d == null) {
                    return null;
                }
                V v = d.mo30195e().get();
                if (v != null) {
                    mo30281c(d);
                } else {
                    mo30302t();
                }
                mo30296n();
                return v;
            } finally {
                mo30296n();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C7755o<K, V> mo30282d(Object obj, int i) {
            C7755o<K, V> c = mo30280c(obj, i);
            if (c == null) {
                return null;
            }
            if (!this.f21429a.mo30160d() || !this.f21429a.mo30153b(c)) {
                return c;
            }
            mo30303u();
            return null;
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: a */
        public void mo30263a(C7755o<K, V> oVar, V v) {
            oVar.mo30193a(this.f21429a.f21348S.mo30304a(this, oVar, v));
            mo30284d(oVar);
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
            r6 = r3.mo30195e();
            r7 = r6.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
            if (r7 != null) goto L_0x005e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
            if (mo30266a(r6) == false) goto L_0x0057;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
            r8.f21419N++;
            mo30264a((K) r5, r10, r7, com.google.common.collect.C7660d4.C7665e.COLLECTED);
            r10 = r8.f21430b - 1;
            r0.set(r1, mo30274b(r2, r3));
            r8.f21430b = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r8.f21419N++;
            mo30264a(r9, r10, r7, com.google.common.collect.C7660d4.C7665e.REPLACED);
            mo30263a(r3, r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
            unlock();
            mo30297o();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
            return r7;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public V mo30276b(K r9, int r10, V r11) {
            /*
                r8 = this;
                r8.lock()
                r8.mo30298p()     // Catch:{ all -> 0x0078 }
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.collect.e4$o<K, V>> r0 = r8.f21421P     // Catch:{ all -> 0x0078 }
                int r1 = r0.length()     // Catch:{ all -> 0x0078 }
                int r1 = r1 + -1
                r1 = r1 & r10
                java.lang.Object r2 = r0.get(r1)     // Catch:{ all -> 0x0078 }
                com.google.common.collect.e4$o r2 = (com.google.common.collect.C7717e4.C7755o) r2     // Catch:{ all -> 0x0078 }
                r3 = r2
            L_0x0016:
                r4 = 0
                if (r3 == 0) goto L_0x0057
                java.lang.Object r5 = r3.getKey()     // Catch:{ all -> 0x0078 }
                int r6 = r3.mo30196f()     // Catch:{ all -> 0x0078 }
                if (r6 != r10) goto L_0x0073
                if (r5 == 0) goto L_0x0073
                com.google.common.collect.e4<K, V> r6 = r8.f21429a     // Catch:{ all -> 0x0078 }
                com.google.common.base.j<java.lang.Object> r6 = r6.f21345P     // Catch:{ all -> 0x0078 }
                boolean r6 = r6.mo29253b(r9, r5)     // Catch:{ all -> 0x0078 }
                if (r6 == 0) goto L_0x0073
                com.google.common.collect.e4$d0 r6 = r3.mo30195e()     // Catch:{ all -> 0x0078 }
                java.lang.Object r7 = r6.get()     // Catch:{ all -> 0x0078 }
                if (r7 != 0) goto L_0x005e
                boolean r9 = r8.mo30266a(r6)     // Catch:{ all -> 0x0078 }
                if (r9 == 0) goto L_0x0057
                int r9 = r8.f21419N     // Catch:{ all -> 0x0078 }
                int r9 = r9 + 1
                r8.f21419N = r9     // Catch:{ all -> 0x0078 }
                com.google.common.collect.d4$e r9 = com.google.common.collect.C7660d4.C7665e.COLLECTED     // Catch:{ all -> 0x0078 }
                r8.mo30264a((K) r5, r10, (V) r7, r9)     // Catch:{ all -> 0x0078 }
                com.google.common.collect.e4$o r9 = r8.mo30274b(r2, r3)     // Catch:{ all -> 0x0078 }
                int r10 = r8.f21430b     // Catch:{ all -> 0x0078 }
                int r10 = r10 + -1
                r0.set(r1, r9)     // Catch:{ all -> 0x0078 }
                r8.f21430b = r10     // Catch:{ all -> 0x0078 }
            L_0x0057:
                r8.unlock()
                r8.mo30297o()
                return r4
            L_0x005e:
                int r0 = r8.f21419N     // Catch:{ all -> 0x0078 }
                int r0 = r0 + 1
                r8.f21419N = r0     // Catch:{ all -> 0x0078 }
                com.google.common.collect.d4$e r0 = com.google.common.collect.C7660d4.C7665e.REPLACED     // Catch:{ all -> 0x0078 }
                r8.mo30264a((K) r9, r10, (V) r7, r0)     // Catch:{ all -> 0x0078 }
                r8.mo30263a(r3, (V) r11)     // Catch:{ all -> 0x0078 }
                r8.unlock()
                r8.mo30297o()
                return r7
            L_0x0073:
                com.google.common.collect.e4$o r3 = r3.mo30194d()     // Catch:{ all -> 0x0078 }
                goto L_0x0016
            L_0x0078:
                r9 = move-exception
                r8.unlock()
                r8.mo30297o()
                goto L_0x0081
            L_0x0080:
                throw r9
            L_0x0081:
                goto L_0x0080
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C7717e4.C7756p.mo30276b(java.lang.Object, int, java.lang.Object):java.lang.Object");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30261a(C7755o<K, V> oVar, long j) {
            oVar.mo30178a(this.f21429a.f21355Z.mo23201a() + j);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30262a(C7755o<K, V> oVar, C7665e eVar) {
            mo30264a((K) oVar.getKey(), oVar.mo30196f(), (V) oVar.mo30195e().get(), eVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30264a(@C5952h K k, int i, @C5952h V v, C7665e eVar) {
            if (this.f21429a.f21352W != C7717e4.f21342l0) {
                this.f21429a.f21352W.offer(new C7672g(k, v, eVar));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C7755o<K, V> mo30255a(int i) {
            AtomicReferenceArray<C7755o<K, V>> atomicReferenceArray = this.f21421P;
            return (C7755o) atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo30270a(Object obj, int i) {
            try {
                boolean z = false;
                if (this.f21430b != 0) {
                    C7755o d = mo30282d(obj, i);
                    if (d == null) {
                        return false;
                    }
                    if (d.mo30195e().get() != null) {
                        z = true;
                    }
                    mo30296n();
                    return z;
                }
                mo30296n();
                return false;
            } finally {
                mo30296n();
            }
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: 0000 */
        @C2778d
        /* renamed from: a */
        public boolean mo30269a(Object obj) {
            try {
                if (this.f21430b != 0) {
                    AtomicReferenceArray<C7755o<K, V>> atomicReferenceArray = this.f21421P;
                    int length = atomicReferenceArray.length();
                    for (int i = 0; i < length; i++) {
                        for (C7755o oVar = (C7755o) atomicReferenceArray.get(i); oVar != null; oVar = oVar.mo30194d()) {
                            Object a = mo30258a(oVar);
                            if (a != null) {
                                if (this.f21429a.f21346Q.mo29253b(obj, a)) {
                                    mo30296n();
                                    return true;
                                }
                            }
                        }
                    }
                }
                mo30296n();
                return false;
            } catch (Throwable th) {
                mo30296n();
                throw th;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo30287e(C7755o<K, V> oVar) {
            mo30262a(oVar, C7665e.COLLECTED);
            this.f21427V.remove(oVar);
            this.f21428W.remove(oVar);
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
            r1 = r4.mo30195e();
            r2 = r1.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
            if (r2 != null) goto L_0x0072;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
            r8.f21419N++;
            mo30263a(r4, r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
            if (r1.mo29925c() != false) goto L_0x005f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
            mo30264a(r9, r10, r2, com.google.common.collect.C7660d4.C7665e.COLLECTED);
            r0 = r8.f21430b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
            if (mo30293k() == false) goto L_0x0069;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
            r0 = r8.f21430b + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
            r8.f21430b = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
            if (r12 == false) goto L_0x007e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
            mo30278b(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
            unlock();
            mo30297o();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
            return r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r8.f21419N++;
            mo30264a(r9, r10, r2, com.google.common.collect.C7660d4.C7665e.REPLACED);
            mo30263a(r4, r11);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public V mo30259a(K r9, int r10, V r11, boolean r12) {
            /*
                r8 = this;
                r8.lock()
                r8.mo30298p()     // Catch:{ all -> 0x00af }
                int r0 = r8.f21430b     // Catch:{ all -> 0x00af }
                int r0 = r0 + 1
                int r1 = r8.f21420O     // Catch:{ all -> 0x00af }
                if (r0 <= r1) goto L_0x0015
                r8.mo30294l()     // Catch:{ all -> 0x00af }
                int r0 = r8.f21430b     // Catch:{ all -> 0x00af }
                int r0 = r0 + 1
            L_0x0015:
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.collect.e4$o<K, V>> r1 = r8.f21421P     // Catch:{ all -> 0x00af }
                int r2 = r1.length()     // Catch:{ all -> 0x00af }
                int r2 = r2 + -1
                r2 = r2 & r10
                java.lang.Object r3 = r1.get(r2)     // Catch:{ all -> 0x00af }
                com.google.common.collect.e4$o r3 = (com.google.common.collect.C7717e4.C7755o) r3     // Catch:{ all -> 0x00af }
                r4 = r3
            L_0x0025:
                r5 = 0
                if (r4 == 0) goto L_0x0092
                java.lang.Object r6 = r4.getKey()     // Catch:{ all -> 0x00af }
                int r7 = r4.mo30196f()     // Catch:{ all -> 0x00af }
                if (r7 != r10) goto L_0x008d
                if (r6 == 0) goto L_0x008d
                com.google.common.collect.e4<K, V> r7 = r8.f21429a     // Catch:{ all -> 0x00af }
                com.google.common.base.j<java.lang.Object> r7 = r7.f21345P     // Catch:{ all -> 0x00af }
                boolean r6 = r7.mo29253b(r9, r6)     // Catch:{ all -> 0x00af }
                if (r6 == 0) goto L_0x008d
                com.google.common.collect.e4$d0 r1 = r4.mo30195e()     // Catch:{ all -> 0x00af }
                java.lang.Object r2 = r1.get()     // Catch:{ all -> 0x00af }
                if (r2 != 0) goto L_0x0072
                int r12 = r8.f21419N     // Catch:{ all -> 0x00af }
                int r12 = r12 + 1
                r8.f21419N = r12     // Catch:{ all -> 0x00af }
                r8.mo30263a(r4, (V) r11)     // Catch:{ all -> 0x00af }
                boolean r11 = r1.mo29925c()     // Catch:{ all -> 0x00af }
                if (r11 != 0) goto L_0x005f
                com.google.common.collect.d4$e r11 = com.google.common.collect.C7660d4.C7665e.COLLECTED     // Catch:{ all -> 0x00af }
                r8.mo30264a((K) r9, r10, (V) r2, r11)     // Catch:{ all -> 0x00af }
                int r0 = r8.f21430b     // Catch:{ all -> 0x00af }
                goto L_0x0069
            L_0x005f:
                boolean r9 = r8.mo30293k()     // Catch:{ all -> 0x00af }
                if (r9 == 0) goto L_0x0069
                int r9 = r8.f21430b     // Catch:{ all -> 0x00af }
                int r0 = r9 + 1
            L_0x0069:
                r8.f21430b = r0     // Catch:{ all -> 0x00af }
            L_0x006b:
                r8.unlock()
                r8.mo30297o()
                return r5
            L_0x0072:
                if (r12 == 0) goto L_0x007e
                r8.mo30278b(r4)     // Catch:{ all -> 0x00af }
            L_0x0077:
                r8.unlock()
                r8.mo30297o()
                return r2
            L_0x007e:
                int r12 = r8.f21419N     // Catch:{ all -> 0x00af }
                int r12 = r12 + 1
                r8.f21419N = r12     // Catch:{ all -> 0x00af }
                com.google.common.collect.d4$e r12 = com.google.common.collect.C7660d4.C7665e.REPLACED     // Catch:{ all -> 0x00af }
                r8.mo30264a((K) r9, r10, (V) r2, r12)     // Catch:{ all -> 0x00af }
                r8.mo30263a(r4, (V) r11)     // Catch:{ all -> 0x00af }
                goto L_0x0077
            L_0x008d:
                com.google.common.collect.e4$o r4 = r4.mo30194d()     // Catch:{ all -> 0x00af }
                goto L_0x0025
            L_0x0092:
                int r12 = r8.f21419N     // Catch:{ all -> 0x00af }
                int r12 = r12 + 1
                r8.f21419N = r12     // Catch:{ all -> 0x00af }
                com.google.common.collect.e4$o r9 = r8.mo30257a((K) r9, r10, r3)     // Catch:{ all -> 0x00af }
                r8.mo30263a(r9, (V) r11)     // Catch:{ all -> 0x00af }
                r1.set(r2, r9)     // Catch:{ all -> 0x00af }
                boolean r9 = r8.mo30293k()     // Catch:{ all -> 0x00af }
                if (r9 == 0) goto L_0x00ac
                int r9 = r8.f21430b     // Catch:{ all -> 0x00af }
                int r0 = r9 + 1
            L_0x00ac:
                r8.f21430b = r0     // Catch:{ all -> 0x00af }
                goto L_0x006b
            L_0x00af:
                r9 = move-exception
                r8.unlock()
                r8.mo30297o()
                goto L_0x00b8
            L_0x00b7:
                throw r9
            L_0x00b8:
                goto L_0x00b7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C7717e4.C7756p.mo30259a(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object");
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: b */
        public C7755o<K, V> mo30274b(C7755o<K, V> oVar, C7755o<K, V> oVar2) {
            this.f21427V.remove(oVar2);
            this.f21428W.remove(oVar2);
            int i = this.f21430b;
            C7755o<K, V> d = oVar2.mo30194d();
            while (oVar != oVar2) {
                C7755o<K, V> a = mo30256a(oVar, d);
                if (a != null) {
                    d = a;
                } else {
                    mo30287e(oVar);
                    i--;
                }
                oVar = oVar.mo30194d();
            }
            this.f21430b = i;
            return d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo30279b(K k, int i, C7725d0<K, V> d0Var) {
            lock();
            try {
                AtomicReferenceArray<C7755o<K, V>> atomicReferenceArray = this.f21421P;
                int length = (atomicReferenceArray.length() - 1) & i;
                C7755o oVar = (C7755o) atomicReferenceArray.get(length);
                C7755o oVar2 = oVar;
                while (oVar2 != null) {
                    Object key = oVar2.getKey();
                    if (oVar2.mo30196f() != i || key == null || !this.f21429a.f21345P.mo29253b(k, key)) {
                        oVar2 = oVar2.mo30194d();
                    } else if (oVar2.mo30195e() == d0Var) {
                        this.f21419N++;
                        mo30264a(k, i, (V) d0Var.get(), C7665e.COLLECTED);
                        int i2 = this.f21430b - 1;
                        atomicReferenceArray.set(length, mo30274b(oVar, oVar2));
                        this.f21430b = i2;
                        return true;
                    } else {
                        unlock();
                        if (!isHeldByCurrentThread()) {
                            mo30297o();
                        }
                        return false;
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    mo30297o();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    mo30297o();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
            r7 = r4.mo30195e();
            r8 = r7.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
            if (r8 != null) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
            if (mo30266a(r7) == false) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
            r9.f21419N++;
            mo30264a((K) r6, r11, (V) r8, com.google.common.collect.C7660d4.C7665e.COLLECTED);
            r11 = r9.f21430b - 1;
            r0.set(r1, mo30274b(r3, r4));
            r9.f21430b = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
            if (r9.f21429a.f21346Q.mo29253b(r12, r8) == false) goto L_0x007a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
            r9.f21419N++;
            mo30264a(r10, r11, (V) r8, com.google.common.collect.C7660d4.C7665e.REPLACED);
            mo30263a(r4, r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
            unlock();
            mo30297o();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            mo30278b(r4);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo30273a(K r10, int r11, V r12, V r13) {
            /*
                r9 = this;
                r9.lock()
                r9.mo30298p()     // Catch:{ all -> 0x0083 }
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.collect.e4$o<K, V>> r0 = r9.f21421P     // Catch:{ all -> 0x0083 }
                int r1 = r0.length()     // Catch:{ all -> 0x0083 }
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r11
                java.lang.Object r3 = r0.get(r1)     // Catch:{ all -> 0x0083 }
                com.google.common.collect.e4$o r3 = (com.google.common.collect.C7717e4.C7755o) r3     // Catch:{ all -> 0x0083 }
                r4 = r3
            L_0x0016:
                r5 = 0
                if (r4 == 0) goto L_0x0055
                java.lang.Object r6 = r4.getKey()     // Catch:{ all -> 0x0083 }
                int r7 = r4.mo30196f()     // Catch:{ all -> 0x0083 }
                if (r7 != r11) goto L_0x007e
                if (r6 == 0) goto L_0x007e
                com.google.common.collect.e4<K, V> r7 = r9.f21429a     // Catch:{ all -> 0x0083 }
                com.google.common.base.j<java.lang.Object> r7 = r7.f21345P     // Catch:{ all -> 0x0083 }
                boolean r7 = r7.mo29253b(r10, r6)     // Catch:{ all -> 0x0083 }
                if (r7 == 0) goto L_0x007e
                com.google.common.collect.e4$d0 r7 = r4.mo30195e()     // Catch:{ all -> 0x0083 }
                java.lang.Object r8 = r7.get()     // Catch:{ all -> 0x0083 }
                if (r8 != 0) goto L_0x005c
                boolean r10 = r9.mo30266a(r7)     // Catch:{ all -> 0x0083 }
                if (r10 == 0) goto L_0x0055
                int r10 = r9.f21419N     // Catch:{ all -> 0x0083 }
                int r10 = r10 + r2
                r9.f21419N = r10     // Catch:{ all -> 0x0083 }
                com.google.common.collect.d4$e r10 = com.google.common.collect.C7660d4.C7665e.COLLECTED     // Catch:{ all -> 0x0083 }
                r9.mo30264a((K) r6, r11, (V) r8, r10)     // Catch:{ all -> 0x0083 }
                com.google.common.collect.e4$o r10 = r9.mo30274b(r3, r4)     // Catch:{ all -> 0x0083 }
                int r11 = r9.f21430b     // Catch:{ all -> 0x0083 }
                int r11 = r11 - r2
                r0.set(r1, r10)     // Catch:{ all -> 0x0083 }
                r9.f21430b = r11     // Catch:{ all -> 0x0083 }
            L_0x0055:
                r9.unlock()
                r9.mo30297o()
                return r5
            L_0x005c:
                com.google.common.collect.e4<K, V> r0 = r9.f21429a     // Catch:{ all -> 0x0083 }
                com.google.common.base.j<java.lang.Object> r0 = r0.f21346Q     // Catch:{ all -> 0x0083 }
                boolean r12 = r0.mo29253b(r12, r8)     // Catch:{ all -> 0x0083 }
                if (r12 == 0) goto L_0x007a
                int r12 = r9.f21419N     // Catch:{ all -> 0x0083 }
                int r12 = r12 + r2
                r9.f21419N = r12     // Catch:{ all -> 0x0083 }
                com.google.common.collect.d4$e r12 = com.google.common.collect.C7660d4.C7665e.REPLACED     // Catch:{ all -> 0x0083 }
                r9.mo30264a((K) r10, r11, (V) r8, r12)     // Catch:{ all -> 0x0083 }
                r9.mo30263a(r4, (V) r13)     // Catch:{ all -> 0x0083 }
                r9.unlock()
                r9.mo30297o()
                return r2
            L_0x007a:
                r9.mo30278b(r4)     // Catch:{ all -> 0x0083 }
                goto L_0x0055
            L_0x007e:
                com.google.common.collect.e4$o r4 = r4.mo30194d()     // Catch:{ all -> 0x0083 }
                goto L_0x0016
            L_0x0083:
                r10 = move-exception
                r9.unlock()
                r9.mo30297o()
                goto L_0x008c
            L_0x008b:
                throw r10
            L_0x008c:
                goto L_0x008b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C7717e4.C7756p.mo30273a(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo30272a(Object obj, int i, Object obj2) {
            C7665e eVar;
            lock();
            try {
                mo30298p();
                AtomicReferenceArray<C7755o<K, V>> atomicReferenceArray = this.f21421P;
                boolean z = true;
                int length = (atomicReferenceArray.length() - 1) & i;
                C7755o oVar = (C7755o) atomicReferenceArray.get(length);
                C7755o oVar2 = oVar;
                while (true) {
                    if (oVar2 == null) {
                        break;
                    }
                    Object key = oVar2.getKey();
                    if (oVar2.mo30196f() != i || key == null || !this.f21429a.f21345P.mo29253b(obj, key)) {
                        oVar2 = oVar2.mo30194d();
                    } else {
                        C7725d0 e = oVar2.mo30195e();
                        Object obj3 = e.get();
                        if (this.f21429a.f21346Q.mo29253b(obj2, obj3)) {
                            eVar = C7665e.EXPLICIT;
                        } else if (mo30266a(e)) {
                            eVar = C7665e.COLLECTED;
                        }
                        this.f21419N++;
                        mo30264a((K) key, i, (V) obj3, eVar);
                        int i2 = this.f21430b - 1;
                        atomicReferenceArray.set(length, mo30274b(oVar, oVar2));
                        this.f21430b = i2;
                        if (eVar != C7665e.EXPLICIT) {
                            z = false;
                        }
                        return z;
                    }
                }
                unlock();
                mo30297o();
                return false;
            } finally {
                unlock();
                mo30297o();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30260a() {
            if (this.f21430b != 0) {
                lock();
                try {
                    AtomicReferenceArray<C7755o<K, V>> atomicReferenceArray = this.f21421P;
                    if (this.f21429a.f21352W != C7717e4.f21342l0) {
                        for (int i = 0; i < atomicReferenceArray.length(); i++) {
                            for (C7755o oVar = (C7755o) atomicReferenceArray.get(i); oVar != null; oVar = oVar.mo30194d()) {
                                if (!oVar.mo30195e().mo29925c()) {
                                    mo30262a(oVar, C7665e.EXPLICIT);
                                }
                            }
                        }
                    }
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    mo30286e();
                    this.f21427V.clear();
                    this.f21428W.clear();
                    this.f21426U.set(0);
                    this.f21419N++;
                    this.f21430b = 0;
                } finally {
                    unlock();
                    mo30297o();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo30267a(C7755o<K, V> oVar, int i) {
            lock();
            try {
                AtomicReferenceArray<C7755o<K, V>> atomicReferenceArray = this.f21421P;
                int length = (atomicReferenceArray.length() - 1) & i;
                C7755o<K, V> oVar2 = (C7755o) atomicReferenceArray.get(length);
                for (C7755o<K, V> oVar3 = oVar2; oVar3 != null; oVar3 = oVar3.mo30194d()) {
                    if (oVar3 == oVar) {
                        this.f21419N++;
                        mo30264a((K) oVar3.getKey(), i, (V) oVar3.mo30195e().get(), C7665e.COLLECTED);
                        int i2 = this.f21430b - 1;
                        atomicReferenceArray.set(length, mo30274b(oVar2, oVar3));
                        this.f21430b = i2;
                        return true;
                    }
                }
                unlock();
                mo30297o();
                return false;
            } finally {
                unlock();
                mo30297o();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo30271a(K k, int i, C7725d0<K, V> d0Var) {
            lock();
            try {
                AtomicReferenceArray<C7755o<K, V>> atomicReferenceArray = this.f21421P;
                int length = (atomicReferenceArray.length() - 1) & i;
                C7755o oVar = (C7755o) atomicReferenceArray.get(length);
                C7755o oVar2 = oVar;
                while (true) {
                    if (oVar2 == null) {
                        break;
                    }
                    Object key = oVar2.getKey();
                    if (oVar2.mo30196f() != i || key == null || !this.f21429a.f21345P.mo29253b(k, key)) {
                        oVar2 = oVar2.mo30194d();
                    } else if (oVar2.mo30195e() == d0Var) {
                        atomicReferenceArray.set(length, mo30274b(oVar, oVar2));
                        return true;
                    }
                }
                unlock();
                mo30297o();
                return false;
            } finally {
                unlock();
                mo30297o();
            }
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: a */
        public boolean mo30268a(C7755o<K, V> oVar, int i, C7665e eVar) {
            AtomicReferenceArray<C7755o<K, V>> atomicReferenceArray = this.f21421P;
            int length = (atomicReferenceArray.length() - 1) & i;
            C7755o<K, V> oVar2 = (C7755o) atomicReferenceArray.get(length);
            for (C7755o<K, V> oVar3 = oVar2; oVar3 != null; oVar3 = oVar3.mo30194d()) {
                if (oVar3 == oVar) {
                    this.f21419N++;
                    mo30264a((K) oVar3.getKey(), i, (V) oVar3.mo30195e().get(), eVar);
                    int i2 = this.f21430b - 1;
                    atomicReferenceArray.set(length, mo30274b(oVar2, oVar3));
                    this.f21430b = i2;
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo30266a(C7725d0<K, V> d0Var) {
            boolean z = false;
            if (d0Var.mo29925c()) {
                return false;
            }
            if (d0Var.get() == null) {
                z = true;
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public V mo30258a(C7755o<K, V> oVar) {
            if (oVar.getKey() == null) {
                mo30302t();
                return null;
            }
            V v = oVar.mo30195e().get();
            if (v == null) {
                mo30302t();
                return null;
            } else if (!this.f21429a.mo30160d() || !this.f21429a.mo30153b(oVar)) {
                return v;
            } else {
                mo30303u();
                return null;
            }
        }
    }

    /* renamed from: com.google.common.collect.e4$q */
    /* compiled from: MapMakerInternalMap */
    private static final class C7757q<K, V> extends C7724d<K, V> {
        private static final long serialVersionUID = 3;

        C7757q(C7763w wVar, C7763w wVar2, C7359j<Object> jVar, C7359j<Object> jVar2, long j, long j2, int i, int i2, C7671f<? super K, ? super V> fVar, ConcurrentMap<K, V> concurrentMap) {
            super(wVar, wVar2, jVar, jVar2, j, j2, i, i2, fVar, concurrentMap);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f21375U = mo30201b(objectInputStream).mo29954c();
            mo30199a(objectInputStream);
        }

        private Object readResolve() {
            return this.f21375U;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            mo30200a(objectOutputStream);
        }
    }

    /* renamed from: com.google.common.collect.e4$r */
    /* compiled from: MapMakerInternalMap */
    static class C7758r<K, V> extends SoftReference<K> implements C7755o<K, V> {

        /* renamed from: N */
        volatile C7725d0<K, V> f21431N = C7717e4.m36831m();

        /* renamed from: a */
        final int f21432a;

        /* renamed from: b */
        final C7755o<K, V> f21433b;

        C7758r(ReferenceQueue<K> referenceQueue, K k, int i, @C5952h C7755o<K, V> oVar) {
            super(k, referenceQueue);
            this.f21432a = i;
            this.f21433b = oVar;
        }

        /* renamed from: a */
        public void mo30178a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo30180b(C7755o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public void mo30181c(C7755o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo30182d(C7755o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public C7725d0<K, V> mo30195e() {
            return this.f21431N;
        }

        /* renamed from: f */
        public int mo30196f() {
            return this.f21432a;
        }

        /* renamed from: g */
        public C7755o<K, V> mo30183g() {
            throw new UnsupportedOperationException();
        }

        public K getKey() {
            return get();
        }

        /* renamed from: h */
        public C7755o<K, V> mo30184h() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: j */
        public C7755o<K, V> mo30185j() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: k */
        public long mo30186k() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: p */
        public C7755o<K, V> mo30187p() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo30179a(C7755o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public C7755o<K, V> mo30194d() {
            return this.f21433b;
        }

        /* renamed from: a */
        public void mo30193a(C7725d0<K, V> d0Var) {
            C7725d0<K, V> d0Var2 = this.f21431N;
            this.f21431N = d0Var;
            d0Var2.mo29923a(d0Var);
        }
    }

    /* renamed from: com.google.common.collect.e4$s */
    /* compiled from: MapMakerInternalMap */
    static final class C7759s<K, V> extends C7758r<K, V> implements C7755o<K, V> {
        @C5966a("Segment.this")

        /* renamed from: O */
        C7755o<K, V> f21434O = C7717e4.m36830l();
        @C5966a("Segment.this")

        /* renamed from: P */
        C7755o<K, V> f21435P = C7717e4.m36830l();

        C7759s(ReferenceQueue<K> referenceQueue, K k, int i, @C5952h C7755o<K, V> oVar) {
            super(referenceQueue, k, i, oVar);
        }

        /* renamed from: a */
        public void mo30179a(C7755o<K, V> oVar) {
            this.f21435P = oVar;
        }

        /* renamed from: b */
        public void mo30180b(C7755o<K, V> oVar) {
            this.f21434O = oVar;
        }

        /* renamed from: g */
        public C7755o<K, V> mo30183g() {
            return this.f21435P;
        }

        /* renamed from: h */
        public C7755o<K, V> mo30184h() {
            return this.f21434O;
        }
    }

    /* renamed from: com.google.common.collect.e4$t */
    /* compiled from: MapMakerInternalMap */
    static final class C7760t<K, V> extends C7758r<K, V> implements C7755o<K, V> {

        /* renamed from: O */
        volatile long f21436O = Long.MAX_VALUE;
        @C5966a("Segment.this")

        /* renamed from: P */
        C7755o<K, V> f21437P = C7717e4.m36830l();
        @C5966a("Segment.this")

        /* renamed from: Q */
        C7755o<K, V> f21438Q = C7717e4.m36830l();

        C7760t(ReferenceQueue<K> referenceQueue, K k, int i, @C5952h C7755o<K, V> oVar) {
            super(referenceQueue, k, i, oVar);
        }

        /* renamed from: a */
        public void mo30178a(long j) {
            this.f21436O = j;
        }

        /* renamed from: c */
        public void mo30181c(C7755o<K, V> oVar) {
            this.f21437P = oVar;
        }

        /* renamed from: d */
        public void mo30182d(C7755o<K, V> oVar) {
            this.f21438Q = oVar;
        }

        /* renamed from: j */
        public C7755o<K, V> mo30185j() {
            return this.f21437P;
        }

        /* renamed from: k */
        public long mo30186k() {
            return this.f21436O;
        }

        /* renamed from: p */
        public C7755o<K, V> mo30187p() {
            return this.f21438Q;
        }
    }

    /* renamed from: com.google.common.collect.e4$u */
    /* compiled from: MapMakerInternalMap */
    static final class C7761u<K, V> extends C7758r<K, V> implements C7755o<K, V> {

        /* renamed from: O */
        volatile long f21439O = Long.MAX_VALUE;
        @C5966a("Segment.this")

        /* renamed from: P */
        C7755o<K, V> f21440P = C7717e4.m36830l();
        @C5966a("Segment.this")

        /* renamed from: Q */
        C7755o<K, V> f21441Q = C7717e4.m36830l();
        @C5966a("Segment.this")

        /* renamed from: R */
        C7755o<K, V> f21442R = C7717e4.m36830l();
        @C5966a("Segment.this")

        /* renamed from: S */
        C7755o<K, V> f21443S = C7717e4.m36830l();

        C7761u(ReferenceQueue<K> referenceQueue, K k, int i, @C5952h C7755o<K, V> oVar) {
            super(referenceQueue, k, i, oVar);
        }

        /* renamed from: a */
        public void mo30178a(long j) {
            this.f21439O = j;
        }

        /* renamed from: b */
        public void mo30180b(C7755o<K, V> oVar) {
            this.f21442R = oVar;
        }

        /* renamed from: c */
        public void mo30181c(C7755o<K, V> oVar) {
            this.f21440P = oVar;
        }

        /* renamed from: d */
        public void mo30182d(C7755o<K, V> oVar) {
            this.f21441Q = oVar;
        }

        /* renamed from: g */
        public C7755o<K, V> mo30183g() {
            return this.f21443S;
        }

        /* renamed from: h */
        public C7755o<K, V> mo30184h() {
            return this.f21442R;
        }

        /* renamed from: j */
        public C7755o<K, V> mo30185j() {
            return this.f21440P;
        }

        /* renamed from: k */
        public long mo30186k() {
            return this.f21439O;
        }

        /* renamed from: p */
        public C7755o<K, V> mo30187p() {
            return this.f21441Q;
        }

        /* renamed from: a */
        public void mo30179a(C7755o<K, V> oVar) {
            this.f21443S = oVar;
        }
    }

    /* renamed from: com.google.common.collect.e4$v */
    /* compiled from: MapMakerInternalMap */
    static final class C7762v<K, V> extends SoftReference<V> implements C7725d0<K, V> {

        /* renamed from: a */
        final C7755o<K, V> f21444a;

        C7762v(ReferenceQueue<V> referenceQueue, V v, C7755o<K, V> oVar) {
            super(v, referenceQueue);
            this.f21444a = oVar;
        }

        /* renamed from: a */
        public void mo29923a(C7725d0<K, V> d0Var) {
            clear();
        }

        /* renamed from: b */
        public C7755o<K, V> mo29924b() {
            return this.f21444a;
        }

        /* renamed from: c */
        public boolean mo29925c() {
            return false;
        }

        /* renamed from: a */
        public C7725d0<K, V> mo29921a(ReferenceQueue<V> referenceQueue, V v, C7755o<K, V> oVar) {
            return new C7762v(referenceQueue, v, oVar);
        }

        /* renamed from: a */
        public V mo29922a() {
            return get();
        }
    }

    /* renamed from: com.google.common.collect.e4$w */
    /* compiled from: MapMakerInternalMap */
    enum C7763w {
        STRONG {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7725d0<K, V> mo30304a(C7756p<K, V> pVar, C7755o<K, V> oVar, V v) {
                return new C7721b0(v);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: d */
            public C7359j<Object> mo30305d() {
                return C7359j.m35591d();
            }
        },
        SOFT {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7725d0<K, V> mo30304a(C7756p<K, V> pVar, C7755o<K, V> oVar, V v) {
                return new C7762v(pVar.f21424S, v, oVar);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: d */
            public C7359j<Object> mo30305d() {
                return C7359j.m35592e();
            }
        },
        WEAK {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7725d0<K, V> mo30304a(C7756p<K, V> pVar, C7755o<K, V> oVar, V v) {
                return new C7749j0(pVar.f21424S, v, oVar);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: d */
            public C7359j<Object> mo30305d() {
                return C7359j.m35592e();
            }
        };

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract <K, V> C7725d0<K, V> mo30304a(C7756p<K, V> pVar, C7755o<K, V> oVar, V v);

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public abstract C7359j<Object> mo30305d();
    }

    /* renamed from: com.google.common.collect.e4$x */
    /* compiled from: MapMakerInternalMap */
    static class C7767x<K, V> implements C7755o<K, V> {

        /* renamed from: N */
        final C7755o<K, V> f21445N;

        /* renamed from: O */
        volatile C7725d0<K, V> f21446O = C7717e4.m36831m();

        /* renamed from: a */
        final K f21447a;

        /* renamed from: b */
        final int f21448b;

        C7767x(K k, int i, @C5952h C7755o<K, V> oVar) {
            this.f21447a = k;
            this.f21448b = i;
            this.f21445N = oVar;
        }

        /* renamed from: a */
        public void mo30178a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo30180b(C7755o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public void mo30181c(C7755o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo30182d(C7755o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public C7725d0<K, V> mo30195e() {
            return this.f21446O;
        }

        /* renamed from: f */
        public int mo30196f() {
            return this.f21448b;
        }

        /* renamed from: g */
        public C7755o<K, V> mo30183g() {
            throw new UnsupportedOperationException();
        }

        public K getKey() {
            return this.f21447a;
        }

        /* renamed from: h */
        public C7755o<K, V> mo30184h() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: j */
        public C7755o<K, V> mo30185j() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: k */
        public long mo30186k() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: p */
        public C7755o<K, V> mo30187p() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo30179a(C7755o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public C7755o<K, V> mo30194d() {
            return this.f21445N;
        }

        /* renamed from: a */
        public void mo30193a(C7725d0<K, V> d0Var) {
            C7725d0<K, V> d0Var2 = this.f21446O;
            this.f21446O = d0Var;
            d0Var2.mo29923a(d0Var);
        }
    }

    /* renamed from: com.google.common.collect.e4$y */
    /* compiled from: MapMakerInternalMap */
    static final class C7768y<K, V> extends C7767x<K, V> implements C7755o<K, V> {
        @C5966a("Segment.this")

        /* renamed from: P */
        C7755o<K, V> f21449P = C7717e4.m36830l();
        @C5966a("Segment.this")

        /* renamed from: Q */
        C7755o<K, V> f21450Q = C7717e4.m36830l();

        C7768y(K k, int i, @C5952h C7755o<K, V> oVar) {
            super(k, i, oVar);
        }

        /* renamed from: a */
        public void mo30179a(C7755o<K, V> oVar) {
            this.f21450Q = oVar;
        }

        /* renamed from: b */
        public void mo30180b(C7755o<K, V> oVar) {
            this.f21449P = oVar;
        }

        /* renamed from: g */
        public C7755o<K, V> mo30183g() {
            return this.f21450Q;
        }

        /* renamed from: h */
        public C7755o<K, V> mo30184h() {
            return this.f21449P;
        }
    }

    /* renamed from: com.google.common.collect.e4$z */
    /* compiled from: MapMakerInternalMap */
    static final class C7769z<K, V> extends C7767x<K, V> implements C7755o<K, V> {

        /* renamed from: P */
        volatile long f21451P = Long.MAX_VALUE;
        @C5966a("Segment.this")

        /* renamed from: Q */
        C7755o<K, V> f21452Q = C7717e4.m36830l();
        @C5966a("Segment.this")

        /* renamed from: R */
        C7755o<K, V> f21453R = C7717e4.m36830l();

        C7769z(K k, int i, @C5952h C7755o<K, V> oVar) {
            super(k, i, oVar);
        }

        /* renamed from: a */
        public void mo30178a(long j) {
            this.f21451P = j;
        }

        /* renamed from: c */
        public void mo30181c(C7755o<K, V> oVar) {
            this.f21452Q = oVar;
        }

        /* renamed from: d */
        public void mo30182d(C7755o<K, V> oVar) {
            this.f21453R = oVar;
        }

        /* renamed from: j */
        public C7755o<K, V> mo30185j() {
            return this.f21452Q;
        }

        /* renamed from: k */
        public long mo30186k() {
            return this.f21451P;
        }

        /* renamed from: p */
        public C7755o<K, V> mo30187p() {
            return this.f21453R;
        }
    }

    C7717e4(C7660d4 d4Var) {
        this.f21344O = Math.min(d4Var.mo29958g(), 65536);
        this.f21347R = d4Var.mo29963l();
        this.f21348S = d4Var.mo29965n();
        this.f21345P = d4Var.mo29962k();
        this.f21349T = d4Var.f21252e;
        this.f21350U = d4Var.mo29959h();
        this.f21351V = d4Var.mo29960i();
        this.f21354Y = C7728f.m36898a(this.f21347R, mo30160d(), mo30149a());
        this.f21355Z = d4Var.mo29964m();
        this.f21353X = d4Var.mo30660a();
        this.f21352W = this.f21353X == C7932a.INSTANCE ? m36829j() : new ConcurrentLinkedQueue<>();
        int min = Math.min(d4Var.mo29961j(), 1073741824);
        if (mo30149a()) {
            min = Math.min(min, this.f21349T);
        }
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i2 < this.f21344O && (!mo30149a() || i2 * 2 <= this.f21349T)) {
            i3++;
            i2 <<= 1;
        }
        this.f21358b = 32 - i3;
        this.f21356a = i2 - 1;
        this.f21343N = mo30151a(i2);
        int i4 = min / i2;
        if (i4 * i2 < min) {
            i4++;
        }
        int i5 = 1;
        while (i5 < i4) {
            i5 <<= 1;
        }
        if (mo30149a()) {
            int i6 = this.f21349T;
            int i7 = (i6 / i2) + 1;
            int i8 = i6 % i2;
            while (i < this.f21343N.length) {
                if (i == i8) {
                    i7--;
                }
                this.f21343N[i] = mo29917a(i5, i7);
                i++;
            }
            return;
        }
        while (true) {
            C7756p<K, V>[] pVarArr = this.f21343N;
            if (i < pVarArr.length) {
                pVarArr[i] = mo29917a(i5, -1);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    static int m36825c(int i) {
        int i2 = i + ((i << 15) ^ -12931);
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    /* renamed from: j */
    static <E> Queue<E> m36829j() {
        return f21342l0;
    }

    /* renamed from: l */
    static <K, V> C7755o<K, V> m36830l() {
        return C7754n.INSTANCE;
    }

    /* renamed from: m */
    static <K, V> C7725d0<K, V> m36831m() {
        return f21341k0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo30149a() {
        return this.f21349T != -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C7756p<K, V> mo29918b(int i) {
        return this.f21343N[(i >>> this.f21358b) & this.f21356a];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo30154c(Object obj) {
        return m36825c(this.f21345P.mo29254c(obj));
    }

    public void clear() {
        for (C7756p<K, V> a : this.f21343N) {
            a.mo30260a();
        }
    }

    public boolean containsKey(@C5952h Object obj) {
        if (obj == null) {
            return false;
        }
        int c = mo30154c(obj);
        return mo29918b(c).mo30270a(obj, c);
    }

    public boolean containsValue(@C5952h Object obj) {
        Object obj2 = obj;
        if (obj2 == null) {
            return false;
        }
        C7756p<K, V>[] pVarArr = this.f21343N;
        long j = -1;
        int i = 0;
        while (i < 3) {
            long j2 = 0;
            for (C7756p<K, V> pVar : pVarArr) {
                int i2 = pVar.f21430b;
                AtomicReferenceArray<C7755o<K, V>> atomicReferenceArray = pVar.f21421P;
                for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                    for (C7755o oVar = (C7755o) atomicReferenceArray.get(i3); oVar != null; oVar = oVar.mo30194d()) {
                        Object a = pVar.mo30258a(oVar);
                        if (a != null && this.f21346Q.mo29253b(obj2, a)) {
                            return true;
                        }
                    }
                }
                j2 += (long) pVar.f21419N;
            }
            if (j2 == j) {
                break;
            }
            i++;
            j = j2;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo30160d() {
        return mo30163f() || mo30161e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo30161e() {
        return this.f21350U > 0;
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.f21360c0;
        if (set != null) {
            return set;
        }
        C7740h hVar = new C7740h();
        this.f21360c0 = hVar;
        return hVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo30163f() {
        return this.f21351V > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo30164g() {
        while (true) {
            C7672g gVar = (C7672g) this.f21352W.poll();
            if (gVar != null) {
                try {
                    this.f21353X.mo29980a(gVar);
                } catch (Exception e) {
                    f21340j0.log(Level.WARNING, "Exception thrown by removal listener", e);
                }
            } else {
                return;
            }
        }
    }

    public V get(@C5952h Object obj) {
        if (obj == null) {
            return null;
        }
        int c = mo30154c(obj);
        return mo29918b(c).mo30275b(obj, c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo30165h() {
        return this.f21347R != C7763w.STRONG;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo30166i() {
        return this.f21348S != C7763w.STRONG;
    }

    public boolean isEmpty() {
        C7756p<K, V>[] pVarArr = this.f21343N;
        long j = 0;
        for (int i = 0; i < pVarArr.length; i++) {
            if (pVarArr[i].f21430b != 0) {
                return false;
            }
            j += (long) pVarArr[i].f21419N;
        }
        if (j != 0) {
            for (int i2 = 0; i2 < pVarArr.length; i2++) {
                if (pVarArr[i2].f21430b != 0) {
                    return false;
                }
                j -= (long) pVarArr[i2].f21419N;
            }
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    public Set<K> keySet() {
        Set<K> set = this.f21357a0;
        if (set != null) {
            return set;
        }
        C7753m mVar = new C7753m();
        this.f21357a0 = mVar;
        return mVar;
    }

    public V put(K k, V v) {
        C7397x.m35664a(k);
        C7397x.m35664a(v);
        int c = mo30154c((Object) k);
        return mo29918b(c).mo30259a(k, c, v, false);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public V putIfAbsent(K k, V v) {
        C7397x.m35664a(k);
        C7397x.m35664a(v);
        int c = mo30154c((Object) k);
        return mo29918b(c).mo30259a(k, c, v, true);
    }

    public V remove(@C5952h Object obj) {
        if (obj == null) {
            return null;
        }
        int c = mo30154c(obj);
        return mo29918b(c).mo30285e(obj, c);
    }

    public boolean replace(K k, @C5952h V v, V v2) {
        C7397x.m35664a(k);
        C7397x.m35664a(v2);
        if (v == null) {
            return false;
        }
        int c = mo30154c((Object) k);
        return mo29918b(c).mo30273a(k, c, v, v2);
    }

    public int size() {
        long j = 0;
        for (C7756p<K, V> pVar : this.f21343N) {
            j += (long) pVar.f21430b;
        }
        return C6637f.m31672b(j);
    }

    public Collection<V> values() {
        Collection<V> collection = this.f21359b0;
        if (collection != null) {
            return collection;
        }
        C7727e0 e0Var = new C7727e0();
        this.f21359b0 = e0Var;
        return e0Var;
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        C7757q qVar = new C7757q(this.f21347R, this.f21348S, this.f21345P, this.f21346Q, this.f21351V, this.f21350U, this.f21349T, this.f21344O, this.f21353X, this);
        return qVar;
    }

    @C5966a("Segment.this")
    /* renamed from: e */
    static <K, V> void m36827e(C7755o<K, V> oVar) {
        C7755o l = m36830l();
        oVar.mo30180b(l);
        oVar.mo30179a(l);
    }

    @C5966a("Segment.this")
    /* renamed from: f */
    static <K, V> void m36828f(C7755o<K, V> oVar) {
        C7755o l = m36830l();
        oVar.mo30181c(l);
        oVar.mo30182d(l);
    }

    /* access modifiers changed from: 0000 */
    @C2778d
    @C5966a("Segment.this")
    /* renamed from: a */
    public C7755o<K, V> mo30146a(K k, int i, @C5952h C7755o<K, V> oVar) {
        return mo29918b(i).mo30257a(k, i, oVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo30153b(C7755o<K, V> oVar) {
        return mo30150a(oVar, this.f21355Z.mo23201a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo30159d(C7755o<K, V> oVar) {
        int f = oVar.mo30196f();
        mo29918b(f).mo30267a(oVar, f);
    }

    @C5966a("Segment.this")
    /* renamed from: b */
    static <K, V> void m36824b(C7755o<K, V> oVar, C7755o<K, V> oVar2) {
        oVar.mo30180b(oVar2);
        oVar2.mo30179a(oVar);
    }

    /* access modifiers changed from: 0000 */
    @C2778d
    @C5966a("Segment.this")
    /* renamed from: a */
    public C7755o<K, V> mo30145a(C7755o<K, V> oVar, C7755o<K, V> oVar2) {
        return mo29918b(oVar.mo30196f()).mo30256a(oVar, oVar2);
    }

    /* access modifiers changed from: 0000 */
    @C2778d
    /* renamed from: c */
    public boolean mo30155c(C7755o<K, V> oVar) {
        return mo29918b(oVar.mo30196f()).mo30258a(oVar) != null;
    }

    public boolean remove(@C5952h Object obj, @C5952h Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int c = mo30154c(obj);
        return mo29918b(c).mo30272a(obj, c, obj2);
    }

    @C5966a("Segment.this")
    /* renamed from: c */
    static <K, V> void m36826c(C7755o<K, V> oVar, C7755o<K, V> oVar2) {
        oVar.mo30181c(oVar2);
        oVar2.mo30182d(oVar);
    }

    /* access modifiers changed from: 0000 */
    @C2778d
    @C5966a("Segment.this")
    /* renamed from: a */
    public C7725d0<K, V> mo30144a(C7755o<K, V> oVar, V v) {
        return this.f21348S.mo30304a(mo29918b(oVar.mo30196f()), oVar, v);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C7755o<K, V> mo30152b(@C5952h Object obj) {
        if (obj == null) {
            return null;
        }
        int c = mo30154c(obj);
        return mo29918b(c).mo30280c(obj, c);
    }

    public V replace(K k, V v) {
        C7397x.m35664a(k);
        C7397x.m35664a(v);
        int c = mo30154c((Object) k);
        return mo29918b(c).mo30276b(k, c, v);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo30148a(C7725d0<K, V> d0Var) {
        C7755o b = d0Var.mo29924b();
        int f = b.mo30196f();
        mo29918b(f).mo30279b(b.getKey(), f, d0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C7756p<K, V> mo29917a(int i, int i2) {
        return new C7756p<>(this, i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public V mo30147a(C7755o<K, V> oVar) {
        if (oVar.getKey() == null) {
            return null;
        }
        V v = oVar.mo30195e().get();
        if (v == null) {
            return null;
        }
        if (!mo30160d() || !mo30153b(oVar)) {
            return v;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo30150a(C7755o<K, V> oVar, long j) {
        return j - oVar.mo30186k() > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C7756p<K, V>[] mo30151a(int i) {
        return new C7756p[i];
    }
}
