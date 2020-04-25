package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p076c.p112d.p148d.p149a.C2775a;

@C2775a
/* renamed from: com.google.common.util.concurrent.h0 */
/* compiled from: ListeningScheduledExecutorService */
public interface C8513h0 extends ScheduledExecutorService, C8511g0 {
    C8482e0<?> schedule(Runnable runnable, long j, TimeUnit timeUnit);

    <V> C8482e0<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit);

    C8482e0<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    C8482e0<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
