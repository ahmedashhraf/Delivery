package bolts;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: bolts.a */
/* compiled from: AndroidExecutors */
final class C2156a {

    /* renamed from: b */
    private static final C2156a f8587b = new C2156a();

    /* renamed from: c */
    private static final int f8588c = Runtime.getRuntime().availableProcessors();

    /* renamed from: d */
    static final int f8589d;

    /* renamed from: e */
    static final int f8590e;

    /* renamed from: f */
    static final long f8591f = 1;

    /* renamed from: a */
    private final Executor f8592a = new C2158b();

    /* renamed from: bolts.a$b */
    /* compiled from: AndroidExecutors */
    private static class C2158b implements Executor {
        private C2158b() {
        }

        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int i = f8588c;
        f8589d = i + 1;
        f8590e = (i * 2) + 1;
    }

    private C2156a() {
    }

    /* renamed from: a */
    public static ExecutorService m11162a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f8589d, f8590e, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        m11164a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    public static Executor m11165b() {
        return f8587b.f8592a;
    }

    /* renamed from: a */
    public static ExecutorService m11163a(ThreadFactory threadFactory) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f8589d, f8590e, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        m11164a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m11164a(ThreadPoolExecutor threadPoolExecutor, boolean z) {
        if (VERSION.SDK_INT >= 9) {
            threadPoolExecutor.allowCoreThreadTimeOut(z);
        }
    }
}
