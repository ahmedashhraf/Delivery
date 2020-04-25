package p195e.p196a.p199x0.p454e.p461g;

import java.util.Iterator;
import p195e.p196a.C12280i0;
import p195e.p196a.C12292n0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5930q0;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p453d.C12409b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.g.y */
/* compiled from: SingleFlatMapIterableObservable */
public final class C13655y<T, R> extends C5923b0<R> {

    /* renamed from: a */
    final C5930q0<T> f39503a;

    /* renamed from: b */
    final C12339o<? super T, ? extends Iterable<? extends R>> f39504b;

    /* renamed from: e.a.x0.e.g.y$a */
    /* compiled from: SingleFlatMapIterableObservable */
    static final class C13656a<T, R> extends C12409b<R> implements C12292n0<T> {
        private static final long serialVersionUID = -8938804753851907758L;

        /* renamed from: N */
        C12314c f39505N;

        /* renamed from: O */
        volatile Iterator<? extends R> f39506O;

        /* renamed from: P */
        volatile boolean f39507P;

        /* renamed from: Q */
        boolean f39508Q;

        /* renamed from: a */
        final C12280i0<? super R> f39509a;

        /* renamed from: b */
        final C12339o<? super T, ? extends Iterable<? extends R>> f39510b;

        C13656a(C12280i0<? super R> i0Var, C12339o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f39509a = i0Var;
            this.f39510b = oVar;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            if (C12347d.m55464a(this.f39505N, cVar)) {
                this.f39505N = cVar;
                this.f39509a.mo34123a((C12314c) this);
            }
        }

        public void clear() {
            this.f39506O = null;
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f39507P;
        }

        public void dispose() {
            this.f39507P = true;
            this.f39505N.dispose();
            this.f39505N = C12347d.DISPOSED;
        }

        public boolean isEmpty() {
            return this.f39506O == null;
        }

        public void onError(Throwable th) {
            this.f39505N = C12347d.DISPOSED;
            this.f39509a.onError(th);
        }

        public void onSuccess(T t) {
            C12280i0<? super R> i0Var = this.f39509a;
            try {
                Iterator<? extends R> it = ((Iterable) this.f39510b.apply(t)).iterator();
                if (!it.hasNext()) {
                    i0Var.onComplete();
                } else if (this.f39508Q) {
                    this.f39506O = it;
                    i0Var.mo33453a(null);
                    i0Var.onComplete();
                } else {
                    while (!this.f39507P) {
                        try {
                            i0Var.mo33453a(it.next());
                            if (!this.f39507P) {
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
                }
            } catch (Throwable th3) {
                C14398a.m62357b(th3);
                this.f39509a.onError(th3);
            }
        }

        @C5938g
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f39506O;
            if (it == null) {
                return null;
            }
            R a = C12390b.m55563a(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f39506O = null;
            }
            return a;
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f39508Q = true;
            return 2;
        }
    }

    public C13655y(C5930q0<T> q0Var, C12339o<? super T, ? extends Iterable<? extends R>> oVar) {
        this.f39503a = q0Var;
        this.f39504b = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super R> i0Var) {
        this.f39503a.mo24192a(new C13656a(i0Var, this.f39504b));
    }
}
