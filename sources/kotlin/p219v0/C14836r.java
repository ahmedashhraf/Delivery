package kotlin.p219v0;

import java.util.Iterator;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.v0.r */
/* compiled from: Iterators.kt */
public abstract class C14836r implements Iterator<Byte>, C14464a {
    /* renamed from: b */
    public abstract byte mo45532b();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @C6003d
    public final Byte next() {
        return Byte.valueOf(mo45532b());
    }
}
