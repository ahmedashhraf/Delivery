package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p453d.C12419l;
import p195e.p196a.p447u0.C12314c;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.e1 */
/* compiled from: ObservableFromFuture */
public final class C13191e1<T> extends C5923b0<T> {

    /* renamed from: N */
    final TimeUnit f38062N;

    /* renamed from: a */
    final Future<? extends T> f38063a;

    /* renamed from: b */
    final long f38064b;

    public C13191e1(Future<? extends T> future, long j, TimeUnit timeUnit) {
        this.f38063a = future;
        this.f38064b = j;
        this.f38062N = timeUnit;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C12419l lVar = new C12419l(i0Var);
        i0Var.mo34123a((C12314c) lVar);
        if (!lVar.mo41878d()) {
            try {
                lVar.mo42163b(C12390b.m55563a(this.f38062N != null ? this.f38063a.get(this.f38064b, this.f38062N) : this.f38063a.get(), "Future returned null"));
            } catch (Throwable th) {
                C14398a.m62357b(th);
                if (!lVar.mo41878d()) {
                    i0Var.onError(th);
                }
            }
        }
    }
}
