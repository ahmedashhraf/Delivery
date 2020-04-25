package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C12321v;
import p195e.p196a.C5923b0;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p452c.C12405n;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.a2 */
/* compiled from: ObservableMergeWithMaybe */
public final class C13137a2<T> extends C13131a<T, T> {

    /* renamed from: b */
    final C5941y<? extends T> f37867b;

    /* renamed from: e.a.x0.e.e.a2$a */
    /* compiled from: ObservableMergeWithMaybe */
    static final class C13138a<T> extends AtomicInteger implements C12280i0<T>, C12314c {

        /* renamed from: U */
        static final int f37868U = 1;

        /* renamed from: V */
        static final int f37869V = 2;
        private static final long serialVersionUID = -4592979584110982903L;

        /* renamed from: N */
        final C13139a<T> f37870N = new C13139a<>(this);

        /* renamed from: O */
        final C13746c f37871O = new C13746c();

        /* renamed from: P */
        volatile C12405n<T> f37872P;

        /* renamed from: Q */
        T f37873Q;

        /* renamed from: R */
        volatile boolean f37874R;

        /* renamed from: S */
        volatile boolean f37875S;

        /* renamed from: T */
        volatile int f37876T;

        /* renamed from: a */
        final C12280i0<? super T> f37877a;

        /* renamed from: b */
        final AtomicReference<C12314c> f37878b = new AtomicReference<>();

        /* renamed from: e.a.x0.e.e.a2$a$a */
        /* compiled from: ObservableMergeWithMaybe */
        static final class C13139a<T> extends AtomicReference<C12314c> implements C12321v<T> {
            private static final long serialVersionUID = -2935427570954647017L;

            /* renamed from: a */
            final C13138a<T> f37879a;

            C13139a(C13138a<T> aVar) {
                this.f37879a = aVar;
            }

            /* renamed from: a */
            public void mo41931a(C12314c cVar) {
                C12347d.m55468c(this, cVar);
            }

            public void onComplete() {
                this.f37879a.mo42670g();
            }

            public void onError(Throwable th) {
                this.f37879a.mo42666a(th);
            }

            public void onSuccess(T t) {
                this.f37879a.mo42667b(t);
            }
        }

        C13138a(C12280i0<? super T> i0Var) {
            this.f37877a = i0Var;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            C12347d.m55468c(this.f37878b, cVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo42667b(T t) {
            if (compareAndSet(0, 1)) {
                this.f37877a.mo33453a(t);
                this.f37876T = 2;
            } else {
                this.f37873Q = t;
                this.f37876T = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            mo42668e();
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) this.f37878b.get());
        }

        public void dispose() {
            this.f37874R = true;
            C12347d.m55465a(this.f37878b);
            C12347d.m55465a((AtomicReference<C12314c>) this.f37870N);
            if (getAndIncrement() == 0) {
                this.f37872P = null;
                this.f37873Q = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42668e() {
            C12280i0<? super T> i0Var = this.f37877a;
            int i = 1;
            while (!this.f37874R) {
                if (this.f37871O.get() != null) {
                    this.f37873Q = null;
                    this.f37872P = null;
                    i0Var.onError(this.f37871O.mo43143d());
                    return;
                }
                int i2 = this.f37876T;
                if (i2 == 1) {
                    T t = this.f37873Q;
                    this.f37873Q = null;
                    this.f37876T = 2;
                    i0Var.mo33453a(t);
                    i2 = 2;
                }
                boolean z = this.f37875S;
                C12405n<T> nVar = this.f37872P;
                Object poll = nVar != null ? nVar.poll() : null;
                boolean z2 = poll == null;
                if (z && z2 && i2 == 2) {
                    this.f37872P = null;
                    i0Var.onComplete();
                    return;
                } else if (z2) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    i0Var.mo33453a(poll);
                }
            }
            this.f37873Q = null;
            this.f37872P = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public C12405n<T> mo42669f() {
            C12405n<T> nVar = this.f37872P;
            if (nVar != null) {
                return nVar;
            }
            C13663c cVar = new C13663c(C5923b0.m26088M());
            this.f37872P = cVar;
            return cVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo42670g() {
            this.f37876T = 2;
            mo42665a();
        }

        public void onComplete() {
            this.f37875S = true;
            mo42665a();
        }

        public void onError(Throwable th) {
            if (this.f37871O.mo43142a(th)) {
                C12347d.m55465a(this.f37878b);
                mo42665a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (compareAndSet(0, 1)) {
                this.f37877a.mo33453a(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                mo42669f().offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            mo42668e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42666a(Throwable th) {
            if (this.f37871O.mo43142a(th)) {
                C12347d.m55465a(this.f37878b);
                mo42665a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42665a() {
            if (getAndIncrement() == 0) {
                mo42668e();
            }
        }
    }

    public C13137a2(C5923b0<T> b0Var, C5941y<? extends T> yVar) {
        super(b0Var);
        this.f37867b = yVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C13138a aVar = new C13138a(i0Var);
        i0Var.mo34123a((C12314c) aVar);
        this.f37851a.mo23893a(aVar);
        this.f37867b.mo24639a(aVar.f37870N);
    }
}
