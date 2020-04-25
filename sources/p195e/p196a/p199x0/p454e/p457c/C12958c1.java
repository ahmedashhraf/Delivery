package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12282j0;
import p195e.p196a.C12321v;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.c.c1 */
/* compiled from: MaybeSubscribeOn */
public final class C12958c1<T> extends C12943a<T, T> {

    /* renamed from: b */
    final C12282j0 f37379b;

    /* renamed from: e.a.x0.e.c.c1$a */
    /* compiled from: MaybeSubscribeOn */
    static final class C12959a<T> extends AtomicReference<C12314c> implements C12321v<T>, C12314c {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: a */
        final C12350g f37380a = new C12350g();

        /* renamed from: b */
        final C12321v<? super T> f37381b;

        C12959a(C12321v<? super T> vVar) {
            this.f37381b = vVar;
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
            this.f37380a.dispose();
        }

        public void onComplete() {
            this.f37381b.onComplete();
        }

        public void onError(Throwable th) {
            this.f37381b.onError(th);
        }

        public void onSuccess(T t) {
            this.f37381b.onSuccess(t);
        }
    }

    /* renamed from: e.a.x0.e.c.c1$b */
    /* compiled from: MaybeSubscribeOn */
    static final class C12960b<T> implements Runnable {

        /* renamed from: a */
        final C12321v<? super T> f37382a;

        /* renamed from: b */
        final C5941y<T> f37383b;

        C12960b(C12321v<? super T> vVar, C5941y<T> yVar) {
            this.f37382a = vVar;
            this.f37383b = yVar;
        }

        public void run() {
            this.f37383b.mo24639a(this.f37382a);
        }
    }

    public C12958c1(C5941y<T> yVar, C12282j0 j0Var) {
        super(yVar);
        this.f37379b = j0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        C12959a aVar = new C12959a(vVar);
        vVar.mo41931a(aVar);
        aVar.f37380a.mo42109a(this.f37379b.mo42021a((Runnable) new C12960b(aVar, this.f37333a)));
    }
}
