package p195e.p196a.p199x0.p454e.p456b;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p440c1.C12223g;
import p205i.p211e.C14061a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.r4 */
/* compiled from: FlowableWindow */
public final class C12800r4<T> extends C12511a<T, C5929l<T>> {

    /* renamed from: N */
    final long f36765N;

    /* renamed from: O */
    final long f36766O;

    /* renamed from: P */
    final int f36767P;

    /* renamed from: e.a.x0.e.b.r4$a */
    /* compiled from: FlowableWindow */
    static final class C12801a<T> extends AtomicInteger implements C12297q<T>, C14063d, Runnable {
        private static final long serialVersionUID = -2365647875069161133L;

        /* renamed from: N */
        final AtomicBoolean f36768N = new AtomicBoolean();

        /* renamed from: O */
        final int f36769O;

        /* renamed from: P */
        long f36770P;

        /* renamed from: Q */
        C14063d f36771Q;

        /* renamed from: R */
        C12223g<T> f36772R;

        /* renamed from: a */
        final C14062c<? super C5929l<T>> f36773a;

        /* renamed from: b */
        final long f36774b;

        C12801a(C14062c<? super C5929l<T>> cVar, long j, int i) {
            super(1);
            this.f36773a = cVar;
            this.f36774b = j;
            this.f36769O = i;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36771Q, dVar)) {
                this.f36771Q = dVar;
                this.f36773a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                this.f36771Q.mo41813c(C13747d.m58697b(this.f36774b, j));
            }
        }

        public void cancel() {
            if (this.f36768N.compareAndSet(false, true)) {
                run();
            }
        }

        public void onComplete() {
            C12223g<T> gVar = this.f36772R;
            if (gVar != null) {
                this.f36772R = null;
                gVar.onComplete();
            }
            this.f36773a.onComplete();
        }

        public void onError(Throwable th) {
            C12223g<T> gVar = this.f36772R;
            if (gVar != null) {
                this.f36772R = null;
                gVar.onError(th);
            }
            this.f36773a.onError(th);
        }

        public void run() {
            if (decrementAndGet() == 0) {
                this.f36771Q.cancel();
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            long j = this.f36770P;
            C12223g<T> gVar = this.f36772R;
            if (j == 0) {
                getAndIncrement();
                gVar = C12223g.m55067a(this.f36769O, this);
                this.f36772R = gVar;
                this.f36773a.mo41789a(gVar);
            }
            long j2 = j + 1;
            gVar.mo41789a(t);
            if (j2 == this.f36774b) {
                this.f36770P = 0;
                this.f36772R = null;
                gVar.onComplete();
                return;
            }
            this.f36770P = j2;
        }
    }

    /* renamed from: e.a.x0.e.b.r4$b */
    /* compiled from: FlowableWindow */
    static final class C12802b<T> extends AtomicInteger implements C12297q<T>, C14063d, Runnable {
        private static final long serialVersionUID = 2428527070996323976L;

        /* renamed from: N */
        final long f36775N;

        /* renamed from: O */
        final long f36776O;

        /* renamed from: P */
        final ArrayDeque<C12223g<T>> f36777P = new ArrayDeque<>();

        /* renamed from: Q */
        final AtomicBoolean f36778Q = new AtomicBoolean();

        /* renamed from: R */
        final AtomicBoolean f36779R = new AtomicBoolean();

        /* renamed from: S */
        final AtomicLong f36780S = new AtomicLong();

        /* renamed from: T */
        final AtomicInteger f36781T = new AtomicInteger();

        /* renamed from: U */
        final int f36782U;

        /* renamed from: V */
        long f36783V;

        /* renamed from: W */
        long f36784W;

        /* renamed from: X */
        C14063d f36785X;

        /* renamed from: Y */
        volatile boolean f36786Y;

        /* renamed from: Z */
        Throwable f36787Z;

        /* renamed from: a */
        final C14062c<? super C5929l<T>> f36788a;

        /* renamed from: a0 */
        volatile boolean f36789a0;

        /* renamed from: b */
        final C13663c<C12223g<T>> f36790b;

        C12802b(C14062c<? super C5929l<T>> cVar, long j, long j2, int i) {
            super(1);
            this.f36788a = cVar;
            this.f36775N = j;
            this.f36776O = j2;
            this.f36790b = new C13663c<>(i);
            this.f36782U = i;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36785X, dVar)) {
                this.f36785X = dVar;
                this.f36788a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f36780S, j);
                if (this.f36779R.get() || !this.f36779R.compareAndSet(false, true)) {
                    this.f36785X.mo41813c(C13747d.m58697b(this.f36776O, j));
                } else {
                    this.f36785X.mo41813c(C13747d.m58695a(this.f36775N, C13747d.m58697b(this.f36776O, j - 1)));
                }
                mo42439a();
            }
        }

        public void cancel() {
            this.f36789a0 = true;
            if (this.f36778Q.compareAndSet(false, true)) {
                run();
            }
        }

        public void onComplete() {
            if (!this.f36786Y) {
                Iterator it = this.f36777P.iterator();
                while (it.hasNext()) {
                    ((C14061a) it.next()).onComplete();
                }
                this.f36777P.clear();
                this.f36786Y = true;
                mo42439a();
            }
        }

        public void onError(Throwable th) {
            if (this.f36786Y) {
                C12205a.m54894b(th);
                return;
            }
            Iterator it = this.f36777P.iterator();
            while (it.hasNext()) {
                ((C14061a) it.next()).onError(th);
            }
            this.f36777P.clear();
            this.f36787Z = th;
            this.f36786Y = true;
            mo42439a();
        }

        public void run() {
            if (decrementAndGet() == 0) {
                this.f36785X.cancel();
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36786Y) {
                long j = this.f36783V;
                if (j == 0 && !this.f36789a0) {
                    getAndIncrement();
                    C12223g a = C12223g.m55067a(this.f36782U, this);
                    this.f36777P.offer(a);
                    this.f36790b.offer(a);
                    mo42439a();
                }
                long j2 = j + 1;
                Iterator it = this.f36777P.iterator();
                while (it.hasNext()) {
                    ((C14061a) it.next()).mo41789a(t);
                }
                long j3 = this.f36784W + 1;
                if (j3 == this.f36775N) {
                    this.f36784W = j3 - this.f36776O;
                    C14061a aVar = (C14061a) this.f36777P.poll();
                    if (aVar != null) {
                        aVar.onComplete();
                    }
                } else {
                    this.f36784W = j3;
                }
                if (j2 == this.f36776O) {
                    this.f36783V = 0;
                } else {
                    this.f36783V = j2;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42439a() {
            if (this.f36781T.getAndIncrement() == 0) {
                C14062c<? super C5929l<T>> cVar = this.f36788a;
                C13663c<C12223g<T>> cVar2 = this.f36790b;
                int i = 1;
                do {
                    long j = this.f36780S.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.f36786Y;
                        C12223g gVar = (C12223g) cVar2.poll();
                        boolean z2 = gVar == null;
                        if (!mo42440a(z, z2, cVar, cVar2)) {
                            if (z2) {
                                break;
                            }
                            cVar.mo41789a(gVar);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 != j || !mo42440a(this.f36786Y, cVar2.isEmpty(), cVar, cVar2)) {
                        if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                            this.f36780S.addAndGet(-j2);
                        }
                        i = this.f36781T.addAndGet(-i);
                    } else {
                        return;
                    }
                } while (i != 0);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42440a(boolean z, boolean z2, C14062c<?> cVar, C13663c<?> cVar2) {
            if (this.f36789a0) {
                cVar2.clear();
                return true;
            }
            if (z) {
                Throwable th = this.f36787Z;
                if (th != null) {
                    cVar2.clear();
                    cVar.onError(th);
                    return true;
                } else if (z2) {
                    cVar.onComplete();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: e.a.x0.e.b.r4$c */
    /* compiled from: FlowableWindow */
    static final class C12803c<T> extends AtomicInteger implements C12297q<T>, C14063d, Runnable {
        private static final long serialVersionUID = -8792836352386833856L;

        /* renamed from: N */
        final long f36791N;

        /* renamed from: O */
        final AtomicBoolean f36792O = new AtomicBoolean();

        /* renamed from: P */
        final AtomicBoolean f36793P = new AtomicBoolean();

        /* renamed from: Q */
        final int f36794Q;

        /* renamed from: R */
        long f36795R;

        /* renamed from: S */
        C14063d f36796S;

        /* renamed from: T */
        C12223g<T> f36797T;

        /* renamed from: a */
        final C14062c<? super C5929l<T>> f36798a;

        /* renamed from: b */
        final long f36799b;

        C12803c(C14062c<? super C5929l<T>> cVar, long j, long j2, int i) {
            super(1);
            this.f36798a = cVar;
            this.f36799b = j;
            this.f36791N = j2;
            this.f36794Q = i;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36796S, dVar)) {
                this.f36796S = dVar;
                this.f36798a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (!C13742j.m58678b(j)) {
                return;
            }
            if (this.f36793P.get() || !this.f36793P.compareAndSet(false, true)) {
                this.f36796S.mo41813c(C13747d.m58697b(this.f36791N, j));
                return;
            }
            this.f36796S.mo41813c(C13747d.m58695a(C13747d.m58697b(this.f36799b, j), C13747d.m58697b(this.f36791N - this.f36799b, j - 1)));
        }

        public void cancel() {
            if (this.f36792O.compareAndSet(false, true)) {
                run();
            }
        }

        public void onComplete() {
            C12223g<T> gVar = this.f36797T;
            if (gVar != null) {
                this.f36797T = null;
                gVar.onComplete();
            }
            this.f36798a.onComplete();
        }

        public void onError(Throwable th) {
            C12223g<T> gVar = this.f36797T;
            if (gVar != null) {
                this.f36797T = null;
                gVar.onError(th);
            }
            this.f36798a.onError(th);
        }

        public void run() {
            if (decrementAndGet() == 0) {
                this.f36796S.cancel();
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            long j = this.f36795R;
            C12223g<T> gVar = this.f36797T;
            if (j == 0) {
                getAndIncrement();
                gVar = C12223g.m55067a(this.f36794Q, this);
                this.f36797T = gVar;
                this.f36798a.mo41789a(gVar);
            }
            long j2 = j + 1;
            if (gVar != null) {
                gVar.mo41789a(t);
            }
            if (j2 == this.f36799b) {
                this.f36797T = null;
                gVar.onComplete();
            }
            if (j2 == this.f36791N) {
                this.f36795R = 0;
            } else {
                this.f36795R = j2;
            }
        }
    }

    public C12800r4(C5929l<T> lVar, long j, long j2, int i) {
        super(lVar);
        this.f36765N = j;
        this.f36766O = j2;
        this.f36767P = i;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super C5929l<T>> cVar) {
        long j = this.f36766O;
        long j2 = this.f36765N;
        if (j == j2) {
            this.f35814b.mo24393a((C12297q<? super T>) new C12801a<Object>(cVar, j2, this.f36767P));
        } else if (j > j2) {
            C5929l<T> lVar = this.f35814b;
            C12803c cVar2 = new C12803c(cVar, j2, j, this.f36767P);
            lVar.mo24393a((C12297q<? super T>) cVar2);
        } else {
            C5929l<T> lVar2 = this.f35814b;
            C12802b bVar = new C12802b(cVar, j2, j, this.f36767P);
            lVar2.mo24393a((C12297q<? super T>) bVar);
        }
    }
}
