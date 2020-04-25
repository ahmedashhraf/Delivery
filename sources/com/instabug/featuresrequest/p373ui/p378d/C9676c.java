package com.instabug.featuresrequest.p373ui.p378d;

import com.instabug.library.core.p382ui.BasePresenter;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.ui.d.c */
/* compiled from: FeaturesMainPresenter */
public class C9676c extends BasePresenter<C9664b> implements C9663a {

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f25636b;

    /* renamed from: a */
    private final C9664b f25637a = ((C9664b) this.view.get());

    public C9676c(C9664b bVar) {
        boolean[] e = m45207e();
        super(bVar);
        e[0] = true;
        e[1] = true;
    }

    /* renamed from: e */
    private static /* synthetic */ boolean[] m45207e() {
        boolean[] zArr = f25636b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-5401089509843057409L, "com/instabug/featuresrequest/ui/featuresmain/FeaturesMainPresenter", 14);
        f25636b = a;
        return a;
    }

    /* renamed from: c */
    public void mo34556c() {
        boolean[] e = m45207e();
        C9664b bVar = this.f25637a;
        if (bVar == null) {
            e[10] = true;
        } else {
            e[11] = true;
            bVar.mo34549c();
            e[12] = true;
        }
        e[13] = true;
    }

    /* renamed from: d */
    public void mo34557d() {
        boolean[] e = m45207e();
        C9664b bVar = this.f25637a;
        if (bVar == null) {
            e[2] = true;
        } else {
            e[3] = true;
            bVar.mo34550d();
            e[4] = true;
        }
        e[5] = true;
    }
}
