package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4312d0;
import com.google.android.gms.common.internal.C4372o;
import com.google.android.gms.common.internal.C4374o1;
import com.google.android.gms.common.p172q.C4439c;
import com.google.android.gms.common.util.C4474c0;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.common.util.C4477e;
import com.google.android.gms.common.util.C4487h0;
import com.google.android.gms.common.util.C4493l;
import com.google.android.gms.common.util.C4503v;
import java.util.concurrent.atomic.AtomicBoolean;

@C4056a
@C4312d0
/* renamed from: com.google.android.gms.common.g */
public class C4284g {
    @C4056a
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
    @C4056a
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
    @C4056a
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";
    @C4056a
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @C4056a
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    @C4056a
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    @C4056a
    @C4476d0
    static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
    @C4476d0
    private static boolean zzah = false;
    @C4476d0
    private static boolean zzai = false;
    private static boolean zzaj = false;
    @C4476d0
    private static boolean zzak = false;
    private static final AtomicBoolean zzal = new AtomicBoolean();

    @C4056a
    C4284g() {
    }

    @C4056a
    @Deprecated
    public static void cancelAvailabilityErrorNotifications(Context context) {
        if (!sCanceledAvailabilityNotification.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(GMS_AVAILABILITY_NOTIFICATION_ID);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    @C4056a
    @C4312d0
    public static void enableUsingApkIndependentContext() {
        zzal.set(true);
    }

    @C4056a
    @Deprecated
    public static void ensurePlayServicesAvailable(Context context, int i) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        int a = C4282f.m18511a().mo18094a(context, i);
        if (a != 0) {
            Intent a2 = C4282f.m18511a().mo18099a(context, a, "e");
            StringBuilder sb = new StringBuilder(57);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(a);
            sb.toString();
            if (a2 == null) {
                throw new GooglePlayServicesNotAvailableException(a);
            }
            throw new GooglePlayServicesRepairableException(a, "Google Play Services not available", a2);
        }
    }

    @C4056a
    @C4312d0
    @Deprecated
    public static int getApkVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (NameNotFoundException unused) {
            return 0;
        }
    }

    @C4056a
    @C4312d0
    @Deprecated
    public static int getClientVersion(Context context) {
        C4300a0.m18631b(true);
        return C4477e.m19324a(context, context.getPackageName());
    }

    @C4056a
    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, Context context, int i2) {
        return C4282f.m18511a().mo18097a(context, i, i2);
    }

    @C4056a
    @Deprecated
    @C4476d0
    public static String getErrorString(int i) {
        return ConnectionResult.m17511a(i);
    }

    @C4056a
    @C4312d0
    @Deprecated
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i) {
        return C4282f.m18511a().mo18099a((Context) null, i, (String) null);
    }

    @C4056a
    public static Context getRemoteContext(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    @C4056a
    public static Resources getRemoteResource(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    @C4056a
    @C4312d0
    public static boolean honorsDebugCertificates(Context context) {
        if (!zzak) {
            try {
                PackageInfo b = C4439c.m19110a(context).mo18451b("com.google.android.gms", 64);
                C4286h.m18530a(context);
                if (b == null || C4286h.m18532a(b, false) || !C4286h.m18532a(b, true)) {
                    zzaj = false;
                } else {
                    zzaj = true;
                }
            } catch (NameNotFoundException unused) {
            } finally {
                zzak = true;
            }
        }
        return zzaj || !C4493l.m19375a();
    }

    @C4056a
    @C4372o
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @C4056a
    @Deprecated
    public static boolean isGooglePlayServicesUid(Context context, int i) {
        return C4474c0.m19321a(context, i);
    }

    @C4056a
    @C4312d0
    @Deprecated
    public static boolean isPlayServicesPossiblyUpdating(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return isUninstalledAppPossiblyUpdating(context, "com.google.android.gms");
        }
        return false;
    }

    @C4056a
    @C4312d0
    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(Context context, int i) {
        if (i == 9) {
            return isUninstalledAppPossiblyUpdating(context, "com.android.vending");
        }
        return false;
    }

    @C4056a
    @TargetApi(18)
    public static boolean isRestrictedUserProfile(Context context) {
        if (C4503v.m19413g()) {
            Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
            if (applicationRestrictions != null) {
                if (ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(applicationRestrictions.getString("restricted_profile"))) {
                    return true;
                }
            }
        }
        return false;
    }

    @C4056a
    @C4312d0
    @Deprecated
    @C4476d0
    public static boolean isSidewinderDevice(Context context) {
        return C4493l.m19379c(context);
    }

    @TargetApi(21)
    static boolean isUninstalledAppPossiblyUpdating(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (C4503v.m19416j()) {
            try {
                for (SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            return applicationInfo.enabled && !isRestrictedUserProfile(context);
        } catch (NameNotFoundException unused2) {
        }
    }

    @C4056a
    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @C4056a
    @TargetApi(19)
    @Deprecated
    public static boolean uidHasPackageName(Context context, int i, String str) {
        return C4474c0.m19322a(context, i, str);
    }

    @C4476d0
    private static int zza(Context context, boolean z, int i) {
        String str = "com.google.android.gms";
        C4300a0.m18627a(i >= 0);
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (NameNotFoundException unused) {
                return 9;
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 64);
            C4286h.m18530a(context);
            if (!C4286h.m18532a(packageInfo2, true)) {
                return 9;
            }
            if (z && (!C4286h.m18532a(packageInfo, true) || !packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                return 9;
            }
            if (C4487h0.m19363a(packageInfo2.versionCode) < C4487h0.m19363a(i)) {
                int i2 = packageInfo2.versionCode;
                StringBuilder sb = new StringBuilder(77);
                sb.append("Google Play services out of date.  Requires ");
                sb.append(i);
                sb.append(" but found ");
                sb.append(i2);
                sb.toString();
                return 2;
            }
            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
            if (applicationInfo == null) {
                try {
                    applicationInfo = packageManager.getApplicationInfo(str, 0);
                } catch (NameNotFoundException unused2) {
                    return 1;
                }
            }
            if (!applicationInfo.enabled) {
                return 3;
            }
            return 0;
        } catch (NameNotFoundException unused3) {
            return 1;
        }
    }

    @C4056a
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i) {
        try {
            context.getResources().getString(C4053R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !zzal.get()) {
            int b = C4374o1.m18874b(context);
            if (b != 0) {
                int i2 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
                if (b != i2) {
                    StringBuilder sb = new StringBuilder(320);
                    sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                    sb.append(i2);
                    sb.append(" but found ");
                    sb.append(b);
                    sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
        }
        return zza(context, !C4493l.m19382f(context) && !C4493l.m19383g(context), i);
    }
}
