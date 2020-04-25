package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.TimeUnit;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p443f1.C12274e;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.j0 */
/* compiled from: FlowableDelay */
public final class C12658j0<T> extends C12511a<T, T> {

    /* renamed from: N */
    final long f36251N;

    /* renamed from: O */
    final TimeUnit f36252O;

    /* renamed from: P */
    final C12282j0 f36253P;

    /* renamed from: Q */
    final boolean f36254Q;

    /* renamed from: e.a.x0.e.b.j0$a */
    /* compiled from: FlowableDelay */
    static final class C12659a<T> implements C12297q<T>, C14063d {

        /* renamed from: N */
        final TimeUnit f36255N;

        /* renamed from: O */
        final C12285c f36256O;

        /* renamed from: P */
        final boolean f36257P;

        /* renamed from: Q */
        C14063d f36258Q;

        /* renamed from: a */
        final C14062c<? super T> f36259a;

        /* renamed from: b */
        final long f36260b;

        /* renamed from: e.a.x0.e.b.j0$a$a */
        /* compiled from: FlowableDelay */
        final class C12660a implements Runnable {
            C12660a() {
            }

            public void run() {
                try {
                    C12659a.this.f36259a.onComplete();
                } finally {
                    C12659a.this.f36256O.dispose();
                }
            }
        }

        /* renamed from: e.a.x0.e.b.j0$a$b */
        /* compiled from: FlowableDelay */
        final class C12661b implements Runnable {

            /* renamed from: a */
            private final Throwable f36262a;

            C12661b(Throwable th) {
                this.f36262a = th;
            }

            public void run() {
                try {
                    C12659a.this.f36259a.onError(this.f36262a);
                } finally {
                    C12659a.this.f36256O.dispose();
                }
            }
        }

        /* renamed from: e.a.x0.e.b.j0$a$c */
        /* compiled from: FlowableDelay */
        final class C12662c implements Runnable {

            /* renamed from: a */
            private final T f36264a;

            C12662c(T t) {
                this.f36264a = t;
            }

            public void run() {
                C12659a.this.f36259a.mo41789a(this.f36264a);
            }
        }

        C12659a(C14062c<? super T> cVar, long j, TimeUnit timeUnit, C12285c cVar2, boolean z) {
            this.f36259a = cVar;
            this.f36260b = j;
            this.f36255N = timeUnit;
            this.f36256O = cVar2;
            this.f36257P = z;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36258Q, dVar)) {
                this.f36258Q = dVar;
                this.f36259a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f36258Q.mo41813c(j);
        }

        public void cancel() {
            this.f36258Q.cancel();
            this.f36256O.dispose();
        }

        public void onComplete() {
            this.f36256O.mo41877a(new C12660a(), this.f36260b, this.f36255N);
        }

        public void onError(Throwable th) {
            this.f36256O.mo41877a(new C12661b(th), this.f36257P ? this.f36260b : 0, this.f36255N);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f36256O.mo41877a(new C12662c(t), this.f36260b, this.f36255N);
        }
    }

    public C12658j0(C5929l<T> lVar, long j, TimeUnit timeUnit, C12282j0 j0Var, boolean z) {
        super(lVar);
        this.f36251N = j;
        this.f36252O = timeUnit;
        this.f36253P = j0Var;
        this.f36254Q = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C14062c<? super T> cVar2;
        if (this.f36254Q) {
            cVar2 = cVar;
        } else {
            cVar2 = new C12274e<>(cVar);
        }
        C12285c a = this.f36253P.mo41871a();
        C5929l<T> lVar = this.f35814b;
        C12659a aVar = new C12659a(cVar2, this.f36251N, this.f36252O, a, this.f36254Q);
        lVar.mo24393a((C12297q<? super T>) aVar);
    }
}
