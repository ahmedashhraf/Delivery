package p195e.p196a.p199x0.p454e.p455a;

import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12268f;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.a.a0 */
/* compiled from: CompletableMergeDelayErrorArray */
public final class C12436a0 extends C5925c {

    /* renamed from: a */
    final C5927i[] f35643a;

    /* renamed from: e.a.x0.e.a.a0$a */
    /* compiled from: CompletableMergeDelayErrorArray */
    static final class C12437a implements C12268f {

        /* renamed from: N */
        final C13746c f35644N;

        /* renamed from: O */
        final AtomicInteger f35645O;

        /* renamed from: a */
        final C12268f f35646a;

        /* renamed from: b */
        final C12313b f35647b;

        C12437a(C12268f fVar, C12313b bVar, C13746c cVar, AtomicInteger atomicInteger) {
            this.f35646a = fVar;
            this.f35647b = bVar;
            this.f35644N = cVar;
            this.f35645O = atomicInteger;
        }

        /* renamed from: a */
        public void mo41921a(C12314c cVar) {
            this.f35647b.mo42072b(cVar);
        }

        public void onComplete() {
            mo42192a();
        }

        public void onError(Throwable th) {
            if (this.f35644N.mo43142a(th)) {
                mo42192a();
            } else {
                C12205a.m54894b(th);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42192a() {
            if (this.f35645O.decrementAndGet() == 0) {
                Throwable d = this.f35644N.mo43143d();
                if (d == null) {
                    this.f35646a.onComplete();
                } else {
                    this.f35646a.onError(d);
                }
            }
        }
    }

    public C12436a0(C5927i[] iVarArr) {
        this.f35643a = iVarArr;
    }

    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        C12313b bVar = new C12313b();
        AtomicInteger atomicInteger = new AtomicInteger(this.f35643a.length + 1);
        C13746c cVar = new C13746c();
        fVar.mo41921a(bVar);
        C5927i[] iVarArr = this.f35643a;
        int length = iVarArr.length;
        int i = 0;
        while (i < length) {
            C5927i iVar = iVarArr[i];
            if (!bVar.mo41878d()) {
                if (iVar == null) {
                    cVar.mo43142a(new NullPointerException("A completable source is null"));
                    atomicInteger.decrementAndGet();
                } else {
                    iVar.mo24122a(new C12437a(fVar, bVar, cVar, atomicInteger));
                }
                i++;
            } else {
                return;
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            Throwable d = cVar.mo43143d();
            if (d == null) {
                fVar.onComplete();
            } else {
                fVar.onError(d);
            }
        }
    }
}
