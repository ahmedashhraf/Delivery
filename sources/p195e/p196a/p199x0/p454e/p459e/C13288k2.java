package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C12321v;
import p195e.p196a.C5926g0;
import p195e.p196a.C5931s;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12327c;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.k2 */
/* compiled from: ObservableReduceMaybe */
public final class C13288k2<T> extends C5931s<T> {

    /* renamed from: a */
    final C5926g0<T> f38402a;

    /* renamed from: b */
    final C12327c<T, T, T> f38403b;

    /* renamed from: e.a.x0.e.e.k2$a */
    /* compiled from: ObservableReduceMaybe */
    static final class C13289a<T> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        boolean f38404N;

        /* renamed from: O */
        T f38405O;

        /* renamed from: P */
        C12314c f38406P;

        /* renamed from: a */
        final C12321v<? super T> f38407a;

        /* renamed from: b */
        final C12327c<T, T, T> f38408b;

        C13289a(C12321v<? super T> vVar, C12327c<T, T, T> cVar) {
            this.f38407a = vVar;
            this.f38408b = cVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38406P, cVar)) {
                this.f38406P = cVar;
                this.f38407a.mo41931a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38406P.mo41878d();
        }

        public void dispose() {
            this.f38406P.dispose();
        }

        public void onComplete() {
            if (!this.f38404N) {
                this.f38404N = true;
                T t = this.f38405O;
                this.f38405O = null;
                if (t != null) {
                    this.f38407a.onSuccess(t);
                } else {
                    this.f38407a.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f38404N) {
                C12205a.m54894b(th);
                return;
            }
            this.f38404N = true;
            this.f38405O = null;
            this.f38407a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38404N) {
                T t2 = this.f38405O;
                if (t2 == null) {
                    this.f38405O = t;
                    return;
                }
                try {
                    this.f38405O = C12390b.m55563a(this.f38408b.mo35569a(t2, t), "The reducer returned a null value");
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f38406P.dispose();
                    onError(th);
                }
            }
        }
    }

    public C13288k2(C5926g0<T> g0Var, C12327c<T, T, T> cVar) {
        this.f38402a = g0Var;
        this.f38403b = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f38402a.mo23893a(new C13289a(vVar, this.f38403b));
    }
}
