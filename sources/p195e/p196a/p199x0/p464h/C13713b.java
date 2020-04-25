package p195e.p196a.p199x0.p464h;

import p195e.p196a.C12297q;
import p195e.p196a.p199x0.p452c.C12403l;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.h.b */
/* compiled from: BasicFuseableSubscriber */
public abstract class C13713b<T, R> implements C12297q<T>, C12403l<R> {

    /* renamed from: N */
    protected C12403l<T> f39674N;

    /* renamed from: O */
    protected boolean f39675O;

    /* renamed from: P */
    protected int f39676P;

    /* renamed from: a */
    protected final C14062c<? super R> f39677a;

    /* renamed from: b */
    protected C14063d f39678b;

    public C13713b(C14062c<? super R> cVar) {
        this.f39677a = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo43088a() {
    }

    /* renamed from: a */
    public final void mo41788a(C14063d dVar) {
        if (C13742j.m58673a(this.f39678b, dVar)) {
            this.f39678b = dVar;
            if (dVar instanceof C12403l) {
                this.f39674N = (C12403l) dVar;
            }
            if (mo43091b()) {
                this.f39677a.mo41788a((C14063d) this);
                mo43088a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo43090b(int i) {
        C12403l<T> lVar = this.f39674N;
        if (lVar == null || (i & 4) != 0) {
            return 0;
        }
        int a = lVar.mo41855a(i);
        if (a != 0) {
            this.f39676P = a;
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo43091b() {
        return true;
    }

    /* renamed from: c */
    public void mo41813c(long j) {
        this.f39678b.mo41813c(j);
    }

    public void cancel() {
        this.f39678b.cancel();
    }

    public void clear() {
        this.f39674N.clear();
    }

    public boolean isEmpty() {
        return this.f39674N.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onComplete() {
        if (!this.f39675O) {
            this.f39675O = true;
            this.f39677a.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.f39675O) {
            C12205a.m54894b(th);
            return;
        }
        this.f39675O = true;
        this.f39677a.onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43089a(Throwable th) {
        C14398a.m62357b(th);
        this.f39678b.cancel();
        onError(th);
    }

    /* renamed from: a */
    public final boolean mo42104a(R r, R r2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
