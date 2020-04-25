package p195e.p196a.p199x0.p454e.p459e;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p453d.C12429v;
import p195e.p196a.p199x0.p462f.C13660a;
import p195e.p196a.p442e1.C12266j;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p467z0.C13795m;

/* renamed from: e.a.x0.e.e.h4 */
/* compiled from: ObservableWindowTimed */
public final class C13243h4<T> extends C13131a<T, C5923b0<T>> {

    /* renamed from: N */
    final long f38226N;

    /* renamed from: O */
    final TimeUnit f38227O;

    /* renamed from: P */
    final C12282j0 f38228P;

    /* renamed from: Q */
    final long f38229Q;

    /* renamed from: R */
    final int f38230R;

    /* renamed from: S */
    final boolean f38231S;

    /* renamed from: b */
    final long f38232b;

    /* renamed from: e.a.x0.e.e.h4$a */
    /* compiled from: ObservableWindowTimed */
    static final class C13244a<T> extends C12429v<T, Object, C5923b0<T>> implements C12314c {

        /* renamed from: A0 */
        final long f38233A0;

        /* renamed from: B0 */
        final C12285c f38234B0;

        /* renamed from: C0 */
        long f38235C0;

        /* renamed from: D0 */
        long f38236D0;

        /* renamed from: E0 */
        C12314c f38237E0;

        /* renamed from: F0 */
        C12266j<T> f38238F0;

        /* renamed from: G0 */
        volatile boolean f38239G0;

        /* renamed from: H0 */
        final AtomicReference<C12314c> f38240H0 = new AtomicReference<>();

        /* renamed from: v0 */
        final long f38241v0;

        /* renamed from: w0 */
        final TimeUnit f38242w0;

        /* renamed from: x0 */
        final C12282j0 f38243x0;

        /* renamed from: y0 */
        final int f38244y0;

        /* renamed from: z0 */
        final boolean f38245z0;

        /* renamed from: e.a.x0.e.e.h4$a$a */
        /* compiled from: ObservableWindowTimed */
        static final class C13245a implements Runnable {

            /* renamed from: a */
            final long f38246a;

            /* renamed from: b */
            final C13244a<?> f38247b;

            C13245a(long j, C13244a<?> aVar) {
                this.f38246a = j;
                this.f38247b = aVar;
            }

            public void run() {
                C13244a<?> aVar = this.f38247b;
                if (!aVar.f35602s0) {
                    aVar.f35601r0.offer(this);
                } else {
                    aVar.f38239G0 = true;
                    aVar.mo42752g();
                }
                if (aVar.mo42188b()) {
                    aVar.mo42753h();
                }
            }
        }

