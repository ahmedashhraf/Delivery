package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.LinkedBlockingQueue;
import p195e.p196a.p199x0.p200j.C13748e;
import p195e.p196a.p199x0.p200j.C13749f;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p199x0.p451b.C12351a;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p464h.C13717f;
import p195e.p196a.p199x0.p464h.C13723l;
import p195e.p196a.p449w0.C12325a;
import p195e.p196a.p449w0.C12331g;
import p205i.p211e.C14062c;
import p205i.p211e.C6007b;

/* renamed from: e.a.x0.e.b.l */
/* compiled from: FlowableBlockingSubscribe */
public final class C12691l {
    private C12691l() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static <T> void m56204a(C6007b<? extends T> bVar, C14062c<? super T> cVar) {
        Object poll;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        C13717f fVar = new C13717f(linkedBlockingQueue);
        bVar.mo24397a(fVar);
        do {
            try {
                if (!fVar.mo43093a()) {
                    poll = linkedBlockingQueue.poll();
                    if (poll == null) {
                        if (!fVar.mo43093a()) {
                            C13748e.m58701a();
                            poll = linkedBlockingQueue.take();
                        } else {
                            return;
                        }
                    }
                    if (!fVar.mo43093a()) {
                        if (bVar == C13717f.f39683b) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } catch (InterruptedException e) {
                fVar.cancel();
                cVar.onError(e);
                return;
            }
        } while (!C13761q.m58748b(poll, cVar));
    }

    /* renamed from: a */
    public static <T> void m56202a(C6007b<? extends T> bVar) {
        C13749f fVar = new C13749f();
        C13723l lVar = new C13723l(C12351a.m55520d(), fVar, fVar, C12351a.f35512l);
        bVar.mo24397a(lVar);
        C13748e.m58702a(fVar, lVar);
        Throwable th = fVar.f39799a;
        if (th != null) {
            throw C13754k.m58724c(th);
        }
    }

    /* renamed from: a */
    public static <T> void m56203a(C6007b<? extends T> bVar, C12331g<? super T> gVar, C12331g<? super Throwable> gVar2, C12325a aVar) {
        C12390b.m55563a(gVar, "onNext is null");
        C12390b.m55563a(gVar2, "onError is null");
        C12390b.m55563a(aVar, "onComplete is null");
        m56204a(bVar, new C13723l(gVar, gVar2, aVar, C12351a.f35512l));
    }
}
