package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C12321v;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;

/* renamed from: e.a.x0.e.c.g1 */
/* compiled from: MaybeTakeUntilPublisher */
public final class C12989g1<T, U> extends C12943a<T, T> {

    /* renamed from: b */
    final C6007b<U> f37452b;

    /* renamed from: e.a.x0.e.c.g1$a */
    /* compiled from: MaybeTakeUntilPublisher */
    static final class C12990a<T, U> extends AtomicReference<C12314c> implements C12321v<T>, C12314c {
        private static final long serialVersionUID = -2187421758664251153L;

        /* renamed from: a */
        final C12321v<? super T> f37453a;

        /* renamed from: b */
        final C12991a<U> f37454b = new C12991a<>(this);

        /* renamed from: e.a.x0.e.c.g1$a$a */
        /* compiled from: MaybeTakeUntilPublisher */
        static final class C12991a<U> extends AtomicReference<C14063d> implements C12297q<U> {
            private static final long serialVersionUID = -1266041316834525931L;

            /* renamed from: a */
            final C12990a<?, U> f37455a;

            C12991a(C12990a<?, U> aVar) {
                this.f37455a = aVar;
            }

            /* renamed from: a */
            public void mo41788a(C14063d dVar) {
                C13742j.m58676a((AtomicReference<C14063d>) this, dVar, Long.MAX_VALUE);
            }

            public void onComplete() {
                this.f37455a.mo42570a();
            }

            public void onError(Throwable th) {
                this.f37455a.mo42571a(th);
            }

            /* renamed from: a */
            public void mo41789a(Object obj) {
                this.f37455a.mo42570a();
            }
        }

        C12990a(C12321v<? super T> vVar) {
            this.f37453a = vVar;
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
            C13742j.m58674a((AtomicReference<C14063d>) this.f37454b);
        }

        public void onComplete() {
            C13742j.m58674a((AtomicReference<C14063d>) this.f37454b);
            if (getAndSet(C12347d.DISPOSED) != C12347d.DISPOSED) {
                this.f37453a.onComplete();
            }
        }

        public void onError(Throwable th) {
            C13742j.m58674a((AtomicReference<C14063d>) this.f37454b);
            if (getAndSet(C12347d.DISPOSED) != C12347d.DISPOSED) {
                this.f37453a.onError(th);
            } else {
                C12205a.m54894b(th);
            }
        }

        public void onSuccess(T t) {
            C13742j.m58674a((AtomicReference<C14063d>) this.f37454b);
            if (getAndSet(C12347d.DISPOSED) != C12347d.DISPOSED) {
                this.f37453a.onSuccess(t);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42571a(Throwable th) {
            if (C12347d.m55465a((AtomicReference<C12314c>) this)) {
                this.f37453a.onError(th);
            } else {
                C12205a.m54894b(th);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42570a() {
            if (C12347d.m55465a((AtomicReference<C12314c>) this)) {
                this.f37453a.onComplete();
            }
        }
    }

    public C12989g1(C5941y<T> yVar, C6007b<U> bVar) {
        super(yVar);
        this.f37452b = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        C12990a aVar = new C12990a(vVar);
        vVar.mo41931a(aVar);
        this.f37452b.mo24397a(aVar.f37454b);
        this.f37333a.mo24639a(aVar);
    }
}
