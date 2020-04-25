package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12321v;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12327c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.c.z */
/* compiled from: MaybeFlatMapBiSelector */
public final class C13088z<T, U, R> extends C12943a<T, R> {

    /* renamed from: N */
    final C12327c<? super T, ? super U, ? extends R> f37636N;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5941y<? extends U>> f37637b;

    /* renamed from: e.a.x0.e.c.z$a */
    /* compiled from: MaybeFlatMapBiSelector */
    static final class C13089a<T, U, R> implements C12321v<T>, C12314c {

        /* renamed from: a */
        final C12339o<? super T, ? extends C5941y<? extends U>> f37638a;

        /* renamed from: b */
        final C13090a<T, U, R> f37639b;

        /* renamed from: e.a.x0.e.c.z$a$a */
        /* compiled from: MaybeFlatMapBiSelector */
        static final class C13090a<T, U, R> extends AtomicReference<C12314c> implements C12321v<U> {
            private static final long serialVersionUID = -2897979525538174559L;

            /* renamed from: N */
            T f37640N;

            /* renamed from: a */
            final C12321v<? super R> f37641a;

            /* renamed from: b */
            final C12327c<? super T, ? super U, ? extends R> f37642b;

            C13090a(C12321v<? super R> vVar, C12327c<? super T, ? super U, ? extends R> cVar) {
                this.f37641a = vVar;
                this.f37642b = cVar;
            }

            /* renamed from: a */
            public void mo41931a(C12314c cVar) {
                C12347d.m55468c(this, cVar);
            }

            public void onComplete() {
                this.f37641a.onComplete();
            }

            public void onError(Throwable th) {
                this.f37641a.onError(th);
            }

            public void onSuccess(U u) {
                T t = this.f37640N;
                this.f37640N = null;
                try {
                    this.f37641a.onSuccess(C12390b.m55563a(this.f37642b.mo35569a(t, u), "The resultSelector returned a null value"));
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f37641a.onError(th);
                }
            }
        }

        C13089a(C12321v<? super R> vVar, C12339o<? super T, ? extends C5941y<? extends U>> oVar, C12327c<? super T, ? super U, ? extends R> cVar) {
            this.f37639b = new C13090a<>(vVar, cVar);
            this.f37638a = oVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55468c(this.f37639b, cVar)) {
                this.f37639b.f37641a.mo41931a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) this.f37639b.get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this.f37639b);
        }

        public void onComplete() {
            this.f37639b.f37641a.onComplete();
        }

        public void onError(Throwable th) {
            this.f37639b.f37641a.onError(th);
        }

        public void onSuccess(T t) {
            try {
                C5941y yVar = (C5941y) C12390b.m55563a(this.f37638a.apply(t), "The mapper returned a null MaybeSource");
                if (C12347d.m55466a((AtomicReference<C12314c>) this.f37639b, (C12314c) null)) {
                    C13090a<T, U, R> aVar = this.f37639b;
                    aVar.f37640N = t;
                    yVar.mo24639a(aVar);
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f37639b.f37641a.onError(th);
            }
        }
    }

    public C13088z(C5941y<T> yVar, C12339o<? super T, ? extends C5941y<? extends U>> oVar, C12327c<? super T, ? super U, ? extends R> cVar) {
        super(yVar);
        this.f37637b = oVar;
        this.f37636N = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super R> vVar) {
        this.f37333a.mo24639a(new C13089a(vVar, this.f37637b, this.f37636N));
    }
}
