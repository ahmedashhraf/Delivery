package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.o2 */
/* compiled from: FlowableOnBackpressureLatest */
public final class C12750o2<T> extends C12511a<T, T> {

    /* renamed from: e.a.x0.e.b.o2$a */
    /* compiled from: FlowableOnBackpressureLatest */
    static final class C12751a<T> extends AtomicInteger implements C12297q<T>, C14063d {
        private static final long serialVersionUID = 163080509307634843L;

        /* renamed from: N */
        volatile boolean f36599N;

        /* renamed from: O */
        Throwable f36600O;

        /* renamed from: P */
        volatile boolean f36601P;

        /* renamed from: Q */
        final AtomicLong f36602Q = new AtomicLong();

        /* renamed from: R */
        final AtomicReference<T> f36603R = new AtomicReference<>();

        /* renamed from: a */
        final C14062c<? super T> f36604a;

        /* renamed from: b */
        C14063d f36605b;

        C12751a(C14062c<? super T> cVar) {
            this.f36604a = cVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36605b, dVar)) {
                this.f36605b = dVar;
                this.f36604a.mo41788a((C14063d) this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f36602Q, j);
                mo42411a();
            }
        }

        public void cancel() {
            if (!this.f36601P) {
                this.f36601P = true;
                this.f36605b.cancel();
                if (getAndIncrement() == 0) {
                    this.f36603R.lazySet(null);
                }
            }
        }

        public void onComplete() {
            this.f36599N = true;
            mo42411a();
        }

        public void onError(Throwable th) {
            this.f36600O = th;
            this.f36599N = true;
            mo42411a();
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f36603R.lazySet(t);
            mo42411a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42411a() {
            boolean z;
            if (getAndIncrement() == 0) {
                C14062c<? super T> cVar = this.f36604a;
                AtomicLong atomicLong = this.f36602Q;
                AtomicReference<T> atomicReference = this.f36603R;
                int i = 1;
                do {
                    long j = 0;
                    while (true) {
                        z = false;
                        if (j == atomicLong.get()) {
                            break;
                        }
                        boolean z2 = this.f36599N;
                        Object andSet = atomicReference.getAndSet(null);
                        boolean z3 = andSet == null;
                        if (!mo42412a(z2, z3, cVar, atomicReference)) {
                            if (z3) {
                                break;
                            }
                            cVar.mo41789a(andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        boolean z4 = this.f36599N;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (mo42412a(z4, z, cVar, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        C13747d.m58699c(atomicLong, j);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42412a(boolean z, boolean z2, C14062c<?> cVar, AtomicReference<T> atomicReference) {
            if (this.f36601P) {
                atomicReference.lazySet(null);
                return true;
            }
            if (z) {
                Throwable th = this.f36600O;
                if (th != null) {
                    atomicReference.lazySet(null);
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

    public C12750o2(C5929l<T> lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12751a<Object>(cVar));
    }
}
