package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p195e.p196a.C12280i0;
import p195e.p196a.C12282j0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.q3 */
/* compiled from: ObservableTakeLastTimed */
public final class C13382q3<T> extends C13131a<T, T> {

    /* renamed from: N */
    final long f38692N;

    /* renamed from: O */
    final TimeUnit f38693O;

    /* renamed from: P */
    final C12282j0 f38694P;

    /* renamed from: Q */
    final int f38695Q;

    /* renamed from: R */
    final boolean f38696R;

    /* renamed from: b */
    final long f38697b;

    /* renamed from: e.a.x0.e.e.q3$a */
    /* compiled from: ObservableTakeLastTimed */
    static final class C13383a<T> extends AtomicBoolean implements C12280i0<T>, C12314c {
        private static final long serialVersionUID = -5677354903406201275L;

        /* renamed from: N */
        final long f38698N;

        /* renamed from: O */
        final TimeUnit f38699O;

        /* renamed from: P */
        final C12282j0 f38700P;

        /* renamed from: Q */
        final C13663c<Object> f38701Q;

        /* renamed from: R */
        final boolean f38702R;

        /* renamed from: S */
        C12314c f38703S;

        /* renamed from: T */
        volatile boolean f38704T;

        /* renamed from: U */
        Throwable f38705U;

        /* renamed from: a */
        final C12280i0<? super T> f38706a;

        /* renamed from: b */
        final long f38707b;

        C13383a(C12280i0<? super T> i0Var, long j, long j2, TimeUnit timeUnit, C12282j0 j0Var, int i, boolean z) {
            this.f38706a = i0Var;
            this.f38707b = j;
            this.f38698N = j2;
            this.f38699O = timeUnit;
            this.f38700P = j0Var;
            this.f38701Q = new C13663c<>(i);
            this.f38702R = z;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38703S, cVar)) {
                this.f38703S = cVar;
                this.f38706a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38704T;
        }

        public void dispose() {
            if (!this.f38704T) {
                this.f38704T = true;
                this.f38703S.dispose();
                if (compareAndSet(false, true)) {
                    this.f38701Q.clear();
                }
            }
        }

        public void onComplete() {
            mo42853a();
        }

        public void onError(Throwable th) {
            this.f38705U = th;
            mo42853a();
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            C13663c<Object> cVar = this.f38701Q;
            long a = this.f38700P.mo41870a(this.f38699O);
            long j = this.f38698N;
            long j2 = this.f38707b;
            boolean z = j2 == Long.MAX_VALUE;
            cVar.mo42104a(Long.valueOf(a), t);
            while (!cVar.isEmpty()) {
                if (((Long) cVar.mo43034a()).longValue() <= a - j || (!z && ((long) (cVar.mo43035b() >> 1)) > j2)) {
                    cVar.poll();
                    cVar.poll();
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42853a() {
            if (compareAndSet(false, true)) {
                C12280i0<? super T> i0Var = this.f38706a;
                C13663c<Object> cVar = this.f38701Q;
                boolean z = this.f38702R;
                while (!this.f38704T) {
                    if (!z) {
                        Throwable th = this.f38705U;
                        if (th != null) {
                            cVar.clear();
                            i0Var.onError(th);
                            return;
                        }
                    }
                    Object poll = cVar.poll();
                    if (poll == null) {
                        Throwable th2 = this.f38705U;
                        if (th2 != null) {
                            i0Var.onError(th2);
                        } else {
                            i0Var.onComplete();
                        }
                        return;
                    }
                    Object poll2 = cVar.poll();
                    if (((Long) poll).longValue() >= this.f38700P.mo41870a(this.f38699O) - this.f38698N) {
                        i0Var.mo33453a(poll2);
                    }
                }
                cVar.clear();
            }
        }
    }

    public C13382q3(C5926g0<T> g0Var, long j, long j2, TimeUnit timeUnit, C12282j0 j0Var, int i, boolean z) {
        super(g0Var);
        this.f38697b = j;
        this.f38692N = j2;
        this.f38693O = timeUnit;
        this.f38694P = j0Var;
        this.f38695Q = i;
        this.f38696R = z;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C5926g0<T> g0Var = this.f37851a;
        C13383a aVar = new C13383a(i0Var, this.f38697b, this.f38692N, this.f38693O, this.f38694P, this.f38695Q, this.f38696R);
        g0Var.mo23893a(aVar);
    }
}
