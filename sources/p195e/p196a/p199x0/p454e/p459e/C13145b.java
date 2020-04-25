package p195e.p196a.p199x0.p454e.p459e;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.jivesoftware.smackx.disco.packet.DiscoverItems.Item;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p200j.C13748e;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.b */
/* compiled from: BlockingObservableIterable */
public final class C13145b<T> implements Iterable<T> {

    /* renamed from: a */
    final C5926g0<? extends T> f37903a;

    /* renamed from: b */
    final int f37904b;

    /* renamed from: e.a.x0.e.e.b$a */
    /* compiled from: BlockingObservableIterable */
    static final class C13146a<T> extends AtomicReference<C12314c> implements C12280i0<T>, Iterator<T>, C12314c {
        private static final long serialVersionUID = 6695226475494099826L;

        /* renamed from: N */
        final Condition f37905N = this.f37909b.newCondition();

        /* renamed from: O */
        volatile boolean f37906O;

        /* renamed from: P */
        Throwable f37907P;

        /* renamed from: a */
        final C13663c<T> f37908a;

        /* renamed from: b */
        final Lock f37909b = new ReentrantLock();

        C13146a(int i) {
            this.f37908a = new C13663c<>(i);
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            C12347d.m55468c(this, cVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo42676g() {
            this.f37909b.lock();
            try {
                this.f37905N.signalAll();
            } finally {
                this.f37909b.unlock();
            }
        }

        public boolean hasNext() {
            while (true) {
                boolean z = this.f37906O;
                boolean isEmpty = this.f37908a.isEmpty();
                if (z) {
                    Throwable th = this.f37907P;
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
                this.f37909b.lock();
                while (!this.f37906O && this.f37908a.isEmpty()) {
                    try {
                        this.f37905N.await();
                    } catch (InterruptedException e) {
                        C12347d.m55465a((AtomicReference<C12314c>) this);
                        mo42676g();
                        throw C13754k.m58724c(e);
                    } catch (Throwable th2) {
                        this.f37909b.unlock();
                        throw th2;
                    }
                }
                this.f37909b.unlock();
            }
        }

        public T next() {
            if (hasNext()) {
                return this.f37908a.poll();
            }
            throw new NoSuchElementException();
        }

        public void onComplete() {
            this.f37906O = true;
            mo42676g();
        }

        public void onError(Throwable th) {
            this.f37907P = th;
            this.f37906O = true;
            mo42676g();
        }

        public void remove() {
            throw new UnsupportedOperationException(Item.REMOVE_ACTION);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f37908a.offer(t);
            mo42676g();
        }
    }

    public C13145b(C5926g0<? extends T> g0Var, int i) {
        this.f37903a = g0Var;
        this.f37904b = i;
    }

    public Iterator<T> iterator() {
        C13146a aVar = new C13146a(this.f37904b);
        this.f37903a.mo23893a(aVar);
        return aVar;
    }
}
