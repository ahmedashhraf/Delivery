package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13741i;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.k4 */
/* compiled from: FlowableTimeout */
public final class C12686k4<T, U, V> extends C12511a<T, T> {

    /* renamed from: N */
    final C6007b<U> f36336N;

    /* renamed from: O */
    final C12339o<? super T, ? extends C6007b<V>> f36337O;

    /* renamed from: P */
    final C6007b<? extends T> f36338P;

    /* renamed from: e.a.x0.e.b.k4$a */
    /* compiled from: FlowableTimeout */
    static final class C12687a extends AtomicReference<C14063d> implements C12297q<Object>, C12314c {
        private static final long serialVersionUID = 8708641127342403073L;

        /* renamed from: a */
        final C12689c f36339a;

        /* renamed from: b */
        final long f36340b;

        C12687a(long j, C12689c cVar) {
            this.f36340b = j;
            this.f36339a = cVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58676a((AtomicReference<C14063d>) this, dVar, Long.MAX_VALUE);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C13742j.m58672a((C14063d) get());
        }

        public void dispose() {
            C13742j.m58674a((AtomicReference<C14063d>) this);
        }

        public void onComplete() {
            Object obj = get();
            C13742j jVar = C13742j.CANCELLED;
            if (obj != jVar) {
                lazySet(jVar);
                this.f36339a.mo42355a(this.f36340b);
            }
        }

