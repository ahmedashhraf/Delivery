package p195e.p196a.p199x0.p454e.p455a;

import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12268f;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.a.d */
/* compiled from: CompletableConcatArray */
public final class C12446d extends C5925c {

    /* renamed from: a */
    final C5927i[] f35675a;

    /* renamed from: e.a.x0.e.a.d$a */
    /* compiled from: CompletableConcatArray */
    static final class C12447a extends AtomicInteger implements C12268f {
        private static final long serialVersionUID = -7965400327305809232L;

        /* renamed from: N */
        int f35676N;

        /* renamed from: O */
        final C12350g f35677O = new C12350g();

        /* renamed from: a */
        final C12268f f35678a;

        /* renamed from: b */
        final C5927i[] f35679b;

        C12447a(C12268f fVar, C5927i[] iVarArr) {
            this.f35678a = fVar;
            this.f35679b = iVarArr;
        }

        /* renamed from: a */
        public void mo41921a(C12314c cVar) {
            this.f35677O.mo42109a(cVar);
        }

        public void onComplete() {
            mo42200a();
        }

        public void onError(Throwable th) {
            this.f35678a.onError(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42200a() {
            if (!this.f35677O.mo41878d() && getAndIncrement() == 0) {
                C5927i[] iVarArr = this.f35679b;
                while (!this.f35677O.mo41878d()) {
                    int i = this.f35676N;
                    this.f35676N = i + 1;
                    if (i == iVarArr.length) {
                        this.f35678a.onComplete();
                        return;
                    }
                    iVarArr[i].mo24122a(this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    public C12446d(C5927i[] iVarArr) {
        this.f35675a = iVarArr;
    }

    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        C12447a aVar = new C12447a(fVar, this.f35675a);
        fVar.mo41921a(aVar.f35677O);
        aVar.mo42200a();
    }
}
