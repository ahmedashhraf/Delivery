package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4312d0;
import com.google.android.gms.common.internal.C4333f1;
import com.google.android.gms.common.internal.C4372o;
import com.google.android.gms.common.p172q.C4439c;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.common.util.C4493l;
import org.jcodec.codecs.common.biari.MQEncoder;

@C4056a
@C4312d0
/* renamed from: com.google.android.gms.common.f */
public class C4282f {
    @C4056a

    /* renamed from: a */
    public static final int f13284a = C4284g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    @C4056a

    /* renamed from: b */
    public static final String f13285b = "com.google.android.gms";
    @C4056a

    /* renamed from: c */
    public static final String f13286c = "com.android.vending";
    @C4056a

    /* renamed from: d */
    static final String f13287d = "d";
    @C4056a

    /* renamed from: e */
    static final String f13288e = "n";

    /* renamed from: f */
    private static final C4282f f13289f = new C4282f();

    @C4056a
    C4282f() {
    }

    @C4056a
    /* renamed from: a */
    public static C4282f m18511a() {
        return f13289f;
    }

    @C4056a
    @C4312d0
    /* renamed from: b */
    public int mo18123b(Context context) {
        return C4284g.getApkVersion(context);
    }

    @C4056a
    /* renamed from: c */
    public boolean mo18112c(int i) {
        return C4284g.isUserRecoverableError(i);
    }

    @C4056a
    @C4372o
    /* renamed from: d */
    public int mo18113d(Context context) {
        return mo18094a(context, f13284a);
    }

    @C4056a
    /* renamed from: a */
    public int mo18094a(Context context, int i) {
        int isGooglePlayServicesAvailable = C4284g.isGooglePlayServicesAvailable(context, i);
        if (C4284g.isPlayServicesPossiblyUpdating(context, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }

    @C4056a
    @C4312d0
    /* renamed from: b */
    public boolean mo18124b(Context context, int i) {
        return C4284g.isPlayServicesPossiblyUpdating(context, i);
    }

    @C4056a
    @C4312d0
    /* renamed from: c */
    public int mo18111c(Context context) {
        return C4284g.getClientVersion(context);
    }

    @C4056a
    /* renamed from: d */
    public void mo18126d(Context context, int i) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        C4284g.ensurePlayServicesAvailable(context, i);
    }

    @C4056a
    /* renamed from: b */
    public String mo18106b(int i) {
        return C4284g.getErrorString(i);
    }

    @C4056a
    @C4312d0
    /* renamed from: c */
    public boolean mo18125c(Context context, int i) {
        return C4284g.isPlayStorePossiblyUpdating(context, i);
    }

    @C4476d0
    /* renamed from: b */
    private static String mo18108b(@C0195i0 Context context, @C0195i0 String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f13284a);
        String str2 = "-";
        sb.append(str2);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append(str2);
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append(str2);
        if (context != null) {
            try {
                sb.append(C4439c.m19110a(context).mo18451b(context.getPackageName(), 0).versionCode);
            } catch (NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    @C0195i0
    @C4056a
    @C4312d0
    @Deprecated
    /* renamed from: a */
    public Intent mo18120a(int i) {
        return mo18099a((Context) null, i, (String) null);
    }

    @C4056a
    @C4312d0
    @C0195i0
    /* renamed from: a */
    public Intent mo18099a(Context context, int i, @C0195i0 String str) {
        String str2 = "com.google.android.gms";
        if (i == 1 || i == 2) {
            if (context == null || !C4493l.m19382f(context)) {
                return C4333f1.m18778a(str2, mo18108b(context, str));
            }
            return C4333f1.m18776a();
        } else if (i != 3) {
            return null;
        } else {
            return C4333f1.m18777a(str2);
        }
    }

    @C4056a
    @C0195i0
    /* renamed from: a */
    public PendingIntent mo18097a(Context context, int i, int i2) {
        return mo18119a(context, i, i2, null);
    }

    @C4056a
    @C4312d0
    @C0195i0
    /* renamed from: a */
    public PendingIntent mo18119a(Context context, int i, int i2, @C0195i0 String str) {
        Intent a = mo18099a(context, i, str);
        if (a == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, a, MQEncoder.CARRY_MASK);
    }

    @C4056a
    /* renamed from: a */
    public void mo18121a(Context context) {
        C4284g.cancelAvailabilityErrorNotifications(context);
    }

    @C4056a
    /* renamed from: a */
    public boolean mo18122a(Context context, String str) {
        return C4284g.isUninstalledAppPossiblyUpdating(context, str);
    }
}
