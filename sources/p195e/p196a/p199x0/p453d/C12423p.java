package p195e.p196a.p199x0.p453d;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12325a;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p449w0.C12342r;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.d.p */
/* compiled from: ForEachWhileObserver */
public final class C12423p<T> extends AtomicReference<C12314c> implements C12280i0<T>, C12314c {
    private static final long serialVersionUID = -4403180040475402120L;

    /* renamed from: N */
    final C12325a f35581N;

    /* renamed from: O */
    boolean f35582O;

    /* renamed from: a */
    final C12342r<? super T> f35583a;

    /* renamed from: b */
    final C12331g<? super Throwable> f35584b;

    public C12423p(C12342r<? super T> rVar, C12331g<? super Throwable> gVar, C12325a aVar) {
        this.f35583a = rVar;
        this.f35584b = gVar;
        this.f35581N = aVar;
    }

    /* renamed from: a */
    public void mo34123a(C12314c cVar) {
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
        if (!this.f35582O) {
            this.f35582O = true;
            try {
                this.f35581N.run();
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b(th);
            }
        }
    }

    public void onError(Throwable th) {
        if (this.f35582O) {
            C12205a.m54894b(th);
            return;
        }
        this.f35582O = true;
        try {
            this.f35584b.mo33410c(th);
        } catch (Throwable th2) {
            C14398a.m62357b(th2);
            C12205a.m54894b((Throwable) new CompositeException(th, th2));
        }
    }

    /* renamed from: a */
    public void mo33453a(T t) {
        if (!this.f35582O) {
            try {
                if (!this.f35583a.mo41812b(t)) {
                    dispose();
                    onComplete();
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                dispose();
                onError(th);
            }
        }
    }
}
