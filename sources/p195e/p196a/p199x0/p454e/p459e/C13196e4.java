package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p462f.C13660a;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p442e1.C12266j;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p467z0.C13787e;

/* renamed from: e.a.x0.e.e.e4 */
/* compiled from: ObservableWindowBoundary */
public final class C13196e4<T, B> extends C13131a<T, C5923b0<T>> {

    /* renamed from: N */
    final int f38080N;

    /* renamed from: b */
    final C5926g0<B> f38081b;

    /* renamed from: e.a.x0.e.e.e4$a */
    /* compiled from: ObservableWindowBoundary */
    static final class C13197a<T, B> extends C13787e<B> {

        /* renamed from: N */
        boolean f38082N;

        /* renamed from: b */
        final C13198b<T, B> f38083b;

        C13197a(C13198b<T, B> bVar) {
            this.f38083b = bVar;
        }

        /* renamed from: a */
        public void mo33453a(B b) {
            if (!this.f38082N) {
                this.f38083b.mo42727f();
            }
        }

        public void onComplete() {
            if (!this.f38082N) {
                this.f38082N = true;
                this.f38083b.mo42726e();
            }
        }

        public void onError(Throwable th) {
            if (this.f38082N) {
                C12205a.m54894b(th);
                return;
            }
            this.f38082N = true;
            this.f38083b.mo42725a(th);
        }
    }

    /* renamed from: e.a.x0.e.e.e4$b */
    /* compiled from: ObservableWindowBoundary */
    static final class C13198b<T, B> extends AtomicInteger implements C12280i0<T>, C12314c, Runnable {

        /* renamed from: V */
        static final Object f38084V = new Object();
        private static final long serialVersionUID = 2233020065421370272L;

        /* renamed from: N */
        final C13197a<T, B> f38085N = new C13197a<>(this);

        /* renamed from: O */
        final AtomicReference<C12314c> f38086O = new AtomicReference<>();

        /* renamed from: P */
        final AtomicInteger f38087P = new AtomicInteger(1);

        /* renamed from: Q */
        final C13660a<Object> f38088Q = new C13660a<>();

        /* renamed from: R */
        final C13746c f38089R = new C13746c();

        /* renamed from: S */
        final AtomicBoolean f38090S = new AtomicBoolean();

        /* renamed from: T */
        volatile boolean f38091T;

        /* renamed from: U */
        C12266j<T> f38092U;

        /* renamed from: a */
        final C12280i0<? super C5923b0<T>> f38093a;

        /* renamed from: b */
        final int f38094b;

        C13198b(C12280i0<? super C5923b0<T>> i0Var, int i) {
            this.f38093a = i0Var;
            this.f38094b = i;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55468c(this.f38086O, cVar)) {
                mo42727f();
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38090S.get();
        }

        public void dispose() {
            if (this.f38090S.compareAndSet(false, true)) {
                this.f38085N.dispose();
                if (this.f38087P.decrementAndGet() == 0) {
                    C12347d.m55465a(this.f38086O);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42726e() {
            C12347d.m55465a(this.f38086O);
            this.f38091T = true;
            mo42724a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo42727f() {
            this.f38088Q.offer(f38084V);
            mo42724a();
        }

        public void onComplete() {
            this.f38085N.dispose();
            this.f38091T = true;
            mo42724a();
        }

        public void onError(Throwable th) {
            this.f38085N.dispose();
            if (this.f38089R.mo43142a(th)) {
                this.f38091T = true;
                mo42724a();
                return;
            }
            C12205a.m54894b(th);
        }

        public void run() {
            if (this.f38087P.decrementAndGet() == 0) {
                C12347d.m55465a(this.f38086O);
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f38088Q.offer(t);
            mo42724a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42725a(Throwable th) {
            C12347d.m55465a(this.f38086O);
            if (this.f38089R.mo43142a(th)) {
                this.f38091T = true;
                mo42724a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42724a() {
            if (getAndIncrement() == 0) {
                C12280i0<? super C5923b0<T>> i0Var = this.f38093a;
                C13660a<Object> aVar = this.f38088Q;
                C13746c cVar = this.f38089R;
                int i = 1;
                while (this.f38087P.get() != 0) {
                    C12266j<T> jVar = this.f38092U;
                    boolean z = this.f38091T;
                    if (!z || cVar.get() == null) {
                        Object poll = aVar.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            Throwable d = cVar.mo43143d();
                            if (d == null) {
                                if (jVar != null) {
                                    this.f38092U = null;
                                    jVar.onComplete();
                                }
                                i0Var.onComplete();
                            } else {
                                if (jVar != null) {
                                    this.f38092U = null;
                                    jVar.onError(d);
                                }
                                i0Var.onError(d);
                            }
                            return;
                        } else if (z2) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else if (poll != f38084V) {
                            jVar.mo33453a(poll);
                        } else {
                            if (jVar != null) {
                                this.f38092U = null;
                                jVar.onComplete();
                            }
                            if (!this.f38090S.get()) {
                                C12266j<T> a = C12266j.m55267a(this.f38094b, (Runnable) this);
                                this.f38092U = a;
                                this.f38087P.getAndIncrement();
                                i0Var.mo33453a(a);
                            }
                        }
                    } else {
                        aVar.clear();
                        Throwable d2 = cVar.mo43143d();
                        if (jVar != null) {
                            this.f38092U = null;
                            jVar.onError(d2);
                        }
                        i0Var.onError(d2);
                        return;
                    }
                }
                aVar.clear();
                this.f38092U = null;
            }
        }
    }

    public C13196e4(C5926g0<T> g0Var, C5926g0<B> g0Var2, int i) {
        super(g0Var);
        this.f38081b = g0Var2;
        this.f38080N = i;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super C5923b0<T>> i0Var) {
        C13198b bVar = new C13198b(i0Var, this.f38080N);
        i0Var.mo34123a((C12314c) bVar);
        this.f38081b.mo23893a(bVar.f38085N);
        this.f37851a.mo23893a(bVar);
    }
}
