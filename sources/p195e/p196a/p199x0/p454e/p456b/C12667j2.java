package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicLong;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p452c.C12392a;
import p195e.p196a.p199x0.p452c.C12403l;
import p195e.p196a.p199x0.p452c.C12406o;
import p195e.p196a.p199x0.p462f.C13662b;
import p195e.p196a.p199x0.p465i.C13735c;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.j2 */
/* compiled from: FlowableObserveOn */
public final class C12667j2<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C12282j0 f36272N;

    /* renamed from: O */
    final boolean f36273O;

    /* renamed from: P */
    final int f36274P;

    /* renamed from: e.a.x0.e.b.j2$a */
    /* compiled from: FlowableObserveOn */
    static abstract class C12668a<T> extends C13735c<T> implements C12297q<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;

        /* renamed from: N */
        final int f36275N;

        /* renamed from: O */
        final int f36276O;

        /* renamed from: P */
        final AtomicLong f36277P = new AtomicLong();

        /* renamed from: Q */
        C14063d f36278Q;

        /* renamed from: R */
        C12406o<T> f36279R;

        /* renamed from: S */
        volatile boolean f36280S;

        /* renamed from: T */
        volatile boolean f36281T;

        /* renamed from: U */
        Throwable f36282U;

        /* renamed from: V */
        int f36283V;

        /* renamed from: W */
        long f36284W;

        /* renamed from: X */
        boolean f36285X;

        /* renamed from: a */
        final C12285c f36286a;

        /* renamed from: b */
        final boolean f36287b;

        C12668a(C12285c cVar, boolean z, int i) {
            this.f36286a = cVar;
            this.f36287b = z;
            this.f36275N = i;
            this.f36276O = i - (i >> 2);
        }

        /* renamed from: a */
        public final void mo41789a(T t) {
            if (!this.f36281T) {
                if (this.f36283V == 2) {
                    mo42351g();
                    return;
                }
                if (!this.f36279R.offer(t)) {
                    this.f36278Q.cancel();
                    this.f36282U = new MissingBackpressureException("Queue is full?!");
                    this.f36281T = true;
                }
                mo42351g();
            }
        }

        /* renamed from: c */
        public final void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f36277P, j);
                mo42351g();
            }
        }

        public final void cancel() {
            if (!this.f36280S) {
                this.f36280S = true;
                this.f36278Q.cancel();
                this.f36286a.dispose();
                if (getAndIncrement() == 0) {
                    this.f36279R.clear();
                }
            }
        }

        public final void clear() {
            this.f36279R.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public abstract void mo42348d();

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public abstract void mo42349e();

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public abstract void mo42350f();

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public final void mo42351g() {
            if (getAndIncrement() == 0) {
                this.f36286a.mo41876a((Runnable) this);
            }
        }

        public final boolean isEmpty() {
            return this.f36279R.isEmpty();
        }

        public final void onComplete() {
            if (!this.f36281T) {
                this.f36281T = true;
                mo42351g();
            }
        }

        public final void onError(Throwable th) {
            if (this.f36281T) {
                C12205a.m54894b(th);
                return;
            }
            this.f36282U = th;
            this.f36281T = true;
            mo42351g();
        }

        public final void run() {
            if (this.f36285X) {
                mo42349e();
            } else if (this.f36283V == 1) {
                mo42350f();
            } else {
                mo42348d();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo42347a(boolean z, boolean z2, C14062c<?> cVar) {
            if (this.f36280S) {
                clear();
                return true;
            }
            if (z) {
                if (!this.f36287b) {
                    Throwable th = this.f36282U;
                    if (th != null) {
                        clear();
                        cVar.onError(th);
                        this.f36286a.dispose();
                        return true;
                    } else if (z2) {
                        cVar.onComplete();
                        this.f36286a.dispose();
                        return true;
                    }
                } else if (z2) {
                    Throwable th2 = this.f36282U;
                    if (th2 != null) {
                        cVar.onError(th2);
                    } else {
                        cVar.onComplete();
                    }
                    this.f36286a.dispose();
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final int mo41855a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f36285X = true;
            return 2;
        }
    }

    /* renamed from: e.a.x0.e.b.j2$b */
    /* compiled from: FlowableObserveOn */
    static final class C12669b<T> extends C12668a<T> {
        private static final long serialVersionUID = 644624475404284533L;

        /* renamed from: Y */
        final C12392a<? super T> f36288Y;

        /* renamed from: Z */
        long f36289Z;

        C12669b(C12392a<? super T> aVar, C12285c cVar, boolean z, int i) {
            super(cVar, z, i);
            this.f36288Y = aVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36278Q, dVar)) {
                this.f36278Q = dVar;
                if (dVar instanceof C12403l) {
                    C12403l lVar = (C12403l) dVar;
                    int a = lVar.mo41855a(7);
                    if (a == 1) {
                        this.f36283V = 1;
                        this.f36279R = lVar;
                        this.f36281T = true;
                        this.f36288Y.mo41788a(this);
                        return;
                    } else if (a == 2) {
                        this.f36283V = 2;
                        this.f36279R = lVar;
                        this.f36288Y.mo41788a(this);
                        dVar.mo41813c((long) this.f36275N);
                        return;
                    }
                }
                this.f36279R = new C13662b(this.f36275N);
                this.f36288Y.mo41788a(this);
                dVar.mo41813c((long) this.f36275N);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42348d() {
            C12392a<? super T> aVar = this.f36288Y;
            C12406o<T> oVar = this.f36279R;
            long j = this.f36284W;
            long j2 = this.f36289Z;
            int i = 1;
            while (true) {
                long j3 = this.f36277P.get();
                while (j != j3) {
                    boolean z = this.f36281T;
                    try {
                        Object poll = oVar.poll();
                        boolean z2 = poll == null;
                        if (!mo42347a(z, z2, aVar)) {
                            if (z2) {
                                break;
                            }
                            if (aVar.mo42138b(poll)) {
                                j++;
                            }
                            j2++;
                            if (j2 == ((long) this.f36276O)) {
                                this.f36278Q.mo41813c(j2);
                                j2 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        this.f36278Q.cancel();
                        oVar.clear();
                        aVar.onError(th);
                        this.f36286a.dispose();
                        return;
                    }
                }
                if (j != j3 || !mo42347a(this.f36281T, oVar.isEmpty(), aVar)) {
                    int i2 = get();
                    if (i == i2) {
                        this.f36284W = j;
                        this.f36289Z = j2;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42349e() {
            int i = 1;
            while (!this.f36280S) {
                boolean z = this.f36281T;
                this.f36288Y.mo41789a(null);
                if (z) {
                    Throwable th = this.f36282U;
                    if (th != null) {
                        this.f36288Y.onError(th);
                    } else {
                        this.f36288Y.onComplete();
                    }
                    this.f36286a.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo42350f() {
            C12392a<? super T> aVar = this.f36288Y;
            C12406o<T> oVar = this.f36279R;
            long j = this.f36284W;
            int i = 1;
            while (true) {
                long j2 = this.f36277P.get();
                while (j != j2) {
                    try {
                        Object poll = oVar.poll();
                        if (!this.f36280S) {
                            if (poll == null) {
                                aVar.onComplete();
                                this.f36286a.dispose();
                                return;
                            } else if (aVar.mo42138b(poll)) {
                                j++;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        this.f36278Q.cancel();
                        aVar.onError(th);
                        this.f36286a.dispose();
                        return;
                    }
                }
                if (!this.f36280S) {
                    if (oVar.isEmpty()) {
                        aVar.onComplete();
                        this.f36286a.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.f36284W = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        @C5938g
        public T poll() throws Exception {
            T poll = this.f36279R.poll();
            if (!(poll == null || this.f36283V == 1)) {
                long j = this.f36289Z + 1;
                if (j == ((long) this.f36276O)) {
                    this.f36289Z = 0;
                    this.f36278Q.mo41813c(j);
                } else {
                    this.f36289Z = j;
                }
            }
            return poll;
        }
    }

    /* renamed from: e.a.x0.e.b.j2$c */
    /* compiled from: FlowableObserveOn */
    static final class C12670c<T> extends C12668a<T> implements C12297q<T> {
        private static final long serialVersionUID = -4547113800637756442L;

        /* renamed from: Y */
        final C14062c<? super T> f36290Y;

        C12670c(C14062c<? super T> cVar, C12285c cVar2, boolean z, int i) {
            super(cVar2, z, i);
            this.f36290Y = cVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36278Q, dVar)) {
                this.f36278Q = dVar;
                if (dVar instanceof C12403l) {
                    C12403l lVar = (C12403l) dVar;
                    int a = lVar.mo41855a(7);
                    if (a == 1) {
                        this.f36283V = 1;
                        this.f36279R = lVar;
                        this.f36281T = true;
                        this.f36290Y.mo41788a((C14063d) this);
                        return;
                    } else if (a == 2) {
                        this.f36283V = 2;
                        this.f36279R = lVar;
                        this.f36290Y.mo41788a((C14063d) this);
                        dVar.mo41813c((long) this.f36275N);
                        return;
                    }
                }
                this.f36279R = new C13662b(this.f36275N);
                this.f36290Y.mo41788a((C14063d) this);
                dVar.mo41813c((long) this.f36275N);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42348d() {
            C14062c<? super T> cVar = this.f36290Y;
            C12406o<T> oVar = this.f36279R;
            long j = this.f36284W;
            int i = 1;
            while (true) {
                long j2 = this.f36277P.get();
                while (j != j2) {
                    boolean z = this.f36281T;
                    try {
                        Object poll = oVar.poll();
                        boolean z2 = poll == null;
                        if (!mo42347a(z, z2, cVar)) {
                            if (z2) {
                                break;
                            }
                            cVar.mo41789a(poll);
                            j++;
                            if (j == ((long) this.f36276O)) {
                                if (j2 != Long.MAX_VALUE) {
                                    j2 = this.f36277P.addAndGet(-j);
                                }
                                this.f36278Q.mo41813c(j);
                                j = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        this.f36278Q.cancel();
                        oVar.clear();
                        cVar.onError(th);
                        this.f36286a.dispose();
                        return;
                    }
                }
                if (j != j2 || !mo42347a(this.f36281T, oVar.isEmpty(), cVar)) {
                    int i2 = get();
                    if (i == i2) {
                        this.f36284W = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42349e() {
            int i = 1;
            while (!this.f36280S) {
                boolean z = this.f36281T;
                this.f36290Y.mo41789a(null);
                if (z) {
                    Throwable th = this.f36282U;
                    if (th != null) {
                        this.f36290Y.onError(th);
                    } else {
                        this.f36290Y.onComplete();
                    }
                    this.f36286a.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo42350f() {
            C14062c<? super T> cVar = this.f36290Y;
            C12406o<T> oVar = this.f36279R;
            long j = this.f36284W;
            int i = 1;
            while (true) {
                long j2 = this.f36277P.get();
                while (j != j2) {
                    try {
                        Object poll = oVar.poll();
                        if (!this.f36280S) {
                            if (poll == null) {
                                cVar.onComplete();
                                this.f36286a.dispose();
                                return;
                            }
                            cVar.mo41789a(poll);
                            j++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        this.f36278Q.cancel();
                        cVar.onError(th);
                        this.f36286a.dispose();
                        return;
                    }
                }
                if (!this.f36280S) {
                    if (oVar.isEmpty()) {
                        cVar.onComplete();
                        this.f36286a.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.f36284W = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        @C5938g
        public T poll() throws Exception {
            T poll = this.f36279R.poll();
            if (!(poll == null || this.f36283V == 1)) {
                long j = this.f36284W + 1;
                if (j == ((long) this.f36276O)) {
                    this.f36284W = 0;
                    this.f36278Q.mo41813c(j);
                } else {
                    this.f36284W = j;
                }
            }
            return poll;
        }
    }

    public C12667j2(C5929l<T> lVar, C12282j0 j0Var, boolean z, int i) {
        super(lVar);
        this.f36272N = j0Var;
        this.f36273O = z;
        this.f36274P = i;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C12285c a = this.f36272N.mo41871a();
        if (cVar instanceof C12392a) {
            this.f35814b.mo24393a((C12297q<? super T>) new C12669b<Object>((C12392a) cVar, a, this.f36273O, this.f36274P));
        } else {
            this.f35814b.mo24393a((C12297q<? super T>) new C12670c<Object>(cVar, a, this.f36273O, this.f36274P));
        }
    }
}
