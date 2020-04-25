package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12282j0;
import p195e.p196a.C12321v;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.c.x0 */
/* compiled from: MaybeObserveOn */
public final class C13082x0<T> extends C12943a<T, T> {

    /* renamed from: b */
    final C12282j0 f37622b;

    /* renamed from: e.a.x0.e.c.x0$a */
    /* compiled from: MaybeObserveOn */
    static final class C13083a<T> extends AtomicReference<C12314c> implements C12321v<T>, C12314c, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: N */
        T f37623N;

        /* renamed from: O */
        Throwable f37624O;

        /* renamed from: a */
        final C12321v<? super T> f37625a;

        /* renamed from: b */
        final C12282j0 f37626b;

        C13083a(C12321v<? super T> vVar, C12282j0 j0Var) {
            this.f37625a = vVar;
            this.f37626b = j0Var;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55468c(this, cVar)) {
                this.f37625a.mo41931a(this);
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
            C12347d.m55466a((AtomicReference<C12314c>) this, this.f37626b.mo42021a((Runnable) this));
        }

        public void onError(Throwable th) {
            this.f37624O = th;
            C12347d.m55466a((AtomicReference<C12314c>) this, this.f37626b.mo42021a((Runnable) this));
        }

        public void onSuccess(T t) {
            this.f37623N = t;
            C12347d.m55466a((AtomicReference<C12314c>) this, this.f37626b.mo42021a((Runnable) this));
        }

        public void run() {
            Throwable th = this.f37624O;
            if (th != null) {
                this.f37624O = null;
                this.f37625a.onError(th);
                return;
            }
            T t = this.f37623N;
            if (t != null) {
                this.f37623N = null;
                this.f37625a.onSuccess(t);
                return;
            }
            this.f37625a.onComplete();
        }
    }

    public C13082x0(C5941y<T> yVar, C12282j0 j0Var) {
        super(yVar);
        this.f37622b = j0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f37333a.mo24639a(new C13083a(vVar, this.f37622b));
    }
}
