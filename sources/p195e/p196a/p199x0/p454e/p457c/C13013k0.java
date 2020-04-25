package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p195e.p196a.C12321v;
import p195e.p196a.C5931s;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p447u0.C12315d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.c.k0 */
/* compiled from: MaybeFromFuture */
public final class C13013k0<T> extends C5931s<T> {

    /* renamed from: N */
    final TimeUnit f37492N;

    /* renamed from: a */
    final Future<? extends T> f37493a;

    /* renamed from: b */
    final long f37494b;

    public C13013k0(Future<? extends T> future, long j, TimeUnit timeUnit) {
        this.f37493a = future;
        this.f37494b = j;
        this.f37492N = timeUnit;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        Object obj;
        C12314c b = C12315d.m55419b();
        vVar.mo41931a(b);
        if (!b.mo41878d()) {
            try {
                if (this.f37494b <= 0) {
                    obj = this.f37493a.get();
                } else {
                    obj = this.f37493a.get(this.f37494b, this.f37492N);
                }
                if (b.mo41878d()) {
                    return;
                }
                if (obj == null) {
                    vVar.onComplete();
                } else {
                    vVar.onSuccess(obj);
                }
            } catch (Throwable th) {
                th = th;
                if (th instanceof ExecutionException) {
                    th = th.getCause();
                }
                C14398a.m62357b(th);
                if (!b.mo41878d()) {
                    vVar.onError(th);
                }
            }
        }
    }
}
