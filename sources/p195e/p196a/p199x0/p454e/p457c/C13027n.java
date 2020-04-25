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

/* renamed from: e.a.x0.e.c.n */
/* compiled from: MaybeDelaySubscriptionOtherPublisher */
public final class C13027n<T, U> extends C12943a<T, T> {

    /* renamed from: b */
    final C6007b<U> f37519b;

    /* renamed from: e.a.x0.e.c.n$a */
    /* compiled from: MaybeDelaySubscriptionOtherPublisher */
    static final class C13028a<T> extends AtomicReference<C12314c> implements C12321v<T> {
        private static final long serialVersionUID = 706635022205076709L;

        /* renamed from: a */
        final C12321v<? super T> f37520a;

        C13028a(C12321v<? super T> vVar) {
            this.f37520a = vVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            C12347d.m55468c(this, cVar);
        }

        public void onComplete() {
            this.f37520a.onComplete();
        }

        public void onError(Throwable th) {
            this.f37520a.onError(th);
        }

        public void onSuccess(T t) {
            this.f37520a.onSuccess(t);
        }
    }

    /* renamed from: e.a.x0.e.c.n$b */
    /* compiled from: MaybeDelaySubscriptionOtherPublisher */
    static final class C13029b<T> implements C12297q<Object>, C12314c {

        /* renamed from: N */
        C14063d f37521N;

        /* renamed from: a */
        final C13028a<T> f37522a;

        /* renamed from: b */
        C5941y<T> f37523b;

        C13029b(C12321v<? super T> vVar, C5941y<T> yVar) {
            this.f37522a = new C13028a<>(vVar);
            this.f37523b = yVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f37521N, dVar)) {
                this.f37521N = dVar;
                this.f37522a.f37520a.mo41931a(this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) this.f37522a.get());
        }

        public void dispose() {
            this.f37521N.cancel();
            this.f37521N = C13742j.CANCELLED;
            C12347d.m55465a((AtomicReference<C12314c>) this.f37522a);
        }

        public void onComplete() {
            C14063d dVar = this.f37521N;
            C13742j jVar = C13742j.CANCELLED;
            if (dVar != jVar) {
                this.f37521N = jVar;
                mo42585a();
            }
        }

        public void onError(Throwable th) {
            C14063d dVar = this.f37521N;
            C13742j jVar = C13742j.CANCELLED;
            if (dVar != jVar) {
                this.f37521N = jVar;
                this.f37522a.f37520a.onError(th);
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo41789a(Object obj) {
            C14063d dVar = this.f37521N;
            if (dVar != C13742j.CANCELLED) {
                dVar.cancel();
                this.f37521N = C13742j.CANCELLED;
                mo42585a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42585a() {
            C5941y<T> yVar = this.f37523b;
            this.f37523b = null;
            yVar.mo24639a(this.f37522a);
        }
    }

    public C13027n(C5941y<T> yVar, C6007b<U> bVar) {
        super(yVar);
        this.f37519b = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f37519b.mo24397a(new C13029b(vVar, this.f37333a));
    }
}
