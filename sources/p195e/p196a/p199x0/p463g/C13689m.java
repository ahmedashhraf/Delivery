package p195e.p196a.p199x0.p463g;

import java.util.concurrent.Callable;

/* renamed from: e.a.x0.g.m */
/* compiled from: ScheduledDirectTask */
public final class C13689m extends C13664a implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    public C13689m(Runnable runnable) {
        super(runnable);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Runnable mo41865a() {
        return super.mo41865a();
    }

    public Void call() throws Exception {
        this.f39539b = Thread.currentThread();
        try {
            this.f39538a.run();
            return null;
        } finally {
            lazySet(C13664a.f39536N);
            this.f39539b = null;
        }
    }
}
