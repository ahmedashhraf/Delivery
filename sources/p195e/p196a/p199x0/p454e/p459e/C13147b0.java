package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C12292n0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.C5928k0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p452c.C12395d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.b0 */
/* compiled from: ObservableCountSingle */
public final class C13147b0<T> extends C5928k0<Long> implements C12395d<Long> {

    /* renamed from: a */
    final C5926g0<T> f37910a;

    /* renamed from: e.a.x0.e.e.b0$a */
    /* compiled from: ObservableCountSingle */
    static final class C13148a implements C12280i0<Object>, C12314c {

        /* renamed from: N */
        long f37911N;

        /* renamed from: a */
        final C12292n0<? super Long> f37912a;

        /* renamed from: b */
        C12314c f37913b;

        C13148a(C12292n0<? super Long> n0Var) {
            this.f37912a = n0Var;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f37913b, cVar)) {
                this.f37913b = cVar;
                this.f37912a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37913b.mo41878d();
        }

        public void dispose() {
            this.f37913b.dispose();
            this.f37913b = C12347d.DISPOSED;
        }

        public void onComplete() {
            this.f37913b = C12347d.DISPOSED;
            this.f37912a.onSuccess(Long.valueOf(this.f37911N));
        }

        public void onError(Throwable th) {
            this.f37913b = C12347d.DISPOSED;
            this.f37912a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(Object obj) {
            this.f37911N++;
        }
    }

    public C13147b0(C5926g0<T> g0Var) {
        this.f37910a = g0Var;
    }

    /* renamed from: a */
    public C5923b0<Long> mo42141a() {
        return C12205a.m54862a((C5923b0<T>) new C13132a0<T>(this.f37910a));
    }

    /* renamed from: b */
    public void mo24206b(C12292n0<? super Long> n0Var) {
        this.f37910a.mo23893a(new C13148a(n0Var));
    }
}
