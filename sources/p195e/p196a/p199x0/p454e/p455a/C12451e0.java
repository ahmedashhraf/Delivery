package p195e.p196a.p199x0.p454e.p455a;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.C12282j0;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.a.e0 */
/* compiled from: CompletableObserveOn */
public final class C12451e0 extends C5925c {

    /* renamed from: a */
    final C5927i f35685a;

    /* renamed from: b */
    final C12282j0 f35686b;

    /* renamed from: e.a.x0.e.a.e0$a */
    /* compiled from: CompletableObserveOn */
    static final class C12452a extends AtomicReference<C12314c> implements C12268f, C12314c, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: N */
        Throwable f35687N;

        /* renamed from: a */
        final C12268f f35688a;

        /* renamed from: b */
        final C12282j0 f35689b;

        C12452a(C12268f fVar, C12282j0 j0Var) {
            this.f35688a = fVar;
            this.f35689b = j0Var;
        }

        /* renamed from: a */
        public void mo41921a(C12314c cVar) {
            if (C12347d.m55468c(this, cVar)) {
                this.f35688a.mo41921a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void onComplete() {
            C12347d.m55466a((AtomicReference<C12314c>) this, this.f35689b.mo42021a((Runnable) this));
        }

        public void onError(Throwable th) {
            this.f35687N = th;
            C12347d.m55466a((AtomicReference<C12314c>) this, this.f35689b.mo42021a((Runnable) this));
        }

        public void run() {
            Throwable th = this.f35687N;
            if (th != null) {
                this.f35687N = null;
                this.f35688a.onError(th);
                return;
            }
            this.f35688a.onComplete();
        }
    }

    public C12451e0(C5927i iVar, C12282j0 j0Var) {
        this.f35685a = iVar;
        this.f35686b = j0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        this.f35685a.mo24122a(new C12452a(fVar, this.f35686b));
    }
}
