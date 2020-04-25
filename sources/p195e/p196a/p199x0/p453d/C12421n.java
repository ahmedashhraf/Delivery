package p195e.p196a.p199x0.p453d;

import p195e.p196a.C12280i0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12325a;
import p195e.p196a.p449w0.C12331g;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.d.n */
/* compiled from: DisposableLambdaObserver */
public final class C12421n<T> implements C12280i0<T>, C12314c {

    /* renamed from: N */
    final C12325a f35577N;

    /* renamed from: O */
    C12314c f35578O;

    /* renamed from: a */
    final C12280i0<? super T> f35579a;

    /* renamed from: b */
    final C12331g<? super C12314c> f35580b;

    public C12421n(C12280i0<? super T> i0Var, C12331g<? super C12314c> gVar, C12325a aVar) {
        this.f35579a = i0Var;
        this.f35580b = gVar;
        this.f35577N = aVar;
    }

    /* renamed from: a */
    public void mo34123a(C12314c cVar) {
        try {
            this.f35580b.mo33410c(cVar);
            if (C12347d.m55464a(this.f35578O, cVar)) {
                this.f35578O = cVar;
                this.f35579a.mo34123a((C12314c) this);
            }
        } catch (Throwable th) {
            C14398a.m62357b(th);
            cVar.dispose();
            this.f35578O = C12347d.DISPOSED;
            C12348e.m55476a(th, this.f35579a);
        }
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return this.f35578O.mo41878d();
    }

    public void dispose() {
        try {
            this.f35577N.run();
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12205a.m54894b(th);
        }
        this.f35578O.dispose();
    }

    public void onComplete() {
        if (this.f35578O != C12347d.DISPOSED) {
            this.f35579a.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.f35578O != C12347d.DISPOSED) {
            this.f35579a.onError(th);
        } else {
            C12205a.m54894b(th);
        }
    }

    /* renamed from: a */
    public void mo33453a(T t) {
        this.f35579a.mo33453a(t);
    }
}
