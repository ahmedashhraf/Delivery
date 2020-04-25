package com.instabug.survey.p400ui.c$j;

import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.p382ui.BasePresenter;
import com.instabug.survey.p400ui.c$j.C10139b.C10140a;
import com.instabug.survey.p400ui.c$j.C10139b.C10141b;
import java.lang.ref.WeakReference;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.ui.c$j.c */
/* compiled from: ThanksFragmentPresenter */
class C10142c extends BasePresenter<C10141b> implements C10140a {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26968a;

    public C10142c(C10141b bVar) {
        boolean[] c = m47143c();
        super(bVar);
        c[0] = true;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean[] m47143c() {
        boolean[] zArr = f26968a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(3073531638605022133L, "com/instabug/survey/ui/survey/thankspage/ThanksFragmentPresenter", 9);
        f26968a = a;
        return a;
    }

    /* renamed from: d */
    public void mo36320d() {
        boolean[] c = m47143c();
        WeakReference<V> weakReference = this.view;
        if (weakReference == null) {
            c[1] = true;
        } else {
            c[2] = true;
            C10141b bVar = (C10141b) weakReference.get();
            if (bVar == null) {
                c[3] = true;
            } else {
                c[4] = true;
                if (InstabugCore.getFeatureState(Feature.WHITE_LABELING) == State.ENABLED) {
                    c[5] = true;
                    bVar.mo36318e();
                    c[6] = true;
                } else {
                    bVar.mo36317c();
                    c[7] = true;
                }
            }
        }
        c[8] = true;
    }
}
