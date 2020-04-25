package p195e.p196a.p199x0.p454e.p457c;

import p195e.p196a.C12321v;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12326b;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.c.s */
/* compiled from: MaybeDoOnEvent */
public final class C13060s<T> extends C12943a<T, T> {

    /* renamed from: b */
    final C12326b<? super T, ? super Throwable> f37578b;

    /* renamed from: e.a.x0.e.c.s$a */
    /* compiled from: MaybeDoOnEvent */
    static final class C13061a<T> implements C12321v<T>, C12314c {

        /* renamed from: N */
        C12314c f37579N;

        /* renamed from: a */
        final C12321v<? super T> f37580a;

        /* renamed from: b */
        final C12326b<? super T, ? super Throwable> f37581b;

        C13061a(C12321v<? super T> vVar, C12326b<? super T, ? super Throwable> bVar) {
            this.f37580a = vVar;
            this.f37581b = bVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55464a(this.f37579N, cVar)) {
                this.f37579N = cVar;
                this.f37580a.mo41931a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37579N.mo41878d();
        }

        public void dispose() {
            this.f37579N.dispose();
            this.f37579N = C12347d.DISPOSED;
        }

        public void onComplete() {
            this.f37579N = C12347d.DISPOSED;
            try {
                this.f37581b.mo42088a(null, null);
                this.f37580a.onComplete();
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f37580a.onError(th);
            }
        }

        public void onError(Throwable th) {
            this.f37579N = C12347d.DISPOSED;
            try {
                this.f37581b.mo42088a(null, th);
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                th = new CompositeException(th, th2);
            }
            this.f37580a.onError(th);
        }

        public void onSuccess(T t) {
            this.f37579N = C12347d.DISPOSED;
            try {
                this.f37581b.mo42088a(t, null);
                this.f37580a.onSuccess(t);
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f37580a.onError(th);
            }
        }
    }

    public C13060s(C5941y<T> yVar, C12326b<? super T, ? super Throwable> bVar) {
        super(yVar);
        this.f37578b = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f37333a.mo24639a(new C13061a(vVar, this.f37578b));
    }
}
