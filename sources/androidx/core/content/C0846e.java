package androidx.core.content;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.app.C0747h;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.core.content.e */
/* compiled from: PermissionChecker */
public final class C0846e {

    /* renamed from: a */
    public static final int f3989a = 0;

    /* renamed from: b */
    public static final int f3990b = -1;

    /* renamed from: c */
    public static final int f3991c = -2;

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.content.e$a */
    /* compiled from: PermissionChecker */
    public @interface C0847a {
    }

    private C0846e() {
    }

    /* renamed from: a */
    public static int m4942a(@C0193h0 Context context, @C0193h0 String str, int i, int i2, @C0195i0 String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String a = C0747h.m4312a(str);
        if (a == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (C0747h.m4314b(context, a, str2) != 0) {
            return -2;
        }
        return 0;
    }

    /* renamed from: b */
    public static int m4944b(@C0193h0 Context context, @C0193h0 String str) {
        return m4942a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    /* renamed from: a */
    public static int m4943a(@C0193h0 Context context, @C0193h0 String str, @C0195i0 String str2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return m4942a(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    /* renamed from: a */
    public static int m4941a(@C0193h0 Context context, @C0193h0 String str) {
        return m4942a(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }
}
