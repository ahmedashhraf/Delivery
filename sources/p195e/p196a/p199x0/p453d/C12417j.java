package p195e.p196a.p199x0.p453d;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12325a;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p467z0.C13789g;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.OnErrorNotImplementedException;

/* renamed from: e.a.x0.d.j */
/* compiled from: CallbackCompletableObserver */
public final class C12417j extends AtomicReference<C12314c> implements C12268f, C12314c, C12331g<Throwable>, C13789g {
    private static final long serialVersionUID = -4361286194466301354L;

    /* renamed from: a */
    final C12331g<? super Throwable> f35565a;

    /* renamed from: b */
    final C12325a f35566b;

    public C12417j(C12325a aVar) {
        this.f35565a = this;
        this.f35566b = aVar;
    }

    /* renamed from: a */
    public void mo33410c(Throwable th) {
        C12205a.m54894b((Throwable) new OnErrorNotImplementedException(th));
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return get() == C12347d.DISPOSED;
    }

    public void dispose() {
        C12347d.m55465a((AtomicReference<C12314c>) this);
    }

    public void onComplete() {
        try {
            this.f35566b.run();
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12205a.m54894b(th);
        }
        lazySet(C12347d.DISPOSED);
    }

    public void onError(Throwable th) {
        try {
            this.f35565a.mo33410c(th);
        } catch (Throwable th2) {
            C14398a.m62357b(th2);
            C12205a.m54894b(th2);
        }
        lazySet(C12347d.DISPOSED);
    }

    /* renamed from: a */
    public void mo41921a(C12314c cVar) {
        C12347d.m55468c(this, cVar);
    }

    /* renamed from: a */
    public boolean mo42160a() {
        return this.f35565a != this;
    }

    public C12417j(C12331g<? super Throwable> gVar, C12325a aVar) {
        this.f35565a = gVar;
        this.f35566b = aVar;
    }
}
