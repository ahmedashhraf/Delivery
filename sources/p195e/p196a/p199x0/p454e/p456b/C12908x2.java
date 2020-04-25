package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12292n0;
import p195e.p196a.C12297q;
import p195e.p196a.C5928k0;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12327c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.x2 */
/* compiled from: FlowableReduceSeedSingle */
public final class C12908x2<T, R> extends C5928k0<R> {

    /* renamed from: N */
    final C12327c<R, ? super T, R> f37181N;

    /* renamed from: a */
    final C6007b<T> f37182a;

    /* renamed from: b */
    final R f37183b;

    /* renamed from: e.a.x0.e.b.x2$a */
    /* compiled from: FlowableReduceSeedSingle */
    static final class C12909a<T, R> implements C12297q<T>, C12314c {

        /* renamed from: N */
        R f37184N;

        /* renamed from: O */
        C14063d f37185O;

        /* renamed from: a */
        final C12292n0<? super R> f37186a;

        /* renamed from: b */
        final C12327c<R, ? super T, R> f37187b;

        C12909a(C12292n0<? super R> n0Var, C12327c<R, ? super T, R> cVar, R r) {
            this.f37186a = n0Var;
            this.f37184N = r;
            this.f37187b = cVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f37185O, dVar)) {
                this.f37185O = dVar;
                this.f37186a.mo41974a(this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37185O == C13742j.CANCELLED;
        }

        public void dispose() {
            this.f37185O.cancel();
            this.f37185O = C13742j.CANCELLED;
        }

        public void onComplete() {
            R r = this.f37184N;
            if (r != null) {
                this.f37184N = null;
                this.f37185O = C13742j.CANCELLED;
                this.f37186a.onSuccess(r);
            }
        }

        public void onError(Throwable th) {
            if (this.f37184N != null) {
                this.f37184N = null;
                this.f37185O = C13742j.CANCELLED;
                this.f37186a.onError(th);
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            R r = this.f37184N;
            if (r != null) {
                try {
                    this.f37184N = C12390b.m55563a(this.f37187b.mo35569a(r, t), "The reducer returned a null value");
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f37185O.cancel();
                    onError(th);
                }
            }
        }
    }

    public C12908x2(C6007b<T> bVar, R r, C12327c<R, ? super T, R> cVar) {
        this.f37182a = bVar;
        this.f37183b = r;
        this.f37181N = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super R> n0Var) {
        this.f37182a.mo24397a(new C12909a(n0Var, this.f37181N, this.f37183b));
    }
}
