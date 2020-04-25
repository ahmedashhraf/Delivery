package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C12292n0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p452c.C12405n;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.b2 */
/* compiled from: ObservableMergeWithSingle */
public final class C13151b2<T> extends C13131a<T, T> {

    /* renamed from: b */
    final C5930q0<? extends T> f37918b;

    /* renamed from: e.a.x0.e.e.b2$a */
    /* compiled from: ObservableMergeWithSingle */
    static final class C13152a<T> extends AtomicInteger implements C12280i0<T>, C12314c {

        /* renamed from: U */
        static final int f37919U = 1;

        /* renamed from: V */
        static final int f37920V = 2;
        private static final long serialVersionUID = -4592979584110982903L;

        /* renamed from: N */
        final C13153a<T> f37921N = new C13153a<>(this);

        /* renamed from: O */
        final C13746c f37922O = new C13746c();

        /* renamed from: P */
        volatile C12405n<T> f37923P;

        /* renamed from: Q */
        T f37924Q;

        /* renamed from: R */
        volatile boolean f37925R;

        /* renamed from: S */
        volatile boolean f37926S;

        /* renamed from: T */
        volatile int f37927T;

        /* renamed from: a */
        final C12280i0<? super T> f37928a;

        /* renamed from: b */
        final AtomicReference<C12314c> f37929b = new AtomicReference<>();

        /* renamed from: e.a.x0.e.e.b2$a$a */
        /* compiled from: ObservableMergeWithSingle */
        static final class C13153a<T> extends AtomicReference<C12314c> implements C12292n0<T> {
            private static final long serialVersionUID = -2935427570954647017L;

            /* renamed from: a */
            final C13152a<T> f37930a;

            C13153a(C13152a<T> aVar) {
                this.f37930a = aVar;
            }

            /* renamed from: a */
            public void mo41974a(C12314c cVar) {
                C12347d.m55468c(this, cVar);
            }

            public void onError(Throwable th) {
                this.f37930a.mo42681a(th);
            }

            public void onSuccess(T t) {
                this.f37930a.mo42682b(t);
            }
        }

        C13152a(C12280i0<? super T> i0Var) {
            this.f37928a = i0Var;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            C12347d.m55468c(this.f37929b, cVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo42682b(T t) {
            if (compareAndSet(0, 1)) {
                this.f37928a.mo33453a(t);
                this.f37927T = 2;
            } else {
                this.f37924Q = t;
                this.f37927T = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            mo42683e();
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) this.f37929b.get());
        }

        public void dispose() {
            this.f37925R = true;
            C12347d.m55465a(this.f37929b);
            C12347d.m55465a((AtomicReference<C12314c>) this.f37921N);
            if (getAndIncrement() == 0) {
                this.f37923P = null;
                this.f37924Q = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42683e() {
            C12280i0<? super T> i0Var = this.f37928a;
            int i = 1;
            while (!this.f37925R) {
                if (this.f37922O.get() != null) {
                    this.f37924Q = null;
                    this.f37923P = null;
                    i0Var.onError(this.f37922O.mo43143d());
                    return;
                }
                int i2 = this.f37927T;
                if (i2 == 1) {
                    T t = this.f37924Q;
                    this.f37924Q = null;
                    this.f37927T = 2;
                    i0Var.mo33453a(t);
                    i2 = 2;
                }
                boolean z = this.f37926S;
                C12405n<T> nVar = this.f37923P;
                Object poll = nVar != null ? nVar.poll() : null;
                boolean z2 = poll == null;
                if (z && z2 && i2 == 2) {
                    this.f37923P = null;
                    i0Var.onComplete();
                    return;
                } else if (z2) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    i0Var.mo33453a(poll);
                }
            }
            this.f37924Q = null;
            this.f37923P = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public C12405n<T> mo42684f() {
            C12405n<T> nVar = this.f37923P;
            if (nVar != null) {
                return nVar;
            }
            C13663c cVar = new C13663c(C5923b0.m26088M());
            this.f37923P = cVar;
            return cVar;
        }

        public void onComplete() {
            this.f37926S = true;
            mo42680a();
        }

        public void onError(Throwable th) {
            if (this.f37922O.mo43142a(th)) {
                C12347d.m55465a(this.f37929b);
                mo42680a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (compareAndSet(0, 1)) {
                this.f37928a.mo33453a(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                mo42684f().offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            mo42683e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42681a(Throwable th) {
            if (this.f37922O.mo43142a(th)) {
                C12347d.m55465a(this.f37929b);
                mo42680a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42680a() {
            if (getAndIncrement() == 0) {
                mo42683e();
            }
        }
    }

    public C13151b2(C5923b0<T> b0Var, C5930q0<? extends T> q0Var) {
        super(b0Var);
        this.f37918b = q0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C13152a aVar = new C13152a(i0Var);
        i0Var.mo34123a((C12314c) aVar);
        this.f37851a.mo23893a(aVar);
        this.f37918b.mo24192a(aVar.f37921N);
    }
}
