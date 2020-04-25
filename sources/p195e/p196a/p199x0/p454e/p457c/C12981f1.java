package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12321v;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.c.f1 */
/* compiled from: MaybeTakeUntilMaybe */
public final class C12981f1<T, U> extends C12943a<T, T> {

    /* renamed from: b */
    final C5941y<U> f37436b;

    /* renamed from: e.a.x0.e.c.f1$a */
    /* compiled from: MaybeTakeUntilMaybe */
    static final class C12982a<T, U> extends AtomicReference<C12314c> implements C12321v<T>, C12314c {
        private static final long serialVersionUID = -2187421758664251153L;

        /* renamed from: a */
        final C12321v<? super T> f37437a;

        /* renamed from: b */
        final C12983a<U> f37438b = new C12983a<>(this);

        /* renamed from: e.a.x0.e.c.f1$a$a */
        /* compiled from: MaybeTakeUntilMaybe */
        static final class C12983a<U> extends AtomicReference<C12314c> implements C12321v<U> {
            private static final long serialVersionUID = -1266041316834525931L;

            /* renamed from: a */
            final C12982a<?, U> f37439a;

            C12983a(C12982a<?, U> aVar) {
                this.f37439a = aVar;
            }

            /* renamed from: a */
            public void mo41931a(C12314c cVar) {
                C12347d.m55468c(this, cVar);
            }

            public void onComplete() {
                this.f37439a.mo42567a();
            }

            public void onError(Throwable th) {
                this.f37439a.mo42568a(th);
            }

            public void onSuccess(Object obj) {
                this.f37439a.mo42567a();
            }
        }

        C12982a(C12321v<? super T> vVar) {
            this.f37437a = vVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            C12347d.m55468c(this, cVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
            C12347d.m55465a((AtomicReference<C12314c>) this.f37438b);
        }

        public void onComplete() {
            C12347d.m55465a((AtomicReference<C12314c>) this.f37438b);
            if (getAndSet(C12347d.DISPOSED) != C12347d.DISPOSED) {
                this.f37437a.onComplete();
            }
        }

        public void onError(Throwable th) {
            C12347d.m55465a((AtomicReference<C12314c>) this.f37438b);
            if (getAndSet(C12347d.DISPOSED) != C12347d.DISPOSED) {
                this.f37437a.onError(th);
            } else {
                C12205a.m54894b(th);
            }
        }

        public void onSuccess(T t) {
            C12347d.m55465a((AtomicReference<C12314c>) this.f37438b);
            if (getAndSet(C12347d.DISPOSED) != C12347d.DISPOSED) {
                this.f37437a.onSuccess(t);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42568a(Throwable th) {
            if (C12347d.m55465a((AtomicReference<C12314c>) this)) {
                this.f37437a.onError(th);
            } else {
                C12205a.m54894b(th);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42567a() {
            if (C12347d.m55465a((AtomicReference<C12314c>) this)) {
                this.f37437a.onComplete();
            }
        }
    }

    public C12981f1(C5941y<T> yVar, C5941y<U> yVar2) {
        super(yVar);
        this.f37436b = yVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        C12982a aVar = new C12982a(vVar);
        vVar.mo41931a(aVar);
        this.f37436b.mo24639a(aVar.f37438b);
        this.f37333a.mo24639a(aVar);
    }
}
