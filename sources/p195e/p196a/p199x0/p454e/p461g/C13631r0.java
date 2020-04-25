package p195e.p196a.p199x0.p454e.p461g;

import p195e.p196a.C12280i0;
import p195e.p196a.C12292n0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5930q0;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p453d.C12419l;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.g.r0 */
/* compiled from: SingleToObservable */
public final class C13631r0<T> extends C5923b0<T> {

    /* renamed from: a */
    final C5930q0<? extends T> f39445a;

    /* renamed from: e.a.x0.e.g.r0$a */
    /* compiled from: SingleToObservable */
    static final class C13632a<T> extends C12419l<T> implements C12292n0<T> {
        private static final long serialVersionUID = 3786543492451018833L;

        /* renamed from: S */
        C12314c f39446S;

        C13632a(C12280i0<? super T> i0Var) {
            super(i0Var);
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            if (C12347d.m55464a(this.f39446S, cVar)) {
                this.f39446S = cVar;
                this.f35574a.mo34123a((C12314c) this);
            }
        }

        public void dispose() {
            super.dispose();
            this.f39446S.dispose();
        }

        public void onError(Throwable th) {
            mo42162a(th);
        }

        public void onSuccess(T t) {
            mo42163b(t);
        }
    }

    public C13631r0(C5930q0<? extends T> q0Var) {
        this.f39445a = q0Var;
    }

    @C5936e
    /* renamed from: g */
    public static <T> C12292n0<T> m58386g(C12280i0<? super T> i0Var) {
        return new C13632a(i0Var);
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f39445a.mo24192a(m58386g(i0Var));
    }
}
