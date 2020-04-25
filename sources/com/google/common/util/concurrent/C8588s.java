package com.google.common.util.concurrent;

import com.google.common.collect.C7539a2;
import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.util.concurrent.s */
/* compiled from: ForwardingBlockingQueue */
public abstract class C8588s<E> extends C7539a2<E> implements BlockingQueue<E> {
    protected C8588s() {
    }

    public int drainTo(Collection<? super E> collection, int i) {
        return m40470y().drainTo(collection, i);
    }

    public boolean offer(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        return m40470y().offer(e, j, timeUnit);
    }

    public E poll(long j, TimeUnit timeUnit) throws InterruptedException {
        return m40470y().poll(j, timeUnit);
    }

    public void put(E e) throws InterruptedException {
        m40470y().put(e);
    }

    public int remainingCapacity() {
        return m40470y().remainingCapacity();
    }

    public E take() throws InterruptedException {
        return m40470y().take();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract BlockingQueue<E> m40471y();

    public int drainTo(Collection<? super E> collection) {
        return m40470y().drainTo(collection);
    }
}
