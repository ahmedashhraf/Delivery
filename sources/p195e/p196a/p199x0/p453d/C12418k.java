package p195e.p196a.p199x0.p453d;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12292n0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12351a;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p467z0.C13789g;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.d.k */
/* compiled from: ConsumerSingleObserver */
public final class C12418k<T> extends AtomicReference<C12314c> implements C12292n0<T>, C12314c, C13789g {
    private static final long serialVersionUID = -7012088219455310787L;

    /* renamed from: a */
    final C12331g<? super T> f35567a;

    /* renamed from: b */
    final C12331g<? super Throwable> f35568b;

    public C12418k(C12331g<? super T> gVar, C12331g<? super Throwable> gVar2) {
        this.f35567a = gVar;
        this.f35568b = gVar2;
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
        lazySet(C12347d.DISPOSED);
        try {
            this.f35568b.mo33410c(th);
        } catch (Throwable th2) {
            C14398a.m62357b(th2);
            C12205a.m54894b((Throwable) new CompositeException(th, th2));
        }
    }

    public void onSuccess(T t) {
        lazySet(C12347d.DISPOSED);
        try {
            this.f35567a.mo33410c(t);
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12205a.m54894b(th);
        }
    }

    /* renamed from: a */
    public boolean mo42160a() {
        return this.f35568b != C12351a.f35506f;
    }
}
