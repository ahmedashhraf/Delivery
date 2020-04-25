package p195e.p196a.p199x0.p454e.p459e;

import java.util.ArrayDeque;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.g3 */
/* compiled from: ObservableSkipLast */
public final class C13226g3<T> extends C13131a<T, T> {

    /* renamed from: b */
    final int f38168b;

    /* renamed from: e.a.x0.e.e.g3$a */
    /* compiled from: ObservableSkipLast */
    static final class C13227a<T> extends ArrayDeque<T> implements C12280i0<T>, C12314c {
        private static final long serialVersionUID = -3807491841935125653L;

        /* renamed from: N */
        C12314c f38169N;

        /* renamed from: a */
        final C12280i0<? super T> f38170a;

        /* renamed from: b */
        final int f38171b;

        C13227a(C12280i0<? super T> i0Var, int i) {
            super(i);
            this.f38170a = i0Var;
            this.f38171b = i;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38169N, cVar)) {
                this.f38169N = cVar;
                this.f38170a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38169N.mo41878d();
        }

        public void dispose() {
            this.f38169N.dispose();
        }

        public void onComplete() {
            this.f38170a.onComplete();
        }

        public void onError(Throwable th) {
            this.f38170a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (this.f38171b == size()) {
                this.f38170a.mo33453a(poll());
            }
            offer(t);
        }
    }

    public C13226g3(C5926g0<T> g0Var, int i) {
        super(g0Var);
        this.f38168b = i;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f37851a.mo23893a(new C13227a(i0Var, this.f38168b));
    }
}
