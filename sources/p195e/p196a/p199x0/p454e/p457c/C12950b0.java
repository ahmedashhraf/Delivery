package p195e.p196a.p199x0.p454e.p457c;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import p195e.p196a.C12321v;
import p195e.p196a.C5929l;
import p195e.p196a.C5941y;
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

/* renamed from: e.a.x0.e.c.b0 */
/* compiled from: MaybeFlatMapIterableFlowable */
public final class C12950b0<T, R> extends C5929l<R> {

    /* renamed from: N */
    final C12339o<? super T, ? extends Iterable<? extends R>> f37346N;

    /* renamed from: b */
    final C5941y<T> f37347b;

    /* renamed from: e.a.x0.e.c.b0$a */
    /* compiled from: MaybeFlatMapIterableFlowable */
    static final class C12951a<T, R> extends C13735c<R> implements C12321v<T> {
        private static final long serialVersionUID = -8938804753851907758L;

        /* renamed from: N */
        final AtomicLong f37348N = new AtomicLong();

        /* renamed from: O */
        C12314c f37349O;

        /* renamed from: P */
        volatile Iterator<? extends R> f37350P;

        /* renamed from: Q */
        volatile boolean f37351Q;

        /* renamed from: R */
        boolean f37352R;

        /* renamed from: a */
        final C14062c<? super R> f37353a;

        /* renamed from: b */
        final C12339o<? super T, ? extends Iterable<? extends R>> f37354b;

        C12951a(C14062c<? super R> cVar, C12339o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f37353a = cVar;
            this.f37354b = oVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55464a(this.f37349O, cVar)) {
                this.f37349O = cVar;
                this.f37353a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f37348N, j);
                mo42558a();
            }
        }

        public void cancel() {
            this.f37351Q = true;
            this.f37349O.dispose();
            this.f37349O = C12347d.DISPOSED;
        }

        public void clear() {
            this.f37350P = null;
        }

        public boolean isEmpty() {
            return this.f37350P == null;
        }

        public void onComplete() {
            this.f37353a.onComplete();
        }

        public void onError(Throwable th) {
            this.f37349O = C12347d.DISPOSED;
            this.f37353a.onError(th);
        }

        public void onSuccess(T t) {
            try {
                Iterator<? extends R> it = ((Iterable) this.f37354b.apply(t)).iterator();
                if (!it.hasNext()) {
                    this.f37353a.onComplete();
                    return;
                }
                this.f37350P = it;
                mo42558a();
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f37353a.onError(th);
            }
        }

        @C5938g
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f37350P;
            if (it == null) {
                return null;
            }
            R a = C12390b.m55563a(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f37350P = null;
            }
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42559a(C14062c<? super R> cVar, Iterator<? extends R> it) {
            while (!this.f37351Q) {
                try {
                    cVar.mo41789a(it.next());
                    if (!this.f37351Q) {
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

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42558a() {
            if (getAndIncrement() == 0) {
                C14062c<? super R> cVar = this.f37353a;
                Iterator<? extends R> it = this.f37350P;
                if (!this.f37352R || it == null) {
                    int i = 1;
                    while (true) {
                        if (it != null) {
                            long j = this.f37348N.get();
                            if (j == Long.MAX_VALUE) {
                                mo42559a(cVar, it);
                                return;
                            }
                            long j2 = 0;
                            while (j2 != j) {
                                if (!this.f37351Q) {
                                    try {
                                        cVar.mo41789a(C12390b.m55563a(it.next(), "The iterator returned a null value"));
                                        if (!this.f37351Q) {
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
                                C13747d.m58699c(this.f37348N, j2);
                            }
                        }
                        i = addAndGet(-i);
                        if (i != 0) {
                            if (it == null) {
                                it = this.f37350P;
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

        /* renamed from: a */
        public int mo41855a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f37352R = true;
            return 2;
        }
    }

    public C12950b0(C5941y<T> yVar, C12339o<? super T, ? extends Iterable<? extends R>> oVar) {
        this.f37347b = yVar;
        this.f37346N = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super R> cVar) {
        this.f37347b.mo24639a(new C12951a(cVar, this.f37346N));
    }
}
