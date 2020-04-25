package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12321v;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.c.h1 */
/* compiled from: MaybeTimeoutMaybe */
public final class C12995h1<T, U> extends C12943a<T, T> {

    /* renamed from: N */
    final C5941y<? extends T> f37462N;

    /* renamed from: b */
    final C5941y<U> f37463b;

    /* renamed from: e.a.x0.e.c.h1$a */
    /* compiled from: MaybeTimeoutMaybe */
    static final class C12996a<T> extends AtomicReference<C12314c> implements C12321v<T> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* renamed from: a */
        final C12321v<? super T> f37464a;

        C12996a(C12321v<? super T> vVar) {
            this.f37464a = vVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            C12347d.m55468c(this, cVar);
        }

        public void onComplete() {
            this.f37464a.onComplete();
        }

        public void onError(Throwable th) {
            this.f37464a.onError(th);
        }

        public void onSuccess(T t) {
            this.f37464a.onSuccess(t);
        }
    }

    /* renamed from: e.a.x0.e.c.h1$b */
    /* compiled from: MaybeTimeoutMaybe */
    static final class C12997b<T, U> extends AtomicReference<C12314c> implements C12321v<T>, C12314c {
        private static final long serialVersionUID = -5955289211445418871L;

        /* renamed from: N */
        final C5941y<? extends T> f37465N;

        /* renamed from: O */
        final C12996a<T> f37466O;

        /* renamed from: a */
        final C12321v<? super T> f37467a;

        /* renamed from: b */
        final C12998c<T, U> f37468b = new C12998c<>(this);

        C12997b(C12321v<? super T> vVar, C5941y<? extends T> yVar) {
            this.f37467a = vVar;
            this.f37465N = yVar;
            this.f37466O = yVar != null ? new C12996a<>(vVar) : null;
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
            C12347d.m55465a((AtomicReference<C12314c>) this.f37468b);
            C12996a<T> aVar = this.f37466O;
            if (aVar != null) {
                C12347d.m55465a((AtomicReference<C12314c>) aVar);
            }
        }

        public void onComplete() {
            C12347d.m55465a((AtomicReference<C12314c>) this.f37468b);
            if (getAndSet(C12347d.DISPOSED) != C12347d.DISPOSED) {
                this.f37467a.onComplete();
            }
        }

        public void onError(Throwable th) {
            C12347d.m55465a((AtomicReference<C12314c>) this.f37468b);
            if (getAndSet(C12347d.DISPOSED) != C12347d.DISPOSED) {
                this.f37467a.onError(th);
            } else {
                C12205a.m54894b(th);
            }
        }

        public void onSuccess(T t) {
            C12347d.m55465a((AtomicReference<C12314c>) this.f37468b);
            if (getAndSet(C12347d.DISPOSED) != C12347d.DISPOSED) {
                this.f37467a.onSuccess(t);
            }
        }

        /* renamed from: a */
        public void mo42574a(Throwable th) {
            if (C12347d.m55465a((AtomicReference<C12314c>) this)) {
                this.f37467a.onError(th);
            } else {
                C12205a.m54894b(th);
            }
        }

        /* renamed from: a */
        public void mo42573a() {
            if (C12347d.m55465a((AtomicReference<C12314c>) this)) {
                C5941y<? extends T> yVar = this.f37465N;
                if (yVar == null) {
                    this.f37467a.onError(new TimeoutException());
                } else {
                    yVar.mo24639a(this.f37466O);
                }
            }
        }
    }

    /* renamed from: e.a.x0.e.c.h1$c */
    /* compiled from: MaybeTimeoutMaybe */
    static final class C12998c<T, U> extends AtomicReference<C12314c> implements C12321v<Object> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* renamed from: a */
        final C12997b<T, U> f37469a;

        C12998c(C12997b<T, U> bVar) {
            this.f37469a = bVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            C12347d.m55468c(this, cVar);
        }

        public void onComplete() {
            this.f37469a.mo42573a();
        }

        public void onError(Throwable th) {
            this.f37469a.mo42574a(th);
        }

        public void onSuccess(Object obj) {
            this.f37469a.mo42573a();
        }
    }

    public C12995h1(C5941y<T> yVar, C5941y<U> yVar2, C5941y<? extends T> yVar3) {
        super(yVar);
        this.f37463b = yVar2;
        this.f37462N = yVar3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        C12997b bVar = new C12997b(vVar, this.f37462N);
        vVar.mo41931a(bVar);
        this.f37463b.mo24639a(bVar.f37468b);
        this.f37333a.mo24639a(bVar);
    }
}
