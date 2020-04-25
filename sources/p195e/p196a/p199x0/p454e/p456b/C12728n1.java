package p195e.p196a.p199x0.p454e.p456b;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p200j.C13751h;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p199x0.p465i.C13735c;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p448v0.C12323b;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.n1 */
/* compiled from: FlowableGroupBy */
public final class C12728n1<T, K, V> extends C12511a<T, C12323b<K, V>> {

    /* renamed from: N */
    final C12339o<? super T, ? extends K> f36502N;

    /* renamed from: O */
    final C12339o<? super T, ? extends V> f36503O;

    /* renamed from: P */
    final int f36504P;

    /* renamed from: Q */
    final boolean f36505Q;

    /* renamed from: R */
    final C12339o<? super C12331g<Object>, ? extends Map<K, Object>> f36506R;

    /* renamed from: e.a.x0.e.b.n1$a */
    /* compiled from: FlowableGroupBy */
    static final class C12729a<K, V> implements C12331g<C12731c<K, V>> {

        /* renamed from: a */
        final Queue<C12731c<K, V>> f36507a;

        C12729a(Queue<C12731c<K, V>> queue) {
            this.f36507a = queue;
        }

        /* renamed from: a */
        public void mo33410c(C12731c<K, V> cVar) {
            this.f36507a.offer(cVar);
        }
    }

    /* renamed from: e.a.x0.e.b.n1$b */
    /* compiled from: FlowableGroupBy */
    public static final class C12730b<T, K, V> extends C13735c<C12323b<K, V>> implements C12297q<T> {

        /* renamed from: a0 */
        static final Object f36508a0 = new Object();
        private static final long serialVersionUID = -3688291656102519502L;

        /* renamed from: N */
        final C12339o<? super T, ? extends V> f36509N;

        /* renamed from: O */
        final int f36510O;

        /* renamed from: P */
        final boolean f36511P;

        /* renamed from: Q */
        final Map<Object, C12731c<K, V>> f36512Q;

        /* renamed from: R */
        final C13663c<C12323b<K, V>> f36513R;

        /* renamed from: S */
        final Queue<C12731c<K, V>> f36514S;

        /* renamed from: T */
        C14063d f36515T;

        /* renamed from: U */
        final AtomicBoolean f36516U = new AtomicBoolean();

        /* renamed from: V */
        final AtomicLong f36517V = new AtomicLong();

        /* renamed from: W */
        final AtomicInteger f36518W = new AtomicInteger(1);

        /* renamed from: X */
        Throwable f36519X;

        /* renamed from: Y */
        volatile boolean f36520Y;

        /* renamed from: Z */
        boolean f36521Z;

        /* renamed from: a */
        final C14062c<? super C12323b<K, V>> f36522a;

        /* renamed from: b */
        final C12339o<? super T, ? extends K> f36523b;

