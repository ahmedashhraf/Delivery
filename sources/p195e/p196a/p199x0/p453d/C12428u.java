package p195e.p196a.p199x0.p453d;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12351a;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12325a;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p467z0.C13789g;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.d.u */
/* compiled from: LambdaObserver */
public final class C12428u<T> extends AtomicReference<C12314c> implements C12280i0<T>, C12314c, C13789g {
    private static final long serialVersionUID = -7251123623727029452L;

    /* renamed from: N */
    final C12325a f35596N;

    /* renamed from: O */
    final C12331g<? super C12314c> f35597O;

    /* renamed from: a */
    final C12331g<? super T> f35598a;

    /* renamed from: b */
    final C12331g<? super Throwable> f35599b;

    public C12428u(C12331g<? super T> gVar, C12331g<? super Throwable> gVar2, C12325a aVar, C12331g<? super C12314c> gVar3) {
        this.f35598a = gVar;
        this.f35599b = gVar2;
        this.f35596N = aVar;
        this.f35597O = gVar3;
    }

    /* renamed from: a */
    public void mo34123a(C12314c cVar) {
        if (C12347d.m55468c(this, cVar)) {
            try {
                this.f35597O.mo33410c(this);
            } catch (Throwable th) {
                C14398a.m62357b(th);
                cVar.dispose();
                onError(th);
            }
        }
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return get() == C12347d.DISPOSED;
    }

    public void dispose() {
        C12347d.m55465a((AtomicReference<C12314c>) this);
    }

    public void onComplete() {
        if (!mo41878d()) {
            lazySet(C12347d.DISPOSED);
            try {
                this.f35596N.run();
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b(th);
            }
        }
    }

    public void onError(Throwable th) {
        if (!mo41878d()) {
            lazySet(C12347d.DISPOSED);
            try {
                this.f35599b.mo33410c(th);
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                C12205a.m54894b((Throwable) new CompositeException(th, th2));
            }
        }
    }

    /* renamed from: a */
    public void mo33453a(T t) {
        if (!mo41878d()) {
            try {
                this.f35598a.mo33410c(t);
            } catch (Throwable th) {
                C14398a.m62357b(th);
                ((C12314c) get()).dispose();
                onError(th);
            }
        }
    }

    /* renamed from: a */
    public boolean mo42160a() {
        return this.f35599b != C12351a.f35506f;
    }
}
