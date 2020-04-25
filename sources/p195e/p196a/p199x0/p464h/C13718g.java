package p195e.p196a.p199x0.p464h;

import p195e.p196a.C12297q;
import p195e.p196a.p199x0.p465i.C13738f;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.h.g */
/* compiled from: DeferredScalarSubscriber */
public abstract class C13718g<T, R> extends C13738f<R> implements C12297q<T> {
    private static final long serialVersionUID = 2984505488220891551L;

    /* renamed from: V */
    protected C14063d f39685V;

    /* renamed from: W */
    protected boolean f39686W;

    public C13718g(C14062c<? super R> cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public void mo41788a(C14063d dVar) {
        if (C13742j.m58673a(this.f39685V, dVar)) {
            this.f39685V = dVar;
            this.f39781a.mo41788a((C14063d) this);
            dVar.mo41813c(Long.MAX_VALUE);
        }
    }

    public void cancel() {
        super.cancel();
        this.f39685V.cancel();
    }

    public void onComplete() {
        if (this.f39686W) {
            mo43123c(this.f39782b);
        } else {
            this.f39781a.onComplete();
        }
    }

    public void onError(Throwable th) {
        this.f39782b = null;
        this.f39781a.onError(th);
    }
}
