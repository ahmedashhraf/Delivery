package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12321v;
import p195e.p196a.C5929l;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.c.e */
/* compiled from: MaybeConcatArray */
public final class C12968e<T> extends C5929l<T> {

    /* renamed from: b */
    final C5941y<? extends T>[] f37401b;

    /* renamed from: e.a.x0.e.c.e$a */
    /* compiled from: MaybeConcatArray */
    static final class C12969a<T> extends AtomicInteger implements C12321v<T>, C14063d {
        private static final long serialVersionUID = 3520831347801429610L;

        /* renamed from: N */
        final AtomicReference<Object> f37402N = new AtomicReference<>(C13761q.COMPLETE);

        /* renamed from: O */
        final C12350g f37403O = new C12350g();

        /* renamed from: P */
        final C5941y<? extends T>[] f37404P;

        /* renamed from: Q */
        int f37405Q;

        /* renamed from: R */
        long f37406R;

        /* renamed from: a */
        final C14062c<? super T> f37407a;

        /* renamed from: b */
        final AtomicLong f37408b = new AtomicLong();

        C12969a(C14062c<? super T> cVar, C5941y<? extends T>[] yVarArr) {
            this.f37407a = cVar;
            this.f37404P = yVarArr;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            this.f37403O.mo42109a(cVar);
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f37408b, j);
                mo42565a();
            }
        }

        public void cancel() {
            this.f37403O.dispose();
        }

        public void onComplete() {
            this.f37402N.lazySet(C13761q.COMPLETE);
            mo42565a();
        }

        public void onError(Throwable th) {
            this.f37407a.onError(th);
        }

        public void onSuccess(T t) {
            this.f37402N.lazySet(t);
            mo42565a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42565a() {
            if (getAndIncrement() == 0) {
                AtomicReference<Object> atomicReference = this.f37402N;
                C14062c<? super T> cVar = this.f37407a;
                C12350g gVar = this.f37403O;
                while (!gVar.mo41878d()) {
                    Object obj = atomicReference.get();
                    if (obj != null) {
                        boolean z = true;
                        if (obj != C13761q.COMPLETE) {
                            long j = this.f37406R;
                            if (j != this.f37408b.get()) {
                                this.f37406R = j + 1;
                                atomicReference.lazySet(null);
                                cVar.mo41789a(obj);
                            } else {
                                z = false;
                            }
                        } else {
                            atomicReference.lazySet(null);
                        }
                        if (z && !gVar.mo41878d()) {
                            int i = this.f37405Q;
                            C5941y<? extends T>[] yVarArr = this.f37404P;
                            if (i == yVarArr.length) {
                                cVar.onComplete();
                                return;
                            } else {
                                this.f37405Q = i + 1;
                                yVarArr[i].mo24639a(this);
                            }
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

    public C12968e(C5941y<? extends T>[] yVarArr) {
        this.f37401b = yVarArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C12969a aVar = new C12969a(cVar, this.f37401b);
        cVar.mo41788a((C14063d) aVar);
        aVar.mo42565a();
    }
}
