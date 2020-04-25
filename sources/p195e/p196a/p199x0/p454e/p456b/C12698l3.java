package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12405n;
import p195e.p196a.p199x0.p462f.C13662b;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12327c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.l3 */
/* compiled from: FlowableScanSeed */
public final class C12698l3<T, R> extends C12511a<T, R> {

    /* renamed from: N */
    final C12327c<R, ? super T, R> f36371N;

    /* renamed from: O */
    final Callable<R> f36372O;

    /* renamed from: e.a.x0.e.b.l3$a */
    /* compiled from: FlowableScanSeed */
    static final class C12699a<T, R> extends AtomicInteger implements C12297q<T>, C14063d {
        private static final long serialVersionUID = -1776795561228106469L;

        /* renamed from: N */
        final C12405n<R> f36373N;

        /* renamed from: O */
        final AtomicLong f36374O = new AtomicLong();

        /* renamed from: P */
        final int f36375P;

        /* renamed from: Q */
        final int f36376Q;

        /* renamed from: R */
        volatile boolean f36377R;

        /* renamed from: S */
        volatile boolean f36378S;

        /* renamed from: T */
        Throwable f36379T;

        /* renamed from: U */
        C14063d f36380U;

        /* renamed from: V */
        R f36381V;

        /* renamed from: W */
        int f36382W;

        /* renamed from: a */
        final C14062c<? super R> f36383a;

        /* renamed from: b */
        final C12327c<R, ? super T, R> f36384b;

        C12699a(C14062c<? super R> cVar, C12327c<R, ? super T, R> cVar2, R r, int i) {
            this.f36383a = cVar;
            this.f36384b = cVar2;
            this.f36381V = r;
            this.f36375P = i;
            this.f36376Q = i - (i >> 2);
            this.f36373N = new C13662b(i);
            this.f36373N.offer(r);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36380U, dVar)) {
                this.f36380U = dVar;
                this.f36383a.mo41788a((C14063d) this);
                dVar.mo41813c((long) (this.f36375P - 1));
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f36374O, j);
                mo42362a();
            }
        }

        public void cancel() {
            this.f36377R = true;
            this.f36380U.cancel();
            if (getAndIncrement() == 0) {
                this.f36373N.clear();
            }
        }

        public void onComplete() {
            if (!this.f36378S) {
                this.f36378S = true;
                mo42362a();
            }
        }

        public void onError(Throwable th) {
            if (this.f36378S) {
                C12205a.m54894b(th);
                return;
            }
            this.f36379T = th;
            this.f36378S = true;
            mo42362a();
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36378S) {
                try {
                    R a = C12390b.m55563a(this.f36384b.mo35569a(this.f36381V, t), "The accumulator returned a null value");
                    this.f36381V = a;
                    this.f36373N.offer(a);
                    mo42362a();
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f36380U.cancel();
                    onError(th);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42362a() {
            if (getAndIncrement() == 0) {
                C14062c<? super R> cVar = this.f36383a;
                C12405n<R> nVar = this.f36373N;
                int i = this.f36376Q;
                int i2 = this.f36382W;
                int i3 = 1;
                do {
                    long j = this.f36374O.get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (this.f36377R) {
                            nVar.clear();
                            return;
                        }
                        boolean z = this.f36378S;
                        if (z) {
                            Throwable th = this.f36379T;
                            if (th != null) {
                                nVar.clear();
                                cVar.onError(th);
                                return;
                            }
                        }
                        Object poll = nVar.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            cVar.onComplete();
                            return;
                        } else if (z2) {
                            break;
                        } else {
                            cVar.mo41789a(poll);
                            j2++;
                            i2++;
                            if (i2 == i) {
                                this.f36380U.mo41813c((long) i);
                                i2 = 0;
                            }
                        }
                    }
                    if (j2 == j && this.f36378S) {
                        Throwable th2 = this.f36379T;
                        if (th2 != null) {
                            nVar.clear();
                            cVar.onError(th2);
                            return;
                        } else if (nVar.isEmpty()) {
                            cVar.onComplete();
                            return;
                        }
                    }
                    if (j2 != 0) {
                        C13747d.m58699c(this.f36374O, j2);
                    }
                    this.f36382W = i2;
                    i3 = addAndGet(-i3);
                } while (i3 != 0);
            }
        }
    }

    public C12698l3(C5929l<T> lVar, Callable<R> callable, C12327c<R, ? super T, R> cVar) {
        super(lVar);
        this.f36371N = cVar;
        this.f36372O = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super R> cVar) {
        try {
            this.f35814b.mo24393a((C12297q<? super T>) new C12699a<Object>(cVar, this.f36371N, C12390b.m55563a(this.f36372O.call(), "The seed supplied is null"), C5929l.m26793R()));
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C13739g.m58655a(th, cVar);
        }
    }
}
