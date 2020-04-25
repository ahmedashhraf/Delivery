package com.instabug.library.util;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.core.app.C0727a;
import androidx.core.content.C0841b;
import androidx.fragment.app.Fragment;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class PermissionsUtils {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(2445167028849189549L, "com/instabug/library/util/PermissionsUtils", 38);
        $jacocoData = a;
        return a;
    }

    public PermissionsUtils() {
        $jacocoInit()[0] = true;
    }

    public static boolean isPermissionGranted(@C0193h0 Context context, @C0193h0 String str) {
        Class<PermissionsUtils> cls = PermissionsUtils.class;
        boolean[] $jacocoInit = $jacocoInit();
        try {
            String str2 = "granted";
            String str3 = "";
            String str4 = "NOT ";
            String str5 = " state is ";
            String str6 = "Permission ";
            boolean z = false;
            if (VERSION.SDK_INT < 23) {
                $jacocoInit[1] = true;
                if (context.checkCallingOrSelfPermission(str) == 0) {
                    $jacocoInit[9] = true;
                    z = true;
                } else {
                    $jacocoInit[10] = true;
                }
                $jacocoInit[11] = true;
                StringBuilder sb = new StringBuilder();
                sb.append(str6);
                sb.append(str);
                sb.append(str5);
                if (z) {
                    $jacocoInit[12] = true;
                } else {
                    $jacocoInit[13] = true;
                    str3 = str4;
                }
                sb.append(str3);
                sb.append(str2);
                InstabugSDKLogger.m46622d(cls, sb.toString());
                $jacocoInit[14] = true;
                return z;
            }
            $jacocoInit[2] = true;
            if (C0841b.m4916a(context, str) == 0) {
                $jacocoInit[3] = true;
                z = true;
            } else {
                $jacocoInit[4] = true;
            }
            $jacocoInit[5] = true;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str6);
            sb2.append(str);
            sb2.append(str5);
            if (z) {
                $jacocoInit[6] = true;
            } else {
                $jacocoInit[7] = true;
                str3 = str4;
            }
            sb2.append(str3);
            sb2.append(str2);
            InstabugSDKLogger.m46622d(cls, sb2.toString());
            $jacocoInit[8] = true;
            return z;
        } catch (Error | Exception unused) {
            $jacocoInit[15] = true;
            return true;
        }
    }

    public static void requestPermission(@C0193h0 Activity activity, @C0193h0 String str, int i, @C0195i0 Runnable runnable, @C0195i0 Runnable runnable2) {
        Class<PermissionsUtils> cls = PermissionsUtils.class;
        boolean[] $jacocoInit = $jacocoInit();
        String str2 = "Permission ";
        if (!isPermissionGranted(activity, str)) {
            $jacocoInit[16] = true;
            if (C0727a.m4245a(activity, str)) {
                $jacocoInit[17] = true;
            } else {
                $jacocoInit[18] = true;
                runIfValid(runnable);
                $jacocoInit[19] = true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            sb.append(" not granted, requesting it");
            InstabugSDKLogger.m46622d(cls, sb.toString());
            $jacocoInit[20] = true;
            C0727a.m4243a(activity, new String[]{str}, i);
            $jacocoInit[21] = true;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            sb2.append(" already granted, running after permission granted runnable");
            InstabugSDKLogger.m46622d(cls, sb2.toString());
            $jacocoInit[22] = true;
            runIfValid(runnable2);
            $jacocoInit[23] = true;
        }
        $jacocoInit[24] = true;
    }

    private static void runIfValid(Runnable runnable) {
        boolean[] $jacocoInit = $jacocoInit();
        if (runnable == null) {
            $jacocoInit[34] = true;
        } else {
            $jacocoInit[35] = true;
            runnable.run();
            $jacocoInit[36] = true;
        }
        $jacocoInit[37] = true;
    }

    public static void requestPermission(Fragment fragment, String str, int i, @C0195i0 Runnable runnable, Runnable runnable2) {
        Class<PermissionsUtils> cls = PermissionsUtils.class;
        boolean[] $jacocoInit = $jacocoInit();
        String str2 = "Permission ";
        if (!isPermissionGranted(fragment.getContext(), str)) {
            $jacocoInit[25] = true;
            if (fragment.shouldShowRequestPermissionRationale(str)) {
                $jacocoInit[26] = true;
            } else {
                $jacocoInit[27] = true;
                runIfValid(runnable);
                $jacocoInit[28] = true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            sb.append(" not granted, requesting it");
            InstabugSDKLogger.m46622d(cls, sb.toString());
            $jacocoInit[29] = true;
            fragment.requestPermissions(new String[]{str}, i);
            $jacocoInit[30] = true;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            sb2.append(" already granted, running after permission granted runnable");
            InstabugSDKLogger.m46622d(cls, sb2.toString());
            $jacocoInit[31] = true;
            runIfValid(runnable2);
            $jacocoInit[32] = true;
        }
        $jacocoInit[33] = true;
    }
}
