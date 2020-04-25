package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12342r;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.j3 */
/* compiled from: ObservableSkipWhile */
public final class C13274j3<T> extends C13131a<T, T> {

    /* renamed from: b */
    final C12342r<? super T> f38349b;

    /* renamed from: e.a.x0.e.e.j3$a */
    /* compiled from: ObservableSkipWhile */
    static final class C13275a<T> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        C12314c f38350N;

        /* renamed from: O */
        boolean f38351O;

        /* renamed from: a */
        final C12280i0<? super T> f38352a;

        /* renamed from: b */
        final C12342r<? super T> f38353b;

        C13275a(C12280i0<? super T> i0Var, C12342r<? super T> rVar) {
            this.f38352a = i0Var;
            this.f38353b = rVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38350N, cVar)) {
                this.f38350N = cVar;
                this.f38352a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38350N.mo41878d();
        }

        public void dispose() {
            this.f38350N.dispose();
        }

        public void onComplete() {
            this.f38352a.onComplete();
        }

        public void onError(Throwable th) {
            this.f38352a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (this.f38351O) {
                this.f38352a.mo33453a(t);
            } else {
                try {
                    if (!this.f38353b.mo41812b(t)) {
                        this.f38351O = true;
                        this.f38352a.mo33453a(t);
                    }
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f38350N.dispose();
                    this.f38352a.onError(th);
                }
            }
        }
    }

    public C13274j3(C5926g0<T> g0Var, C12342r<? super T> rVar) {
        super(g0Var);
        this.f38349b = rVar;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f37851a.mo23893a(new C13275a(i0Var, this.f38349b));
    }
}
