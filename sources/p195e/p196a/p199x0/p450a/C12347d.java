package p195e.p196a.p199x0.p450a;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p212io.reactivex.exceptions.ProtocolViolationException;

/* renamed from: e.a.x0.a.d */
/* compiled from: DisposableHelper */
public enum C12347d implements C12314c {
    DISPOSED;

    /* renamed from: a */
    public static boolean m55463a(C12314c cVar) {
        return cVar == DISPOSED;
    }

    /* renamed from: b */
    public static boolean m55467b(AtomicReference<C12314c> atomicReference, C12314c cVar) {
        C12314c cVar2;
        do {
            cVar2 = (C12314c) atomicReference.get();
            if (cVar2 == DISPOSED) {
                if (cVar != null) {
                    cVar.dispose();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(cVar2, cVar));
        if (cVar2 != null) {
            cVar2.dispose();
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m55468c(AtomicReference<C12314c> atomicReference, C12314c cVar) {
        C12390b.m55563a(cVar, "d is null");
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        cVar.dispose();
        if (atomicReference.get() != DISPOSED) {
            m55470e();
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m55469d(AtomicReference<C12314c> atomicReference, C12314c cVar) {
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        if (atomicReference.get() == DISPOSED) {
            cVar.dispose();
        }
        return false;
    }

    /* renamed from: e */
    public static void m55470e() {
        C12205a.m54894b((Throwable) new ProtocolViolationException("Disposable already set!"));
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return true;
    }

    public void dispose() {
    }

    /* renamed from: a */
    public static boolean m55466a(AtomicReference<C12314c> atomicReference, C12314c cVar) {
        C12314c cVar2;
        do {
            cVar2 = (C12314c) atomicReference.get();
            if (cVar2 == DISPOSED) {
                if (cVar != null) {
                    cVar.dispose();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(cVar2, cVar));
        return true;
    }

    /* renamed from: a */
    public static boolean m55465a(AtomicReference<C12314c> atomicReference) {
        C12314c cVar = (C12314c) atomicReference.get();
        C12347d dVar = DISPOSED;
        if (cVar != dVar) {
            C12314c cVar2 = (C12314c) atomicReference.getAndSet(dVar);
            if (cVar2 != dVar) {
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m55464a(C12314c cVar, C12314c cVar2) {
        if (cVar2 == null) {
            C12205a.m54894b((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (cVar == null) {
            return true;
        } else {
            cVar2.dispose();
            m55470e();
            return false;
        }
    }
}
