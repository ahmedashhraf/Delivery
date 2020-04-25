package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12282j0;
import p195e.p196a.C12321v;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.c.l */
/* compiled from: MaybeDelay */
public final class C13016l<T> extends C12943a<T, T> {

    /* renamed from: N */
    final TimeUnit f37497N;

    /* renamed from: O */
    final C12282j0 f37498O;

    /* renamed from: b */
    final long f37499b;

    /* renamed from: e.a.x0.e.c.l$a */
    /* compiled from: MaybeDelay */
    static final class C13017a<T> extends AtomicReference<C12314c> implements C12321v<T>, C12314c, Runnable {
        private static final long serialVersionUID = 5566860102500855068L;

        /* renamed from: N */
        final TimeUnit f37500N;

        /* renamed from: O */
        final C12282j0 f37501O;

        /* renamed from: P */
        T f37502P;

        /* renamed from: Q */
        Throwable f37503Q;

        /* renamed from: a */
        final C12321v<? super T> f37504a;

        /* renamed from: b */
        final long f37505b;

        C13017a(C12321v<? super T> vVar, long j, TimeUnit timeUnit, C12282j0 j0Var) {
            this.f37504a = vVar;
            this.f37505b = j;
            this.f37500N = timeUnit;
            this.f37501O = j0Var;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55468c(this, cVar)) {
                this.f37504a.mo41931a(this);
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
            mo42580a();
        }

        public void onError(Throwable th) {
            this.f37503Q = th;
            mo42580a();
        }

        public void onSuccess(T t) {
            this.f37502P = t;
            mo42580a();
        }

        public void run() {
            Throwable th = this.f37503Q;
            if (th != null) {
                this.f37504a.onError(th);
                return;
            }
            T t = this.f37502P;
            if (t != null) {
                this.f37504a.onSuccess(t);
            } else {
                this.f37504a.onComplete();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42580a() {
            C12347d.m55466a((AtomicReference<C12314c>) this, this.f37501O.mo42023a(this, this.f37505b, this.f37500N));
        }
    }

    public C13016l(C5941y<T> yVar, long j, TimeUnit timeUnit, C12282j0 j0Var) {
        super(yVar);
        this.f37499b = j;
        this.f37497N = timeUnit;
        this.f37498O = j0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        C5941y<T> yVar = this.f37333a;
        C13017a aVar = new C13017a(vVar, this.f37499b, this.f37497N, this.f37498O);
        yVar.mo24639a(aVar);
    }
}
