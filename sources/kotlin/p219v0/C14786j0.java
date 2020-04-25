package kotlin.p219v0;

import java.util.Iterator;
import kotlin.p214b1.p215t.C6069a;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.v0.j0 */
/* compiled from: Iterables.kt */
public final class C14786j0<T> implements Iterable<C14783i0<? extends T>>, C14464a {

    /* renamed from: a */
    private final C6069a<Iterator<T>> f43038a;

    public C14786j0(@C6003d C6069a<? extends Iterator<? extends T>> aVar) {
        C14445h0.m62478f(aVar, "iteratorFactory");
        this.f43038a = aVar;
    }

    @C6003d
    public Iterator<C14783i0<T>> iterator() {
        return new C14788k0((Iterator) this.f43038a.mo24947p());
    }
}
