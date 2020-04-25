package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.TimeoutException;
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

/* renamed from: e.a.x0.e.c.i1 */
/* compiled from: MaybeTimeoutPublisher */
public final class C13002i1<T, U> extends C12943a<T, T> {

    /* renamed from: N */
    final C5941y<? extends T> f37474N;

    /* renamed from: b */
    final C6007b<U> f37475b;

    /* renamed from: e.a.x0.e.c.i1$a */
    /* compiled from: MaybeTimeoutPublisher */
    static final class C13003a<T> extends AtomicReference<C12314c> implements C12321v<T> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* renamed from: a */
        final C12321v<? super T> f37476a;

        C13003a(C12321v<? super T> vVar) {
            this.f37476a = vVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            C12347d.m55468c(this, cVar);
        }

        public void onComplete() {
            this.f37476a.onComplete();
        }

        public void onError(Throwable th) {
            this.f37476a.onError(th);
        }

        public void onSuccess(T t) {
            this.f37476a.onSuccess(t);
        }
    }

    /* renamed from: e.a.x0.e.c.i1$b */
    /* compiled from: MaybeTimeoutPublisher */
    static final class C13004b<T, U> extends AtomicReference<C12314c> implements C12321v<T>, C12314c {
        private static final long serialVersionUID = -5955289211445418871L;

        /* renamed from: N */
        final C5941y<? extends T> f37477N;

        /* renamed from: O */
        final C13003a<T> f37478O;

        /* renamed from: a */
        final C12321v<? super T> f37479a;

        /* renamed from: b */
        final C13005c<T, U> f37480b = new C13005c<>(this);

        C13004b(C12321v<? super T> vVar, C5941y<? extends T> yVar) {
            this.f37479a = vVar;
            this.f37477N = yVar;
            this.f37478O = yVar != null ? new C13003a<>(vVar) : null;
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
            C13742j.m58674a((AtomicReference<C14063d>) this.f37480b);
            C13003a<T> aVar = this.f37478O;
            if (aVar != null) {
                C12347d.m55465a((AtomicReference<C12314c>) aVar);
            }
        }

        public void onComplete() {
            C13742j.m58674a((AtomicReference<C14063d>) this.f37480b);
            if (getAndSet(C12347d.DISPOSED) != C12347d.DISPOSED) {
                this.f37479a.onComplete();
            }
        }

        public void onError(Throwable th) {
            C13742j.m58674a((AtomicReference<C14063d>) this.f37480b);
            if (getAndSet(C12347d.DISPOSED) != C12347d.DISPOSED) {
                this.f37479a.onError(th);
            } else {
                C12205a.m54894b(th);
            }
        }

        public void onSuccess(T t) {
            C13742j.m58674a((AtomicReference<C14063d>) this.f37480b);
            if (getAndSet(C12347d.DISPOSED) != C12347d.DISPOSED) {
                this.f37479a.onSuccess(t);
            }
        }

        /* renamed from: a */
        public void mo42577a(Throwable th) {
            if (C12347d.m55465a((AtomicReference<C12314c>) this)) {
                this.f37479a.onError(th);
            } else {
                C12205a.m54894b(th);
            }
        }

        /* renamed from: a */
        public void mo42576a() {
            if (C12347d.m55465a((AtomicReference<C12314c>) this)) {
                C5941y<? extends T> yVar = this.f37477N;
                if (yVar == null) {
                    this.f37479a.onError(new TimeoutException());
                } else {
                    yVar.mo24639a(this.f37478O);
                }
            }
        }
    }

    /* renamed from: e.a.x0.e.c.i1$c */
    /* compiled from: MaybeTimeoutPublisher */
    static final class C13005c<T, U> extends AtomicReference<C14063d> implements C12297q<Object> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* renamed from: a */
        final C13004b<T, U> f37481a;

        C13005c(C13004b<T, U> bVar) {
            this.f37481a = bVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58676a((AtomicReference<C14063d>) this, dVar, Long.MAX_VALUE);
        }

        public void onComplete() {
            this.f37481a.mo42576a();
        }

        public void onError(Throwable th) {
            this.f37481a.mo42577a(th);
        }

        /* renamed from: a */
        public void mo41789a(Object obj) {
            ((C14063d) get()).cancel();
            this.f37481a.mo42576a();
        }
    }

    public C13002i1(C5941y<T> yVar, C6007b<U> bVar, C5941y<? extends T> yVar2) {
        super(yVar);
        this.f37475b = bVar;
        this.f37474N = yVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        C13004b bVar = new C13004b(vVar, this.f37474N);
        vVar.mo41931a(bVar);
        this.f37475b.mo24397a(bVar.f37480b);
        this.f37333a.mo24639a(bVar);
    }
}
