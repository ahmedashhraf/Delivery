package androidx.core.content.p019g;

import android.annotation.SuppressLint;
import android.content.pm.PermissionInfo;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.core.content.g.c */
/* compiled from: PermissionInfoCompat */
public final class C0853c {

    @C0207n0({C0208a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.content.g.c$a */
    /* compiled from: PermissionInfoCompat */
    public @interface C0854a {
    }

    @SuppressLint({"UniqueConstants"})
    @C0207n0({C0208a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.content.g.c$b */
    /* compiled from: PermissionInfoCompat */
    public @interface C0855b {
    }

    private C0853c() {
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: a */
    public static int m4949a(@C0193h0 PermissionInfo permissionInfo) {
        if (VERSION.SDK_INT >= 28) {
            return permissionInfo.getProtection();
        }
        return permissionInfo.protectionLevel & 15;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    public static int m4950b(@C0193h0 PermissionInfo permissionInfo) {
        if (VERSION.SDK_INT >= 28) {
            return permissionInfo.getProtectionFlags();
        }
        return permissionInfo.protectionLevel & -16;
    }
}
