package p195e.p196a.p199x0.p454e.p456b;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p199x0.p452c.C12405n;
import p195e.p196a.p199x0.p462f.C13660a;
import p195e.p196a.p199x0.p464h.C13724m;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p440c1.C12223g;
import p195e.p196a.p443f1.C12274e;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.v4 */
/* compiled from: FlowableWindowTimed */
public final class C12879v4<T> extends C12511a<T, C5929l<T>> {

    /* renamed from: N */
    final long f37069N;

    /* renamed from: O */
    final long f37070O;

    /* renamed from: P */
    final TimeUnit f37071P;

    /* renamed from: Q */
    final C12282j0 f37072Q;

    /* renamed from: R */
    final long f37073R;

    /* renamed from: S */
    final int f37074S;

    /* renamed from: T */
    final boolean f37075T;

    /* renamed from: e.a.x0.e.b.v4$a */
    /* compiled from: FlowableWindowTimed */
    static final class C12880a<T> extends C13724m<T, Object, C5929l<T>> implements C14063d {

        /* renamed from: L0 */
        final long f37076L0;

        /* renamed from: M0 */
        final TimeUnit f37077M0;

        /* renamed from: N0 */
        final C12282j0 f37078N0;

        /* renamed from: O0 */
        final int f37079O0;

        /* renamed from: P0 */
        final boolean f37080P0;

        /* renamed from: Q0 */
        final long f37081Q0;

        /* renamed from: R0 */
        final C12285c f37082R0;

        /* renamed from: S0 */
        long f37083S0;

        /* renamed from: T0 */
        long f37084T0;

        /* renamed from: U0 */
        C14063d f37085U0;

        /* renamed from: V0 */
        C12223g<T> f37086V0;

        /* renamed from: W0 */
        volatile boolean f37087W0;

        /* renamed from: X0 */
        final C12350g f37088X0 = new C12350g();

        /* renamed from: e.a.x0.e.b.v4$a$a */
        /* compiled from: FlowableWindowTimed */
        static final class C12881a implements Runnable {

            /* renamed from: a */
            final long f37089a;

            /* renamed from: b */
            final C12880a<?> f37090b;

            C12881a(long j, C12880a<?> aVar) {
                this.f37089a = j;
                this.f37090b = aVar;
            }

            public void run() {
                C12880a<?> aVar = this.f37090b;
                if (!aVar.f39707I0) {
                    aVar.f39706H0.offer(this);
                } else {
                    aVar.f37087W0 = true;
                    aVar.dispose();
                }
                if (aVar.mo43109b()) {
                    aVar.mo42501h();
                }
            }
        }

