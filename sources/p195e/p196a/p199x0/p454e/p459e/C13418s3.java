package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12342r;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.s3 */
/* compiled from: ObservableTakeUntilPredicate */
public final class C13418s3<T> extends C13131a<T, T> {

    /* renamed from: b */
    final C12342r<? super T> f38817b;

    /* renamed from: e.a.x0.e.e.s3$a */
    /* compiled from: ObservableTakeUntilPredicate */
    static final class C13419a<T> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        C12314c f38818N;

        /* renamed from: O */
        boolean f38819O;

        /* renamed from: a */
        final C12280i0<? super T> f38820a;

        /* renamed from: b */
        final C12342r<? super T> f38821b;

        C13419a(C12280i0<? super T> i0Var, C12342r<? super T> rVar) {
            this.f38820a = i0Var;
            this.f38821b = rVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38818N, cVar)) {
                this.f38818N = cVar;
                this.f38820a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38818N.mo41878d();
        }

        public void dispose() {
            this.f38818N.dispose();
        }

        public void onComplete() {
            if (!this.f38819O) {
                this.f38819O = true;
                this.f38820a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.f38819O) {
                this.f38819O = true;
                this.f38820a.onError(th);
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38819O) {
                this.f38820a.mo33453a(t);
                try {
                    if (this.f38821b.mo41812b(t)) {
                        this.f38819O = true;
                        this.f38818N.dispose();
                        this.f38820a.onComplete();
                    }
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f38818N.dispose();
                    onError(th);
                }
            }
        }
    }

    public C13418s3(C5926g0<T> g0Var, C12342r<? super T> rVar) {
        super(g0Var);
        this.f38817b = rVar;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f37851a.mo23893a(new C13419a(i0Var, this.f38817b));
    }
}
