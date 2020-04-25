package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.l3 */
/* compiled from: ObservableSwitchIfEmpty */
public final class C13303l3<T> extends C13131a<T, T> {

    /* renamed from: b */
    final C5926g0<? extends T> f38445b;

    /* renamed from: e.a.x0.e.e.l3$a */
    /* compiled from: ObservableSwitchIfEmpty */
    static final class C13304a<T> implements C12280i0<T> {

        /* renamed from: N */
        final C12350g f38446N = new C12350g();

        /* renamed from: O */
        boolean f38447O = true;

        /* renamed from: a */
        final C12280i0<? super T> f38448a;

        /* renamed from: b */
        final C5926g0<? extends T> f38449b;

        C13304a(C12280i0<? super T> i0Var, C5926g0<? extends T> g0Var) {
            this.f38448a = i0Var;
            this.f38449b = g0Var;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            this.f38446N.mo42110b(cVar);
        }

        public void onComplete() {
            if (this.f38447O) {
                this.f38447O = false;
                this.f38449b.mo23893a(this);
                return;
            }
            this.f38448a.onComplete();
        }

        public void onError(Throwable th) {
            this.f38448a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (this.f38447O) {
                this.f38447O = false;
            }
            this.f38448a.mo33453a(t);
        }
    }

    public C13303l3(C5926g0<T> g0Var, C5926g0<? extends T> g0Var2) {
        super(g0Var);
        this.f38445b = g0Var2;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C13304a aVar = new C13304a(i0Var, this.f38445b);
        i0Var.mo34123a((C12314c) aVar.f38446N);
        this.f37851a.mo23893a(aVar);
    }
}
