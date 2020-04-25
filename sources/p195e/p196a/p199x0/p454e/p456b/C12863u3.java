package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p195e.p196a.C12282j0;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.u3 */
/* compiled from: FlowableSkipLastTimed */
public final class C12863u3<T> extends C12511a<T, T> {

    /* renamed from: N */
    final long f36983N;

    /* renamed from: O */
    final TimeUnit f36984O;

    /* renamed from: P */
    final C12282j0 f36985P;

    /* renamed from: Q */
    final int f36986Q;

    /* renamed from: R */
    final boolean f36987R;

    /* renamed from: e.a.x0.e.b.u3$a */
    /* compiled from: FlowableSkipLastTimed */
    static final class C12864a<T> extends AtomicInteger implements C12297q<T>, C14063d {
        private static final long serialVersionUID = -5677354903406201275L;

        /* renamed from: N */
        final TimeUnit f36988N;

        /* renamed from: O */
        final C12282j0 f36989O;

        /* renamed from: P */
        final C13663c<Object> f36990P;

        /* renamed from: Q */
        final boolean f36991Q;

        /* renamed from: R */
        C14063d f36992R;

        /* renamed from: S */
        final AtomicLong f36993S = new AtomicLong();

        /* renamed from: T */
        volatile boolean f36994T;

        /* renamed from: U */
        volatile boolean f36995U;

        /* renamed from: V */
        Throwable f36996V;

        /* renamed from: a */
        final C14062c<? super T> f36997a;

        /* renamed from: b */
        final long f36998b;

        C12864a(C14062c<? super T> cVar, long j, TimeUnit timeUnit, C12282j0 j0Var, int i, boolean z) {
            this.f36997a = cVar;
            this.f36998b = j;
            this.f36988N = timeUnit;
            this.f36989O = j0Var;
            this.f36990P = new C13663c<>(i);
            this.f36991Q = z;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36992R, dVar)) {
                this.f36992R = dVar;
                this.f36997a.mo41788a((C14063d) this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f36993S, j);
                mo42488a();
            }
        }

        public void cancel() {
            if (!this.f36994T) {
                this.f36994T = true;
                this.f36992R.cancel();
                if (getAndIncrement() == 0) {
                    this.f36990P.clear();
                }
            }
        }

        public void onComplete() {
            this.f36995U = true;
            mo42488a();
        }

        public void onError(Throwable th) {
            this.f36996V = th;
            this.f36995U = true;
            mo42488a();
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f36990P.mo42104a(Long.valueOf(this.f36989O.mo41870a(this.f36988N)), t);
            mo42488a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42488a() {
            if (getAndIncrement() == 0) {
                C14062c<? super T> cVar = this.f36997a;
                C13663c<Object> cVar2 = this.f36990P;
                boolean z = this.f36991Q;
                TimeUnit timeUnit = this.f36988N;
                C12282j0 j0Var = this.f36989O;
                long j = this.f36998b;
                int i = 1;
                do {
                    long j2 = this.f36993S.get();
                    long j3 = 0;
                    while (j3 != j2) {
                        boolean z2 = this.f36995U;
                        Long l = (Long) cVar2.mo43034a();
                        boolean z3 = l == null;
                        boolean z4 = (z3 || l.longValue() <= j0Var.mo41870a(timeUnit) - j) ? z3 : true;
                        if (!mo42489a(z2, z4, cVar, z)) {
                            if (z4) {
                                break;
                            }
                            cVar2.poll();
                            cVar.mo41789a(cVar2.poll());
                            j3++;
                        } else {
                            return;
                        }
                    }
                    if (j3 != 0) {
                        C13747d.m58699c(this.f36993S, j3);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42489a(boolean z, boolean z2, C14062c<? super T> cVar, boolean z3) {
            if (this.f36994T) {
                this.f36990P.clear();
                return true;
            }
            if (z) {
                if (!z3) {
                    Throwable th = this.f36996V;
                    if (th != null) {
                        this.f36990P.clear();
                        cVar.onError(th);
                        return true;
                    } else if (z2) {
                        cVar.onComplete();
                        return true;
                    }
                } else if (z2) {
                    Throwable th2 = this.f36996V;
                    if (th2 != null) {
                        cVar.onError(th2);
                    } else {
                        cVar.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public C12863u3(C5929l<T> lVar, long j, TimeUnit timeUnit, C12282j0 j0Var, int i, boolean z) {
        super(lVar);
        this.f36983N = j;
        this.f36984O = timeUnit;
        this.f36985P = j0Var;
        this.f36986Q = i;
        this.f36987R = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C5929l<T> lVar = this.f35814b;
        C12864a aVar = new C12864a(cVar, this.f36983N, this.f36984O, this.f36985P, this.f36986Q, this.f36987R);
        lVar.mo24393a((C12297q<? super T>) aVar);
    }
}
