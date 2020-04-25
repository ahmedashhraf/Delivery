package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.Callable;
import p195e.p196a.C12292n0;
import p195e.p196a.C12297q;
import p195e.p196a.C5928k0;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12393b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12326b;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.t */
/* compiled from: FlowableCollectSingle */
public final class C12834t<T, U> extends C5928k0<U> implements C12393b<U> {

    /* renamed from: N */
    final C12326b<? super U, ? super T> f36883N;

    /* renamed from: a */
    final C5929l<T> f36884a;

    /* renamed from: b */
    final Callable<? extends U> f36885b;

    /* renamed from: e.a.x0.e.b.t$a */
    /* compiled from: FlowableCollectSingle */
    static final class C12835a<T, U> implements C12297q<T>, C12314c {

        /* renamed from: N */
        final U f36886N;

        /* renamed from: O */
        C14063d f36887O;

        /* renamed from: P */
        boolean f36888P;

        /* renamed from: a */
        final C12292n0<? super U> f36889a;

        /* renamed from: b */
        final C12326b<? super U, ? super T> f36890b;

        C12835a(C12292n0<? super U> n0Var, U u, C12326b<? super U, ? super T> bVar) {
            this.f36889a = n0Var;
            this.f36890b = bVar;
            this.f36886N = u;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36887O, dVar)) {
                this.f36887O = dVar;
                this.f36889a.mo41974a(this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f36887O == C13742j.CANCELLED;
        }

        public void dispose() {
            this.f36887O.cancel();
            this.f36887O = C13742j.CANCELLED;
        }

        public void onComplete() {
            if (!this.f36888P) {
                this.f36888P = true;
                this.f36887O = C13742j.CANCELLED;
                this.f36889a.onSuccess(this.f36886N);
            }
        }

        public void onError(Throwable th) {
            if (this.f36888P) {
                C12205a.m54894b(th);
                return;
            }
            this.f36888P = true;
            this.f36887O = C13742j.CANCELLED;
            this.f36889a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36888P) {
                try {
                    this.f36890b.mo42088a(this.f36886N, t);
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f36887O.cancel();
                    onError(th);
                }
            }
        }
    }

    public C12834t(C5929l<T> lVar, Callable<? extends U> callable, C12326b<? super U, ? super T> bVar) {
        this.f36884a = lVar;
        this.f36885b = callable;
        this.f36883N = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super U> n0Var) {
        try {
            this.f36884a.mo24393a((C12297q<? super T>) new C12835a<Object>(n0Var, C12390b.m55563a(this.f36885b.call(), "The initialSupplier returned a null value"), this.f36883N));
        } catch (Throwable th) {
            C12348e.m55477a(th, n0Var);
        }
    }

    /* renamed from: b */
    public C5929l<U> mo42139b() {
        return C12205a.m54871a((C5929l<T>) new C12804s<T>(this.f36884a, this.f36885b, this.f36883N));
    }
}
