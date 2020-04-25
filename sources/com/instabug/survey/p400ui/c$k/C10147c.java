package com.instabug.survey.p400ui.c$k;

import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.p382ui.BasePresenter;
import com.instabug.survey.p400ui.c$k.C10144b.C10145a;
import com.instabug.survey.p400ui.c$k.C10144b.C10146b;
import java.lang.ref.WeakReference;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.ui.c$k.c */
/* compiled from: WelcomeFragmentPresenter */
class C10147c extends BasePresenter<C10146b> implements C10145a {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26976a;

    public C10147c(C10146b bVar) {
        boolean[] c = m47156c();
        super(bVar);
        c[0] = true;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean[] m47156c() {
        boolean[] zArr = f26976a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(297139376266697370L, "com/instabug/survey/ui/survey/welcomepage/WelcomeFragmentPresenter", 9);
        f26976a = a;
        return a;
    }

    /* renamed from: d */
    public void mo36327d() {
        boolean[] c = m47156c();
        WeakReference<V> weakReference = this.view;
        if (weakReference == null) {
            c[1] = true;
        } else {
            c[2] = true;
            C10146b bVar = (C10146b) weakReference.get();
            if (bVar == null) {
                c[3] = true;
            } else {
                c[4] = true;
                if (InstabugCore.getFeatureState(Feature.WHITE_LABELING) == State.ENABLED) {
                    c[5] = true;
                    bVar.mo36321e();
                    c[6] = true;
                } else {
                    bVar.mo36322f();
                    c[7] = true;
                }
            }
        }
        c[8] = true;
    }
}
