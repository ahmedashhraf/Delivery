package kotlin.p214b1.p216u;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.b1.u.g */
/* compiled from: ArrayIterator.kt */
final class C14441g<T> implements Iterator<T>, C14464a {

    /* renamed from: a */
    private int f42568a;
    @C6003d

    /* renamed from: b */
    private final T[] f42569b;

    public C14441g(@C6003d T[] tArr) {
        C14445h0.m62478f(tArr, "array");
        this.f42569b = tArr;
    }

    @C6003d
    /* renamed from: b */
    public final T[] mo45570b() {
        return this.f42569b;
    }

    public boolean hasNext() {
        return this.f42568a < this.f42569b.length;
    }

    public T next() {
        try {
            T[] tArr = this.f42569b;
            int i = this.f42568a;
            this.f42568a = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f42568a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
