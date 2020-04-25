package bolts;

import bolts.C2177n.C2195q;

/* renamed from: bolts.p */
/* compiled from: UnobservedErrorNotifier */
class C2197p {

    /* renamed from: a */
    private C2177n<?> f8708a;

    public C2197p(C2177n<?> nVar) {
        this.f8708a = nVar;
    }

    /* renamed from: a */
    public void mo9345a() {
        this.f8708a = null;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            C2177n<?> nVar = this.f8708a;
            if (nVar != null) {
                C2195q l = C2177n.m11249l();
                if (l != null) {
                    l.mo9337a(nVar, new UnobservedTaskException(nVar.mo9316b()));
                }
            }
        } finally {
            super.finalize();
        }
    }
}
