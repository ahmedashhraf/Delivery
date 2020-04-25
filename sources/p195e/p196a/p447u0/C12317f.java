package p195e.p196a.p447u0;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p199x0.p451b.C12390b;

/* renamed from: e.a.u0.f */
/* compiled from: ReferenceDisposable */
abstract class C12317f<T> extends AtomicReference<T> implements C12314c {
    private static final long serialVersionUID = 6537757548749041217L;

    C12317f(T t) {
        super(C12390b.m55563a(t, "value is null"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo42066a(@C5937f T t);

    /* renamed from: d */
    public final boolean mo41878d() {
        return get() == null;
    }

    public final void dispose() {
        if (get() != null) {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                mo42066a(andSet);
            }
        }
    }
}
