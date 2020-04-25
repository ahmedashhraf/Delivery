package com.google.common.util.concurrent;

import com.google.common.base.C7358i0;
import com.google.common.base.C7397x;
import com.google.common.collect.C8257x2;
import com.google.common.collect.C8257x2.C8259b;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.common.util.concurrent.v0 */
/* compiled from: WrappingExecutorService */
abstract class C8598v0 implements ExecutorService {

    /* renamed from: a */
    private final ExecutorService f22591a;

    /* renamed from: com.google.common.util.concurrent.v0$a */
    /* compiled from: WrappingExecutorService */
    class C8599a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Callable f22592a;

        C8599a(Callable callable) {
            this.f22592a = callable;
        }

        public void run() {
            try {
                this.f22592a.call();
            } catch (Exception e) {
                C7358i0.m35589d(e);
            }
        }
    }

    protected C8598v0(ExecutorService executorService) {
        this.f22591a = (ExecutorService) C7397x.m35664a(executorService);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Runnable mo31772a(Runnable runnable) {
        return new C8599a(mo31773a(Executors.callable(runnable, null)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract <T> Callable<T> mo31773a(Callable<T> callable);

    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f22591a.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f22591a.execute(mo31772a(runnable));
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f22591a.invokeAll(m40500a(collection));
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.f22591a.invokeAny(m40500a(collection));
    }

    public final boolean isShutdown() {
        return this.f22591a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f22591a.isTerminated();
    }

    public final void shutdown() {
        this.f22591a.shutdown();
    }

    public final List<Runnable> shutdownNow() {
        return this.f22591a.shutdownNow();
    }

    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f22591a.submit(mo31773a((Callable) C7397x.m35664a(callable)));
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f22591a.invokeAll(m40500a(collection), j, timeUnit);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f22591a.invokeAny(m40500a(collection), j, timeUnit);
    }

    public final Future<?> submit(Runnable runnable) {
        return this.f22591a.submit(mo31772a(runnable));
    }

    /* renamed from: a */
    private final <T> C8257x2<Callable<T>> m40500a(Collection<? extends Callable<T>> collection) {
        C8259b l = C8257x2.m39411l();
        for (Callable a : collection) {
            l.m39420a((Object) mo31773a(a));
        }
        return l.mo30346a();
    }

    public final <T> Future<T> submit(Runnable runnable, T t) {
        return this.f22591a.submit(mo31772a(runnable), t);
    }
}
