package com.instabug.featuresrequest.p373ui.custom;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.ui.custom.a */
/* compiled from: SnackbarLayout */
final class C9638a extends SwipeDismissBehavior<SnackbarLayout> {

    /* renamed from: u */
    private static transient /* synthetic */ boolean[] f25548u;

    /* renamed from: t */
    private C9655b f25549t;

    public C9638a(C9655b bVar) {
        boolean[] d = m45063d();
        this.f25549t = bVar;
        d[0] = true;
    }

    /* renamed from: d */
    private static /* synthetic */ boolean[] m45063d() {
        boolean[] zArr = f25548u;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1830050399002522008L, "com/instabug/featuresrequest/ui/custom/Behavior", 11);
        f25548u = a;
        return a;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo3998a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean[] d = m45063d();
        boolean a = mo34509a(coordinatorLayout, (SnackbarLayout) view, motionEvent);
        d[10] = true;
        return a;
    }

    /* renamed from: b */
    public boolean mo22294b(View view) {
        boolean z = view instanceof SnackbarLayout;
        m45063d()[1] = true;
        return z;
    }

    /* renamed from: a */
    public boolean mo34509a(CoordinatorLayout coordinatorLayout, SnackbarLayout snackbarLayout, MotionEvent motionEvent) {
        boolean[] d = m45063d();
        if (!coordinatorLayout.mo3936a((View) snackbarLayout, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            d[2] = true;
        } else {
            d[3] = true;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                C9653d a = C9653d.m45124a();
                C9655b bVar = this.f25549t;
                d[5] = true;
                a.mo34539c(bVar);
                d[6] = true;
            } else if (actionMasked == 1 || actionMasked == 3) {
                C9653d a2 = C9653d.m45124a();
                C9655b bVar2 = this.f25549t;
                d[7] = true;
                a2.mo34540d(bVar2);
                d[8] = true;
            } else {
                d[4] = true;
            }
        }
        boolean a3 = super.mo3998a(coordinatorLayout, snackbarLayout, motionEvent);
        d[9] = true;
        return a3;
    }
}
