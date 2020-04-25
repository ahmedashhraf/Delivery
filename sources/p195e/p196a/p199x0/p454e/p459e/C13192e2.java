package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.e.e2 */
/* compiled from: ObservableOnErrorNext */
public final class C13192e2<T> extends C13131a<T, T> {

    /* renamed from: N */
    final boolean f38065N;

    /* renamed from: b */
    final C12339o<? super Throwable, ? extends C5926g0<? extends T>> f38066b;

    /* renamed from: e.a.x0.e.e.e2$a */
    /* compiled from: ObservableOnErrorNext */
    static final class C13193a<T> implements C12280i0<T> {

        /* renamed from: N */
        final boolean f38067N;

        /* renamed from: O */
        final C12350g f38068O = new C12350g();

        /* renamed from: P */
        boolean f38069P;

        /* renamed from: Q */
        boolean f38070Q;

        /* renamed from: a */
        final C12280i0<? super T> f38071a;

        /* renamed from: b */
        final C12339o<? super Throwable, ? extends C5926g0<? extends T>> f38072b;

        C13193a(C12280i0<? super T> i0Var, C12339o<? super Throwable, ? extends C5926g0<? extends T>> oVar, boolean z) {
            this.f38071a = i0Var;
            this.f38072b = oVar;
            this.f38067N = z;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            this.f38068O.mo42109a(cVar);
        }

        public void onComplete() {
            if (!this.f38070Q) {
                this.f38070Q = true;
                this.f38069P = true;
                this.f38071a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.f38069P) {
                this.f38069P = true;
                if (!this.f38067N || (th instanceof Exception)) {
                    try {
                        C5926g0 g0Var = (C5926g0) this.f38072b.apply(th);
                        if (g0Var == null) {
                            NullPointerException nullPointerException = new NullPointerException("Observable is null");
                            nullPointerException.initCause(th);
                            this.f38071a.onError(nullPointerException);
                            return;
                        }
                        g0Var.mo23893a(this);
                    } catch (Throwable th2) {
                        C14398a.m62357b(th2);
                        this.f38071a.onError(new CompositeException(th, th2));
                    }
                } else {
                    this.f38071a.onError(th);
                }
            } else if (this.f38070Q) {
                C12205a.m54894b(th);
            } else {
                this.f38071a.onError(th);
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38070Q) {
                this.f38071a.mo33453a(t);
            }
        }
    }

    public C13192e2(C5926g0<T> g0Var, C12339o<? super Throwable, ? extends C5926g0<? extends T>> oVar, boolean z) {
        super(g0Var);
        this.f38066b = oVar;
        this.f38065N = z;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C13193a aVar = new C13193a(i0Var, this.f38066b, this.f38065N);
        i0Var.mo34123a((C12314c) aVar.f38068O);
        this.f37851a.mo23893a(aVar);
    }
}
