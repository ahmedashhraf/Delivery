package p195e.p196a.p199x0.p454e.p459e;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p195e.p196a.p466y0.C13773b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.j1 */
/* compiled from: ObservableGroupBy */
public final class C13268j1<T, K, V> extends C13131a<T, C13773b<K, V>> {

    /* renamed from: N */
    final C12339o<? super T, ? extends V> f38320N;

    /* renamed from: O */
    final int f38321O;

    /* renamed from: P */
    final boolean f38322P;

    /* renamed from: b */
    final C12339o<? super T, ? extends K> f38323b;

    /* renamed from: e.a.x0.e.e.j1$a */
    /* compiled from: ObservableGroupBy */
    public static final class C13269a<T, K, V> extends AtomicInteger implements C12280i0<T>, C12314c {

        /* renamed from: T */
        static final Object f38324T = new Object();
        private static final long serialVersionUID = -3688291656102519502L;

        /* renamed from: N */
        final C12339o<? super T, ? extends V> f38325N;

        /* renamed from: O */
        final int f38326O;

        /* renamed from: P */
        final boolean f38327P;

        /* renamed from: Q */
        final Map<Object, C13270b<K, V>> f38328Q;

        /* renamed from: R */
        C12314c f38329R;

        /* renamed from: S */
        final AtomicBoolean f38330S = new AtomicBoolean();

        /* renamed from: a */
        final C12280i0<? super C13773b<K, V>> f38331a;

        /* renamed from: b */
        final C12339o<? super T, ? extends K> f38332b;

