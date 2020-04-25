package com.instabug.bug.view;

import com.instabug.bug.view.C9319d.C9320a;
import com.instabug.bug.view.C9319d.C9321b;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.p382ui.BasePresenter;
import java.lang.ref.WeakReference;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.bug.view.h */
/* compiled from: BugReportingPresenter */
public class C9366h extends BasePresenter<C9321b> implements C9320a {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f24801a;

    public C9366h(C9321b bVar) {
        boolean[] c = m43852c();
        super(bVar);
        c[0] = true;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean[] m43852c() {
        boolean[] zArr = f24801a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-6111704846368835363L, "com/instabug/bug/view/BugReportingPresenter", 18);
        f24801a = a;
        return a;
    }

    /* renamed from: b */
    public void mo33804b(int i) {
        boolean[] c = m43852c();
        WeakReference<V> weakReference = this.view;
        if (weakReference == null) {
            c[1] = true;
        } else {
            c[2] = true;
            C9321b bVar = (C9321b) weakReference.get();
            if (bVar == null) {
                c[3] = true;
            } else if (i == 161) {
                bVar.mo33665e();
                c[5] = true;
            } else if (i == 162) {
                bVar.mo33663c();
                c[6] = true;
            } else if (i == 167) {
                bVar.mo33666f();
                c[7] = true;
            } else if (i != 169) {
                c[4] = true;
            } else {
                bVar.finishActivity();
                c[8] = true;
            }
        }
        c[9] = true;
    }

    /* renamed from: d */
    public void mo33805d() {
        boolean[] c = m43852c();
        WeakReference<V> weakReference = this.view;
        if (weakReference == null) {
            c[10] = true;
        } else {
            c[11] = true;
            C9321b bVar = (C9321b) weakReference.get();
            if (bVar == null) {
                c[12] = true;
            } else {
                c[13] = true;
                if (InstabugCore.getFeatureState(Feature.WHITE_LABELING) == State.ENABLED) {
                    c[14] = true;
                    bVar.mo33661a(false);
                    c[15] = true;
                } else {
                    bVar.mo33661a(true);
                    c[16] = true;
                }
            }
        }
        c[17] = true;
    }
}
