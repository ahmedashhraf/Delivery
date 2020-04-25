package com.google.common.collect;

import com.google.common.base.C7397x;
import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import p076c.p112d.p148d.p149a.C2775a;

/* renamed from: com.google.common.collect.u4 */
/* compiled from: Queues */
public final class C8216u4 {
    private C8216u4() {
    }

    /* renamed from: a */
    public static <E> ArrayBlockingQueue<E> m39184a(int i) {
        return new ArrayBlockingQueue<>(i);
    }

    /* renamed from: b */
    public static <E> LinkedBlockingQueue<E> m39188b() {
        return new LinkedBlockingQueue<>();
    }

    /* renamed from: c */
    public static <E extends Comparable> PriorityBlockingQueue<E> m39191c() {
        return new PriorityBlockingQueue<>();
    }

    /* renamed from: d */
    public static <E extends Comparable> PriorityQueue<E> m39193d() {
        return new PriorityQueue<>();
    }

    /* renamed from: e */
    public static <E> SynchronousQueue<E> m39195e() {
        return new SynchronousQueue<>();
    }

    /* renamed from: a */
    public static <E> ConcurrentLinkedQueue<E> m39185a() {
        return new ConcurrentLinkedQueue<>();
    }

    /* renamed from: b */
    public static <E> LinkedBlockingQueue<E> m39189b(int i) {
        return new LinkedBlockingQueue<>(i);
    }

    /* renamed from: c */
    public static <E extends Comparable> PriorityBlockingQueue<E> m39192c(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new PriorityBlockingQueue<>(C8292z.m39586a(iterable));
        }
        PriorityBlockingQueue<E> priorityBlockingQueue = new PriorityBlockingQueue<>();
        C8145s3.m39018a((Collection<T>) priorityBlockingQueue, iterable);
        return priorityBlockingQueue;
    }

    /* renamed from: d */
    public static <E extends Comparable> PriorityQueue<E> m39194d(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new PriorityQueue<>(C8292z.m39586a(iterable));
        }
        PriorityQueue<E> priorityQueue = new PriorityQueue<>();
        C8145s3.m39018a((Collection<T>) priorityQueue, iterable);
        return priorityQueue;
    }

    /* renamed from: a */
    public static <E> ConcurrentLinkedQueue<E> m39186a(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new ConcurrentLinkedQueue<>(C8292z.m39586a(iterable));
        }
        ConcurrentLinkedQueue<E> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        C8145s3.m39018a((Collection<T>) concurrentLinkedQueue, iterable);
        return concurrentLinkedQueue;
    }

    /* renamed from: b */
    public static <E> LinkedBlockingQueue<E> m39190b(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedBlockingQueue<>(C8292z.m39586a(iterable));
        }
        LinkedBlockingQueue<E> linkedBlockingQueue = new LinkedBlockingQueue<>();
        C8145s3.m39018a((Collection<T>) linkedBlockingQueue, iterable);
        return linkedBlockingQueue;
    }

    @C2775a
    /* renamed from: a */
    public static <E> int m39182a(BlockingQueue<E> blockingQueue, Collection<? super E> collection, int i, long j, TimeUnit timeUnit) throws InterruptedException {
        C7397x.m35664a(collection);
        long nanoTime = System.nanoTime() + timeUnit.toNanos(j);
        int i2 = 0;
        while (i2 < i) {
            i2 += blockingQueue.drainTo(collection, i - i2);
            if (i2 < i) {
                Object poll = blockingQueue.poll(nanoTime - System.nanoTime(), TimeUnit.NANOSECONDS);
                if (poll == null) {
                    break;
                }
                collection.add(poll);
                i2++;
            }
        }
        return i2;
    }

    @C2775a
    /* renamed from: b */
    public static <E> int m39187b(BlockingQueue<E> blockingQueue, Collection<? super E> collection, int i, long j, TimeUnit timeUnit) {
        Object poll;
        C7397x.m35664a(collection);
        long nanoTime = System.nanoTime() + timeUnit.toNanos(j);
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            try {
                i2 += blockingQueue.drainTo(collection, i - i2);
                if (i2 < i) {
                    while (true) {
                        try {
                            poll = blockingQueue.poll(nanoTime - System.nanoTime(), TimeUnit.NANOSECONDS);
                            break;
                        } catch (InterruptedException unused) {
                            z = true;
                        }
                    }
                    if (poll == null) {
                        break;
                    }
                    collection.add(poll);
                    i2++;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return i2;
    }

    @C2775a
    /* renamed from: a */
    public static <E> Queue<E> m39183a(Queue<E> queue) {
        return C7624c6.m36469a(queue, (Object) null);
    }
}
