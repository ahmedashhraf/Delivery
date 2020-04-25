package p195e.p196a.p199x0.p454e.p455a;

import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12268f;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12325a;
import p212io.reactivex.exceptions.C14398a;

@C5936e
/* renamed from: e.a.x0.e.a.k */
/* compiled from: CompletableDoFinally */
public final class C12477k extends C5925c {

    /* renamed from: a */
    final C5927i f35751a;

    /* renamed from: b */
    final C12325a f35752b;

    /* renamed from: e.a.x0.e.a.k$a */
    /* compiled from: CompletableDoFinally */
    static final class C12478a extends AtomicInteger implements C12268f, C12314c {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: N */
        C12314c f35753N;

        /* renamed from: a */
        final C12268f f35754a;

        /* renamed from: b */
        final C12325a f35755b;

        C12478a(C12268f fVar, C12325a aVar) {
            this.f35754a = fVar;
            this.f35755b = aVar;
        }

        /* renamed from: a */
        public void mo41921a(C12314c cVar) {
            if (C12347d.m55464a(this.f35753N, cVar)) {
                this.f35753N = cVar;
                this.f35754a.mo41921a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35753N.mo41878d();
        }

        public void dispose() {
            this.f35753N.dispose();
            mo42209a();
        }

        public void onComplete() {
            this.f35754a.onComplete();
            mo42209a();
        }

        public void onError(Throwable th) {
            this.f35754a.onError(th);
            mo42209a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42209a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f35755b.run();
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    C12205a.m54894b(th);
                }
            }
        }
    }

    public C12477k(C5927i iVar, C12325a aVar) {
        this.f35751a = iVar;
        this.f35752b = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        this.f35751a.mo24122a(new C12478a(fVar, this.f35752b));
    }
}
