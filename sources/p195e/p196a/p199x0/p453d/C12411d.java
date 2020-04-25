package p195e.p196a.p199x0.p453d;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12292n0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12326b;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.d.d */
/* compiled from: BiConsumerSingleObserver */
public final class C12411d<T> extends AtomicReference<C12314c> implements C12292n0<T>, C12314c {
    private static final long serialVersionUID = 4943102778943297569L;

    /* renamed from: a */
    final C12326b<? super T, ? super Throwable> f35554a;

    public C12411d(C12326b<? super T, ? super Throwable> bVar) {
        this.f35554a = bVar;
    }

    /* renamed from: a */
    public void mo41974a(C12314c cVar) {
        C12347d.m55468c(this, cVar);
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return get() == C12347d.DISPOSED;
    }

    public void dispose() {
        C12347d.m55465a((AtomicReference<C12314c>) this);
    }

    public void onError(Throwable th) {
        try {
            lazySet(C12347d.DISPOSED);
            this.f35554a.mo42088a(null, th);
        } catch (Throwable th2) {
            C14398a.m62357b(th2);
            C12205a.m54894b((Throwable) new CompositeException(th, th2));
        }
    }

    public void onSuccess(T t) {
        try {
            lazySet(C12347d.DISPOSED);
            this.f35554a.mo42088a(t, null);
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12205a.m54894b(th);
        }
    }
}
