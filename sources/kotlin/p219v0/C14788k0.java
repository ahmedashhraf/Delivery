package kotlin.p219v0;

import java.util.Iterator;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.v0.k0 */
/* compiled from: Iterators.kt */
public final class C14788k0<T> implements Iterator<C14783i0<? extends T>>, C14464a {

    /* renamed from: a */
    private int f43041a;

    /* renamed from: b */
    private final Iterator<T> f43042b;

    public C14788k0(@C6003d Iterator<? extends T> it) {
        C14445h0.m62478f(it, "iterator");
        this.f43042b = it;
    }

    public final boolean hasNext() {
        return this.f43042b.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @C6003d
    public final C14783i0<T> next() {
        int i = this.f43041a;
        this.f43041a = i + 1;
        return new C14783i0<>(i, this.f43042b.next());
    }
}
