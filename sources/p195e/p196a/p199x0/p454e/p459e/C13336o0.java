package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12325a;
import p195e.p196a.p449w0.C12331g;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.e.o0 */
/* compiled from: ObservableDoOnEach */
public final class C13336o0<T> extends C13131a<T, T> {

    /* renamed from: N */
    final C12331g<? super Throwable> f38556N;

    /* renamed from: O */
    final C12325a f38557O;

    /* renamed from: P */
    final C12325a f38558P;

    /* renamed from: b */
    final C12331g<? super T> f38559b;

    /* renamed from: e.a.x0.e.e.o0$a */
    /* compiled from: ObservableDoOnEach */
    static final class C13337a<T> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        final C12331g<? super Throwable> f38560N;

        /* renamed from: O */
        final C12325a f38561O;

        /* renamed from: P */
        final C12325a f38562P;

        /* renamed from: Q */
        C12314c f38563Q;

        /* renamed from: R */
        boolean f38564R;

        /* renamed from: a */
        final C12280i0<? super T> f38565a;

        /* renamed from: b */
        final C12331g<? super T> f38566b;

        C13337a(C12280i0<? super T> i0Var, C12331g<? super T> gVar, C12331g<? super Throwable> gVar2, C12325a aVar, C12325a aVar2) {
            this.f38565a = i0Var;
            this.f38566b = gVar;
            this.f38560N = gVar2;
            this.f38561O = aVar;
            this.f38562P = aVar2;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38563Q, cVar)) {
                this.f38563Q = cVar;
                this.f38565a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38563Q.mo41878d();
        }

        public void dispose() {
            this.f38563Q.dispose();
        }

        public void onComplete() {
            if (!this.f38564R) {
                try {
                    this.f38561O.run();
                    this.f38564R = true;
                    this.f38565a.onComplete();
                    try {
                        this.f38562P.run();
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        C12205a.m54894b(th);
                    }
                } catch (Throwable th2) {
                    C14398a.m62357b(th2);
                    onError(th2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f38564R) {
                C12205a.m54894b(th);
                return;
            }
            this.f38564R = true;
            try {
                this.f38560N.mo33410c(th);
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                th = new CompositeException(th, th2);
            }
            this.f38565a.onError(th);
            try {
                this.f38562P.run();
            } catch (Throwable th3) {
                C14398a.m62357b(th3);
                C12205a.m54894b(th3);
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38564R) {
                try {
                    this.f38566b.mo33410c(t);
                    this.f38565a.mo33453a(t);
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f38563Q.dispose();
                    onError(th);
                }
            }
        }
    }

    public C13336o0(C5926g0<T> g0Var, C12331g<? super T> gVar, C12331g<? super Throwable> gVar2, C12325a aVar, C12325a aVar2) {
        super(g0Var);
        this.f38559b = gVar;
        this.f38556N = gVar2;
        this.f38557O = aVar;
        this.f38558P = aVar2;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C5926g0<T> g0Var = this.f37851a;
        C13337a aVar = new C13337a(i0Var, this.f38559b, this.f38556N, this.f38557O, this.f38558P);
        g0Var.mo23893a(aVar);
    }
}
