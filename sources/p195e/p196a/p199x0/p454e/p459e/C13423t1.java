package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C12321v;
import p195e.p196a.C5926g0;
import p195e.p196a.C5931s;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.t1 */
/* compiled from: ObservableLastMaybe */
public final class C13423t1<T> extends C5931s<T> {

    /* renamed from: a */
    final C5926g0<T> f38831a;

    /* renamed from: e.a.x0.e.e.t1$a */
    /* compiled from: ObservableLastMaybe */
    static final class C13424a<T> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        T f38832N;

        /* renamed from: a */
        final C12321v<? super T> f38833a;

        /* renamed from: b */
        C12314c f38834b;

        C13424a(C12321v<? super T> vVar) {
            this.f38833a = vVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38834b, cVar)) {
                this.f38834b = cVar;
                this.f38833a.mo41931a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38834b == C12347d.DISPOSED;
        }

        public void dispose() {
            this.f38834b.dispose();
            this.f38834b = C12347d.DISPOSED;
        }

        public void onComplete() {
            this.f38834b = C12347d.DISPOSED;
            T t = this.f38832N;
            if (t != null) {
                this.f38832N = null;
                this.f38833a.onSuccess(t);
                return;
            }
            this.f38833a.onComplete();
        }

        public void onError(Throwable th) {
            this.f38834b = C12347d.DISPOSED;
            this.f38832N = null;
            this.f38833a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f38832N = t;
        }
    }

    public C13423t1(C5926g0<T> g0Var) {
        this.f38831a = g0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f38831a.mo23893a(new C13424a(vVar));
    }
}
