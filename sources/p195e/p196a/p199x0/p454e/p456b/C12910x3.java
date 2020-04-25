package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;

/* renamed from: e.a.x0.e.b.x3 */
/* compiled from: FlowableSubscribeOn */
public final class C12910x3<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C12282j0 f37188N;

    /* renamed from: O */
    final boolean f37189O;

    /* renamed from: e.a.x0.e.b.x3$a */
    /* compiled from: FlowableSubscribeOn */
    static final class C12911a<T> extends AtomicReference<Thread> implements C12297q<T>, C14063d, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;

        /* renamed from: N */
        final AtomicReference<C14063d> f37190N = new AtomicReference<>();

        /* renamed from: O */
        final AtomicLong f37191O = new AtomicLong();

        /* renamed from: P */
        final boolean f37192P;

        /* renamed from: Q */
        C6007b<T> f37193Q;

        /* renamed from: a */
        final C14062c<? super T> f37194a;

        /* renamed from: b */
        final C12285c f37195b;

        /* renamed from: e.a.x0.e.b.x3$a$a */
        /* compiled from: FlowableSubscribeOn */
        static final class C12912a implements Runnable {

            /* renamed from: a */
            private final C14063d f37196a;

            /* renamed from: b */
            private final long f37197b;

            C12912a(C14063d dVar, long j) {
                this.f37196a = dVar;
                this.f37197b = j;
            }

            public void run() {
                this.f37196a.mo41813c(this.f37197b);
            }
        }

        C12911a(C14062c<? super T> cVar, C12285c cVar2, C6007b<T> bVar, boolean z) {
            this.f37194a = cVar;
            this.f37195b = cVar2;
            this.f37193Q = bVar;
            this.f37192P = !z;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58680c(this.f37190N, dVar)) {
                long andSet = this.f37191O.getAndSet(0);
                if (andSet != 0) {
                    mo42524a(andSet, dVar);
                }
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C14063d dVar = (C14063d) this.f37190N.get();
                if (dVar != null) {
                    mo42524a(j, dVar);
                    return;
                }
                C13747d.m58696a(this.f37191O, j);
                C14063d dVar2 = (C14063d) this.f37190N.get();
                if (dVar2 != null) {
                    long andSet = this.f37191O.getAndSet(0);
                    if (andSet != 0) {
                        mo42524a(andSet, dVar2);
                    }
                }
            }
        }

        public void cancel() {
            C13742j.m58674a(this.f37190N);
            this.f37195b.dispose();
        }

        public void onComplete() {
            this.f37194a.onComplete();
            this.f37195b.dispose();
        }

        public void onError(Throwable th) {
            this.f37194a.onError(th);
            this.f37195b.dispose();
        }

        public void run() {
            lazySet(Thread.currentThread());
            C6007b<T> bVar = this.f37193Q;
            this.f37193Q = null;
            bVar.mo24397a(this);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f37194a.mo41789a(t);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42524a(long j, C14063d dVar) {
            if (this.f37192P || Thread.currentThread() == get()) {
                dVar.mo41813c(j);
            } else {
                this.f37195b.mo41876a((Runnable) new C12912a(dVar, j));
            }
        }
    }

    public C12910x3(C5929l<T> lVar, C12282j0 j0Var, boolean z) {
        super(lVar);
        this.f37188N = j0Var;
        this.f37189O = z;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C12285c a = this.f37188N.mo41871a();
        C12911a aVar = new C12911a(cVar, a, this.f35814b, this.f37189O);
        cVar.mo41788a((C14063d) aVar);
        a.mo41876a((Runnable) aVar);
    }
}
