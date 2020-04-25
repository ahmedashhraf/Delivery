package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12325a;
import p212io.reactivex.exceptions.C14398a;

@C5936e
/* renamed from: e.a.x0.e.g.n */
/* compiled from: SingleDoFinally */
public final class C13611n<T> extends C5928k0<T> {

    /* renamed from: a */
    final C5930q0<T> f39402a;

    /* renamed from: b */
    final C12325a f39403b;

    /* renamed from: e.a.x0.e.g.n$a */
    /* compiled from: SingleDoFinally */
    static final class C13612a<T> extends AtomicInteger implements C12292n0<T>, C12314c {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: N */
        C12314c f39404N;

        /* renamed from: a */
        final C12292n0<? super T> f39405a;

        /* renamed from: b */
        final C12325a f39406b;

        C13612a(C12292n0<? super T> n0Var, C12325a aVar) {
            this.f39405a = n0Var;
            this.f39406b = aVar;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            if (C12347d.m55464a(this.f39404N, cVar)) {
                this.f39404N = cVar;
                this.f39405a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f39404N.mo41878d();
        }

        public void dispose() {
            this.f39404N.dispose();
            mo43004a();
        }

        public void onError(Throwable th) {
            this.f39405a.onError(th);
            mo43004a();
        }

        public void onSuccess(T t) {
            this.f39405a.onSuccess(t);
            mo43004a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo43004a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f39406b.run();
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    C12205a.m54894b(th);
                }
            }
        }
    }

    public C13611n(C5930q0<T> q0Var, C12325a aVar) {
        this.f39402a = q0Var;
        this.f39403b = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f39402a.mo24192a(new C13612a(n0Var, this.f39403b));
    }
}
