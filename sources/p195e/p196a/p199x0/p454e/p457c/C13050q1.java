package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12321v;
import p195e.p196a.C5931s;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.c.q1 */
/* compiled from: MaybeUsing */
public final class C13050q1<T, D> extends C5931s<T> {

    /* renamed from: N */
    final C12331g<? super D> f37554N;

    /* renamed from: O */
    final boolean f37555O;

    /* renamed from: a */
    final Callable<? extends D> f37556a;

    /* renamed from: b */
    final C12339o<? super D, ? extends C5941y<? extends T>> f37557b;

    /* renamed from: e.a.x0.e.c.q1$a */
    /* compiled from: MaybeUsing */
    static final class C13051a<T, D> extends AtomicReference<Object> implements C12321v<T>, C12314c {
        private static final long serialVersionUID = -674404550052917487L;

        /* renamed from: N */
        final boolean f37558N;

        /* renamed from: O */
        C12314c f37559O;

        /* renamed from: a */
        final C12321v<? super T> f37560a;

        /* renamed from: b */
        final C12331g<? super D> f37561b;

        C13051a(C12321v<? super T> vVar, D d, C12331g<? super D> gVar, boolean z) {
            super(d);
            this.f37560a = vVar;
            this.f37561b = gVar;
            this.f37558N = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42587a() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.f37561b.mo33410c(andSet);
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    C12205a.m54894b(th);
                }
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37559O.mo41878d();
        }

        public void dispose() {
            this.f37559O.dispose();
            this.f37559O = C12347d.DISPOSED;
            mo42587a();
        }

        public void onComplete() {
            this.f37559O = C12347d.DISPOSED;
            if (this.f37558N) {
                Object andSet = getAndSet(this);
                if (andSet != this) {
                    try {
                        this.f37561b.mo33410c(andSet);
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        this.f37560a.onError(th);
                    }
                }
                return;
            }
            this.f37560a.onComplete();
            if (!this.f37558N) {
                mo42587a();
            }
        }

        public void onError(Throwable th) {
            this.f37559O = C12347d.DISPOSED;
            if (this.f37558N) {
                Object andSet = getAndSet(this);
                if (andSet != this) {
                    try {
                        this.f37561b.mo33410c(andSet);
                    } catch (Throwable th2) {
                        C14398a.m62357b(th2);
                        th = new CompositeException(th, th2);
                    }
                } else {
                    return;
                }
            }
            this.f37560a.onError(th);
            if (!this.f37558N) {
                mo42587a();
            }
        }

        public void onSuccess(T t) {
            this.f37559O = C12347d.DISPOSED;
            if (this.f37558N) {
                Object andSet = getAndSet(this);
                if (andSet != this) {
                    try {
                        this.f37561b.mo33410c(andSet);
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        this.f37560a.onError(th);
                    }
                }
                return;
            }
            this.f37560a.onSuccess(t);
            if (!this.f37558N) {
                mo42587a();
            }
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55464a(this.f37559O, cVar)) {
                this.f37559O = cVar;
                this.f37560a.mo41931a(this);
            }
        }
    }

    public C13050q1(Callable<? extends D> callable, C12339o<? super D, ? extends C5941y<? extends T>> oVar, C12331g<? super D> gVar, boolean z) {
        this.f37556a = callable;
        this.f37557b = oVar;
        this.f37554N = gVar;
        this.f37555O = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        try {
            Object call = this.f37556a.call();
            try {
                ((C5941y) C12390b.m55563a(this.f37557b.apply(call), "The sourceSupplier returned a null MaybeSource")).mo24639a(new C13051a(vVar, call, this.f37554N, this.f37555O));
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b(th);
            }
        } catch (Throwable th2) {
            C14398a.m62357b(th2);
            C12348e.m55478a(th2, vVar);
        }
    }
}
