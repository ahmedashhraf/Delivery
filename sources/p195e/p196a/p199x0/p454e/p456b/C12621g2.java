package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C12321v;
import p195e.p196a.C5929l;
import p195e.p196a.C5941y;
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

/* renamed from: e.a.x0.e.b.g2 */
/* compiled from: FlowableMergeWithMaybe */
public final class C12621g2<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C5941y<? extends T> f36129N;

    /* renamed from: e.a.x0.e.b.g2$a */
    /* compiled from: FlowableMergeWithMaybe */
    static final class C12622a<T> extends AtomicInteger implements C12297q<T>, C14063d {

        /* renamed from: Z */
        static final int f36130Z = 1;

        /* renamed from: a0 */
        static final int f36131a0 = 2;
        private static final long serialVersionUID = -4592979584110982903L;

        /* renamed from: N */
        final C12623a<T> f36132N = new C12623a<>(this);

        /* renamed from: O */
        final C13746c f36133O = new C13746c();

        /* renamed from: P */
        final AtomicLong f36134P = new AtomicLong();

        /* renamed from: Q */
        final int f36135Q = C5929l.m26793R();

        /* renamed from: R */
        final int f36136R;

        /* renamed from: S */
        volatile C12405n<T> f36137S;

        /* renamed from: T */
        T f36138T;

        /* renamed from: U */
        volatile boolean f36139U;

        /* renamed from: V */
        volatile boolean f36140V;

        /* renamed from: W */
        volatile int f36141W;

        /* renamed from: X */
        long f36142X;

        /* renamed from: Y */
        int f36143Y;

        /* renamed from: a */
        final C14062c<? super T> f36144a;

        /* renamed from: b */
        final AtomicReference<C14063d> f36145b = new AtomicReference<>();

        /* renamed from: e.a.x0.e.b.g2$a$a */
        /* compiled from: FlowableMergeWithMaybe */
        static final class C12623a<T> extends AtomicReference<C12314c> implements C12321v<T> {
            private static final long serialVersionUID = -2935427570954647017L;

            /* renamed from: a */
            final C12622a<T> f36146a;

            C12623a(C12622a<T> aVar) {
                this.f36146a = aVar;
            }

            /* renamed from: a */
            public void mo41931a(C12314c cVar) {
                C12347d.m55468c(this, cVar);
            }

            public void onComplete() {
                this.f36146a.mo42316f();
            }

            public void onError(Throwable th) {
                this.f36146a.mo42312a(th);
            }

            public void onSuccess(T t) {
                this.f36146a.mo42313c(t);
            }
        }

        C12622a(C14062c<? super T> cVar) {
            this.f36144a = cVar;
            int i = this.f36135Q;
            this.f36136R = i - (i >> 2);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58676a(this.f36145b, dVar, (long) this.f36135Q);
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            C13747d.m58696a(this.f36134P, j);
            mo42311a();
        }

        public void cancel() {
            this.f36139U = true;
            C13742j.m58674a(this.f36145b);
            C12347d.m55465a((AtomicReference<C12314c>) this.f36132N);
            if (getAndIncrement() == 0) {
                this.f36137S = null;
                this.f36138T = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42314d() {
            C14062c<? super T> cVar = this.f36144a;
            long j = this.f36142X;
            int i = this.f36143Y;
            int i2 = this.f36136R;
            int i3 = 1;
            long j2 = j;
            int i4 = 1;
            while (true) {
                long j3 = this.f36134P.get();
                while (j2 != j3) {
                    if (this.f36139U) {
                        this.f36138T = null;
                        this.f36137S = null;
                        return;
                    } else if (this.f36133O.get() != null) {
                        this.f36138T = null;
                        this.f36137S = null;
                        cVar.onError(this.f36133O.mo43143d());
                        return;
                    } else {
                        int i5 = this.f36141W;
                        if (i5 == i3) {
                            T t = this.f36138T;
                            this.f36138T = null;
                            this.f36141W = 2;
                            cVar.mo41789a(t);
                            j2++;
                        } else {
                            boolean z = this.f36140V;
                            C12405n<T> nVar = this.f36137S;
                            Object poll = nVar != null ? nVar.poll() : null;
                            boolean z2 = poll == null;
                            if (z && z2 && i5 == 2) {
                                this.f36137S = null;
                                cVar.onComplete();
                                return;
                            } else if (z2) {
                                break;
                            } else {
                                cVar.mo41789a(poll);
                                j2++;
                                i++;
                                if (i == i2) {
                                    ((C14063d) this.f36145b.get()).mo41813c((long) i2);
                                    i = 0;
                                }
                                i3 = 1;
                            }
                        }
                    }
                }
                if (j2 == j3) {
                    if (this.f36139U) {
                        this.f36138T = null;
                        this.f36137S = null;
                        return;
                    } else if (this.f36133O.get() != null) {
                        this.f36138T = null;
                        this.f36137S = null;
                        cVar.onError(this.f36133O.mo43143d());
                        return;
                    } else {
                        boolean z3 = this.f36140V;
                        C12405n<T> nVar2 = this.f36137S;
                        boolean z4 = nVar2 == null || nVar2.isEmpty();
                        if (z3 && z4 && this.f36141W == 2) {
                            this.f36137S = null;
                            cVar.onComplete();
                            return;
                        }
                    }
                }
                this.f36142X = j2;
                this.f36143Y = i;
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
        public C12405n<T> mo42315e() {
            C12405n<T> nVar = this.f36137S;
            if (nVar != null) {
                return nVar;
            }
            C13662b bVar = new C13662b(C5929l.m26793R());
            this.f36137S = bVar;
            return bVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo42316f() {
            this.f36141W = 2;
            mo42311a();
        }

        public void onComplete() {
            this.f36140V = true;
            mo42311a();
        }

        public void onError(Throwable th) {
            if (this.f36133O.mo43142a(th)) {
                C13742j.m58674a(this.f36145b);
                mo42311a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (compareAndSet(0, 1)) {
                long j = this.f36142X;
                if (this.f36134P.get() != j) {
                    C12405n<T> nVar = this.f36137S;
                    if (nVar == null || nVar.isEmpty()) {
                        this.f36142X = j + 1;
                        this.f36144a.mo41789a(t);
                        int i = this.f36143Y + 1;
                        if (i == this.f36136R) {
                            this.f36143Y = 0;
                            ((C14063d) this.f36145b.get()).mo41813c((long) i);
                        } else {
                            this.f36143Y = i;
                        }
                    } else {
                        nVar.offer(t);
                    }
                } else {
                    mo42315e().offer(t);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                mo42315e().offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            mo42314d();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo42313c(T t) {
            if (compareAndSet(0, 1)) {
                long j = this.f36142X;
                if (this.f36134P.get() != j) {
                    this.f36142X = j + 1;
                    this.f36144a.mo41789a(t);
                    this.f36141W = 2;
                } else {
                    this.f36138T = t;
                    this.f36141W = 1;
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            } else {
                this.f36138T = t;
                this.f36141W = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            mo42314d();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42312a(Throwable th) {
            if (this.f36133O.mo43142a(th)) {
                C13742j.m58674a(this.f36145b);
                mo42311a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42311a() {
            if (getAndIncrement() == 0) {
                mo42314d();
            }
        }
    }

    public C12621g2(C5929l<T> lVar, C5941y<? extends T> yVar) {
        super(lVar);
        this.f36129N = yVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C12622a aVar = new C12622a(cVar);
        cVar.mo41788a((C14063d) aVar);
        this.f35814b.mo24393a((C12297q<? super T>) aVar);
        this.f36129N.mo24639a(aVar.f36132N);
    }
}
