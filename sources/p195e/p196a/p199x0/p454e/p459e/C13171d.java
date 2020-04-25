package p195e.p196a.p199x0.p454e.p459e;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p467z0.C13784b;

/* renamed from: e.a.x0.e.e.d */
/* compiled from: BlockingObservableMostRecent */
public final class C13171d<T> implements Iterable<T> {

    /* renamed from: a */
    final C5926g0<T> f37980a;

    /* renamed from: b */
    final T f37981b;

    /* renamed from: e.a.x0.e.e.d$a */
    /* compiled from: BlockingObservableMostRecent */
    static final class C13172a<T> extends C13784b<T> {

        /* renamed from: b */
        volatile Object f37982b;

        /* renamed from: e.a.x0.e.e.d$a$a */
        /* compiled from: BlockingObservableMostRecent */
        final class C13173a implements Iterator<T> {

            /* renamed from: a */
            private Object f37983a;

            C13173a() {
            }

            public boolean hasNext() {
                this.f37983a = C13172a.this.f37982b;
                return !C13761q.m58752e(this.f37983a);
            }

            public T next() {
                Object obj = null;
                try {
                    if (this.f37983a == null) {
                        obj = C13172a.this.f37982b;
                    }
                    if (C13761q.m58752e(this.f37983a)) {
                        throw new NoSuchElementException();
                    } else if (!C13761q.m58754g(this.f37983a)) {
                        T d = C13761q.m58751d(this.f37983a);
                        this.f37983a = obj;
                        return d;
                    } else {
                        throw C13754k.m58724c(C13761q.m58746b(this.f37983a));
                    }
                } finally {
                    this.f37983a = obj;
                }
            }

            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        C13172a(T t) {
            this.f37982b = C13761q.m58756i(t);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f37982b = C13761q.m58756i(t);
        }

        /* renamed from: c */
        public C13173a mo42700c() {
            return new C13173a<>();
        }

        public void onComplete() {
            this.f37982b = C13761q.m58750d();
        }

        public void onError(Throwable th) {
            this.f37982b = C13761q.m58743a(th);
        }
    }

    public C13171d(C5926g0<T> g0Var, T t) {
        this.f37980a = g0Var;
        this.f37981b = t;
    }

    public Iterator<T> iterator() {
        C13172a aVar = new C13172a(this.f37981b);
        this.f37980a.mo23893a(aVar);
        return aVar.mo42700c();
    }
}
