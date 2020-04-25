package p195e.p196a.p199x0.p464h;

import java.util.concurrent.CountDownLatch;
import p195e.p196a.C12297q;
import p195e.p196a.p199x0.p200j.C13748e;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.h.c */
/* compiled from: BlockingBaseSubscriber */
public abstract class C13714c<T> extends CountDownLatch implements C12297q<T> {

    /* renamed from: N */
    C14063d f39679N;

    /* renamed from: O */
    volatile boolean f39680O;

    /* renamed from: a */
    T f39681a;

    /* renamed from: b */
    Throwable f39682b;

    public C13714c() {
        super(1);
    }

    /* renamed from: a */
    public final void mo41788a(C14063d dVar) {
        if (C13742j.m58673a(this.f39679N, dVar)) {
            this.f39679N = dVar;
            if (!this.f39680O) {
                dVar.mo41813c(Long.MAX_VALUE);
                if (this.f39680O) {
                    this.f39679N = C13742j.CANCELLED;
                    dVar.cancel();
                }
            }
        }
    }

    public final void onComplete() {
        countDown();
    }

    /* renamed from: a */
    public final T mo43092a() {
        if (getCount() != 0) {
            try {
                C13748e.m58701a();
                await();
            } catch (InterruptedException e) {
                C14063d dVar = this.f39679N;
                this.f39679N = C13742j.CANCELLED;
                if (dVar != null) {
                    dVar.cancel();
                }
                throw C13754k.m58724c(e);
            }
        }
        Throwable th = this.f39682b;
        if (th == null) {
            return this.f39681a;
        }
        throw C13754k.m58724c(th);
    }
}
