package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.C4286h;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.p172q.C4439c;

@C4056a
/* renamed from: com.google.android.gms.common.util.c0 */
public final class C4474c0 {
    private C4474c0() {
    }

    @C4056a
    /* renamed from: a */
    public static boolean m19321a(Context context, int i) {
        String str = "com.google.android.gms";
        if (!m19322a(context, i, str)) {
            return false;
        }
        try {
            return C4286h.m18530a(context).mo18128a(context.getPackageManager().getPackageInfo(str, 64));
        } catch (NameNotFoundException unused) {
            boolean isLoggable = Log.isLoggable("UidVerifier", 3);
            return false;
        }
    }

    @C4056a
    @TargetApi(19)
    /* renamed from: a */
    public static boolean m19322a(Context context, int i, String str) {
        return C4439c.m19110a(context).mo18449a(i, str);
    }
}
