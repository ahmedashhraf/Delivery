package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.h0 */
/* compiled from: ObservableDelaySubscriptionOther */
public final class C13234h0<T, U> extends C5923b0<T> {

    /* renamed from: a */
    final C5926g0<? extends T> f38198a;

    /* renamed from: b */
    final C5926g0<U> f38199b;

    /* renamed from: e.a.x0.e.e.h0$a */
    /* compiled from: ObservableDelaySubscriptionOther */
    final class C13235a implements C12280i0<U> {

        /* renamed from: N */
        boolean f38200N;

        /* renamed from: a */
        final C12350g f38202a;

        /* renamed from: b */
        final C12280i0<? super T> f38203b;

        /* renamed from: e.a.x0.e.e.h0$a$a */
        /* compiled from: ObservableDelaySubscriptionOther */
        final class C13236a implements C12280i0<T> {
            C13236a() {
            }

            /* renamed from: a */
            public void mo34123a(C12314c cVar) {
                C13235a.this.f38202a.mo42110b(cVar);
            }

            public void onComplete() {
                C13235a.this.f38203b.onComplete();
            }

            public void onError(Throwable th) {
                C13235a.this.f38203b.onError(th);
            }

            /* renamed from: a */
            public void mo33453a(T t) {
                C13235a.this.f38203b.mo33453a(t);
            }
        }

        C13235a(C12350g gVar, C12280i0<? super T> i0Var) {
            this.f38202a = gVar;
            this.f38203b = i0Var;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            this.f38202a.mo42110b(cVar);
        }

        public void onComplete() {
            if (!this.f38200N) {
                this.f38200N = true;
                C13234h0.this.f38198a.mo23893a(new C13236a());
            }
        }

        public void onError(Throwable th) {
            if (this.f38200N) {
                C12205a.m54894b(th);
                return;
            }
            this.f38200N = true;
            this.f38203b.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(U u) {
            onComplete();
        }
    }

    public C13234h0(C5926g0<? extends T> g0Var, C5926g0<U> g0Var2) {
        this.f38198a = g0Var;
        this.f38199b = g0Var2;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C12350g gVar = new C12350g();
        i0Var.mo34123a((C12314c) gVar);
        this.f38199b.mo23893a(new C13235a(gVar, i0Var));
    }
}
