package p195e.p196a.p199x0.p463g;

import java.util.concurrent.TimeUnit;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p447u0.C12315d;

/* renamed from: e.a.x0.g.e */
/* compiled from: ImmediateThinScheduler */
public final class C13676e extends C12282j0 {

    /* renamed from: N */
    static final C12285c f39573N = new C13677a();

    /* renamed from: O */
    static final C12314c f39574O = C12315d.m55419b();

    /* renamed from: b */
    public static final C12282j0 f39575b = new C13676e();

    /* renamed from: e.a.x0.g.e$a */
    /* compiled from: ImmediateThinScheduler */
    static final class C13677a extends C12285c {
        C13677a() {
        }

        @C5937f
        /* renamed from: a */
        public C12314c mo41876a(@C5937f Runnable runnable) {
            runnable.run();
            return C13676e.f39574O;
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return false;
        }

        public void dispose() {
        }

        @C5937f
        /* renamed from: a */
        public C12314c mo41877a(@C5937f Runnable runnable, long j, @C5937f TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
        }

        @C5937f
        /* renamed from: a */
        public C12314c mo42028a(@C5937f Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
        }
    }

    static {
        f39574O.dispose();
    }

    private C13676e() {
    }

    @C5937f
    /* renamed from: a */
    public C12314c mo42021a(@C5937f Runnable runnable) {
        runnable.run();
        return f39574O;
    }

    @C5937f
    /* renamed from: a */
    public C12314c mo42023a(@C5937f Runnable runnable, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
    }

    @C5937f
    /* renamed from: a */
    public C12314c mo42022a(@C5937f Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
    }

    @C5937f
    /* renamed from: a */
    public C12285c mo41871a() {
        return f39573N;
    }
}