        public C13269a(C12280i0<? super C13773b<K, V>> i0Var, C12339o<? super T, ? extends K> oVar, C12339o<? super T, ? extends V> oVar2, int i, boolean z) {
            this.f38331a = i0Var;
            this.f38332b = oVar;
            this.f38325N = oVar2;
            this.f38326O = i;
            this.f38327P = z;
            this.f38328Q = new ConcurrentHashMap();
            lazySet(1);
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38329R, cVar)) {
                this.f38329R = cVar;
                this.f38331a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: b */
        public void mo42768b(K k) {
            if (k == null) {
                k = f38324T;
            }
            this.f38328Q.remove(k);
            if (decrementAndGet() == 0) {
                this.f38329R.dispose();
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38330S.get();
        }

        public void dispose() {
            if (this.f38330S.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.f38329R.dispose();
            }
        }

        public void onComplete() {
            ArrayList<C13270b> arrayList = new ArrayList<>(this.f38328Q.values());
            this.f38328Q.clear();
            for (C13270b onComplete : arrayList) {
                onComplete.onComplete();
            }
            this.f38331a.onComplete();
        }

        public void onError(Throwable th) {
            ArrayList<C13270b> arrayList = new ArrayList<>(this.f38328Q.values());
            this.f38328Q.clear();
            for (C13270b onError : arrayList) {
                onError.onError(th);
            }
            this.f38331a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            Object obj;
            try {
                Object apply = this.f38332b.apply(t);
                if (apply != null) {
                    obj = apply;
                } else {
                    obj = f38324T;
                }
                C13270b bVar = (C13270b) this.f38328Q.get(obj);
                if (bVar == null) {
                    if (!this.f38330S.get()) {
                        bVar = C13270b.m57537a(apply, this.f38326O, this, this.f38327P);
                        this.f38328Q.put(obj, bVar);
                        getAndIncrement();
                        this.f38331a.mo33453a(bVar);
                    } else {
                        return;
                    }
                }
                try {
                    bVar.mo42769a(C12390b.m55563a(this.f38325N.apply(t), "The value supplied is null"));
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f38329R.dispose();
                    onError(th);
                }
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                this.f38329R.dispose();
                onError(th2);
            }
        }
    }

    /* renamed from: e.a.x0.e.e.j1$b */
    /* compiled from: ObservableGroupBy */
    static final class C13270b<K, T> extends C13773b<K, T> {

        /* renamed from: b */
        final C13271c<T, K> f38333b;

        protected C13270b(K k, C13271c<T, K> cVar) {
            super(k);
            this.f38333b = cVar;
        }

        /* renamed from: a */
        public static <T, K> C13270b<K, T> m57537a(K k, int i, C13269a<?, K, T> aVar, boolean z) {
            return new C13270b<>(k, new C13271c(i, aVar, k, z));
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo23995e(C12280i0<? super T> i0Var) {
            this.f38333b.mo23893a(i0Var);
        }

        public void onComplete() {
            this.f38333b.mo42776e();
        }

        public void onError(Throwable th) {
            this.f38333b.mo42774a(th);
        }

        /* renamed from: a */
        public void mo42769a(T t) {
            this.f38333b.mo42773a(t);
        }
    }

    /* renamed from: e.a.x0.e.e.j1$c */
    /* compiled from: ObservableGroupBy */
    static final class C13271c<T, K> extends AtomicInteger implements C12314c, C5926g0<T> {
        private static final long serialVersionUID = -3852313036005250360L;

        /* renamed from: N */
        final C13269a<?, K, T> f38334N;

        /* renamed from: O */
        final boolean f38335O;

        /* renamed from: P */
        volatile boolean f38336P;

        /* renamed from: Q */
        Throwable f38337Q;

        /* renamed from: R */
        final AtomicBoolean f38338R = new AtomicBoolean();

        /* renamed from: S */
        final AtomicBoolean f38339S = new AtomicBoolean();

        /* renamed from: T */
        final AtomicReference<C12280i0<? super T>> f38340T = new AtomicReference<>();

        /* renamed from: a */
        final K f38341a;

        /* renamed from: b */
        final C13663c<T> f38342b;

        C13271c(int i, C13269a<?, K, T> aVar, K k, boolean z) {
            this.f38342b = new C13663c<>(i);
            this.f38334N = aVar;
            this.f38341a = k;
            this.f38335O = z;
        }

        /* renamed from: a */
        public void mo23893a(C12280i0<? super T> i0Var) {
            if (this.f38339S.compareAndSet(false, true)) {
                i0Var.mo34123a((C12314c) this);
                this.f38340T.lazySet(i0Var);
                if (this.f38338R.get()) {
                    this.f38340T.lazySet(null);
                } else {
                    mo42772a();
                }
            } else {
                C12348e.m55476a((Throwable) new IllegalStateException("Only one Observer allowed!"), i0Var);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38338R.get();
        }

        public void dispose() {
            if (this.f38338R.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.f38340T.lazySet(null);
                this.f38334N.mo42768b(this.f38341a);
            }
        }

        /* renamed from: e */
        public void mo42776e() {
            this.f38336P = true;
            mo42772a();
        }

        /* renamed from: a */
        public void mo42773a(T t) {
            this.f38342b.offer(t);
            mo42772a();
        }

        /* renamed from: a */
        public void mo42774a(Throwable th) {
            this.f38337Q = th;
            this.f38336P = true;
            mo42772a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42772a() {
            if (getAndIncrement() == 0) {
                C13663c<T> cVar = this.f38342b;
                boolean z = this.f38335O;
                C12280i0 i0Var = (C12280i0) this.f38340T.get();
                int i = 1;
                while (true) {
                    if (i0Var != null) {
                        while (true) {
                            boolean z2 = this.f38336P;
                            Object poll = cVar.poll();
                            boolean z3 = poll == null;
                            if (!mo42775a(z2, z3, i0Var, z)) {
                                if (z3) {
                                    break;
                                }
                                i0Var.mo33453a(poll);
                            } else {
                                return;
                            }
                        }
                    }
                    i = addAndGet(-i);
                    if (i != 0) {
                        if (i0Var == null) {
                            i0Var = (C12280i0) this.f38340T.get();
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42775a(boolean z, boolean z2, C12280i0<? super T> i0Var, boolean z3) {
            if (this.f38338R.get()) {
                this.f38342b.clear();
                this.f38334N.mo42768b(this.f38341a);
                this.f38340T.lazySet(null);
                return true;
            }
            if (z) {
                if (!z3) {
                    Throwable th = this.f38337Q;
                    if (th != null) {
                        this.f38342b.clear();
                        this.f38340T.lazySet(null);
                        i0Var.onError(th);
                        return true;
                    } else if (z2) {
                        this.f38340T.lazySet(null);
                        i0Var.onComplete();
                        return true;
                    }
                } else if (z2) {
                    Throwable th2 = this.f38337Q;
                    this.f38340T.lazySet(null);
                    if (th2 != null) {
                        i0Var.onError(th2);
                    } else {
                        i0Var.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public C13268j1(C5926g0<T> g0Var, C12339o<? super T, ? extends K> oVar, C12339o<? super T, ? extends V> oVar2, int i, boolean z) {
        super(g0Var);
        this.f38323b = oVar;
        this.f38320N = oVar2;
        this.f38321O = i;
        this.f38322P = z;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super C13773b<K, V>> i0Var) {
        C5926g0<T> g0Var = this.f37851a;
        C13269a aVar = new C13269a(i0Var, this.f38323b, this.f38320N, this.f38321O, this.f38322P);
        g0Var.mo23893a(aVar);
    }
}
