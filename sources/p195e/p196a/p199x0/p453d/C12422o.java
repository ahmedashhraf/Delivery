package p195e.p196a.p199x0.p453d;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p467z0.C13789g;
import p212io.reactivex.exceptions.OnErrorNotImplementedException;

/* renamed from: e.a.x0.d.o */
/* compiled from: EmptyCompletableObserver */
public final class C12422o extends AtomicReference<C12314c> implements C12268f, C12314c, C13789g {
    private static final long serialVersionUID = -7545121636549663526L;

    /* renamed from: a */
    public void mo41921a(C12314c cVar) {
        C12347d.m55468c(this, cVar);
    }

    /* renamed from: a */
    public boolean mo42160a() {
        return false;
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return get() == C12347d.DISPOSED;
    }

    public void dispose() {
        C12347d.m55465a((AtomicReference<C12314c>) this);
    }

    public void onComplete() {
        lazySet(C12347d.DISPOSED);
    }

    public void onError(Throwable th) {
        lazySet(C12347d.DISPOSED);
        C12205a.m54894b((Throwable) new OnErrorNotImplementedException(th));
    }
}
