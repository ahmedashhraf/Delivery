package com.instabug.library.tracking;

import android.app.Activity;
import android.view.MotionEvent;
import com.instabug.library.C9794d;
import com.instabug.library.C9794d.C9795a;
import com.instabug.library.p383e.C9801a;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.tracking.c */
/* compiled from: InstabugTouchEventsTracker */
public class C9994c {

    /* renamed from: a */
    private static C9994c f26595a;

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f26596b;

    private C9994c() {
        m46536b()[0] = true;
    }

    /* renamed from: a */
    public static C9994c m46535a() {
        boolean[] b = m46536b();
        if (f26595a != null) {
            b[1] = true;
        } else {
            b[2] = true;
            f26595a = new C9994c();
            b[3] = true;
        }
        C9994c cVar = f26595a;
        b[4] = true;
        return cVar;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m46536b() {
        boolean[] zArr = f26596b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(2416674198196722918L, "com/instabug/library/tracking/InstabugTouchEventsTracker", 11);
        f26596b = a;
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35843a(Activity activity, MotionEvent motionEvent) {
        boolean[] b = m46536b();
        C9795a[] aVarArr = new C9795a[motionEvent.getPointerCount()];
        b[5] = true;
        b[6] = true;
        int i = 0;
        while (i < motionEvent.getPointerCount()) {
            b[7] = true;
            aVarArr[i] = new C9795a((int) motionEvent.getX(i), (int) motionEvent.getY(i));
            i++;
            b[8] = true;
        }
        C9794d.m45671b().mo34921a(aVarArr);
        b[9] = true;
        C9801a.m45732a().mo34925a(motionEvent);
        b[10] = true;
    }
}
