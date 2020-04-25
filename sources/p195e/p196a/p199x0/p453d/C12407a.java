package p195e.p196a.p199x0.p453d;

import p195e.p196a.C12280i0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p452c.C12401j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.d.a */
/* compiled from: BasicFuseableObserver */
public abstract class C12407a<T, R> implements C12280i0<T>, C12401j<R> {

    /* renamed from: N */
    protected C12401j<T> f35547N;

    /* renamed from: O */
    protected boolean f35548O;

    /* renamed from: P */
    protected int f35549P;

    /* renamed from: a */
    protected final C12280i0<? super R> f35550a;

    /* renamed from: b */
    protected C12314c f35551b;

    public C12407a(C12280i0<? super R> i0Var) {
        this.f35550a = i0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo42148a() {
    }

    /* renamed from: a */
    public final void mo34123a(C12314c cVar) {
        if (C12347d.m55464a(this.f35551b, cVar)) {
            this.f35551b = cVar;
            if (cVar instanceof C12401j) {
                this.f35547N = (C12401j) cVar;
            }
            if (mo42151b()) {
                this.f35550a.mo34123a((C12314c) this);
                mo42148a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo42150b(int i) {
        C12401j<T> jVar = this.f35547N;
        if (jVar == null || (i & 4) != 0) {
            return 0;
        }
        int a = jVar.mo41855a(i);
        if (a != 0) {
            this.f35549P = a;
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo42151b() {
        return true;
    }

    public void clear() {
        this.f35547N.clear();
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return this.f35551b.mo41878d();
    }

    public void dispose() {
        this.f35551b.dispose();
    }

    public boolean isEmpty() {
        return this.f35547N.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onComplete() {
        if (!this.f35548O) {
            this.f35548O = true;
            this.f35550a.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.f35548O) {
            C12205a.m54894b(th);
            return;
        }
        this.f35548O = true;
        this.f35550a.onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42149a(Throwable th) {
        C14398a.m62357b(th);
        this.f35551b.dispose();
        onError(th);
    }

    /* renamed from: a */
    public final boolean mo42104a(R r, R r2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
