package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: androidx.core.app.h */
/* compiled from: AppOpsManagerCompat */
public final class C0747h {

    /* renamed from: a */
    public static final int f3423a = 0;

    /* renamed from: b */
    public static final int f3424b = 1;

    /* renamed from: c */
    public static final int f3425c = 2;

    /* renamed from: d */
    public static final int f3426d = 3;

    private C0747h() {
    }

    @C0195i0
    /* renamed from: a */
    public static String m4312a(@C0193h0 String str) {
        if (VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(str);
        }
        return null;
    }

    /* renamed from: b */
    public static int m4313b(@C0193h0 Context context, @C0193h0 String str, int i, @C0193h0 String str2) {
        if (VERSION.SDK_INT >= 19) {
            return ((AppOpsManager) context.getSystemService("appops")).noteOpNoThrow(str, i, str2);
        }
        return 1;
    }

    /* renamed from: a */
    public static int m4310a(@C0193h0 Context context, @C0193h0 String str, int i, @C0193h0 String str2) {
        if (VERSION.SDK_INT >= 19) {
            return ((AppOpsManager) context.getSystemService("appops")).noteOp(str, i, str2);
        }
        return 1;
    }

    /* renamed from: b */
    public static int m4314b(@C0193h0 Context context, @C0193h0 String str, @C0193h0 String str2) {
        if (VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
        }
        return 1;
    }

    /* renamed from: a */
    public static int m4311a(@C0193h0 Context context, @C0193h0 String str, @C0193h0 String str2) {
        if (VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOp(str, str2);
        }
        return 1;
    }
}
