package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12321v;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.c.d0 */
/* compiled from: MaybeFlatMapNotification */
public final class C12962d0<T, R> extends C12943a<T, R> {

    /* renamed from: N */
    final C12339o<? super Throwable, ? extends C5941y<? extends R>> f37387N;

    /* renamed from: O */
    final Callable<? extends C5941y<? extends R>> f37388O;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5941y<? extends R>> f37389b;

    /* renamed from: e.a.x0.e.c.d0$a */
    /* compiled from: MaybeFlatMapNotification */
    static final class C12963a<T, R> extends AtomicReference<C12314c> implements C12321v<T>, C12314c {
        private static final long serialVersionUID = 4375739915521278546L;

        /* renamed from: N */
        final C12339o<? super Throwable, ? extends C5941y<? extends R>> f37390N;

        /* renamed from: O */
        final Callable<? extends C5941y<? extends R>> f37391O;

        /* renamed from: P */
        C12314c f37392P;

        /* renamed from: a */
        final C12321v<? super R> f37393a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5941y<? extends R>> f37394b;

        /* renamed from: e.a.x0.e.c.d0$a$a */
        /* compiled from: MaybeFlatMapNotification */
        final class C12964a implements C12321v<R> {
            C12964a() {
            }

            /* renamed from: a */
            public void mo41931a(C12314c cVar) {
                C12347d.m55468c(C12963a.this, cVar);
            }

            public void onComplete() {
                C12963a.this.f37393a.onComplete();
            }

            public void onError(Throwable th) {
                C12963a.this.f37393a.onError(th);
            }

            public void onSuccess(R r) {
                C12963a.this.f37393a.onSuccess(r);
            }
        }

        C12963a(C12321v<? super R> vVar, C12339o<? super T, ? extends C5941y<? extends R>> oVar, C12339o<? super Throwable, ? extends C5941y<? extends R>> oVar2, Callable<? extends C5941y<? extends R>> callable) {
            this.f37393a = vVar;
            this.f37394b = oVar;
            this.f37390N = oVar2;
            this.f37391O = callable;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55464a(this.f37392P, cVar)) {
                this.f37392P = cVar;
                this.f37393a.mo41931a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
            this.f37392P.dispose();
        }

        public void onComplete() {
            try {
                ((C5941y) C12390b.m55563a(this.f37391O.call(), "The onCompleteSupplier returned a null MaybeSource")).mo24639a(new C12964a());
            } catch (Exception e) {
                C14398a.m62357b(e);
                this.f37393a.onError(e);
            }
        }

        public void onError(Throwable th) {
            try {
                ((C5941y) C12390b.m55563a(this.f37390N.apply(th), "The onErrorMapper returned a null MaybeSource")).mo24639a(new C12964a());
            } catch (Exception e) {
                C14398a.m62357b(e);
                this.f37393a.onError(new CompositeException(th, e));
            }
        }

        public void onSuccess(T t) {
            try {
                ((C5941y) C12390b.m55563a(this.f37394b.apply(t), "The onSuccessMapper returned a null MaybeSource")).mo24639a(new C12964a());
            } catch (Exception e) {
                C14398a.m62357b(e);
                this.f37393a.onError(e);
            }
        }
    }

    public C12962d0(C5941y<T> yVar, C12339o<? super T, ? extends C5941y<? extends R>> oVar, C12339o<? super Throwable, ? extends C5941y<? extends R>> oVar2, Callable<? extends C5941y<? extends R>> callable) {
        super(yVar);
        this.f37389b = oVar;
        this.f37387N = oVar2;
        this.f37388O = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super R> vVar) {
        this.f37333a.mo24639a(new C12963a(vVar, this.f37389b, this.f37387N, this.f37388O));
    }
}
