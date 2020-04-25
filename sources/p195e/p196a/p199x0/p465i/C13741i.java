package p195e.p196a.p199x0.p465i;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p451b.C12390b;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.i.i */
/* compiled from: SubscriptionArbiter */
public class C13741i extends AtomicInteger implements C14063d {
    private static final long serialVersionUID = -2189523197179400958L;

    /* renamed from: N */
    final AtomicReference<C14063d> f39788N = new AtomicReference<>();

    /* renamed from: O */
    final AtomicLong f39789O = new AtomicLong();

    /* renamed from: P */
    final AtomicLong f39790P = new AtomicLong();

    /* renamed from: Q */
    volatile boolean f39791Q;

    /* renamed from: R */
    protected boolean f39792R;

    /* renamed from: a */
    C14063d f39793a;

    /* renamed from: b */
    long f39794b;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43128a() {
        if (getAndIncrement() == 0) {
            mo43131d();
        }
    }

    /* renamed from: b */
    public final void mo43130b(C14063d dVar) {
        if (this.f39791Q) {
            dVar.cancel();
            return;
        }
        C12390b.m55563a(dVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            C14063d dVar2 = (C14063d) this.f39788N.getAndSet(dVar);
            if (dVar2 != null) {
                dVar2.cancel();
            }
            mo43128a();
            return;
        }
        C14063d dVar3 = this.f39793a;
        if (dVar3 != null) {
            dVar3.cancel();
        }
        this.f39793a = dVar;
        long j = this.f39794b;
        if (decrementAndGet() != 0) {
            mo43131d();
        }
        if (j != 0) {
            dVar.mo41813c(j);
        }
    }

    /* renamed from: c */
    public final void mo41813c(long j) {
        if (C13742j.m58678b(j) && !this.f39792R) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C13747d.m58696a(this.f39789O, j);
                mo43128a();
                return;
            }
            long j2 = this.f39794b;
            if (j2 != Long.MAX_VALUE) {
                long a = C13747d.m58695a(j2, j);
                this.f39794b = a;
                if (a == Long.MAX_VALUE) {
                    this.f39792R = true;
                }
            }
            C14063d dVar = this.f39793a;
            if (decrementAndGet() != 0) {
                mo43131d();
            }
            if (dVar != null) {
                dVar.mo41813c(j);
            }
        }
    }

    public void cancel() {
        if (!this.f39791Q) {
            this.f39791Q = true;
            mo43128a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo43131d() {
        C14063d dVar = null;
        long j = 0;
        int i = 1;
        do {
            C14063d dVar2 = (C14063d) this.f39788N.get();
            if (dVar2 != null) {
                dVar2 = (C14063d) this.f39788N.getAndSet(null);
            }
            long j2 = this.f39789O.get();
            if (j2 != 0) {
                j2 = this.f39789O.getAndSet(0);
            }
            long j3 = this.f39790P.get();
            if (j3 != 0) {
                j3 = this.f39790P.getAndSet(0);
            }
            C14063d dVar3 = this.f39793a;
            if (this.f39791Q) {
                if (dVar3 != null) {
                    dVar3.cancel();
                    this.f39793a = null;
                }
                if (dVar2 != null) {
                    dVar2.cancel();
                }
            } else {
                long j4 = this.f39794b;
                if (j4 != Long.MAX_VALUE) {
                    j4 = C13747d.m58695a(j4, j2);
                    if (j4 != Long.MAX_VALUE) {
                        long j5 = j4 - j3;
                        if (j5 < 0) {
                            C13742j.m58670a(j5);
                            j5 = 0;
                        }
                        j4 = j5;
                    }
                    this.f39794b = j4;
                }
                if (dVar2 != null) {
                    if (dVar3 != null) {
                        dVar3.cancel();
                    }
                    this.f39793a = dVar2;
                    if (j4 != 0) {
                        j = C13747d.m58695a(j, j4);
                        dVar = dVar2;
                    }
                } else if (!(dVar3 == null || j2 == 0)) {
                    j = C13747d.m58695a(j, j2);
                    dVar = dVar3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            dVar.mo41813c(j);
        }
    }

    /* renamed from: e */
    public final boolean mo43132e() {
        return this.f39791Q;
    }

    /* renamed from: f */
    public final boolean mo43133f() {
        return this.f39792R;
    }

    /* renamed from: b */
    public final void mo43129b(long j) {
        if (!this.f39792R) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C13747d.m58696a(this.f39790P, j);
                mo43128a();
                return;
            }
            long j2 = this.f39794b;
            if (j2 != Long.MAX_VALUE) {
                long j3 = j2 - j;
                long j4 = 0;
                if (j3 < 0) {
                    C13742j.m58670a(j3);
                } else {
                    j4 = j3;
                }
                this.f39794b = j4;
            }
            if (decrementAndGet() != 0) {
                mo43131d();
            }
        }
    }
}
