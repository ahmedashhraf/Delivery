package p195e.p196a.p199x0.p454e.p455a;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12268f;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p447u0.C12313b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.a.b0 */
/* compiled from: CompletableMergeDelayErrorIterable */
public final class C12440b0 extends C5925c {

    /* renamed from: a */
    final Iterable<? extends C5927i> f35656a;

    public C12440b0(Iterable<? extends C5927i> iterable) {
        this.f35656a = iterable;
    }

    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        C12313b bVar = new C12313b();
        fVar.mo41921a(bVar);
        try {
            Iterator it = (Iterator) C12390b.m55563a(this.f35656a.iterator(), "The source iterator returned is null");
            AtomicInteger atomicInteger = new AtomicInteger(1);
            C13746c cVar = new C13746c();
            while (!bVar.mo41878d()) {
                try {
                    if (!it.hasNext()) {
                        if (atomicInteger.decrementAndGet() == 0) {
                            Throwable d = cVar.mo43143d();
                            if (d == null) {
                                fVar.onComplete();
                            } else {
                                fVar.onError(d);
                            }
                        }
                        return;
                    } else if (!bVar.mo41878d()) {
                        try {
                            C5927i iVar = (C5927i) C12390b.m55563a(it.next(), "The iterator returned a null CompletableSource");
                            if (!bVar.mo41878d()) {
                                atomicInteger.getAndIncrement();
                                iVar.mo24122a(new C12437a(fVar, bVar, cVar, atomicInteger));
                            } else {
                                return;
                            }
                        } catch (Throwable th) {
                            C14398a.m62357b(th);
                            cVar.mo43142a(th);
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    C14398a.m62357b(th2);
                    cVar.mo43142a(th2);
                }
            }
        } catch (Throwable th3) {
            C14398a.m62357b(th3);
            fVar.onError(th3);
        }
    }
}
