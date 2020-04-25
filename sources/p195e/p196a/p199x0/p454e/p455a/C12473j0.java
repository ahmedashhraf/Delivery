package p195e.p196a.p199x0.p454e.p455a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p195e.p196a.C12268f;
import p195e.p196a.C12282j0;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.a.j0 */
/* compiled from: CompletableTimeout */
public final class C12473j0 extends C5925c {

    /* renamed from: N */
    final TimeUnit f35738N;

    /* renamed from: O */
    final C12282j0 f35739O;

    /* renamed from: P */
    final C5927i f35740P;

    /* renamed from: a */
    final C5927i f35741a;

    /* renamed from: b */
    final long f35742b;

    /* renamed from: e.a.x0.e.a.j0$a */
    /* compiled from: CompletableTimeout */
    final class C12474a implements Runnable {

        /* renamed from: N */
        final C12268f f35743N;

        /* renamed from: a */
        private final AtomicBoolean f35745a;

        /* renamed from: b */
        final C12313b f35746b;

        /* renamed from: e.a.x0.e.a.j0$a$a */
        /* compiled from: CompletableTimeout */
        final class C12475a implements C12268f {
            C12475a() {
            }

            /* renamed from: a */
            public void mo41921a(C12314c cVar) {
                C12474a.this.f35746b.mo42072b(cVar);
            }

            public void onComplete() {
                C12474a.this.f35746b.dispose();
                C12474a.this.f35743N.onComplete();
            }

            public void onError(Throwable th) {
                C12474a.this.f35746b.dispose();
                C12474a.this.f35743N.onError(th);
            }
        }

        C12474a(AtomicBoolean atomicBoolean, C12313b bVar, C12268f fVar) {
            this.f35745a = atomicBoolean;
            this.f35746b = bVar;
            this.f35743N = fVar;
        }

        public void run() {
            if (this.f35745a.compareAndSet(false, true)) {
                this.f35746b.mo42067a();
                C5927i iVar = C12473j0.this.f35740P;
                if (iVar == null) {
                    this.f35743N.onError(new TimeoutException());
                } else {
                    iVar.mo24122a(new C12475a());
                }
            }
        }
    }

    /* renamed from: e.a.x0.e.a.j0$b */
    /* compiled from: CompletableTimeout */
    static final class C12476b implements C12268f {

        /* renamed from: N */
        private final C12268f f35748N;

        /* renamed from: a */
        private final C12313b f35749a;

        /* renamed from: b */
        private final AtomicBoolean f35750b;

        C12476b(C12313b bVar, AtomicBoolean atomicBoolean, C12268f fVar) {
            this.f35749a = bVar;
            this.f35750b = atomicBoolean;
            this.f35748N = fVar;
        }

        /* renamed from: a */
        public void mo41921a(C12314c cVar) {
            this.f35749a.mo42072b(cVar);
        }

        public void onComplete() {
            if (this.f35750b.compareAndSet(false, true)) {
                this.f35749a.dispose();
                this.f35748N.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f35750b.compareAndSet(false, true)) {
                this.f35749a.dispose();
                this.f35748N.onError(th);
                return;
            }
            C12205a.m54894b(th);
        }
    }

    public C12473j0(C5927i iVar, long j, TimeUnit timeUnit, C12282j0 j0Var, C5927i iVar2) {
        this.f35741a = iVar;
        this.f35742b = j;
        this.f35738N = timeUnit;
        this.f35739O = j0Var;
        this.f35740P = iVar2;
    }

    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        C12313b bVar = new C12313b();
        fVar.mo41921a(bVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        bVar.mo42072b(this.f35739O.mo42023a(new C12474a(atomicBoolean, bVar, fVar), this.f35742b, this.f35738N));
        this.f35741a.mo24122a(new C12476b(bVar, atomicBoolean, fVar));
    }
}
