package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.f3 */
/* compiled from: ObservableSkip */
public final class C13206f3<T> extends C13131a<T, T> {

    /* renamed from: b */
    final long f38112b;

    /* renamed from: e.a.x0.e.e.f3$a */
    /* compiled from: ObservableSkip */
    static final class C13207a<T> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        C12314c f38113N;

        /* renamed from: a */
        final C12280i0<? super T> f38114a;

        /* renamed from: b */
        long f38115b;

        C13207a(C12280i0<? super T> i0Var, long j) {
            this.f38114a = i0Var;
            this.f38115b = j;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38113N, cVar)) {
                this.f38113N = cVar;
                this.f38114a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38113N.mo41878d();
        }

        public void dispose() {
            this.f38113N.dispose();
        }

        public void onComplete() {
            this.f38114a.onComplete();
        }

        public void onError(Throwable th) {
            this.f38114a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            long j = this.f38115b;
            if (j != 0) {
                this.f38115b = j - 1;
            } else {
                this.f38114a.mo33453a(t);
            }
        }
    }

    public C13206f3(C5926g0<T> g0Var, long j) {
        super(g0Var);
        this.f38112b = j;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f37851a.mo23893a(new C13207a(i0Var, this.f38112b));
    }
}
