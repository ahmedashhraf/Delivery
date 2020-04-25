package androidx.core.content.p019g;

import android.content.pm.PackageInfo;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;

/* renamed from: androidx.core.content.g.b */
/* compiled from: PackageInfoCompat */
public final class C0852b {
    private C0852b() {
    }

    /* renamed from: a */
    public static long m4948a(@C0193h0 PackageInfo packageInfo) {
        if (VERSION.SDK_INT >= 28) {
            return packageInfo.getLongVersionCode();
        }
        return (long) packageInfo.versionCode;
    }
}
