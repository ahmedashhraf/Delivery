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

/* renamed from: e.a.x0.e.b.d4 */
/* compiled from: FlowableTakeLastTimed */
public final class C12575d4<T> extends C12511a<T, T> {

    /* renamed from: N */
    final long f35989N;

    /* renamed from: O */
    final long f35990O;

    /* renamed from: P */
    final TimeUnit f35991P;

    /* renamed from: Q */
    final C12282j0 f35992Q;

    /* renamed from: R */
    final int f35993R;

    /* renamed from: S */
    final boolean f35994S;

    /* renamed from: e.a.x0.e.b.d4$a */
    /* compiled from: FlowableTakeLastTimed */
    static final class C12576a<T> extends AtomicInteger implements C12297q<T>, C14063d {
        private static final long serialVersionUID = -5677354903406201275L;

        /* renamed from: N */
        final long f35995N;

        /* renamed from: O */
        final TimeUnit f35996O;

        /* renamed from: P */
        final C12282j0 f35997P;

        /* renamed from: Q */
        final C13663c<Object> f35998Q;

        /* renamed from: R */
        final boolean f35999R;

        /* renamed from: S */
        C14063d f36000S;

        /* renamed from: T */
        final AtomicLong f36001T = new AtomicLong();

        /* renamed from: U */
        volatile boolean f36002U;

        /* renamed from: V */
        volatile boolean f36003V;

        /* renamed from: W */
        Throwable f36004W;

        /* renamed from: a */
        final C14062c<? super T> f36005a;

        /* renamed from: b */
        final long f36006b;

        C12576a(C14062c<? super T> cVar, long j, long j2, TimeUnit timeUnit, C12282j0 j0Var, int i, boolean z) {
            this.f36005a = cVar;
            this.f36006b = j;
            this.f35995N = j2;
            this.f35996O = timeUnit;
            this.f35997P = j0Var;
            this.f35998Q = new C13663c<>(i);
            this.f35999R = z;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36000S, dVar)) {
                this.f36000S = dVar;
                this.f36005a.mo41788a((C14063d) this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f36001T, j);
                mo42273a();
            }
        }

        public void cancel() {
            if (!this.f36002U) {
                this.f36002U = true;
                this.f36000S.cancel();
                if (getAndIncrement() == 0) {
                    this.f35998Q.clear();
                }
            }
        }

        public void onComplete() {
            mo42274a(this.f35997P.mo41870a(this.f35996O), this.f35998Q);
            this.f36003V = true;
            mo42273a();
        }

        public void onError(Throwable th) {
            if (this.f35999R) {
                mo42274a(this.f35997P.mo41870a(this.f35996O), this.f35998Q);
            }
            this.f36004W = th;
            this.f36003V = true;
            mo42273a();
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            C13663c<Object> cVar = this.f35998Q;
            long a = this.f35997P.mo41870a(this.f35996O);
            cVar.mo42104a(Long.valueOf(a), t);
            mo42274a(a, cVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42274a(long j, C13663c<Object> cVar) {
            long j2 = this.f35995N;
            long j3 = this.f36006b;
            boolean z = j3 == Long.MAX_VALUE;
            while (!cVar.isEmpty()) {
                if (((Long) cVar.mo43034a()).longValue() < j - j2 || (!z && ((long) (cVar.mo43035b() >> 1)) > j3)) {
                    cVar.poll();
                    cVar.poll();
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42273a() {
            if (getAndIncrement() == 0) {
                C14062c<? super T> cVar = this.f36005a;
                C13663c<Object> cVar2 = this.f35998Q;
                boolean z = this.f35999R;
                int i = 1;
                do {
                    if (this.f36003V) {
                        if (!mo42275a(cVar2.isEmpty(), cVar, z)) {
                            long j = this.f36001T.get();
                            long j2 = 0;
                            while (true) {
                                if (!mo42275a(cVar2.mo43034a() == null, cVar, z)) {
                                    if (j != j2) {
                                        cVar2.poll();
                                        cVar.mo41789a(cVar2.poll());
                                        j2++;
                                    } else if (j2 != 0) {
                                        C13747d.m58699c(this.f36001T, j2);
                                    }
                                } else {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42275a(boolean z, C14062c<? super T> cVar, boolean z2) {
            if (this.f36002U) {
                this.f35998Q.clear();
                return true;
            }
            if (!z2) {
                Throwable th = this.f36004W;
                if (th != null) {
                    this.f35998Q.clear();
                    cVar.onError(th);
                    return true;
                } else if (z) {
                    cVar.onComplete();
                    return true;
                }
            } else if (z) {
                Throwable th2 = this.f36004W;
                if (th2 != null) {
                    cVar.onError(th2);
                } else {
                    cVar.onComplete();
                }
                return true;
            }
            return false;
        }
    }

    public C12575d4(C5929l<T> lVar, long j, long j2, TimeUnit timeUnit, C12282j0 j0Var, int i, boolean z) {
        super(lVar);
        this.f35989N = j;
        this.f35990O = j2;
        this.f35991P = timeUnit;
        this.f35992Q = j0Var;
        this.f35993R = i;
        this.f35994S = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C5929l<T> lVar = this.f35814b;
        C12576a aVar = new C12576a(cVar, this.f35989N, this.f35990O, this.f35991P, this.f35992Q, this.f35993R, this.f35994S);
        lVar.mo24393a((C12297q<? super T>) aVar);
    }
}
