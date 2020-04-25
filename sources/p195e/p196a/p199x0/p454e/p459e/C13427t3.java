package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12342r;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.t3 */
/* compiled from: ObservableTakeWhile */
public final class C13427t3<T> extends C13131a<T, T> {

    /* renamed from: b */
    final C12342r<? super T> f38842b;

    /* renamed from: e.a.x0.e.e.t3$a */
    /* compiled from: ObservableTakeWhile */
    static final class C13428a<T> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        C12314c f38843N;

        /* renamed from: O */
        boolean f38844O;

        /* renamed from: a */
        final C12280i0<? super T> f38845a;

        /* renamed from: b */
        final C12342r<? super T> f38846b;

        C13428a(C12280i0<? super T> i0Var, C12342r<? super T> rVar) {
            this.f38845a = i0Var;
            this.f38846b = rVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38843N, cVar)) {
                this.f38843N = cVar;
                this.f38845a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38843N.mo41878d();
        }

        public void dispose() {
            this.f38843N.dispose();
        }

        public void onComplete() {
            if (!this.f38844O) {
                this.f38844O = true;
                this.f38845a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f38844O) {
                C12205a.m54894b(th);
                return;
            }
            this.f38844O = true;
            this.f38845a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38844O) {
                try {
                    if (!this.f38846b.mo41812b(t)) {
                        this.f38844O = true;
                        this.f38843N.dispose();
                        this.f38845a.onComplete();
                        return;
                    }
                    this.f38845a.mo33453a(t);
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f38843N.dispose();
                    onError(th);
                }
            }
        }
    }

    public C13427t3(C5926g0<T> g0Var, C12342r<? super T> rVar) {
        super(g0Var);
        this.f38842b = rVar;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f37851a.mo23893a(new C13428a(i0Var, this.f38842b));
    }
}