        public C12730b(C14062c<? super C12323b<K, V>> cVar, C12339o<? super T, ? extends K> oVar, C12339o<? super T, ? extends V> oVar2, int i, boolean z, Map<Object, C12731c<K, V>> map, Queue<C12731c<K, V>> queue) {
            this.f36522a = cVar;
            this.f36523b = oVar;
            this.f36509N = oVar2;
            this.f36510O = i;
            this.f36511P = z;
            this.f36512Q = map;
            this.f36514S = queue;
            this.f36513R = new C13663c<>(i);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36515T, dVar)) {
                this.f36515T = dVar;
                this.f36522a.mo41788a((C14063d) this);
                dVar.mo41813c((long) this.f36510O);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f36517V, j);
                mo42381a();
            }
        }

        public void cancel() {
            if (this.f36516U.compareAndSet(false, true) && this.f36518W.decrementAndGet() == 0) {
                this.f36515T.cancel();
            }
        }

        public void clear() {
            this.f36513R.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42384d() {
            C13663c<C12323b<K, V>> cVar = this.f36513R;
            C14062c<? super C12323b<K, V>> cVar2 = this.f36522a;
            int i = 1;
            while (!this.f36516U.get()) {
                boolean z = this.f36520Y;
                if (z && !this.f36511P) {
                    Throwable th = this.f36519X;
                    if (th != null) {
                        cVar.clear();
                        cVar2.onError(th);
                        return;
                    }
                }
                cVar2.mo41789a(null);
                if (z) {
                    Throwable th2 = this.f36519X;
                    if (th2 != null) {
                        cVar2.onError(th2);
                    } else {
                        cVar2.onComplete();
                    }
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            cVar.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42385e() {
            C13663c<C12323b<K, V>> cVar = this.f36513R;
            C14062c<? super C12323b<K, V>> cVar2 = this.f36522a;
            int i = 1;
            do {
                long j = this.f36517V.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.f36520Y;
                    C12323b bVar = (C12323b) cVar.poll();
                    boolean z2 = bVar == null;
                    if (!mo42382a(z, z2, cVar2, cVar)) {
                        if (z2) {
                            break;
                        }
                        cVar2.mo41789a(bVar);
                        j2++;
                    } else {
                        return;
                    }
                }
                if (j2 != j || !mo42382a(this.f36520Y, cVar.isEmpty(), cVar2, cVar)) {
                    if (j2 != 0) {
                        if (j != Long.MAX_VALUE) {
                            this.f36517V.addAndGet(-j2);
                        }
                        this.f36515T.mo41813c(j2);
                    }
                    i = addAndGet(-i);
                } else {
                    return;
                }
            } while (i != 0);
        }

        public boolean isEmpty() {
            return this.f36513R.isEmpty();
        }

        public void onComplete() {
            if (!this.f36520Y) {
                for (C12731c onComplete : this.f36512Q.values()) {
                    onComplete.onComplete();
                }
                this.f36512Q.clear();
                Queue<C12731c<K, V>> queue = this.f36514S;
                if (queue != null) {
                    queue.clear();
                }
                this.f36520Y = true;
                mo42381a();
            }
        }

        public void onError(Throwable th) {
            if (this.f36520Y) {
                C12205a.m54894b(th);
                return;
            }
            for (C12731c onError : this.f36512Q.values()) {
                onError.onError(th);
            }
            this.f36512Q.clear();
            Queue<C12731c<K, V>> queue = this.f36514S;
            if (queue != null) {
                queue.clear();
            }
            this.f36519X = th;
            this.f36520Y = true;
            mo42381a();
        }

        @C5938g
        public C12323b<K, V> poll() {
            return (C12323b) this.f36513R.poll();
        }

        /* renamed from: c */
        public void mo42383c(K k) {
            if (k == null) {
                k = f36508a0;
            }
            this.f36512Q.remove(k);
            if (this.f36518W.decrementAndGet() == 0) {
                this.f36515T.cancel();
                if (getAndIncrement() == 0) {
                    this.f36513R.clear();
                }
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            Object obj;
            if (!this.f36520Y) {
                C13663c<C12323b<K, V>> cVar = this.f36513R;
                try {
                    Object apply = this.f36523b.apply(t);
                    boolean z = false;
                    if (apply != null) {
                        obj = apply;
                    } else {
                        obj = f36508a0;
                    }
                    C12731c cVar2 = (C12731c) this.f36512Q.get(obj);
                    if (cVar2 == null) {
                        if (!this.f36516U.get()) {
                            cVar2 = C12731c.m56304a(apply, this.f36510O, this, this.f36511P);
                            this.f36512Q.put(obj, cVar2);
                            this.f36518W.getAndIncrement();
                            z = true;
                        } else {
                            return;
                        }
                    }
                    try {
                        cVar2.mo42386a(C12390b.m55563a(this.f36509N.apply(t), "The valueSelector returned null"));
                        if (this.f36514S != null) {
                            while (true) {
                                C12731c cVar3 = (C12731c) this.f36514S.poll();
                                if (cVar3 == null) {
                                    break;
                                }
                                cVar3.onComplete();
                            }
                        }
                        if (z) {
                            cVar.offer(cVar2);
                            mo42381a();
                        }
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        this.f36515T.cancel();
                        onError(th);
                    }
                } catch (Throwable th2) {
                    C14398a.m62357b(th2);
                    this.f36515T.cancel();
                    onError(th2);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42381a() {
            if (getAndIncrement() == 0) {
                if (this.f36521Z) {
                    mo42384d();
                } else {
                    mo42385e();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42382a(boolean z, boolean z2, C14062c<?> cVar, C13663c<?> cVar2) {
            if (this.f36516U.get()) {
                cVar2.clear();
                return true;
            }
            if (this.f36511P) {
                if (z && z2) {
                    Throwable th = this.f36519X;
                    if (th != null) {
                        cVar.onError(th);
                    } else {
                        cVar.onComplete();
                    }
                    return true;
                }
            } else if (z) {
                Throwable th2 = this.f36519X;
                if (th2 != null) {
                    cVar2.clear();
                    cVar.onError(th2);
                    return true;
                } else if (z2) {
                    cVar.onComplete();
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f36521Z = true;
            return 2;
        }
    }

    /* renamed from: e.a.x0.e.b.n1$c */
    /* compiled from: FlowableGroupBy */
    static final class C12731c<K, T> extends C12323b<K, T> {

        /* renamed from: N */
        final C12732d<T, K> f36524N;

        protected C12731c(K k, C12732d<T, K> dVar) {
            super(k);
            this.f36524N = dVar;
        }

        /* renamed from: a */
        public static <T, K> C12731c<K, T> m56304a(K k, int i, C12730b<?, K, T> bVar, boolean z) {
            return new C12731c<>(k, new C12732d(i, bVar, k, z));
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo24499e(C14062c<? super T> cVar) {
            this.f36524N.mo24397a(cVar);
        }

        public void onComplete() {
            this.f36524N.onComplete();
        }

        public void onError(Throwable th) {
            this.f36524N.onError(th);
        }

        /* renamed from: a */
        public void mo42386a(T t) {
            this.f36524N.mo42390a(t);
        }
    }

    /* renamed from: e.a.x0.e.b.n1$d */
    /* compiled from: FlowableGroupBy */
    static final class C12732d<T, K> extends C13735c<T> implements C6007b<T> {
        private static final long serialVersionUID = -3852313036005250360L;

        /* renamed from: N */
        final C12730b<?, K, T> f36525N;

        /* renamed from: O */
        final boolean f36526O;

        /* renamed from: P */
        final AtomicLong f36527P = new AtomicLong();

        /* renamed from: Q */
        volatile boolean f36528Q;

        /* renamed from: R */
        Throwable f36529R;

        /* renamed from: S */
        final AtomicBoolean f36530S = new AtomicBoolean();

        /* renamed from: T */
        final AtomicReference<C14062c<? super T>> f36531T = new AtomicReference<>();

        /* renamed from: U */
        final AtomicBoolean f36532U = new AtomicBoolean();

        /* renamed from: V */
        boolean f36533V;

        /* renamed from: W */
        int f36534W;

        /* renamed from: a */
        final K f36535a;

        /* renamed from: b */
        final C13663c<T> f36536b;

        C12732d(int i, C12730b<?, K, T> bVar, K k, boolean z) {
            this.f36536b = new C13663c<>(i);
            this.f36525N = bVar;
            this.f36535a = k;
            this.f36526O = z;
        }

        /* renamed from: a */
        public void mo24397a(C14062c<? super T> cVar) {
            if (this.f36532U.compareAndSet(false, true)) {
                cVar.mo41788a((C14063d) this);
                this.f36531T.lazySet(cVar);
                mo42389a();
                return;
            }
            C13739g.m58655a((Throwable) new IllegalStateException("Only one Subscriber allowed!"), cVar);
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f36527P, j);
                mo42389a();
            }
        }

        public void cancel() {
            if (this.f36530S.compareAndSet(false, true)) {
                this.f36525N.mo42383c(this.f36535a);
            }
        }

        public void clear() {
            this.f36536b.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42392d() {
            C13663c<T> cVar = this.f36536b;
            C14062c cVar2 = (C14062c) this.f36531T.get();
            int i = 1;
            while (true) {
                if (cVar2 != null) {
                    if (this.f36530S.get()) {
                        cVar.clear();
                        return;
                    }
                    boolean z = this.f36528Q;
                    if (z && !this.f36526O) {
                        Throwable th = this.f36529R;
                        if (th != null) {
                            cVar.clear();
                            cVar2.onError(th);
                            return;
                        }
                    }
                    cVar2.mo41789a(null);
                    if (z) {
                        Throwable th2 = this.f36529R;
                        if (th2 != null) {
                            cVar2.onError(th2);
                        } else {
                            cVar2.onComplete();
                        }
                        return;
                    }
                }
                i = addAndGet(-i);
                if (i != 0) {
                    if (cVar2 == null) {
                        cVar2 = (C14062c) this.f36531T.get();
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42393e() {
            C13663c<T> cVar = this.f36536b;
            boolean z = this.f36526O;
            C14062c cVar2 = (C14062c) this.f36531T.get();
            int i = 1;
            while (true) {
                if (cVar2 != null) {
                    long j = this.f36527P.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z2 = this.f36528Q;
                        Object poll = cVar.poll();
                        boolean z3 = poll == null;
                        if (!mo42391a(z2, z3, cVar2, z)) {
                            if (z3) {
                                break;
                            }
                            cVar2.mo41789a(poll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 == j && mo42391a(this.f36528Q, cVar.isEmpty(), cVar2, z)) {
                        return;
                    }
                    if (j2 != 0) {
                        if (j != Long.MAX_VALUE) {
                            this.f36527P.addAndGet(-j2);
                        }
                        this.f36525N.f36515T.mo41813c(j2);
                    }
                }
                i = addAndGet(-i);
                if (i != 0) {
                    if (cVar2 == null) {
                        cVar2 = (C14062c) this.f36531T.get();
                    }
                } else {
                    return;
                }
            }
        }

        public boolean isEmpty() {
            return this.f36536b.isEmpty();
        }

        public void onComplete() {
            this.f36528Q = true;
            mo42389a();
        }

        public void onError(Throwable th) {
            this.f36529R = th;
            this.f36528Q = true;
            mo42389a();
        }

        @C5938g
        public T poll() {
            T poll = this.f36536b.poll();
            if (poll != null) {
                this.f36534W++;
                return poll;
            }
            int i = this.f36534W;
            if (i != 0) {
                this.f36534W = 0;
                this.f36525N.f36515T.mo41813c((long) i);
            }
            return null;
        }

        /* renamed from: a */
        public void mo42390a(T t) {
            this.f36536b.offer(t);
            mo42389a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42389a() {
            if (getAndIncrement() == 0) {
                if (this.f36533V) {
                    mo42392d();
                } else {
                    mo42393e();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42391a(boolean z, boolean z2, C14062c<? super T> cVar, boolean z3) {
            if (this.f36530S.get()) {
                this.f36536b.clear();
                return true;
            }
            if (z) {
                if (!z3) {
                    Throwable th = this.f36529R;
                    if (th != null) {
                        this.f36536b.clear();
                        cVar.onError(th);
                        return true;
                    } else if (z2) {
                        cVar.onComplete();
                        return true;
                    }
                } else if (z2) {
                    Throwable th2 = this.f36529R;
                    if (th2 != null) {
                        cVar.onError(th2);
                    } else {
                        cVar.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f36533V = true;
            return 2;
        }
    }

    public C12728n1(C5929l<T> lVar, C12339o<? super T, ? extends K> oVar, C12339o<? super T, ? extends V> oVar2, int i, boolean z, C12339o<? super C12331g<Object>, ? extends Map<K, Object>> oVar3) {
        super(lVar);
        this.f36502N = oVar;
        this.f36503O = oVar2;
        this.f36504P = i;
        this.f36505Q = z;
        this.f36506R = oVar3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super C12323b<K, V>> cVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Map map;
        try {
            if (this.f36506R == null) {
                concurrentLinkedQueue = null;
                map = new ConcurrentHashMap();
            } else {
                concurrentLinkedQueue = new ConcurrentLinkedQueue();
                map = (Map) this.f36506R.apply(new C12729a(concurrentLinkedQueue));
            }
            C12730b bVar = new C12730b(cVar, this.f36502N, this.f36503O, this.f36504P, this.f36505Q, map, concurrentLinkedQueue);
            this.f35814b.mo24393a((C12297q<? super T>) bVar);
        } catch (Exception e) {
            C14398a.m62357b(e);
            cVar.mo41788a((C14063d) C13751h.INSTANCE);
            cVar.onError(e);
        }
    }
}
