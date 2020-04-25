package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.util.concurrent.w0 */
/* compiled from: WrappingScheduledExecutorService */
abstract class C8602w0 extends C8598v0 implements ScheduledExecutorService {

    /* renamed from: b */
    final ScheduledExecutorService f22595b;

    protected C8602w0(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f22595b = scheduledExecutorService;
    }

    public final ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f22595b.schedule(mo31772a(runnable), j, timeUnit);
    }

    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f22595b.scheduleAtFixedRate(mo31772a(runnable), j, j2, timeUnit);
    }

    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f22595b.scheduleWithFixedDelay(mo31772a(runnable), j, j2, timeUnit);
    }

    public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return this.f22595b.schedule(mo31773a(callable), j, timeUnit);
    }
}
