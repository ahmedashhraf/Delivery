package p195e.p196a.p199x0.p454e.p455a;

import p195e.p196a.C12268f;
import p195e.p196a.C12282j0;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.a.j */
/* compiled from: CompletableDisposeOn */
public final class C12471j extends C5925c {

    /* renamed from: a */
    final C5927i f35732a;

    /* renamed from: b */
    final C12282j0 f35733b;

    /* renamed from: e.a.x0.e.a.j$a */
    /* compiled from: CompletableDisposeOn */
    static final class C12472a implements C12268f, C12314c, Runnable {

        /* renamed from: N */
        C12314c f35734N;

        /* renamed from: O */
        volatile boolean f35735O;

        /* renamed from: a */
        final C12268f f35736a;

        /* renamed from: b */
        final C12282j0 f35737b;

        C12472a(C12268f fVar, C12282j0 j0Var) {
            this.f35736a = fVar;
            this.f35737b = j0Var;
        }

        /* renamed from: a */
        public void mo41921a(C12314c cVar) {
            if (C12347d.m55464a(this.f35734N, cVar)) {
                this.f35734N = cVar;
                this.f35736a.mo41921a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35735O;
        }

        public void dispose() {
            this.f35735O = true;
            this.f35737b.mo42021a((Runnable) this);
        }

        public void onComplete() {
            if (!this.f35735O) {
                this.f35736a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f35735O) {
                C12205a.m54894b(th);
            } else {
                this.f35736a.onError(th);
            }
        }

        public void run() {
            this.f35734N.dispose();
            this.f35734N = C12347d.DISPOSED;
        }
    }

    public C12471j(C5927i iVar, C12282j0 j0Var) {
        this.f35732a = iVar;
        this.f35733b = j0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        this.f35732a.mo24122a(new C12472a(fVar, this.f35733b));
    }
}
