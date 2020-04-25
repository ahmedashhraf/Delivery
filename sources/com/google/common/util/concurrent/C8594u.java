package com.google.common.util.concurrent;

import com.google.common.collect.C8301z1;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.common.util.concurrent.u */
/* compiled from: ForwardingExecutorService */
public abstract class C8594u extends C8301z1 implements ExecutorService {
    protected C8594u() {
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return mo26777y().awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        mo26777y().execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return mo26777y().invokeAll(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return mo26777y().invokeAny(collection);
    }

    public boolean isShutdown() {
        return mo26777y().isShutdown();
    }

    public boolean isTerminated() {
        return mo26777y().isTerminated();
    }

    public void shutdown() {
        mo26777y().shutdown();
    }

    public List<Runnable> shutdownNow() {
        return mo26777y().shutdownNow();
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return mo26777y().submit(callable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract ExecutorService m40486y();

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return mo26777y().invokeAll(collection, j, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return mo26777y().invokeAny(collection, j, timeUnit);
    }

    public Future<?> submit(Runnable runnable) {
        return mo26777y().submit(runnable);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return mo26777y().submit(runnable, t);
    }
}
