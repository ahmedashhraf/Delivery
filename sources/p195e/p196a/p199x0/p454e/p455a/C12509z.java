package p195e.p196a.p199x0.p454e.p455a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12268f;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.a.z */
/* compiled from: CompletableMergeArray */
public final class C12509z extends C5925c {

    /* renamed from: a */
    final C5927i[] f35810a;

    /* renamed from: e.a.x0.e.a.z$a */
    /* compiled from: CompletableMergeArray */
    static final class C12510a extends AtomicInteger implements C12268f {
        private static final long serialVersionUID = -8360547806504310570L;

        /* renamed from: N */
        final C12313b f35811N;

        /* renamed from: a */
        final C12268f f35812a;

        /* renamed from: b */
        final AtomicBoolean f35813b;

        C12510a(C12268f fVar, AtomicBoolean atomicBoolean, C12313b bVar, int i) {
            this.f35812a = fVar;
            this.f35813b = atomicBoolean;
            this.f35811N = bVar;
            lazySet(i);
        }

        /* renamed from: a */
        public void mo41921a(C12314c cVar) {
            this.f35811N.mo42072b(cVar);
        }

        public void onComplete() {
            if (decrementAndGet() == 0 && this.f35813b.compareAndSet(false, true)) {
                this.f35812a.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f35811N.dispose();
            if (this.f35813b.compareAndSet(false, true)) {
                this.f35812a.onError(th);
            } else {
                C12205a.m54894b(th);
            }
        }
    }

    public C12509z(C5927i[] iVarArr) {
        this.f35810a = iVarArr;
    }

    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        C12313b bVar = new C12313b();
        C12510a aVar = new C12510a(fVar, new AtomicBoolean(), bVar, this.f35810a.length + 1);
        fVar.mo41921a(bVar);
        C5927i[] iVarArr = this.f35810a;
        int length = iVarArr.length;
        int i = 0;
        while (i < length) {
            C5927i iVar = iVarArr[i];
            if (!bVar.mo41878d()) {
                if (iVar == null) {
                    bVar.dispose();
                    aVar.onError(new NullPointerException("A completable source is null"));
                    return;
                }
                iVar.mo24122a(aVar);
                i++;
            } else {
                return;
            }
        }
        aVar.onComplete();
    }
}
