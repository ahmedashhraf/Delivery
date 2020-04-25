package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12282j0;
import p195e.p196a.C12321v;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.c.p1 */
/* compiled from: MaybeUnsubscribeOn */
public final class C13044p1<T> extends C12943a<T, T> {

    /* renamed from: b */
    final C12282j0 f37544b;

    /* renamed from: e.a.x0.e.c.p1$a */
    /* compiled from: MaybeUnsubscribeOn */
    static final class C13045a<T> extends AtomicReference<C12314c> implements C12321v<T>, C12314c, Runnable {
        private static final long serialVersionUID = 3256698449646456986L;

        /* renamed from: N */
        C12314c f37545N;

        /* renamed from: a */
        final C12321v<? super T> f37546a;

        /* renamed from: b */
        final C12282j0 f37547b;

        C13045a(C12321v<? super T> vVar, C12282j0 j0Var) {
            this.f37546a = vVar;
            this.f37547b = j0Var;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55468c(this, cVar)) {
                this.f37546a.mo41931a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12314c cVar = (C12314c) getAndSet(C12347d.DISPOSED);
            if (cVar != C12347d.DISPOSED) {
                this.f37545N = cVar;
                this.f37547b.mo42021a((Runnable) this);
            }
        }

        public void onComplete() {
            this.f37546a.onComplete();
        }

        public void onError(Throwable th) {
            this.f37546a.onError(th);
        }

        public void onSuccess(T t) {
            this.f37546a.onSuccess(t);
        }

        public void run() {
            this.f37545N.dispose();
        }
    }

    public C13044p1(C5941y<T> yVar, C12282j0 j0Var) {
        super(yVar);
        this.f37544b = j0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f37333a.mo24639a(new C13045a(vVar, this.f37544b));
    }
}
