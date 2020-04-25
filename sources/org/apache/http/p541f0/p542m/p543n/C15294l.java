package org.apache.http.p541f0.p542m.p543n;

import org.apache.http.p224d0.C6145c;

@C6145c
/* renamed from: org.apache.http.f0.m.n.l */
/* compiled from: WaitingThreadAborter */
public class C15294l {

    /* renamed from: a */
    private C15293k f44301a;

    /* renamed from: b */
    private boolean f44302b;

    /* renamed from: a */
    public void mo47361a() {
        this.f44302b = true;
        C15293k kVar = this.f44301a;
        if (kVar != null) {
            kVar.mo47359d();
        }
    }

    /* renamed from: a */
    public void mo47362a(C15293k kVar) {
        this.f44301a = kVar;
        if (this.f44302b) {
            kVar.mo47359d();
        }
    }
}
