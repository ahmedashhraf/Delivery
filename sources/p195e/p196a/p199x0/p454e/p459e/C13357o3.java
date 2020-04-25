package p195e.p196a.p199x0.p454e.p459e;

import java.util.ArrayDeque;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.o3 */
/* compiled from: ObservableTakeLast */
public final class C13357o3<T> extends C13131a<T, T> {

    /* renamed from: b */
    final int f38598b;

    /* renamed from: e.a.x0.e.e.o3$a */
    /* compiled from: ObservableTakeLast */
    static final class C13358a<T> extends ArrayDeque<T> implements C12280i0<T>, C12314c {
        private static final long serialVersionUID = 7240042530241604978L;

        /* renamed from: N */
        C12314c f38599N;

        /* renamed from: O */
        volatile boolean f38600O;

        /* renamed from: a */
        final C12280i0<? super T> f38601a;

        /* renamed from: b */
        final int f38602b;

        C13358a(C12280i0<? super T> i0Var, int i) {
            this.f38601a = i0Var;
            this.f38602b = i;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38599N, cVar)) {
                this.f38599N = cVar;
                this.f38601a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38600O;
        }

        public void dispose() {
            if (!this.f38600O) {
                this.f38600O = true;
                this.f38599N.dispose();
            }
        }

        public void onComplete() {
            C12280i0<? super T> i0Var = this.f38601a;
            while (!this.f38600O) {
                Object poll = poll();
                if (poll == null) {
                    if (!this.f38600O) {
                        i0Var.onComplete();
                    }
                    return;
                }
                i0Var.mo33453a(poll);
            }
        }

        public void onError(Throwable th) {
            this.f38601a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (this.f38602b == size()) {
                poll();
            }
            offer(t);
        }
    }

    public C13357o3(C5926g0<T> g0Var, int i) {
        super(g0Var);
        this.f38598b = i;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f37851a.mo23893a(new C13358a(i0Var, this.f38598b));
    }
}
