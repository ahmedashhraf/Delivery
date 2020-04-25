package p195e.p196a.p199x0.p454e.p455a;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.C12282j0;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.a.i0 */
/* compiled from: CompletableSubscribeOn */
public final class C12469i0 extends C5925c {

    /* renamed from: a */
    final C5927i f35727a;

    /* renamed from: b */
    final C12282j0 f35728b;

    /* renamed from: e.a.x0.e.a.i0$a */
    /* compiled from: CompletableSubscribeOn */
    static final class C12470a extends AtomicReference<C12314c> implements C12268f, C12314c, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;

        /* renamed from: N */
        final C5927i f35729N;

        /* renamed from: a */
        final C12268f f35730a;

        /* renamed from: b */
        final C12350g f35731b = new C12350g();

        C12470a(C12268f fVar, C5927i iVar) {
            this.f35730a = fVar;
            this.f35729N = iVar;
        }

        /* renamed from: a */
        public void mo41921a(C12314c cVar) {
            C12347d.m55468c(this, cVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
            this.f35731b.dispose();
        }

        public void onComplete() {
            this.f35730a.onComplete();
        }

        public void onError(Throwable th) {
            this.f35730a.onError(th);
        }

        public void run() {
            this.f35729N.mo24122a(this);
        }
    }

    public C12469i0(C5927i iVar, C12282j0 j0Var) {
        this.f35727a = iVar;
        this.f35728b = j0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        C12470a aVar = new C12470a(fVar, this.f35727a);
        fVar.mo41921a(aVar);
        aVar.f35731b.mo42109a(this.f35728b.mo42021a((Runnable) aVar));
    }
}
