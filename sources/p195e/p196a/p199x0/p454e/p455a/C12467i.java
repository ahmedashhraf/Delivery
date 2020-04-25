package p195e.p196a.p199x0.p454e.p455a;

import p195e.p196a.C12268f;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

@C5936e
/* renamed from: e.a.x0.e.a.i */
/* compiled from: CompletableDetach */
public final class C12467i extends C5925c {

    /* renamed from: a */
    final C5927i f35724a;

    /* renamed from: e.a.x0.e.a.i$a */
    /* compiled from: CompletableDetach */
    static final class C12468a implements C12268f, C12314c {

        /* renamed from: a */
        C12268f f35725a;

        /* renamed from: b */
        C12314c f35726b;

        C12468a(C12268f fVar) {
            this.f35725a = fVar;
        }

        /* renamed from: a */
        public void mo41921a(C12314c cVar) {
            if (C12347d.m55464a(this.f35726b, cVar)) {
                this.f35726b = cVar;
                this.f35725a.mo41921a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35726b.mo41878d();
        }

        public void dispose() {
            this.f35725a = null;
            this.f35726b.dispose();
            this.f35726b = C12347d.DISPOSED;
        }

        public void onComplete() {
            this.f35726b = C12347d.DISPOSED;
            C12268f fVar = this.f35725a;
            if (fVar != null) {
                this.f35725a = null;
                fVar.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f35726b = C12347d.DISPOSED;
            C12268f fVar = this.f35725a;
            if (fVar != null) {
                this.f35725a = null;
                fVar.onError(th);
            }
        }
    }

    public C12467i(C5927i iVar) {
        this.f35724a = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        this.f35724a.mo24122a(new C12468a(fVar));
    }
}
