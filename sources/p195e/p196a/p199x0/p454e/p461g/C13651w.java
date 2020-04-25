package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.C12292n0;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.g.w */
/* compiled from: SingleFlatMapCompletable */
public final class C13651w<T> extends C5925c {

    /* renamed from: a */
    final C5930q0<T> f39490a;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5927i> f39491b;

    /* renamed from: e.a.x0.e.g.w$a */
    /* compiled from: SingleFlatMapCompletable */
    static final class C13652a<T> extends AtomicReference<C12314c> implements C12292n0<T>, C12268f, C12314c {
        private static final long serialVersionUID = -2177128922851101253L;

        /* renamed from: a */
        final C12268f f39492a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5927i> f39493b;

        C13652a(C12268f fVar, C12339o<? super T, ? extends C5927i> oVar) {
            this.f39492a = fVar;
            this.f39493b = oVar;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            C12347d.m55466a((AtomicReference<C12314c>) this, cVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void onComplete() {
            this.f39492a.onComplete();
        }

        public void onError(Throwable th) {
            this.f39492a.onError(th);
        }

        public void onSuccess(T t) {
            try {
                C5927i iVar = (C5927i) C12390b.m55563a(this.f39493b.apply(t), "The mapper returned a null CompletableSource");
                if (!mo41878d()) {
                    iVar.mo24122a(this);
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                onError(th);
            }
        }
    }

    public C13651w(C5930q0<T> q0Var, C12339o<? super T, ? extends C5927i> oVar) {
        this.f39490a = q0Var;
        this.f39491b = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        C13652a aVar = new C13652a(fVar, this.f39491b);
        fVar.mo41921a(aVar);
        this.f39490a.mo24192a(aVar);
    }
}
