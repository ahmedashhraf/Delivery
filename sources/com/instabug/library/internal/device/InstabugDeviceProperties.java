package com.instabug.library.internal.device;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.media.AudioManager;
import android.os.Build;
import android.os.Build.VERSION;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.instabug.library.util.InstabugSDKLogger;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InstabugDeviceProperties {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(2398854621545368978L, "com/instabug/library/internal/device/InstabugDeviceProperties", 29);
        $jacocoData = a;
        return a;
    }

    public InstabugDeviceProperties() {
        $jacocoInit()[0] = true;
    }

    public static boolean checkRingerIsOn(Context context) {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            $jacocoInit[24] = true;
            if (audioManager.getRingerMode() == 2) {
                $jacocoInit[25] = true;
                z = true;
            } else {
                z = false;
                $jacocoInit[26] = true;
            }
            $jacocoInit[27] = true;
            return z;
        }
        $jacocoInit[28] = true;
        return true;
    }

    public static String getAppVersion(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        PackageInfo packageInfo = new PackageInfo();
        try {
            $jacocoInit[1] = true;
            PackageManager packageManager = context.getPackageManager();
            $jacocoInit[2] = true;
            String packageName = context.getPackageName();
            $jacocoInit[3] = true;
            packageInfo = packageManager.getPackageInfo(packageName, 0);
            $jacocoInit[4] = true;
        } catch (NameNotFoundException e) {
            $jacocoInit[5] = true;
            InstabugSDKLogger.m46624e(InstabugDeviceProperties.class, "failed to get app version", e);
            $jacocoInit[6] = true;
        }
        String format = String.format("%s (%s)", new Object[]{packageInfo.versionName, Integer.valueOf(packageInfo.versionCode)});
        $jacocoInit[7] = true;
        return format;
    }

    public static String getAppVersionName(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        PackageInfo packageInfo = new PackageInfo();
        try {
            $jacocoInit[8] = true;
            PackageManager packageManager = context.getPackageManager();
            $jacocoInit[9] = true;
            String packageName = context.getPackageName();
            $jacocoInit[10] = true;
            packageInfo = packageManager.getPackageInfo(packageName, 0);
            $jacocoInit[11] = true;
        } catch (NameNotFoundException e) {
            $jacocoInit[12] = true;
            InstabugSDKLogger.m46624e(InstabugDeviceProperties.class, "failed to get app version", e);
            $jacocoInit[13] = true;
        }
        String str = packageInfo.versionName;
        $jacocoInit[14] = true;
        return str;
    }

    public static int getCurrentOSLevel() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = VERSION.SDK_INT;
        $jacocoInit[20] = true;
        return i;
    }

    public static String getDeviceType() {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append(C3868i.f12248b);
        sb.append(Build.MODEL);
        String sb2 = sb.toString();
        $jacocoInit[19] = true;
        return sb2;
    }

    public static String getPackageName(Context context) {
        String str;
        boolean[] $jacocoInit = $jacocoInit();
        try {
            str = context.getApplicationInfo().packageName;
            $jacocoInit[15] = true;
        } catch (Exception e) {
            $jacocoInit[16] = true;
            InstabugSDKLogger.m46624e(InstabugDeviceProperties.class, "failed to get package name", e);
            $jacocoInit[17] = true;
            str = "Could not get information";
        }
        $jacocoInit[18] = true;
        return str;
    }

    public static boolean isTablet(Context context) {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        if ((context.getResources().getConfiguration().screenLayout & 15) >= 3) {
            $jacocoInit[21] = true;
            z = true;
        } else {
            z = false;
            $jacocoInit[22] = true;
        }
        $jacocoInit[23] = true;
        return z;
    }
}
