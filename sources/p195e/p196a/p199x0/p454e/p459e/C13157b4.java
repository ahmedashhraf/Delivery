package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicBoolean;
import p195e.p196a.C12280i0;
import p195e.p196a.C12282j0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.b4 */
/* compiled from: ObservableUnsubscribeOn */
public final class C13157b4<T> extends C13131a<T, T> {

    /* renamed from: b */
    final C12282j0 f37949b;

    /* renamed from: e.a.x0.e.e.b4$a */
    /* compiled from: ObservableUnsubscribeOn */
    static final class C13158a<T> extends AtomicBoolean implements C12280i0<T>, C12314c {
        private static final long serialVersionUID = 1015244841293359600L;

        /* renamed from: N */
        C12314c f37950N;

        /* renamed from: a */
        final C12280i0<? super T> f37951a;

        /* renamed from: b */
        final C12282j0 f37952b;

        /* renamed from: e.a.x0.e.e.b4$a$a */
        /* compiled from: ObservableUnsubscribeOn */
        final class C13159a implements Runnable {
            C13159a() {
            }

            public void run() {
                C13158a.this.f37950N.dispose();
            }
        }

        C13158a(C12280i0<? super T> i0Var, C12282j0 j0Var) {
            this.f37951a = i0Var;
            this.f37952b = j0Var;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f37950N, cVar)) {
                this.f37950N = cVar;
                this.f37951a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return get();
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f37952b.mo42021a((Runnable) new C13159a());
            }
        }

        public void onComplete() {
            if (!get()) {
                this.f37951a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (get()) {
                C12205a.m54894b(th);
            } else {
                this.f37951a.onError(th);
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!get()) {
                this.f37951a.mo33453a(t);
            }
        }
    }

    public C13157b4(C5926g0<T> g0Var, C12282j0 j0Var) {
        super(g0Var);
        this.f37949b = j0Var;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f37851a.mo23893a(new C13158a(i0Var, this.f37949b));
    }
}
