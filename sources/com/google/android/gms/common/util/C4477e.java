package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.p172q.C4439c;

@C4056a
/* renamed from: com.google.android.gms.common.util.e */
public class C4477e {
    private C4477e() {
    }

    @C4056a
    /* renamed from: a */
    public static int m19324a(Context context, String str) {
        PackageInfo b = m19326b(context, str);
        if (b != null) {
            ApplicationInfo applicationInfo = b.applicationInfo;
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null) {
                    return -1;
                }
                return bundle.getInt("com.google.android.gms.version", -1);
            }
        }
        return -1;
    }

    @C4056a
    /* renamed from: a */
    public static boolean m19325a() {
        return false;
    }

    @C0195i0
    /* renamed from: b */
    private static PackageInfo m19326b(Context context, String str) {
        try {
            return C4439c.m19110a(context).mo18451b(str, 128);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m19327c(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            if ((C4439c.m19110a(context).mo18446a(str, 0).flags & 2097152) != 0) {
                return true;
            }
        } catch (NameNotFoundException unused) {
        }
        return false;
    }
}
