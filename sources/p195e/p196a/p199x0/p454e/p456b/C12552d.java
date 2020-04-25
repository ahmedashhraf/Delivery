package p195e.p196a.p199x0.p454e.p456b;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p443f1.C12270a;

/* renamed from: e.a.x0.e.b.d */
/* compiled from: BlockingFlowableMostRecent */
public final class C12552d<T> implements Iterable<T> {

    /* renamed from: a */
    final C5929l<T> f35930a;

    /* renamed from: b */
    final T f35931b;

    /* renamed from: e.a.x0.e.b.d$a */
    /* compiled from: BlockingFlowableMostRecent */
    static final class C12553a<T> extends C12270a<T> {

        /* renamed from: b */
        volatile Object f35932b;

        /* renamed from: e.a.x0.e.b.d$a$a */
        /* compiled from: BlockingFlowableMostRecent */
        final class C12554a implements Iterator<T> {

            /* renamed from: a */
            private Object f35933a;

            C12554a() {
            }

            public boolean hasNext() {
                this.f35933a = C12553a.this.f35932b;
                return !C13761q.m58752e(this.f35933a);
            }

            public T next() {
                Object obj = null;
                try {
                    if (this.f35933a == null) {
                        obj = C12553a.this.f35932b;
                    }
                    if (C13761q.m58752e(this.f35933a)) {
                        throw new NoSuchElementException();
                    } else if (!C13761q.m58754g(this.f35933a)) {
                        T d = C13761q.m58751d(this.f35933a);
                        this.f35933a = obj;
                        return d;
                    } else {
                        throw C13754k.m58724c(C13761q.m58746b(this.f35933a));
                    }
                } finally {
                    this.f35933a = obj;
                }
            }

            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        C12553a(T t) {
            this.f35932b = C13761q.m58756i(t);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f35932b = C13761q.m58756i(t);
        }

        /* renamed from: c */
        public C12554a mo42243c() {
            return new C12554a<>();
        }

        public void onComplete() {
            this.f35932b = C13761q.m58750d();
        }

        public void onError(Throwable th) {
            this.f35932b = C13761q.m58743a(th);
        }
    }

    public C12552d(C5929l<T> lVar, T t) {
        this.f35930a = lVar;
        this.f35931b = t;
    }

    public Iterator<T> iterator() {
        C12553a aVar = new C12553a(this.f35931b);
        this.f35930a.mo24393a((C12297q<? super T>) aVar);
        return aVar.mo42243c();
    }
}
