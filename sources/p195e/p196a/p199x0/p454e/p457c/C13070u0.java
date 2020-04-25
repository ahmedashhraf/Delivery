package p195e.p196a.p199x0.p454e.p457c;

import p195e.p196a.C12321v;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.c.u0 */
/* compiled from: MaybeMap */
public final class C13070u0<T, R> extends C12943a<T, R> {

    /* renamed from: b */
    final C12339o<? super T, ? extends R> f37597b;

    /* renamed from: e.a.x0.e.c.u0$a */
    /* compiled from: MaybeMap */
    static final class C13071a<T, R> implements C12321v<T>, C12314c {

        /* renamed from: N */
        C12314c f37598N;

        /* renamed from: a */
        final C12321v<? super R> f37599a;

        /* renamed from: b */
        final C12339o<? super T, ? extends R> f37600b;

        C13071a(C12321v<? super R> vVar, C12339o<? super T, ? extends R> oVar) {
            this.f37599a = vVar;
            this.f37600b = oVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55464a(this.f37598N, cVar)) {
                this.f37598N = cVar;
                this.f37599a.mo41931a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37598N.mo41878d();
        }

        public void dispose() {
            C12314c cVar = this.f37598N;
            this.f37598N = C12347d.DISPOSED;
            cVar.dispose();
        }

        public void onComplete() {
            this.f37599a.onComplete();
        }

        public void onError(Throwable th) {
            this.f37599a.onError(th);
        }

        public void onSuccess(T t) {
            try {
                this.f37599a.onSuccess(C12390b.m55563a(this.f37600b.apply(t), "The mapper returned a null item"));
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f37599a.onError(th);
            }
        }
    }

    public C13070u0(C5941y<T> yVar, C12339o<? super T, ? extends R> oVar) {
        super(yVar);
        this.f37597b = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super R> vVar) {
        this.f37333a.mo24639a(new C13071a(vVar, this.f37597b));
    }
}
