package p195e.p196a.p199x0.p454e.p455a;

import p195e.p196a.C12268f;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.a.w */
/* compiled from: CompletableHide */
public final class C12503w extends C5925c {

    /* renamed from: a */
    final C5927i f35795a;

    /* renamed from: e.a.x0.e.a.w$a */
    /* compiled from: CompletableHide */
    static final class C12504a implements C12268f, C12314c {

        /* renamed from: a */
        final C12268f f35796a;

        /* renamed from: b */
        C12314c f35797b;

        C12504a(C12268f fVar) {
            this.f35796a = fVar;
        }

        /* renamed from: a */
        public void mo41921a(C12314c cVar) {
            if (C12347d.m55464a(this.f35797b, cVar)) {
                this.f35797b = cVar;
                this.f35796a.mo41921a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35797b.mo41878d();
        }

        public void dispose() {
            this.f35797b.dispose();
            this.f35797b = C12347d.DISPOSED;
        }

        public void onComplete() {
            this.f35796a.onComplete();
        }

        public void onError(Throwable th) {
            this.f35796a.onError(th);
        }
    }

    public C12503w(C5927i iVar) {
        this.f35795a = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        this.f35795a.mo24122a(new C12504a(fVar));
    }
}
