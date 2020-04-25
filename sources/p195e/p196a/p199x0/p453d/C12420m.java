package p195e.p196a.p199x0.p453d;

import p195e.p196a.C12280i0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.d.m */
/* compiled from: DeferredScalarObserver */
public abstract class C12420m<T, R> extends C12419l<R> implements C12280i0<T> {
    private static final long serialVersionUID = -266195175408988651L;

    /* renamed from: S */
    protected C12314c f35576S;

    public C12420m(C12280i0<? super R> i0Var) {
        super(i0Var);
    }

    /* renamed from: a */
    public void mo34123a(C12314c cVar) {
        if (C12347d.m55464a(this.f35576S, cVar)) {
            this.f35576S = cVar;
            this.f35574a.mo34123a((C12314c) this);
        }
    }

    public void dispose() {
        super.dispose();
        this.f35576S.dispose();
    }

    public void onComplete() {
        T t = this.f35575b;
        if (t != null) {
            this.f35575b = null;
            mo42163b(t);
            return;
        }
        mo42161a();
    }

    public void onError(Throwable th) {
        this.f35575b = null;
        mo42162a(th);
    }
}
