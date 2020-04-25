package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p443f1.C12271b;
import p195e.p196a.p443f1.C12274e;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.g0 */
/* compiled from: FlowableDebounce */
public final class C12614g0<T, U> extends C12511a<T, T> {

    /* renamed from: N */
    final C12339o<? super T, ? extends C6007b<U>> f36111N;

    /* renamed from: e.a.x0.e.b.g0$a */
    /* compiled from: FlowableDebounce */
    static final class C12615a<T, U> extends AtomicLong implements C12297q<T>, C14063d {
        private static final long serialVersionUID = 6725975399620862591L;

        /* renamed from: N */
        C14063d f36112N;

        /* renamed from: O */
        final AtomicReference<C12314c> f36113O = new AtomicReference<>();

        /* renamed from: P */
        volatile long f36114P;

        /* renamed from: Q */
        boolean f36115Q;

        /* renamed from: a */
        final C14062c<? super T> f36116a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C6007b<U>> f36117b;

        /* renamed from: e.a.x0.e.b.g0$a$a */
        /* compiled from: FlowableDebounce */
        static final class C12616a<T, U> extends C12271b<U> {

            /* renamed from: N */
            final long f36118N;

            /* renamed from: O */
            final T f36119O;

            /* renamed from: P */
            boolean f36120P;

            /* renamed from: Q */
            final AtomicBoolean f36121Q = new AtomicBoolean();

            /* renamed from: b */
            final C12615a<T, U> f36122b;

            C12616a(C12615a<T, U> aVar, long j, T t) {
                this.f36122b = aVar;
                this.f36118N = j;
                this.f36119O = t;
            }

            /* renamed from: a */
            public void mo41789a(U u) {
                if (!this.f36120P) {
                    this.f36120P = true;
                    mo41997b();
                    mo42308g();
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: g */
            public void mo42308g() {
                if (this.f36121Q.compareAndSet(false, true)) {
                    this.f36122b.mo42307a(this.f36118N, this.f36119O);
                }
            }

            public void onComplete() {
                if (!this.f36120P) {
                    this.f36120P = true;
                    mo42308g();
                }
            }

            public void onError(Throwable th) {
                if (this.f36120P) {
                    C12205a.m54894b(th);
                    return;
                }
                this.f36120P = true;
                this.f36122b.onError(th);
            }
        }

        C12615a(C14062c<? super T> cVar, C12339o<? super T, ? extends C6007b<U>> oVar) {
            this.f36116a = cVar;
            this.f36117b = oVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36112N, dVar)) {
                this.f36112N = dVar;
                this.f36116a.mo41788a((C14063d) this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a((AtomicLong) this, j);
            }
        }

        public void cancel() {
            this.f36112N.cancel();
            C12347d.m55465a(this.f36113O);
        }

        public void onComplete() {
            if (!this.f36115Q) {
                this.f36115Q = true;
                C12314c cVar = (C12314c) this.f36113O.get();
                if (!C12347d.m55463a(cVar)) {
                    ((C12616a) cVar).mo42308g();
                    C12347d.m55465a(this.f36113O);
                    this.f36116a.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            C12347d.m55465a(this.f36113O);
            this.f36116a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36115Q) {
                long j = this.f36114P + 1;
                this.f36114P = j;
                C12314c cVar = (C12314c) this.f36113O.get();
                if (cVar != null) {
                    cVar.dispose();
                }
                try {
                    C6007b bVar = (C6007b) C12390b.m55563a(this.f36117b.apply(t), "The publisher supplied is null");
                    C12616a aVar = new C12616a(this, j, t);
                    if (this.f36113O.compareAndSet(cVar, aVar)) {
                        bVar.mo24397a(aVar);
                    }
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    cancel();
                    this.f36116a.onError(th);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42307a(long j, T t) {
            if (j != this.f36114P) {
                return;
            }
            if (get() != 0) {
                this.f36116a.mo41789a(t);
                C13747d.m58699c(this, 1);
                return;
            }
            cancel();
            this.f36116a.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
        }
    }

    public C12614g0(C5929l<T> lVar, C12339o<? super T, ? extends C6007b<U>> oVar) {
        super(lVar);
        this.f36111N = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12615a<Object>(new C12274e(cVar), this.f36111N));
    }
}
