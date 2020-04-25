package p212io.fabric.sdk.android.services.concurrency;

import android.annotation.TargetApi;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.fabric.sdk.android.services.concurrency.m */
/* compiled from: PriorityThreadPoolExecutor */
public class C14366m extends ThreadPoolExecutor {

    /* renamed from: N */
    private static final int f42431N;

    /* renamed from: O */
    private static final long f42432O = 1;

    /* renamed from: a */
    private static final int f42433a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b */
    private static final int f42434b;

    /* renamed from: io.fabric.sdk.android.services.concurrency.m$a */
    /* compiled from: PriorityThreadPoolExecutor */
    protected static final class C14367a implements ThreadFactory {

        /* renamed from: a */
        private final int f42435a;

        public C14367a(int i) {
            this.f42435a = i;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(this.f42435a);
            thread.setName("Queue");
            return thread;
        }
    }

    static {
        int i = f42433a;
        f42434b = i + 1;
        f42431N = (i * 2) + 1;
    }

    <T extends Runnable & C14347c & C14368n & C14363j> C14366m(int i, int i2, long j, TimeUnit timeUnit, C14348d<T> dVar, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, dVar, threadFactory);
        prestartAllCoreThreads();
    }

    /* renamed from: a */
    public static <T extends Runnable & C14347c & C14368n & C14363j> C14366m m62132a(int i, int i2) {
        C14366m mVar = new C14366m(i, i2, 1, TimeUnit.SECONDS, new C14348d(), new C14367a(10));
        return mVar;
    }

    /* access modifiers changed from: protected */
    public void afterExecute(Runnable runnable, Throwable th) {
        C14368n nVar = (C14368n) runnable;
        nVar.setFinished(true);
        nVar.setError(th);
        getQueue().mo45311e();
        super.afterExecute(runnable, th);
    }

    @TargetApi(9)
    public void execute(Runnable runnable) {
        if (C14365l.isProperDelegate(runnable)) {
            super.execute(runnable);
        } else {
            super.execute(newTaskFor(runnable, null));
        }
    }

    /* access modifiers changed from: protected */
    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C14354i(runnable, t);
    }

    /* renamed from: a */
    public static C14366m m62131a(int i) {
        return m62132a(i, i);
    }

    public C14348d getQueue() {
        return (C14348d) super.getQueue();
    }

    /* access modifiers changed from: protected */
    public <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new C14354i(callable);
    }

    /* renamed from: a */
    public static C14366m m62130a() {
        return m62132a(f42434b, f42431N);
    }
}
