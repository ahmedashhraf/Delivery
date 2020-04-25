package p212io.fabric.sdk.android.p493p.p495b;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14228l;
import p212io.fabric.sdk.android.services.concurrency.internal.C14357b;
import p212io.fabric.sdk.android.services.concurrency.internal.C14361f;
import p212io.fabric.sdk.android.services.concurrency.internal.C14362g;

/* renamed from: io.fabric.sdk.android.p.b.o */
/* compiled from: ExecutorUtils */
public final class C14258o {

    /* renamed from: a */
    private static final long f42057a = 2;

    /* renamed from: io.fabric.sdk.android.p.b.o$a */
    /* compiled from: ExecutorUtils */
    static class C14259a implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ String f42058a;

        /* renamed from: b */
        final /* synthetic */ AtomicLong f42059b;

        /* renamed from: io.fabric.sdk.android.p.b.o$a$a */
        /* compiled from: ExecutorUtils */
        class C14260a extends C14247h {

            /* renamed from: a */
            final /* synthetic */ Runnable f42060a;

            C14260a(Runnable runnable) {
                this.f42060a = runnable;
            }

            public void onRun() {
                this.f42060a.run();
            }
        }

        C14259a(String str, AtomicLong atomicLong) {
            this.f42058a = str;
            this.f42059b = atomicLong;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C14260a(runnable));
            StringBuilder sb = new StringBuilder();
            sb.append(this.f42058a);
            sb.append(this.f42059b.getAndIncrement());
            newThread.setName(sb.toString());
            return newThread;
        }
    }

    /* renamed from: io.fabric.sdk.android.p.b.o$b */
    /* compiled from: ExecutorUtils */
    static class C14261b extends C14247h {

        /* renamed from: N */
        final /* synthetic */ long f42062N;

        /* renamed from: O */
        final /* synthetic */ TimeUnit f42063O;

        /* renamed from: a */
        final /* synthetic */ String f42064a;

        /* renamed from: b */
        final /* synthetic */ ExecutorService f42065b;

        C14261b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.f42064a = str;
            this.f42065b = executorService;
            this.f42062N = j;
            this.f42063O = timeUnit;
        }

        public void onRun() {
            String str = C14215d.f41919m;
            try {
                C14228l j = C14215d.m61672j();
                StringBuilder sb = new StringBuilder();
                sb.append("Executing shutdown hook for ");
                sb.append(this.f42064a);
                j.mo45042d(str, sb.toString());
                this.f42065b.shutdown();
                if (!this.f42065b.awaitTermination(this.f42062N, this.f42063O)) {
                    C14228l j2 = C14215d.m61672j();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f42064a);
                    sb2.append(" did not shut down in the allocated time. Requesting immediate shutdown.");
                    j2.mo45042d(str, sb2.toString());
                    this.f42065b.shutdownNow();
                }
            } catch (InterruptedException unused) {
                C14215d.m61672j().mo45042d(str, String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.f42064a}));
                this.f42065b.shutdownNow();
            }
        }
    }

    private C14258o() {
    }

    /* renamed from: a */
    public static ExecutorService m61862a(String str) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(m61866c(str));
        m61863a(str, newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    /* renamed from: b */
    public static ScheduledExecutorService m61865b(String str) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(m61866c(str));
        m61863a(str, newSingleThreadScheduledExecutor);
        return newSingleThreadScheduledExecutor;
    }

    /* renamed from: c */
    public static final ThreadFactory m61866c(String str) {
        return new C14259a(str, new AtomicLong(1));
    }

    /* renamed from: a */
    public static C14362g m61861a(String str, int i, C14361f fVar, C14357b bVar) {
        C14362g gVar = new C14362g(i, m61866c(str), fVar, bVar);
        m61863a(str, gVar);
        return gVar;
    }

    /* renamed from: a */
    private static final void m61863a(String str, ExecutorService executorService) {
        m61864a(str, executorService, 2, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    public static final void m61864a(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        C14261b bVar = new C14261b(str, executorService, j, timeUnit);
        StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics Shutdown Hook for ");
        sb.append(str);
        runtime.addShutdownHook(new Thread(bVar, sb.toString()));
    }
}
