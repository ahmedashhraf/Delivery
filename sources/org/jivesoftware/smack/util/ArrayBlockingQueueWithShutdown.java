package org.jivesoftware.smack.util;

import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ArrayBlockingQueueWithShutdown<E> extends AbstractQueue<E> implements BlockingQueue<E> {
    /* access modifiers changed from: private */
    public int count;
    private volatile boolean isShutdown;
    /* access modifiers changed from: private */
    public final E[] items;
    /* access modifiers changed from: private */
    public final ReentrantLock lock;
    private final Condition notEmpty;
    private final Condition notFull;
    /* access modifiers changed from: private */
    public int putIndex;
    /* access modifiers changed from: private */
    public int takeIndex;

    private class Itr implements Iterator<E> {
        private int lastRet = -1;
        private int nextIndex;
        private E nextItem;

        Itr() {
            if (ArrayBlockingQueueWithShutdown.this.count == 0) {
                this.nextIndex = -1;
                return;
            }
            this.nextIndex = ArrayBlockingQueueWithShutdown.this.takeIndex;
            this.nextItem = ArrayBlockingQueueWithShutdown.this.items[ArrayBlockingQueueWithShutdown.this.takeIndex];
        }

        private void checkNext() {
            if (this.nextIndex == ArrayBlockingQueueWithShutdown.this.putIndex) {
                this.nextIndex = -1;
                this.nextItem = null;
                return;
            }
            this.nextItem = ArrayBlockingQueueWithShutdown.this.items[this.nextIndex];
            if (this.nextItem == null) {
                this.nextIndex = -1;
            }
        }

        public boolean hasNext() {
            return this.nextIndex >= 0;
        }

        public E next() {
            ArrayBlockingQueueWithShutdown.this.lock.lock();
            try {
                if (this.nextIndex >= 0) {
                    this.lastRet = this.nextIndex;
                    E e = this.nextItem;
                    this.nextIndex = ArrayBlockingQueueWithShutdown.this.inc(this.nextIndex);
                    checkNext();
                    return e;
                }
                throw new NoSuchElementException();
            } finally {
                ArrayBlockingQueueWithShutdown.this.lock.unlock();
            }
        }

        public void remove() {
            ArrayBlockingQueueWithShutdown.this.lock.lock();
            try {
                int i = this.lastRet;
                if (i >= 0) {
                    this.lastRet = -1;
                    int access$100 = ArrayBlockingQueueWithShutdown.this.takeIndex;
                    ArrayBlockingQueueWithShutdown.this.removeAt(i);
                    if (i == access$100) {
                        i = ArrayBlockingQueueWithShutdown.this.takeIndex;
                    }
                    this.nextIndex = i;
                    checkNext();
                    return;
                }
                throw new IllegalStateException();
            } finally {
                ArrayBlockingQueueWithShutdown.this.lock.unlock();
            }
        }
    }

    public ArrayBlockingQueueWithShutdown(int i) {
        this(i, false);
    }

    private static final void checkNotNull(Object obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
    }

    private final void checkNotShutdown() throws InterruptedException {
        if (this.isShutdown) {
            throw new InterruptedException();
        }
    }

    private final E extract() {
        E[] eArr = this.items;
        int i = this.takeIndex;
        E e = eArr[i];
        eArr[i] = null;
        this.takeIndex = inc(i);
        this.count--;
        this.notFull.signal();
        return e;
    }

    private final boolean hasElements() {
        return !hasNoElements();
    }

    private final boolean hasNoElements() {
        return this.count == 0;
    }

    /* access modifiers changed from: private */
    public final int inc(int i) {
        int i2 = i + 1;
        if (i2 == this.items.length) {
            return 0;
        }
        return i2;
    }

    private final void insert(E e) {
        E[] eArr = this.items;
        int i = this.putIndex;
        eArr[i] = e;
        this.putIndex = inc(i);
        this.count++;
        this.notEmpty.signal();
    }

    private final boolean isFull() {
        return this.count == this.items.length;
    }

    private final boolean isNotFull() {
        return !isFull();
    }

    /* access modifiers changed from: private */
    public final void removeAt(int i) {
        int i2 = this.takeIndex;
        if (i == i2) {
            this.items[i2] = null;
            this.takeIndex = inc(i2);
        } else {
            while (true) {
                int inc = inc(i);
                if (inc == this.putIndex) {
                    break;
                }
                E[] eArr = this.items;
                eArr[i] = eArr[inc];
                i = inc;
            }
            this.items[i] = null;
            this.putIndex = i;
        }
        this.count--;
        this.notFull.signal();
    }

    public int drainTo(Collection<? super E> collection) {
        checkNotNull(collection);
        if (collection != this) {
            this.lock.lock();
            try {
                int i = this.takeIndex;
                int i2 = 0;
                while (i2 < this.count) {
                    collection.add(this.items[i]);
                    this.items[i] = null;
                    i = inc(i);
                    i2++;
                }
                if (i2 > 0) {
                    this.count = 0;
                    this.putIndex = 0;
                    this.takeIndex = 0;
                    this.notFull.signalAll();
                }
                return i2;
            } finally {
                this.lock.unlock();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean isShutdown() {
        this.lock.lock();
        try {
            return this.isShutdown;
        } finally {
            this.lock.unlock();
        }
    }

    public Iterator<E> iterator() {
        this.lock.lock();
        try {
            return new Itr();
        } finally {
            this.lock.unlock();
        }
    }

    public boolean offer(E e) {
        boolean z;
        checkNotNull(e);
        this.lock.lock();
        try {
            if (!isFull()) {
                if (!this.isShutdown) {
                    insert(e);
                    z = true;
                    return z;
                }
            }
            z = false;
            return z;
        } finally {
            this.lock.unlock();
        }
    }

    public E peek() {
        this.lock.lock();
        try {
            return hasNoElements() ? null : this.items[this.takeIndex];
        } finally {
            this.lock.unlock();
        }
    }

    public E poll() {
        E extract;
        this.lock.lock();
        try {
            if (hasNoElements()) {
                extract = null;
            } else {
                extract = extract();
            }
            return extract;
        } finally {
            this.lock.unlock();
        }
    }

    public void put(E e) throws InterruptedException {
        checkNotNull(e);
        this.lock.lockInterruptibly();
        while (isFull()) {
            try {
                this.notFull.await();
                checkNotShutdown();
            } catch (InterruptedException e2) {
                this.notFull.signal();
                throw e2;
            } catch (Throwable th) {
                this.lock.unlock();
                throw th;
            }
        }
        insert(e);
        this.lock.unlock();
    }

    public int remainingCapacity() {
        this.lock.lock();
        try {
            return this.items.length - this.count;
        } finally {
            this.lock.unlock();
        }
    }

    public void shutdown() {
        this.lock.lock();
        try {
            this.isShutdown = true;
            this.notEmpty.signalAll();
            this.notFull.signalAll();
        } finally {
            this.lock.unlock();
        }
    }

    public int size() {
        this.lock.lock();
        try {
            return this.count;
        } finally {
            this.lock.unlock();
        }
    }

    public void start() {
        this.lock.lock();
        try {
            this.isShutdown = false;
        } finally {
            this.lock.unlock();
        }
    }

    public E take() throws InterruptedException {
        this.lock.lockInterruptibly();
        try {
            checkNotShutdown();
            while (hasNoElements()) {
                this.notEmpty.await();
                checkNotShutdown();
            }
            E extract = extract();
            this.lock.unlock();
            return extract;
        } catch (InterruptedException e) {
            this.notEmpty.signal();
            throw e;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public ArrayBlockingQueueWithShutdown(int i, boolean z) {
        this.isShutdown = false;
        if (i > 0) {
            this.items = new Object[i];
            this.lock = new ReentrantLock(z);
            this.notEmpty = this.lock.newCondition();
            this.notFull = this.lock.newCondition();
            return;
        }
        throw new IllegalArgumentException();
    }

    public boolean offer(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        boolean z;
        checkNotNull(e);
        long nanos = timeUnit.toNanos(j);
        this.lock.lockInterruptibly();
        while (true) {
            try {
                if (isNotFull()) {
                    insert(e);
                    z = true;
                    break;
                } else if (nanos <= 0) {
                    z = false;
                    break;
                } else {
                    nanos = this.notFull.awaitNanos(nanos);
                    checkNotShutdown();
                }
            } catch (InterruptedException e2) {
                this.notFull.signal();
                throw e2;
            } catch (Throwable th) {
                this.lock.unlock();
                throw th;
            }
        }
        this.lock.unlock();
        return z;
    }

    public E poll(long j, TimeUnit timeUnit) throws InterruptedException {
        E extract;
        long nanos = timeUnit.toNanos(j);
        this.lock.lockInterruptibly();
        try {
            checkNotShutdown();
            while (true) {
                if (hasElements()) {
                    extract = extract();
                    break;
                } else if (nanos <= 0) {
                    extract = null;
                    break;
                } else {
                    nanos = this.notEmpty.awaitNanos(nanos);
                    checkNotShutdown();
                }
            }
            this.lock.unlock();
            return extract;
        } catch (InterruptedException e) {
            this.notEmpty.signal();
            throw e;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public int drainTo(Collection<? super E> collection, int i) {
        checkNotNull(collection);
        if (collection != this) {
            int i2 = 0;
            if (i <= 0) {
                return 0;
            }
            this.lock.lock();
            try {
                int i3 = this.takeIndex;
                if (i >= this.count) {
                    i = this.count;
                }
                while (i2 < i) {
                    collection.add(this.items[i3]);
                    this.items[i3] = null;
                    i3 = inc(i3);
                    i2++;
                }
                if (i2 > 0) {
                    this.count -= i2;
                    this.takeIndex = i3;
                    this.notFull.signalAll();
                }
                return i2;
            } finally {
                this.lock.unlock();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
