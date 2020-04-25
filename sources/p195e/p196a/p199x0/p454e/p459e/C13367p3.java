package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.p3 */
/* compiled from: ObservableTakeLastOne */
public final class C13367p3<T> extends C13131a<T, T> {

    /* renamed from: e.a.x0.e.e.p3$a */
    /* compiled from: ObservableTakeLastOne */
    static final class C13368a<T> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        T f38624N;

        /* renamed from: a */
        final C12280i0<? super T> f38625a;

        /* renamed from: b */
        C12314c f38626b;

        C13368a(C12280i0<? super T> i0Var) {
            this.f38625a = i0Var;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38626b, cVar)) {
                this.f38626b = cVar;
                this.f38625a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38626b.mo41878d();
        }

        public void dispose() {
            this.f38624N = null;
            this.f38626b.dispose();
        }

        public void onComplete() {
            mo42837a();
        }

        public void onError(Throwable th) {
            this.f38624N = null;
            this.f38625a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f38624N = t;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42837a() {
            T t = this.f38624N;
            if (t != null) {
                this.f38624N = null;
                this.f38625a.mo33453a(t);
            }
            this.f38625a.onComplete();
        }
    }

    public C13367p3(C5926g0<T> g0Var) {
        super(g0Var);
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f37851a.mo23893a(new C13368a(i0Var));
    }
}
