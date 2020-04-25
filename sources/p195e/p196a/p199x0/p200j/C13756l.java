package p195e.p196a.p199x0.p200j;

import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12280i0;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14062c;

/* renamed from: e.a.x0.j.l */
/* compiled from: HalfSerializer */
public final class C13756l {
    private C13756l() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static <T> void m58728a(C14062c<? super T> cVar, T t, AtomicInteger atomicInteger, C13746c cVar2) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            cVar.mo41789a(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable d = cVar2.mo43143d();
                if (d != null) {
                    cVar.onError(d);
                } else {
                    cVar.onComplete();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m58729a(C14062c<?> cVar, Throwable th, AtomicInteger atomicInteger, C13746c cVar2) {
        if (!cVar2.mo43142a(th)) {
            C12205a.m54894b(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            cVar.onError(cVar2.mo43143d());
        }
    }

    /* renamed from: a */
    public static void m58730a(C14062c<?> cVar, AtomicInteger atomicInteger, C13746c cVar2) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable d = cVar2.mo43143d();
            if (d != null) {
                cVar.onError(d);
            } else {
                cVar.onComplete();
            }
        }
    }

    /* renamed from: a */
    public static <T> void m58725a(C12280i0<? super T> i0Var, T t, AtomicInteger atomicInteger, C13746c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            i0Var.mo33453a(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable d = cVar.mo43143d();
                if (d != null) {
                    i0Var.onError(d);
                } else {
                    i0Var.onComplete();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m58726a(C12280i0<?> i0Var, Throwable th, AtomicInteger atomicInteger, C13746c cVar) {
        if (!cVar.mo43142a(th)) {
            C12205a.m54894b(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            i0Var.onError(cVar.mo43143d());
        }
    }

    /* renamed from: a */
    public static void m58727a(C12280i0<?> i0Var, AtomicInteger atomicInteger, C13746c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable d = cVar.mo43143d();
            if (d != null) {
                i0Var.onError(d);
            } else {
                i0Var.onComplete();
            }
        }
    }
}
