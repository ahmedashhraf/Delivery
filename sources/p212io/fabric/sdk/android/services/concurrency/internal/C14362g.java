package p212io.fabric.sdk.android.services.concurrency.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* renamed from: io.fabric.sdk.android.services.concurrency.internal.g */
/* compiled from: RetryThreadPoolExecutor */
public class C14362g extends ScheduledThreadPoolExecutor {

    /* renamed from: a */
    private final C14361f f42429a;

    /* renamed from: b */
    private final C14357b f42430b;

    public C14362g(int i, C14361f fVar, C14357b bVar) {
        this(i, Executors.defaultThreadFactory(), fVar, bVar);
    }

    /* renamed from: b */
    private <T> Future<T> m62124b(Callable<T> callable) {
        if (callable != null) {
            C14360e eVar = new C14360e(callable, new RetryState(this.f42430b, this.f42429a), this);
            execute(eVar);
            return eVar;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public Future<?> mo45360a(Runnable runnable) {
        return m62124b(Executors.callable(runnable));
    }

    public C14362g(int i, ThreadFactory threadFactory, C14361f fVar, C14357b bVar) {
        super(i, threadFactory);
        if (fVar == null) {
            throw new NullPointerException("retry policy must not be null");
        } else if (bVar != null) {
            this.f42429a = fVar;
            this.f42430b = bVar;
        } else {
            throw new NullPointerException("backoff must not be null");
        }
    }

    /* renamed from: a */
    public <T> Future<T> mo45361a(Runnable runnable, T t) {
        return m62124b(Executors.callable(runnable, t));
    }

    /* renamed from: a */
    public <T> Future<T> mo45362a(Callable<T> callable) {
        return m62124b(callable);
    }

    /* renamed from: a */
    public C14357b mo45359a() {
        return this.f42430b;
    }

    /* renamed from: b */
    public C14361f mo45363b() {
        return this.f42429a;
    }
}
