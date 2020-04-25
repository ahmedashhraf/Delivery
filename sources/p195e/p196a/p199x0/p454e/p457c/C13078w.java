package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.Callable;
import p195e.p196a.C12321v;
import p195e.p196a.C5931s;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p447u0.C12315d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.c.w */
/* compiled from: MaybeErrorCallable */
public final class C13078w<T> extends C5931s<T> {

    /* renamed from: a */
    final Callable<? extends Throwable> f37616a;

    public C13078w(Callable<? extends Throwable> callable) {
        this.f37616a = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        vVar.mo41931a(C12315d.m55413a());
        try {
            th = (Throwable) C12390b.m55563a(this.f37616a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            C14398a.m62357b(th);
        }
        vVar.onError(th);
    }
}
