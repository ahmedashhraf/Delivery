package p076c.p112d.p113a.p114a.p118d.p121c;

import androidx.annotation.C0193h0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: c.d.a.a.d.c.p */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C2610p implements C2606l {
    private C2610p() {
    }

    @C0193h0
    /* renamed from: a */
    public final ExecutorService mo10124a(int i, int i2) {
        return mo10125a(4, Executors.defaultThreadFactory(), i2);
    }

    @C0193h0
    /* renamed from: a */
    public final ExecutorService mo10125a(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
