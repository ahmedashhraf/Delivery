package p195e.p196a.p440c1;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C5929l;
import p195e.p196a.p198t0.C5935d;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p199x0.p465i.C13735c;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.c1.g */
/* compiled from: UnicastProcessor */
public final class C12223g<T> extends C12211c<T> {

    /* renamed from: N */
    final AtomicReference<Runnable> f35319N;

    /* renamed from: O */
    final boolean f35320O;

    /* renamed from: P */
    volatile boolean f35321P;

    /* renamed from: Q */
    Throwable f35322Q;

    /* renamed from: R */
    final AtomicReference<C14062c<? super T>> f35323R;

    /* renamed from: S */
    volatile boolean f35324S;

    /* renamed from: T */
    final AtomicBoolean f35325T;

    /* renamed from: U */
    final C13735c<T> f35326U;

    /* renamed from: V */
    final AtomicLong f35327V;

    /* renamed from: W */
    boolean f35328W;

    /* renamed from: b */
    final C13663c<T> f35329b;

    /* renamed from: e.a.c1.g$a */
    /* compiled from: UnicastProcessor */
    final class C12224a extends C13735c<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        C12224a() {
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            C12223g.this.f35328W = true;
            return 2;
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(C12223g.this.f35327V, j);
                C12223g.this.mo41852a0();
            }
        }

        public void cancel() {
            if (!C12223g.this.f35324S) {
                C12223g gVar = C12223g.this;
                gVar.f35324S = true;
                gVar.mo41850Z();
                C12223g gVar2 = C12223g.this;
                if (!gVar2.f35328W && gVar2.f35326U.getAndIncrement() == 0) {
                    C12223g.this.f35329b.clear();
                    C12223g.this.f35323R.lazySet(null);
                }
            }
        }

        public void clear() {
            C12223g.this.f35329b.clear();
        }

        public boolean isEmpty() {
            return C12223g.this.f35329b.isEmpty();
        }

        @C5938g
        public T poll() {
            return C12223g.this.f35329b.poll();
        }
    }

    C12223g(int i) {
        this(i, null, true);
    }

    @C5935d
    @C5937f
    /* renamed from: a */
    public static <T> C12223g<T> m55067a(int i, Runnable runnable) {
        C12390b.m55563a(runnable, "onTerminate");
        return new C12223g<>(i, runnable);
    }

    @C5936e
    @C5935d
    @C5937f
    /* renamed from: b */
    public static <T> C12223g<T> m55069b(boolean z) {
        return new C12223g<>(C5929l.m26793R(), null, z);
    }

    @C5935d
    @C5937f
    /* renamed from: b0 */
    public static <T> C12223g<T> m55070b0() {
        return new C12223g<>(C5929l.m26793R());
    }

    @C5935d
    @C5937f
    /* renamed from: m */
    public static <T> C12223g<T> m55071m(int i) {
        return new C12223g<>(i);
    }

    @C5938g
    /* renamed from: U */
    public Throwable mo41783U() {
        if (this.f35321P) {
            return this.f35322Q;
        }
        return null;
    }

    /* renamed from: V */
    public boolean mo41784V() {
        return this.f35321P && this.f35322Q == null;
    }

    /* renamed from: W */
    public boolean mo41785W() {
        return this.f35323R.get() != null;
    }

    /* renamed from: X */
    public boolean mo41786X() {
        return this.f35321P && this.f35322Q != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Z */
    public void mo41850Z() {
        Runnable runnable = (Runnable) this.f35319N.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a0 */
    public void mo41852a0() {
        if (this.f35326U.getAndIncrement() == 0) {
            int i = 1;
            C14062c cVar = (C14062c) this.f35323R.get();
            while (cVar == null) {
                i = this.f35326U.addAndGet(-i);
                if (i != 0) {
                    cVar = (C14062c) this.f35323R.get();
                } else {
                    return;
                }
            }
            if (this.f35328W) {
                mo41853g(cVar);
            } else {
                mo41854h(cVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        if (this.f35325T.get() || !this.f35325T.compareAndSet(false, true)) {
            C13739g.m58655a((Throwable) new IllegalStateException("This processor allows only a single Subscriber"), cVar);
            return;
        }
        cVar.mo41788a((C14063d) this.f35326U);
        this.f35323R.set(cVar);
        if (this.f35324S) {
            this.f35323R.lazySet(null);
        } else {
            mo41852a0();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo41853g(C14062c<? super T> cVar) {
        C13663c<T> cVar2 = this.f35329b;
        int i = 1;
        boolean z = !this.f35320O;
        while (!this.f35324S) {
            boolean z2 = this.f35321P;
            if (!z || !z2 || this.f35322Q == null) {
                cVar.mo41789a(null);
                if (z2) {
                    this.f35323R.lazySet(null);
                    Throwable th = this.f35322Q;
                    if (th != null) {
                        cVar.onError(th);
                    } else {
                        cVar.onComplete();
                    }
                    return;
                }
                i = this.f35326U.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                cVar2.clear();
                this.f35323R.lazySet(null);
                cVar.onError(this.f35322Q);
                return;
            }
        }
        cVar2.clear();
        this.f35323R.lazySet(null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo41854h(C14062c<? super T> cVar) {
        long j;
        C13663c<T> cVar2 = this.f35329b;
        boolean z = !this.f35320O;
        int i = 1;
        do {
            long j2 = this.f35327V.get();
            long j3 = 0;
            while (true) {
                if (j2 == j3) {
                    j = j3;
                    break;
                }
                boolean z2 = this.f35321P;
                Object poll = cVar2.poll();
                boolean z3 = poll == null;
                j = j3;
                if (!mo41851a(z, z2, z3, cVar, cVar2)) {
                    if (z3) {
                        break;
                    }
                    cVar.mo41789a(poll);
                    j3 = 1 + j;
                } else {
                    return;
                }
            }
            C14062c<? super T> cVar3 = cVar;
            if (j2 == j) {
                if (mo41851a(z, this.f35321P, cVar2.isEmpty(), cVar, cVar2)) {
                    return;
                }
            }
            if (!(j == 0 || j2 == Long.MAX_VALUE)) {
                this.f35327V.addAndGet(-j);
            }
            i = this.f35326U.addAndGet(-i);
        } while (i != 0);
    }

    public void onComplete() {
        if (!this.f35321P && !this.f35324S) {
            this.f35321P = true;
            mo41850Z();
            mo41852a0();
        }
    }

    public void onError(Throwable th) {
        C12390b.m55563a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f35321P || this.f35324S) {
            C12205a.m54894b(th);
            return;
        }
        this.f35322Q = th;
        this.f35321P = true;
        mo41850Z();
        mo41852a0();
    }

    C12223g(int i, Runnable runnable) {
        this(i, runnable, true);
    }

    C12223g(int i, Runnable runnable, boolean z) {
        this.f35329b = new C13663c<>(C12390b.m55558a(i, "capacityHint"));
        this.f35319N = new AtomicReference<>(runnable);
        this.f35320O = z;
        this.f35323R = new AtomicReference<>();
        this.f35325T = new AtomicBoolean();
        this.f35326U = new C12224a();
        this.f35327V = new AtomicLong();
    }

    @C5936e
    @C5935d
    @C5937f
    /* renamed from: a */
    public static <T> C12223g<T> m55068a(int i, Runnable runnable, boolean z) {
        C12390b.m55563a(runnable, "onTerminate");
        return new C12223g<>(i, runnable, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo41851a(boolean z, boolean z2, boolean z3, C14062c<? super T> cVar, C13663c<T> cVar2) {
        if (this.f35324S) {
            cVar2.clear();
            this.f35323R.lazySet(null);
            return true;
        }
        if (z2) {
            if (z && this.f35322Q != null) {
                cVar2.clear();
                this.f35323R.lazySet(null);
                cVar.onError(this.f35322Q);
                return true;
            } else if (z3) {
                Throwable th = this.f35322Q;
                this.f35323R.lazySet(null);
                if (th != null) {
                    cVar.onError(th);
                } else {
                    cVar.onComplete();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo41788a(C14063d dVar) {
        if (this.f35321P || this.f35324S) {
            dVar.cancel();
        } else {
            dVar.mo41813c(Long.MAX_VALUE);
        }
    }

    /* renamed from: a */
    public void mo41789a(T t) {
        C12390b.m55563a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f35321P && !this.f35324S) {
            this.f35329b.offer(t);
            mo41852a0();
        }
    }
}
