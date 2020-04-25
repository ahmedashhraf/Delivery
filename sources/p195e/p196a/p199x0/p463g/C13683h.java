package p195e.p196a.p199x0.p463g;

import java.util.concurrent.ThreadFactory;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.p198t0.C5937f;

/* renamed from: e.a.x0.g.h */
/* compiled from: NewThreadScheduler */
public final class C13683h extends C12282j0 {

    /* renamed from: N */
    private static final String f39604N = "RxNewThreadScheduler";

    /* renamed from: O */
    private static final C13686k f39605O = new C13686k(f39604N, Math.max(1, Math.min(10, Integer.getInteger(f39606P, 5).intValue())));

    /* renamed from: P */
    private static final String f39606P = "rx2.newthread-priority";

    /* renamed from: b */
    final ThreadFactory f39607b;

    public C13683h() {
        this(f39605O);
    }

    @C5937f
    /* renamed from: a */
    public C12285c mo41871a() {
        return new C13684i(this.f39607b);
    }

    public C13683h(ThreadFactory threadFactory) {
        this.f39607b = threadFactory;
    }
}
