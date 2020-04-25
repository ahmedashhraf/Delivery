package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.LinkedBlockingQueue;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p200j.C13748e;
import p195e.p196a.p199x0.p200j.C13749f;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p199x0.p451b.C12351a;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p453d.C12416i;
import p195e.p196a.p199x0.p453d.C12428u;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12325a;
import p195e.p196a.p449w0.C12331g;

/* renamed from: e.a.x0.e.e.l */
/* compiled from: ObservableBlockingSubscribe */
public final class C13296l {
    private C13296l() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static <T> void m57613a(C5926g0<? extends T> g0Var, C12280i0<? super T> i0Var) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        C12416i iVar = new C12416i(linkedBlockingQueue);
        i0Var.mo34123a((C12314c) iVar);
        g0Var.mo23893a(iVar);
        while (!iVar.mo41878d()) {
            Object poll = linkedBlockingQueue.poll();
            if (poll == null) {
                try {
                    poll = linkedBlockingQueue.take();
                } catch (InterruptedException e) {
                    iVar.dispose();
                    i0Var.onError(e);
                    return;
                }
            }
            if (!iVar.mo41878d() && g0Var != C12416i.f35563b) {
                if (C13761q.m58747b(poll, i0Var)) {
                    break;
                }
            } else {
                break;
            }
        }
    }

    /* renamed from: a */
    public static <T> void m57612a(C5926g0<? extends T> g0Var) {
        C13749f fVar = new C13749f();
        C12428u uVar = new C12428u(C12351a.m55520d(), fVar, fVar, C12351a.m55520d());
        g0Var.mo23893a(uVar);
        C13748e.m58702a(fVar, uVar);
        Throwable th = fVar.f39799a;
        if (th != null) {
            throw C13754k.m58724c(th);
        }
    }

    /* renamed from: a */
    public static <T> void m57614a(C5926g0<? extends T> g0Var, C12331g<? super T> gVar, C12331g<? super Throwable> gVar2, C12325a aVar) {
        C12390b.m55563a(gVar, "onNext is null");
        C12390b.m55563a(gVar2, "onError is null");
        C12390b.m55563a(aVar, "onComplete is null");
        m57613a(g0Var, new C12428u(gVar, gVar2, aVar, C12351a.m55520d()));
    }
}
