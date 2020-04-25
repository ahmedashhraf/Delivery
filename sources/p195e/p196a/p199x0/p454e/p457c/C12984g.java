package p195e.p196a.p199x0.p454e.p457c;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12321v;
import p195e.p196a.C5929l;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.c.g */
/* compiled from: MaybeConcatIterable */
public final class C12984g<T> extends C5929l<T> {

    /* renamed from: b */
    final Iterable<? extends C5941y<? extends T>> f37440b;

    /* renamed from: e.a.x0.e.c.g$a */
    /* compiled from: MaybeConcatIterable */
    static final class C12985a<T> extends AtomicInteger implements C12321v<T>, C14063d {
        private static final long serialVersionUID = 3520831347801429610L;

        /* renamed from: N */
        final AtomicReference<Object> f37441N = new AtomicReference<>(C13761q.COMPLETE);

        /* renamed from: O */
        final C12350g f37442O = new C12350g();

        /* renamed from: P */
        final Iterator<? extends C5941y<? extends T>> f37443P;

        /* renamed from: Q */
        long f37444Q;

        /* renamed from: a */
        final C14062c<? super T> f37445a;

        /* renamed from: b */
        final AtomicLong f37446b = new AtomicLong();

        C12985a(C14062c<? super T> cVar, Iterator<? extends C5941y<? extends T>> it) {
            this.f37445a = cVar;
            this.f37443P = it;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            this.f37442O.mo42109a(cVar);
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f37446b, j);
                mo42569a();
            }
        }

        public void cancel() {
            this.f37442O.dispose();
        }

        public void onComplete() {
            this.f37441N.lazySet(C13761q.COMPLETE);
            mo42569a();
        }

        public void onError(Throwable th) {
            this.f37445a.onError(th);
        }

        public void onSuccess(T t) {
            this.f37441N.lazySet(t);
            mo42569a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42569a() {
            if (getAndIncrement() == 0) {
                AtomicReference<Object> atomicReference = this.f37441N;
                C14062c<? super T> cVar = this.f37445a;
                C12350g gVar = this.f37442O;
                while (!gVar.mo41878d()) {
                    Object obj = atomicReference.get();
                    if (obj != null) {
                        boolean z = true;
                        if (obj != C13761q.COMPLETE) {
                            long j = this.f37444Q;
                            if (j != this.f37446b.get()) {
                                this.f37444Q = j + 1;
                                atomicReference.lazySet(null);
                                cVar.mo41789a(obj);
                            } else {
                                z = false;
                            }
                        } else {
                            atomicReference.lazySet(null);
                        }
                        if (z && !gVar.mo41878d()) {
                            try {
                                if (this.f37443P.hasNext()) {
                                    try {
                                        ((C5941y) C12390b.m55563a(this.f37443P.next(), "The source Iterator returned a null MaybeSource")).mo24639a(this);
                                    } catch (Throwable th) {
                                        C14398a.m62357b(th);
                                        cVar.onError(th);
                                        return;
                                    }
                                } else {
                                    cVar.onComplete();
                                }
                            } catch (Throwable th2) {
                                C14398a.m62357b(th2);
                                cVar.onError(th2);
                                return;
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

    public C12984g(Iterable<? extends C5941y<? extends T>> iterable) {
        this.f37440b = iterable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        try {
            C12985a aVar = new C12985a(cVar, (Iterator) C12390b.m55563a(this.f37440b.iterator(), "The sources Iterable returned a null Iterator"));
            cVar.mo41788a((C14063d) aVar);
            aVar.mo42569a();
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C13739g.m58655a(th, cVar);
        }
    }
}
