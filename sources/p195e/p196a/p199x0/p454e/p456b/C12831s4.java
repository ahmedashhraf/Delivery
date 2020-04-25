package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p462f.C13660a;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p440c1.C12223g;
import p195e.p196a.p443f1.C12271b;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.s4 */
/* compiled from: FlowableWindowBoundary */
public final class C12831s4<T, B> extends C12511a<T, C5929l<T>> {

    /* renamed from: N */
    final C6007b<B> f36866N;

    /* renamed from: O */
    final int f36867O;

    /* renamed from: e.a.x0.e.b.s4$a */
    /* compiled from: FlowableWindowBoundary */
    static final class C12832a<T, B> extends C12271b<B> {

        /* renamed from: N */
        boolean f36868N;

        /* renamed from: b */
        final C12833b<T, B> f36869b;

        C12832a(C12833b<T, B> bVar) {
            this.f36869b = bVar;
        }

        /* renamed from: a */
        public void mo41789a(B b) {
            if (!this.f36868N) {
                this.f36869b.mo42462e();
            }
        }

        public void onComplete() {
            if (!this.f36868N) {
                this.f36868N = true;
                this.f36869b.mo42461d();
            }
        }

        public void onError(Throwable th) {
            if (this.f36868N) {
                C12205a.m54894b(th);
                return;
            }
            this.f36868N = true;
            this.f36869b.mo42460a(th);
        }
    }

    /* renamed from: e.a.x0.e.b.s4$b */
    /* compiled from: FlowableWindowBoundary */
    static final class C12833b<T, B> extends AtomicInteger implements C12297q<T>, C14063d, Runnable {

        /* renamed from: X */
        static final Object f36870X = new Object();
        private static final long serialVersionUID = 2233020065421370272L;

        /* renamed from: N */
        final C12832a<T, B> f36871N = new C12832a<>(this);

        /* renamed from: O */
        final AtomicReference<C14063d> f36872O = new AtomicReference<>();

        /* renamed from: P */
        final AtomicInteger f36873P = new AtomicInteger(1);

        /* renamed from: Q */
        final C13660a<Object> f36874Q = new C13660a<>();

        /* renamed from: R */
        final C13746c f36875R = new C13746c();

        /* renamed from: S */
        final AtomicBoolean f36876S = new AtomicBoolean();

        /* renamed from: T */
        final AtomicLong f36877T = new AtomicLong();

        /* renamed from: U */
        volatile boolean f36878U;

        /* renamed from: V */
        C12223g<T> f36879V;

        /* renamed from: W */
        long f36880W;

        /* renamed from: a */
        final C14062c<? super C5929l<T>> f36881a;

        /* renamed from: b */
        final int f36882b;

        C12833b(C14062c<? super C5929l<T>> cVar, int i) {
            this.f36881a = cVar;
            this.f36882b = i;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58676a(this.f36872O, dVar, Long.MAX_VALUE);
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            C13747d.m58696a(this.f36877T, j);
        }

        public void cancel() {
            if (this.f36876S.compareAndSet(false, true)) {
                this.f36871N.dispose();
                if (this.f36873P.decrementAndGet() == 0) {
                    C13742j.m58674a(this.f36872O);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42461d() {
            C13742j.m58674a(this.f36872O);
            this.f36878U = true;
            mo42459a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42462e() {
            this.f36874Q.offer(f36870X);
            mo42459a();
        }

        public void onComplete() {
            this.f36871N.dispose();
            this.f36878U = true;
            mo42459a();
        }

        public void onError(Throwable th) {
            this.f36871N.dispose();
            if (this.f36875R.mo43142a(th)) {
                this.f36878U = true;
                mo42459a();
                return;
            }
            C12205a.m54894b(th);
        }

        public void run() {
            if (this.f36873P.decrementAndGet() == 0) {
                C13742j.m58674a(this.f36872O);
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f36874Q.offer(t);
            mo42459a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42460a(Throwable th) {
            C13742j.m58674a(this.f36872O);
            if (this.f36875R.mo43142a(th)) {
                this.f36878U = true;
                mo42459a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42459a() {
            if (getAndIncrement() == 0) {
                C14062c<? super C5929l<T>> cVar = this.f36881a;
                C13660a<Object> aVar = this.f36874Q;
                C13746c cVar2 = this.f36875R;
                long j = this.f36880W;
                int i = 1;
                while (this.f36873P.get() != 0) {
                    C12223g<T> gVar = this.f36879V;
                    boolean z = this.f36878U;
                    if (!z || cVar2.get() == null) {
                        Object poll = aVar.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            Throwable d = cVar2.mo43143d();
                            if (d == null) {
                                if (gVar != null) {
                                    this.f36879V = null;
                                    gVar.onComplete();
                                }
                                cVar.onComplete();
                            } else {
                                if (gVar != null) {
                                    this.f36879V = null;
                                    gVar.onError(d);
                                }
                                cVar.onError(d);
                            }
                            return;
                        } else if (z2) {
                            this.f36880W = j;
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else if (poll != f36870X) {
                            gVar.mo41789a(poll);
                        } else {
                            if (gVar != null) {
                                this.f36879V = null;
                                gVar.onComplete();
                            }
                            if (!this.f36876S.get()) {
                                C12223g<T> a = C12223g.m55067a(this.f36882b, this);
                                this.f36879V = a;
                                this.f36873P.getAndIncrement();
                                if (j != this.f36877T.get()) {
                                    j++;
                                    cVar.mo41789a(a);
                                } else {
                                    C13742j.m58674a(this.f36872O);
                                    this.f36871N.dispose();
                                    cVar2.mo43142a(new MissingBackpressureException("Could not deliver a window due to lack of requests"));
                                    this.f36878U = true;
                                }
                            }
                        }
                    } else {
                        aVar.clear();
                        Throwable d2 = cVar2.mo43143d();
                        if (gVar != null) {
                            this.f36879V = null;
                            gVar.onError(d2);
                        }
                        cVar.onError(d2);
                        return;
                    }
                }
                aVar.clear();
                this.f36879V = null;
            }
        }
    }

    public C12831s4(C5929l<T> lVar, C6007b<B> bVar, int i) {
        super(lVar);
        this.f36866N = bVar;
        this.f36867O = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super C5929l<T>> cVar) {
        C12833b bVar = new C12833b(cVar, this.f36867O);
        cVar.mo41788a((C14063d) bVar);
        bVar.mo42462e();
        this.f36866N.mo24397a(bVar.f36871N);
        this.f35814b.mo24393a((C12297q<? super T>) bVar);
    }
}
