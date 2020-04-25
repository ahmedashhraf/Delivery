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
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.c1 */
/* compiled from: FlowableFlatMapMaybe */
public final class C12541c1<T, R> extends C12511a<T, R> {

    /* renamed from: N */
    final C12339o<? super T, ? extends C5941y<? extends R>> f35899N;

    /* renamed from: O */
    final boolean f35900O;

    /* renamed from: P */
    final int f35901P;

    /* renamed from: e.a.x0.e.b.c1$a */
    /* compiled from: FlowableFlatMapMaybe */
    static final class C12542a<T, R> extends AtomicInteger implements C12297q<T>, C14063d {
        private static final long serialVersionUID = 8600231336733376951L;

        /* renamed from: N */
        final int f35902N;

        /* renamed from: O */
        final AtomicLong f35903O = new AtomicLong();

        /* renamed from: P */
        final C12313b f35904P = new C12313b();

        /* renamed from: Q */
        final AtomicInteger f35905Q = new AtomicInteger(1);

        /* renamed from: R */
        final C13746c f35906R = new C13746c();

        /* renamed from: S */
        final C12339o<? super T, ? extends C5941y<? extends R>> f35907S;

        /* renamed from: T */
        final AtomicReference<C13663c<R>> f35908T = new AtomicReference<>();

        /* renamed from: U */
        C14063d f35909U;

        /* renamed from: V */
        volatile boolean f35910V;

        /* renamed from: a */
        final C14062c<? super R> f35911a;

        /* renamed from: b */
        final boolean f35912b;

        /* renamed from: e.a.x0.e.b.c1$a$a */
        /* compiled from: FlowableFlatMapMaybe */
        final class C12543a extends AtomicReference<C12314c> implements C12321v<R>, C12314c {
            private static final long serialVersionUID = -502562646270949838L;

            C12543a() {
            }

            /* renamed from: a */
            public void mo41931a(C12314c cVar) {
                C12347d.m55468c(this, cVar);
            }

            /* renamed from: d */
            public boolean mo41878d() {
                return C12347d.m55463a((C12314c) get());
            }

            public void dispose() {
                C12347d.m55465a((AtomicReference<C12314c>) this);
            }

            public void onComplete() {
                C12542a.this.mo42235a(this);
            }

            public void onError(Throwable th) {
                C12542a.this.mo42237a(this, th);
            }

            public void onSuccess(R r) {
                C12542a.this.mo42236a(this, r);
            }
        }

