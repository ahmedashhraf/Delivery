package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12321v;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.c.d1 */
/* compiled from: MaybeSwitchIfEmpty */
public final class C12965d1<T> extends C12943a<T, T> {

    /* renamed from: b */
    final C5941y<? extends T> f37396b;

    /* renamed from: e.a.x0.e.c.d1$a */
    /* compiled from: MaybeSwitchIfEmpty */
    static final class C12966a<T> extends AtomicReference<C12314c> implements C12321v<T>, C12314c {
        private static final long serialVersionUID = -2223459372976438024L;

        /* renamed from: a */
        final C12321v<? super T> f37397a;

        /* renamed from: b */
        final C5941y<? extends T> f37398b;

        /* renamed from: e.a.x0.e.c.d1$a$a */
        /* compiled from: MaybeSwitchIfEmpty */
        static final class C12967a<T> implements C12321v<T> {

            /* renamed from: a */
            final C12321v<? super T> f37399a;

            /* renamed from: b */
            final AtomicReference<C12314c> f37400b;

            C12967a(C12321v<? super T> vVar, AtomicReference<C12314c> atomicReference) {
                this.f37399a = vVar;
                this.f37400b = atomicReference;
            }

            /* renamed from: a */
            public void mo41931a(C12314c cVar) {
                C12347d.m55468c(this.f37400b, cVar);
            }

            public void onComplete() {
                this.f37399a.onComplete();
            }

            public void onError(Throwable th) {
                this.f37399a.onError(th);
            }

            public void onSuccess(T t) {
                this.f37399a.onSuccess(t);
            }
        }

        C12966a(C12321v<? super T> vVar, C5941y<? extends T> yVar) {
            this.f37397a = vVar;
            this.f37398b = yVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55468c(this, cVar)) {
                this.f37397a.mo41931a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void onComplete() {
            C12314c cVar = (C12314c) get();
            if (cVar != C12347d.DISPOSED && compareAndSet(cVar, null)) {
                this.f37398b.mo24639a(new C12967a(this.f37397a, this));
            }
        }

        public void onError(Throwable th) {
            this.f37397a.onError(th);
        }

        public void onSuccess(T t) {
            this.f37397a.onSuccess(t);
        }
    }

    public C12965d1(C5941y<T> yVar, C5941y<? extends T> yVar2) {
        super(yVar);
        this.f37396b = yVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f37333a.mo24639a(new C12966a(vVar, this.f37396b));
    }
}
