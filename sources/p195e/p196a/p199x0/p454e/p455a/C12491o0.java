package p195e.p196a.p199x0.p454e.p455a;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.a.o0 */
/* compiled from: CompletableUsing */
public final class C12491o0<R> extends C5925c {

    /* renamed from: N */
    final C12331g<? super R> f35776N;

    /* renamed from: O */
    final boolean f35777O;

    /* renamed from: a */
    final Callable<R> f35778a;

    /* renamed from: b */
    final C12339o<? super R, ? extends C5927i> f35779b;

    /* renamed from: e.a.x0.e.a.o0$a */
    /* compiled from: CompletableUsing */
    static final class C12492a<R> extends AtomicReference<Object> implements C12268f, C12314c {
        private static final long serialVersionUID = -674404550052917487L;

        /* renamed from: N */
        final boolean f35780N;

        /* renamed from: O */
        C12314c f35781O;

        /* renamed from: a */
        final C12268f f35782a;

        /* renamed from: b */
        final C12331g<? super R> f35783b;

        C12492a(C12268f fVar, R r, C12331g<? super R> gVar, boolean z) {
            super(r);
            this.f35782a = fVar;
            this.f35783b = gVar;
            this.f35780N = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42212a() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.f35783b.mo33410c(andSet);
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    C12205a.m54894b(th);
                }
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35781O.mo41878d();
        }

        public void dispose() {
            this.f35781O.dispose();
            this.f35781O = C12347d.DISPOSED;
            mo42212a();
        }

        public void onComplete() {
            this.f35781O = C12347d.DISPOSED;
            if (this.f35780N) {
                Object andSet = getAndSet(this);
                if (andSet != this) {
                    try {
                        this.f35783b.mo33410c(andSet);
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        this.f35782a.onError(th);
                    }
                }
                return;
            }
            this.f35782a.onComplete();
            if (!this.f35780N) {
                mo42212a();
            }
        }

        public void onError(Throwable th) {
            this.f35781O = C12347d.DISPOSED;
            if (this.f35780N) {
                Object andSet = getAndSet(this);
                if (andSet != this) {
                    try {
                        this.f35783b.mo33410c(andSet);
                    } catch (Throwable th2) {
                        C14398a.m62357b(th2);
                        th = new CompositeException(th, th2);
                    }
                } else {
                    return;
                }
            }
            this.f35782a.onError(th);
            if (!this.f35780N) {
                mo42212a();
            }
        }

        /* renamed from: a */
        public void mo41921a(C12314c cVar) {
            if (C12347d.m55464a(this.f35781O, cVar)) {
                this.f35781O = cVar;
                this.f35782a.mo41921a(this);
            }
        }
    }

    public C12491o0(Callable<R> callable, C12339o<? super R, ? extends C5927i> oVar, C12331g<? super R> gVar, boolean z) {
        this.f35778a = callable;
        this.f35779b = oVar;
        this.f35776N = gVar;
        this.f35777O = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        try {
            Object call = this.f35778a.call();
            try {
                ((C5927i) C12390b.m55563a(this.f35779b.apply(call), "The completableFunction returned a null CompletableSource")).mo24122a(new C12492a(fVar, call, this.f35776N, this.f35777O));
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b(th);
            }
        } catch (Throwable th2) {
            C14398a.m62357b(th2);
            C12348e.m55475a(th2, fVar);
        }
    }
}
