package com.google.common.util.concurrent;

import com.google.common.base.C7397x;
import com.google.common.collect.C8301z1;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.common.util.concurrent.v */
/* compiled from: ForwardingFuture */
public abstract class C8596v<V> extends C8301z1 implements Future<V> {

    /* renamed from: com.google.common.util.concurrent.v$a */
    /* compiled from: ForwardingFuture */
    public static abstract class C8597a<V> extends C8596v<V> {

        /* renamed from: a */
        private final Future<V> f22590a;

        protected C8597a(Future<V> future) {
            this.f22590a = (Future) C7397x.m35664a(future);
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public final Future<V> m40499y() {
            return this.f22590a;
        }
    }

    protected C8596v() {
    }

    public boolean cancel(boolean z) {
        return mo26777y().cancel(z);
    }

    public V get() throws InterruptedException, ExecutionException {
        return mo26777y().get();
    }

    public boolean isCancelled() {
        return mo26777y().isCancelled();
    }

    public boolean isDone() {
        return mo26777y().isDone();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract Future<V> m40497y();

    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return mo26777y().get(j, timeUnit);
    }
}
