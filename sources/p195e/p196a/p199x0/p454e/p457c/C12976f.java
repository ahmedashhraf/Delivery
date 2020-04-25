package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12321v;
import p195e.p196a.C5929l;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.c.f */
/* compiled from: MaybeConcatArrayDelayError */
public final class C12976f<T> extends C5929l<T> {

    /* renamed from: b */
    final C5941y<? extends T>[] f37421b;

    /* renamed from: e.a.x0.e.c.f$a */
    /* compiled from: MaybeConcatArrayDelayError */
    static final class C12977a<T> extends AtomicInteger implements C12321v<T>, C14063d {
        private static final long serialVersionUID = 3520831347801429610L;

        /* renamed from: N */
        final AtomicReference<Object> f37422N = new AtomicReference<>(C13761q.COMPLETE);

        /* renamed from: O */
        final C12350g f37423O = new C12350g();

        /* renamed from: P */
        final C5941y<? extends T>[] f37424P;

        /* renamed from: Q */
        final C13746c f37425Q = new C13746c();

        /* renamed from: R */
        int f37426R;

        /* renamed from: S */
        long f37427S;

        /* renamed from: a */
        final C14062c<? super T> f37428a;

        /* renamed from: b */
        final AtomicLong f37429b = new AtomicLong();

        C12977a(C14062c<? super T> cVar, C5941y<? extends T>[] yVarArr) {
            this.f37428a = cVar;
            this.f37424P = yVarArr;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            this.f37423O.mo42109a(cVar);
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f37429b, j);
                mo42566a();
            }
        }

        public void cancel() {
            this.f37423O.dispose();
        }

        public void onComplete() {
            this.f37422N.lazySet(C13761q.COMPLETE);
            mo42566a();
        }

        public void onError(Throwable th) {
            this.f37422N.lazySet(C13761q.COMPLETE);
            if (this.f37425Q.mo43142a(th)) {
                mo42566a();
            } else {
                C12205a.m54894b(th);
            }
        }

        public void onSuccess(T t) {
            this.f37422N.lazySet(t);
            mo42566a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42566a() {
            if (getAndIncrement() == 0) {
                AtomicReference<Object> atomicReference = this.f37422N;
                C14062c<? super T> cVar = this.f37428a;
                C12350g gVar = this.f37423O;
                while (!gVar.mo41878d()) {
                    Object obj = atomicReference.get();
                    if (obj != null) {
                        boolean z = true;
                        if (obj != C13761q.COMPLETE) {
                            long j = this.f37427S;
                            if (j != this.f37429b.get()) {
                                this.f37427S = j + 1;
                                atomicReference.lazySet(null);
                                cVar.mo41789a(obj);
                            } else {
                                z = false;
                            }
                        } else {
                            atomicReference.lazySet(null);
                        }
                        if (z && !gVar.mo41878d()) {
                            int i = this.f37426R;
                            C5941y<? extends T>[] yVarArr = this.f37424P;
                            if (i == yVarArr.length) {
                                if (((Throwable) this.f37425Q.get()) != null) {
                                    cVar.onError(this.f37425Q.mo43143d());
                                } else {
                                    cVar.onComplete();
                                }
                                return;
                            }
                            this.f37426R = i + 1;
                            yVarArr[i].mo24639a(this);
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                atomicReference.lazySet(null);
            }
        }
    }

    public C12976f(C5941y<? extends T>[] yVarArr) {
        this.f37421b = yVarArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C12977a aVar = new C12977a(cVar, this.f37421b);
        cVar.mo41788a((C14063d) aVar);
        aVar.mo42566a();
    }
}
