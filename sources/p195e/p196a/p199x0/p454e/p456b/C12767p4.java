package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicBoolean;
import p195e.p196a.C12282j0;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.p4 */
/* compiled from: FlowableUnsubscribeOn */
public final class C12767p4<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C12282j0 f36638N;

    /* renamed from: e.a.x0.e.b.p4$a */
    /* compiled from: FlowableUnsubscribeOn */
    static final class C12768a<T> extends AtomicBoolean implements C12297q<T>, C14063d {
        private static final long serialVersionUID = 1015244841293359600L;

        /* renamed from: N */
        C14063d f36639N;

        /* renamed from: a */
        final C14062c<? super T> f36640a;

        /* renamed from: b */
        final C12282j0 f36641b;

        /* renamed from: e.a.x0.e.b.p4$a$a */
        /* compiled from: FlowableUnsubscribeOn */
        final class C12769a implements Runnable {
            C12769a() {
            }

            public void run() {
                C12768a.this.f36639N.cancel();
            }
        }

        C12768a(C14062c<? super T> cVar, C12282j0 j0Var) {
            this.f36640a = cVar;
            this.f36641b = j0Var;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36639N, dVar)) {
                this.f36639N = dVar;
                this.f36640a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f36639N.mo41813c(j);
        }

        public void cancel() {
            if (compareAndSet(false, true)) {
                this.f36641b.mo42021a((Runnable) new C12769a());
            }
        }

        public void onComplete() {
            if (!get()) {
                this.f36640a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (get()) {
                C12205a.m54894b(th);
            } else {
                this.f36640a.onError(th);
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!get()) {
                this.f36640a.mo41789a(t);
            }
        }
    }

    public C12767p4(C5929l<T> lVar, C12282j0 j0Var) {
        super(lVar);
        this.f36638N = j0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12768a<Object>(cVar, this.f36638N));
    }
}
