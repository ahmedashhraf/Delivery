package p195e.p196a.p199x0.p463g;

import p195e.p196a.p439b1.C12205a;

/* renamed from: e.a.x0.g.l */
/* compiled from: ScheduledDirectPeriodicTask */
public final class C13688l extends C13664a implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    public C13688l(Runnable runnable) {
        super(runnable);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Runnable mo41865a() {
        return super.mo41865a();
    }

    public void run() {
        this.f39539b = Thread.currentThread();
        try {
            this.f39538a.run();
            this.f39539b = null;
        } catch (Throwable th) {
            this.f39539b = null;
            lazySet(C13664a.f39536N);
            C12205a.m54894b(th);
        }
    }
}
