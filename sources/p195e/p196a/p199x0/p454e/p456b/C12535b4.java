package p195e.p196a.p199x0.p454e.p456b;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.b4 */
/* compiled from: FlowableTakeLast */
public final class C12535b4<T> extends C12511a<T, T> {

    /* renamed from: N */
    final int f35884N;

    /* renamed from: e.a.x0.e.b.b4$a */
    /* compiled from: FlowableTakeLast */
    static final class C12536a<T> extends ArrayDeque<T> implements C12297q<T>, C14063d {
        private static final long serialVersionUID = 7240042530241604978L;

        /* renamed from: N */
        C14063d f35885N;

        /* renamed from: O */
        volatile boolean f35886O;

        /* renamed from: P */
        volatile boolean f35887P;

        /* renamed from: Q */
        final AtomicLong f35888Q = new AtomicLong();

        /* renamed from: R */
        final AtomicInteger f35889R = new AtomicInteger();

        /* renamed from: a */
        final C14062c<? super T> f35890a;

        /* renamed from: b */
        final int f35891b;

        C12536a(C14062c<? super T> cVar, int i) {
            this.f35890a = cVar;
            this.f35891b = i;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f35885N, dVar)) {
                this.f35885N = dVar;
                this.f35890a.mo41788a((C14063d) this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f35888Q, j);
                mo42228e();
            }
        }

        public void cancel() {
            this.f35887P = true;
            this.f35885N.cancel();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42228e() {
            if (this.f35889R.getAndIncrement() == 0) {
                C14062c<? super T> cVar = this.f35890a;
                long j = this.f35888Q.get();
                while (!this.f35887P) {
                    if (this.f35886O) {
                        long j2 = 0;
                        while (j2 != j) {
                            if (!this.f35887P) {
                                Object poll = poll();
                                if (poll == null) {
                                    cVar.onComplete();
                                    return;
                                } else {
                                    cVar.mo41789a(poll);
                                    j2++;
                                }
                            } else {
                                return;
                            }
                        }
                        if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                            j = this.f35888Q.addAndGet(-j2);
                        }
                    }
                    if (this.f35889R.decrementAndGet() == 0) {
                    }
                }
            }
        }

        public void onComplete() {
            this.f35886O = true;
            mo42228e();
        }

        public void onError(Throwable th) {
            this.f35890a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (this.f35891b == size()) {
                poll();
            }
            offer(t);
        }
    }

    public C12535b4(C5929l<T> lVar, int i) {
        super(lVar);
        this.f35884N = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12536a<Object>(cVar, this.f35884N));
    }
}
