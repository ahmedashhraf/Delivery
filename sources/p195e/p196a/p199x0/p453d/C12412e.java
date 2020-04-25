package p195e.p196a.p199x0.p453d;

import java.util.concurrent.CountDownLatch;
import p195e.p196a.C12280i0;
import p195e.p196a.p199x0.p200j.C13748e;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.d.e */
/* compiled from: BlockingBaseObserver */
public abstract class C12412e<T> extends CountDownLatch implements C12280i0<T>, C12314c {

    /* renamed from: N */
    C12314c f35555N;

    /* renamed from: O */
    volatile boolean f35556O;

    /* renamed from: a */
    T f35557a;

    /* renamed from: b */
    Throwable f35558b;

    public C12412e() {
        super(1);
    }

    /* renamed from: a */
    public final void mo34123a(C12314c cVar) {
        this.f35555N = cVar;
        if (this.f35556O) {
            cVar.dispose();
        }
    }

    /* renamed from: d */
    public final boolean mo41878d() {
        return this.f35556O;
    }

    public final void dispose() {
        this.f35556O = true;
        C12314c cVar = this.f35555N;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public final void onComplete() {
        countDown();
    }

    /* renamed from: a */
    public final T mo42152a() {
        if (getCount() != 0) {
            try {
                C13748e.m58701a();
                await();
            } catch (InterruptedException e) {
                dispose();
                throw C13754k.m58724c(e);
            }
        }
        Throwable th = this.f35558b;
        if (th == null) {
            return this.f35557a;
        }
        throw C13754k.m58724c(th);
    }
}
