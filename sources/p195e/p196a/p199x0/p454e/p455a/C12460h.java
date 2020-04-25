package p195e.p196a.p199x0.p454e.p455a;

import java.util.concurrent.TimeUnit;
import p195e.p196a.C12268f;
import p195e.p196a.C12282j0;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.a.h */
/* compiled from: CompletableDelay */
public final class C12460h extends C5925c {

    /* renamed from: N */
    final TimeUnit f35707N;

    /* renamed from: O */
    final C12282j0 f35708O;

    /* renamed from: P */
    final boolean f35709P;

    /* renamed from: a */
    final C5927i f35710a;

    /* renamed from: b */
    final long f35711b;

    /* renamed from: e.a.x0.e.a.h$a */
    /* compiled from: CompletableDelay */
    final class C12461a implements C12268f {

        /* renamed from: a */
        private final C12313b f35713a;

        /* renamed from: b */
        final C12268f f35714b;

        /* renamed from: e.a.x0.e.a.h$a$a */
        /* compiled from: CompletableDelay */
        final class C12462a implements Runnable {
            C12462a() {
            }

            public void run() {
                C12461a.this.f35714b.onComplete();
            }
        }

        /* renamed from: e.a.x0.e.a.h$a$b */
        /* compiled from: CompletableDelay */
        final class C12463b implements Runnable {

            /* renamed from: a */
            private final Throwable f35716a;

            C12463b(Throwable th) {
                this.f35716a = th;
            }

            public void run() {
                C12461a.this.f35714b.onError(this.f35716a);
            }
        }

        C12461a(C12313b bVar, C12268f fVar) {
            this.f35713a = bVar;
            this.f35714b = fVar;
        }

        /* renamed from: a */
        public void mo41921a(C12314c cVar) {
            this.f35713a.mo42072b(cVar);
            this.f35714b.mo41921a(this.f35713a);
        }

        public void onComplete() {
            C12313b bVar = this.f35713a;
            C12282j0 j0Var = C12460h.this.f35708O;
            C12462a aVar = new C12462a();
            C12460h hVar = C12460h.this;
            bVar.mo42072b(j0Var.mo42023a(aVar, hVar.f35711b, hVar.f35707N));
        }

        public void onError(Throwable th) {
            C12313b bVar = this.f35713a;
            C12282j0 j0Var = C12460h.this.f35708O;
            C12463b bVar2 = new C12463b(th);
            C12460h hVar = C12460h.this;
            bVar.mo42072b(j0Var.mo42023a(bVar2, hVar.f35709P ? hVar.f35711b : 0, C12460h.this.f35707N));
        }
    }

    public C12460h(C5927i iVar, long j, TimeUnit timeUnit, C12282j0 j0Var, boolean z) {
        this.f35710a = iVar;
        this.f35711b = j;
        this.f35707N = timeUnit;
        this.f35708O = j0Var;
        this.f35709P = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        this.f35710a.mo24122a(new C12461a(new C12313b(), fVar));
    }
}
