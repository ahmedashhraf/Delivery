package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12292n0;
import p195e.p196a.C12297q;
import p195e.p196a.C5928k0;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p452c.C12393b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12342r;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.g */
/* compiled from: FlowableAllSingle */
public final class C12612g<T> extends C5928k0<Boolean> implements C12393b<Boolean> {

    /* renamed from: a */
    final C5929l<T> f36105a;

    /* renamed from: b */
    final C12342r<? super T> f36106b;

    /* renamed from: e.a.x0.e.b.g$a */
    /* compiled from: FlowableAllSingle */
    static final class C12613a<T> implements C12297q<T>, C12314c {

        /* renamed from: N */
        C14063d f36107N;

        /* renamed from: O */
        boolean f36108O;

        /* renamed from: a */
        final C12292n0<? super Boolean> f36109a;

        /* renamed from: b */
        final C12342r<? super T> f36110b;

        C12613a(C12292n0<? super Boolean> n0Var, C12342r<? super T> rVar) {
            this.f36109a = n0Var;
            this.f36110b = rVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36107N, dVar)) {
                this.f36107N = dVar;
                this.f36109a.mo41974a(this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f36107N == C13742j.CANCELLED;
        }

        public void dispose() {
            this.f36107N.cancel();
            this.f36107N = C13742j.CANCELLED;
        }

        public void onComplete() {
            if (!this.f36108O) {
                this.f36108O = true;
                this.f36107N = C13742j.CANCELLED;
                this.f36109a.onSuccess(Boolean.valueOf(true));
            }
        }

        public void onError(Throwable th) {
            if (this.f36108O) {
                C12205a.m54894b(th);
                return;
            }
            this.f36108O = true;
            this.f36107N = C13742j.CANCELLED;
            this.f36109a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36108O) {
                try {
                    if (!this.f36110b.mo41812b(t)) {
                        this.f36108O = true;
                        this.f36107N.cancel();
                        this.f36107N = C13742j.CANCELLED;
                        this.f36109a.onSuccess(Boolean.valueOf(false));
                    }
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f36107N.cancel();
                    this.f36107N = C13742j.CANCELLED;
                    onError(th);
                }
            }
        }
    }

    public C12612g(C5929l<T> lVar, C12342r<? super T> rVar) {
        this.f36105a = lVar;
        this.f36106b = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super Boolean> n0Var) {
        this.f36105a.mo24393a((C12297q<? super T>) new C12613a<Object>(n0Var, this.f36106b));
    }

    /* renamed from: b */
    public C5929l<Boolean> mo42139b() {
        return C12205a.m54871a((C5929l<T>) new C12590f<T>(this.f36105a, this.f36106b));
    }
}
