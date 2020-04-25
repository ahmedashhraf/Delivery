package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13738f;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.i1 */
/* compiled from: FlowableFromFuture */
public final class C12648i1<T> extends C5929l<T> {

    /* renamed from: N */
    final long f36218N;

    /* renamed from: O */
    final TimeUnit f36219O;

    /* renamed from: b */
    final Future<? extends T> f36220b;

    public C12648i1(Future<? extends T> future, long j, TimeUnit timeUnit) {
        this.f36220b = future;
        this.f36218N = j;
        this.f36219O = timeUnit;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C13738f fVar = new C13738f(cVar);
        cVar.mo41788a((C14063d) fVar);
        try {
            Object obj = this.f36219O != null ? this.f36220b.get(this.f36218N, this.f36219O) : this.f36220b.get();
            if (obj == null) {
                cVar.onError(new NullPointerException("The future returned null"));
            } else {
                fVar.mo43123c(obj);
            }
        } catch (Throwable th) {
            C14398a.m62357b(th);
            if (!fVar.mo43124d()) {
                cVar.onError(th);
            }
        }
    }
}
