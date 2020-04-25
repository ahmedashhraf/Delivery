package p195e.p196a.p199x0.p454e.p457c;

import p195e.p196a.C12280i0;
import p195e.p196a.C12321v;
import p195e.p196a.C5923b0;
import p195e.p196a.C5941y;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p452c.C12397f;
import p195e.p196a.p199x0.p453d.C12419l;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.c.l1 */
/* compiled from: MaybeToObservable */
public final class C13019l1<T> extends C5923b0<T> implements C12397f<T> {

    /* renamed from: a */
    final C5941y<T> f37507a;

    /* renamed from: e.a.x0.e.c.l1$a */
    /* compiled from: MaybeToObservable */
    static final class C13020a<T> extends C12419l<T> implements C12321v<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* renamed from: S */
        C12314c f37508S;

        C13020a(C12280i0<? super T> i0Var) {
            super(i0Var);
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55464a(this.f37508S, cVar)) {
                this.f37508S = cVar;
                this.f35574a.mo34123a((C12314c) this);
            }
        }

        public void dispose() {
            super.dispose();
            this.f37508S.dispose();
        }

        public void onComplete() {
            mo42161a();
        }

        public void onError(Throwable th) {
            mo42162a(th);
        }

        public void onSuccess(T t) {
            mo42163b(t);
        }
    }

    public C13019l1(C5941y<T> yVar) {
        this.f37507a = yVar;
    }

    @C5936e
    /* renamed from: g */
    public static <T> C12321v<T> m56978g(C12280i0<? super T> i0Var) {
        return new C13020a(i0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f37507a.mo24639a(m56978g(i0Var));
    }

    public C5941y<T> source() {
        return this.f37507a;
    }
}