        C12542a(C14062c<? super R> cVar, C12339o<? super T, ? extends C5941y<? extends R>> oVar, boolean z, int i) {
            this.f35911a = cVar;
            this.f35907S = oVar;
            this.f35912b = z;
            this.f35902N = i;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f35909U, dVar)) {
                this.f35909U = dVar;
                this.f35911a.mo41788a((C14063d) this);
                int i = this.f35902N;
                if (i == Integer.MAX_VALUE) {
                    dVar.mo41813c(Long.MAX_VALUE);
                } else {
                    dVar.mo41813c((long) i);
                }
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f35903O, j);
                mo42238d();
            }
        }

        public void cancel() {
            this.f35910V = true;
            this.f35909U.cancel();
            this.f35904P.dispose();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42238d() {
            if (getAndIncrement() == 0) {
                mo42239e();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42239e() {
            boolean z;
            C14062c<? super R> cVar = this.f35911a;
            AtomicInteger atomicInteger = this.f35905Q;
            AtomicReference<C13663c<R>> atomicReference = this.f35908T;
            int i = 1;
            do {
                long j = this.f35903O.get();
                long j2 = 0;
                while (true) {
                    z = false;
                    if (j2 == j) {
                        break;
                    } else if (this.f35910V) {
                        mo42234a();
                        return;
                    } else if (this.f35912b || ((Throwable) this.f35906R.get()) == null) {
                        boolean z2 = atomicInteger.get() == 0;
                        C13663c cVar2 = (C13663c) atomicReference.get();
                        Object poll = cVar2 != null ? cVar2.poll() : null;
                        boolean z3 = poll == null;
                        if (z2 && z3) {
                            Throwable d = this.f35906R.mo43143d();
                            if (d != null) {
                                cVar.onError(d);
                            } else {
                                cVar.onComplete();
                            }
                            return;
                        } else if (z3) {
                            break;
                        } else {
                            cVar.mo41789a(poll);
                            j2++;
                        }
                    } else {
                        Throwable d2 = this.f35906R.mo43143d();
                        mo42234a();
                        cVar.onError(d2);
                        return;
                    }
                }
                if (j2 == j) {
                    if (this.f35910V) {
                        mo42234a();
                        return;
                    } else if (this.f35912b || ((Throwable) this.f35906R.get()) == null) {
                        boolean z4 = atomicInteger.get() == 0;
                        C13663c cVar3 = (C13663c) atomicReference.get();
                        if (cVar3 == null || cVar3.isEmpty()) {
                            z = true;
                        }
                        if (z4 && z) {
                            Throwable d3 = this.f35906R.mo43143d();
                            if (d3 != null) {
                                cVar.onError(d3);
                            } else {
                                cVar.onComplete();
                            }
                            return;
                        }
                    } else {
                        Throwable d4 = this.f35906R.mo43143d();
                        mo42234a();
                        cVar.onError(d4);
                        return;
                    }
                }
                if (j2 != 0) {
                    C13747d.m58699c(this.f35903O, j2);
                    if (this.f35902N != Integer.MAX_VALUE) {
                        this.f35909U.mo41813c(j2);
                    }
                }
                i = addAndGet(-i);
            } while (i != 0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public C13663c<R> mo42240f() {
            C13663c<R> cVar;
            do {
                C13663c<R> cVar2 = (C13663c) this.f35908T.get();
                if (cVar2 != null) {
                    return cVar2;
                }
                cVar = new C13663c<>(C5929l.m26793R());
            } while (!this.f35908T.compareAndSet(null, cVar));
            return cVar;
        }

        public void onComplete() {
            this.f35905Q.decrementAndGet();
            mo42238d();
        }

        public void onError(Throwable th) {
            this.f35905Q.decrementAndGet();
            if (this.f35906R.mo43142a(th)) {
                if (!this.f35912b) {
                    this.f35904P.dispose();
                }
                mo42238d();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            try {
                C5941y yVar = (C5941y) C12390b.m55563a(this.f35907S.apply(t), "The mapper returned a null MaybeSource");
                this.f35905Q.getAndIncrement();
                C12543a aVar = new C12543a();
                if (!this.f35910V && this.f35904P.mo42072b(aVar)) {
                    yVar.mo24639a(aVar);
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f35909U.cancel();
                onError(th);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42236a(C12543a aVar, R r) {
            this.f35904P.mo42073c(aVar);
            if (get() == 0) {
                boolean z = true;
                if (compareAndSet(0, 1)) {
                    if (this.f35905Q.decrementAndGet() != 0) {
                        z = false;
                    }
                    if (this.f35903O.get() != 0) {
                        this.f35911a.mo41789a(r);
                        C13663c cVar = (C13663c) this.f35908T.get();
                        if (!z || (cVar != null && !cVar.isEmpty())) {
                            C13747d.m58699c(this.f35903O, 1);
                            if (this.f35902N != Integer.MAX_VALUE) {
                                this.f35909U.mo41813c(1);
                            }
                        } else {
                            Throwable d = this.f35906R.mo43143d();
                            if (d != null) {
                                this.f35911a.onError(d);
                            } else {
                                this.f35911a.onComplete();
                            }
                            return;
                        }
                    } else {
                        C13663c f = mo42240f();
                        synchronized (f) {
                            f.offer(r);
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    mo42239e();
                }
            }
            C13663c f2 = mo42240f();
            synchronized (f2) {
                f2.offer(r);
            }
            this.f35905Q.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            mo42239e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42237a(C12543a aVar, Throwable th) {
            this.f35904P.mo42073c(aVar);
            if (this.f35906R.mo43142a(th)) {
                if (!this.f35912b) {
                    this.f35909U.cancel();
                    this.f35904P.dispose();
                } else if (this.f35902N != Integer.MAX_VALUE) {
                    this.f35909U.mo41813c(1);
                }
                this.f35905Q.decrementAndGet();
                mo42238d();
                return;
            }
            C12205a.m54894b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42235a(C12543a aVar) {
            this.f35904P.mo42073c(aVar);
            if (get() == 0) {
                boolean z = true;
                if (compareAndSet(0, 1)) {
                    if (this.f35905Q.decrementAndGet() != 0) {
                        z = false;
                    }
                    C13663c cVar = (C13663c) this.f35908T.get();
                    if (!z || (cVar != null && !cVar.isEmpty())) {
                        if (this.f35902N != Integer.MAX_VALUE) {
                            this.f35909U.mo41813c(1);
                        }
                        if (decrementAndGet() != 0) {
                            mo42239e();
                        }
                        return;
                    }
                    Throwable d = this.f35906R.mo43143d();
                    if (d != null) {
                        this.f35911a.onError(d);
                    } else {
                        this.f35911a.onComplete();
                    }
                    return;
                }
            }
            this.f35905Q.decrementAndGet();
            if (this.f35902N != Integer.MAX_VALUE) {
                this.f35909U.mo41813c(1);
            }
            mo42238d();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42234a() {
            C13663c cVar = (C13663c) this.f35908T.get();
            if (cVar != null) {
                cVar.clear();
            }
        }
    }

    public C12541c1(C5929l<T> lVar, C12339o<? super T, ? extends C5941y<? extends R>> oVar, boolean z, int i) {
        super(lVar);
        this.f35899N = oVar;
        this.f35900O = z;
        this.f35901P = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super R> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12542a<Object>(cVar, this.f35899N, this.f35900O, this.f35901P));
    }
}
