package p195e.p196a.p199x0.p463g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: e.a.x0.g.p */
/* compiled from: SchedulerPoolFactory */
public final class C13693p {

    /* renamed from: a */
    static final String f39621a = "rx2.purge-enabled";

    /* renamed from: b */
    public static final boolean f39622b;

    /* renamed from: c */
    static final String f39623c = "rx2.purge-period-seconds";

    /* renamed from: d */
    public static final int f39624d;

    /* renamed from: e */
    static final AtomicReference<ScheduledExecutorService> f39625e = new AtomicReference<>();

    /* renamed from: f */
    static final Map<ScheduledThreadPoolExecutor, Object> f39626f = new ConcurrentHashMap();

    /* renamed from: e.a.x0.g.p$a */
    /* compiled from: SchedulerPoolFactory */
    static final class C13694a {

        /* renamed from: a */
        boolean f39627a;

        /* renamed from: b */
        int f39628b;

        C13694a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo43073a(Properties properties) {
            String str = C13693p.f39621a;
            if (properties.containsKey(str)) {
                this.f39627a = Boolean.parseBoolean(properties.getProperty(str));
            } else {
                this.f39627a = true;
            }
            if (this.f39627a) {
                String str2 = C13693p.f39623c;
                if (properties.containsKey(str2)) {
                    try {
                        this.f39628b = Integer.parseInt(properties.getProperty(str2));
                        return;
                    } catch (NumberFormatException unused) {
                        this.f39628b = 1;
                        return;
                    }
                }
            }
            this.f39628b = 1;
        }
    }

    /* renamed from: e.a.x0.g.p$b */
    /* compiled from: SchedulerPoolFactory */
    static final class C13695b implements Runnable {
        C13695b() {
        }

        public void run() {
            Iterator it = new ArrayList(C13693p.f39626f.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C13693p.f39626f.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        C13694a aVar = new C13694a();
        aVar.mo43073a(properties);
        f39622b = aVar.f39627a;
        f39624d = aVar.f39628b;
        m58536b();
    }

    private C13693p() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    static void m58534a(boolean z) {
        if (z) {
            while (true) {
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) f39625e.get();
                if (scheduledExecutorService == null) {
                    ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new C13686k("RxSchedulerPurge"));
                    if (f39625e.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                        C13695b bVar = new C13695b();
                        int i = f39624d;
                        newScheduledThreadPool.scheduleAtFixedRate(bVar, (long) i, (long) i, TimeUnit.SECONDS);
                        return;
                    }
                    newScheduledThreadPool.shutdownNow();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public static void m58536b() {
        m58534a(f39622b);
    }

    /* renamed from: a */
    public static void m58533a() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) f39625e.getAndSet(null);
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        f39626f.clear();
    }

    /* renamed from: a */
    public static ScheduledExecutorService m58532a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        m58535a(f39622b, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    /* renamed from: a */
    static void m58535a(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f39626f.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }
}
