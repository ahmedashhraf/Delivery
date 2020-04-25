package p195e.p196a.p199x0.p454e.p458d;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12292n0;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.C5930q0;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

@C5936e
/* renamed from: e.a.x0.e.d.f */
/* compiled from: FlowableSwitchMapSingle */
public final class C13109f<T, R> extends C5929l<R> {

    /* renamed from: N */
    final C12339o<? super T, ? extends C5930q0<? extends R>> f37741N;

    /* renamed from: O */
    final boolean f37742O;

    /* renamed from: b */
    final C5929l<T> f37743b;

    /* renamed from: e.a.x0.e.d.f$a */
    /* compiled from: FlowableSwitchMapSingle */
    static final class C13110a<T, R> extends AtomicInteger implements C12297q<T>, C14063d {

        /* renamed from: V */
        static final C13111a<Object> f37744V = new C13111a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* renamed from: N */
        final boolean f37745N;

        /* renamed from: O */
        final C13746c f37746O = new C13746c();

        /* renamed from: P */
        final AtomicLong f37747P = new AtomicLong();

        /* renamed from: Q */
        final AtomicReference<C13111a<R>> f37748Q = new AtomicReference<>();

        /* renamed from: R */
        C14063d f37749R;

        /* renamed from: S */
        volatile boolean f37750S;

        /* renamed from: T */
        volatile boolean f37751T;

        /* renamed from: U */
        long f37752U;

        /* renamed from: a */
        final C14062c<? super R> f37753a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5930q0<? extends R>> f37754b;

        /* renamed from: e.a.x0.e.d.f$a$a */
        /* compiled from: FlowableSwitchMapSingle */
        static final class C13111a<R> extends AtomicReference<C12314c> implements C12292n0<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* renamed from: a */
            final C13110a<?, R> f37755a;

            /* renamed from: b */
            volatile R f37756b;

            C13111a(C13110a<?, R> aVar) {
                this.f37755a = aVar;
            }

            /* renamed from: a */
            public void mo41974a(C12314c cVar) {
                C12347d.m55468c(this, cVar);
            }

            public void onError(Throwable th) {
                this.f37755a.mo42630a(this, th);
            }

            public void onSuccess(R r) {
                this.f37756b = r;
                this.f37755a.mo42631d();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo42632a() {
                C12347d.m55465a((AtomicReference<C12314c>) this);
            }
        }

        C13110a(C14062c<? super R> cVar, C12339o<? super T, ? extends C5930q0<? extends R>> oVar, boolean z) {
            this.f37753a = cVar;
            this.f37754b = oVar;
            this.f37745N = z;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f37749R, dVar)) {
                this.f37749R = dVar;
                this.f37753a.mo41788a((C14063d) this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            C13747d.m58696a(this.f37747P, j);
            mo42631d();
        }

        public void cancel() {
            this.f37751T = true;
            this.f37749R.cancel();
            mo42629a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42631d() {
            if (getAndIncrement() == 0) {
                C14062c<? super R> cVar = this.f37753a;
                C13746c cVar2 = this.f37746O;
                AtomicReference<C13111a<R>> atomicReference = this.f37748Q;
                AtomicLong atomicLong = this.f37747P;
                long j = this.f37752U;
                int i = 1;
                while (!this.f37751T) {
                    if (cVar2.get() == null || this.f37745N) {
                        boolean z = this.f37750S;
                        C13111a aVar = (C13111a) atomicReference.get();
                        boolean z2 = aVar == null;
                        if (z && z2) {
                            Throwable d = cVar2.mo43143d();
                            if (d != null) {
                                cVar.onError(d);
                            } else {
                                cVar.onComplete();
                            }
                            return;
                        } else if (z2 || aVar.f37756b == null || j == atomicLong.get()) {
                            this.f37752U = j;
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            atomicReference.compareAndSet(aVar, null);
                            cVar.mo41789a(aVar.f37756b);
                            j++;
                        }
                    } else {
                        cVar.onError(cVar2.mo43143d());
                        return;
                    }
                }
            }
        }

        public void onComplete() {
            this.f37750S = true;
            mo42631d();
        }

        public void onError(Throwable th) {
            if (this.f37746O.mo43142a(th)) {
                if (!this.f37745N) {
                    mo42629a();
                }
                this.f37750S = true;
                mo42631d();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            C13111a aVar = (C13111a) this.f37748Q.get();
            if (aVar != null) {
                aVar.mo42632a();
            }
            try {
                C5930q0 q0Var = (C5930q0) C12390b.m55563a(this.f37754b.apply(t), "The mapper returned a null SingleSource");
                C13111a aVar2 = new C13111a(this);
                while (true) {
                    C13111a<Object> aVar3 = (C13111a) this.f37748Q.get();
                    if (aVar3 != f37744V) {
                        if (this.f37748Q.compareAndSet(aVar3, aVar2)) {
                            q0Var.mo24192a(aVar2);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f37749R.cancel();
                this.f37748Q.getAndSet(f37744V);
                onError(th);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42629a() {
            C13111a<Object> aVar = (C13111a) this.f37748Q.getAndSet(f37744V);
            if (aVar != null && aVar != f37744V) {
                aVar.mo42632a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42630a(C13111a<R> aVar, Throwable th) {
            if (!this.f37748Q.compareAndSet(aVar, null) || !this.f37746O.mo43142a(th)) {
                C12205a.m54894b(th);
                return;
            }
            if (!this.f37745N) {
                this.f37749R.cancel();
                mo42629a();
            }
            mo42631d();
        }
    }

    public C13109f(C5929l<T> lVar, C12339o<? super T, ? extends C5930q0<? extends R>> oVar, boolean z) {
        this.f37743b = lVar;
        this.f37741N = oVar;
        this.f37742O = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super R> cVar) {
        this.f37743b.mo24393a((C12297q<? super T>) new C13110a<Object>(cVar, this.f37741N, this.f37742O));
    }
}
