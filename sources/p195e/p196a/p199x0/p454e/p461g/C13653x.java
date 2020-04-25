package p195e.p196a.p199x0.p454e.p461g;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import p195e.p196a.C12292n0;
import p195e.p196a.C5929l;
import p195e.p196a.C5930q0;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13735c;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.g.x */
/* compiled from: SingleFlatMapIterableFlowable */
public final class C13653x<T, R> extends C5929l<R> {

    /* renamed from: N */
    final C12339o<? super T, ? extends Iterable<? extends R>> f39494N;

    /* renamed from: b */
    final C5930q0<T> f39495b;

    /* renamed from: e.a.x0.e.g.x$a */
    /* compiled from: SingleFlatMapIterableFlowable */
    static final class C13654a<T, R> extends C13735c<R> implements C12292n0<T> {
        private static final long serialVersionUID = -8938804753851907758L;

        /* renamed from: N */
        final AtomicLong f39496N = new AtomicLong();

        /* renamed from: O */
        C12314c f39497O;

        /* renamed from: P */
        volatile Iterator<? extends R> f39498P;

        /* renamed from: Q */
        volatile boolean f39499Q;

        /* renamed from: R */
        boolean f39500R;

        /* renamed from: a */
        final C14062c<? super R> f39501a;

        /* renamed from: b */
        final C12339o<? super T, ? extends Iterable<? extends R>> f39502b;

        C13654a(C14062c<? super R> cVar, C12339o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f39501a = cVar;
            this.f39502b = oVar;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            if (C12347d.m55464a(this.f39497O, cVar)) {
                this.f39497O = cVar;
                this.f39501a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f39496N, j);
                mo43016a();
            }
        }

        public void cancel() {
            this.f39499Q = true;
            this.f39497O.dispose();
            this.f39497O = C12347d.DISPOSED;
        }

        public void clear() {
            this.f39498P = null;
        }

        public boolean isEmpty() {
            return this.f39498P == null;
        }

        public void onError(Throwable th) {
            this.f39497O = C12347d.DISPOSED;
            this.f39501a.onError(th);
        }

        public void onSuccess(T t) {
            try {
                Iterator<? extends R> it = ((Iterable) this.f39502b.apply(t)).iterator();
                if (!it.hasNext()) {
                    this.f39501a.onComplete();
                    return;
                }
                this.f39498P = it;
                mo43016a();
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f39501a.onError(th);
            }
        }

        @C5938g
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f39498P;
            if (it == null) {
                return null;
            }
            R a = C12390b.m55563a(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f39498P = null;
            }
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo43016a() {
            if (getAndIncrement() == 0) {
                C14062c<? super R> cVar = this.f39501a;
                Iterator<? extends R> it = this.f39498P;
                if (!this.f39500R || it == null) {
                    int i = 1;
                    while (true) {
                        if (it != null) {
                            long j = this.f39496N.get();
                            if (j == Long.MAX_VALUE) {
                                mo43017a(cVar, it);
                                return;
                            }
                            long j2 = 0;
                            while (j2 != j) {
                                if (!this.f39499Q) {
                                    try {
                                        cVar.mo41789a(C12390b.m55563a(it.next(), "The iterator returned a null value"));
                                        if (!this.f39499Q) {
                                            j2++;
                                            try {
                                                if (!it.hasNext()) {
                                                    cVar.onComplete();
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                C14398a.m62357b(th);
                                                cVar.onError(th);
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        C14398a.m62357b(th2);
                                        cVar.onError(th2);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                            if (j2 != 0) {
                                C13747d.m58699c(this.f39496N, j2);
                            }
                        }
                        i = addAndGet(-i);
                        if (i != 0) {
                            if (it == null) {
                                it = this.f39498P;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    cVar.mo41789a(null);
                    cVar.onComplete();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo43017a(C14062c<? super R> cVar, Iterator<? extends R> it) {
            while (!this.f39499Q) {
                try {
                    cVar.mo41789a(it.next());
                    if (!this.f39499Q) {
                        try {
                            if (!it.hasNext()) {
                                cVar.onComplete();
                                return;
                            }
                        } catch (Throwable th) {
                            C14398a.m62357b(th);
                            cVar.onError(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    C14398a.m62357b(th2);
                    cVar.onError(th2);
                    return;
                }
            }
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f39500R = true;
            return 2;
        }
    }

    public C13653x(C5930q0<T> q0Var, C12339o<? super T, ? extends Iterable<? extends R>> oVar) {
        this.f39495b = q0Var;
        this.f39494N = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super R> cVar) {
        this.f39495b.mo24192a(new C13654a(cVar, this.f39494N));
    }
}
