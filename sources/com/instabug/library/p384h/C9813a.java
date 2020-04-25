package com.instabug.library.p384h;

import android.app.Activity;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.lang.ref.WeakReference;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.h.a */
/* compiled from: ActivityReferenceManager */
public final class C9813a {

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f26017b;
    @C0195i0

    /* renamed from: a */
    private WeakReference<Activity> f26018a;

    public C9813a() {
        m45788b()[0] = true;
    }

    /* renamed from: b */
    private boolean m45787b(@C0195i0 Activity activity) {
        boolean[] b = m45788b();
        boolean z = false;
        if (activity == null) {
            b[6] = true;
            return false;
        } else if (VERSION.SDK_INT >= 17) {
            b[7] = true;
            if (activity.isFinishing()) {
                b[8] = true;
            } else if (activity.isDestroyed()) {
                b[9] = true;
            } else {
                b[10] = true;
                z = true;
                b[12] = true;
                return z;
            }
            b[11] = true;
            b[12] = true;
            return z;
        } else {
            if (!activity.isFinishing()) {
                b[13] = true;
                z = true;
            } else {
                b[14] = true;
            }
            b[15] = true;
            return z;
        }
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m45788b() {
        boolean[] zArr = f26017b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-8557918744263446090L, "com/instabug/library/instacapture/ActivityReferenceManager", 16);
        f26017b = a;
        return a;
    }

    /* renamed from: a */
    public void mo34938a(@C0193h0 Activity activity) {
        boolean[] b = m45788b();
        this.f26018a = new WeakReference<>(activity);
        b[1] = true;
    }

    @C0195i0
    /* renamed from: a */
    public Activity mo34937a() {
        boolean[] b = m45788b();
        WeakReference<Activity> weakReference = this.f26018a;
        if (weakReference == null) {
            b[2] = true;
            return null;
        }
        Activity activity = (Activity) weakReference.get();
        b[3] = true;
        if (!m45787b(activity)) {
            b[4] = true;
            return null;
        }
        b[5] = true;
        return activity;
    }
}
