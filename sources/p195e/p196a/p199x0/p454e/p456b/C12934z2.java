package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import p195e.p196a.C12297q;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p447u0.C12315d;
import p195e.p196a.p448v0.C12322a;
import p195e.p196a.p449w0.C12331g;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.z2 */
/* compiled from: FlowableRefCount */
public final class C12934z2<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C12322a<T> f37291N;

    /* renamed from: O */
    volatile C12313b f37292O = new C12313b();

    /* renamed from: P */
    final AtomicInteger f37293P = new AtomicInteger();

    /* renamed from: Q */
    final ReentrantLock f37294Q = new ReentrantLock();

    /* renamed from: e.a.x0.e.b.z2$a */
    /* compiled from: FlowableRefCount */
    final class C12935a extends AtomicReference<C14063d> implements C12297q<T>, C14063d {
        private static final long serialVersionUID = 152064694420235350L;

        /* renamed from: N */
        final C12314c f37295N;

        /* renamed from: O */
        final AtomicLong f37296O = new AtomicLong();

        /* renamed from: a */
        final C14062c<? super T> f37298a;

        /* renamed from: b */
        final C12313b f37299b;

        C12935a(C14062c<? super T> cVar, C12313b bVar, C12314c cVar2) {
            this.f37298a = cVar;
            this.f37299b = bVar;
            this.f37295N = cVar2;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58677a((AtomicReference<C14063d>) this, this.f37296O, dVar);
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            C13742j.m58671a((AtomicReference<C14063d>) this, this.f37296O, j);
        }

        public void cancel() {
            C13742j.m58674a((AtomicReference<C14063d>) this);
            this.f37295N.dispose();
        }

        public void onComplete() {
            mo42551a();
            this.f37298a.onComplete();
        }

        public void onError(Throwable th) {
            mo42551a();
            this.f37298a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f37298a.mo41789a(t);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42551a() {
            C12934z2.this.f37294Q.lock();
            try {
                if (C12934z2.this.f37292O == this.f37299b) {
                    if (C12934z2.this.f37291N instanceof C12314c) {
                        ((C12314c) C12934z2.this.f37291N).dispose();
                    }
                    C12934z2.this.f37292O.dispose();
                    C12934z2.this.f37292O = new C12313b();
                    C12934z2.this.f37293P.set(0);
                }
            } finally {
                C12934z2.this.f37294Q.unlock();
            }
        }
    }

    /* renamed from: e.a.x0.e.b.z2$b */
    /* compiled from: FlowableRefCount */
    final class C12936b implements C12331g<C12314c> {

        /* renamed from: a */
        private final C14062c<? super T> f37301a;

        /* renamed from: b */
        private final AtomicBoolean f37302b;

        C12936b(C14062c<? super T> cVar, AtomicBoolean atomicBoolean) {
            this.f37301a = cVar;
            this.f37302b = atomicBoolean;
        }

        /* renamed from: a */
        public void mo33410c(C12314c cVar) {
            try {
                C12934z2.this.f37292O.mo42072b(cVar);
                C12934z2.this.mo42550a(this.f37301a, C12934z2.this.f37292O);
            } finally {
                C12934z2.this.f37294Q.unlock();
                this.f37302b.set(false);
            }
        }
    }

    /* renamed from: e.a.x0.e.b.z2$c */
    /* compiled from: FlowableRefCount */
    final class C12937c implements Runnable {

        /* renamed from: a */
        private final C12313b f37303a;

        C12937c(C12313b bVar) {
            this.f37303a = bVar;
        }

        public void run() {
            C12934z2.this.f37294Q.lock();
            try {
                if (C12934z2.this.f37292O == this.f37303a && C12934z2.this.f37293P.decrementAndGet() == 0) {
                    if (C12934z2.this.f37291N instanceof C12314c) {
                        ((C12314c) C12934z2.this.f37291N).dispose();
                    }
                    C12934z2.this.f37292O.dispose();
                    C12934z2.this.f37292O = new C12313b();
                }
            } finally {
                C12934z2.this.f37294Q.unlock();
            }
        }
    }

    public C12934z2(C12322a<T> aVar) {
        super(aVar);
        this.f37291N = aVar;
    }

    /* renamed from: a */
    private C12331g<C12314c> m56828a(C14062c<? super T> cVar, AtomicBoolean atomicBoolean) {
        return new C12936b(cVar, atomicBoolean);
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f37294Q.lock();
        if (this.f37293P.incrementAndGet() == 1) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            try {
                this.f37291N.mo42084l(m56828a(cVar, atomicBoolean));
            } finally {
                if (atomicBoolean.get()) {
                    this.f37294Q.unlock();
                }
            }
        } else {
            try {
                mo42550a(cVar, this.f37292O);
            } finally {
                this.f37294Q.unlock();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo42550a(C14062c<? super T> cVar, C12313b bVar) {
        C12935a aVar = new C12935a(cVar, bVar, m56827a(bVar));
        cVar.mo41788a((C14063d) aVar);
        this.f37291N.mo24393a((C12297q<? super T>) aVar);
    }

    /* renamed from: a */
    private C12314c m56827a(C12313b bVar) {
        return C12315d.m55416a((Runnable) new C12937c(bVar));
    }
}
