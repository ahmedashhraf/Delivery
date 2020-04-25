package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12292n0;
import p195e.p196a.C12321v;
import p195e.p196a.C5930q0;
import p195e.p196a.C5931s;
import p195e.p196a.C5941y;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

@C5936e
/* renamed from: e.a.x0.e.c.f0 */
/* compiled from: MaybeFlatMapSingleElement */
public final class C12978f0<T, R> extends C5931s<R> {

    /* renamed from: a */
    final C5941y<T> f37430a;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5930q0<? extends R>> f37431b;

    /* renamed from: e.a.x0.e.c.f0$a */
    /* compiled from: MaybeFlatMapSingleElement */
    static final class C12979a<T, R> extends AtomicReference<C12314c> implements C12321v<T>, C12314c {
        private static final long serialVersionUID = 4827726964688405508L;

        /* renamed from: a */
        final C12321v<? super R> f37432a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5930q0<? extends R>> f37433b;

        C12979a(C12321v<? super R> vVar, C12339o<? super T, ? extends C5930q0<? extends R>> oVar) {
            this.f37432a = vVar;
            this.f37433b = oVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55468c(this, cVar)) {
                this.f37432a.mo41931a(this);
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
            this.f37432a.onComplete();
        }

        public void onError(Throwable th) {
            this.f37432a.onError(th);
        }

        public void onSuccess(T t) {
            try {
                ((C5930q0) C12390b.m55563a(this.f37433b.apply(t), "The mapper returned a null SingleSource")).mo24192a(new C12980b(this, this.f37432a));
            } catch (Throwable th) {
                C14398a.m62357b(th);
                onError(th);
            }
        }
    }

    /* renamed from: e.a.x0.e.c.f0$b */
    /* compiled from: MaybeFlatMapSingleElement */
    static final class C12980b<R> implements C12292n0<R> {

        /* renamed from: a */
        final AtomicReference<C12314c> f37434a;

        /* renamed from: b */
        final C12321v<? super R> f37435b;

        C12980b(AtomicReference<C12314c> atomicReference, C12321v<? super R> vVar) {
            this.f37434a = atomicReference;
            this.f37435b = vVar;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            C12347d.m55466a(this.f37434a, cVar);
        }

        public void onError(Throwable th) {
            this.f37435b.onError(th);
        }

        public void onSuccess(R r) {
            this.f37435b.onSuccess(r);
        }
    }

    public C12978f0(C5941y<T> yVar, C12339o<? super T, ? extends C5930q0<? extends R>> oVar) {
        this.f37430a = yVar;
        this.f37431b = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super R> vVar) {
        this.f37430a.mo24639a(new C12979a(vVar, this.f37431b));
    }
}
