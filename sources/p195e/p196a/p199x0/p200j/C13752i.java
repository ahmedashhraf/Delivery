package p195e.p196a.p199x0.p200j;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.ProtocolViolationException;

/* renamed from: e.a.x0.j.i */
/* compiled from: EndConsumerHelper */
public final class C13752i {
    private C13752i() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static boolean m58716a(C12314c cVar, C12314c cVar2, Class<?> cls) {
        C12390b.m55563a(cVar2, "next is null");
        if (cVar == null) {
            return true;
        }
        cVar2.dispose();
        if (cVar != C12347d.DISPOSED) {
            m58715a(cls);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m58718a(AtomicReference<C12314c> atomicReference, C12314c cVar, Class<?> cls) {
        C12390b.m55563a(cVar, "next is null");
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        cVar.dispose();
        if (atomicReference.get() != C12347d.DISPOSED) {
            m58715a(cls);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m58717a(C14063d dVar, C14063d dVar2, Class<?> cls) {
        C12390b.m55563a(dVar2, "next is null");
        if (dVar == null) {
            return true;
        }
        dVar2.cancel();
        if (dVar != C13742j.CANCELLED) {
            m58715a(cls);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m58719a(AtomicReference<C14063d> atomicReference, C14063d dVar, Class<?> cls) {
        C12390b.m55563a(dVar, "next is null");
        if (atomicReference.compareAndSet(null, dVar)) {
            return true;
        }
        dVar.cancel();
        if (atomicReference.get() != C13742j.CANCELLED) {
            m58715a(cls);
        }
        return false;
    }

    /* renamed from: a */
    public static String m58714a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("It is not allowed to subscribe with a(n) ");
        sb.append(str);
        sb.append(" multiple times. Please create a fresh instance of ");
        sb.append(str);
        sb.append(" and subscribe that to the target source instead.");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m58715a(Class<?> cls) {
        C12205a.m54894b((Throwable) new ProtocolViolationException(m58714a(cls.getName())));
    }
}
