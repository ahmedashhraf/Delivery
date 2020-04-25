package p195e.p196a.p199x0.p464h;

import p195e.p196a.p199x0.p452c.C12392a;
import p195e.p196a.p199x0.p452c.C12403l;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.h.a */
/* compiled from: BasicFuseableConditionalSubscriber */
public abstract class C13712a<T, R> implements C12392a<T>, C12403l<R> {

    /* renamed from: N */
    protected C12403l<T> f39669N;

    /* renamed from: O */
    protected boolean f39670O;

    /* renamed from: P */
    protected int f39671P;

    /* renamed from: a */
    protected final C12392a<? super R> f39672a;

    /* renamed from: b */
    protected C14063d f39673b;

    public C13712a(C12392a<? super R> aVar) {
        this.f39672a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo43084a() {
    }

    /* renamed from: a */
    public final void mo41788a(C14063d dVar) {
        if (C13742j.m58673a(this.f39673b, dVar)) {
            this.f39673b = dVar;
            if (dVar instanceof C12403l) {
                this.f39669N = (C12403l) dVar;
            }
            if (mo43087b()) {
                this.f39672a.mo41788a(this);
                mo43084a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo43086b(int i) {
        C12403l<T> lVar = this.f39669N;
        if (lVar == null || (i & 4) != 0) {
            return 0;
        }
        int a = lVar.mo41855a(i);
        if (a != 0) {
            this.f39671P = a;
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo43087b() {
        return true;
    }

    /* renamed from: c */
    public void mo41813c(long j) {
        this.f39673b.mo41813c(j);
    }

    public void cancel() {
        this.f39673b.cancel();
    }

    public void clear() {
        this.f39669N.clear();
    }

    public boolean isEmpty() {
        return this.f39669N.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onComplete() {
        if (!this.f39670O) {
            this.f39670O = true;
            this.f39672a.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.f39670O) {
            C12205a.m54894b(th);
            return;
        }
        this.f39670O = true;
        this.f39672a.onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43085a(Throwable th) {
        C14398a.m62357b(th);
        this.f39673b.cancel();
        onError(th);
    }

    /* renamed from: a */
    public final boolean mo42104a(R r, R r2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
