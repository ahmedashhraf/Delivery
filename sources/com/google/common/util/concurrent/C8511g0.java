package com.google.common.util.concurrent;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.util.concurrent.g0 */
/* compiled from: ListeningExecutorService */
public interface C8511g0 extends ExecutorService {
    <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException;

    <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException;

    C8473c0<?> submit(Runnable runnable);

    <T> C8473c0<T> submit(Runnable runnable, T t);

    <T> C8473c0<T> submit(Callable<T> callable);
}
