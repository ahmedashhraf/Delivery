package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12292n0;
import p195e.p196a.C12321v;
import p195e.p196a.C5930q0;
import p195e.p196a.C5931s;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.g.z */
/* compiled from: SingleFlatMapMaybe */
public final class C13657z<T, R> extends C5931s<R> {

    /* renamed from: a */
    final C5930q0<? extends T> f39511a;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5941y<? extends R>> f39512b;

    /* renamed from: e.a.x0.e.g.z$a */
    /* compiled from: SingleFlatMapMaybe */
    static final class C13658a<R> implements C12321v<R> {

        /* renamed from: a */
        final AtomicReference<C12314c> f39513a;

        /* renamed from: b */
        final C12321v<? super R> f39514b;

        C13658a(AtomicReference<C12314c> atomicReference, C12321v<? super R> vVar) {
            this.f39513a = atomicReference;
            this.f39514b = vVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            C12347d.m55466a(this.f39513a, cVar);
        }

        public void onComplete() {
            this.f39514b.onComplete();
        }

        public void onError(Throwable th) {
            this.f39514b.onError(th);
        }

        public void onSuccess(R r) {
            this.f39514b.onSuccess(r);
        }
    }

    /* renamed from: e.a.x0.e.g.z$b */
    /* compiled from: SingleFlatMapMaybe */
    static final class C13659b<T, R> extends AtomicReference<C12314c> implements C12292n0<T>, C12314c {
        private static final long serialVersionUID = -5843758257109742742L;

        /* renamed from: a */
        final C12321v<? super R> f39515a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5941y<? extends R>> f39516b;

        C13659b(C12321v<? super R> vVar, C12339o<? super T, ? extends C5941y<? extends R>> oVar) {
            this.f39515a = vVar;
            this.f39516b = oVar;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            if (C12347d.m55468c(this, cVar)) {
                this.f39515a.mo41931a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void onError(Throwable th) {
            this.f39515a.onError(th);
        }

        public void onSuccess(T t) {
            try {
                C5941y yVar = (C5941y) C12390b.m55563a(this.f39516b.apply(t), "The mapper returned a null MaybeSource");
                if (!mo41878d()) {
                    yVar.mo24639a(new C13658a(this, this.f39515a));
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                onError(th);
            }
        }
    }

    public C13657z(C5930q0<? extends T> q0Var, C12339o<? super T, ? extends C5941y<? extends R>> oVar) {
        this.f39512b = oVar;
        this.f39511a = q0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super R> vVar) {
        this.f39511a.mo24192a(new C13659b(vVar, this.f39512b));
    }
}
