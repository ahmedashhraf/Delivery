package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12327c;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.y2 */
/* compiled from: ObservableScan */
public final class C13494y2<T> extends C13131a<T, T> {

    /* renamed from: b */
    final C12327c<T, T, T> f39082b;

    /* renamed from: e.a.x0.e.e.y2$a */
    /* compiled from: ObservableScan */
    static final class C13495a<T> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        C12314c f39083N;

        /* renamed from: O */
        T f39084O;

        /* renamed from: P */
        boolean f39085P;

        /* renamed from: a */
        final C12280i0<? super T> f39086a;

        /* renamed from: b */
        final C12327c<T, T, T> f39087b;

        C13495a(C12280i0<? super T> i0Var, C12327c<T, T, T> cVar) {
            this.f39086a = i0Var;
            this.f39087b = cVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f39083N, cVar)) {
                this.f39083N = cVar;
                this.f39086a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f39083N.mo41878d();
        }

        public void dispose() {
            this.f39083N.dispose();
        }

        public void onComplete() {
            if (!this.f39085P) {
                this.f39085P = true;
                this.f39086a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f39085P) {
                C12205a.m54894b(th);
                return;
            }
            this.f39085P = true;
            this.f39086a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f39085P) {
                C12280i0<? super T> i0Var = this.f39086a;
                T t2 = this.f39084O;
                if (t2 == null) {
                    this.f39084O = t;
                    i0Var.mo33453a(t);
                } else {
                    try {
                        T a = C12390b.m55563a(this.f39087b.mo35569a(t2, t), "The value returned by the accumulator is null");
                        this.f39084O = a;
                        i0Var.mo33453a(a);
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        this.f39083N.dispose();
                        onError(th);
                    }
                }
            }
        }
    }

    public C13494y2(C5926g0<T> g0Var, C12327c<T, T, T> cVar) {
        super(g0Var);
        this.f39082b = cVar;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f37851a.mo23893a(new C13495a(i0Var, this.f39082b));
    }
}
