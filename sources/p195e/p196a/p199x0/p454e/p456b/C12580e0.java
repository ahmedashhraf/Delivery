package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12292n0;
import p195e.p196a.C12297q;
import p195e.p196a.C5928k0;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p452c.C12393b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.e0 */
/* compiled from: FlowableCountSingle */
public final class C12580e0<T> extends C5928k0<Long> implements C12393b<Long> {

    /* renamed from: a */
    final C5929l<T> f36017a;

    /* renamed from: e.a.x0.e.b.e0$a */
    /* compiled from: FlowableCountSingle */
    static final class C12581a implements C12297q<Object>, C12314c {

        /* renamed from: N */
        long f36018N;

        /* renamed from: a */
        final C12292n0<? super Long> f36019a;

        /* renamed from: b */
        C14063d f36020b;

        C12581a(C12292n0<? super Long> n0Var) {
            this.f36019a = n0Var;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36020b, dVar)) {
                this.f36020b = dVar;
                this.f36019a.mo41974a(this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f36020b == C13742j.CANCELLED;
        }

        public void dispose() {
            this.f36020b.cancel();
            this.f36020b = C13742j.CANCELLED;
        }

        public void onComplete() {
            this.f36020b = C13742j.CANCELLED;
            this.f36019a.onSuccess(Long.valueOf(this.f36018N));
        }

        public void onError(Throwable th) {
            this.f36020b = C13742j.CANCELLED;
            this.f36019a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(Object obj) {
            this.f36018N++;
        }
    }

    public C12580e0(C5929l<T> lVar) {
        this.f36017a = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super Long> n0Var) {
        this.f36017a.mo24393a((C12297q<? super T>) new C12581a<Object>(n0Var));
    }

    /* renamed from: b */
    public C5929l<Long> mo42139b() {
        return C12205a.m54871a((C5929l<T>) new C12555d0<T>(this.f36017a));
    }
}
