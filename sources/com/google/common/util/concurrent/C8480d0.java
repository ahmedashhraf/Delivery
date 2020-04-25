package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import p201f.p202a.C5952h;

/* renamed from: com.google.common.util.concurrent.d0 */
/* compiled from: ListenableFutureTask */
public class C8480d0<V> extends FutureTask<V> implements C8473c0<V> {

    /* renamed from: a */
    private final C8570q f22396a = new C8570q();

    C8480d0(Callable<V> callable) {
        super(callable);
    }

    /* renamed from: a */
    public static <V> C8480d0<V> m40126a(Callable<V> callable) {
        return new C8480d0<>(callable);
    }

    /* access modifiers changed from: protected */
    public void done() {
        this.f22396a.mo31887a();
    }

    /* renamed from: a */
    public static <V> C8480d0<V> m40125a(Runnable runnable, @C5952h V v) {
        return new C8480d0<>(runnable, v);
    }

    C8480d0(Runnable runnable, @C5952h V v) {
        super(runnable, v);
    }

    /* renamed from: a */
    public void mo31637a(Runnable runnable, Executor executor) {
        this.f22396a.mo31888a(runnable, executor);
    }
}
