package p195e.p196a.p199x0.p454e.p457c;

import p195e.p196a.C12321v;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12325a;
import p195e.p196a.p449w0.C12331g;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.c.b1 */
/* compiled from: MaybePeek */
public final class C12952b1<T> extends C12943a<T, T> {

    /* renamed from: N */
    final C12331g<? super T> f37355N;

    /* renamed from: O */
    final C12331g<? super Throwable> f37356O;

    /* renamed from: P */
    final C12325a f37357P;

    /* renamed from: Q */
    final C12325a f37358Q;

    /* renamed from: R */
    final C12325a f37359R;

    /* renamed from: b */
    final C12331g<? super C12314c> f37360b;

    /* renamed from: e.a.x0.e.c.b1$a */
    /* compiled from: MaybePeek */
    static final class C12953a<T> implements C12321v<T>, C12314c {

        /* renamed from: N */
        C12314c f37361N;

        /* renamed from: a */
        final C12321v<? super T> f37362a;

        /* renamed from: b */
        final C12952b1<T> f37363b;

        C12953a(C12321v<? super T> vVar, C12952b1<T> b1Var) {
            this.f37362a = vVar;
            this.f37363b = b1Var;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55464a(this.f37361N, cVar)) {
                try {
                    this.f37363b.f37360b.mo33410c(cVar);
                    this.f37361N = cVar;
                    this.f37362a.mo41931a(this);
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    cVar.dispose();
                    this.f37361N = C12347d.DISPOSED;
                    C12348e.m55478a(th, this.f37362a);
                }
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37361N.mo41878d();
        }

        public void dispose() {
            try {
                this.f37363b.f37359R.run();
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b(th);
            }
            this.f37361N.dispose();
            this.f37361N = C12347d.DISPOSED;
        }

        public void onComplete() {
            if (this.f37361N != C12347d.DISPOSED) {
                try {
                    this.f37363b.f37357P.run();
                    this.f37361N = C12347d.DISPOSED;
                    this.f37362a.onComplete();
                    mo42560a();
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    mo42561a(th);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f37361N == C12347d.DISPOSED) {
                C12205a.m54894b(th);
            } else {
                mo42561a(th);
            }
        }

        public void onSuccess(T t) {
            if (this.f37361N != C12347d.DISPOSED) {
                try {
                    this.f37363b.f37355N.mo33410c(t);
                    this.f37361N = C12347d.DISPOSED;
                    this.f37362a.onSuccess(t);
                    mo42560a();
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    mo42561a(th);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42561a(Throwable th) {
            try {
                this.f37363b.f37356O.mo33410c(th);
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                th = new CompositeException(th, th2);
            }
            this.f37361N = C12347d.DISPOSED;
            this.f37362a.onError(th);
            mo42560a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42560a() {
            try {
                this.f37363b.f37358Q.run();
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b(th);
            }
        }
    }

    public C12952b1(C5941y<T> yVar, C12331g<? super C12314c> gVar, C12331g<? super T> gVar2, C12331g<? super Throwable> gVar3, C12325a aVar, C12325a aVar2, C12325a aVar3) {
        super(yVar);
        this.f37360b = gVar;
        this.f37355N = gVar2;
        this.f37356O = gVar3;
        this.f37357P = aVar;
        this.f37358Q = aVar2;
        this.f37359R = aVar3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f37333a.mo24639a(new C12953a(vVar, this));
    }
}
