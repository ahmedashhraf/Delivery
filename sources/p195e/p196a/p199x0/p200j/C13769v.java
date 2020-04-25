package p195e.p196a.p199x0.p200j;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p195e.p196a.C12280i0;
import p195e.p196a.p199x0.p452c.C12405n;
import p195e.p196a.p199x0.p452c.C12406o;
import p195e.p196a.p199x0.p462f.C13662b;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12329e;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.j.v */
/* compiled from: QueueDrainHelper */
public final class C13769v {

    /* renamed from: a */
    static final long f39817a = Long.MIN_VALUE;

    /* renamed from: b */
    static final long f39818b = Long.MAX_VALUE;

    private C13769v() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static <T, U> void m58782a(C12405n<T> nVar, C14062c<? super U> cVar, boolean z, C12314c cVar2, C13768u<T, U> uVar) {
        int i = 1;
        while (true) {
            boolean c = uVar.mo43110c();
            Object poll = nVar.poll();
            boolean z2 = poll == null;
            if (m58788a(c, z2, cVar, z, nVar, uVar)) {
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                return;
            } else if (z2) {
                i = uVar.mo43103a(-i);
                if (i == 0) {
                    return;
                }
            } else {
                long a = uVar.mo43104a();
                if (a == 0) {
                    nVar.clear();
                    if (cVar2 != null) {
                        cVar2.dispose();
                    }
                    cVar.onError(new MissingBackpressureException("Could not emit value due to lack of requests."));
                    return;
                } else if (uVar.mo42398a(cVar, poll) && a != Long.MAX_VALUE) {
                    uVar.mo43105a(1);
                }
            }
        }
    }

    /* renamed from: b */
    public static <T> boolean m58789b(long j, C14062c<? super T> cVar, Queue<T> queue, AtomicLong atomicLong, C12329e eVar) {
        long j2;
        long j3 = j;
        do {
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, C13747d.m58695a(Long.MAX_VALUE & j2, j) | (j2 & Long.MIN_VALUE)));
        if (j2 != Long.MIN_VALUE) {
            return false;
        }
        m58785a(j3 | Long.MIN_VALUE, cVar, queue, atomicLong, eVar);
        return true;
    }

    /* renamed from: a */
    public static <T, U> boolean m58788a(boolean z, boolean z2, C14062c<?> cVar, boolean z3, C12406o<?> oVar, C13768u<T, U> uVar) {
        if (uVar.mo43111e()) {
            oVar.clear();
            return true;
        }
        if (z) {
            if (!z3) {
                Throwable f = uVar.mo43112f();
                if (f != null) {
                    oVar.clear();
                    cVar.onError(f);
                    return true;
                } else if (z2) {
                    cVar.onComplete();
                    return true;
                }
            } else if (z2) {
                Throwable f2 = uVar.mo43112f();
                if (f2 != null) {
                    cVar.onError(f2);
                } else {
                    cVar.onComplete();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static <T, U> void m58781a(C12405n<T> nVar, C12280i0<? super U> i0Var, boolean z, C12314c cVar, C13765r<T, U> rVar) {
        int i = 1;
        while (!m58787a(rVar.mo42189c(), nVar.isEmpty(), i0Var, z, nVar, cVar, rVar)) {
            while (true) {
                boolean c = rVar.mo42189c();
                Object poll = nVar.poll();
                boolean z2 = poll == null;
                if (!m58787a(c, z2, i0Var, z, nVar, cVar, rVar)) {
                    if (z2) {
                        i = rVar.mo42183a(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        rVar.mo42184a(i0Var, poll);
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static <T, U> boolean m58787a(boolean z, boolean z2, C12280i0<?> i0Var, boolean z3, C12406o<?> oVar, C12314c cVar, C13765r<T, U> rVar) {
        if (rVar.mo42190e()) {
            oVar.clear();
            cVar.dispose();
            return true;
        }
        if (z) {
            if (!z3) {
                Throwable f = rVar.mo42191f();
                if (f != null) {
                    oVar.clear();
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    i0Var.onError(f);
                    return true;
                } else if (z2) {
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    i0Var.onComplete();
                    return true;
                }
            } else if (z2) {
                if (cVar != null) {
                    cVar.dispose();
                }
                Throwable f2 = rVar.mo42191f();
                if (f2 != null) {
                    i0Var.onError(f2);
                } else {
                    i0Var.onComplete();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static <T> C12406o<T> m58780a(int i) {
        if (i < 0) {
            return new C13663c(-i);
        }
        return new C13662b(i);
    }

    /* renamed from: a */
    public static void m58784a(C14063d dVar, int i) {
        dVar.mo41813c(i < 0 ? Long.MAX_VALUE : (long) i);
    }

    /* renamed from: a */
    static boolean m58786a(C12329e eVar) {
        try {
            return eVar.mo42090a();
        } catch (Throwable th) {
            C14398a.m62357b(th);
            return true;
        }
    }

    /* renamed from: a */
    static <T> boolean m58785a(long j, C14062c<? super T> cVar, Queue<T> queue, AtomicLong atomicLong, C12329e eVar) {
        long j2 = j & Long.MIN_VALUE;
        while (true) {
            if (j2 != j) {
                if (m58786a(eVar)) {
                    return true;
                }
                Object poll = queue.poll();
                if (poll == null) {
                    cVar.onComplete();
                    return true;
                }
                cVar.mo41789a(poll);
                j2++;
            } else if (m58786a(eVar)) {
                return true;
            } else {
                if (queue.isEmpty()) {
                    cVar.onComplete();
                    return true;
                }
                j = atomicLong.get();
                if (j == j2) {
                    long addAndGet = atomicLong.addAndGet(-(j2 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & addAndGet) == 0) {
                        return false;
                    }
                    j = addAndGet;
                    j2 = addAndGet & Long.MIN_VALUE;
                } else {
                    continue;
                }
            }
        }
    }

    /* renamed from: a */
    public static <T> void m58783a(C14062c<? super T> cVar, Queue<T> queue, AtomicLong atomicLong, C12329e eVar) {
        long j;
        long j2;
        if (queue.isEmpty()) {
            cVar.onComplete();
        } else if (!m58785a(atomicLong.get(), cVar, queue, atomicLong, eVar)) {
            do {
                j = atomicLong.get();
                if ((j & Long.MIN_VALUE) == 0) {
                    j2 = j | Long.MIN_VALUE;
                } else {
                    return;
                }
            } while (!atomicLong.compareAndSet(j, j2));
            if (j != 0) {
                m58785a(j2, cVar, queue, atomicLong, eVar);
            }
        }
    }
}
