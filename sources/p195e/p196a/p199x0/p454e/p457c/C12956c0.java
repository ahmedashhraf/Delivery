package p195e.p196a.p199x0.p454e.p457c;

import java.util.Iterator;
import p195e.p196a.C12280i0;
import p195e.p196a.C12321v;
import p195e.p196a.C5923b0;
import p195e.p196a.C5941y;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p453d.C12410c;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.c.c0 */
/* compiled from: MaybeFlatMapIterableObservable */
public final class C12956c0<T, R> extends C5923b0<R> {

    /* renamed from: a */
    final C5941y<T> f37371a;

    /* renamed from: b */
    final C12339o<? super T, ? extends Iterable<? extends R>> f37372b;

    /* renamed from: e.a.x0.e.c.c0$a */
    /* compiled from: MaybeFlatMapIterableObservable */
    static final class C12957a<T, R> extends C12410c<R> implements C12321v<T> {

        /* renamed from: N */
        C12314c f37373N;

        /* renamed from: O */
        volatile Iterator<? extends R> f37374O;

        /* renamed from: P */
        volatile boolean f37375P;

        /* renamed from: Q */
        boolean f37376Q;

        /* renamed from: a */
        final C12280i0<? super R> f37377a;

        /* renamed from: b */
        final C12339o<? super T, ? extends Iterable<? extends R>> f37378b;

        C12957a(C12280i0<? super R> i0Var, C12339o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f37377a = i0Var;
            this.f37378b = oVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55464a(this.f37373N, cVar)) {
                this.f37373N = cVar;
                this.f37377a.mo34123a((C12314c) this);
            }
        }

        public void clear() {
            this.f37374O = null;
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37375P;
        }

        public void dispose() {
            this.f37375P = true;
            this.f37373N.dispose();
            this.f37373N = C12347d.DISPOSED;
        }

        public boolean isEmpty() {
            return this.f37374O == null;
        }

        public void onComplete() {
            this.f37377a.onComplete();
        }

        public void onError(Throwable th) {
            this.f37373N = C12347d.DISPOSED;
            this.f37377a.onError(th);
        }

        public void onSuccess(T t) {
            C12280i0<? super R> i0Var = this.f37377a;
            try {
                Iterator<? extends R> it = ((Iterable) this.f37378b.apply(t)).iterator();
                if (!it.hasNext()) {
                    i0Var.onComplete();
                    return;
                }
                this.f37374O = it;
                if (this.f37376Q) {
                    i0Var.mo33453a(null);
                    i0Var.onComplete();
                    return;
                }
                while (!this.f37375P) {
                    try {
                        i0Var.mo33453a(it.next());
                        if (!this.f37375P) {
                            try {
                                if (!it.hasNext()) {
                                    i0Var.onComplete();
                                    return;
                                }
                            } catch (Throwable th) {
                                C14398a.m62357b(th);
                                i0Var.onError(th);
                                return;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th2) {
                        C14398a.m62357b(th2);
                        i0Var.onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                C14398a.m62357b(th3);
                i0Var.onError(th3);
            }
        }

        @C5938g
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f37374O;
            if (it == null) {
                return null;
            }
            R a = C12390b.m55563a(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f37374O = null;
            }
            return a;
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f37376Q = true;
            return 2;
        }
    }

    public C12956c0(C5941y<T> yVar, C12339o<? super T, ? extends Iterable<? extends R>> oVar) {
        this.f37371a = yVar;
        this.f37372b = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super R> i0Var) {
        this.f37371a.mo24639a(new C12957a(i0Var, this.f37372b));
    }
}
