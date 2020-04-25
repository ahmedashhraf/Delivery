package androidx.lifecycle;

import androidx.lifecycle.Lifecycle.C1441a;

class CompositeGeneratedAdaptersObserver implements C1457g {

    /* renamed from: a */
    private final C1455e[] f5658a;

    CompositeGeneratedAdaptersObserver(C1455e[] eVarArr) {
        this.f5658a = eVarArr;
    }

    /* renamed from: a */
    public void mo632a(C1459i iVar, C1441a aVar) {
        C1466m mVar = new C1466m();
        for (C1455e a : this.f5658a) {
            a.mo6511a(iVar, aVar, false, mVar);
        }
        for (C1455e a2 : this.f5658a) {
            a2.mo6511a(iVar, aVar, true, mVar);
        }
    }
}
