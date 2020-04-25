package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12321v;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.c.g0 */
/* compiled from: MaybeFlatten */
public final class C12986g0<T, R> extends C12943a<T, R> {

    /* renamed from: b */
    final C12339o<? super T, ? extends C5941y<? extends R>> f37447b;

    /* renamed from: e.a.x0.e.c.g0$a */
    /* compiled from: MaybeFlatten */
    static final class C12987a<T, R> extends AtomicReference<C12314c> implements C12321v<T>, C12314c {
        private static final long serialVersionUID = 4375739915521278546L;

        /* renamed from: N */
        C12314c f37448N;

        /* renamed from: a */
        final C12321v<? super R> f37449a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5941y<? extends R>> f37450b;

        /* renamed from: e.a.x0.e.c.g0$a$a */
        /* compiled from: MaybeFlatten */
        final class C12988a implements C12321v<R> {
            C12988a() {
            }

            /* renamed from: a */
            public void mo41931a(C12314c cVar) {
                C12347d.m55468c(C12987a.this, cVar);
            }

            public void onComplete() {
                C12987a.this.f37449a.onComplete();
            }

            public void onError(Throwable th) {
                C12987a.this.f37449a.onError(th);
            }

            public void onSuccess(R r) {
                C12987a.this.f37449a.onSuccess(r);
            }
        }

        C12987a(C12321v<? super R> vVar, C12339o<? super T, ? extends C5941y<? extends R>> oVar) {
            this.f37449a = vVar;
            this.f37450b = oVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55464a(this.f37448N, cVar)) {
                this.f37448N = cVar;
                this.f37449a.mo41931a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
            this.f37448N.dispose();
        }

        public void onComplete() {
            this.f37449a.onComplete();
        }

        public void onError(Throwable th) {
            this.f37449a.onError(th);
        }

        public void onSuccess(T t) {
            try {
                C5941y yVar = (C5941y) C12390b.m55563a(this.f37450b.apply(t), "The mapper returned a null MaybeSource");
                if (!mo41878d()) {
                    yVar.mo24639a(new C12988a());
                }
            } catch (Exception e) {
                C14398a.m62357b(e);
                this.f37449a.onError(e);
            }
        }
    }

    public C12986g0(C5941y<T> yVar, C12339o<? super T, ? extends C5941y<? extends R>> oVar) {
        super(yVar);
        this.f37447b = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super R> vVar) {
        this.f37333a.mo24639a(new C12987a(vVar, this.f37447b));
    }
}
