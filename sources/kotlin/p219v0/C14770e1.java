package kotlin.p219v0;

import java.util.Iterator;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.v0.e1 */
/* compiled from: Iterators.kt */
public abstract class C14770e1 implements Iterator<Short>, C14464a {
    /* renamed from: b */
    public abstract short mo45597b();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @C6003d
    public final Short next() {
        return Short.valueOf(mo45597b());
    }
}
