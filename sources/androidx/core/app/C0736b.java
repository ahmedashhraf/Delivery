package androidx.core.app;

import android.app.ActivityManager;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;

/* renamed from: androidx.core.app.b */
/* compiled from: ActivityManagerCompat */
public final class C0736b {
    private C0736b() {
    }

    /* renamed from: a */
    public static boolean m4271a(@C0193h0 ActivityManager activityManager) {
        if (VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return false;
    }
}
