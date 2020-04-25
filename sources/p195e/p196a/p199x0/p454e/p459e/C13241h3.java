package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12280i0;
import p195e.p196a.C12282j0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.h3 */
/* compiled from: ObservableSkipLastTimed */
public final class C13241h3<T> extends C13131a<T, T> {

    /* renamed from: N */
    final TimeUnit f38211N;

    /* renamed from: O */
    final C12282j0 f38212O;

    /* renamed from: P */
    final int f38213P;

    /* renamed from: Q */
    final boolean f38214Q;

    /* renamed from: b */
    final long f38215b;

    /* renamed from: e.a.x0.e.e.h3$a */
    /* compiled from: ObservableSkipLastTimed */
    static final class C13242a<T> extends AtomicInteger implements C12280i0<T>, C12314c {
        private static final long serialVersionUID = -5677354903406201275L;

        /* renamed from: N */
        final TimeUnit f38216N;

        /* renamed from: O */
        final C12282j0 f38217O;

        /* renamed from: P */
        final C13663c<Object> f38218P;

        /* renamed from: Q */
        final boolean f38219Q;

        /* renamed from: R */
        C12314c f38220R;

        /* renamed from: S */
        volatile boolean f38221S;

        /* renamed from: T */
        volatile boolean f38222T;

        /* renamed from: U */
        Throwable f38223U;

        /* renamed from: a */
        final C12280i0<? super T> f38224a;

        /* renamed from: b */
        final long f38225b;

        C13242a(C12280i0<? super T> i0Var, long j, TimeUnit timeUnit, C12282j0 j0Var, int i, boolean z) {
            this.f38224a = i0Var;
            this.f38225b = j;
            this.f38216N = timeUnit;
            this.f38217O = j0Var;
            this.f38218P = new C13663c<>(i);
            this.f38219Q = z;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38220R, cVar)) {
                this.f38220R = cVar;
                this.f38224a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38221S;
        }

        public void dispose() {
            if (!this.f38221S) {
                this.f38221S = true;
                this.f38220R.dispose();
                if (getAndIncrement() == 0) {
                    this.f38218P.clear();
                }
            }
        }

        public void onComplete() {
            this.f38222T = true;
            mo42751a();
        }

        public void onError(Throwable th) {
            this.f38223U = th;
            this.f38222T = true;
            mo42751a();
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f38218P.mo42104a(Long.valueOf(this.f38217O.mo41870a(this.f38216N)), t);
            mo42751a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42751a() {
            if (getAndIncrement() == 0) {
                C12280i0<? super T> i0Var = this.f38224a;
                C13663c<Object> cVar = this.f38218P;
                boolean z = this.f38219Q;
                TimeUnit timeUnit = this.f38216N;
                C12282j0 j0Var = this.f38217O;
                long j = this.f38225b;
                int i = 1;
                while (!this.f38221S) {
                    boolean z2 = this.f38222T;
                    Long l = (Long) cVar.mo43034a();
                    boolean z3 = l == null;
                    long a = j0Var.mo41870a(timeUnit);
                    if (!z3 && l.longValue() > a - j) {
                        z3 = true;
                    }
                    if (z2) {
                        if (!z) {
                            Throwable th = this.f38223U;
                            if (th != null) {
                                this.f38218P.clear();
                                i0Var.onError(th);
                                return;
                            } else if (z3) {
                                i0Var.onComplete();
                                return;
                            }
                        } else if (z3) {
                            Throwable th2 = this.f38223U;
                            if (th2 != null) {
                                i0Var.onError(th2);
                            } else {
                                i0Var.onComplete();
                            }
                            return;
                        }
                    }
                    if (z3) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        cVar.poll();
                        i0Var.mo33453a(cVar.poll());
                    }
                }
                this.f38218P.clear();
            }
        }
    }

    public C13241h3(C5926g0<T> g0Var, long j, TimeUnit timeUnit, C12282j0 j0Var, int i, boolean z) {
        super(g0Var);
        this.f38215b = j;
        this.f38211N = timeUnit;
        this.f38212O = j0Var;
        this.f38213P = i;
        this.f38214Q = z;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C5926g0<T> g0Var = this.f37851a;
        C13242a aVar = new C13242a(i0Var, this.f38215b, this.f38211N, this.f38212O, this.f38213P, this.f38214Q);
        g0Var.mo23893a(aVar);
    }
}
