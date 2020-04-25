package p195e.p196a.p199x0.p464h;

import p195e.p196a.p439b1.C12205a;

/* renamed from: e.a.x0.h.d */
/* compiled from: BlockingFirstSubscriber */
public final class C13715d<T> extends C13714c<T> {
    /* renamed from: a */
    public void mo41789a(T t) {
        if (this.f39681a == null) {
            this.f39681a = t;
            this.f39679N.cancel();
            countDown();
        }
    }

    public void onError(Throwable th) {
        if (this.f39681a == null) {
            this.f39682b = th;
        } else {
            C12205a.m54894b(th);
        }
        countDown();
    }
}
