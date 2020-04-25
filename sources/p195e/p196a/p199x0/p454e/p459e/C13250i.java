package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12342r;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.i */
/* compiled from: ObservableAny */
public final class C13250i<T> extends C13131a<T, Boolean> {

    /* renamed from: b */
    final C12342r<? super T> f38269b;

    /* renamed from: e.a.x0.e.e.i$a */
    /* compiled from: ObservableAny */
    static final class C13251a<T> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        C12314c f38270N;

        /* renamed from: O */
        boolean f38271O;

        /* renamed from: a */
        final C12280i0<? super Boolean> f38272a;

        /* renamed from: b */
        final C12342r<? super T> f38273b;

        C13251a(C12280i0<? super Boolean> i0Var, C12342r<? super T> rVar) {
            this.f38272a = i0Var;
            this.f38273b = rVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38270N, cVar)) {
                this.f38270N = cVar;
                this.f38272a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38270N.mo41878d();
        }

        public void dispose() {
            this.f38270N.dispose();
        }

        public void onComplete() {
            if (!this.f38271O) {
                this.f38271O = true;
                this.f38272a.mo33453a(Boolean.valueOf(false));
                this.f38272a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f38271O) {
                C12205a.m54894b(th);
                return;
            }
            this.f38271O = true;
            this.f38272a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38271O) {
                try {
                    if (this.f38273b.mo41812b(t)) {
                        this.f38271O = true;
                        this.f38270N.dispose();
                        this.f38272a.mo33453a(Boolean.valueOf(true));
                        this.f38272a.onComplete();
                    }
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f38270N.dispose();
                    onError(th);
                }
            }
        }
    }

    public C13250i(C5926g0<T> g0Var, C12342r<? super T> rVar) {
        super(g0Var);
        this.f38269b = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super Boolean> i0Var) {
        this.f37851a.mo23893a(new C13251a(i0Var, this.f38269b));
    }
}
