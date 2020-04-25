package com.facebook.common.executors;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p201f.p202a.C5952h;

public class ScheduledFutureImpl<V> implements RunnableFuture<V>, ScheduledFuture<V> {
    private final Handler mHandler;
    private final FutureTask<V> mListenableFuture;

    public ScheduledFutureImpl(Handler handler, Callable<V> callable) {
        this.mHandler = handler;
        this.mListenableFuture = new FutureTask<>(callable);
    }

    public boolean cancel(boolean z) {
        return this.mListenableFuture.cancel(z);
    }

    public V get() throws InterruptedException, ExecutionException {
        return this.mListenableFuture.get();
    }

    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public boolean isCancelled() {
        return this.mListenableFuture.isCancelled();
    }

    public boolean isDone() {
        return this.mListenableFuture.isDone();
    }

    public void run() {
        this.mListenableFuture.run();
    }

    public int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.mListenableFuture.get(j, timeUnit);
    }

    public ScheduledFutureImpl(Handler handler, Runnable runnable, @C5952h V v) {
        this.mHandler = handler;
        this.mListenableFuture = new FutureTask<>(runnable, v);
    }
}
