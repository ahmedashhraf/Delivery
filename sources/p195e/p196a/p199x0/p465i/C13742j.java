package p195e.p196a.p199x0.p465i;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.ProtocolViolationException;

/* renamed from: e.a.x0.i.j */
/* compiled from: SubscriptionHelper */
public enum C13742j implements C14063d {
    CANCELLED;

    /* renamed from: a */
    public static boolean m58673a(C14063d dVar, C14063d dVar2) {
        if (dVar2 == null) {
            C12205a.m54894b((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (dVar == null) {
            return true;
        } else {
            dVar2.cancel();
            m58681d();
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m58678b(long j) {
        if (j > 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("n > 0 required but it was ");
        sb.append(j);
        C12205a.m54894b((Throwable) new IllegalArgumentException(sb.toString()));
        return false;
    }

    /* renamed from: c */
    public static boolean m58680c(AtomicReference<C14063d> atomicReference, C14063d dVar) {
        C12390b.m55563a(dVar, "s is null");
        if (atomicReference.compareAndSet(null, dVar)) {
            return true;
        }
        dVar.cancel();
        if (atomicReference.get() != CANCELLED) {
            m58681d();
        }
        return false;
    }

    /* renamed from: d */
    public static void m58681d() {
        C12205a.m54894b((Throwable) new ProtocolViolationException("Subscription already set!"));
    }

    /* renamed from: c */
    public void mo41813c(long j) {
    }

    public void cancel() {
    }

    /* renamed from: b */
    public static boolean m58679b(AtomicReference<C14063d> atomicReference, C14063d dVar) {
        C14063d dVar2;
        do {
            dVar2 = (C14063d) atomicReference.get();
            if (dVar2 == CANCELLED) {
                if (dVar != null) {
                    dVar.cancel();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(dVar2, dVar));
        if (dVar2 != null) {
            dVar2.cancel();
        }
        return true;
    }

    /* renamed from: a */
    public static void m58670a(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("More produced than requested: ");
        sb.append(j);
        C12205a.m54894b((Throwable) new ProtocolViolationException(sb.toString()));
    }

    /* renamed from: a */
    public static boolean m58672a(C14063d dVar) {
        return dVar == CANCELLED;
    }

    /* renamed from: a */
    public static boolean m58675a(AtomicReference<C14063d> atomicReference, C14063d dVar) {
        C14063d dVar2;
        do {
            dVar2 = (C14063d) atomicReference.get();
            if (dVar2 == CANCELLED) {
                if (dVar != null) {
                    dVar.cancel();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(dVar2, dVar));
        return true;
    }

    /* renamed from: a */
    public static boolean m58674a(AtomicReference<C14063d> atomicReference) {
        C14063d dVar = (C14063d) atomicReference.get();
        C13742j jVar = CANCELLED;
        if (dVar != jVar) {
            C14063d dVar2 = (C14063d) atomicReference.getAndSet(jVar);
            if (dVar2 != CANCELLED) {
                if (dVar2 != null) {
                    dVar2.cancel();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m58677a(AtomicReference<C14063d> atomicReference, AtomicLong atomicLong, C14063d dVar) {
        if (!m58680c(atomicReference, dVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0);
        if (andSet != 0) {
            dVar.mo41813c(andSet);
        }
        return true;
    }

    /* renamed from: a */
    public static void m58671a(AtomicReference<C14063d> atomicReference, AtomicLong atomicLong, long j) {
        C14063d dVar = (C14063d) atomicReference.get();
        if (dVar != null) {
            dVar.mo41813c(j);
        } else if (m58678b(j)) {
            C13747d.m58696a(atomicLong, j);
            C14063d dVar2 = (C14063d) atomicReference.get();
            if (dVar2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    dVar2.mo41813c(andSet);
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m58676a(AtomicReference<C14063d> atomicReference, C14063d dVar, long j) {
        if (!m58680c(atomicReference, dVar)) {
            return false;
        }
        dVar.mo41813c(j);
        return true;
    }
}
