package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12321v;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12351a;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12325a;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p467z0.C13789g;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.c.d */
/* compiled from: MaybeCallbackObserver */
public final class C12961d<T> extends AtomicReference<C12314c> implements C12321v<T>, C12314c, C13789g {
    private static final long serialVersionUID = -6076952298809384986L;

    /* renamed from: N */
    final C12325a f37384N;

    /* renamed from: a */
    final C12331g<? super T> f37385a;

    /* renamed from: b */
    final C12331g<? super Throwable> f37386b;

    public C12961d(C12331g<? super T> gVar, C12331g<? super Throwable> gVar2, C12325a aVar) {
        this.f37385a = gVar;
        this.f37386b = gVar2;
        this.f37384N = aVar;
    }

    /* renamed from: a */
    public void mo41931a(C12314c cVar) {
        C12347d.m55468c(this, cVar);
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return C12347d.m55463a((C12314c) get());
    }

    public void dispose() {
        C12347d.m55465a((AtomicReference<C12314c>) this);
    }

    public void onComplete() {
        lazySet(C12347d.DISPOSED);
        try {
            this.f37384N.run();
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12205a.m54894b(th);
        }
    }

    public void onError(Throwable th) {
        lazySet(C12347d.DISPOSED);
        try {
            this.f37386b.mo33410c(th);
        } catch (Throwable th2) {
            C14398a.m62357b(th2);
            C12205a.m54894b((Throwable) new CompositeException(th, th2));
        }
    }

    public void onSuccess(T t) {
        lazySet(C12347d.DISPOSED);
        try {
            this.f37385a.mo33410c(t);
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12205a.m54894b(th);
        }
    }

    /* renamed from: a */
    public boolean mo42160a() {
        return this.f37386b != C12351a.f35506f;
    }
}
