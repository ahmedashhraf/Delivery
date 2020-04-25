package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C12321v;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.C5931s;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p452c.C12395d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.r0 */
/* compiled from: ObservableElementAtMaybe */
public final class C13387r0<T> extends C5931s<T> implements C12395d<T> {

    /* renamed from: a */
    final C5926g0<T> f38723a;

    /* renamed from: b */
    final long f38724b;

    /* renamed from: e.a.x0.e.e.r0$a */
    /* compiled from: ObservableElementAtMaybe */
    static final class C13388a<T> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        C12314c f38725N;

        /* renamed from: O */
        long f38726O;

        /* renamed from: P */
        boolean f38727P;

        /* renamed from: a */
        final C12321v<? super T> f38728a;

        /* renamed from: b */
        final long f38729b;

        C13388a(C12321v<? super T> vVar, long j) {
            this.f38728a = vVar;
            this.f38729b = j;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38725N, cVar)) {
                this.f38725N = cVar;
                this.f38728a.mo41931a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38725N.mo41878d();
        }

        public void dispose() {
            this.f38725N.dispose();
        }

        public void onComplete() {
            if (!this.f38727P) {
                this.f38727P = true;
                this.f38728a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f38727P) {
                C12205a.m54894b(th);
                return;
            }
            this.f38727P = true;
            this.f38728a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38727P) {
                long j = this.f38726O;
                if (j == this.f38729b) {
                    this.f38727P = true;
                    this.f38725N.dispose();
                    this.f38728a.onSuccess(t);
                    return;
                }
                this.f38726O = j + 1;
            }
        }
    }

    public C13387r0(C5926g0<T> g0Var, long j) {
        this.f38723a = g0Var;
        this.f38724b = j;
    }

    /* renamed from: a */
    public C5923b0<T> mo42141a() {
        C13375q0 q0Var = new C13375q0(this.f38723a, this.f38724b, null, false);
        return C12205a.m54862a((C5923b0<T>) q0Var);
    }

    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f38723a.mo23893a(new C13388a(vVar, this.f38724b));
    }
}
