package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12321v;
import p195e.p196a.C5941y;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12325a;
import p212io.reactivex.exceptions.C14398a;

@C5936e
/* renamed from: e.a.x0.e.c.r */
/* compiled from: MaybeDoFinally */
public final class C13052r<T> extends C12943a<T, T> {

    /* renamed from: b */
    final C12325a f37562b;

    /* renamed from: e.a.x0.e.c.r$a */
    /* compiled from: MaybeDoFinally */
    static final class C13053a<T> extends AtomicInteger implements C12321v<T>, C12314c {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: N */
        C12314c f37563N;

        /* renamed from: a */
        final C12321v<? super T> f37564a;

        /* renamed from: b */
        final C12325a f37565b;

        C13053a(C12321v<? super T> vVar, C12325a aVar) {
            this.f37564a = vVar;
            this.f37565b = aVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55464a(this.f37563N, cVar)) {
                this.f37563N = cVar;
                this.f37564a.mo41931a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37563N.mo41878d();
        }

        public void dispose() {
            this.f37563N.dispose();
            mo42588a();
        }

        public void onComplete() {
            this.f37564a.onComplete();
            mo42588a();
        }

        public void onError(Throwable th) {
            this.f37564a.onError(th);
            mo42588a();
        }

        public void onSuccess(T t) {
            this.f37564a.onSuccess(t);
            mo42588a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42588a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f37565b.run();
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    C12205a.m54894b(th);
                }
            }
        }
    }

    public C13052r(C5941y<T> yVar, C12325a aVar) {
        super(yVar);
        this.f37562b = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f37333a.mo24639a(new C13053a(vVar, this.f37562b));
    }
}
