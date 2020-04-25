package com.instabug.library.invocation.invocationdialog;

import com.instabug.library.C9780c;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.core.p382ui.BasePresenter;
import com.instabug.library.invocation.invocationdialog.C9919e.C9920a;
import java.lang.ref.WeakReference;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.invocation.invocationdialog.f */
/* compiled from: InstabugDialogFragmentPresenter */
public class C9921f extends BasePresenter<C9920a> {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26372a;

    public C9921f(C9920a aVar) {
        boolean[] g = m46155g();
        super(aVar);
        g[0] = true;
    }

    /* renamed from: f */
    private void m46154f() {
        boolean[] g = m46155g();
        WeakReference<V> weakReference = this.view;
        if (weakReference == null) {
            g[14] = true;
        } else {
            g[15] = true;
            C9920a aVar = (C9920a) weakReference.get();
            if (aVar == null) {
                g[16] = true;
            } else {
                g[17] = true;
                aVar.mo35246f();
                g[18] = true;
            }
        }
        g[19] = true;
    }

    /* renamed from: g */
    private static /* synthetic */ boolean[] m46155g() {
        boolean[] zArr = f26372a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(2089988042109266190L, "com/instabug/library/invocation/invocationdialog/InstabugDialogFragmentPresenter", 20);
        f26372a = a;
        return a;
    }

    /* renamed from: c */
    public boolean mo35249c() {
        boolean z;
        boolean[] g = m46155g();
        if (C9780c.m45631b().mo34869b(Feature.WHITE_LABELING) == State.ENABLED) {
            g[10] = true;
            z = true;
        } else {
            z = false;
            g[11] = true;
        }
        g[12] = true;
        return z;
    }

    /* renamed from: d */
    public void mo35250d() {
        boolean[] g = m46155g();
        WeakReference<V> weakReference = this.view;
        if (weakReference == null) {
            g[1] = true;
        } else {
            g[2] = true;
            C9920a aVar = (C9920a) weakReference.get();
            if (aVar == null) {
                g[3] = true;
            } else {
                g[4] = true;
                m46154f();
                g[5] = true;
                if (mo35249c()) {
                    g[6] = true;
                    aVar.mo35243c();
                    g[7] = true;
                } else {
                    aVar.mo35244d();
                    g[8] = true;
                }
            }
        }
        g[9] = true;
    }

    /* renamed from: e */
    public void mo35251e() {
        m46155g()[13] = true;
    }
}
