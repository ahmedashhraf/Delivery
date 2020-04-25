package p076c.p112d.p113a.p114a.p118d.p123e;

import androidx.annotation.C0193h0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: c.d.a.a.d.e.c */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
final class C2622c implements C2621b {
    private C2622c() {
    }

    @C0193h0
    /* renamed from: a */
    public final ExecutorService mo10136a(ThreadFactory threadFactory, int i) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @C0193h0
    /* renamed from: a */
    public final ScheduledExecutorService mo10137a(int i, ThreadFactory threadFactory, int i2) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
    }
}