        C13244a(C12280i0<? super C5923b0<T>> i0Var, long j, TimeUnit timeUnit, C12282j0 j0Var, int i, long j2, boolean z) {
            super(i0Var, new C13660a());
            this.f38241v0 = j;
            this.f38242w0 = timeUnit;
            this.f38243x0 = j0Var;
            this.f38244y0 = i;
            this.f38233A0 = j2;
            this.f38245z0 = z;
            if (z) {
                this.f38234B0 = j0Var.mo41871a();
            } else {
                this.f38234B0 = null;
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35602s0;
        }

        public void dispose() {
            this.f35602s0 = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo42752g() {
            C12347d.m55465a(this.f38240H0);
            C12285c cVar = this.f38234B0;
            if (cVar != null) {
                cVar.dispose();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo42753h() {
            C13660a aVar = (C13660a) this.f35601r0;
            C12280i0<? super V> i0Var = this.f35600q0;
            C12266j<T> jVar = this.f38238F0;
            int i = 1;
            while (!this.f38239G0) {
                boolean z = this.f35603t0;
                Object poll = aVar.poll();
                boolean z2 = poll == null;
                boolean z3 = poll instanceof C13245a;
                if (z && (z2 || z3)) {
                    this.f38238F0 = null;
                    aVar.clear();
                    mo42752g();
                    Throwable th = this.f35604u0;
                    if (th != null) {
                        jVar.onError(th);
                    } else {
                        jVar.onComplete();
                    }
                    return;
                } else if (z2) {
                    i = mo42183a(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (z3) {
                    C13245a aVar2 = (C13245a) poll;
                    if (this.f38245z0 || this.f38236D0 == aVar2.f38246a) {
                        jVar.onComplete();
                        this.f38235C0 = 0;
                        jVar = C12266j.m55270i(this.f38244y0);
                        this.f38238F0 = jVar;
                        i0Var.mo33453a(jVar);
                    }
                } else {
                    jVar.mo33453a(C13761q.m58751d(poll));
                    long j = this.f38235C0 + 1;
                    if (j >= this.f38233A0) {
                        this.f38236D0++;
                        this.f38235C0 = 0;
                        jVar.onComplete();
                        jVar = C12266j.m55270i(this.f38244y0);
                        this.f38238F0 = jVar;
                        this.f35600q0.mo33453a(jVar);
                        if (this.f38245z0) {
                            C12314c cVar = (C12314c) this.f38240H0.get();
                            cVar.dispose();
                            C12285c cVar2 = this.f38234B0;
                            C13245a aVar3 = new C13245a(this.f38236D0, this);
                            long j2 = this.f38241v0;
                            C12314c a = cVar2.mo42028a(aVar3, j2, j2, this.f38242w0);
                            if (!this.f38240H0.compareAndSet(cVar, a)) {
                                a.dispose();
                            }
                        }
                    } else {
                        this.f38235C0 = j;
                    }
                }
            }
            this.f38237E0.dispose();
            aVar.clear();
            mo42752g();
        }

        public void onComplete() {
            this.f35603t0 = true;
            if (mo42188b()) {
                mo42753h();
            }
            this.f35600q0.onComplete();
            mo42752g();
        }

        public void onError(Throwable th) {
            this.f35604u0 = th;
            this.f35603t0 = true;
            if (mo42188b()) {
                mo42753h();
            }
            this.f35600q0.onError(th);
            mo42752g();
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            C12314c cVar2;
            if (C12347d.m55464a(this.f38237E0, cVar)) {
                this.f38237E0 = cVar;
                C12280i0<? super V> i0Var = this.f35600q0;
                i0Var.mo34123a((C12314c) this);
                if (!this.f35602s0) {
                    C12266j<T> i = C12266j.m55270i(this.f38244y0);
                    this.f38238F0 = i;
                    i0Var.mo33453a(i);
                    C13245a aVar = new C13245a(this.f38236D0, this);
                    if (this.f38245z0) {
                        C12285c cVar3 = this.f38234B0;
                        long j = this.f38241v0;
                        cVar2 = cVar3.mo42028a(aVar, j, j, this.f38242w0);
                    } else {
                        C12282j0 j0Var = this.f38243x0;
                        long j2 = this.f38241v0;
                        cVar2 = j0Var.mo42022a(aVar, j2, j2, this.f38242w0);
                    }
                    C12347d.m55466a(this.f38240H0, cVar2);
                }
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38239G0) {
                if (mo42186a()) {
                    C12266j<T> jVar = this.f38238F0;
                    jVar.mo33453a(t);
                    long j = this.f38235C0 + 1;
                    if (j >= this.f38233A0) {
                        this.f38236D0++;
                        this.f38235C0 = 0;
                        jVar.onComplete();
                        C12266j<T> i = C12266j.m55270i(this.f38244y0);
                        this.f38238F0 = i;
                        this.f35600q0.mo33453a(i);
                        if (this.f38245z0) {
                            ((C12314c) this.f38240H0.get()).dispose();
                            C12285c cVar = this.f38234B0;
                            C13245a aVar = new C13245a(this.f38236D0, this);
                            long j2 = this.f38241v0;
                            C12347d.m55466a(this.f38240H0, cVar.mo42028a(aVar, j2, j2, this.f38242w0));
                        }
                    } else {
                        this.f38235C0 = j;
                    }
                    if (mo42183a(-1) == 0) {
                        return;
                    }
                } else {
                    this.f35601r0.offer(C13761q.m58756i(t));
                    if (!mo42188b()) {
                        return;
                    }
                }
                mo42753h();
            }
        }
    }

    /* renamed from: e.a.x0.e.e.h4$b */
    /* compiled from: ObservableWindowTimed */
    static final class C13246b<T> extends C12429v<T, Object, C5923b0<T>> implements C12280i0<T>, C12314c, Runnable {

        /* renamed from: D0 */
        static final Object f38248D0 = new Object();

        /* renamed from: A0 */
        C12266j<T> f38249A0;

        /* renamed from: B0 */
        final AtomicReference<C12314c> f38250B0 = new AtomicReference<>();

        /* renamed from: C0 */
        volatile boolean f38251C0;

        /* renamed from: v0 */
        final long f38252v0;

        /* renamed from: w0 */
        final TimeUnit f38253w0;

        /* renamed from: x0 */
        final C12282j0 f38254x0;

        /* renamed from: y0 */
        final int f38255y0;

        /* renamed from: z0 */
        C12314c f38256z0;

        C13246b(C12280i0<? super C5923b0<T>> i0Var, long j, TimeUnit timeUnit, C12282j0 j0Var, int i) {
            super(i0Var, new C13660a());
            this.f38252v0 = j;
            this.f38253w0 = timeUnit;
            this.f38254x0 = j0Var;
            this.f38255y0 = i;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38256z0, cVar)) {
                this.f38256z0 = cVar;
                this.f38249A0 = C12266j.m55270i(this.f38255y0);
                C12280i0<? super V> i0Var = this.f35600q0;
                i0Var.mo34123a((C12314c) this);
                i0Var.mo33453a(this.f38249A0);
                if (!this.f35602s0) {
                    C12282j0 j0Var = this.f38254x0;
                    long j = this.f38252v0;
                    C12347d.m55466a(this.f38250B0, j0Var.mo42022a(this, j, j, this.f38253w0));
                }
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35602s0;
        }

        public void dispose() {
            this.f35602s0 = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo42755g() {
            C12347d.m55465a(this.f38250B0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo42756h() {
            C13660a aVar = (C13660a) this.f35601r0;
            C12280i0<? super V> i0Var = this.f35600q0;
            C12266j<T> jVar = this.f38249A0;
            int i = 1;
            while (true) {
                boolean z = this.f38251C0;
                boolean z2 = this.f35603t0;
                Object poll = aVar.poll();
                if (!z2 || !(poll == null || poll == f38248D0)) {
                    if (poll == null) {
                        i = mo42183a(-i);
                        if (i == 0) {
                            return;
                        }
                    } else if (poll == f38248D0) {
                        jVar.onComplete();
                        if (!z) {
                            jVar = C12266j.m55270i(this.f38255y0);
                            this.f38249A0 = jVar;
                            i0Var.mo33453a(jVar);
                        } else {
                            this.f38256z0.dispose();
                        }
                    } else {
                        jVar.mo33453a(C13761q.m58751d(poll));
                    }
                }
            }
            this.f38249A0 = null;
            aVar.clear();
            mo42755g();
            Throwable th = this.f35604u0;
            if (th != null) {
                jVar.onError(th);
            } else {
                jVar.onComplete();
            }
        }

        public void onComplete() {
            this.f35603t0 = true;
            if (mo42188b()) {
                mo42756h();
            }
            mo42755g();
            this.f35600q0.onComplete();
        }

        public void onError(Throwable th) {
            this.f35604u0 = th;
            this.f35603t0 = true;
            if (mo42188b()) {
                mo42756h();
            }
            mo42755g();
            this.f35600q0.onError(th);
        }

        public void run() {
            if (this.f35602s0) {
                this.f38251C0 = true;
                mo42755g();
            }
            this.f35601r0.offer(f38248D0);
            if (mo42188b()) {
                mo42756h();
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38251C0) {
                if (mo42186a()) {
                    this.f38249A0.mo33453a(t);
                    if (mo42183a(-1) == 0) {
                        return;
                    }
                } else {
                    this.f35601r0.offer(C13761q.m58756i(t));
                    if (!mo42188b()) {
                        return;
                    }
                }
                mo42756h();
            }
        }
    }

    /* renamed from: e.a.x0.e.e.h4$c */
    /* compiled from: ObservableWindowTimed */
    static final class C13247c<T> extends C12429v<T, Object, C5923b0<T>> implements C12314c, Runnable {

        /* renamed from: A0 */
        final List<C12266j<T>> f38257A0 = new LinkedList();

        /* renamed from: B0 */
        C12314c f38258B0;

        /* renamed from: C0 */
        volatile boolean f38259C0;

        /* renamed from: v0 */
        final long f38260v0;

        /* renamed from: w0 */
        final long f38261w0;

        /* renamed from: x0 */
        final TimeUnit f38262x0;

        /* renamed from: y0 */
        final C12285c f38263y0;

        /* renamed from: z0 */
        final int f38264z0;

        /* renamed from: e.a.x0.e.e.h4$c$a */
        /* compiled from: ObservableWindowTimed */
        final class C13248a implements Runnable {

            /* renamed from: a */
            private final C12266j<T> f38265a;

            C13248a(C12266j<T> jVar) {
                this.f38265a = jVar;
            }

            public void run() {
                C13247c.this.mo42758a(this.f38265a);
            }
        }

        /* renamed from: e.a.x0.e.e.h4$c$b */
        /* compiled from: ObservableWindowTimed */
        static final class C13249b<T> {

            /* renamed from: a */
            final C12266j<T> f38267a;

            /* renamed from: b */
            final boolean f38268b;

            C13249b(C12266j<T> jVar, boolean z) {
                this.f38267a = jVar;
                this.f38268b = z;
            }
        }

        C13247c(C12280i0<? super C5923b0<T>> i0Var, long j, long j2, TimeUnit timeUnit, C12285c cVar, int i) {
            super(i0Var, new C13660a());
            this.f38260v0 = j;
            this.f38261w0 = j2;
            this.f38262x0 = timeUnit;
            this.f38263y0 = cVar;
            this.f38264z0 = i;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38258B0, cVar)) {
                this.f38258B0 = cVar;
                this.f35600q0.mo34123a((C12314c) this);
                if (!this.f35602s0) {
                    C12266j i = C12266j.m55270i(this.f38264z0);
                    this.f38257A0.add(i);
                    this.f35600q0.mo33453a(i);
                    this.f38263y0.mo41877a(new C13248a(i), this.f38260v0, this.f38262x0);
                    C12285c cVar2 = this.f38263y0;
                    long j = this.f38261w0;
                    cVar2.mo42028a(this, j, j, this.f38262x0);
                }
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35602s0;
        }

        public void dispose() {
            this.f35602s0 = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo42759g() {
            this.f38263y0.dispose();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo42760h() {
            C13660a aVar = (C13660a) this.f35601r0;
            C12280i0<? super V> i0Var = this.f35600q0;
            List<C12266j<T>> list = this.f38257A0;
            int i = 1;
            while (!this.f38259C0) {
                boolean z = this.f35603t0;
                Object poll = aVar.poll();
                boolean z2 = poll == null;
                boolean z3 = poll instanceof C13249b;
                if (z && (z2 || z3)) {
                    aVar.clear();
                    Throwable th = this.f35604u0;
                    if (th != null) {
                        for (C12266j onError : list) {
                            onError.onError(th);
                        }
                    } else {
                        for (C12266j onComplete : list) {
                            onComplete.onComplete();
                        }
                    }
                    mo42759g();
                    list.clear();
                    return;
                } else if (z2) {
                    i = mo42183a(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (z3) {
                    C13249b bVar = (C13249b) poll;
                    if (!bVar.f38268b) {
                        list.remove(bVar.f38267a);
                        bVar.f38267a.onComplete();
                        if (list.isEmpty() && this.f35602s0) {
                            this.f38259C0 = true;
                        }
                    } else if (!this.f35602s0) {
                        C12266j i2 = C12266j.m55270i(this.f38264z0);
                        list.add(i2);
                        i0Var.mo33453a(i2);
                        this.f38263y0.mo41877a(new C13248a(i2), this.f38260v0, this.f38262x0);
                    }
                } else {
                    for (C12266j a : list) {
                        a.mo33453a(poll);
                    }
                }
            }
            this.f38258B0.dispose();
            mo42759g();
            aVar.clear();
            list.clear();
        }

        public void onComplete() {
            this.f35603t0 = true;
            if (mo42188b()) {
                mo42760h();
            }
            this.f35600q0.onComplete();
            mo42759g();
        }

        public void onError(Throwable th) {
            this.f35604u0 = th;
            this.f35603t0 = true;
            if (mo42188b()) {
                mo42760h();
            }
            this.f35600q0.onError(th);
            mo42759g();
        }

        public void run() {
            C13249b bVar = new C13249b(C12266j.m55270i(this.f38264z0), true);
            if (!this.f35602s0) {
                this.f35601r0.offer(bVar);
            }
            if (mo42188b()) {
                mo42760h();
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (mo42186a()) {
                for (C12266j a : this.f38257A0) {
                    a.mo33453a(t);
                }
                if (mo42183a(-1) == 0) {
                    return;
                }
            } else {
                this.f35601r0.offer(t);
                if (!mo42188b()) {
                    return;
                }
            }
            mo42760h();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42758a(C12266j<T> jVar) {
            this.f35601r0.offer(new C13249b(jVar, false));
            if (mo42188b()) {
                mo42760h();
            }
        }
    }

    public C13243h4(C5926g0<T> g0Var, long j, long j2, TimeUnit timeUnit, C12282j0 j0Var, long j3, int i, boolean z) {
        super(g0Var);
        this.f38232b = j;
        this.f38226N = j2;
        this.f38227O = timeUnit;
        this.f38228P = j0Var;
        this.f38229Q = j3;
        this.f38230R = i;
        this.f38231S = z;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super C5923b0<T>> i0Var) {
        C13795m mVar = new C13795m(i0Var);
        long j = this.f38232b;
        long j2 = this.f38226N;
        if (j == j2) {
            long j3 = this.f38229Q;
            if (j3 == Long.MAX_VALUE) {
                C5926g0<T> g0Var = this.f37851a;
                C13246b bVar = new C13246b(mVar, j, this.f38227O, this.f38228P, this.f38230R);
                g0Var.mo23893a(bVar);
                return;
            }
            C5926g0<T> g0Var2 = this.f37851a;
            C13244a aVar = new C13244a(mVar, j, this.f38227O, this.f38228P, this.f38230R, j3, this.f38231S);
            g0Var2.mo23893a(aVar);
            return;
        }
        C5926g0<T> g0Var3 = this.f37851a;
        C13247c cVar = new C13247c(mVar, j, j2, this.f38227O, this.f38228P.mo41871a(), this.f38230R);
        g0Var3.mo23893a(cVar);
    }
}
