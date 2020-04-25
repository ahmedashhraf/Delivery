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

/* renamed from: e.a.x0.e.b.j */
/* compiled from: FlowableAnySingle */
public final class C12656j<T> extends C5928k0<Boolean> implements C12393b<Boolean> {

    /* renamed from: a */
    final C5929l<T> f36245a;

    /* renamed from: b */
    final C12342r<? super T> f36246b;

    /* renamed from: e.a.x0.e.b.j$a */
    /* compiled from: FlowableAnySingle */
    static final class C12657a<T> implements C12297q<T>, C12314c {

        /* renamed from: N */
        C14063d f36247N;

        /* renamed from: O */
        boolean f36248O;

        /* renamed from: a */
        final C12292n0<? super Boolean> f36249a;

        /* renamed from: b */
        final C12342r<? super T> f36250b;

        C12657a(C12292n0<? super Boolean> n0Var, C12342r<? super T> rVar) {
            this.f36249a = n0Var;
            this.f36250b = rVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36247N, dVar)) {
                this.f36247N = dVar;
                this.f36249a.mo41974a(this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f36247N == C13742j.CANCELLED;
        }

        public void dispose() {
            this.f36247N.cancel();
            this.f36247N = C13742j.CANCELLED;
        }

        public void onComplete() {
            if (!this.f36248O) {
                this.f36248O = true;
                this.f36247N = C13742j.CANCELLED;
                this.f36249a.onSuccess(Boolean.valueOf(false));
            }
        }

        public void onError(Throwable th) {
            if (this.f36248O) {
                C12205a.m54894b(th);
                return;
            }
            this.f36248O = true;
            this.f36247N = C13742j.CANCELLED;
            this.f36249a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36248O) {
                try {
                    if (this.f36250b.mo41812b(t)) {
                        this.f36248O = true;
                        this.f36247N.cancel();
                        this.f36247N = C13742j.CANCELLED;
                        this.f36249a.onSuccess(Boolean.valueOf(true));
                    }
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f36247N.cancel();
                    this.f36247N = C13742j.CANCELLED;
                    onError(th);
                }
            }
        }
    }

    public C12656j(C5929l<T> lVar, C12342r<? super T> rVar) {
        this.f36245a = lVar;
        this.f36246b = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super Boolean> n0Var) {
        this.f36245a.mo24393a((C12297q<? super T>) new C12657a<Object>(n0Var, this.f36246b));
    }

    /* renamed from: b */
    public C5929l<Boolean> mo42139b() {
        return C12205a.m54871a((C5929l<T>) new C12645i<T>(this.f36245a, this.f36246b));
    }
}
