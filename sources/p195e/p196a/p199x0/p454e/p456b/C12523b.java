package p195e.p196a.p199x0.p454e.p456b;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.jivesoftware.smackx.disco.packet.DiscoverItems.Item;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13748e;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p462f.C13662b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.b */
/* compiled from: BlockingFlowableIterable */
public final class C12523b<T> implements Iterable<T> {

    /* renamed from: a */
    final C5929l<T> f35848a;

    /* renamed from: b */
    final int f35849b;

    /* renamed from: e.a.x0.e.b.b$a */
    /* compiled from: BlockingFlowableIterable */
    static final class C12524a<T> extends AtomicReference<C14063d> implements C12297q<T>, Iterator<T>, Runnable, C12314c {
        private static final long serialVersionUID = 6695226475494099826L;

        /* renamed from: N */
        final long f35850N;

        /* renamed from: O */
        final Lock f35851O = new ReentrantLock();

        /* renamed from: P */
        final Condition f35852P = this.f35851O.newCondition();

        /* renamed from: Q */
        long f35853Q;

        /* renamed from: R */
        volatile boolean f35854R;

        /* renamed from: S */
        Throwable f35855S;

        /* renamed from: a */
        final C13662b<T> f35856a;

        /* renamed from: b */
        final long f35857b;

        C12524a(int i) {
            this.f35856a = new C13662b<>(i);
            this.f35857b = (long) i;
            this.f35850N = (long) (i - (i >> 2));
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58676a((AtomicReference<C14063d>) this, dVar, this.f35857b);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C13742j.m58672a((C14063d) get());
        }

        public void dispose() {
            C13742j.m58674a((AtomicReference<C14063d>) this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo42220g() {
            this.f35851O.lock();
            try {
                this.f35852P.signalAll();
            } finally {
                this.f35851O.unlock();
            }
        }

        public boolean hasNext() {
            while (true) {
                boolean z = this.f35854R;
                boolean isEmpty = this.f35856a.isEmpty();
                if (z) {
                    Throwable th = this.f35855S;
                    if (th != null) {
                        throw C13754k.m58724c(th);
                    } else if (isEmpty) {
                        return false;
                    }
                }
                if (!isEmpty) {
                    return true;
                }
                C13748e.m58701a();
                this.f35851O.lock();
                while (!this.f35854R && this.f35856a.isEmpty()) {
                    try {
                        this.f35852P.await();
                    } catch (InterruptedException e) {
                        run();
                        throw C13754k.m58724c(e);
                    } catch (Throwable th2) {
                        this.f35851O.unlock();
                        throw th2;
                    }
                }
                this.f35851O.unlock();
            }
        }

        public T next() {
            if (hasNext()) {
                T poll = this.f35856a.poll();
                long j = this.f35853Q + 1;
                if (j == this.f35850N) {
                    this.f35853Q = 0;
                    ((C14063d) get()).mo41813c(j);
                } else {
                    this.f35853Q = j;
                }
                return poll;
            }
            throw new NoSuchElementException();
        }

        public void onComplete() {
            this.f35854R = true;
            mo42220g();
        }

        public void onError(Throwable th) {
            this.f35855S = th;
            this.f35854R = true;
            mo42220g();
        }

        public void remove() {
            throw new UnsupportedOperationException(Item.REMOVE_ACTION);
        }

        public void run() {
            C13742j.m58674a((AtomicReference<C14063d>) this);
            mo42220g();
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f35856a.offer(t)) {
                C13742j.m58674a((AtomicReference<C14063d>) this);
                onError(new MissingBackpressureException("Queue full?!"));
                return;
            }
            mo42220g();
        }
    }

    public C12523b(C5929l<T> lVar, int i) {
        this.f35848a = lVar;
        this.f35849b = i;
    }

    public Iterator<T> iterator() {
        C12524a aVar = new C12524a(this.f35849b);
        this.f35848a.mo24393a((C12297q<? super T>) aVar);
        return aVar;
    }
}
