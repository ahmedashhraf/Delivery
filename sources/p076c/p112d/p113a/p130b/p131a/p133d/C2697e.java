package p076c.p112d.p113a.p130b.p131a.p133d;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: c.d.a.b.a.d.e */
public final class C2697e {

    /* renamed from: a */
    private static final ThreadPoolExecutor f9817a;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C2696d());
        f9817a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* renamed from: a */
    public static Executor m13082a() {
        return f9817a;
    }
}
