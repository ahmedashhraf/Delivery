package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12292n0;
import p195e.p196a.C12321v;
import p195e.p196a.C5928k0;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12328d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.c.u */
/* compiled from: MaybeEqualSingle */
public final class C13067u<T> extends C5928k0<Boolean> {

    /* renamed from: N */
    final C12328d<? super T, ? super T> f37588N;

    /* renamed from: a */
    final C5941y<? extends T> f37589a;

    /* renamed from: b */
    final C5941y<? extends T> f37590b;

    /* renamed from: e.a.x0.e.c.u$a */
    /* compiled from: MaybeEqualSingle */
    static final class C13068a<T> extends AtomicInteger implements C12314c {

        /* renamed from: N */
        final C13069b<T> f37591N = new C13069b<>(this);

        /* renamed from: O */
        final C12328d<? super T, ? super T> f37592O;

        /* renamed from: a */
        final C12292n0<? super Boolean> f37593a;

        /* renamed from: b */
        final C13069b<T> f37594b = new C13069b<>(this);

        C13068a(C12292n0<? super Boolean> n0Var, C12328d<? super T, ? super T> dVar) {
            super(2);
            this.f37593a = n0Var;
            this.f37592O = dVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42596a(C5941y<? extends T> yVar, C5941y<? extends T> yVar2) {
            yVar.mo24639a(this.f37594b);
            yVar2.mo24639a(this.f37591N);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) this.f37594b.get());
        }

        public void dispose() {
            this.f37594b.mo42597a();
            this.f37591N.mo42597a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42594a() {
            if (decrementAndGet() == 0) {
                Object obj = this.f37594b.f37596b;
                Object obj2 = this.f37591N.f37596b;
                if (obj == null || obj2 == null) {
                    this.f37593a.onSuccess(Boolean.valueOf(obj == null && obj2 == null));
                } else {
                    try {
                        this.f37593a.onSuccess(Boolean.valueOf(this.f37592O.mo42089a(obj, obj2)));
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        this.f37593a.onError(th);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42595a(C13069b<T> bVar, Throwable th) {
            if (getAndSet(0) > 0) {
                C13069b<T> bVar2 = this.f37594b;
                if (bVar == bVar2) {
                    this.f37591N.mo42597a();
                } else {
                    bVar2.mo42597a();
                }
                this.f37593a.onError(th);
                return;
            }
            C12205a.m54894b(th);
        }
    }

    /* renamed from: e.a.x0.e.c.u$b */
    /* compiled from: MaybeEqualSingle */
    static final class C13069b<T> extends AtomicReference<C12314c> implements C12321v<T> {
        private static final long serialVersionUID = -3031974433025990931L;

        /* renamed from: a */
        final C13068a<T> f37595a;

        /* renamed from: b */
        Object f37596b;

        C13069b(C13068a<T> aVar) {
            this.f37595a = aVar;
        }

        /* renamed from: a */
        public void mo42597a() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void onComplete() {
            this.f37595a.mo42594a();
        }

        public void onError(Throwable th) {
            this.f37595a.mo42595a(this, th);
        }

        public void onSuccess(T t) {
            this.f37596b = t;
            this.f37595a.mo42594a();
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            C12347d.m55468c(this, cVar);
        }
    }

    public C13067u(C5941y<? extends T> yVar, C5941y<? extends T> yVar2, C12328d<? super T, ? super T> dVar) {
        this.f37589a = yVar;
        this.f37590b = yVar2;
        this.f37588N = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super Boolean> n0Var) {
        C13068a aVar = new C13068a(n0Var, this.f37588N);
        n0Var.mo41974a(aVar);
        aVar.mo42596a(this.f37589a, this.f37590b);
    }
}
