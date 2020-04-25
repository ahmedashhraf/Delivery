package p195e.p196a.p447u0;

import java.util.concurrent.Future;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12351a;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p449w0.C12325a;
import p205i.p211e.C14063d;

/* renamed from: e.a.u0.d */
/* compiled from: Disposables */
public final class C12315d {
    private C12315d() {
        throw new IllegalStateException("No instances!");
    }

    @C5937f
    /* renamed from: a */
    public static C12314c m55416a(@C5937f Runnable runnable) {
        C12390b.m55563a(runnable, "run is null");
        return new C12318g(runnable);
    }

    @C5937f
    /* renamed from: b */
    public static C12314c m55419b() {
        return m55416a(C12351a.f35502b);
    }

    @C5937f
    /* renamed from: a */
    public static C12314c m55414a(@C5937f C12325a aVar) {
        C12390b.m55563a(aVar, "run is null");
        return new C12312a(aVar);
    }

    @C5937f
    /* renamed from: a */
    public static C12314c m55417a(@C5937f Future<?> future) {
        C12390b.m55563a(future, "future is null");
        return m55418a(future, true);
    }

    @C5937f
    /* renamed from: a */
    public static C12314c m55418a(@C5937f Future<?> future, boolean z) {
        C12390b.m55563a(future, "future is null");
        return new C12316e(future, z);
    }

    @C5937f
    /* renamed from: a */
    public static C12314c m55415a(@C5937f C14063d dVar) {
        C12390b.m55563a(dVar, "subscription is null");
        return new C12320i(dVar);
    }

    @C5937f
    /* renamed from: a */
    public static C12314c m55413a() {
        return C12348e.INSTANCE;
    }
}
