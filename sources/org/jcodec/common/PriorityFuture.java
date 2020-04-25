package org.jcodec.common;

import java.util.Comparator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class PriorityFuture<T> implements RunnableFuture<T> {
    public static Comparator<Runnable> COMP = new C15536a();
    private int priority;
    private RunnableFuture<T> src;

    /* renamed from: org.jcodec.common.PriorityFuture$a */
    static class C15536a implements Comparator<Runnable> {
        C15536a() {
        }

        /* renamed from: a */
        public int compare(Runnable runnable, Runnable runnable2) {
            int i = 0;
            if (runnable == null && runnable2 == null) {
                return 0;
            }
            if (runnable == null) {
                return -1;
            }
            if (runnable2 == null) {
                return 1;
            }
            int priority = ((PriorityFuture) runnable).getPriority();
            int priority2 = ((PriorityFuture) runnable2).getPriority();
            if (priority > priority2) {
                i = 1;
            } else if (priority != priority2) {
                i = -1;
            }
            return i;
        }
    }

    public PriorityFuture(RunnableFuture<T> runnableFuture, int i) {
        this.src = runnableFuture;
        this.priority = i;
    }

    public boolean cancel(boolean z) {
        return this.src.cancel(z);
    }

    public T get() throws InterruptedException, ExecutionException {
        return this.src.get();
    }

    public int getPriority() {
        return this.priority;
    }

    public boolean isCancelled() {
        return this.src.isCancelled();
    }

    public boolean isDone() {
        return this.src.isDone();
    }

    public void run() {
        this.src.run();
    }

    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.src.get();
    }
}
