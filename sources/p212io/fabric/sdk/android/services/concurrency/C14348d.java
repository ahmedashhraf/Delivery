package p212io.fabric.sdk.android.services.concurrency;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import p212io.fabric.sdk.android.services.concurrency.C14347c;
import p212io.fabric.sdk.android.services.concurrency.C14363j;
import p212io.fabric.sdk.android.services.concurrency.C14368n;

/* renamed from: io.fabric.sdk.android.services.concurrency.d */
/* compiled from: DependencyPriorityBlockingQueue */
public class C14348d<E extends C14347c & C14368n & C14363j> extends PriorityBlockingQueue<E> {

    /* renamed from: N */
    static final int f42402N = 0;

    /* renamed from: O */
    static final int f42403O = 1;

    /* renamed from: P */
    static final int f42404P = 2;

    /* renamed from: Q */
    static final int f42405Q = 3;

    /* renamed from: a */
    final Queue<E> f42406a = new LinkedList();

    /* renamed from: b */
    private final ReentrantLock f42407b = new ReentrantLock();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo45303a(int i, E e) {
        try {
            this.f42407b.lock();
            if (i == 1) {
                super.remove(e);
            }
            boolean offer = this.f42406a.offer(e);
            return offer;
        } finally {
            this.f42407b.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public E mo45306b(int i, Long l, TimeUnit timeUnit) throws InterruptedException {
        E e;
        if (i == 0) {
            e = (C14347c) super.take();
        } else if (i == 1) {
            e = (C14347c) super.peek();
        } else if (i == 2) {
            e = (C14347c) super.poll();
        } else if (i != 3) {
            return null;
        } else {
            e = (C14347c) super.poll(l.longValue(), timeUnit);
        }
        return e;
    }

    public void clear() {
        try {
            this.f42407b.lock();
            this.f42406a.clear();
            super.clear();
        } finally {
            this.f42407b.unlock();
        }
    }

    public boolean contains(Object obj) {
        try {
            this.f42407b.lock();
            return super.contains(obj) || this.f42406a.contains(obj);
        } finally {
            this.f42407b.unlock();
        }
    }

    public int drainTo(Collection<? super E> collection) {
        try {
            this.f42407b.lock();
            int drainTo = super.drainTo(collection) + this.f42406a.size();
            while (!this.f42406a.isEmpty()) {
                collection.add(this.f42406a.poll());
            }
            return drainTo;
        } finally {
            this.f42407b.unlock();
        }
    }

    /* renamed from: e */
    public void mo45311e() {
        try {
            this.f42407b.lock();
            Iterator it = this.f42406a.iterator();
            while (it.hasNext()) {
                C14347c cVar = (C14347c) it.next();
                if (mo45304a(cVar)) {
                    super.offer(cVar);
                    it.remove();
                }
            }
        } finally {
            this.f42407b.unlock();
        }
    }

    public boolean remove(Object obj) {
        try {
            this.f42407b.lock();
            return super.remove(obj) || this.f42406a.remove(obj);
        } finally {
            this.f42407b.unlock();
        }
    }

    public boolean removeAll(Collection<?> collection) {
        try {
            this.f42407b.lock();
            return this.f42406a.removeAll(collection) | super.removeAll(collection);
        } finally {
            this.f42407b.unlock();
        }
    }

    public int size() {
        try {
            this.f42407b.lock();
            return this.f42406a.size() + super.size();
        } finally {
            this.f42407b.unlock();
        }
    }

    public <T> T[] toArray(T[] tArr) {
        try {
            this.f42407b.lock();
            return mo45305a((T[]) super.toArray(tArr), (T[]) this.f42406a.toArray(tArr));
        } finally {
            this.f42407b.unlock();
        }
    }

    public E peek() {
        try {
            return mo45302a(1, null, null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public E take() throws InterruptedException {
        return mo45302a(0, null, null);
    }

    public E poll(long j, TimeUnit timeUnit) throws InterruptedException {
        return mo45302a(3, Long.valueOf(j), timeUnit);
    }

    public E poll() {
        try {
            return mo45302a(2, null, null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public Object[] toArray() {
        try {
            this.f42407b.lock();
            return mo45305a((T[]) super.toArray(), (T[]) this.f42406a.toArray());
        } finally {
            this.f42407b.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public E mo45302a(int i, Long l, TimeUnit timeUnit) throws InterruptedException {
        E b;
        while (true) {
            b = mo45306b(i, l, timeUnit);
            if (b == null || mo45304a(b)) {
                return b;
            }
            mo45303a(i, b);
        }
        return b;
    }

    public int drainTo(Collection<? super E> collection, int i) {
        try {
            this.f42407b.lock();
            int drainTo = super.drainTo(collection, i);
            while (!this.f42406a.isEmpty() && drainTo <= i) {
                collection.add(this.f42406a.poll());
                drainTo++;
            }
            return drainTo;
        } finally {
            this.f42407b.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo45304a(E e) {
        return e.areDependenciesMet();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <T> T[] mo45305a(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + length2);
        System.arraycopy(tArr, 0, tArr3, 0, length);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        return tArr3;
    }
}
