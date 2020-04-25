package p195e.p196a.p199x0.p454e.p457c;

import p195e.p196a.C12321v;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12342r;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.c.y0 */
/* compiled from: MaybeOnErrorComplete */
public final class C13086y0<T> extends C12943a<T, T> {

    /* renamed from: b */
    final C12342r<? super Throwable> f37632b;

    /* renamed from: e.a.x0.e.c.y0$a */
    /* compiled from: MaybeOnErrorComplete */
    static final class C13087a<T> implements C12321v<T>, C12314c {

        /* renamed from: N */
        C12314c f37633N;

        /* renamed from: a */
        final C12321v<? super T> f37634a;

        /* renamed from: b */
        final C12342r<? super Throwable> f37635b;

        C13087a(C12321v<? super T> vVar, C12342r<? super Throwable> rVar) {
            this.f37634a = vVar;
            this.f37635b = rVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55464a(this.f37633N, cVar)) {
                this.f37633N = cVar;
                this.f37634a.mo41931a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37633N.mo41878d();
        }

        public void dispose() {
            this.f37633N.dispose();
        }

        public void onComplete() {
            this.f37634a.onComplete();
        }

        public void onError(Throwable th) {
            try {
                if (this.f37635b.mo41812b(th)) {
                    this.f37634a.onComplete();
                } else {
                    this.f37634a.onError(th);
                }
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                this.f37634a.onError(new CompositeException(th, th2));
            }
        }

        public void onSuccess(T t) {
            this.f37634a.onSuccess(t);
        }
    }

    public C13086y0(C5941y<T> yVar, C12342r<? super Throwable> rVar) {
        super(yVar);
        this.f37632b = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f37333a.mo24639a(new C13087a(vVar, this.f37632b));
    }
}
