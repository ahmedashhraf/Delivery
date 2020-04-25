package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12292n0;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p452c.C12405n;
import p195e.p196a.p199x0.p462f.C13662b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.h2 */
/* compiled from: FlowableMergeWithSingle */
public final class C12635h2<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C5930q0<? extends T> f36179N;

    /* renamed from: e.a.x0.e.b.h2$a */
    /* compiled from: FlowableMergeWithSingle */
    static final class C12636a<T> extends AtomicInteger implements C12297q<T>, C14063d {

        /* renamed from: Z */
        static final int f36180Z = 1;

        /* renamed from: a0 */
        static final int f36181a0 = 2;
        private static final long serialVersionUID = -4592979584110982903L;

        /* renamed from: N */
        final C12637a<T> f36182N = new C12637a<>(this);

        /* renamed from: O */
        final C13746c f36183O = new C13746c();

        /* renamed from: P */
        final AtomicLong f36184P = new AtomicLong();

        /* renamed from: Q */
        final int f36185Q = C5929l.m26793R();

        /* renamed from: R */
        final int f36186R;

        /* renamed from: S */
        volatile C12405n<T> f36187S;

        /* renamed from: T */
        T f36188T;

        /* renamed from: U */
        volatile boolean f36189U;

        /* renamed from: V */
        volatile boolean f36190V;

        /* renamed from: W */
        volatile int f36191W;

        /* renamed from: X */
        long f36192X;

        /* renamed from: Y */
        int f36193Y;

        /* renamed from: a */
        final C14062c<? super T> f36194a;

        /* renamed from: b */
        final AtomicReference<C14063d> f36195b = new AtomicReference<>();

        /* renamed from: e.a.x0.e.b.h2$a$a */
        /* compiled from: FlowableMergeWithSingle */
        static final class C12637a<T> extends AtomicReference<C12314c> implements C12292n0<T> {
            private static final long serialVersionUID = -2935427570954647017L;

            /* renamed from: a */
            final C12636a<T> f36196a;

            C12637a(C12636a<T> aVar) {
                this.f36196a = aVar;
            }

            /* renamed from: a */
            public void mo41974a(C12314c cVar) {
                C12347d.m55468c(this, cVar);
            }

            public void onError(Throwable th) {
                this.f36196a.mo42325a(th);
            }

            public void onSuccess(T t) {
                this.f36196a.mo42326c(t);
            }
        }

        C12636a(C14062c<? super T> cVar) {
            this.f36194a = cVar;
            int i = this.f36185Q;
            this.f36186R = i - (i >> 2);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58676a(this.f36195b, dVar, (long) this.f36185Q);
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            C13747d.m58696a(this.f36184P, j);
            mo42324a();
        }

        public void cancel() {
            this.f36189U = true;
            C13742j.m58674a(this.f36195b);
            C12347d.m55465a((AtomicReference<C12314c>) this.f36182N);
            if (getAndIncrement() == 0) {
                this.f36187S = null;
                this.f36188T = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42327d() {
            C14062c<? super T> cVar = this.f36194a;
            long j = this.f36192X;
            int i = this.f36193Y;
            int i2 = this.f36186R;
            int i3 = 1;
            long j2 = j;
            int i4 = 1;
            while (true) {
                long j3 = this.f36184P.get();
                while (j2 != j3) {
                    if (this.f36189U) {
                        this.f36188T = null;
                        this.f36187S = null;
                        return;
                    } else if (this.f36183O.get() != null) {
                        this.f36188T = null;
                        this.f36187S = null;
                        cVar.onError(this.f36183O.mo43143d());
                        return;
                    } else {
                        int i5 = this.f36191W;
                        if (i5 == i3) {
                            T t = this.f36188T;
                            this.f36188T = null;
                            this.f36191W = 2;
                            cVar.mo41789a(t);
                            j2++;
                        } else {
                            boolean z = this.f36190V;
                            C12405n<T> nVar = this.f36187S;
                            Object poll = nVar != null ? nVar.poll() : null;
                            boolean z2 = poll == null;
                            if (z && z2 && i5 == 2) {
                                this.f36187S = null;
                                cVar.onComplete();
                                return;
                            } else if (z2) {
                                break;
                            } else {
                                cVar.mo41789a(poll);
                                j2++;
                                i++;
                                if (i == i2) {
                                    ((C14063d) this.f36195b.get()).mo41813c((long) i2);
                                    i = 0;
                                }
                                i3 = 1;
                            }
                        }
                    }
                }
                if (j2 == j3) {
                    if (this.f36189U) {
                        this.f36188T = null;
                        this.f36187S = null;
                        return;
                    } else if (this.f36183O.get() != null) {
                        this.f36188T = null;
                        this.f36187S = null;
                        cVar.onError(this.f36183O.mo43143d());
                        return;
                    } else {
                        boolean z3 = this.f36190V;
                        C12405n<T> nVar2 = this.f36187S;
                        boolean z4 = nVar2 == null || nVar2.isEmpty();
                        if (z3 && z4 && this.f36191W == 2) {
                            this.f36187S = null;
                            cVar.onComplete();
                            return;
                        }
                    }
                }
                this.f36192X = j2;
                this.f36193Y = i;
                i4 = addAndGet(-i4);
                if (i4 != 0) {
                    i3 = 1;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public C12405n<T> mo42328e() {
            C12405n<T> nVar = this.f36187S;
            if (nVar != null) {
                return nVar;
            }
            C13662b bVar = new C13662b(C5929l.m26793R());
            this.f36187S = bVar;
            return bVar;
        }

        public void onComplete() {
            this.f36190V = true;
            mo42324a();
        }

        public void onError(Throwable th) {
            if (this.f36183O.mo43142a(th)) {
                C13742j.m58674a(this.f36195b);
                mo42324a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (compareAndSet(0, 1)) {
                long j = this.f36192X;
                if (this.f36184P.get() != j) {
                    C12405n<T> nVar = this.f36187S;
                    if (nVar == null || nVar.isEmpty()) {
                        this.f36192X = j + 1;
                        this.f36194a.mo41789a(t);
                        int i = this.f36193Y + 1;
                        if (i == this.f36186R) {
                            this.f36193Y = 0;
                            ((C14063d) this.f36195b.get()).mo41813c((long) i);
                        } else {
                            this.f36193Y = i;
                        }
                    } else {
                        nVar.offer(t);
                    }
                } else {
                    mo42328e().offer(t);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                mo42328e().offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            mo42327d();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo42326c(T t) {
            if (compareAndSet(0, 1)) {
                long j = this.f36192X;
                if (this.f36184P.get() != j) {
                    this.f36192X = j + 1;
                    this.f36194a.mo41789a(t);
                    this.f36191W = 2;
                } else {
                    this.f36188T = t;
                    this.f36191W = 1;
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            } else {
                this.f36188T = t;
                this.f36191W = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            mo42327d();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42325a(Throwable th) {
            if (this.f36183O.mo43142a(th)) {
                C13742j.m58674a(this.f36195b);
                mo42324a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42324a() {
            if (getAndIncrement() == 0) {
                mo42327d();
            }
        }
    }

    public C12635h2(C5929l<T> lVar, C5930q0<? extends T> q0Var) {
        super(lVar);
        this.f36179N = q0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C12636a aVar = new C12636a(cVar);
        cVar.mo41788a((C14063d) aVar);
        this.f35814b.mo24393a((C12297q<? super T>) aVar);
        this.f36179N.mo24192a(aVar.f36182N);
    }
}
