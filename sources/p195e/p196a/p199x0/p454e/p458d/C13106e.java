package p195e.p196a.p199x0.p454e.p458d;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C12321v;
import p195e.p196a.C5929l;
import p195e.p196a.C5941y;
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
/* renamed from: e.a.x0.e.d.e */
/* compiled from: FlowableSwitchMapMaybe */
public final class C13106e<T, R> extends C5929l<R> {

    /* renamed from: N */
    final C12339o<? super T, ? extends C5941y<? extends R>> f37725N;

    /* renamed from: O */
    final boolean f37726O;

    /* renamed from: b */
    final C5929l<T> f37727b;

    /* renamed from: e.a.x0.e.d.e$a */
    /* compiled from: FlowableSwitchMapMaybe */
    static final class C13107a<T, R> extends AtomicInteger implements C12297q<T>, C14063d {

        /* renamed from: V */
        static final C13108a<Object> f37728V = new C13108a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* renamed from: N */
        final boolean f37729N;

        /* renamed from: O */
        final C13746c f37730O = new C13746c();

        /* renamed from: P */
        final AtomicLong f37731P = new AtomicLong();

        /* renamed from: Q */
        final AtomicReference<C13108a<R>> f37732Q = new AtomicReference<>();

        /* renamed from: R */
        C14063d f37733R;

        /* renamed from: S */
        volatile boolean f37734S;

        /* renamed from: T */
        volatile boolean f37735T;

        /* renamed from: U */
        long f37736U;

        /* renamed from: a */
        final C14062c<? super R> f37737a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5941y<? extends R>> f37738b;

        /* renamed from: e.a.x0.e.d.e$a$a */
        /* compiled from: FlowableSwitchMapMaybe */
        static final class C13108a<R> extends AtomicReference<C12314c> implements C12321v<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* renamed from: a */
            final C13107a<?, R> f37739a;

            /* renamed from: b */
            volatile R f37740b;

            C13108a(C13107a<?, R> aVar) {
                this.f37739a = aVar;
            }

            /* renamed from: a */
            public void mo41931a(C12314c cVar) {
                C12347d.m55468c(this, cVar);
            }

            public void onComplete() {
                this.f37739a.mo42625a(this);
            }

            public void onError(Throwable th) {
                this.f37739a.mo42626a(this, th);
            }

            public void onSuccess(R r) {
                this.f37740b = r;
                this.f37739a.mo42627d();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo42628a() {
                C12347d.m55465a((AtomicReference<C12314c>) this);
            }
        }

        C13107a(C14062c<? super R> cVar, C12339o<? super T, ? extends C5941y<? extends R>> oVar, boolean z) {
            this.f37737a = cVar;
            this.f37738b = oVar;
            this.f37729N = z;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f37733R, dVar)) {
                this.f37733R = dVar;
                this.f37737a.mo41788a((C14063d) this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            C13747d.m58696a(this.f37731P, j);
            mo42627d();
        }

        public void cancel() {
            this.f37735T = true;
            this.f37733R.cancel();
            mo42624a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42627d() {
            if (getAndIncrement() == 0) {
                C14062c<? super R> cVar = this.f37737a;
                C13746c cVar2 = this.f37730O;
                AtomicReference<C13108a<R>> atomicReference = this.f37732Q;
                AtomicLong atomicLong = this.f37731P;
                long j = this.f37736U;
                int i = 1;
                while (!this.f37735T) {
                    if (cVar2.get() == null || this.f37729N) {
                        boolean z = this.f37734S;
                        C13108a aVar = (C13108a) atomicReference.get();
                        boolean z2 = aVar == null;
                        if (z && z2) {
                            Throwable d = cVar2.mo43143d();
                            if (d != null) {
                                cVar.onError(d);
                            } else {
                                cVar.onComplete();
                            }
                            return;
                        } else if (z2 || aVar.f37740b == null || j == atomicLong.get()) {
                            this.f37736U = j;
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            atomicReference.compareAndSet(aVar, null);
                            cVar.mo41789a(aVar.f37740b);
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
            this.f37734S = true;
            mo42627d();
        }

        public void onError(Throwable th) {
            if (this.f37730O.mo43142a(th)) {
                if (!this.f37729N) {
                    mo42624a();
                }
                this.f37734S = true;
                mo42627d();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            C13108a aVar = (C13108a) this.f37732Q.get();
            if (aVar != null) {
                aVar.mo42628a();
            }
            try {
                C5941y yVar = (C5941y) C12390b.m55563a(this.f37738b.apply(t), "The mapper returned a null MaybeSource");
                C13108a aVar2 = new C13108a(this);
                while (true) {
                    C13108a<Object> aVar3 = (C13108a) this.f37732Q.get();
                    if (aVar3 != f37728V) {
                        if (this.f37732Q.compareAndSet(aVar3, aVar2)) {
                            yVar.mo24639a(aVar2);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f37733R.cancel();
                this.f37732Q.getAndSet(f37728V);
                onError(th);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42624a() {
            C13108a<Object> aVar = (C13108a) this.f37732Q.getAndSet(f37728V);
            if (aVar != null && aVar != f37728V) {
                aVar.mo42628a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42626a(C13108a<R> aVar, Throwable th) {
            if (!this.f37732Q.compareAndSet(aVar, null) || !this.f37730O.mo43142a(th)) {
                C12205a.m54894b(th);
                return;
            }
            if (!this.f37729N) {
                this.f37733R.cancel();
                mo42624a();
            }
            mo42627d();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42625a(C13108a<R> aVar) {
            if (this.f37732Q.compareAndSet(aVar, null)) {
                mo42627d();
            }
        }
    }

    public C13106e(C5929l<T> lVar, C12339o<? super T, ? extends C5941y<? extends R>> oVar, boolean z) {
        this.f37727b = lVar;
        this.f37725N = oVar;
        this.f37726O = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super R> cVar) {
        this.f37727b.mo24393a((C12297q<? super T>) new C13107a<Object>(cVar, this.f37725N, this.f37726O));
    }
}
