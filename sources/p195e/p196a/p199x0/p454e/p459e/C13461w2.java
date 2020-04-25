package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p467z0.C13795m;

/* renamed from: e.a.x0.e.e.w2 */
/* compiled from: ObservableSampleWithObservable */
public final class C13461w2<T> extends C13131a<T, T> {

    /* renamed from: N */
    final boolean f38989N;

    /* renamed from: b */
    final C5926g0<?> f38990b;

    /* renamed from: e.a.x0.e.e.w2$a */
    /* compiled from: ObservableSampleWithObservable */
    static final class C13462a<T> extends C13464c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        /* renamed from: P */
        final AtomicInteger f38991P = new AtomicInteger();

        /* renamed from: Q */
        volatile boolean f38992Q;

        C13462a(C12280i0<? super T> i0Var, C5926g0<?> g0Var) {
            super(i0Var, g0Var);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42925e() {
            this.f38992Q = true;
            if (this.f38991P.getAndIncrement() == 0) {
                mo42931g();
                this.f38995a.onComplete();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo42926f() {
            this.f38992Q = true;
            if (this.f38991P.getAndIncrement() == 0) {
                mo42931g();
                this.f38995a.onComplete();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo42927h() {
            if (this.f38991P.getAndIncrement() == 0) {
                do {
                    boolean z = this.f38992Q;
                    mo42931g();
                    if (z) {
                        this.f38995a.onComplete();
                        return;
                    }
                } while (this.f38991P.decrementAndGet() != 0);
            }
        }
    }

    /* renamed from: e.a.x0.e.e.w2$b */
    /* compiled from: ObservableSampleWithObservable */
    static final class C13463b<T> extends C13464c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        C13463b(C12280i0<? super T> i0Var, C5926g0<?> g0Var) {
            super(i0Var, g0Var);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42925e() {
            this.f38995a.onComplete();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo42926f() {
            this.f38995a.onComplete();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo42927h() {
            mo42931g();
        }
    }

    /* renamed from: e.a.x0.e.e.w2$c */
    /* compiled from: ObservableSampleWithObservable */
    static abstract class C13464c<T> extends AtomicReference<T> implements C12280i0<T>, C12314c {
        private static final long serialVersionUID = -3517602651313910099L;

        /* renamed from: N */
        final AtomicReference<C12314c> f38993N = new AtomicReference<>();

        /* renamed from: O */
        C12314c f38994O;

        /* renamed from: a */
        final C12280i0<? super T> f38995a;

        /* renamed from: b */
        final C5926g0<?> f38996b;

        C13464c(C12280i0<? super T> i0Var, C5926g0<?> g0Var) {
            this.f38995a = i0Var;
            this.f38996b = g0Var;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38994O, cVar)) {
                this.f38994O = cVar;
                this.f38995a.mo34123a((C12314c) this);
                if (this.f38993N.get() == null) {
                    this.f38996b.mo23893a(new C13465d(this));
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo42930b(C12314c cVar) {
            return C12347d.m55468c(this.f38993N, cVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38993N.get() == C12347d.DISPOSED;
        }

        public void dispose() {
            C12347d.m55465a(this.f38993N);
            this.f38994O.dispose();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public abstract void mo42925e();

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public abstract void mo42926f();

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo42931g() {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                this.f38995a.mo33453a(andSet);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public abstract void mo42927h();

        public void onComplete() {
            C12347d.m55465a(this.f38993N);
            mo42925e();
        }

        public void onError(Throwable th) {
            C12347d.m55465a(this.f38993N);
            this.f38995a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            lazySet(t);
        }

        /* renamed from: a */
        public void mo42929a(Throwable th) {
            this.f38994O.dispose();
            this.f38995a.onError(th);
        }

        /* renamed from: a */
        public void mo42928a() {
            this.f38994O.dispose();
            mo42926f();
        }
    }

    /* renamed from: e.a.x0.e.e.w2$d */
    /* compiled from: ObservableSampleWithObservable */
    static final class C13465d<T> implements C12280i0<Object> {

        /* renamed from: a */
        final C13464c<T> f38997a;

        C13465d(C13464c<T> cVar) {
            this.f38997a = cVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            this.f38997a.mo42930b(cVar);
        }

        public void onComplete() {
            this.f38997a.mo42928a();
        }

        public void onError(Throwable th) {
            this.f38997a.mo42929a(th);
        }

        /* renamed from: a */
        public void mo33453a(Object obj) {
            this.f38997a.mo42927h();
        }
    }

    public C13461w2(C5926g0<T> g0Var, C5926g0<?> g0Var2, boolean z) {
        super(g0Var);
        this.f38990b = g0Var2;
        this.f38989N = z;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C13795m mVar = new C13795m(i0Var);
        if (this.f38989N) {
            this.f37851a.mo23893a(new C13462a(mVar, this.f38990b));
        } else {
            this.f37851a.mo23893a(new C13463b(mVar, this.f38990b));
        }
    }
}