        public void onError(Throwable th) {
            Object obj = get();
            C13742j jVar = C13742j.CANCELLED;
            if (obj != jVar) {
                lazySet(jVar);
                this.f36339a.mo42356a(this.f36340b, th);
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo41789a(Object obj) {
            C14063d dVar = (C14063d) get();
            if (dVar != C13742j.CANCELLED) {
                dVar.cancel();
                lazySet(C13742j.CANCELLED);
                this.f36339a.mo42355a(this.f36340b);
            }
        }
    }

    /* renamed from: e.a.x0.e.b.k4$b */
    /* compiled from: FlowableTimeout */
    static final class C12688b<T> extends C13741i implements C12297q<T>, C12689c {
        private static final long serialVersionUID = 3764492702657003550L;

        /* renamed from: S */
        final C14062c<? super T> f36341S;

        /* renamed from: T */
        final C12339o<? super T, ? extends C6007b<?>> f36342T;

        /* renamed from: U */
        final C12350g f36343U = new C12350g();

        /* renamed from: V */
        final AtomicReference<C14063d> f36344V = new AtomicReference<>();

        /* renamed from: W */
        final AtomicLong f36345W;

        /* renamed from: X */
        C6007b<? extends T> f36346X;

        /* renamed from: Y */
        long f36347Y;

        C12688b(C14062c<? super T> cVar, C12339o<? super T, ? extends C6007b<?>> oVar, C6007b<? extends T> bVar) {
            this.f36341S = cVar;
            this.f36342T = oVar;
            this.f36346X = bVar;
            this.f36345W = new AtomicLong();
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58680c(this.f36344V, dVar)) {
                mo43130b(dVar);
            }
        }

        public void cancel() {
            super.cancel();
            this.f36343U.dispose();
        }

        public void onComplete() {
            if (this.f36345W.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f36343U.dispose();
                this.f36341S.onComplete();
                this.f36343U.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.f36345W.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f36343U.dispose();
                this.f36341S.onError(th);
                this.f36343U.dispose();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            long j = this.f36345W.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (this.f36345W.compareAndSet(j, j2)) {
                    C12314c cVar = (C12314c) this.f36343U.get();
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    this.f36347Y++;
                    this.f36341S.mo41789a(t);
                    try {
                        C6007b bVar = (C6007b) C12390b.m55563a(this.f36342T.apply(t), "The itemTimeoutIndicator returned a null Publisher.");
                        C12687a aVar = new C12687a(j2, this);
                        if (this.f36343U.mo42109a(aVar)) {
                            bVar.mo24397a(aVar);
                        }
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        ((C14063d) this.f36344V.get()).cancel();
                        this.f36345W.getAndSet(Long.MAX_VALUE);
                        this.f36341S.onError(th);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42357a(C6007b<?> bVar) {
            if (bVar != null) {
                C12687a aVar = new C12687a(0, this);
                if (this.f36343U.mo42109a(aVar)) {
                    bVar.mo24397a(aVar);
                }
            }
        }

        /* renamed from: a */
        public void mo42355a(long j) {
            if (this.f36345W.compareAndSet(j, Long.MAX_VALUE)) {
                C13742j.m58674a(this.f36344V);
                C6007b<? extends T> bVar = this.f36346X;
                this.f36346X = null;
                long j2 = this.f36347Y;
                if (j2 != 0) {
                    mo43129b(j2);
                }
                bVar.mo24397a(new C12701a(this.f36341S, this));
            }
        }

        /* renamed from: a */
        public void mo42356a(long j, Throwable th) {
            if (this.f36345W.compareAndSet(j, Long.MAX_VALUE)) {
                C13742j.m58674a(this.f36344V);
                this.f36341S.onError(th);
                return;
            }
            C12205a.m54894b(th);
        }
    }

    /* renamed from: e.a.x0.e.b.k4$c */
    /* compiled from: FlowableTimeout */
    interface C12689c extends C12704d {
        /* renamed from: a */
        void mo42356a(long j, Throwable th);
    }

    /* renamed from: e.a.x0.e.b.k4$d */
    /* compiled from: FlowableTimeout */
    static final class C12690d<T> extends AtomicLong implements C12297q<T>, C14063d, C12689c {
        private static final long serialVersionUID = 3764492702657003550L;

        /* renamed from: N */
        final C12350g f36348N = new C12350g();

        /* renamed from: O */
        final AtomicReference<C14063d> f36349O = new AtomicReference<>();

        /* renamed from: P */
        final AtomicLong f36350P = new AtomicLong();

        /* renamed from: a */
        final C14062c<? super T> f36351a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C6007b<?>> f36352b;

        C12690d(C14062c<? super T> cVar, C12339o<? super T, ? extends C6007b<?>> oVar) {
            this.f36351a = cVar;
            this.f36352b = oVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58677a(this.f36349O, this.f36350P, dVar);
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            C13742j.m58671a(this.f36349O, this.f36350P, j);
        }

        public void cancel() {
            C13742j.m58674a(this.f36349O);
            this.f36348N.dispose();
        }

        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f36348N.dispose();
                this.f36351a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f36348N.dispose();
                this.f36351a.onError(th);
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    C12314c cVar = (C12314c) this.f36348N.get();
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    this.f36351a.mo41789a(t);
                    try {
                        C6007b bVar = (C6007b) C12390b.m55563a(this.f36352b.apply(t), "The itemTimeoutIndicator returned a null Publisher.");
                        C12687a aVar = new C12687a(j2, this);
                        if (this.f36348N.mo42109a(aVar)) {
                            bVar.mo24397a(aVar);
                        }
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        ((C14063d) this.f36349O.get()).cancel();
                        getAndSet(Long.MAX_VALUE);
                        this.f36351a.onError(th);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42358a(C6007b<?> bVar) {
            if (bVar != null) {
                C12687a aVar = new C12687a(0, this);
                if (this.f36348N.mo42109a(aVar)) {
                    bVar.mo24397a(aVar);
                }
            }
        }

        /* renamed from: a */
        public void mo42355a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                C13742j.m58674a(this.f36349O);
                this.f36351a.onError(new TimeoutException());
            }
        }

        /* renamed from: a */
        public void mo42356a(long j, Throwable th) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                C13742j.m58674a(this.f36349O);
                this.f36351a.onError(th);
                return;
            }
            C12205a.m54894b(th);
        }
    }

    public C12686k4(C5929l<T> lVar, C6007b<U> bVar, C12339o<? super T, ? extends C6007b<V>> oVar, C6007b<? extends T> bVar2) {
        super(lVar);
        this.f36336N = bVar;
        this.f36337O = oVar;
        this.f36338P = bVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C6007b<? extends T> bVar = this.f36338P;
        if (bVar == null) {
            C12690d dVar = new C12690d(cVar, this.f36337O);
            cVar.mo41788a((C14063d) dVar);
            dVar.mo42358a(this.f36336N);
            this.f35814b.mo24393a((C12297q<? super T>) dVar);
            return;
        }
        C12688b bVar2 = new C12688b(cVar, this.f36337O, bVar);
        cVar.mo41788a((C14063d) bVar2);
        bVar2.mo42357a(this.f36336N);
        this.f35814b.mo24393a((C12297q<? super T>) bVar2);
    }
}
