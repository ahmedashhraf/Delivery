package com.google.common.util.concurrent;

import com.google.common.base.C7397x;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p076c.p112d.p148d.p149a.C2775a;

@C2775a
/* renamed from: com.google.common.util.concurrent.u0 */
/* compiled from: Uninterruptibles */
public final class C8595u0 {
    private C8595u0() {
    }

    /* renamed from: a */
    public static void m40494a(CountDownLatch countDownLatch) {
        boolean z = false;
        while (true) {
            try {
                countDownLatch.await();
                break;
            } catch (InterruptedException unused) {
                z = true;
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
    }

    /* renamed from: a */
    public static boolean m40495a(CountDownLatch countDownLatch, long j, TimeUnit timeUnit) {
        long nanos;
        boolean await;
        boolean z = false;
        try {
            nanos = timeUnit.toNanos(j);
            while (true) {
                await = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                break;
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return await;
        } catch (InterruptedException unused) {
            z = true;
            nanos = (System.nanoTime() + nanos) - System.nanoTime();
        } catch (Throwable th) {
            if (z) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static void m40491a(Thread thread) {
        boolean z = false;
        while (true) {
            try {
                thread.join();
                break;
            } catch (InterruptedException unused) {
                z = true;
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
    }

    /* renamed from: a */
    public static <V> V m40488a(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
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
        return v;
    }

    /* renamed from: a */
    public static <V> V m40489a(Future<V> future, long j, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        long nanos;
        V v;
        boolean z = false;
        try {
            nanos = timeUnit.toNanos(j);
            while (true) {
                v = future.get(nanos, TimeUnit.NANOSECONDS);
                break;
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return v;
        } catch (InterruptedException unused) {
            z = true;
            nanos = (System.nanoTime() + nanos) - System.nanoTime();
        } catch (Throwable th) {
            if (z) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static void m40492a(Thread thread, long j, TimeUnit timeUnit) {
        long nanos;
        long nanoTime;
        C7397x.m35664a(thread);
        boolean z = false;
        try {
            nanos = timeUnit.toNanos(j);
            nanoTime = System.nanoTime() + nanos;
            while (true) {
                TimeUnit.NANOSECONDS.timedJoin(thread, nanos);
                break;
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        } catch (InterruptedException unused) {
            z = true;
            nanos = nanoTime - System.nanoTime();
        } catch (Throwable th) {
            if (z) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static <E> E m40487a(BlockingQueue<E> blockingQueue) {
        E take;
        boolean z = false;
        while (true) {
            try {
                take = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
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
        return take;
    }

    /* renamed from: a */
    public static <E> void m40493a(BlockingQueue<E> blockingQueue, E e) {
        boolean z = false;
        while (true) {
            try {
                blockingQueue.put(e);
                break;
            } catch (InterruptedException unused) {
                z = true;
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
    }

    /* renamed from: a */
    public static void m40490a(long j, TimeUnit timeUnit) {
        long nanos;
        long nanoTime;
        boolean z = false;
        try {
            nanos = timeUnit.toNanos(j);
            nanoTime = System.nanoTime() + nanos;
            while (true) {
                TimeUnit.NANOSECONDS.sleep(nanos);
                break;
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        } catch (InterruptedException unused) {
            z = true;
            nanos = nanoTime - System.nanoTime();
        } catch (Throwable th) {
            if (z) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }
}
