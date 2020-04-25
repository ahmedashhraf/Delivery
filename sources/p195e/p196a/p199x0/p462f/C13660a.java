package p195e.p196a.p199x0.p462f;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p452c.C12405n;

/* renamed from: e.a.x0.f.a */
/* compiled from: MpscLinkedQueue */
public final class C13660a<T> implements C12405n<T> {

    /* renamed from: a */
    private final AtomicReference<C13661a<T>> f39517a = new AtomicReference<>();

    /* renamed from: b */
    private final AtomicReference<C13661a<T>> f39518b = new AtomicReference<>();

    /* renamed from: e.a.x0.f.a$a */
    /* compiled from: MpscLinkedQueue */
    static final class C13661a<E> extends AtomicReference<C13661a<E>> {
        private static final long serialVersionUID = 2404266111789071508L;

        /* renamed from: a */
        private E f39519a;

        C13661a() {
        }

        /* renamed from: a */
        public E mo43023a() {
            E d = mo43026d();
            mo43025a((E) null);
            return d;
        }

        /* renamed from: d */
        public E mo43026d() {
            return this.f39519a;
        }

        /* renamed from: e */
        public C13661a<E> mo43027e() {
            return (C13661a) get();
        }

        C13661a(E e) {
            mo43025a(e);
        }

        /* renamed from: a */
        public void mo43025a(E e) {
            this.f39519a = e;
        }

        /* renamed from: a */
        public void mo43024a(C13661a<E> aVar) {
            lazySet(aVar);
        }
    }

    public C13660a() {
        C13661a aVar = new C13661a();
        mo43019a(aVar);
        mo43021b(aVar);
    }

    /* renamed from: a */
    public boolean mo42104a(T t, T t2) {
        offer(t);
        offer(t2);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C13661a<T> mo43021b(C13661a<T> aVar) {
        return (C13661a) this.f39517a.getAndSet(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C13661a<T> mo43022c() {
        return (C13661a) this.f39517a.get();
    }

    public void clear() {
        while (poll() != null) {
            if (isEmpty()) {
                return;
            }
        }
    }

    public boolean isEmpty() {
        return mo43020b() == mo43022c();
    }

    public boolean offer(T t) {
        if (t != null) {
            C13661a aVar = new C13661a(t);
            mo43021b(aVar).mo43024a(aVar);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @C5938g
    public T poll() {
        C13661a e;
        C13661a a = mo43018a();
        C13661a e2 = a.mo43027e();
        if (e2 != null) {
            T a2 = e2.mo43023a();
            mo43019a(e2);
            return a2;
        } else if (a == mo43022c()) {
            return null;
        } else {
            do {
                e = a.mo43027e();
            } while (e == null);
            T a3 = e.mo43023a();
            mo43019a(e);
            return a3;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C13661a<T> mo43020b() {
        return (C13661a) this.f39518b.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13661a<T> mo43018a() {
        return (C13661a) this.f39518b.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo43019a(C13661a<T> aVar) {
        this.f39518b.lazySet(aVar);
    }
}
