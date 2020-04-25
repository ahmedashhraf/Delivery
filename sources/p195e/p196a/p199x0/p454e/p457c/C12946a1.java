package p195e.p196a.p199x0.p454e.p457c;

import p195e.p196a.C12321v;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.c.a1 */
/* compiled from: MaybeOnErrorReturn */
public final class C12946a1<T> extends C12943a<T, T> {

    /* renamed from: b */
    final C12339o<? super Throwable, ? extends T> f37338b;

    /* renamed from: e.a.x0.e.c.a1$a */
    /* compiled from: MaybeOnErrorReturn */
    static final class C12947a<T> implements C12321v<T>, C12314c {

        /* renamed from: N */
        C12314c f37339N;

        /* renamed from: a */
        final C12321v<? super T> f37340a;

        /* renamed from: b */
        final C12339o<? super Throwable, ? extends T> f37341b;

        C12947a(C12321v<? super T> vVar, C12339o<? super Throwable, ? extends T> oVar) {
            this.f37340a = vVar;
            this.f37341b = oVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55464a(this.f37339N, cVar)) {
                this.f37339N = cVar;
                this.f37340a.mo41931a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37339N.mo41878d();
        }

        public void dispose() {
            this.f37339N.dispose();
        }

        public void onComplete() {
            this.f37340a.onComplete();
        }

        public void onError(Throwable th) {
            try {
                this.f37340a.onSuccess(C12390b.m55563a(this.f37341b.apply(th), "The valueSupplier returned a null value"));
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                this.f37340a.onError(new CompositeException(th, th2));
            }
        }

        public void onSuccess(T t) {
            this.f37340a.onSuccess(t);
        }
    }

    public C12946a1(C5941y<T> yVar, C12339o<? super Throwable, ? extends T> oVar) {
        super(yVar);
        this.f37338b = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f37333a.mo24639a(new C12947a(vVar, this.f37338b));
    }
}
