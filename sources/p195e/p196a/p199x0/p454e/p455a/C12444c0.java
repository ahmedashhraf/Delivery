package p195e.p196a.p199x0.p454e.p455a;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12268f;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.a.c0 */
/* compiled from: CompletableMergeIterable */
public final class C12444c0 extends C5925c {

    /* renamed from: a */
    final Iterable<? extends C5927i> f35671a;

    /* renamed from: e.a.x0.e.a.c0$a */
    /* compiled from: CompletableMergeIterable */
    static final class C12445a extends AtomicBoolean implements C12268f {
        private static final long serialVersionUID = -7730517613164279224L;

        /* renamed from: N */
        final AtomicInteger f35672N;

        /* renamed from: a */
        final C12313b f35673a;

        /* renamed from: b */
        final C12268f f35674b;

        C12445a(C12268f fVar, C12313b bVar, AtomicInteger atomicInteger) {
            this.f35674b = fVar;
            this.f35673a = bVar;
            this.f35672N = atomicInteger;
        }

        /* renamed from: a */
        public void mo41921a(C12314c cVar) {
            this.f35673a.mo42072b(cVar);
        }

        public void onComplete() {
            if (this.f35672N.decrementAndGet() == 0 && compareAndSet(false, true)) {
                this.f35674b.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f35673a.dispose();
            if (compareAndSet(false, true)) {
                this.f35674b.onError(th);
            } else {
                C12205a.m54894b(th);
            }
        }
    }

    public C12444c0(Iterable<? extends C5927i> iterable) {
        this.f35671a = iterable;
    }

    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        C12313b bVar = new C12313b();
        fVar.mo41921a(bVar);
        try {
            Iterator it = (Iterator) C12390b.m55563a(this.f35671a.iterator(), "The source iterator returned is null");
            AtomicInteger atomicInteger = new AtomicInteger(1);
            C12445a aVar = new C12445a(fVar, bVar, atomicInteger);
            while (!bVar.mo41878d()) {
                try {
                    if (!it.hasNext()) {
                        aVar.onComplete();
                        return;
                    } else if (!bVar.mo41878d()) {
                        try {
                            C5927i iVar = (C5927i) C12390b.m55563a(it.next(), "The iterator returned a null CompletableSource");
                            if (!bVar.mo41878d()) {
                                atomicInteger.getAndIncrement();
                                iVar.mo24122a(aVar);
                            } else {
                                return;
                            }
                        } catch (Throwable th) {
                            C14398a.m62357b(th);
                            bVar.dispose();
                            aVar.onError(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    C14398a.m62357b(th2);
                    bVar.dispose();
                    aVar.onError(th2);
                    return;
                }
            }
        } catch (Throwable th3) {
            C14398a.m62357b(th3);
            fVar.onError(th3);
        }
    }
}
