package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.C12321v;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.c.a0 */
/* compiled from: MaybeFlatMapCompletable */
public final class C12944a0<T> extends C5925c {

    /* renamed from: a */
    final C5941y<T> f37334a;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5927i> f37335b;

    /* renamed from: e.a.x0.e.c.a0$a */
    /* compiled from: MaybeFlatMapCompletable */
    static final class C12945a<T> extends AtomicReference<C12314c> implements C12321v<T>, C12268f, C12314c {
        private static final long serialVersionUID = -2177128922851101253L;

        /* renamed from: a */
        final C12268f f37336a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5927i> f37337b;

        C12945a(C12268f fVar, C12339o<? super T, ? extends C5927i> oVar) {
            this.f37336a = fVar;
            this.f37337b = oVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
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
            this.f37336a.onComplete();
        }

        public void onError(Throwable th) {
            this.f37336a.onError(th);
        }

        public void onSuccess(T t) {
            try {
                C5927i iVar = (C5927i) C12390b.m55563a(this.f37337b.apply(t), "The mapper returned a null CompletableSource");
                if (!mo41878d()) {
                    iVar.mo24122a(this);
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                onError(th);
            }
        }
    }

    public C12944a0(C5941y<T> yVar, C12339o<? super T, ? extends C5927i> oVar) {
        this.f37334a = yVar;
        this.f37335b = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        C12945a aVar = new C12945a(fVar, this.f37335b);
        fVar.mo41921a(aVar);
        this.f37334a.mo24639a(aVar);
    }
}
