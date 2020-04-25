package bolts;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: bolts.g */
/* compiled from: BoltsExecutors */
final class C2167g {

    /* renamed from: d */
    private static final C2167g f8615d = new C2167g();

    /* renamed from: a */
    private final ExecutorService f8616a;

    /* renamed from: b */
    private final ScheduledExecutorService f8617b;

    /* renamed from: c */
    private final Executor f8618c;

    /* renamed from: bolts.g$b */
    /* compiled from: BoltsExecutors */
    private static class C2169b implements Executor {

        /* renamed from: b */
        private static final int f8619b = 15;

        /* renamed from: a */
        private ThreadLocal<Integer> f8620a;

        private C2169b() {
            this.f8620a = new ThreadLocal<>();
        }

        /* renamed from: a */
        private int m11201a() {
            Integer num = (Integer) this.f8620a.get();
            if (num == null) {
                num = Integer.valueOf(0);
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f8620a.remove();
            } else {
                this.f8620a.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        /* renamed from: b */
        private int m11202b() {
            Integer num = (Integer) this.f8620a.get();
            if (num == null) {
                num = Integer.valueOf(0);
            }
            int intValue = num.intValue() + 1;
            this.f8620a.set(Integer.valueOf(intValue));
            return intValue;
        }

        public void execute(Runnable runnable) {
            if (m11202b() <= 15) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    m11201a();
                    throw th;
                }
            } else {
                C2167g.m11197a().execute(runnable);
            }
            m11201a();
        }
    }

    private C2167g() {
        this.f8616a = !m11199c() ? Executors.newCachedThreadPool() : C2156a.m11162a();
        this.f8617b = Executors.newSingleThreadScheduledExecutor();
        this.f8618c = new C2169b();
    }

    /* renamed from: a */
    public static ExecutorService m11197a() {
        return f8615d.f8616a;
    }

    /* renamed from: b */
    static Executor m11198b() {
        return f8615d.f8618c;
    }

    /* renamed from: c */
    private static boolean m11199c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }

    /* renamed from: d */
    static ScheduledExecutorService m11200d() {
        return f8615d.f8617b;
    }
}
