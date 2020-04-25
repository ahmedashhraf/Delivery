package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p462f.C13660a;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p440c1.C12223g;
import p195e.p196a.p443f1.C12271b;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.u4 */
/* compiled from: FlowableWindowBoundarySupplier */
public final class C12865u4<T, B> extends C12511a<T, C5929l<T>> {

    /* renamed from: N */
    final Callable<? extends C6007b<B>> f36999N;

    /* renamed from: O */
    final int f37000O;

    /* renamed from: e.a.x0.e.b.u4$a */
    /* compiled from: FlowableWindowBoundarySupplier */
    static final class C12866a<T, B> extends C12271b<B> {

        /* renamed from: N */
        boolean f37001N;

        /* renamed from: b */
        final C12867b<T, B> f37002b;

        C12866a(C12867b<T, B> bVar) {
            this.f37002b = bVar;
        }

        /* renamed from: a */
        public void mo41789a(B b) {
            if (!this.f37001N) {
                this.f37001N = true;
                dispose();
                this.f37002b.mo42491a(this);
            }
        }

        public void onComplete() {
            if (!this.f37001N) {
                this.f37001N = true;
                this.f37002b.mo42494e();
            }
        }

        public void onError(Throwable th) {
            if (this.f37001N) {
                C12205a.m54894b(th);
                return;
            }
            this.f37001N = true;
            this.f37002b.mo42492a(th);
        }
    }

    /* renamed from: e.a.x0.e.b.u4$b */
    /* compiled from: FlowableWindowBoundarySupplier */
    static final class C12867b<T, B> extends AtomicInteger implements C12297q<T>, C14063d, Runnable {

        /* renamed from: Y */
        static final C12866a<Object, Object> f37003Y = new C12866a<>(null);

        /* renamed from: Z */
        static final Object f37004Z = new Object();
        private static final long serialVersionUID = 2233020065421370272L;

        /* renamed from: N */
        final AtomicReference<C12866a<T, B>> f37005N = new AtomicReference<>();

        /* renamed from: O */
        final AtomicInteger f37006O = new AtomicInteger(1);

        /* renamed from: P */
        final C13660a<Object> f37007P = new C13660a<>();

        /* renamed from: Q */
        final C13746c f37008Q = new C13746c();

        /* renamed from: R */
        final AtomicBoolean f37009R = new AtomicBoolean();

        /* renamed from: S */
        final Callable<? extends C6007b<B>> f37010S;

        /* renamed from: T */
        final AtomicLong f37011T;

        /* renamed from: U */
        C14063d f37012U;

        /* renamed from: V */
        volatile boolean f37013V;

        /* renamed from: W */
        C12223g<T> f37014W;

        /* renamed from: X */
        long f37015X;

        /* renamed from: a */
        final C14062c<? super C5929l<T>> f37016a;

        /* renamed from: b */
        final int f37017b;

        C12867b(C14062c<? super C5929l<T>> cVar, int i, Callable<? extends C6007b<B>> callable) {
            this.f37016a = cVar;
            this.f37017b = i;
            this.f37010S = callable;
            this.f37011T = new AtomicLong();
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f37012U, dVar)) {
                this.f37012U = dVar;
                this.f37016a.mo41788a((C14063d) this);
                this.f37007P.offer(f37004Z);
                mo42493d();
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            C13747d.m58696a(this.f37011T, j);
        }

        public void cancel() {
            if (this.f37009R.compareAndSet(false, true)) {
                mo42490a();
                if (this.f37006O.decrementAndGet() == 0) {
                    this.f37012U.cancel();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42493d() {
            if (getAndIncrement() == 0) {
                C14062c<? super C5929l<T>> cVar = this.f37016a;
                C13660a<Object> aVar = this.f37007P;
                C13746c cVar2 = this.f37008Q;
                long j = this.f37015X;
                int i = 1;
                while (this.f37006O.get() != 0) {
                    C12223g<T> gVar = this.f37014W;
                    boolean z = this.f37013V;
                    if (!z || cVar2.get() == null) {
                        Object poll = aVar.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            Throwable d = cVar2.mo43143d();
                            if (d == null) {
                                if (gVar != null) {
                                    this.f37014W = null;
                                    gVar.onComplete();
                                }
                                cVar.onComplete();
                            } else {
                                if (gVar != null) {
                                    this.f37014W = null;
                                    gVar.onError(d);
                                }
                                cVar.onError(d);
                            }
                            return;
                        } else if (z2) {
                            this.f37015X = j;
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else if (poll != f37004Z) {
                            gVar.mo41789a(poll);
                        } else {
                            if (gVar != null) {
                                this.f37014W = null;
                                gVar.onComplete();
                            }
                            if (!this.f37009R.get()) {
                                if (j != this.f37011T.get()) {
                                    C12223g<T> a = C12223g.m55067a(this.f37017b, this);
                                    this.f37014W = a;
                                    this.f37006O.getAndIncrement();
                                    try {
                                        C6007b bVar = (C6007b) C12390b.m55563a(this.f37010S.call(), "The other Callable returned a null Publisher");
                                        C12866a aVar2 = new C12866a(this);
                                        if (this.f37005N.compareAndSet(null, aVar2)) {
                                            bVar.mo24397a(aVar2);
                                            j++;
                                            cVar.mo41789a(a);
                                        }
                                    } catch (Throwable th) {
                                        C14398a.m62357b(th);
                                        cVar2.mo43142a(th);
                                        this.f37013V = true;
                                    }
                                } else {
                                    this.f37012U.cancel();
                                    mo42490a();
                                    cVar2.mo43142a(new MissingBackpressureException("Could not deliver a window due to lack of requests"));
                                    this.f37013V = true;
                                }
                            }
                        }
                    } else {
                        aVar.clear();
                        Throwable d2 = cVar2.mo43143d();
                        if (gVar != null) {
                            this.f37014W = null;
                            gVar.onError(d2);
                        }
                        cVar.onError(d2);
                        return;
                    }
                }
                aVar.clear();
                this.f37014W = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42494e() {
            this.f37012U.cancel();
            this.f37013V = true;
            mo42493d();
        }

        public void onComplete() {
            mo42490a();
            this.f37013V = true;
            mo42493d();
        }

        public void onError(Throwable th) {
            mo42490a();
            if (this.f37008Q.mo43142a(th)) {
                this.f37013V = true;
                mo42493d();
                return;
            }
            C12205a.m54894b(th);
        }

        public void run() {
            if (this.f37006O.decrementAndGet() == 0) {
                this.f37012U.cancel();
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f37007P.offer(t);
            mo42493d();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42490a() {
            C12314c cVar = (C12314c) this.f37005N.getAndSet(f37003Y);
            if (cVar != null && cVar != f37003Y) {
                cVar.dispose();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42491a(C12866a<T, B> aVar) {
            this.f37005N.compareAndSet(aVar, null);
            this.f37007P.offer(f37004Z);
            mo42493d();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42492a(Throwable th) {
            this.f37012U.cancel();
            if (this.f37008Q.mo43142a(th)) {
                this.f37013V = true;
                mo42493d();
                return;
            }
            C12205a.m54894b(th);
        }
    }

    public C12865u4(C5929l<T> lVar, Callable<? extends C6007b<B>> callable, int i) {
        super(lVar);
        this.f36999N = callable;
        this.f37000O = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super C5929l<T>> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12867b<Object>(cVar, this.f37000O, this.f36999N));
    }
}
