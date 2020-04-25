package p195e.p196a.p199x0.p454e.p458d;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C12292n0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5930q0;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

@C5936e
/* renamed from: e.a.x0.e.d.l */
/* compiled from: ObservableSwitchMapSingle */
public final class C13127l<T, R> extends C5923b0<R> {

    /* renamed from: N */
    final boolean f37837N;

    /* renamed from: a */
    final C5923b0<T> f37838a;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5930q0<? extends R>> f37839b;

    /* renamed from: e.a.x0.e.d.l$a */
    /* compiled from: ObservableSwitchMapSingle */
    static final class C13128a<T, R> extends AtomicInteger implements C12280i0<T>, C12314c {

        /* renamed from: T */
        static final C13129a<Object> f37840T = new C13129a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* renamed from: N */
        final boolean f37841N;

        /* renamed from: O */
        final C13746c f37842O = new C13746c();

        /* renamed from: P */
        final AtomicReference<C13129a<R>> f37843P = new AtomicReference<>();

        /* renamed from: Q */
        C12314c f37844Q;

        /* renamed from: R */
        volatile boolean f37845R;

        /* renamed from: S */
        volatile boolean f37846S;

        /* renamed from: a */
        final C12280i0<? super R> f37847a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5930q0<? extends R>> f37848b;

        /* renamed from: e.a.x0.e.d.l$a$a */
        /* compiled from: ObservableSwitchMapSingle */
        static final class C13129a<R> extends AtomicReference<C12314c> implements C12292n0<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* renamed from: a */
            final C13128a<?, R> f37849a;

            /* renamed from: b */
            volatile R f37850b;

            C13129a(C13128a<?, R> aVar) {
                this.f37849a = aVar;
            }

            /* renamed from: a */
            public void mo41974a(C12314c cVar) {
                C12347d.m55468c(this, cVar);
            }

            public void onError(Throwable th) {
                this.f37849a.mo42656a(this, th);
            }

            public void onSuccess(R r) {
                this.f37850b = r;
                this.f37849a.mo42657e();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo42658a() {
                C12347d.m55465a((AtomicReference<C12314c>) this);
            }
        }

        C13128a(C12280i0<? super R> i0Var, C12339o<? super T, ? extends C5930q0<? extends R>> oVar, boolean z) {
            this.f37847a = i0Var;
            this.f37848b = oVar;
            this.f37841N = z;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f37844Q, cVar)) {
                this.f37844Q = cVar;
                this.f37847a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37846S;
        }

        public void dispose() {
            this.f37846S = true;
            this.f37844Q.dispose();
            mo42655a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42657e() {
            if (getAndIncrement() == 0) {
                C12280i0<? super R> i0Var = this.f37847a;
                C13746c cVar = this.f37842O;
                AtomicReference<C13129a<R>> atomicReference = this.f37843P;
                int i = 1;
                while (!this.f37846S) {
                    if (cVar.get() == null || this.f37841N) {
                        boolean z = this.f37845R;
                        C13129a aVar = (C13129a) atomicReference.get();
                        boolean z2 = aVar == null;
                        if (z && z2) {
                            Throwable d = cVar.mo43143d();
                            if (d != null) {
                                i0Var.onError(d);
                            } else {
                                i0Var.onComplete();
                            }
                            return;
                        } else if (z2 || aVar.f37850b == null) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            atomicReference.compareAndSet(aVar, null);
                            i0Var.mo33453a(aVar.f37850b);
                        }
                    } else {
                        i0Var.onError(cVar.mo43143d());
                        return;
                    }
                }
            }
        }

        public void onComplete() {
            this.f37845R = true;
            mo42657e();
        }

        public void onError(Throwable th) {
            if (this.f37842O.mo43142a(th)) {
                if (!this.f37841N) {
                    mo42655a();
                }
                this.f37845R = true;
                mo42657e();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            C13129a aVar = (C13129a) this.f37843P.get();
            if (aVar != null) {
                aVar.mo42658a();
            }
            try {
                C5930q0 q0Var = (C5930q0) C12390b.m55563a(this.f37848b.apply(t), "The mapper returned a null SingleSource");
                C13129a aVar2 = new C13129a(this);
                while (true) {
                    C13129a<Object> aVar3 = (C13129a) this.f37843P.get();
                    if (aVar3 != f37840T) {
                        if (this.f37843P.compareAndSet(aVar3, aVar2)) {
                            q0Var.mo24192a(aVar2);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f37844Q.dispose();
                this.f37843P.getAndSet(f37840T);
                onError(th);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42655a() {
            C13129a<Object> aVar = (C13129a) this.f37843P.getAndSet(f37840T);
            if (aVar != null && aVar != f37840T) {
                aVar.mo42658a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42656a(C13129a<R> aVar, Throwable th) {
            if (!this.f37843P.compareAndSet(aVar, null) || !this.f37842O.mo43142a(th)) {
                C12205a.m54894b(th);
                return;
            }
            if (!this.f37841N) {
                this.f37844Q.dispose();
                mo42655a();
            }
            mo42657e();
        }
    }

    public C13127l(C5923b0<T> b0Var, C12339o<? super T, ? extends C5930q0<? extends R>> oVar, boolean z) {
        this.f37838a = b0Var;
        this.f37839b = oVar;
        this.f37837N = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super R> i0Var) {
        if (!C13130m.m57221b(this.f37838a, this.f37839b, i0Var)) {
            this.f37838a.mo23893a((C12280i0<? super T>) new C13128a<Object>(i0Var, this.f37839b, this.f37837N));
        }
    }
}
