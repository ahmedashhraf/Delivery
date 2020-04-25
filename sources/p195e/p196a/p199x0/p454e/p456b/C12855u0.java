package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C12321v;
import p195e.p196a.C5929l;
import p195e.p196a.C5931s;
import p195e.p196a.p199x0.p452c.C12393b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.u0 */
/* compiled from: FlowableElementAtMaybe */
public final class C12855u0<T> extends C5931s<T> implements C12393b<T> {

    /* renamed from: a */
    final C5929l<T> f36959a;

    /* renamed from: b */
    final long f36960b;

    /* renamed from: e.a.x0.e.b.u0$a */
    /* compiled from: FlowableElementAtMaybe */
    static final class C12856a<T> implements C12297q<T>, C12314c {

        /* renamed from: N */
        C14063d f36961N;

        /* renamed from: O */
        long f36962O;

        /* renamed from: P */
        boolean f36963P;

        /* renamed from: a */
        final C12321v<? super T> f36964a;

        /* renamed from: b */
        final long f36965b;

        C12856a(C12321v<? super T> vVar, long j) {
            this.f36964a = vVar;
            this.f36965b = j;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36961N, dVar)) {
                this.f36961N = dVar;
                this.f36964a.mo41931a(this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f36961N == C13742j.CANCELLED;
        }

        public void dispose() {
            this.f36961N.cancel();
            this.f36961N = C13742j.CANCELLED;
        }

        public void onComplete() {
            this.f36961N = C13742j.CANCELLED;
            if (!this.f36963P) {
                this.f36963P = true;
                this.f36964a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f36963P) {
                C12205a.m54894b(th);
                return;
            }
            this.f36963P = true;
            this.f36961N = C13742j.CANCELLED;
            this.f36964a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36963P) {
                long j = this.f36962O;
                if (j == this.f36965b) {
                    this.f36963P = true;
                    this.f36961N.cancel();
                    this.f36961N = C13742j.CANCELLED;
                    this.f36964a.onSuccess(t);
                    return;
                }
                this.f36962O = j + 1;
            }
        }
    }

    public C12855u0(C5929l<T> lVar, long j) {
        this.f36959a = lVar;
        this.f36960b = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f36959a.mo24393a((C12297q<? super T>) new C12856a<Object>(vVar, this.f36960b));
    }

    /* renamed from: b */
    public C5929l<T> mo42139b() {
        C12836t0 t0Var = new C12836t0(this.f36959a, this.f36960b, null, false);
        return C12205a.m54871a((C5929l<T>) t0Var);
    }
}
