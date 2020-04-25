package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicLong;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.n2 */
/* compiled from: FlowableOnBackpressureError */
public final class C12733n2<T> extends C12511a<T, T> {

    /* renamed from: e.a.x0.e.b.n2$a */
    /* compiled from: FlowableOnBackpressureError */
    static final class C12734a<T> extends AtomicLong implements C12297q<T>, C14063d {
        private static final long serialVersionUID = -3176480756392482682L;

        /* renamed from: N */
        boolean f36537N;

        /* renamed from: a */
        final C14062c<? super T> f36538a;

        /* renamed from: b */
        C14063d f36539b;

        C12734a(C14062c<? super T> cVar) {
            this.f36538a = cVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36539b, dVar)) {
                this.f36539b = dVar;
                this.f36538a.mo41788a((C14063d) this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a((AtomicLong) this, j);
            }
        }

        public void cancel() {
            this.f36539b.cancel();
        }

        public void onComplete() {
            if (!this.f36537N) {
                this.f36537N = true;
                this.f36538a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f36537N) {
                C12205a.m54894b(th);
                return;
            }
            this.f36537N = true;
            this.f36538a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36537N) {
                if (get() != 0) {
                    this.f36538a.mo41789a(t);
                    C13747d.m58699c(this, 1);
                } else {
                    onError(new MissingBackpressureException("could not emit value due to lack of requests"));
                }
            }
        }
    }

    public C12733n2(C5929l<T> lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12734a<Object>(cVar));
    }
}
