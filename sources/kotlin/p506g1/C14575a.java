package kotlin.p506g1;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.g1.a */
/* compiled from: Sequences.kt */
final class C14575a<T> implements C14594m<T> {

    /* renamed from: a */
    private final AtomicReference<C14594m<T>> f42702a;

    public C14575a(@C6003d C14594m<? extends T> mVar) {
        C14445h0.m62478f(mVar, "sequence");
        this.f42702a = new AtomicReference<>(mVar);
    }

    @C6003d
    public Iterator<T> iterator() {
        C14594m mVar = (C14594m) this.f42702a.getAndSet(null);
        if (mVar != null) {
            return mVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