        C12880a(C14062c<? super C5929l<T>> cVar, long j, TimeUnit timeUnit, C12282j0 j0Var, int i, long j2, boolean z) {
            super(cVar, new C13660a());
            this.f37076L0 = j;
            this.f37077M0 = timeUnit;
            this.f37078N0 = j0Var;
            this.f37079O0 = i;
            this.f37081Q0 = j2;
            this.f37080P0 = z;
            if (z) {
                this.f37082R0 = j0Var.mo41871a();
            } else {
                this.f37082R0 = null;
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            mo43107b(j);
        }

        public void cancel() {
            this.f39707I0 = true;
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this.f37088X0);
            C12285c cVar = this.f37082R0;
            if (cVar != null) {
                cVar.dispose();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo42501h() {
            C12405n<U> nVar = this.f39706H0;
            C14062c<? super V> cVar = this.f39705G0;
            C12223g<T> gVar = this.f37086V0;
            int i = 1;
            while (!this.f37087W0) {
                boolean z = this.f39708J0;
                Object poll = nVar.poll();
                boolean z2 = poll == null;
                boolean z3 = poll instanceof C12881a;
                if (z && (z2 || z3)) {
                    this.f37086V0 = null;
                    nVar.clear();
                    Throwable th = this.f39709K0;
                    if (th != null) {
                        gVar.onError(th);
                    } else {
                        gVar.onComplete();
                    }
                    dispose();
                    return;
                } else if (z2) {
                    i = mo43103a(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    int i2 = i;
                    if (z3) {
                        C12881a aVar = (C12881a) poll;
                        if (this.f37080P0 || this.f37084T0 == aVar.f37089a) {
                            gVar.onComplete();
                            this.f37083S0 = 0;
                            gVar = C12223g.m55071m(this.f37079O0);
                            this.f37086V0 = gVar;
                            long a = mo43104a();
                            if (a != 0) {
                                cVar.mo41789a(gVar);
                                if (a != Long.MAX_VALUE) {
                                    mo43105a(1);
                                }
                            } else {
                                this.f37086V0 = null;
                                this.f39706H0.clear();
                                this.f37085U0.cancel();
                                cVar.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                                dispose();
                                return;
                            }
                        }
                    } else {
                        gVar.mo41789a(C13761q.m58751d(poll));
                        long j = this.f37083S0 + 1;
                        if (j >= this.f37081Q0) {
                            this.f37084T0++;
                            this.f37083S0 = 0;
                            gVar.onComplete();
                            long a2 = mo43104a();
                            if (a2 != 0) {
                                C12223g<T> m = C12223g.m55071m(this.f37079O0);
                                this.f37086V0 = m;
                                this.f39705G0.mo41789a(m);
                                if (a2 != Long.MAX_VALUE) {
                                    mo43105a(1);
                                }
                                if (this.f37080P0) {
                                    ((C12314c) this.f37088X0.get()).dispose();
                                    C12285c cVar2 = this.f37082R0;
                                    C12881a aVar2 = new C12881a(this.f37084T0, this);
                                    long j2 = this.f37076L0;
                                    this.f37088X0.mo42109a(cVar2.mo42028a(aVar2, j2, j2, this.f37077M0));
                                }
                                gVar = m;
                            } else {
                                this.f37086V0 = null;
                                this.f37085U0.cancel();
                                this.f39705G0.onError(new MissingBackpressureException("Could not deliver window due to lack of requests"));
                                dispose();
                                return;
                            }
                        } else {
                            this.f37083S0 = j;
                        }
                    }
                    i = i2;
                }
            }
            this.f37085U0.cancel();
            nVar.clear();
            dispose();
        }

        public void onComplete() {
            this.f39708J0 = true;
            if (mo43109b()) {
                mo42501h();
            }
            this.f39705G0.onComplete();
            dispose();
        }

        public void onError(Throwable th) {
            this.f39709K0 = th;
            this.f39708J0 = true;
            if (mo43109b()) {
                mo42501h();
            }
            this.f39705G0.onError(th);
            dispose();
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C12314c cVar;
            if (C13742j.m58673a(this.f37085U0, dVar)) {
                this.f37085U0 = dVar;
                C14062c<? super V> cVar2 = this.f39705G0;
                cVar2.mo41788a((C14063d) this);
                if (!this.f39707I0) {
                    C12223g<T> m = C12223g.m55071m(this.f37079O0);
                    this.f37086V0 = m;
                    long a = mo43104a();
                    if (a != 0) {
                        cVar2.mo41789a(m);
                        if (a != Long.MAX_VALUE) {
                            mo43105a(1);
                        }
                        C12881a aVar = new C12881a(this.f37084T0, this);
                        if (this.f37080P0) {
                            C12285c cVar3 = this.f37082R0;
                            long j = this.f37076L0;
                            cVar = cVar3.mo42028a(aVar, j, j, this.f37077M0);
                        } else {
                            C12282j0 j0Var = this.f37078N0;
                            long j2 = this.f37076L0;
                            cVar = j0Var.mo42022a(aVar, j2, j2, this.f37077M0);
                        }
                        if (this.f37088X0.mo42109a(cVar)) {
                            dVar.mo41813c(Long.MAX_VALUE);
                        }
                    } else {
                        this.f39707I0 = true;
                        dVar.cancel();
                        cVar2.onError(new MissingBackpressureException("Could not deliver initial window due to lack of requests."));
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f37087W0) {
                if (mo43113g()) {
                    C12223g<T> gVar = this.f37086V0;
                    gVar.mo41789a(t);
                    long j = this.f37083S0 + 1;
                    if (j >= this.f37081Q0) {
                        this.f37084T0++;
                        this.f37083S0 = 0;
                        gVar.onComplete();
                        long a = mo43104a();
                        if (a != 0) {
                            C12223g<T> m = C12223g.m55071m(this.f37079O0);
                            this.f37086V0 = m;
                            this.f39705G0.mo41789a(m);
                            if (a != Long.MAX_VALUE) {
                                mo43105a(1);
                            }
                            if (this.f37080P0) {
                                ((C12314c) this.f37088X0.get()).dispose();
                                C12285c cVar = this.f37082R0;
                                C12881a aVar = new C12881a(this.f37084T0, this);
                                long j2 = this.f37076L0;
                                this.f37088X0.mo42109a(cVar.mo42028a(aVar, j2, j2, this.f37077M0));
                            }
                        } else {
                            this.f37086V0 = null;
                            this.f37085U0.cancel();
                            this.f39705G0.onError(new MissingBackpressureException("Could not deliver window due to lack of requests"));
                            dispose();
                            return;
                        }
                    } else {
                        this.f37083S0 = j;
                    }
                    if (mo43103a(-1) == 0) {
                        return;
                    }
                } else {
                    this.f39706H0.offer(C13761q.m58756i(t));
                    if (!mo43109b()) {
                        return;
                    }
                }
                mo42501h();
            }
        }
    }

    /* renamed from: e.a.x0.e.b.v4$b */
    /* compiled from: FlowableWindowTimed */
    static final class C12882b<T> extends C13724m<T, Object, C5929l<T>> implements C12297q<T>, C14063d, Runnable {

        /* renamed from: T0 */
        static final Object f37091T0 = new Object();

        /* renamed from: L0 */
        final long f37092L0;

        /* renamed from: M0 */
        final TimeUnit f37093M0;

        /* renamed from: N0 */
        final C12282j0 f37094N0;

        /* renamed from: O0 */
        final int f37095O0;

        /* renamed from: P0 */
        C14063d f37096P0;

        /* renamed from: Q0 */
        C12223g<T> f37097Q0;

        /* renamed from: R0 */
        final C12350g f37098R0 = new C12350g();

        /* renamed from: S0 */
        volatile boolean f37099S0;

        C12882b(C14062c<? super C5929l<T>> cVar, long j, TimeUnit timeUnit, C12282j0 j0Var, int i) {
            super(cVar, new C13660a());
            this.f37092L0 = j;
            this.f37093M0 = timeUnit;
            this.f37094N0 = j0Var;
            this.f37095O0 = i;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f37096P0, dVar)) {
                this.f37096P0 = dVar;
                this.f37097Q0 = C12223g.m55071m(this.f37095O0);
                C14062c<? super V> cVar = this.f39705G0;
                cVar.mo41788a((C14063d) this);
                long a = mo43104a();
                if (a != 0) {
                    cVar.mo41789a(this.f37097Q0);
                    if (a != Long.MAX_VALUE) {
                        mo43105a(1);
                    }
                    if (!this.f39707I0) {
                        C12350g gVar = this.f37098R0;
                        C12282j0 j0Var = this.f37094N0;
                        long j = this.f37092L0;
                        if (gVar.mo42109a(j0Var.mo42022a(this, j, j, this.f37093M0))) {
                            dVar.mo41813c(Long.MAX_VALUE);
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f39707I0 = true;
                dVar.cancel();
                cVar.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            mo43107b(j);
        }

        public void cancel() {
            this.f39707I0 = true;
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this.f37098R0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo42504h() {
            C12405n<U> nVar = this.f39706H0;
            C14062c<? super V> cVar = this.f39705G0;
            C12223g<T> gVar = this.f37097Q0;
            int i = 1;
            while (true) {
                boolean z = this.f37099S0;
                boolean z2 = this.f39708J0;
                Object poll = nVar.poll();
                if (!z2 || !(poll == null || poll == f37091T0)) {
                    if (poll == null) {
                        i = mo43103a(-i);
                        if (i == 0) {
                            return;
                        }
                    } else if (poll == f37091T0) {
                        gVar.onComplete();
                        if (!z) {
                            gVar = C12223g.m55071m(this.f37095O0);
                            this.f37097Q0 = gVar;
                            long a = mo43104a();
                            if (a != 0) {
                                cVar.mo41789a(gVar);
                                if (a != Long.MAX_VALUE) {
                                    mo43105a(1);
                                }
                            } else {
                                this.f37097Q0 = null;
                                this.f39706H0.clear();
                                this.f37096P0.cancel();
                                dispose();
                                cVar.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                                return;
                            }
                        } else {
                            this.f37096P0.cancel();
                        }
                    } else {
                        gVar.mo41789a(C13761q.m58751d(poll));
                    }
                }
            }
            this.f37097Q0 = null;
            nVar.clear();
            dispose();
            Throwable th = this.f39709K0;
            if (th != null) {
                gVar.onError(th);
            } else {
                gVar.onComplete();
            }
        }

        public void onComplete() {
            this.f39708J0 = true;
            if (mo43109b()) {
                mo42504h();
            }
            this.f39705G0.onComplete();
            dispose();
        }

        public void onError(Throwable th) {
            this.f39709K0 = th;
            this.f39708J0 = true;
            if (mo43109b()) {
                mo42504h();
            }
            this.f39705G0.onError(th);
            dispose();
        }

        public void run() {
            if (this.f39707I0) {
                this.f37099S0 = true;
                dispose();
            }
            this.f39706H0.offer(f37091T0);
            if (mo43109b()) {
                mo42504h();
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f37099S0) {
                if (mo43113g()) {
                    this.f37097Q0.mo41789a(t);
                    if (mo43103a(-1) == 0) {
                        return;
                    }
                } else {
                    this.f39706H0.offer(C13761q.m58756i(t));
                    if (!mo43109b()) {
                        return;
                    }
                }
                mo42504h();
            }
        }
    }

    /* renamed from: e.a.x0.e.b.v4$c */
    /* compiled from: FlowableWindowTimed */
    static final class C12883c<T> extends C13724m<T, Object, C5929l<T>> implements C14063d, Runnable {

        /* renamed from: L0 */
        final long f37100L0;

        /* renamed from: M0 */
        final long f37101M0;

        /* renamed from: N0 */
        final TimeUnit f37102N0;

        /* renamed from: O0 */
        final C12285c f37103O0;

        /* renamed from: P0 */
        final int f37104P0;

        /* renamed from: Q0 */
        final List<C12223g<T>> f37105Q0 = new LinkedList();

        /* renamed from: R0 */
        C14063d f37106R0;

        /* renamed from: S0 */
        volatile boolean f37107S0;

        /* renamed from: e.a.x0.e.b.v4$c$a */
        /* compiled from: FlowableWindowTimed */
        final class C12884a implements Runnable {

            /* renamed from: a */
            private final C12223g<T> f37108a;

            C12884a(C12223g<T> gVar) {
                this.f37108a = gVar;
            }

            public void run() {
                C12883c.this.mo42506a(this.f37108a);
            }
        }

        /* renamed from: e.a.x0.e.b.v4$c$b */
        /* compiled from: FlowableWindowTimed */
        static final class C12885b<T> {

            /* renamed from: a */
            final C12223g<T> f37110a;

            /* renamed from: b */
            final boolean f37111b;

            C12885b(C12223g<T> gVar, boolean z) {
                this.f37110a = gVar;
                this.f37111b = z;
            }
        }

        C12883c(C14062c<? super C5929l<T>> cVar, long j, long j2, TimeUnit timeUnit, C12285c cVar2, int i) {
            super(cVar, new C13660a());
            this.f37100L0 = j;
            this.f37101M0 = j2;
            this.f37102N0 = timeUnit;
            this.f37103O0 = cVar2;
            this.f37104P0 = i;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f37106R0, dVar)) {
                this.f37106R0 = dVar;
                this.f39705G0.mo41788a((C14063d) this);
                if (!this.f39707I0) {
                    long a = mo43104a();
                    if (a != 0) {
                        C12223g m = C12223g.m55071m(this.f37104P0);
                        this.f37105Q0.add(m);
                        this.f39705G0.mo41789a(m);
                        if (a != Long.MAX_VALUE) {
                            mo43105a(1);
                        }
                        this.f37103O0.mo41877a(new C12884a(m), this.f37100L0, this.f37102N0);
                        C12285c cVar = this.f37103O0;
                        long j = this.f37101M0;
                        cVar.mo42028a(this, j, j, this.f37102N0);
                        dVar.mo41813c(Long.MAX_VALUE);
                    } else {
                        dVar.cancel();
                        this.f39705G0.onError(new MissingBackpressureException("Could not emit the first window due to lack of requests"));
                    }
                }
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            mo43107b(j);
        }

        public void cancel() {
            this.f39707I0 = true;
        }

        public void dispose() {
            this.f37103O0.dispose();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo42508h() {
            C12405n<U> nVar = this.f39706H0;
            C14062c<? super V> cVar = this.f39705G0;
            List<C12223g<T>> list = this.f37105Q0;
            int i = 1;
            while (!this.f37107S0) {
                boolean z = this.f39708J0;
                Object poll = nVar.poll();
                boolean z2 = poll == null;
                boolean z3 = poll instanceof C12885b;
                if (z && (z2 || z3)) {
                    nVar.clear();
                    Throwable th = this.f39709K0;
                    if (th != null) {
                        for (C12223g onError : list) {
                            onError.onError(th);
                        }
                    } else {
                        for (C12223g onComplete : list) {
                            onComplete.onComplete();
                        }
                    }
                    list.clear();
                    dispose();
                    return;
                } else if (z2) {
                    i = mo43103a(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (z3) {
                    C12885b bVar = (C12885b) poll;
                    if (!bVar.f37111b) {
                        list.remove(bVar.f37110a);
                        bVar.f37110a.onComplete();
                        if (list.isEmpty() && this.f39707I0) {
                            this.f37107S0 = true;
                        }
                    } else if (!this.f39707I0) {
                        long a = mo43104a();
                        if (a != 0) {
                            C12223g m = C12223g.m55071m(this.f37104P0);
                            list.add(m);
                            cVar.mo41789a(m);
                            if (a != Long.MAX_VALUE) {
                                mo43105a(1);
                            }
                            this.f37103O0.mo41877a(new C12884a(m), this.f37100L0, this.f37102N0);
                        } else {
                            cVar.onError(new MissingBackpressureException("Can't emit window due to lack of requests"));
                        }
                    }
                } else {
                    for (C12223g a2 : list) {
                        a2.mo41789a(poll);
                    }
                }
            }
            this.f37106R0.cancel();
            dispose();
            nVar.clear();
            list.clear();
        }

        public void onComplete() {
            this.f39708J0 = true;
            if (mo43109b()) {
                mo42508h();
            }
            this.f39705G0.onComplete();
            dispose();
        }

        public void onError(Throwable th) {
            this.f39709K0 = th;
            this.f39708J0 = true;
            if (mo43109b()) {
                mo42508h();
            }
            this.f39705G0.onError(th);
            dispose();
        }

        public void run() {
            C12885b bVar = new C12885b(C12223g.m55071m(this.f37104P0), true);
            if (!this.f39707I0) {
                this.f39706H0.offer(bVar);
            }
            if (mo43109b()) {
                mo42508h();
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (mo43113g()) {
                for (C12223g a : this.f37105Q0) {
                    a.mo41789a(t);
                }
                if (mo43103a(-1) == 0) {
                    return;
                }
            } else {
                this.f39706H0.offer(t);
                if (!mo43109b()) {
                    return;
                }
            }
            mo42508h();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42506a(C12223g<T> gVar) {
            this.f39706H0.offer(new C12885b(gVar, false));
            if (mo43109b()) {
                mo42508h();
            }
        }
    }

    public C12879v4(C5929l<T> lVar, long j, long j2, TimeUnit timeUnit, C12282j0 j0Var, long j3, int i, boolean z) {
        super(lVar);
        this.f37069N = j;
        this.f37070O = j2;
        this.f37071P = timeUnit;
        this.f37072Q = j0Var;
        this.f37073R = j3;
        this.f37074S = i;
        this.f37075T = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super C5929l<T>> cVar) {
        C12274e eVar = new C12274e(cVar);
        long j = this.f37069N;
        long j2 = this.f37070O;
        if (j == j2) {
            long j3 = this.f37073R;
            if (j3 == Long.MAX_VALUE) {
                C5929l<T> lVar = this.f35814b;
                C12882b bVar = new C12882b(eVar, j, this.f37071P, this.f37072Q, this.f37074S);
                lVar.mo24393a((C12297q<? super T>) bVar);
                return;
            }
            C5929l<T> lVar2 = this.f35814b;
            C12880a aVar = new C12880a(eVar, j, this.f37071P, this.f37072Q, this.f37074S, j3, this.f37075T);
            lVar2.mo24393a((C12297q<? super T>) aVar);
            return;
        }
        C5929l<T> lVar3 = this.f35814b;
        C12883c cVar2 = new C12883c(eVar, j, j2, this.f37071P, this.f37072Q.mo41871a(), this.f37074S);
        lVar3.mo24393a((C12297q<? super T>) cVar2);
    }
}
