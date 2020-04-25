package p212io.reactivex.exceptions;

import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p199x0.p200j.C13754k;

/* renamed from: io.reactivex.exceptions.a */
/* compiled from: Exceptions */
public final class C14398a {
    private C14398a() {
        throw new IllegalStateException("No instances!");
    }

    @C5937f
    /* renamed from: a */
    public static RuntimeException m62356a(@C5937f Throwable th) {
        throw C13754k.m58724c(th);
    }

    /* renamed from: b */
    public static void m62357b(@C5937f Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
