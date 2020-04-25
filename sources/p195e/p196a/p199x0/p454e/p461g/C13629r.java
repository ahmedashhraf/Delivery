package p195e.p196a.p199x0.p454e.p461g;

import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.g.r */
/* compiled from: SingleDoOnSubscribe */
public final class C13629r<T> extends C5928k0<T> {

    /* renamed from: a */
    final C5930q0<T> f39440a;

    /* renamed from: b */
    final C12331g<? super C12314c> f39441b;

    /* renamed from: e.a.x0.e.g.r$a */
    /* compiled from: SingleDoOnSubscribe */
    static final class C13630a<T> implements C12292n0<T> {

        /* renamed from: N */
        boolean f39442N;

        /* renamed from: a */
        final C12292n0<? super T> f39443a;

        /* renamed from: b */
        final C12331g<? super C12314c> f39444b;

        C13630a(C12292n0<? super T> n0Var, C12331g<? super C12314c> gVar) {
            this.f39443a = n0Var;
            this.f39444b = gVar;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            try {
                this.f39444b.mo33410c(cVar);
                this.f39443a.mo41974a(cVar);
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f39442N = true;
                cVar.dispose();
                C12348e.m55477a(th, this.f39443a);
            }
        }

        public void onError(Throwable th) {
            if (this.f39442N) {
                C12205a.m54894b(th);
            } else {
                this.f39443a.onError(th);
            }
        }

        public void onSuccess(T t) {
            if (!this.f39442N) {
                this.f39443a.onSuccess(t);
            }
        }
    }

    public C13629r(C5930q0<T> q0Var, C12331g<? super C12314c> gVar) {
        this.f39440a = q0Var;
        this.f39441b = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f39440a.mo24192a(new C13630a(n0Var, this.f39441b));
    }
}
