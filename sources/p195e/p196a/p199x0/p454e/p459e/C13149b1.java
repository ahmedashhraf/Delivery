package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.b1 */
/* compiled from: ObservableFlattenIterable */
public final class C13149b1<T, R> extends C13131a<T, R> {

    /* renamed from: b */
    final C12339o<? super T, ? extends Iterable<? extends R>> f37914b;

    /* renamed from: e.a.x0.e.e.b1$a */
    /* compiled from: ObservableFlattenIterable */
    static final class C13150a<T, R> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        C12314c f37915N;

        /* renamed from: a */
        final C12280i0<? super R> f37916a;

        /* renamed from: b */
        final C12339o<? super T, ? extends Iterable<? extends R>> f37917b;

        C13150a(C12280i0<? super R> i0Var, C12339o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f37916a = i0Var;
            this.f37917b = oVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f37915N, cVar)) {
                this.f37915N = cVar;
                this.f37916a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37915N.mo41878d();
        }

        public void dispose() {
            this.f37915N.dispose();
            this.f37915N = C12347d.DISPOSED;
        }

        public void onComplete() {
            C12314c cVar = this.f37915N;
            C12347d dVar = C12347d.DISPOSED;
            if (cVar != dVar) {
                this.f37915N = dVar;
                this.f37916a.onComplete();
            }
        }

        public void onError(Throwable th) {
            C12314c cVar = this.f37915N;
            C12347d dVar = C12347d.DISPOSED;
            if (cVar == dVar) {
                C12205a.m54894b(th);
                return;
            }
            this.f37915N = dVar;
            this.f37916a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (this.f37915N != C12347d.DISPOSED) {
                try {
                    C12280i0<? super R> i0Var = this.f37916a;
                    for (Object a : (Iterable) this.f37917b.apply(t)) {
                        try {
                            try {
                                i0Var.mo33453a(C12390b.m55563a(a, "The iterator returned a null value"));
                            } catch (Throwable th) {
                                C14398a.m62357b(th);
                                this.f37915N.dispose();
                                onError(th);
                            }
                        } catch (Throwable th2) {
                            C14398a.m62357b(th2);
                            this.f37915N.dispose();
                            onError(th2);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    C14398a.m62357b(th3);
                    this.f37915N.dispose();
                    onError(th3);
                }
            }
        }
    }

    public C13149b1(C5926g0<T> g0Var, C12339o<? super T, ? extends Iterable<? extends R>> oVar) {
        super(g0Var);
        this.f37914b = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super R> i0Var) {
        this.f37851a.mo23893a(new C13150a(i0Var, this.f37914b));
    }
}
