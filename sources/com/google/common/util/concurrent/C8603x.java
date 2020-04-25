package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

/* renamed from: com.google.common.util.concurrent.x */
/* compiled from: ForwardingListeningExecutorService */
public abstract class C8603x extends C8594u implements C8511g0 {
    protected C8603x() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract C8511g0 m40512y();

    public <T> C8473c0<T> submit(Callable<T> callable) {
        return m40512y().submit(callable);
    }

    public C8473c0<?> submit(Runnable runnable) {
        return m40512y().submit(runnable);
    }

    public <T> C8473c0<T> submit(Runnable runnable, T t) {
        return m40512y().submit(runnable, t);
    }
}
