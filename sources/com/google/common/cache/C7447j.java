package com.google.common.cache;

import com.google.common.base.C7333e0;
import com.google.common.base.C7359j;
import com.google.common.base.C7365j0;
import com.google.common.base.C7380p;
import com.google.common.base.C7397x;
import com.google.common.cache.C7420a.C7421a;
import com.google.common.cache.C7420a.C7422b;
import com.google.common.cache.CacheLoader.InvalidCacheLoadException;
import com.google.common.collect.C7800f4;
import com.google.common.collect.C7923j;
import com.google.common.collect.C8178t3;
import com.google.common.collect.C8302z2;
import com.google.common.util.concurrent.C8437a0;
import com.google.common.util.concurrent.C8473c0;
import com.google.common.util.concurrent.C8511g0;
import com.google.common.util.concurrent.C8520j0;
import com.google.common.util.concurrent.C8565o0;
import com.google.common.util.concurrent.C8566p;
import com.google.common.util.concurrent.C8595u0;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.io.IOException;
import java.io.ObjectInputStream;
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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p076c.p112d.p148d.p149a.C2778d;
import p076c.p112d.p148d.p150g.C6637f;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5966a;

@C2776b(emulated = true)
/* renamed from: com.google.common.cache.j */
/* compiled from: LocalCache */
class C7447j<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* renamed from: h0 */
    static final int f20905h0 = 1073741824;

    /* renamed from: i0 */
    static final int f20906i0 = 65536;

    /* renamed from: j0 */
    static final int f20907j0 = 3;

    /* renamed from: k0 */
    static final int f20908k0 = 63;

    /* renamed from: l0 */
    static final int f20909l0 = 16;

    /* renamed from: m0 */
    static final Logger f20910m0 = Logger.getLogger(C7447j.class.getName());

    /* renamed from: n0 */
    static final C8511g0 f20911n0 = C8520j0.m40280c();

    /* renamed from: o0 */
    static final C7451b0<Object, Object> f20912o0 = new C7448a();

    /* renamed from: p0 */
    static final Queue<? extends Object> f20913p0 = new C7450b();

    /* renamed from: N */
    final C7493s<K, V>[] f20914N;

    /* renamed from: O */
    final int f20915O;

    /* renamed from: P */
    final C7359j<Object> f20916P;

    /* renamed from: Q */
    final C7359j<Object> f20917Q;

    /* renamed from: R */
    final C7496u f20918R;

    /* renamed from: S */
    final C7496u f20919S;

    /* renamed from: T */
    final long f20920T;

    /* renamed from: U */
    final C7527s<K, V> f20921U;

    /* renamed from: V */
    final long f20922V;

    /* renamed from: W */
    final long f20923W;

    /* renamed from: X */
    final long f20924X;

    /* renamed from: Y */
    final Queue<C7521q<K, V>> f20925Y;

    /* renamed from: Z */
    final C7517o<K, V> f20926Z;

    /* renamed from: a */
    final int f20927a;

    /* renamed from: a0 */
    final C7365j0 f20928a0;

    /* renamed from: b */
    final int f20929b;

    /* renamed from: b0 */
    final C7460f f20930b0;

    /* renamed from: c0 */
    final C7422b f20931c0;
    @C5952h

    /* renamed from: d0 */
    final CacheLoader<? super K, V> f20932d0;

    /* renamed from: e0 */
    Set<K> f20933e0;

    /* renamed from: f0 */
    Collection<V> f20934f0;

    /* renamed from: g0 */
    Set<Entry<K, V>> f20935g0;

    /* renamed from: com.google.common.cache.j$a */
    /* compiled from: LocalCache */
    static class C7448a implements C7451b0<Object, Object> {
        C7448a() {
        }

        /* renamed from: a */
        public C7451b0<Object, Object> mo29419a(ReferenceQueue<Object> referenceQueue, @C5952h Object obj, C7492r<Object, Object> rVar) {
            return this;
        }

        /* renamed from: a */
        public Object mo29420a() {
            return null;
        }

        /* renamed from: a */
        public void mo29421a(Object obj) {
        }

        /* renamed from: b */
        public C7492r<Object, Object> mo29422b() {
            return null;
        }

        /* renamed from: c */
        public boolean mo29423c() {
            return false;
        }

        /* renamed from: d */
        public int mo29424d() {
            return 0;
        }

        /* renamed from: e */
        public boolean mo29425e() {
            return false;
        }

        public Object get() {
            return null;
        }
    }

    /* renamed from: com.google.common.cache.j$a0 */
    /* compiled from: LocalCache */
    final class C7449a0 extends C7474i<V> {
        C7449a0() {
            super();
        }

        public V next() {
            return mo29479c().getValue();
        }
    }

    /* renamed from: com.google.common.cache.j$b */
    /* compiled from: LocalCache */
    static class C7450b extends AbstractQueue<Object> {
        C7450b() {
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

    /* renamed from: com.google.common.cache.j$b0 */
    /* compiled from: LocalCache */
    interface C7451b0<K, V> {
        /* renamed from: a */
        C7451b0<K, V> mo29419a(ReferenceQueue<V> referenceQueue, @C5952h V v, C7492r<K, V> rVar);

        /* renamed from: a */
        V mo29420a() throws ExecutionException;

        /* renamed from: a */
        void mo29421a(@C5952h V v);

        @C5952h
        /* renamed from: b */
        C7492r<K, V> mo29422b();

        /* renamed from: c */
        boolean mo29423c();

        /* renamed from: d */
        int mo29424d();

        /* renamed from: e */
        boolean mo29425e();

        @C5952h
        V get();
    }

    /* renamed from: com.google.common.cache.j$c */
    /* compiled from: LocalCache */
    abstract class C7452c<T> extends AbstractSet<T> {

        /* renamed from: a */
        final ConcurrentMap<?, ?> f20937a;

        C7452c(ConcurrentMap<?, ?> concurrentMap) {
            this.f20937a = concurrentMap;
        }

        public void clear() {
            this.f20937a.clear();
        }

        public boolean isEmpty() {
            return this.f20937a.isEmpty();
        }

        public int size() {
            return this.f20937a.size();
        }
    }

    /* renamed from: com.google.common.cache.j$c0 */
    /* compiled from: LocalCache */
    final class C7453c0 extends AbstractCollection<V> {

        /* renamed from: a */
        private final ConcurrentMap<?, ?> f20939a;

        C7453c0(ConcurrentMap<?, ?> concurrentMap) {
            this.f20939a = concurrentMap;
        }

        public void clear() {
            this.f20939a.clear();
        }

        public boolean contains(Object obj) {
            return this.f20939a.containsValue(obj);
        }

        public boolean isEmpty() {
            return this.f20939a.isEmpty();
        }

        public Iterator<V> iterator() {
            return new C7449a0();
        }

        public int size() {
            return this.f20939a.size();
        }
    }

    /* renamed from: com.google.common.cache.j$d */
    /* compiled from: LocalCache */
    static abstract class C7454d<K, V> implements C7492r<K, V> {
        C7454d() {
        }

        /* renamed from: a */
        public void mo29442a(C7451b0<K, V> b0Var) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo29445b(C7492r<K, V> rVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public void mo29446c(C7492r<K, V> rVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public C7492r<K, V> mo29447d() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public C7451b0<K, V> mo29449e() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public int mo29450f() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public C7492r<K, V> mo29451g() {
            throw new UnsupportedOperationException();
        }

        public K getKey() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: h */
        public long mo29453h() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: j */
        public C7492r<K, V> mo29454j() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: k */
        public long mo29455k() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: p */
        public C7492r<K, V> mo29456p() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: q */
        public C7492r<K, V> mo29457q() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo29441a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo29444b(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo29448d(C7492r<K, V> rVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo29443a(C7492r<K, V> rVar) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.common.cache.j$d0 */
    /* compiled from: LocalCache */
    static final class C7455d0<K, V> extends C7469f0<K, V> {

        /* renamed from: O */
        volatile long f20941O = Long.MAX_VALUE;
        @C5966a("Segment.this")

        /* renamed from: P */
        C7492r<K, V> f20942P = C7447j.m35815u();
        @C5966a("Segment.this")

        /* renamed from: Q */
        C7492r<K, V> f20943Q = C7447j.m35815u();

        C7455d0(ReferenceQueue<K> referenceQueue, K k, int i, @C5952h C7492r<K, V> rVar) {
            super(referenceQueue, k, i, rVar);
        }

        /* renamed from: a */
        public void mo29441a(long j) {
            this.f20941O = j;
        }

        /* renamed from: b */
        public void mo29445b(C7492r<K, V> rVar) {
            this.f20943Q = rVar;
        }

        /* renamed from: d */
        public void mo29448d(C7492r<K, V> rVar) {
            this.f20942P = rVar;
        }

        /* renamed from: g */
        public C7492r<K, V> mo29451g() {
            return this.f20943Q;
        }

        /* renamed from: k */
        public long mo29455k() {
            return this.f20941O;
        }

        /* renamed from: p */
        public C7492r<K, V> mo29456p() {
            return this.f20942P;
        }
    }

    /* renamed from: com.google.common.cache.j$e */
    /* compiled from: LocalCache */
    static final class C7456e<K, V> extends AbstractQueue<C7492r<K, V>> {

        /* renamed from: a */
        final C7492r<K, V> f20944a = new C7457a();

        /* renamed from: com.google.common.cache.j$e$a */
        /* compiled from: LocalCache */
        class C7457a extends C7454d<K, V> {

            /* renamed from: a */
            C7492r<K, V> f20946a = this;

            /* renamed from: b */
            C7492r<K, V> f20947b = this;

            C7457a() {
            }

            /* renamed from: a */
            public void mo29441a(long j) {
            }

            /* renamed from: b */
            public void mo29445b(C7492r<K, V> rVar) {
                this.f20947b = rVar;
            }

            /* renamed from: d */
            public void mo29448d(C7492r<K, V> rVar) {
                this.f20946a = rVar;
            }

            /* renamed from: g */
            public C7492r<K, V> mo29451g() {
                return this.f20947b;
            }

            /* renamed from: k */
            public long mo29455k() {
                return Long.MAX_VALUE;
            }

            /* renamed from: p */
            public C7492r<K, V> mo29456p() {
                return this.f20946a;
            }
        }

        /* renamed from: com.google.common.cache.j$e$b */
        /* compiled from: LocalCache */
        class C7458b extends C7923j<C7492r<K, V>> {
            C7458b(C7492r rVar) {
                super(rVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public C7492r<K, V> mo29469a(C7492r<K, V> rVar) {
                C7492r<K, V> p = rVar.mo29456p();
                if (p == C7456e.this.f20944a) {
                    return null;
                }
                return p;
            }
        }

        C7456e() {
        }

        /* renamed from: a */
        public boolean offer(C7492r<K, V> rVar) {
            C7447j.m35810b(rVar.mo29451g(), rVar.mo29456p());
            C7447j.m35810b(this.f20944a.mo29451g(), rVar);
            C7447j.m35810b(rVar, this.f20944a);
            return true;
        }

        public void clear() {
            C7492r<K, V> p = this.f20944a.mo29456p();
            while (true) {
                C7492r<K, V> rVar = this.f20944a;
                if (p != rVar) {
                    C7492r p2 = p.mo29456p();
                    C7447j.m35809b(p);
                    p = p2;
                } else {
                    rVar.mo29448d(rVar);
                    C7492r<K, V> rVar2 = this.f20944a;
                    rVar2.mo29445b(rVar2);
                    return;
                }
            }
        }

        public boolean contains(Object obj) {
            return ((C7492r) obj).mo29456p() != C7491q.INSTANCE;
        }

        public boolean isEmpty() {
            return this.f20944a.mo29456p() == this.f20944a;
        }

        public Iterator<C7492r<K, V>> iterator() {
            return new C7458b(peek());
        }

        public boolean remove(Object obj) {
            C7492r rVar = (C7492r) obj;
            C7492r g = rVar.mo29451g();
            C7492r p = rVar.mo29456p();
            C7447j.m35810b(g, p);
            C7447j.m35809b(rVar);
            return p != C7491q.INSTANCE;
        }

        public int size() {
            int i = 0;
            for (C7492r<K, V> p = this.f20944a.mo29456p(); p != this.f20944a; p = p.mo29456p()) {
                i++;
            }
            return i;
        }

        public C7492r<K, V> peek() {
            C7492r<K, V> p = this.f20944a.mo29456p();
            if (p == this.f20944a) {
                return null;
            }
            return p;
        }

        public C7492r<K, V> poll() {
            C7492r<K, V> p = this.f20944a.mo29456p();
            if (p == this.f20944a) {
                return null;
            }
            remove(p);
            return p;
        }
    }

    /* renamed from: com.google.common.cache.j$e0 */
    /* compiled from: LocalCache */
    static final class C7459e0<K, V> extends C7469f0<K, V> {

        /* renamed from: O */
        volatile long f20949O = Long.MAX_VALUE;
        @C5966a("Segment.this")

        /* renamed from: P */
        C7492r<K, V> f20950P = C7447j.m35815u();
        @C5966a("Segment.this")

        /* renamed from: Q */
        C7492r<K, V> f20951Q = C7447j.m35815u();

        /* renamed from: R */
        volatile long f20952R = Long.MAX_VALUE;
        @C5966a("Segment.this")

        /* renamed from: S */
        C7492r<K, V> f20953S = C7447j.m35815u();
        @C5966a("Segment.this")

        /* renamed from: T */
        C7492r<K, V> f20954T = C7447j.m35815u();

        C7459e0(ReferenceQueue<K> referenceQueue, K k, int i, @C5952h C7492r<K, V> rVar) {
            super(referenceQueue, k, i, rVar);
        }

        /* renamed from: a */
        public void mo29441a(long j) {
            this.f20949O = j;
        }

        /* renamed from: b */
        public void mo29445b(C7492r<K, V> rVar) {
            this.f20951Q = rVar;
        }

        /* renamed from: c */
        public void mo29446c(C7492r<K, V> rVar) {
            this.f20953S = rVar;
        }

        /* renamed from: d */
        public void mo29448d(C7492r<K, V> rVar) {
            this.f20950P = rVar;
        }

        /* renamed from: g */
        public C7492r<K, V> mo29451g() {
            return this.f20951Q;
        }

        /* renamed from: h */
        public long mo29453h() {
            return this.f20952R;
        }

        /* renamed from: j */
        public C7492r<K, V> mo29454j() {
            return this.f20953S;
        }

        /* renamed from: k */
        public long mo29455k() {
            return this.f20949O;
        }

        /* renamed from: p */
        public C7492r<K, V> mo29456p() {
            return this.f20950P;
        }

        /* renamed from: q */
        public C7492r<K, V> mo29457q() {
            return this.f20954T;
        }

        /* renamed from: a */
        public void mo29443a(C7492r<K, V> rVar) {
            this.f20954T = rVar;
        }

        /* renamed from: b */
        public void mo29444b(long j) {
            this.f20952R = j;
        }
    }

    /* renamed from: com.google.common.cache.j$f */
    /* compiled from: LocalCache */
    enum C7460f {
        STRONG {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7492r<K, V> mo29471a(C7493s<K, V> sVar, K k, int i, @C5952h C7492r<K, V> rVar) {
                return new C7502x(k, i, rVar);
            }
        },
        STRONG_ACCESS {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7492r<K, V> mo29471a(C7493s<K, V> sVar, K k, int i, @C5952h C7492r<K, V> rVar) {
                return new C7500v(k, i, rVar);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7492r<K, V> mo29470a(C7493s<K, V> sVar, C7492r<K, V> rVar, C7492r<K, V> rVar2) {
                C7492r<K, V> a = super.mo29470a(sVar, rVar, rVar2);
                mo29472a(rVar, a);
                return a;
            }
        },
        STRONG_WRITE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7492r<K, V> mo29471a(C7493s<K, V> sVar, K k, int i, @C5952h C7492r<K, V> rVar) {
                return new C7504z(k, i, rVar);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7492r<K, V> mo29470a(C7493s<K, V> sVar, C7492r<K, V> rVar, C7492r<K, V> rVar2) {
                C7492r<K, V> a = super.mo29470a(sVar, rVar, rVar2);
                mo29473b(rVar, a);
                return a;
            }
        },
        STRONG_ACCESS_WRITE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7492r<K, V> mo29471a(C7493s<K, V> sVar, K k, int i, @C5952h C7492r<K, V> rVar) {
                return new C7501w(k, i, rVar);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7492r<K, V> mo29470a(C7493s<K, V> sVar, C7492r<K, V> rVar, C7492r<K, V> rVar2) {
                C7492r<K, V> a = super.mo29470a(sVar, rVar, rVar2);
                mo29472a(rVar, a);
                mo29473b(rVar, a);
                return a;
            }
        },
        WEAK {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7492r<K, V> mo29471a(C7493s<K, V> sVar, K k, int i, @C5952h C7492r<K, V> rVar) {
                return new C7469f0(sVar.f21011S, k, i, rVar);
            }
        },
        WEAK_ACCESS {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7492r<K, V> mo29471a(C7493s<K, V> sVar, K k, int i, @C5952h C7492r<K, V> rVar) {
                return new C7455d0(sVar.f21011S, k, i, rVar);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7492r<K, V> mo29470a(C7493s<K, V> sVar, C7492r<K, V> rVar, C7492r<K, V> rVar2) {
                C7492r<K, V> a = super.mo29470a(sVar, rVar, rVar2);
                mo29472a(rVar, a);
                return a;
            }
        },
        WEAK_WRITE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7492r<K, V> mo29471a(C7493s<K, V> sVar, K k, int i, @C5952h C7492r<K, V> rVar) {
                return new C7473h0(sVar.f21011S, k, i, rVar);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7492r<K, V> mo29470a(C7493s<K, V> sVar, C7492r<K, V> rVar, C7492r<K, V> rVar2) {
                C7492r<K, V> a = super.mo29470a(sVar, rVar, rVar2);
                mo29473b(rVar, a);
                return a;
            }
        },
        WEAK_ACCESS_WRITE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7492r<K, V> mo29471a(C7493s<K, V> sVar, K k, int i, @C5952h C7492r<K, V> rVar) {
                return new C7459e0(sVar.f21011S, k, i, rVar);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7492r<K, V> mo29470a(C7493s<K, V> sVar, C7492r<K, V> rVar, C7492r<K, V> rVar2) {
                C7492r<K, V> a = super.mo29470a(sVar, rVar, rVar2);
                mo29472a(rVar, a);
                mo29473b(rVar, a);
                return a;
            }
        };
        
        static final int ACCESS_MASK = 1;
        static final int WEAK_MASK = 4;
        static final int WRITE_MASK = 2;
        static final C7460f[] factories = null;

        static {
            C7460f fVar;
            C7460f fVar2;
            C7460f fVar3;
            C7460f fVar4;
            C7460f fVar5;
            C7460f fVar6;
            C7460f fVar7;
            C7460f fVar8;
            factories = new C7460f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8};
        }

        /* renamed from: a */
        static C7460f m35913a(C7496u uVar, boolean z, boolean z2) {
            char c = 0;
            boolean z3 = (uVar == C7496u.WEAK ? (char) 4 : 0) | z;
            if (z2) {
                c = 2;
            }
            return factories[z3 | c];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract <K, V> C7492r<K, V> mo29471a(C7493s<K, V> sVar, K k, int i, @C5952h C7492r<K, V> rVar);

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: b */
        public <K, V> void mo29473b(C7492r<K, V> rVar, C7492r<K, V> rVar2) {
            rVar2.mo29444b(rVar.mo29453h());
            C7447j.m35813c(rVar.mo29457q(), rVar2);
            C7447j.m35813c(rVar2, rVar.mo29454j());
            C7447j.m35812c(rVar);
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: a */
        public <K, V> C7492r<K, V> mo29470a(C7493s<K, V> sVar, C7492r<K, V> rVar, C7492r<K, V> rVar2) {
            return mo29471a(sVar, rVar.getKey(), rVar.mo29450f(), rVar2);
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: a */
        public <K, V> void mo29472a(C7492r<K, V> rVar, C7492r<K, V> rVar2) {
            rVar2.mo29441a(rVar.mo29455k());
            C7447j.m35810b(rVar.mo29451g(), rVar2);
            C7447j.m35810b(rVar2, rVar.mo29456p());
            C7447j.m35809b(rVar);
        }
    }

    /* renamed from: com.google.common.cache.j$f0 */
    /* compiled from: LocalCache */
    static class C7469f0<K, V> extends WeakReference<K> implements C7492r<K, V> {

        /* renamed from: N */
        volatile C7451b0<K, V> f20955N = C7447j.m35816v();

        /* renamed from: a */
        final int f20956a;

        /* renamed from: b */
        final C7492r<K, V> f20957b;

        C7469f0(ReferenceQueue<K> referenceQueue, K k, int i, @C5952h C7492r<K, V> rVar) {
            super(k, referenceQueue);
            this.f20956a = i;
            this.f20957b = rVar;
        }

        /* renamed from: a */
        public void mo29441a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo29445b(C7492r<K, V> rVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public void mo29446c(C7492r<K, V> rVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo29448d(C7492r<K, V> rVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public C7451b0<K, V> mo29449e() {
            return this.f20955N;
        }

        /* renamed from: f */
        public int mo29450f() {
            return this.f20956a;
        }

        /* renamed from: g */
        public C7492r<K, V> mo29451g() {
            throw new UnsupportedOperationException();
        }

        public K getKey() {
            return get();
        }

        /* renamed from: h */
        public long mo29453h() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: j */
        public C7492r<K, V> mo29454j() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: k */
        public long mo29455k() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: p */
        public C7492r<K, V> mo29456p() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: q */
        public C7492r<K, V> mo29457q() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo29443a(C7492r<K, V> rVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo29444b(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public C7492r<K, V> mo29447d() {
            return this.f20957b;
        }

        /* renamed from: a */
        public void mo29442a(C7451b0<K, V> b0Var) {
            this.f20955N = b0Var;
        }
    }

    /* renamed from: com.google.common.cache.j$g */
    /* compiled from: LocalCache */
    final class C7470g extends C7474i<Entry<K, V>> {
        C7470g() {
            super();
        }

        public Entry<K, V> next() {
            return mo29479c();
        }
    }

    /* renamed from: com.google.common.cache.j$g0 */
    /* compiled from: LocalCache */
    static class C7471g0<K, V> extends WeakReference<V> implements C7451b0<K, V> {

        /* renamed from: a */
        final C7492r<K, V> f20959a;

        C7471g0(ReferenceQueue<V> referenceQueue, V v, C7492r<K, V> rVar) {
            super(v, referenceQueue);
            this.f20959a = rVar;
        }

        /* renamed from: a */
        public C7451b0<K, V> mo29419a(ReferenceQueue<V> referenceQueue, V v, C7492r<K, V> rVar) {
            return new C7471g0(referenceQueue, v, rVar);
        }

        /* renamed from: a */
        public void mo29421a(V v) {
        }

        /* renamed from: b */
        public C7492r<K, V> mo29422b() {
            return this.f20959a;
        }

        /* renamed from: c */
        public boolean mo29423c() {
            return true;
        }

        /* renamed from: d */
        public int mo29424d() {
            return 1;
        }

        /* renamed from: e */
        public boolean mo29425e() {
            return false;
        }

        /* renamed from: a */
        public V mo29420a() {
            return get();
        }
    }

    /* renamed from: com.google.common.cache.j$h */
    /* compiled from: LocalCache */
    final class C7472h extends C7452c<Entry<K, V>> {
        C7472h(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
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
            Object obj2 = C7447j.this.get(key);
            if (obj2 != null && C7447j.this.f20917Q.mo29253b(entry.getValue(), obj2)) {
                z = true;
            }
            return z;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C7470g();
        }

        public boolean remove(Object obj) {
            boolean z = false;
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            if (key != null && C7447j.this.remove(key, entry.getValue())) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: com.google.common.cache.j$h0 */
    /* compiled from: LocalCache */
    static final class C7473h0<K, V> extends C7469f0<K, V> {

        /* renamed from: O */
        volatile long f20961O = Long.MAX_VALUE;
        @C5966a("Segment.this")

        /* renamed from: P */
        C7492r<K, V> f20962P = C7447j.m35815u();
        @C5966a("Segment.this")

        /* renamed from: Q */
        C7492r<K, V> f20963Q = C7447j.m35815u();

        C7473h0(ReferenceQueue<K> referenceQueue, K k, int i, @C5952h C7492r<K, V> rVar) {
            super(referenceQueue, k, i, rVar);
        }

        /* renamed from: a */
        public void mo29443a(C7492r<K, V> rVar) {
            this.f20963Q = rVar;
        }

        /* renamed from: b */
        public void mo29444b(long j) {
            this.f20961O = j;
        }

        /* renamed from: c */
        public void mo29446c(C7492r<K, V> rVar) {
            this.f20962P = rVar;
        }

        /* renamed from: h */
        public long mo29453h() {
            return this.f20961O;
        }

        /* renamed from: j */
        public C7492r<K, V> mo29454j() {
            return this.f20962P;
        }

        /* renamed from: q */
        public C7492r<K, V> mo29457q() {
            return this.f20963Q;
        }
    }

    /* renamed from: com.google.common.cache.j$i */
    /* compiled from: LocalCache */
    abstract class C7474i<T> implements Iterator<T> {

        /* renamed from: N */
        C7493s<K, V> f20964N;

        /* renamed from: O */
        AtomicReferenceArray<C7492r<K, V>> f20965O;

        /* renamed from: P */
        C7492r<K, V> f20966P;

        /* renamed from: Q */
        C7486m0 f20967Q;

        /* renamed from: R */
        C7486m0 f20968R;

        /* renamed from: a */
        int f20970a;

        /* renamed from: b */
        int f20971b = -1;

        C7474i() {
            this.f20970a = C7447j.this.f20914N.length - 1;
            mo29478b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo29477a(C7492r<K, V> rVar) {
            boolean z;
            try {
                long a = C7447j.this.f20928a0.mo23201a();
                Object key = rVar.getKey();
                Object a2 = C7447j.this.mo29369a(rVar, a);
                if (a2 != null) {
                    this.f20967Q = new C7486m0<>(key, a2);
                    z = true;
                } else {
                    z = false;
                }
                return z;
            } finally {
                this.f20964N.mo29566o();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo29478b() {
            this.f20967Q = null;
            if (!mo29480d() && !mo29481g()) {
                while (true) {
                    int i = this.f20970a;
                    if (i < 0) {
                        break;
                    }
                    C7493s<K, V>[] sVarArr = C7447j.this.f20914N;
                    this.f20970a = i - 1;
                    this.f20964N = sVarArr[i];
                    if (this.f20964N.f21019b != 0) {
                        this.f20965O = this.f20964N.f21009Q;
                        this.f20971b = this.f20965O.length() - 1;
                        if (mo29481g()) {
                            break;
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C7486m0 mo29479c() {
            C7486m0 m0Var = this.f20967Q;
            if (m0Var != null) {
                this.f20968R = m0Var;
                mo29478b();
                return this.f20968R;
            }
            throw new NoSuchElementException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo29480d() {
            C7492r<K, V> rVar = this.f20966P;
            if (rVar != null) {
                while (true) {
                    this.f20966P = rVar.mo29447d();
                    C7492r<K, V> rVar2 = this.f20966P;
                    if (rVar2 == null) {
                        break;
                    } else if (mo29477a(rVar2)) {
                        return true;
                    } else {
                        rVar = this.f20966P;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public boolean mo29481g() {
            while (true) {
                int i = this.f20971b;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<C7492r<K, V>> atomicReferenceArray = this.f20965O;
                this.f20971b = i - 1;
                C7492r<K, V> rVar = (C7492r) atomicReferenceArray.get(i);
                this.f20966P = rVar;
                if (rVar == null || (!mo29477a(this.f20966P) && !mo29480d())) {
                }
            }
            return true;
        }

        public boolean hasNext() {
            return this.f20967Q != null;
        }

        public abstract T next();

        public void remove() {
            C7397x.m35676b(this.f20968R != null);
            C7447j.this.remove(this.f20968R.getKey());
            this.f20968R = null;
        }
    }

    /* renamed from: com.google.common.cache.j$i0 */
    /* compiled from: LocalCache */
    static final class C7475i0<K, V> extends C7495t<K, V> {

        /* renamed from: b */
        final int f20972b;

        C7475i0(ReferenceQueue<V> referenceQueue, V v, C7492r<K, V> rVar, int i) {
            super(referenceQueue, v, rVar);
            this.f20972b = i;
        }

        /* renamed from: a */
        public C7451b0<K, V> mo29419a(ReferenceQueue<V> referenceQueue, V v, C7492r<K, V> rVar) {
            return new C7475i0(referenceQueue, v, rVar, this.f20972b);
        }

        /* renamed from: d */
        public int mo29424d() {
            return this.f20972b;
        }
    }

    /* renamed from: com.google.common.cache.j$j */
    /* compiled from: LocalCache */
    final class C7476j extends C7474i<K> {
        C7476j() {
            super();
        }

        public K next() {
            return mo29479c().getKey();
        }
    }

    /* renamed from: com.google.common.cache.j$j0 */
    /* compiled from: LocalCache */
    static final class C7477j0<K, V> extends C7503y<K, V> {

        /* renamed from: b */
        final int f20974b;

        C7477j0(V v, int i) {
            super(v);
            this.f20974b = i;
        }

        /* renamed from: d */
        public int mo29424d() {
            return this.f20974b;
        }
    }

    /* renamed from: com.google.common.cache.j$k */
    /* compiled from: LocalCache */
    final class C7478k extends C7452c<K> {
        C7478k(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }

        public boolean contains(Object obj) {
            return this.f20937a.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C7476j();
        }

        public boolean remove(Object obj) {
            return this.f20937a.remove(obj) != null;
        }
    }

    /* renamed from: com.google.common.cache.j$k0 */
    /* compiled from: LocalCache */
    static final class C7479k0<K, V> extends C7471g0<K, V> {

        /* renamed from: b */
        final int f20976b;

        C7479k0(ReferenceQueue<V> referenceQueue, V v, C7492r<K, V> rVar, int i) {
            super(referenceQueue, v, rVar);
            this.f20976b = i;
        }

        /* renamed from: a */
        public C7451b0<K, V> mo29419a(ReferenceQueue<V> referenceQueue, V v, C7492r<K, V> rVar) {
            return new C7479k0(referenceQueue, v, rVar, this.f20976b);
        }

        /* renamed from: d */
        public int mo29424d() {
            return this.f20976b;
        }
    }

    /* renamed from: com.google.common.cache.j$l */
    /* compiled from: LocalCache */
    static final class C7480l<K, V> extends C7490p<K, V> implements C7446i<K, V>, Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: Y */
        transient C7446i<K, V> f20977Y;

        C7480l(C7447j<K, V> jVar) {
            super(jVar);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f20977Y = mo29510z().mo23167a(this.f21002W);
        }

        private Object readResolve() {
            return this.f20977Y;
        }

        /* renamed from: a */
        public C8302z2<K, V> mo29333a(Iterable<? extends K> iterable) throws ExecutionException {
            return this.f20977Y.mo29333a(iterable);
        }

        public final V apply(K k) {
            return this.f20977Y.apply(k);
        }

        /* renamed from: c */
        public V mo29334c(K k) {
            return this.f20977Y.mo29334c(k);
        }

        /* renamed from: d */
        public void mo29335d(K k) {
            this.f20977Y.mo29335d(k);
        }

        public V get(K k) throws ExecutionException {
            return this.f20977Y.get(k);
        }
    }

    /* renamed from: com.google.common.cache.j$l0 */
    /* compiled from: LocalCache */
    static final class C7481l0<K, V> extends AbstractQueue<C7492r<K, V>> {

        /* renamed from: a */
        final C7492r<K, V> f20978a = new C7482a();

        /* renamed from: com.google.common.cache.j$l0$a */
        /* compiled from: LocalCache */
        class C7482a extends C7454d<K, V> {

            /* renamed from: a */
            C7492r<K, V> f20980a = this;

            /* renamed from: b */
            C7492r<K, V> f20981b = this;

            C7482a() {
            }

            /* renamed from: a */
            public void mo29443a(C7492r<K, V> rVar) {
                this.f20981b = rVar;
            }

            /* renamed from: b */
            public void mo29444b(long j) {
            }

            /* renamed from: c */
            public void mo29446c(C7492r<K, V> rVar) {
                this.f20980a = rVar;
            }

            /* renamed from: h */
            public long mo29453h() {
                return Long.MAX_VALUE;
            }

            /* renamed from: j */
            public C7492r<K, V> mo29454j() {
                return this.f20980a;
            }

            /* renamed from: q */
            public C7492r<K, V> mo29457q() {
                return this.f20981b;
            }
        }

        /* renamed from: com.google.common.cache.j$l0$b */
        /* compiled from: LocalCache */
        class C7483b extends C7923j<C7492r<K, V>> {
            C7483b(C7492r rVar) {
                super(rVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public C7492r<K, V> mo29469a(C7492r<K, V> rVar) {
                C7492r<K, V> j = rVar.mo29454j();
                if (j == C7481l0.this.f20978a) {
                    return null;
                }
                return j;
            }
        }

        C7481l0() {
        }

        /* renamed from: a */
        public boolean offer(C7492r<K, V> rVar) {
            C7447j.m35813c(rVar.mo29457q(), rVar.mo29454j());
            C7447j.m35813c(this.f20978a.mo29457q(), rVar);
            C7447j.m35813c(rVar, this.f20978a);
            return true;
        }

        public void clear() {
            C7492r<K, V> j = this.f20978a.mo29454j();
            while (true) {
                C7492r<K, V> rVar = this.f20978a;
                if (j != rVar) {
                    C7492r j2 = j.mo29454j();
                    C7447j.m35812c(j);
                    j = j2;
                } else {
                    rVar.mo29446c(rVar);
                    C7492r<K, V> rVar2 = this.f20978a;
                    rVar2.mo29443a(rVar2);
                    return;
                }
            }
        }

        public boolean contains(Object obj) {
            return ((C7492r) obj).mo29454j() != C7491q.INSTANCE;
        }

        public boolean isEmpty() {
            return this.f20978a.mo29454j() == this.f20978a;
        }

        public Iterator<C7492r<K, V>> iterator() {
            return new C7483b(peek());
        }

        public boolean remove(Object obj) {
            C7492r rVar = (C7492r) obj;
            C7492r q = rVar.mo29457q();
            C7492r j = rVar.mo29454j();
            C7447j.m35813c(q, j);
            C7447j.m35812c(rVar);
            return j != C7491q.INSTANCE;
        }

        public int size() {
            int i = 0;
            for (C7492r<K, V> j = this.f20978a.mo29454j(); j != this.f20978a; j = j.mo29454j()) {
                i++;
            }
            return i;
        }

        public C7492r<K, V> peek() {
            C7492r<K, V> j = this.f20978a.mo29454j();
            if (j == this.f20978a) {
                return null;
            }
            return j;
        }

        public C7492r<K, V> poll() {
            C7492r<K, V> j = this.f20978a.mo29454j();
            if (j == this.f20978a) {
                return null;
            }
            remove(j);
            return j;
        }
    }

    /* renamed from: com.google.common.cache.j$m */
    /* compiled from: LocalCache */
    static class C7484m<K, V> implements C7451b0<K, V> {

        /* renamed from: N */
        final C7333e0 f20983N;

        /* renamed from: a */
        volatile C7451b0<K, V> f20984a;

        /* renamed from: b */
        final C8565o0<V> f20985b;

        /* renamed from: com.google.common.cache.j$m$a */
        /* compiled from: LocalCache */
        class C7485a implements C7380p<V, V> {
            C7485a() {
            }

            public V apply(V v) {
                C7484m.this.mo29500b(v);
                return v;
            }
        }

        public C7484m() {
            this(C7447j.m35816v());
        }

        /* renamed from: a */
        public C7451b0<K, V> mo29419a(ReferenceQueue<V> referenceQueue, @C5952h V v, C7492r<K, V> rVar) {
            return this;
        }

        /* renamed from: a */
        public boolean mo29499a(Throwable th) {
            return this.f20985b.mo31655a(th);
        }

        /* renamed from: b */
        public C7492r<K, V> mo29422b() {
            return null;
        }

        /* renamed from: b */
        public boolean mo29500b(@C5952h V v) {
            return this.f20985b.mo31654a(v);
        }

        /* renamed from: c */
        public boolean mo29423c() {
            return this.f20984a.mo29423c();
        }

        /* renamed from: d */
        public int mo29424d() {
            return this.f20984a.mo29424d();
        }

        /* renamed from: e */
        public boolean mo29425e() {
            return true;
        }

        /* renamed from: f */
        public long mo29501f() {
            return this.f20983N.mo29207a(TimeUnit.NANOSECONDS);
        }

        /* renamed from: g */
        public C7451b0<K, V> mo29502g() {
            return this.f20984a;
        }

        public V get() {
            return this.f20984a.get();
        }

        public C7484m(C7451b0<K, V> b0Var) {
            this.f20985b = C8565o0.m40421c();
            this.f20983N = C7333e0.m35521f();
            this.f20984a = b0Var;
        }

        /* renamed from: b */
        private C8473c0<V> m35983b(Throwable th) {
            return C8437a0.m40025a(th);
        }

        /* renamed from: a */
        public void mo29421a(@C5952h V v) {
            if (v != null) {
                mo29500b(v);
            } else {
                this.f20984a = C7447j.m35816v();
            }
        }

        /* renamed from: a */
        public C8473c0<V> mo29498a(K k, CacheLoader<? super K, V> cacheLoader) {
            this.f20983N.mo29210c();
            Object obj = this.f20984a.get();
            if (obj == null) {
                try {
                    Object a = cacheLoader.mo29318a(k);
                    return mo29500b((V) a) ? this.f20985b : C8437a0.m40043b(a);
                } catch (Throwable th) {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    return mo29499a(th) ? this.f20985b : m35983b(th);
                }
            } else {
                C8473c0 a2 = cacheLoader.mo29317a(k, obj);
                if (a2 == null) {
                    return C8437a0.m40043b(null);
                }
                return C8437a0.m40042b(a2, new C7485a());
            }
        }

        /* renamed from: a */
        public V mo29420a() throws ExecutionException {
            return C8595u0.m40488a((Future<V>) this.f20985b);
        }
    }

    /* renamed from: com.google.common.cache.j$m0 */
    /* compiled from: LocalCache */
    final class C7486m0 implements Entry<K, V> {

        /* renamed from: a */
        final K f20988a;

        /* renamed from: b */
        V f20989b;

        C7486m0(K k, V v) {
            this.f20988a = k;
            this.f20989b = v;
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!this.f20988a.equals(entry.getKey()) || !this.f20989b.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f20988a;
        }

        public V getValue() {
            return this.f20989b;
        }

        public int hashCode() {
            return this.f20988a.hashCode() ^ this.f20989b.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.cache.j$n */
    /* compiled from: LocalCache */
    static class C7487n<K, V> extends C7488o<K, V> implements C7446i<K, V> {
        private static final long serialVersionUID = 1;

        C7487n(C5832d<? super K, ? super V> dVar, CacheLoader<? super K, V> cacheLoader) {
            super(new C7447j(dVar, (CacheLoader) C7397x.m35664a(cacheLoader)), null);
        }

        /* renamed from: a */
        public C8302z2<K, V> mo29333a(Iterable<? extends K> iterable) throws ExecutionException {
            return this.f20990a.mo29368a(iterable);
        }

        public final V apply(K k) {
            return mo29334c(k);
        }

        /* renamed from: c */
        public V mo29334c(K k) {
            try {
                return get(k);
            } catch (ExecutionException e) {
                throw new UncheckedExecutionException(e.getCause());
            }
        }

        /* renamed from: d */
        public void mo29335d(K k) {
            this.f20990a.mo29393f(k);
        }

        public V get(K k) throws ExecutionException {
            return this.f20990a.mo29388d(k);
        }

        /* access modifiers changed from: 0000 */
        public Object writeReplace() {
            return new C7480l(this.f20990a);
        }
    }

    /* renamed from: com.google.common.cache.j$o */
    /* compiled from: LocalCache */
    static class C7488o<K, V> implements C7424c<K, V>, Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: a */
        final C7447j<K, V> f20990a;

        /* renamed from: com.google.common.cache.j$o$a */
        /* compiled from: LocalCache */
        class C7489a extends CacheLoader<Object, V> {

            /* renamed from: a */
            final /* synthetic */ Callable f20991a;

            C7489a(Callable callable) {
                this.f20991a = callable;
            }

            /* renamed from: a */
            public V mo29318a(Object obj) throws Exception {
                return this.f20991a.call();
            }
        }

        /* synthetic */ C7488o(C7447j jVar, C7448a aVar) {
            this(jVar);
        }

        /* renamed from: a */
        public V mo29321a(K k, Callable<? extends V> callable) throws ExecutionException {
            C7397x.m35664a(callable);
            return this.f20990a.mo29370a(k, (CacheLoader<? super K, V>) new C7489a<Object,V>(callable));
        }

        /* renamed from: b */
        public void mo29322b(Iterable<?> iterable) {
            this.f20990a.mo29382c(iterable);
        }

        /* renamed from: c */
        public C8302z2<K, V> mo29323c(Iterable<?> iterable) {
            return this.f20990a.mo29378b(iterable);
        }

        public void cleanUp() {
            this.f20990a.mo29372a();
        }

        @C5952h
        /* renamed from: f */
        public V mo29336f(Object obj) {
            return this.f20990a.mo29381c(obj);
        }

        /* renamed from: g */
        public void mo29325g(Object obj) {
            C7397x.m35664a(obj);
            this.f20990a.remove(obj);
        }

        /* renamed from: j */
        public ConcurrentMap<K, V> mo29326j() {
            return this.f20990a;
        }

        public void put(K k, V v) {
            this.f20990a.put(k, v);
        }

        public void putAll(Map<? extends K, ? extends V> map) {
            this.f20990a.putAll(map);
        }

        /* renamed from: r */
        public C7441f mo29329r() {
            C7421a aVar = new C7421a();
            aVar.mo29332a(this.f20990a.f20931c0);
            for (C7493s<K, V> sVar : this.f20990a.f20914N) {
                aVar.mo29332a(sVar.f21017Y);
            }
            return aVar.mo23197b();
        }

        /* renamed from: s */
        public void mo29330s() {
            this.f20990a.clear();
        }

        public long size() {
            return this.f20990a.mo29395g();
        }

        /* access modifiers changed from: 0000 */
        public Object writeReplace() {
            return new C7490p(this.f20990a);
        }

        C7488o(C5832d<? super K, ? super V> dVar) {
            this(new C7447j<>(dVar, null));
        }

        private C7488o(C7447j<K, V> jVar) {
            this.f20990a = jVar;
        }
    }

    /* renamed from: com.google.common.cache.j$p */
    /* compiled from: LocalCache */
    static class C7490p<K, V> extends C7442g<K, V> implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: N */
        final C7359j<Object> f20993N;

        /* renamed from: O */
        final C7359j<Object> f20994O;

        /* renamed from: P */
        final long f20995P;

        /* renamed from: Q */
        final long f20996Q;

        /* renamed from: R */
        final long f20997R;

        /* renamed from: S */
        final C7527s<K, V> f20998S;

        /* renamed from: T */
        final int f20999T;

        /* renamed from: U */
        final C7517o<? super K, ? super V> f21000U;

        /* renamed from: V */
        final C7365j0 f21001V;

        /* renamed from: W */
        final CacheLoader<? super K, V> f21002W;

        /* renamed from: X */
        transient C7424c<K, V> f21003X;

        /* renamed from: a */
        final C7496u f21004a;

        /* renamed from: b */
        final C7496u f21005b;

        C7490p(C7447j<K, V> jVar) {
            C7447j<K, V> jVar2 = jVar;
            C7496u uVar = jVar2.f20918R;
            C7496u uVar2 = jVar2.f20919S;
            C7359j<Object> jVar3 = jVar2.f20916P;
            C7359j<Object> jVar4 = jVar2.f20917Q;
            long j = jVar2.f20923W;
            long j2 = jVar2.f20922V;
            long j3 = jVar2.f20920T;
            C7527s<K, V> sVar = jVar2.f20921U;
            int i = jVar2.f20915O;
            C7517o<K, V> oVar = jVar2.f20926Z;
            C7365j0 j0Var = jVar2.f20928a0;
            CacheLoader<? super K, V> cacheLoader = jVar2.f20932d0;
            this(uVar, uVar2, jVar3, jVar4, j, j2, j3, sVar, i, oVar, j0Var, cacheLoader);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f21003X = mo29510z().mo23158a();
        }

        private Object readResolve() {
            return this.f21003X;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: z */
        public C5832d<K, V> mo29510z() {
            C5832d<K, V> a = C5832d.m25587w().mo23164a(this.f21004a).mo23173b(this.f21005b).mo23163a(this.f20993N).mo23172b(this.f20994O).mo23159a(this.f20999T).mo23165a(this.f21000U);
            a.f16794a = false;
            long j = this.f20995P;
            if (j > 0) {
                a.mo23171b(j, TimeUnit.NANOSECONDS);
            }
            long j2 = this.f20996Q;
            if (j2 > 0) {
                a.mo23161a(j2, TimeUnit.NANOSECONDS);
            }
            C7527s<K, V> sVar = this.f20998S;
            if (sVar != C5837e.INSTANCE) {
                a.mo23166a(sVar);
                long j3 = this.f20997R;
                if (j3 != -1) {
                    a.mo23170b(j3);
                }
            } else {
                long j4 = this.f20997R;
                if (j4 != -1) {
                    a.mo23160a(j4);
                }
            }
            C7365j0 j0Var = this.f21001V;
            if (j0Var != null) {
                a.mo23162a(j0Var);
            }
            return a;
        }

        private C7490p(C7496u uVar, C7496u uVar2, C7359j<Object> jVar, C7359j<Object> jVar2, long j, long j2, long j3, C7527s<K, V> sVar, int i, C7517o<? super K, ? super V> oVar, C7365j0 j0Var, CacheLoader<? super K, V> cacheLoader) {
            this.f21004a = uVar;
            this.f21005b = uVar2;
            this.f20993N = jVar;
            this.f20994O = jVar2;
            this.f20995P = j;
            this.f20996Q = j2;
            this.f20997R = j3;
            this.f20998S = sVar;
            this.f20999T = i;
            this.f21000U = oVar;
            if (j0Var == C7365j0.m35606b() || j0Var == C5832d.f16791x) {
                j0Var = null;
            }
            this.f21001V = j0Var;
            this.f21002W = cacheLoader;
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public C7424c<K, V> m36009y() {
            return this.f21003X;
        }
    }

    /* renamed from: com.google.common.cache.j$q */
    /* compiled from: LocalCache */
    private enum C7491q implements C7492r<Object, Object> {
        INSTANCE;

        /* renamed from: a */
        public void mo29441a(long j) {
        }

        /* renamed from: a */
        public void mo29442a(C7451b0<Object, Object> b0Var) {
        }

        /* renamed from: a */
        public void mo29443a(C7492r<Object, Object> rVar) {
        }

        /* renamed from: b */
        public void mo29444b(long j) {
        }

        /* renamed from: b */
        public void mo29445b(C7492r<Object, Object> rVar) {
        }

        /* renamed from: c */
        public void mo29446c(C7492r<Object, Object> rVar) {
        }

        /* renamed from: d */
        public C7492r<Object, Object> mo29447d() {
            return null;
        }

        /* renamed from: d */
        public void mo29448d(C7492r<Object, Object> rVar) {
        }

        /* renamed from: e */
        public C7451b0<Object, Object> mo29449e() {
            return null;
        }

        /* renamed from: f */
        public int mo29450f() {
            return 0;
        }

        /* renamed from: g */
        public C7492r<Object, Object> mo29451g() {
            return this;
        }

        public Object getKey() {
            return null;
        }

        /* renamed from: h */
        public long mo29453h() {
            return 0;
        }

        /* renamed from: j */
        public C7492r<Object, Object> mo29454j() {
            return this;
        }

        /* renamed from: k */
        public long mo29455k() {
            return 0;
        }

        /* renamed from: p */
        public C7492r<Object, Object> mo29456p() {
            return this;
        }

        /* renamed from: q */
        public C7492r<Object, Object> mo29457q() {
            return this;
        }
    }

    /* renamed from: com.google.common.cache.j$r */
    /* compiled from: LocalCache */
    interface C7492r<K, V> {
        /* renamed from: a */
        void mo29441a(long j);

        /* renamed from: a */
        void mo29442a(C7451b0<K, V> b0Var);

        /* renamed from: a */
        void mo29443a(C7492r<K, V> rVar);

        /* renamed from: b */
        void mo29444b(long j);

        /* renamed from: b */
        void mo29445b(C7492r<K, V> rVar);

        /* renamed from: c */
        void mo29446c(C7492r<K, V> rVar);

        @C5952h
        /* renamed from: d */
        C7492r<K, V> mo29447d();

        /* renamed from: d */
        void mo29448d(C7492r<K, V> rVar);

        /* renamed from: e */
        C7451b0<K, V> mo29449e();

        /* renamed from: f */
        int mo29450f();

        /* renamed from: g */
        C7492r<K, V> mo29451g();

        @C5952h
        K getKey();

        /* renamed from: h */
        long mo29453h();

        /* renamed from: j */
        C7492r<K, V> mo29454j();

        /* renamed from: k */
        long mo29455k();

        /* renamed from: p */
        C7492r<K, V> mo29456p();

        /* renamed from: q */
        C7492r<K, V> mo29457q();
    }

    /* renamed from: com.google.common.cache.j$s */
    /* compiled from: LocalCache */
    static class C7493s<K, V> extends ReentrantLock {
        @C5966a("Segment.this")

        /* renamed from: N */
        int f21006N;

        /* renamed from: O */
        int f21007O;

        /* renamed from: P */
        int f21008P;

        /* renamed from: Q */
        volatile AtomicReferenceArray<C7492r<K, V>> f21009Q;

        /* renamed from: R */
        final long f21010R;

        /* renamed from: S */
        final ReferenceQueue<K> f21011S;

        /* renamed from: T */
        final ReferenceQueue<V> f21012T;

        /* renamed from: U */
        final Queue<C7492r<K, V>> f21013U;

        /* renamed from: V */
        final AtomicInteger f21014V = new AtomicInteger();
        @C5966a("Segment.this")

        /* renamed from: W */
        final Queue<C7492r<K, V>> f21015W;
        @C5966a("Segment.this")

        /* renamed from: X */
        final Queue<C7492r<K, V>> f21016X;

        /* renamed from: Y */
        final C7422b f21017Y;

        /* renamed from: a */
        final C7447j<K, V> f21018a;

        /* renamed from: b */
        volatile int f21019b;

        /* renamed from: com.google.common.cache.j$s$a */
        /* compiled from: LocalCache */
        class C7494a implements Runnable {

            /* renamed from: N */
            final /* synthetic */ C7484m f21020N;

            /* renamed from: O */
            final /* synthetic */ C8473c0 f21021O;

            /* renamed from: a */
            final /* synthetic */ Object f21023a;

            /* renamed from: b */
            final /* synthetic */ int f21024b;

            C7494a(Object obj, int i, C7484m mVar, C8473c0 c0Var) {
                this.f21023a = obj;
                this.f21024b = i;
                this.f21020N = mVar;
                this.f21021O = c0Var;
            }

            public void run() {
                try {
                    C7493s.this.mo29523a(this.f21023a, this.f21024b, this.f21020N, this.f21021O);
                } catch (Throwable th) {
                    C7447j.f20910m0.log(Level.WARNING, "Exception thrown during refresh", th);
                    this.f21020N.mo29499a(th);
                }
            }
        }

        C7493s(C7447j<K, V> jVar, int i, long j, C7422b bVar) {
            this.f21018a = jVar;
            this.f21010R = j;
            this.f21017Y = (C7422b) C7397x.m35664a(bVar);
            mo29532a(mo29547b(i));
            ReferenceQueue<V> referenceQueue = null;
            this.f21011S = jVar.mo29406p() ? new ReferenceQueue<>() : null;
            if (jVar.mo29410q()) {
                referenceQueue = new ReferenceQueue<>();
            }
            this.f21012T = referenceQueue;
            this.f21013U = jVar.mo29405o() ? new ConcurrentLinkedQueue<>() : C7447j.m35814t();
            this.f21015W = jVar.mo29416s() ? new C7481l0<>() : C7447j.m35814t();
            this.f21016X = jVar.mo29405o() ? new C7456e<>() : C7447j.m35814t();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo29532a(AtomicReferenceArray<C7492r<K, V>> atomicReferenceArray) {
            this.f21008P = (atomicReferenceArray.length() * 3) / 4;
            if (!this.f21018a.mo29379b()) {
                int i = this.f21008P;
                if (((long) i) == this.f21010R) {
                    this.f21008P = i + 1;
                }
            }
            this.f21009Q = atomicReferenceArray;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public AtomicReferenceArray<C7492r<K, V>> mo29547b(int i) {
            return new AtomicReferenceArray<>(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo29552c(C7492r<K, V> rVar, long j) {
            if (this.f21018a.mo29398i()) {
                rVar.mo29441a(j);
            }
            this.f21013U.add(rVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo29555d(long j) {
            if (tryLock()) {
                try {
                    mo29526a(j);
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo29556e() {
            do {
            } while (this.f21011S.poll() != null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo29557f() {
            if (this.f21018a.mo29406p()) {
                mo29556e();
            }
            if (this.f21018a.mo29410q()) {
                mo29558g();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo29558g() {
            do {
            } while (this.f21012T.poll() != null);
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: h */
        public void mo29559h() {
            int i = 0;
            do {
                Reference poll = this.f21011S.poll();
                if (poll != null) {
                    this.f21018a.mo29374a((C7492r) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: i */
        public void mo29560i() {
            while (true) {
                C7492r rVar = (C7492r) this.f21013U.poll();
                if (rVar == null) {
                    return;
                }
                if (this.f21016X.contains(rVar)) {
                    this.f21016X.add(rVar);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: j */
        public void mo29561j() {
            if (this.f21018a.mo29406p()) {
                mo29559h();
            }
            if (this.f21018a.mo29410q()) {
                mo29562k();
            }
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: k */
        public void mo29562k() {
            int i = 0;
            do {
                Reference poll = this.f21012T.poll();
                if (poll != null) {
                    this.f21018a.mo29373a((C7451b0) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: l */
        public void mo29563l() {
            if (this.f21018a.mo29383c()) {
                mo29560i();
                while (((long) this.f21006N) > this.f21010R) {
                    C7492r n = mo29565n();
                    if (!mo29534a(n, n.mo29450f(), C7511n.SIZE)) {
                        throw new AssertionError();
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: m */
        public void mo29564m() {
            AtomicReferenceArray<C7492r<K, V>> atomicReferenceArray = this.f21009Q;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i = this.f21019b;
                AtomicReferenceArray<C7492r<K, V>> b = mo29547b(length << 1);
                this.f21008P = (b.length() * 3) / 4;
                int length2 = b.length() - 1;
                for (int i2 = 0; i2 < length; i2++) {
                    C7492r rVar = (C7492r) atomicReferenceArray.get(i2);
                    if (rVar != null) {
                        C7492r d = rVar.mo29447d();
                        int f = rVar.mo29450f() & length2;
                        if (d == null) {
                            b.set(f, rVar);
                        } else {
                            C7492r rVar2 = rVar;
                            while (d != null) {
                                int f2 = d.mo29450f() & length2;
                                if (f2 != f) {
                                    rVar2 = d;
                                    f = f2;
                                }
                                d = d.mo29447d();
                            }
                            b.set(f, rVar2);
                            while (rVar != rVar2) {
                                int f3 = rVar.mo29450f() & length2;
                                C7492r a = mo29513a(rVar, (C7492r) b.get(f3));
                                if (a != null) {
                                    b.set(f3, a);
                                } else {
                                    mo29527a(rVar);
                                    i--;
                                }
                                rVar = rVar.mo29447d();
                            }
                        }
                    }
                }
                this.f21009Q = b;
                this.f21019b = i;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public C7492r<K, V> mo29565n() {
            for (C7492r<K, V> rVar : this.f21016X) {
                if (rVar.mo29449e().mo29424d() > 0) {
                    return rVar;
                }
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public void mo29566o() {
            if ((this.f21014V.incrementAndGet() & 63) == 0) {
                mo29525a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: p */
        public void mo29567p() {
            mo29568q();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: q */
        public void mo29568q() {
            if (!isHeldByCurrentThread()) {
                this.f21018a.mo29397h();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: r */
        public void mo29569r() {
            if (tryLock()) {
                try {
                    mo29561j();
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0087, code lost:
            r3 = true;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public V mo29544b(K r17, int r18, com.google.common.cache.CacheLoader<? super K, V> r19) throws java.util.concurrent.ExecutionException {
            /*
                r16 = this;
                r1 = r16
                r0 = r17
                r2 = r18
                r16.lock()
                com.google.common.cache.j<K, V> r3 = r1.f21018a     // Catch:{ all -> 0x00c4 }
                com.google.common.base.j0 r3 = r3.f20928a0     // Catch:{ all -> 0x00c4 }
                long r3 = r3.mo23201a()     // Catch:{ all -> 0x00c4 }
                r1.mo29548b(r3)     // Catch:{ all -> 0x00c4 }
                int r5 = r1.f21019b     // Catch:{ all -> 0x00c4 }
                r6 = 1
                int r5 = r5 - r6
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.j$r<K, V>> r7 = r1.f21009Q     // Catch:{ all -> 0x00c4 }
                int r8 = r7.length()     // Catch:{ all -> 0x00c4 }
                int r8 = r8 - r6
                r8 = r8 & r2
                java.lang.Object r9 = r7.get(r8)     // Catch:{ all -> 0x00c4 }
                com.google.common.cache.j$r r9 = (com.google.common.cache.C7447j.C7492r) r9     // Catch:{ all -> 0x00c4 }
                r10 = r9
            L_0x0027:
                r11 = 0
                if (r10 == 0) goto L_0x0086
                java.lang.Object r12 = r10.getKey()     // Catch:{ all -> 0x00c4 }
                int r13 = r10.mo29450f()     // Catch:{ all -> 0x00c4 }
                if (r13 != r2) goto L_0x0081
                if (r12 == 0) goto L_0x0081
                com.google.common.cache.j<K, V> r13 = r1.f21018a     // Catch:{ all -> 0x00c4 }
                com.google.common.base.j<java.lang.Object> r13 = r13.f20916P     // Catch:{ all -> 0x00c4 }
                boolean r13 = r13.mo29253b(r0, r12)     // Catch:{ all -> 0x00c4 }
                if (r13 == 0) goto L_0x0081
                com.google.common.cache.j$b0 r13 = r10.mo29449e()     // Catch:{ all -> 0x00c4 }
                boolean r14 = r13.mo29425e()     // Catch:{ all -> 0x00c4 }
                if (r14 == 0) goto L_0x004c
                r3 = 0
                goto L_0x0088
            L_0x004c:
                java.lang.Object r14 = r13.get()     // Catch:{ all -> 0x00c4 }
                if (r14 != 0) goto L_0x0058
                com.google.common.cache.n r3 = com.google.common.cache.C7511n.COLLECTED     // Catch:{ all -> 0x00c4 }
                r1.mo29531a((K) r12, r2, r13, r3)     // Catch:{ all -> 0x00c4 }
                goto L_0x0065
            L_0x0058:
                com.google.common.cache.j<K, V> r15 = r1.f21018a     // Catch:{ all -> 0x00c4 }
                boolean r15 = r15.mo29380b(r10, r3)     // Catch:{ all -> 0x00c4 }
                if (r15 == 0) goto L_0x0072
                com.google.common.cache.n r3 = com.google.common.cache.C7511n.EXPIRED     // Catch:{ all -> 0x00c4 }
                r1.mo29531a((K) r12, r2, r13, r3)     // Catch:{ all -> 0x00c4 }
            L_0x0065:
                java.util.Queue<com.google.common.cache.j$r<K, V>> r3 = r1.f21015W     // Catch:{ all -> 0x00c4 }
                r3.remove(r10)     // Catch:{ all -> 0x00c4 }
                java.util.Queue<com.google.common.cache.j$r<K, V>> r3 = r1.f21016X     // Catch:{ all -> 0x00c4 }
                r3.remove(r10)     // Catch:{ all -> 0x00c4 }
                r1.f21019b = r5     // Catch:{ all -> 0x00c4 }
                goto L_0x0087
            L_0x0072:
                r1.mo29549b(r10, r3)     // Catch:{ all -> 0x00c4 }
                com.google.common.cache.a$b r0 = r1.f21017Y     // Catch:{ all -> 0x00c4 }
                r0.mo23195a(r6)     // Catch:{ all -> 0x00c4 }
                r16.unlock()
                r16.mo29567p()
                return r14
            L_0x0081:
                com.google.common.cache.j$r r10 = r10.mo29447d()     // Catch:{ all -> 0x00c4 }
                goto L_0x0027
            L_0x0086:
                r13 = r11
            L_0x0087:
                r3 = 1
            L_0x0088:
                if (r3 == 0) goto L_0x009f
                com.google.common.cache.j$m r11 = new com.google.common.cache.j$m     // Catch:{ all -> 0x00c4 }
                r11.<init>()     // Catch:{ all -> 0x00c4 }
                if (r10 != 0) goto L_0x009c
                com.google.common.cache.j$r r10 = r1.mo29516a((K) r0, r2, r9)     // Catch:{ all -> 0x00c4 }
                r10.mo29442a(r11)     // Catch:{ all -> 0x00c4 }
                r7.set(r8, r10)     // Catch:{ all -> 0x00c4 }
                goto L_0x009f
            L_0x009c:
                r10.mo29442a(r11)     // Catch:{ all -> 0x00c4 }
            L_0x009f:
                r16.unlock()
                r16.mo29567p()
                if (r3 == 0) goto L_0x00bf
                monitor-enter(r10)     // Catch:{ all -> 0x00b8 }
                r3 = r19
                java.lang.Object r0 = r1.mo29545b(r0, r2, r11, r3)     // Catch:{ all -> 0x00b5 }
                monitor-exit(r10)     // Catch:{ all -> 0x00b5 }
                com.google.common.cache.a$b r2 = r1.f21017Y
                r2.mo23198b(r6)
                return r0
            L_0x00b5:
                r0 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x00b5 }
                throw r0     // Catch:{ all -> 0x00b8 }
            L_0x00b8:
                r0 = move-exception
                com.google.common.cache.a$b r2 = r1.f21017Y
                r2.mo23198b(r6)
                throw r0
            L_0x00bf:
                java.lang.Object r0 = r1.mo29520a(r10, (K) r0, r13)
                return r0
            L_0x00c4:
                r0 = move-exception
                r16.unlock()
                r16.mo29567p()
                goto L_0x00cd
            L_0x00cc:
                throw r0
            L_0x00cd:
                goto L_0x00cc
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.C7447j.C7493s.mo29544b(java.lang.Object, int, com.google.common.cache.CacheLoader):java.lang.Object");
        }

        /* access modifiers changed from: 0000 */
        @C5952h
        /* renamed from: c */
        public C7492r<K, V> mo29550c(Object obj, int i) {
            for (C7492r<K, V> a = mo29512a(i); a != null; a = a.mo29447d()) {
                if (a.mo29450f() == i) {
                    Object key = a.getKey();
                    if (key == null) {
                        mo29569r();
                    } else if (this.f21018a.f20916P.mo29253b(obj, key)) {
                        return a;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        @C5952h
        /* renamed from: d */
        public V mo29553d(Object obj, int i) {
            C7511n nVar;
            lock();
            try {
                mo29548b(this.f21018a.f20928a0.mo23201a());
                AtomicReferenceArray<C7492r<K, V>> atomicReferenceArray = this.f21009Q;
                int length = (atomicReferenceArray.length() - 1) & i;
                C7492r rVar = (C7492r) atomicReferenceArray.get(length);
                C7492r rVar2 = rVar;
                while (true) {
                    if (rVar2 == null) {
                        break;
                    }
                    Object key = rVar2.getKey();
                    if (rVar2.mo29450f() != i || key == null || !this.f21018a.f20916P.mo29253b(obj, key)) {
                        rVar2 = rVar2.mo29447d();
                    } else {
                        C7451b0 e = rVar2.mo29449e();
                        V v = e.get();
                        if (v != null) {
                            nVar = C7511n.EXPLICIT;
                        } else if (e.mo29423c()) {
                            nVar = C7511n.COLLECTED;
                        }
                        C7511n nVar2 = nVar;
                        this.f21007O++;
                        int i2 = this.f21019b - 1;
                        atomicReferenceArray.set(length, mo29514a(rVar, rVar2, (K) key, i, e, nVar2));
                        this.f21019b = i2;
                        return v;
                    }
                }
                unlock();
                mo29567p();
                return null;
            } finally {
                unlock();
                mo29567p();
            }
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: a */
        public C7492r<K, V> mo29516a(K k, int i, @C5952h C7492r<K, V> rVar) {
            return this.f21018a.f20930b0.mo29471a(this, C7397x.m35664a(k), i, rVar);
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: a */
        public C7492r<K, V> mo29513a(C7492r<K, V> rVar, C7492r<K, V> rVar2) {
            if (rVar.getKey() == null) {
                return null;
            }
            C7451b0 e = rVar.mo29449e();
            Object obj = e.get();
            if (obj == null && e.mo29423c()) {
                return null;
            }
            C7492r<K, V> a = this.f21018a.f20930b0.mo29470a(this, rVar, rVar2);
            a.mo29442a(e.mo29419a(this.f21012T, obj, a));
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo29551c(long j) {
            if (tryLock()) {
                try {
                    mo29561j();
                    mo29526a(j);
                    this.f21014V.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: a */
        public void mo29530a(C7492r<K, V> rVar, K k, V v, long j) {
            C7451b0 e = rVar.mo29449e();
            int a = this.f21018a.f20921U.mo23203a(k, v);
            C7397x.m35677b(a >= 0, (Object) "Weights must be non-negative");
            rVar.mo29442a(this.f21018a.f20919S.mo29571a(this, rVar, v, a));
            mo29528a(rVar, a, j);
            e.mo29421a(v);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public V mo29521a(K k, int i, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            C7397x.m35664a(k);
            C7397x.m35664a(cacheLoader);
            try {
                if (this.f21019b != 0) {
                    C7492r c = mo29550c((Object) k, i);
                    if (c != null) {
                        long a = this.f21018a.f20928a0.mo23201a();
                        Object a2 = mo29518a(c, a);
                        if (a2 != null) {
                            mo29552c(c, a);
                            this.f21017Y.mo23195a(1);
                            V a3 = mo29519a(c, k, i, (V) a2, a, cacheLoader);
                            mo29566o();
                            return a3;
                        }
                        C7451b0 e = c.mo29449e();
                        if (e.mo29425e()) {
                            V a4 = mo29520a(c, k, e);
                            mo29566o();
                            return a4;
                        }
                    }
                }
                V b = mo29544b(k, i, cacheLoader);
                mo29566o();
                return b;
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof Error) {
                    throw new C8566p((Error) cause);
                } else if (cause instanceof RuntimeException) {
                    throw new UncheckedExecutionException(cause);
                } else {
                    throw e2;
                }
            } catch (Throwable th) {
                mo29566o();
                throw th;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo29554d() {
            if (this.f21019b != 0) {
                lock();
                try {
                    AtomicReferenceArray<C7492r<K, V>> atomicReferenceArray = this.f21009Q;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        for (C7492r rVar = (C7492r) atomicReferenceArray.get(i); rVar != null; rVar = rVar.mo29447d()) {
                            if (rVar.mo29449e().mo29423c()) {
                                mo29529a(rVar, C7511n.EXPLICIT);
                            }
                        }
                    }
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    mo29557f();
                    this.f21015W.clear();
                    this.f21016X.clear();
                    this.f21014V.set(0);
                    this.f21007O++;
                    this.f21019b = 0;
                } finally {
                    unlock();
                    mo29567p();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public V mo29545b(K k, int i, C7484m<K, V> mVar, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            return mo29523a(k, i, mVar, mVar.mo29498a(k, cacheLoader));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public V mo29520a(C7492r<K, V> rVar, K k, C7451b0<K, V> b0Var) throws ExecutionException {
            if (b0Var.mo29425e()) {
                C7397x.m35678b(!Thread.holdsLock(rVar), "Recursive load of: %s", k);
                try {
                    V a = b0Var.mo29420a();
                    if (a != null) {
                        mo29552c(rVar, this.f21018a.f20928a0.mo23201a());
                        return a;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("CacheLoader returned null for key ");
                    sb.append(k);
                    sb.append(".");
                    throw new InvalidCacheLoadException(sb.toString());
                } finally {
                    this.f21017Y.mo23198b(1);
                }
            } else {
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: b */
        public void mo29549b(C7492r<K, V> rVar, long j) {
            if (this.f21018a.mo29398i()) {
                rVar.mo29441a(j);
            }
            this.f21016X.add(rVar);
        }

        /* access modifiers changed from: 0000 */
        @C5952h
        /* renamed from: b */
        public V mo29543b(Object obj, int i) {
            try {
                if (this.f21019b != 0) {
                    long a = this.f21018a.f20928a0.mo23201a();
                    C7492r a2 = mo29515a(obj, i, a);
                    if (a2 == null) {
                        return null;
                    }
                    Object obj2 = a2.mo29449e().get();
                    if (obj2 != null) {
                        mo29552c(a2, a);
                        V a3 = mo29519a(a2, (K) a2.getKey(), i, (V) obj2, a, this.f21018a.f20932d0);
                        mo29566o();
                        return a3;
                    }
                    mo29569r();
                }
                mo29566o();
                return null;
            } finally {
                mo29566o();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C8473c0<V> mo29517a(K k, int i, C7484m<K, V> mVar, CacheLoader<? super K, V> cacheLoader) {
            C8473c0<V> a = mVar.mo29498a(k, cacheLoader);
            C7494a aVar = new C7494a(k, i, mVar, a);
            a.mo31637a(aVar, C7447j.f20911n0);
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public V mo29523a(K r4, int r5, com.google.common.cache.C7447j.C7484m<K, V> r6, com.google.common.util.concurrent.C8473c0<V> r7) throws java.util.concurrent.ExecutionException {
            /*
                r3 = this;
                java.lang.Object r7 = com.google.common.util.concurrent.C8595u0.m40488a(r7)     // Catch:{ all -> 0x003f }
                if (r7 == 0) goto L_0x0023
                com.google.common.cache.a$b r0 = r3.f21017Y     // Catch:{ all -> 0x0021 }
                long r1 = r6.mo29501f()     // Catch:{ all -> 0x0021 }
                r0.mo23199b(r1)     // Catch:{ all -> 0x0021 }
                r3.mo29539a((K) r4, r5, r6, (V) r7)     // Catch:{ all -> 0x0021 }
                if (r7 != 0) goto L_0x0020
                com.google.common.cache.a$b r0 = r3.f21017Y
                long r1 = r6.mo29501f()
                r0.mo23196a(r1)
                r3.mo29538a((K) r4, r5, r6)
            L_0x0020:
                return r7
            L_0x0021:
                r0 = move-exception
                goto L_0x0041
            L_0x0023:
                com.google.common.cache.CacheLoader$InvalidCacheLoadException r0 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException     // Catch:{ all -> 0x0021 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0021 }
                r1.<init>()     // Catch:{ all -> 0x0021 }
                java.lang.String r2 = "CacheLoader returned null for key "
                r1.append(r2)     // Catch:{ all -> 0x0021 }
                r1.append(r4)     // Catch:{ all -> 0x0021 }
                java.lang.String r2 = "."
                r1.append(r2)     // Catch:{ all -> 0x0021 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0021 }
                r0.<init>(r1)     // Catch:{ all -> 0x0021 }
                throw r0     // Catch:{ all -> 0x0021 }
            L_0x003f:
                r0 = move-exception
                r7 = 0
            L_0x0041:
                if (r7 != 0) goto L_0x004f
                com.google.common.cache.a$b r7 = r3.f21017Y
                long r1 = r6.mo29501f()
                r7.mo23196a(r1)
                r3.mo29538a((K) r4, r5, r6)
            L_0x004f:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.C7447j.C7493s.mo29523a(java.lang.Object, int, com.google.common.cache.j$m, com.google.common.util.concurrent.c0):java.lang.Object");
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
            r12 = r3.mo29449e();
            r13 = r12.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
            if (r13 != null) goto L_0x006d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
            if (r12.mo29423c() == false) goto L_0x0066;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
            r8.f21007O++;
            r0 = mo29514a(r2, r3, (K) r4, r16, r12, com.google.common.cache.C7511n.COLLECTED);
            r1 = r8.f21019b - 1;
            r9.set(r10, r0);
            r8.f21019b = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r8.f21007O++;
            mo29531a(r15, r5, r12, com.google.common.cache.C7511n.REPLACED);
            mo29530a(r3, r15, r17, r6);
            mo29563l();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0084, code lost:
            unlock();
            mo29567p();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x008a, code lost:
            return r13;
         */
        @p201f.p202a.C5952h
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public V mo29546b(K r15, int r16, V r17) {
            /*
                r14 = this;
                r8 = r14
                r0 = r15
                r5 = r16
                r14.lock()
                com.google.common.cache.j<K, V> r1 = r8.f21018a     // Catch:{ all -> 0x0090 }
                com.google.common.base.j0 r1 = r1.f20928a0     // Catch:{ all -> 0x0090 }
                long r6 = r1.mo23201a()     // Catch:{ all -> 0x0090 }
                r14.mo29548b(r6)     // Catch:{ all -> 0x0090 }
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.j$r<K, V>> r9 = r8.f21009Q     // Catch:{ all -> 0x0090 }
                int r1 = r9.length()     // Catch:{ all -> 0x0090 }
                int r1 = r1 + -1
                r10 = r5 & r1
                java.lang.Object r1 = r9.get(r10)     // Catch:{ all -> 0x0090 }
                r2 = r1
                com.google.common.cache.j$r r2 = (com.google.common.cache.C7447j.C7492r) r2     // Catch:{ all -> 0x0090 }
                r3 = r2
            L_0x0024:
                r11 = 0
                if (r3 == 0) goto L_0x0066
                java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x0090 }
                int r1 = r3.mo29450f()     // Catch:{ all -> 0x0090 }
                if (r1 != r5) goto L_0x008b
                if (r4 == 0) goto L_0x008b
                com.google.common.cache.j<K, V> r1 = r8.f21018a     // Catch:{ all -> 0x0090 }
                com.google.common.base.j<java.lang.Object> r1 = r1.f20916P     // Catch:{ all -> 0x0090 }
                boolean r1 = r1.mo29253b(r15, r4)     // Catch:{ all -> 0x0090 }
                if (r1 == 0) goto L_0x008b
                com.google.common.cache.j$b0 r12 = r3.mo29449e()     // Catch:{ all -> 0x0090 }
                java.lang.Object r13 = r12.get()     // Catch:{ all -> 0x0090 }
                if (r13 != 0) goto L_0x006d
                boolean r0 = r12.mo29423c()     // Catch:{ all -> 0x0090 }
                if (r0 == 0) goto L_0x0066
                int r0 = r8.f21007O     // Catch:{ all -> 0x0090 }
                int r0 = r0 + 1
                r8.f21007O = r0     // Catch:{ all -> 0x0090 }
                com.google.common.cache.n r7 = com.google.common.cache.C7511n.COLLECTED     // Catch:{ all -> 0x0090 }
                r1 = r14
                r5 = r16
                r6 = r12
                com.google.common.cache.j$r r0 = r1.mo29514a(r2, r3, (K) r4, r5, r6, r7)     // Catch:{ all -> 0x0090 }
                int r1 = r8.f21019b     // Catch:{ all -> 0x0090 }
                int r1 = r1 + -1
                r9.set(r10, r0)     // Catch:{ all -> 0x0090 }
                r8.f21019b = r1     // Catch:{ all -> 0x0090 }
            L_0x0066:
                r14.unlock()
                r14.mo29567p()
                return r11
            L_0x006d:
                int r1 = r8.f21007O     // Catch:{ all -> 0x0090 }
                int r1 = r1 + 1
                r8.f21007O = r1     // Catch:{ all -> 0x0090 }
                com.google.common.cache.n r1 = com.google.common.cache.C7511n.REPLACED     // Catch:{ all -> 0x0090 }
                r14.mo29531a((K) r15, r5, r12, r1)     // Catch:{ all -> 0x0090 }
                r1 = r14
                r2 = r3
                r3 = r15
                r4 = r17
                r5 = r6
                r1.mo29530a(r2, (K) r3, (V) r4, r5)     // Catch:{ all -> 0x0090 }
                r14.mo29563l()     // Catch:{ all -> 0x0090 }
                r14.unlock()
                r14.mo29567p()
                return r13
            L_0x008b:
                com.google.common.cache.j$r r3 = r3.mo29447d()     // Catch:{ all -> 0x0090 }
                goto L_0x0024
            L_0x0090:
                r0 = move-exception
                r14.unlock()
                r14.mo29567p()
                goto L_0x0099
            L_0x0098:
                throw r0
            L_0x0099:
                goto L_0x0098
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.C7447j.C7493s.mo29546b(java.lang.Object, int, java.lang.Object):java.lang.Object");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public V mo29519a(C7492r<K, V> rVar, K k, int i, V v, long j, CacheLoader<? super K, V> cacheLoader) {
            if (this.f21018a.mo29403m() && j - rVar.mo29453h() > this.f21018a.f20924X && !rVar.mo29449e().mo29425e()) {
                V a = mo29522a(k, i, cacheLoader, true);
                if (a != null) {
                    return a;
                }
            }
            return v;
        }

        /* access modifiers changed from: 0000 */
        @C5952h
        /* renamed from: a */
        public V mo29522a(K k, int i, CacheLoader<? super K, V> cacheLoader, boolean z) {
            C7484m a = mo29511a(k, i, z);
            if (a == null) {
                return null;
            }
            C8473c0 a2 = mo29517a(k, i, a, cacheLoader);
            if (a2.isDone()) {
                try {
                    return C8595u0.m40488a((Future<V>) a2);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        @C5952h
        /* renamed from: a */
        public C7484m<K, V> mo29511a(K k, int i, boolean z) {
            lock();
            try {
                long a = this.f21018a.f20928a0.mo23201a();
                mo29548b(a);
                AtomicReferenceArray<C7492r<K, V>> atomicReferenceArray = this.f21009Q;
                int length = (atomicReferenceArray.length() - 1) & i;
                C7492r rVar = (C7492r) atomicReferenceArray.get(length);
                C7492r rVar2 = rVar;
                while (rVar2 != null) {
                    Object key = rVar2.getKey();
                    if (rVar2.mo29450f() != i || key == null || !this.f21018a.f20916P.mo29253b(k, key)) {
                        rVar2 = rVar2.mo29447d();
                    } else {
                        C7451b0 e = rVar2.mo29449e();
                        if (!e.mo29425e()) {
                            if (!z || a - rVar2.mo29453h() >= this.f21018a.f20924X) {
                                this.f21007O++;
                                C7484m<K, V> mVar = new C7484m<>(e);
                                rVar2.mo29442a((C7451b0<K, V>) mVar);
                                unlock();
                                mo29567p();
                                return mVar;
                            }
                        }
                        return null;
                    }
                }
                this.f21007O++;
                C7484m<K, V> mVar2 = new C7484m<>();
                C7492r a2 = mo29516a(k, i, rVar);
                a2.mo29442a((C7451b0<K, V>) mVar2);
                atomicReferenceArray.set(length, a2);
                unlock();
                mo29567p();
                return mVar2;
            } finally {
                unlock();
                mo29567p();
            }
        }

        /* access modifiers changed from: 0000 */
        @C5952h
        @C5966a("Segment.this")
        /* renamed from: b */
        public C7492r<K, V> mo29542b(C7492r<K, V> rVar, C7492r<K, V> rVar2) {
            int i = this.f21019b;
            C7492r<K, V> d = rVar2.mo29447d();
            while (rVar != rVar2) {
                C7492r<K, V> a = mo29513a(rVar, d);
                if (a != null) {
                    d = a;
                } else {
                    mo29527a(rVar);
                    i--;
                }
                rVar = rVar.mo29447d();
            }
            this.f21019b = i;
            return d;
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: b */
        public void mo29548b(long j) {
            mo29551c(j);
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: a */
        public void mo29528a(C7492r<K, V> rVar, int i, long j) {
            mo29560i();
            this.f21006N += i;
            if (this.f21018a.mo29398i()) {
                rVar.mo29441a(j);
            }
            if (this.f21018a.mo29402l()) {
                rVar.mo29444b(j);
            }
            this.f21016X.add(rVar);
            this.f21015W.add(rVar);
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: a */
        public void mo29526a(long j) {
            C7492r rVar;
            C7492r rVar2;
            mo29560i();
            do {
                rVar = (C7492r) this.f21015W.peek();
                if (rVar == null || !this.f21018a.mo29380b(rVar, j)) {
                    do {
                        rVar2 = (C7492r) this.f21016X.peek();
                        if (rVar2 == null || !this.f21018a.mo29380b(rVar2, j)) {
                            return;
                        }
                    } while (mo29534a(rVar2, rVar2.mo29450f(), C7511n.EXPIRED));
                    throw new AssertionError();
                }
            } while (mo29534a(rVar, rVar.mo29450f(), C7511n.EXPIRED));
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: a */
        public void mo29529a(C7492r<K, V> rVar, C7511n nVar) {
            mo29531a((K) rVar.getKey(), rVar.mo29450f(), rVar.mo29449e(), nVar);
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: a */
        public void mo29531a(@C5952h K k, int i, C7451b0<K, V> b0Var, C7511n nVar) {
            this.f21006N -= b0Var.mo29424d();
            if (nVar.mo29585d()) {
                this.f21017Y.mo23194a();
            }
            if (this.f21018a.f20925Y != C7447j.f20913p0) {
                this.f21018a.f20925Y.offer(new C7521q(k, b0Var.get(), nVar));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C7492r<K, V> mo29512a(int i) {
            AtomicReferenceArray<C7492r<K, V>> atomicReferenceArray = this.f21009Q;
            return (C7492r) atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        /* access modifiers changed from: 0000 */
        @C5952h
        /* renamed from: a */
        public C7492r<K, V> mo29515a(Object obj, int i, long j) {
            C7492r<K, V> c = mo29550c(obj, i);
            if (c == null) {
                return null;
            }
            if (!this.f21018a.mo29380b(c, j)) {
                return c;
            }
            mo29555d(j);
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public V mo29518a(C7492r<K, V> rVar, long j) {
            if (rVar.getKey() == null) {
                mo29569r();
                return null;
            }
            V v = rVar.mo29449e().get();
            if (v == null) {
                mo29569r();
                return null;
            } else if (!this.f21018a.mo29380b(rVar, j)) {
                return v;
            } else {
                mo29555d(j);
                return null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo29536a(Object obj, int i) {
            try {
                boolean z = false;
                if (this.f21019b != 0) {
                    C7492r a = mo29515a(obj, i, this.f21018a.f20928a0.mo23201a());
                    if (a == null) {
                        return false;
                    }
                    if (a.mo29449e().get() != null) {
                        z = true;
                    }
                    mo29566o();
                    return z;
                }
                mo29566o();
                return false;
            } finally {
                mo29566o();
            }
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: 0000 */
        @C2778d
        /* renamed from: a */
        public boolean mo29535a(Object obj) {
            try {
                if (this.f21019b != 0) {
                    long a = this.f21018a.f20928a0.mo23201a();
                    AtomicReferenceArray<C7492r<K, V>> atomicReferenceArray = this.f21009Q;
                    int length = atomicReferenceArray.length();
                    for (int i = 0; i < length; i++) {
                        for (C7492r rVar = (C7492r) atomicReferenceArray.get(i); rVar != null; rVar = rVar.mo29447d()) {
                            Object a2 = mo29518a(rVar, a);
                            if (a2 != null) {
                                if (this.f21018a.f20917Q.mo29253b(obj, a2)) {
                                    mo29566o();
                                    return true;
                                }
                            }
                        }
                    }
                }
                mo29566o();
                return false;
            } catch (Throwable th) {
                mo29566o();
                throw th;
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
            r0 = r2.mo29449e();
            r7 = r0.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
            if (r7 != null) goto L_0x007d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
            r9.f21007O++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
            if (r0.mo29423c() == false) goto L_0x0067;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
            mo29531a(r10, r11, r0, com.google.common.cache.C7511n.COLLECTED);
            mo29530a(r2, r10, r12, r5);
            r10 = r9.f21019b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0067, code lost:
            mo29530a(r2, r10, r12, r5);
            r10 = r9.f21019b + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
            r9.f21019b = r10;
            mo29563l();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x007d, code lost:
            if (r13 == false) goto L_0x0089;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            mo29549b(r2, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0082, code lost:
            unlock();
            mo29567p();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0088, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            r9.f21007O++;
            mo29531a(r10, r11, r0, com.google.common.cache.C7511n.REPLACED);
            mo29530a(r2, r10, r12, r5);
            mo29563l();
         */
        @p201f.p202a.C5952h
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public V mo29524a(K r10, int r11, V r12, boolean r13) {
            /*
                r9 = this;
                r9.lock()
                com.google.common.cache.j<K, V> r0 = r9.f21018a     // Catch:{ all -> 0x00c1 }
                com.google.common.base.j0 r0 = r0.f20928a0     // Catch:{ all -> 0x00c1 }
                long r5 = r0.mo23201a()     // Catch:{ all -> 0x00c1 }
                r9.mo29548b(r5)     // Catch:{ all -> 0x00c1 }
                int r0 = r9.f21019b     // Catch:{ all -> 0x00c1 }
                int r0 = r0 + 1
                int r1 = r9.f21008P     // Catch:{ all -> 0x00c1 }
                if (r0 <= r1) goto L_0x0019
                r9.mo29564m()     // Catch:{ all -> 0x00c1 }
            L_0x0019:
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.j$r<K, V>> r0 = r9.f21009Q     // Catch:{ all -> 0x00c1 }
                int r1 = r0.length()     // Catch:{ all -> 0x00c1 }
                int r1 = r1 + -1
                r7 = r11 & r1
                java.lang.Object r1 = r0.get(r7)     // Catch:{ all -> 0x00c1 }
                com.google.common.cache.j$r r1 = (com.google.common.cache.C7447j.C7492r) r1     // Catch:{ all -> 0x00c1 }
                r2 = r1
            L_0x002a:
                r8 = 0
                if (r2 == 0) goto L_0x00a3
                java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00c1 }
                int r4 = r2.mo29450f()     // Catch:{ all -> 0x00c1 }
                if (r4 != r11) goto L_0x009e
                if (r3 == 0) goto L_0x009e
                com.google.common.cache.j<K, V> r4 = r9.f21018a     // Catch:{ all -> 0x00c1 }
                com.google.common.base.j<java.lang.Object> r4 = r4.f20916P     // Catch:{ all -> 0x00c1 }
                boolean r3 = r4.mo29253b(r10, r3)     // Catch:{ all -> 0x00c1 }
                if (r3 == 0) goto L_0x009e
                com.google.common.cache.j$b0 r0 = r2.mo29449e()     // Catch:{ all -> 0x00c1 }
                java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x00c1 }
                if (r7 != 0) goto L_0x007d
                int r13 = r9.f21007O     // Catch:{ all -> 0x00c1 }
                int r13 = r13 + 1
                r9.f21007O = r13     // Catch:{ all -> 0x00c1 }
                boolean r13 = r0.mo29423c()     // Catch:{ all -> 0x00c1 }
                if (r13 == 0) goto L_0x0067
                com.google.common.cache.n r13 = com.google.common.cache.C7511n.COLLECTED     // Catch:{ all -> 0x00c1 }
                r9.mo29531a((K) r10, r11, r0, r13)     // Catch:{ all -> 0x00c1 }
                r1 = r9
                r3 = r10
                r4 = r12
                r1.mo29530a(r2, (K) r3, (V) r4, r5)     // Catch:{ all -> 0x00c1 }
                int r10 = r9.f21019b     // Catch:{ all -> 0x00c1 }
                goto L_0x0071
            L_0x0067:
                r1 = r9
                r3 = r10
                r4 = r12
                r1.mo29530a(r2, (K) r3, (V) r4, r5)     // Catch:{ all -> 0x00c1 }
                int r10 = r9.f21019b     // Catch:{ all -> 0x00c1 }
                int r10 = r10 + 1
            L_0x0071:
                r9.f21019b = r10     // Catch:{ all -> 0x00c1 }
                r9.mo29563l()     // Catch:{ all -> 0x00c1 }
            L_0x0076:
                r9.unlock()
                r9.mo29567p()
                return r8
            L_0x007d:
                if (r13 == 0) goto L_0x0089
                r9.mo29549b(r2, r5)     // Catch:{ all -> 0x00c1 }
            L_0x0082:
                r9.unlock()
                r9.mo29567p()
                return r7
            L_0x0089:
                int r13 = r9.f21007O     // Catch:{ all -> 0x00c1 }
                int r13 = r13 + 1
                r9.f21007O = r13     // Catch:{ all -> 0x00c1 }
                com.google.common.cache.n r13 = com.google.common.cache.C7511n.REPLACED     // Catch:{ all -> 0x00c1 }
                r9.mo29531a((K) r10, r11, r0, r13)     // Catch:{ all -> 0x00c1 }
                r1 = r9
                r3 = r10
                r4 = r12
                r1.mo29530a(r2, (K) r3, (V) r4, r5)     // Catch:{ all -> 0x00c1 }
                r9.mo29563l()     // Catch:{ all -> 0x00c1 }
                goto L_0x0082
            L_0x009e:
                com.google.common.cache.j$r r2 = r2.mo29447d()     // Catch:{ all -> 0x00c1 }
                goto L_0x002a
            L_0x00a3:
                int r13 = r9.f21007O     // Catch:{ all -> 0x00c1 }
                int r13 = r13 + 1
                r9.f21007O = r13     // Catch:{ all -> 0x00c1 }
                com.google.common.cache.j$r r11 = r9.mo29516a((K) r10, r11, r1)     // Catch:{ all -> 0x00c1 }
                r1 = r9
                r2 = r11
                r3 = r10
                r4 = r12
                r1.mo29530a(r2, (K) r3, (V) r4, r5)     // Catch:{ all -> 0x00c1 }
                r0.set(r7, r11)     // Catch:{ all -> 0x00c1 }
                int r10 = r9.f21019b     // Catch:{ all -> 0x00c1 }
                int r10 = r10 + 1
                r9.f21019b = r10     // Catch:{ all -> 0x00c1 }
                r9.mo29563l()     // Catch:{ all -> 0x00c1 }
                goto L_0x0076
            L_0x00c1:
                r10 = move-exception
                r9.unlock()
                r9.mo29567p()
                goto L_0x00ca
            L_0x00c9:
                throw r10
            L_0x00ca:
                goto L_0x00c9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.C7447j.C7493s.mo29524a(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object");
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
            r13 = r3.mo29449e();
            r1 = r13.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
            if (r1 != null) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
            if (r13.mo29423c() == false) goto L_0x0064;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
            r8.f21007O++;
            r0 = mo29514a(r2, r3, (K) r4, r16, r13, com.google.common.cache.C7511n.COLLECTED);
            r1 = r8.f21019b - 1;
            r9.set(r11, r0);
            r8.f21019b = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0075, code lost:
            if (r8.f21018a.f20917Q.mo29253b(r17, r1) == false) goto L_0x0094;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
            r8.f21007O++;
            mo29531a(r15, r5, r13, com.google.common.cache.C7511n.REPLACED);
            mo29530a(r3, r15, r18, r6);
            mo29563l();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x008d, code lost:
            unlock();
            mo29567p();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0093, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            mo29549b(r3, r6);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo29541a(K r15, int r16, V r17, V r18) {
            /*
                r14 = this;
                r8 = r14
                r0 = r15
                r5 = r16
                r14.lock()
                com.google.common.cache.j<K, V> r1 = r8.f21018a     // Catch:{ all -> 0x009f }
                com.google.common.base.j0 r1 = r1.f20928a0     // Catch:{ all -> 0x009f }
                long r6 = r1.mo23201a()     // Catch:{ all -> 0x009f }
                r14.mo29548b(r6)     // Catch:{ all -> 0x009f }
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.j$r<K, V>> r9 = r8.f21009Q     // Catch:{ all -> 0x009f }
                int r1 = r9.length()     // Catch:{ all -> 0x009f }
                r10 = 1
                int r1 = r1 - r10
                r11 = r5 & r1
                java.lang.Object r1 = r9.get(r11)     // Catch:{ all -> 0x009f }
                r2 = r1
                com.google.common.cache.j$r r2 = (com.google.common.cache.C7447j.C7492r) r2     // Catch:{ all -> 0x009f }
                r3 = r2
            L_0x0024:
                r12 = 0
                if (r3 == 0) goto L_0x0064
                java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x009f }
                int r1 = r3.mo29450f()     // Catch:{ all -> 0x009f }
                if (r1 != r5) goto L_0x0098
                if (r4 == 0) goto L_0x0098
                com.google.common.cache.j<K, V> r1 = r8.f21018a     // Catch:{ all -> 0x009f }
                com.google.common.base.j<java.lang.Object> r1 = r1.f20916P     // Catch:{ all -> 0x009f }
                boolean r1 = r1.mo29253b(r15, r4)     // Catch:{ all -> 0x009f }
                if (r1 == 0) goto L_0x0098
                com.google.common.cache.j$b0 r13 = r3.mo29449e()     // Catch:{ all -> 0x009f }
                java.lang.Object r1 = r13.get()     // Catch:{ all -> 0x009f }
                if (r1 != 0) goto L_0x006b
                boolean r0 = r13.mo29423c()     // Catch:{ all -> 0x009f }
                if (r0 == 0) goto L_0x0064
                int r0 = r8.f21007O     // Catch:{ all -> 0x009f }
                int r0 = r0 + r10
                r8.f21007O = r0     // Catch:{ all -> 0x009f }
                com.google.common.cache.n r7 = com.google.common.cache.C7511n.COLLECTED     // Catch:{ all -> 0x009f }
                r1 = r14
                r5 = r16
                r6 = r13
                com.google.common.cache.j$r r0 = r1.mo29514a(r2, r3, (K) r4, r5, r6, r7)     // Catch:{ all -> 0x009f }
                int r1 = r8.f21019b     // Catch:{ all -> 0x009f }
                int r1 = r1 - r10
                r9.set(r11, r0)     // Catch:{ all -> 0x009f }
                r8.f21019b = r1     // Catch:{ all -> 0x009f }
            L_0x0064:
                r14.unlock()
                r14.mo29567p()
                return r12
            L_0x006b:
                com.google.common.cache.j<K, V> r2 = r8.f21018a     // Catch:{ all -> 0x009f }
                com.google.common.base.j<java.lang.Object> r2 = r2.f20917Q     // Catch:{ all -> 0x009f }
                r4 = r17
                boolean r1 = r2.mo29253b(r4, r1)     // Catch:{ all -> 0x009f }
                if (r1 == 0) goto L_0x0094
                int r1 = r8.f21007O     // Catch:{ all -> 0x009f }
                int r1 = r1 + r10
                r8.f21007O = r1     // Catch:{ all -> 0x009f }
                com.google.common.cache.n r1 = com.google.common.cache.C7511n.REPLACED     // Catch:{ all -> 0x009f }
                r14.mo29531a((K) r15, r5, r13, r1)     // Catch:{ all -> 0x009f }
                r1 = r14
                r2 = r3
                r3 = r15
                r4 = r18
                r5 = r6
                r1.mo29530a(r2, (K) r3, (V) r4, r5)     // Catch:{ all -> 0x009f }
                r14.mo29563l()     // Catch:{ all -> 0x009f }
                r14.unlock()
                r14.mo29567p()
                return r10
            L_0x0094:
                r14.mo29549b(r3, r6)     // Catch:{ all -> 0x009f }
                goto L_0x0064
            L_0x0098:
                r4 = r17
                com.google.common.cache.j$r r3 = r3.mo29447d()     // Catch:{ all -> 0x009f }
                goto L_0x0024
            L_0x009f:
                r0 = move-exception
                r14.unlock()
                r14.mo29567p()
                goto L_0x00a8
            L_0x00a7:
                throw r0
            L_0x00a8:
                goto L_0x00a7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.C7447j.C7493s.mo29541a(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean");
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
            r1 = r2.mo29449e();
            r3 = r1.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
            if (r13 == r1) goto L_0x0067;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
            if (r3 != null) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
            if (r1 == com.google.common.cache.C7447j.f20912o0) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
            mo29531a(r11, r12, (com.google.common.cache.C7447j.C7451b0<K, V>) new com.google.common.cache.C7447j.C7477j0<K,V>(r14, 0), com.google.common.cache.C7511n.REPLACED);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
            unlock();
            mo29567p();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
            return false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r10.f21007O++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0070, code lost:
            if (r13.mo29423c() == false) goto L_0x007e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
            if (r3 != null) goto L_0x0077;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
            r1 = com.google.common.cache.C7511n.COLLECTED;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
            r1 = com.google.common.cache.C7511n.REPLACED;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0079, code lost:
            mo29531a(r11, r12, (com.google.common.cache.C7447j.C7451b0<K, V>) r13, r1);
            r0 = r0 - 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
            mo29530a(r2, r11, r14, r5);
            r10.f21019b = r0;
            mo29563l();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo29539a(K r11, int r12, com.google.common.cache.C7447j.C7484m<K, V> r13, V r14) {
            /*
                r10 = this;
                r10.lock()
                com.google.common.cache.j<K, V> r0 = r10.f21018a     // Catch:{ all -> 0x00ae }
                com.google.common.base.j0 r0 = r0.f20928a0     // Catch:{ all -> 0x00ae }
                long r5 = r0.mo23201a()     // Catch:{ all -> 0x00ae }
                r10.mo29548b(r5)     // Catch:{ all -> 0x00ae }
                int r0 = r10.f21019b     // Catch:{ all -> 0x00ae }
                r7 = 1
                int r0 = r0 + r7
                int r1 = r10.f21008P     // Catch:{ all -> 0x00ae }
                if (r0 <= r1) goto L_0x001c
                r10.mo29564m()     // Catch:{ all -> 0x00ae }
                int r0 = r10.f21019b     // Catch:{ all -> 0x00ae }
                int r0 = r0 + r7
            L_0x001c:
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.j$r<K, V>> r8 = r10.f21009Q     // Catch:{ all -> 0x00ae }
                int r1 = r8.length()     // Catch:{ all -> 0x00ae }
                int r1 = r1 - r7
                r9 = r12 & r1
                java.lang.Object r1 = r8.get(r9)     // Catch:{ all -> 0x00ae }
                com.google.common.cache.j$r r1 = (com.google.common.cache.C7447j.C7492r) r1     // Catch:{ all -> 0x00ae }
                r2 = r1
            L_0x002c:
                if (r2 == 0) goto L_0x0095
                java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00ae }
                int r4 = r2.mo29450f()     // Catch:{ all -> 0x00ae }
                if (r4 != r12) goto L_0x0090
                if (r3 == 0) goto L_0x0090
                com.google.common.cache.j<K, V> r4 = r10.f21018a     // Catch:{ all -> 0x00ae }
                com.google.common.base.j<java.lang.Object> r4 = r4.f20916P     // Catch:{ all -> 0x00ae }
                boolean r3 = r4.mo29253b(r11, r3)     // Catch:{ all -> 0x00ae }
                if (r3 == 0) goto L_0x0090
                com.google.common.cache.j$b0 r1 = r2.mo29449e()     // Catch:{ all -> 0x00ae }
                java.lang.Object r3 = r1.get()     // Catch:{ all -> 0x00ae }
                if (r13 == r1) goto L_0x0067
                if (r3 != 0) goto L_0x0055
                com.google.common.cache.j$b0<java.lang.Object, java.lang.Object> r4 = com.google.common.cache.C7447j.f20912o0     // Catch:{ all -> 0x00ae }
                if (r1 == r4) goto L_0x0055
                goto L_0x0067
            L_0x0055:
                com.google.common.cache.j$j0 r13 = new com.google.common.cache.j$j0     // Catch:{ all -> 0x00ae }
                r0 = 0
                r13.<init>(r14, r0)     // Catch:{ all -> 0x00ae }
                com.google.common.cache.n r14 = com.google.common.cache.C7511n.REPLACED     // Catch:{ all -> 0x00ae }
                r10.mo29531a((K) r11, r12, r13, r14)     // Catch:{ all -> 0x00ae }
                r10.unlock()
                r10.mo29567p()
                return r0
            L_0x0067:
                int r1 = r10.f21007O     // Catch:{ all -> 0x00ae }
                int r1 = r1 + r7
                r10.f21007O = r1     // Catch:{ all -> 0x00ae }
                boolean r1 = r13.mo29423c()     // Catch:{ all -> 0x00ae }
                if (r1 == 0) goto L_0x007e
                if (r3 != 0) goto L_0x0077
                com.google.common.cache.n r1 = com.google.common.cache.C7511n.COLLECTED     // Catch:{ all -> 0x00ae }
                goto L_0x0079
            L_0x0077:
                com.google.common.cache.n r1 = com.google.common.cache.C7511n.REPLACED     // Catch:{ all -> 0x00ae }
            L_0x0079:
                r10.mo29531a((K) r11, r12, r13, r1)     // Catch:{ all -> 0x00ae }
                int r0 = r0 + -1
            L_0x007e:
                r1 = r10
                r3 = r11
                r4 = r14
                r1.mo29530a(r2, (K) r3, (V) r4, r5)     // Catch:{ all -> 0x00ae }
                r10.f21019b = r0     // Catch:{ all -> 0x00ae }
                r10.mo29563l()     // Catch:{ all -> 0x00ae }
            L_0x0089:
                r10.unlock()
                r10.mo29567p()
                return r7
            L_0x0090:
                com.google.common.cache.j$r r2 = r2.mo29447d()     // Catch:{ all -> 0x00ae }
                goto L_0x002c
            L_0x0095:
                int r13 = r10.f21007O     // Catch:{ all -> 0x00ae }
                int r13 = r13 + r7
                r10.f21007O = r13     // Catch:{ all -> 0x00ae }
                com.google.common.cache.j$r r12 = r10.mo29516a((K) r11, r12, r1)     // Catch:{ all -> 0x00ae }
                r1 = r10
                r2 = r12
                r3 = r11
                r4 = r14
                r1.mo29530a(r2, (K) r3, (V) r4, r5)     // Catch:{ all -> 0x00ae }
                r8.set(r9, r12)     // Catch:{ all -> 0x00ae }
                r10.f21019b = r0     // Catch:{ all -> 0x00ae }
                r10.mo29563l()     // Catch:{ all -> 0x00ae }
                goto L_0x0089
            L_0x00ae:
                r11 = move-exception
                r10.unlock()
                r10.mo29567p()
                goto L_0x00b7
            L_0x00b6:
                throw r11
            L_0x00b7:
                goto L_0x00b6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.C7447j.C7493s.mo29539a(java.lang.Object, int, com.google.common.cache.j$m, java.lang.Object):boolean");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo29540a(Object obj, int i, Object obj2) {
            C7511n nVar;
            lock();
            try {
                mo29548b(this.f21018a.f20928a0.mo23201a());
                AtomicReferenceArray<C7492r<K, V>> atomicReferenceArray = this.f21009Q;
                boolean z = true;
                int length = (atomicReferenceArray.length() - 1) & i;
                C7492r rVar = (C7492r) atomicReferenceArray.get(length);
                C7492r rVar2 = rVar;
                while (true) {
                    if (rVar2 == null) {
                        break;
                    }
                    Object key = rVar2.getKey();
                    if (rVar2.mo29450f() != i || key == null || !this.f21018a.f20916P.mo29253b(obj, key)) {
                        rVar2 = rVar2.mo29447d();
                    } else {
                        C7451b0 e = rVar2.mo29449e();
                        Object obj3 = e.get();
                        if (this.f21018a.f20917Q.mo29253b(obj2, obj3)) {
                            nVar = C7511n.EXPLICIT;
                        } else if (obj3 == null && e.mo29423c()) {
                            nVar = C7511n.COLLECTED;
                        }
                        this.f21007O++;
                        int i2 = this.f21019b - 1;
                        atomicReferenceArray.set(length, mo29514a(rVar, rVar2, (K) key, i, e, nVar));
                        this.f21019b = i2;
                        if (nVar != C7511n.EXPLICIT) {
                            z = false;
                        }
                        return z;
                    }
                }
                unlock();
                mo29567p();
                return false;
            } finally {
                unlock();
                mo29567p();
            }
        }

        /* access modifiers changed from: 0000 */
        @C5952h
        @C5966a("Segment.this")
        /* renamed from: a */
        public C7492r<K, V> mo29514a(C7492r<K, V> rVar, C7492r<K, V> rVar2, @C5952h K k, int i, C7451b0<K, V> b0Var, C7511n nVar) {
            mo29531a(k, i, b0Var, nVar);
            this.f21015W.remove(rVar2);
            this.f21016X.remove(rVar2);
            if (!b0Var.mo29425e()) {
                return mo29542b(rVar, rVar2);
            }
            b0Var.mo29421a(null);
            return rVar;
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: a */
        public void mo29527a(C7492r<K, V> rVar) {
            mo29529a(rVar, C7511n.COLLECTED);
            this.f21015W.remove(rVar);
            this.f21016X.remove(rVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo29533a(C7492r<K, V> rVar, int i) {
            lock();
            try {
                AtomicReferenceArray<C7492r<K, V>> atomicReferenceArray = this.f21009Q;
                int length = (atomicReferenceArray.length() - 1) & i;
                C7492r<K, V> rVar2 = (C7492r) atomicReferenceArray.get(length);
                for (C7492r<K, V> rVar3 = rVar2; rVar3 != null; rVar3 = rVar3.mo29447d()) {
                    if (rVar3 == rVar) {
                        this.f21007O++;
                        int i2 = this.f21019b - 1;
                        atomicReferenceArray.set(length, mo29514a(rVar2, rVar3, (K) rVar3.getKey(), i, rVar3.mo29449e(), C7511n.COLLECTED));
                        this.f21019b = i2;
                        return true;
                    }
                }
                unlock();
                mo29567p();
                return false;
            } finally {
                unlock();
                mo29567p();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo29537a(K k, int i, C7451b0<K, V> b0Var) {
            lock();
            try {
                AtomicReferenceArray<C7492r<K, V>> atomicReferenceArray = this.f21009Q;
                int length = (atomicReferenceArray.length() - 1) & i;
                C7492r rVar = (C7492r) atomicReferenceArray.get(length);
                C7492r rVar2 = rVar;
                while (rVar2 != null) {
                    Object key = rVar2.getKey();
                    if (rVar2.mo29450f() != i || key == null || !this.f21018a.f20916P.mo29253b(k, key)) {
                        rVar2 = rVar2.mo29447d();
                    } else if (rVar2.mo29449e() == b0Var) {
                        this.f21007O++;
                        int i2 = this.f21019b - 1;
                        atomicReferenceArray.set(length, mo29514a(rVar, rVar2, (K) key, i, b0Var, C7511n.COLLECTED));
                        this.f21019b = i2;
                        return true;
                    } else {
                        unlock();
                        if (!isHeldByCurrentThread()) {
                            mo29567p();
                        }
                        return false;
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    mo29567p();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    mo29567p();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo29538a(K k, int i, C7484m<K, V> mVar) {
            lock();
            try {
                AtomicReferenceArray<C7492r<K, V>> atomicReferenceArray = this.f21009Q;
                int length = (atomicReferenceArray.length() - 1) & i;
                C7492r rVar = (C7492r) atomicReferenceArray.get(length);
                C7492r rVar2 = rVar;
                while (true) {
                    if (rVar2 == null) {
                        break;
                    }
                    Object key = rVar2.getKey();
                    if (rVar2.mo29450f() != i || key == null || !this.f21018a.f20916P.mo29253b(k, key)) {
                        rVar2 = rVar2.mo29447d();
                    } else if (rVar2.mo29449e() == mVar) {
                        if (mVar.mo29423c()) {
                            rVar2.mo29442a(mVar.mo29502g());
                        } else {
                            atomicReferenceArray.set(length, mo29542b(rVar, rVar2));
                        }
                        return true;
                    }
                }
                unlock();
                mo29567p();
                return false;
            } finally {
                unlock();
                mo29567p();
            }
        }

        /* access modifiers changed from: 0000 */
        @C5966a("Segment.this")
        /* renamed from: a */
        public boolean mo29534a(C7492r<K, V> rVar, int i, C7511n nVar) {
            AtomicReferenceArray<C7492r<K, V>> atomicReferenceArray = this.f21009Q;
            int length = (atomicReferenceArray.length() - 1) & i;
            C7492r<K, V> rVar2 = (C7492r) atomicReferenceArray.get(length);
            for (C7492r<K, V> rVar3 = rVar2; rVar3 != null; rVar3 = rVar3.mo29447d()) {
                if (rVar3 == rVar) {
                    this.f21007O++;
                    int i2 = this.f21019b - 1;
                    atomicReferenceArray.set(length, mo29514a(rVar2, rVar3, (K) rVar3.getKey(), i, rVar3.mo29449e(), nVar));
                    this.f21019b = i2;
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo29525a() {
            mo29551c(this.f21018a.f20928a0.mo23201a());
            mo29568q();
        }
    }

    /* renamed from: com.google.common.cache.j$t */
    /* compiled from: LocalCache */
    static class C7495t<K, V> extends SoftReference<V> implements C7451b0<K, V> {

        /* renamed from: a */
        final C7492r<K, V> f21025a;

        C7495t(ReferenceQueue<V> referenceQueue, V v, C7492r<K, V> rVar) {
            super(v, referenceQueue);
            this.f21025a = rVar;
        }

        /* renamed from: a */
        public C7451b0<K, V> mo29419a(ReferenceQueue<V> referenceQueue, V v, C7492r<K, V> rVar) {
            return new C7495t(referenceQueue, v, rVar);
        }

        /* renamed from: a */
        public void mo29421a(V v) {
        }

        /* renamed from: b */
        public C7492r<K, V> mo29422b() {
            return this.f21025a;
        }

        /* renamed from: c */
        public boolean mo29423c() {
            return true;
        }

        /* renamed from: d */
        public int mo29424d() {
            return 1;
        }

        /* renamed from: e */
        public boolean mo29425e() {
            return false;
        }

        /* renamed from: a */
        public V mo29420a() {
            return get();
        }
    }

    /* renamed from: com.google.common.cache.j$u */
    /* compiled from: LocalCache */
    enum C7496u {
        STRONG {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7451b0<K, V> mo29571a(C7493s<K, V> sVar, C7492r<K, V> rVar, V v, int i) {
                return i == 1 ? new C7503y(v) : new C7477j0(v, i);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: d */
            public C7359j<Object> mo29572d() {
                return C7359j.m35591d();
            }
        },
        SOFT {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7451b0<K, V> mo29571a(C7493s<K, V> sVar, C7492r<K, V> rVar, V v, int i) {
                return i == 1 ? new C7495t(sVar.f21012T, v, rVar) : new C7475i0(sVar.f21012T, v, rVar, i);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: d */
            public C7359j<Object> mo29572d() {
                return C7359j.m35592e();
            }
        },
        WEAK {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <K, V> C7451b0<K, V> mo29571a(C7493s<K, V> sVar, C7492r<K, V> rVar, V v, int i) {
                return i == 1 ? new C7471g0(sVar.f21012T, v, rVar) : new C7479k0(sVar.f21012T, v, rVar, i);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: d */
            public C7359j<Object> mo29572d() {
                return C7359j.m35592e();
            }
        };

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract <K, V> C7451b0<K, V> mo29571a(C7493s<K, V> sVar, C7492r<K, V> rVar, V v, int i);

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public abstract C7359j<Object> mo29572d();
    }

    /* renamed from: com.google.common.cache.j$v */
    /* compiled from: LocalCache */
    static final class C7500v<K, V> extends C7502x<K, V> {

        /* renamed from: P */
        volatile long f21026P = Long.MAX_VALUE;
        @C5966a("Segment.this")

        /* renamed from: Q */
        C7492r<K, V> f21027Q = C7447j.m35815u();
        @C5966a("Segment.this")

        /* renamed from: R */
        C7492r<K, V> f21028R = C7447j.m35815u();

        C7500v(K k, int i, @C5952h C7492r<K, V> rVar) {
            super(k, i, rVar);
        }

        /* renamed from: a */
        public void mo29441a(long j) {
            this.f21026P = j;
        }

        /* renamed from: b */
        public void mo29445b(C7492r<K, V> rVar) {
            this.f21028R = rVar;
        }

        /* renamed from: d */
        public void mo29448d(C7492r<K, V> rVar) {
            this.f21027Q = rVar;
        }

        /* renamed from: g */
        public C7492r<K, V> mo29451g() {
            return this.f21028R;
        }

        /* renamed from: k */
        public long mo29455k() {
            return this.f21026P;
        }

        /* renamed from: p */
        public C7492r<K, V> mo29456p() {
            return this.f21027Q;
        }
    }

    /* renamed from: com.google.common.cache.j$w */
    /* compiled from: LocalCache */
    static final class C7501w<K, V> extends C7502x<K, V> {

        /* renamed from: P */
        volatile long f21029P = Long.MAX_VALUE;
        @C5966a("Segment.this")

        /* renamed from: Q */
        C7492r<K, V> f21030Q = C7447j.m35815u();
        @C5966a("Segment.this")

        /* renamed from: R */
        C7492r<K, V> f21031R = C7447j.m35815u();

        /* renamed from: S */
        volatile long f21032S = Long.MAX_VALUE;
        @C5966a("Segment.this")

        /* renamed from: T */
        C7492r<K, V> f21033T = C7447j.m35815u();
        @C5966a("Segment.this")

        /* renamed from: U */
        C7492r<K, V> f21034U = C7447j.m35815u();

        C7501w(K k, int i, @C5952h C7492r<K, V> rVar) {
            super(k, i, rVar);
        }

        /* renamed from: a */
        public void mo29441a(long j) {
            this.f21029P = j;
        }

        /* renamed from: b */
        public void mo29445b(C7492r<K, V> rVar) {
            this.f21031R = rVar;
        }

        /* renamed from: c */
        public void mo29446c(C7492r<K, V> rVar) {
            this.f21033T = rVar;
        }

        /* renamed from: d */
        public void mo29448d(C7492r<K, V> rVar) {
            this.f21030Q = rVar;
        }

        /* renamed from: g */
        public C7492r<K, V> mo29451g() {
            return this.f21031R;
        }

        /* renamed from: h */
        public long mo29453h() {
            return this.f21032S;
        }

        /* renamed from: j */
        public C7492r<K, V> mo29454j() {
            return this.f21033T;
        }

        /* renamed from: k */
        public long mo29455k() {
            return this.f21029P;
        }

        /* renamed from: p */
        public C7492r<K, V> mo29456p() {
            return this.f21030Q;
        }

        /* renamed from: q */
        public C7492r<K, V> mo29457q() {
            return this.f21034U;
        }

        /* renamed from: a */
        public void mo29443a(C7492r<K, V> rVar) {
            this.f21034U = rVar;
        }

        /* renamed from: b */
        public void mo29444b(long j) {
            this.f21032S = j;
        }
    }

    /* renamed from: com.google.common.cache.j$x */
    /* compiled from: LocalCache */
    static class C7502x<K, V> extends C7454d<K, V> {

        /* renamed from: N */
        final C7492r<K, V> f21035N;

        /* renamed from: O */
        volatile C7451b0<K, V> f21036O = C7447j.m35816v();

        /* renamed from: a */
        final K f21037a;

        /* renamed from: b */
        final int f21038b;

        C7502x(K k, int i, @C5952h C7492r<K, V> rVar) {
            this.f21037a = k;
            this.f21038b = i;
            this.f21035N = rVar;
        }

        /* renamed from: a */
        public void mo29442a(C7451b0<K, V> b0Var) {
            this.f21036O = b0Var;
        }

        /* renamed from: d */
        public C7492r<K, V> mo29447d() {
            return this.f21035N;
        }

        /* renamed from: e */
        public C7451b0<K, V> mo29449e() {
            return this.f21036O;
        }

        /* renamed from: f */
        public int mo29450f() {
            return this.f21038b;
        }

        public K getKey() {
            return this.f21037a;
        }
    }

    /* renamed from: com.google.common.cache.j$y */
    /* compiled from: LocalCache */
    static class C7503y<K, V> implements C7451b0<K, V> {

        /* renamed from: a */
        final V f21039a;

        C7503y(V v) {
            this.f21039a = v;
        }

        /* renamed from: a */
        public C7451b0<K, V> mo29419a(ReferenceQueue<V> referenceQueue, V v, C7492r<K, V> rVar) {
            return this;
        }

        /* renamed from: a */
        public V mo29420a() {
            return get();
        }

        /* renamed from: a */
        public void mo29421a(V v) {
        }

        /* renamed from: b */
        public C7492r<K, V> mo29422b() {
            return null;
        }

        /* renamed from: c */
        public boolean mo29423c() {
            return true;
        }

        /* renamed from: d */
        public int mo29424d() {
            return 1;
        }

        /* renamed from: e */
        public boolean mo29425e() {
            return false;
        }

        public V get() {
            return this.f21039a;
        }
    }

    /* renamed from: com.google.common.cache.j$z */
    /* compiled from: LocalCache */
    static final class C7504z<K, V> extends C7502x<K, V> {

        /* renamed from: P */
        volatile long f21040P = Long.MAX_VALUE;
        @C5966a("Segment.this")

        /* renamed from: Q */
        C7492r<K, V> f21041Q = C7447j.m35815u();
        @C5966a("Segment.this")

        /* renamed from: R */
        C7492r<K, V> f21042R = C7447j.m35815u();

        C7504z(K k, int i, @C5952h C7492r<K, V> rVar) {
            super(k, i, rVar);
        }

        /* renamed from: a */
        public void mo29443a(C7492r<K, V> rVar) {
            this.f21042R = rVar;
        }

        /* renamed from: b */
        public void mo29444b(long j) {
            this.f21040P = j;
        }

        /* renamed from: c */
        public void mo29446c(C7492r<K, V> rVar) {
            this.f21041Q = rVar;
        }

        /* renamed from: h */
        public long mo29453h() {
            return this.f21040P;
        }

        /* renamed from: j */
        public C7492r<K, V> mo29454j() {
            return this.f21041Q;
        }

        /* renamed from: q */
        public C7492r<K, V> mo29457q() {
            return this.f21042R;
        }
    }

    C7447j(C5832d<? super K, ? super V> dVar, @C5952h CacheLoader<? super K, V> cacheLoader) {
        this.f20915O = Math.min(dVar.mo23168b(), 65536);
        this.f20918R = dVar.mo23179g();
        this.f20919S = dVar.mo23185m();
        this.f20916P = dVar.mo23178f();
        this.f20917Q = dVar.mo23184l();
        this.f20920T = dVar.mo23180h();
        this.f20921U = dVar.mo23186n();
        this.f20922V = dVar.mo23174c();
        this.f20923W = dVar.mo23176d();
        this.f20924X = dVar.mo23181i();
        this.f20926Z = dVar.mo23182j();
        this.f20925Y = this.f20926Z == C5836d.INSTANCE ? m35814t() : new ConcurrentLinkedQueue<>();
        this.f20928a0 = dVar.mo23157a(mo29400j());
        this.f20930b0 = C7460f.m35913a(this.f20918R, mo29404n(), mo29411r());
        this.f20931c0 = (C7422b) dVar.mo23183k().get();
        this.f20932d0 = cacheLoader;
        int min = Math.min(dVar.mo23177e(), 1073741824);
        if (mo29383c() && !mo29379b()) {
            min = Math.min(min, (int) this.f20920T);
        }
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.f20915O && (!mo29383c() || ((long) (i3 * 20)) <= this.f20920T)) {
            i4++;
            i3 <<= 1;
        }
        this.f20929b = 32 - i4;
        this.f20927a = i3 - 1;
        this.f20914N = mo29375a(i3);
        int i5 = min / i3;
        if (i5 * i3 < min) {
            i5++;
        }
        while (i2 < i5) {
            i2 <<= 1;
        }
        if (mo29383c()) {
            long j = this.f20920T;
            long j2 = (long) i3;
            long j3 = (j / j2) + 1;
            long j4 = j % j2;
            while (i < this.f20914N.length) {
                if (((long) i) == j4) {
                    j3--;
                }
                this.f20914N[i] = mo29367a(i2, j3, (C7422b) dVar.mo23183k().get());
                i++;
            }
            return;
        }
        while (true) {
            C7493s<K, V>[] sVarArr = this.f20914N;
            if (i < sVarArr.length) {
                sVarArr[i] = mo29367a(i2, -1, (C7422b) dVar.mo23183k().get());
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    static int m35811c(int i) {
        int i2 = i + ((i << 15) ^ -12931);
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    /* renamed from: t */
    static <E> Queue<E> m35814t() {
        return f20913p0;
    }

    /* renamed from: u */
    static <K, V> C7492r<K, V> m35815u() {
        return C7491q.INSTANCE;
    }

    /* renamed from: v */
    static <K, V> C7451b0<K, V> m35816v() {
        return f20912o0;
    }

    /* access modifiers changed from: 0000 */
    @C2778d
    @C5966a("Segment.this")
    /* renamed from: a */
    public C7492r<K, V> mo29366a(K k, int i, @C5952h C7492r<K, V> rVar) {
        return mo29377b(i).mo29516a(k, i, rVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo29379b() {
        return this.f20921U != C5837e.INSTANCE;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo29383c() {
        return this.f20920T >= 0;
    }

    public void clear() {
        for (C7493s<K, V> d : this.f20914N) {
            d.mo29554d();
        }
    }

    public boolean containsKey(@C5952h Object obj) {
        if (obj == null) {
            return false;
        }
        int e = mo29390e(obj);
        return mo29377b(e).mo29536a(obj, e);
    }

    public boolean containsValue(@C5952h Object obj) {
        Object obj2 = obj;
        if (obj2 == null) {
            return false;
        }
        long a = this.f20928a0.mo23201a();
        C7493s<K, V>[] sVarArr = this.f20914N;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = sVarArr.length;
            long j2 = 0;
            int i2 = 0;
            while (i2 < length) {
                C7493s<K, V> sVar = sVarArr[i2];
                int i3 = sVar.f21019b;
                AtomicReferenceArray<C7492r<K, V>> atomicReferenceArray = sVar.f21009Q;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    C7492r rVar = (C7492r) atomicReferenceArray.get(i4);
                    while (rVar != null) {
                        C7493s<K, V>[] sVarArr2 = sVarArr;
                        Object a2 = sVar.mo29518a(rVar, a);
                        long j3 = a;
                        if (a2 != null && this.f20917Q.mo29253b(obj2, a2)) {
                            return true;
                        }
                        rVar = rVar.mo29447d();
                        sVarArr = sVarArr2;
                        a = j3;
                    }
                    long j4 = a;
                    C7493s<K, V>[] sVarArr3 = sVarArr;
                }
                C7493s<K, V>[] sVarArr4 = sVarArr;
                j2 += (long) sVar.f21007O;
                i2++;
                a = a;
            }
            long j5 = a;
            C7493s<K, V>[] sVarArr5 = sVarArr;
            if (j2 == j) {
                break;
            }
            i++;
            j = j2;
            sVarArr = sVarArr5;
            a = j5;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo29389d() {
        return mo29394f() || mo29391e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo29391e() {
        return this.f20922V > 0;
    }

    @C2777c("Not supported.")
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.f20935g0;
        if (set != null) {
            return set;
        }
        C7472h hVar = new C7472h(this);
        this.f20935g0 = hVar;
        return hVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo29394f() {
        return this.f20923W > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public long mo29395g() {
        long j = 0;
        for (C7493s<K, V> sVar : this.f20914N) {
            j += (long) sVar.f21019b;
        }
        return j;
    }

    @C5952h
    public V get(@C5952h Object obj) {
        if (obj == null) {
            return null;
        }
        int e = mo29390e(obj);
        return mo29377b(e).mo29543b(obj, e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo29397h() {
        while (true) {
            C7521q qVar = (C7521q) this.f20925Y.poll();
            if (qVar != null) {
                try {
                    this.f20926Z.mo23202a(qVar);
                } catch (Throwable th) {
                    f20910m0.log(Level.WARNING, "Exception thrown by removal listener", th);
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo29398i() {
        return mo29391e();
    }

    public boolean isEmpty() {
        C7493s<K, V>[] sVarArr = this.f20914N;
        long j = 0;
        for (int i = 0; i < sVarArr.length; i++) {
            if (sVarArr[i].f21019b != 0) {
                return false;
            }
            j += (long) sVarArr[i].f21007O;
        }
        if (j != 0) {
            for (int i2 = 0; i2 < sVarArr.length; i2++) {
                if (sVarArr[i2].f21019b != 0) {
                    return false;
                }
                j -= (long) sVarArr[i2].f21007O;
            }
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo29400j() {
        return mo29402l() || mo29398i();
    }

    public Set<K> keySet() {
        Set<K> set = this.f20933e0;
        if (set != null) {
            return set;
        }
        C7478k kVar = new C7478k(this);
        this.f20933e0 = kVar;
        return kVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo29402l() {
        return mo29394f() || mo29403m();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public boolean mo29403m() {
        return this.f20924X > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public boolean mo29404n() {
        return mo29405o() || mo29398i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public boolean mo29405o() {
        return mo29391e() || mo29383c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public boolean mo29406p() {
        return this.f20918R != C7496u.STRONG;
    }

    public V put(K k, V v) {
        C7397x.m35664a(k);
        C7397x.m35664a(v);
        int e = mo29390e(k);
        return mo29377b(e).mo29524a(k, e, v, false);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public V putIfAbsent(K k, V v) {
        C7397x.m35664a(k);
        C7397x.m35664a(v);
        int e = mo29390e(k);
        return mo29377b(e).mo29524a(k, e, v, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public boolean mo29410q() {
        return this.f20919S != C7496u.STRONG;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public boolean mo29411r() {
        return mo29416s() || mo29402l();
    }

    public V remove(@C5952h Object obj) {
        if (obj == null) {
            return null;
        }
        int e = mo29390e(obj);
        return mo29377b(e).mo29553d(obj, e);
    }

    public boolean replace(K k, @C5952h V v, V v2) {
        C7397x.m35664a(k);
        C7397x.m35664a(v2);
        if (v == null) {
            return false;
        }
        int e = mo29390e(k);
        return mo29377b(e).mo29541a(k, e, v, v2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public boolean mo29416s() {
        return mo29394f();
    }

    public int size() {
        return C6637f.m31672b(mo29395g());
    }

    public Collection<V> values() {
        Collection<V> collection = this.f20934f0;
        if (collection != null) {
            return collection;
        }
        C7453c0 c0Var = new C7453c0(this);
        this.f20934f0 = c0Var;
        return c0Var;
    }

    /* access modifiers changed from: 0000 */
    @C2778d
    @C5966a("Segment.this")
    /* renamed from: a */
    public C7492r<K, V> mo29365a(C7492r<K, V> rVar, C7492r<K, V> rVar2) {
        return mo29377b(rVar.mo29450f()).mo29513a(rVar, rVar2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C7493s<K, V> mo29377b(int i) {
        return this.f20914N[(i >>> this.f20929b) & this.f20927a];
    }

    /* access modifiers changed from: 0000 */
    @C2778d
    /* renamed from: c */
    public boolean mo29384c(C7492r<K, V> rVar, long j) {
        return mo29377b(rVar.mo29450f()).mo29518a(rVar, j) != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public V mo29388d(K k) throws ExecutionException {
        return mo29370a(k, this.f20932d0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo29390e(@C5952h Object obj) {
        return m35811c(this.f20916P.mo29254c(obj));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo29393f(K k) {
        int e = mo29390e(C7397x.m35664a(k));
        mo29377b(e).mo29522a(k, e, this.f20932d0, false);
    }

    @C5966a("Segment.this")
    /* renamed from: c */
    static <K, V> void m35813c(C7492r<K, V> rVar, C7492r<K, V> rVar2) {
        rVar.mo29446c(rVar2);
        rVar2.mo29443a(rVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo29380b(C7492r<K, V> rVar, long j) {
        C7397x.m35664a(rVar);
        if (mo29391e() && j - rVar.mo29455k() >= this.f20922V) {
            return true;
        }
        if (!mo29394f() || j - rVar.mo29453h() < this.f20923W) {
            return false;
        }
        return true;
    }

    public boolean remove(@C5952h Object obj, @C5952h Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int e = mo29390e(obj);
        return mo29377b(e).mo29540a(obj, e, obj2);
    }

    /* access modifiers changed from: 0000 */
    @C2778d
    @C5966a("Segment.this")
    /* renamed from: a */
    public C7451b0<K, V> mo29364a(C7492r<K, V> rVar, V v, int i) {
        return this.f20919S.mo29571a(mo29377b(rVar.mo29450f()), rVar, C7397x.m35664a(v), i);
    }

    @C5966a("Segment.this")
    /* renamed from: c */
    static <K, V> void m35812c(C7492r<K, V> rVar) {
        C7492r u = m35815u();
        rVar.mo29446c(u);
        rVar.mo29443a(u);
    }

    public V replace(K k, V v) {
        C7397x.m35664a(k);
        C7397x.m35664a(v);
        int e = mo29390e(k);
        return mo29377b(e).mo29546b(k, e, v);
    }

    @C5966a("Segment.this")
    /* renamed from: b */
    static <K, V> void m35810b(C7492r<K, V> rVar, C7492r<K, V> rVar2) {
        rVar.mo29448d(rVar2);
        rVar2.mo29445b(rVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo29373a(C7451b0<K, V> b0Var) {
        C7492r b = b0Var.mo29422b();
        int f = b.mo29450f();
        mo29377b(f).mo29537a(b.getKey(), f, b0Var);
    }

    @C5966a("Segment.this")
    /* renamed from: b */
    static <K, V> void m35809b(C7492r<K, V> rVar) {
        C7492r u = m35815u();
        rVar.mo29448d(u);
        rVar.mo29445b(u);
    }

    @C5952h
    /* renamed from: c */
    public V mo29381c(Object obj) {
        int e = mo29390e(C7397x.m35664a(obj));
        V b = mo29377b(e).mo29543b(obj, e);
        if (b == null) {
            this.f20931c0.mo23198b(1);
        } else {
            this.f20931c0.mo23195a(1);
        }
        return b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo29374a(C7492r<K, V> rVar) {
        int f = rVar.mo29450f();
        mo29377b(f).mo29533a(rVar, f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C7493s<K, V> mo29367a(int i, long j, C7422b bVar) {
        C7493s sVar = new C7493s(this, i, j, bVar);
        return sVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C8302z2<K, V> mo29378b(Iterable<?> iterable) {
        LinkedHashMap e = C7800f4.m37347e();
        int i = 0;
        int i2 = 0;
        for (Object next : iterable) {
            Object obj = get(next);
            if (obj == null) {
                i2++;
            } else {
                e.put(next, obj);
                i++;
            }
        }
        this.f20931c0.mo23195a(i);
        this.f20931c0.mo23198b(i2);
        return C8302z2.m39622a(e);
    }

    /* access modifiers changed from: 0000 */
    @C5952h
    /* renamed from: a */
    public V mo29369a(C7492r<K, V> rVar, long j) {
        if (rVar.getKey() == null) {
            return null;
        }
        V v = rVar.mo29449e().get();
        if (v != null && !mo29380b(rVar, j)) {
            return v;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo29382c(Iterable<?> iterable) {
        for (Object remove : iterable) {
            remove(remove);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C7493s<K, V>[] mo29375a(int i) {
        return new C7493s[i];
    }

    /* renamed from: a */
    public void mo29372a() {
        for (C7493s<K, V> a : this.f20914N) {
            a.mo29525a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public V mo29370a(K k, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
        int e = mo29390e(C7397x.m35664a(k));
        return mo29377b(e).mo29521a(k, e, cacheLoader);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C7492r<K, V> mo29376b(@C5952h Object obj) {
        if (obj == null) {
            return null;
        }
        int e = mo29390e(obj);
        return mo29377b(e).mo29550c(obj, e);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:21|22|(2:25|23)|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r8 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0073, code lost:
        if (r8.hasNext() != false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
        r1 = r8.next();
        r3 = r3 - 1;
        r0.put(r1, mo29370a((K) r1, r7.f20932d0));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x006b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.common.collect.C8302z2<K, V> mo29368a(java.lang.Iterable<? extends K> r8) throws java.util.concurrent.ExecutionException {
        /*
            r7 = this;
            java.util.LinkedHashMap r0 = com.google.common.collect.C7800f4.m37347e()
            java.util.LinkedHashSet r1 = com.google.common.collect.C8047m5.m38535e()
            java.util.Iterator r8 = r8.iterator()
            r2 = 0
            r3 = 0
        L_0x000e:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x0030
            java.lang.Object r4 = r8.next()
            java.lang.Object r5 = r7.get(r4)
            boolean r6 = r0.containsKey(r4)
            if (r6 != 0) goto L_0x000e
            r0.put(r4, r5)
            if (r5 != 0) goto L_0x002d
            int r3 = r3 + 1
            r1.add(r4)
            goto L_0x000e
        L_0x002d:
            int r2 = r2 + 1
            goto L_0x000e
        L_0x0030:
            boolean r8 = r1.isEmpty()     // Catch:{ all -> 0x0094 }
            if (r8 != 0) goto L_0x0085
            com.google.common.cache.CacheLoader<? super K, V> r8 = r7.f20932d0     // Catch:{ d -> 0x006b }
            java.util.Map r8 = r7.mo29371a(r1, r8)     // Catch:{ d -> 0x006b }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ d -> 0x006b }
        L_0x0040:
            boolean r5 = r4.hasNext()     // Catch:{ d -> 0x006b }
            if (r5 == 0) goto L_0x0085
            java.lang.Object r5 = r4.next()     // Catch:{ d -> 0x006b }
            java.lang.Object r6 = r8.get(r5)     // Catch:{ d -> 0x006b }
            if (r6 == 0) goto L_0x0054
            r0.put(r5, r6)     // Catch:{ d -> 0x006b }
            goto L_0x0040
        L_0x0054:
            com.google.common.cache.CacheLoader$InvalidCacheLoadException r8 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException     // Catch:{ d -> 0x006b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ d -> 0x006b }
            r4.<init>()     // Catch:{ d -> 0x006b }
            java.lang.String r6 = "loadAll failed to return a value for "
            r4.append(r6)     // Catch:{ d -> 0x006b }
            r4.append(r5)     // Catch:{ d -> 0x006b }
            java.lang.String r4 = r4.toString()     // Catch:{ d -> 0x006b }
            r8.<init>(r4)     // Catch:{ d -> 0x006b }
            throw r8     // Catch:{ d -> 0x006b }
        L_0x006b:
            java.util.Iterator r8 = r1.iterator()     // Catch:{ all -> 0x0094 }
        L_0x006f:
            boolean r1 = r8.hasNext()     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x0085
            java.lang.Object r1 = r8.next()     // Catch:{ all -> 0x0094 }
            int r3 = r3 + -1
            com.google.common.cache.CacheLoader<? super K, V> r4 = r7.f20932d0     // Catch:{ all -> 0x0094 }
            java.lang.Object r4 = r7.mo29370a((K) r1, r4)     // Catch:{ all -> 0x0094 }
            r0.put(r1, r4)     // Catch:{ all -> 0x0094 }
            goto L_0x006f
        L_0x0085:
            com.google.common.collect.z2 r8 = com.google.common.collect.C8302z2.m39622a(r0)     // Catch:{ all -> 0x0094 }
            com.google.common.cache.a$b r0 = r7.f20931c0
            r0.mo23195a(r2)
            com.google.common.cache.a$b r0 = r7.f20931c0
            r0.mo23198b(r3)
            return r8
        L_0x0094:
            r8 = move-exception
            com.google.common.cache.a$b r0 = r7.f20931c0
            r0.mo23195a(r2)
            com.google.common.cache.a$b r0 = r7.f20931c0
            r0.mo23198b(r3)
            goto L_0x00a1
        L_0x00a0:
            throw r8
        L_0x00a1:
            goto L_0x00a0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.C7447j.mo29368a(java.lang.Iterable):com.google.common.collect.z2");
    }

    /* access modifiers changed from: 0000 */
    @C5952h
    /* renamed from: a */
    public Map<K, V> mo29371a(Set<? extends K> set, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
        C7397x.m35664a(cacheLoader);
        C7397x.m35664a(set);
        C7333e0 e = C7333e0.m35520e();
        boolean z = false;
        try {
            Map<K, V> a = cacheLoader.mo29319a((Iterable<? extends K>) set);
            if (a != null) {
                e.mo29211d();
                for (Entry entry : a.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (key == null || value == null) {
                        z = true;
                    } else {
                        put(key, value);
                    }
                }
                if (!z) {
                    this.f20931c0.mo23199b(e.mo29207a(TimeUnit.NANOSECONDS));
                    return a;
                }
                this.f20931c0.mo23196a(e.mo29207a(TimeUnit.NANOSECONDS));
                StringBuilder sb = new StringBuilder();
                sb.append(cacheLoader);
                sb.append(" returned null keys or values from loadAll");
                throw new InvalidCacheLoadException(sb.toString());
            }
            this.f20931c0.mo23196a(e.mo29207a(TimeUnit.NANOSECONDS));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cacheLoader);
            sb2.append(" returned null map from loadAll");
            throw new InvalidCacheLoadException(sb2.toString());
        } catch (C7419d e2) {
            throw e2;
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            throw new ExecutionException(e3);
        } catch (RuntimeException e4) {
            throw new UncheckedExecutionException((Throwable) e4);
        } catch (Exception e5) {
            throw new ExecutionException(e5);
        } catch (Error e6) {
            throw new C8566p(e6);
        } catch (Throwable th) {
            th = th;
            z = true;
        }
        if (!z) {
            this.f20931c0.mo23196a(e.mo29207a(TimeUnit.NANOSECONDS));
        }
        throw th;
    }
}
