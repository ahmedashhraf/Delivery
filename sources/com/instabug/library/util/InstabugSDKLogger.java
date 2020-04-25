package com.instabug.library.util;

import androidx.annotation.C0193h0;
import com.instabug.library.settings.SettingsManager;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public final class InstabugSDKLogger {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final String LOG_TAG = "INSTABUG - ";

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-9033300011009135884L, "com/instabug/library/util/InstabugSDKLogger", 46);
        $jacocoData = a;
        return a;
    }

    private InstabugSDKLogger() {
        $jacocoInit()[0] = true;
    }

    /* renamed from: d */
    public static void m46622d(@C0193h0 Object obj, @C0193h0 String str) {
        String str2;
        boolean[] $jacocoInit = $jacocoInit();
        if (!SettingsManager.getInstance().isDebugEnabled()) {
            $jacocoInit[18] = true;
            return;
        }
        logTag(obj);
        $jacocoInit[19] = true;
        if (str.length() > 4000) {
            $jacocoInit[20] = true;
            int length = str.length() / 4000;
            $jacocoInit[21] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("logMessage length = ");
            sb.append(str.length());
            sb.append(" divided to ");
            int i = length + 1;
            sb.append(i);
            sb.append(" chunks");
            sb.toString();
            int i2 = 0;
            $jacocoInit[22] = true;
            while (i2 <= length) {
                int i3 = i2 + 1;
                int i4 = i3 * 4000;
                $jacocoInit[23] = true;
                if (i4 >= str.length()) {
                    $jacocoInit[24] = true;
                    str2 = str.substring(i2 * 4000);
                    $jacocoInit[25] = true;
                } else {
                    str2 = str.substring(i2 * 4000, i4);
                    $jacocoInit[26] = true;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("chunk ");
                sb2.append(i3);
                sb2.append(" of ");
                sb2.append(i);
                sb2.append(":\n");
                sb2.append(str2);
                sb2.toString();
                $jacocoInit[27] = true;
                i2 = i3;
            }
            $jacocoInit[28] = true;
        } else {
            $jacocoInit[29] = true;
        }
        $jacocoInit[30] = true;
    }

    /* renamed from: e */
    public static void m46623e(@C0193h0 Object obj, @C0193h0 String str) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!SettingsManager.getInstance().isDebugEnabled()) {
            $jacocoInit[36] = true;
            return;
        }
        logTag(obj);
        $jacocoInit[37] = true;
    }

    /* renamed from: i */
    public static void m46625i(@C0193h0 Object obj, @C0193h0 String str) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!SettingsManager.getInstance().isDebugEnabled()) {
            $jacocoInit[31] = true;
        } else {
            logTag(obj);
            $jacocoInit[32] = true;
        }
        $jacocoInit[33] = true;
    }

    public static String logTag(Object obj) {
        String str;
        boolean[] $jacocoInit = $jacocoInit();
        if (obj instanceof Class) {
            $jacocoInit[1] = true;
            str = ((Class) obj).getSimpleName();
            $jacocoInit[2] = true;
        } else {
            str = obj.getClass().getSimpleName();
            $jacocoInit[3] = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(LOG_TAG);
        sb.append(str);
        String sb2 = sb.toString();
        $jacocoInit[4] = true;
        return sb2;
    }

    /* renamed from: v */
    public static void m46626v(@C0193h0 Object obj, @C0193h0 String str) {
        String str2;
        boolean[] $jacocoInit = $jacocoInit();
        if (!SettingsManager.getInstance().isDebugEnabled()) {
            $jacocoInit[5] = true;
        } else {
            logTag(obj);
            $jacocoInit[6] = true;
            if (str.length() > 4000) {
                $jacocoInit[7] = true;
                int length = str.length() / 4000;
                $jacocoInit[8] = true;
                StringBuilder sb = new StringBuilder();
                sb.append("logMessage length = ");
                sb.append(str.length());
                sb.append(" divided to ");
                int i = length + 1;
                sb.append(i);
                sb.append(" chunks");
                sb.toString();
                int i2 = 0;
                $jacocoInit[9] = true;
                while (i2 <= length) {
                    int i3 = i2 + 1;
                    int i4 = i3 * 4000;
                    $jacocoInit[10] = true;
                    if (i4 >= str.length()) {
                        $jacocoInit[11] = true;
                        str2 = str.substring(i2 * 4000);
                        $jacocoInit[12] = true;
                    } else {
                        str2 = str.substring(i2 * 4000, i4);
                        $jacocoInit[13] = true;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("chunk ");
                    sb2.append(i3);
                    sb2.append(" of ");
                    sb2.append(i);
                    sb2.append(":\n");
                    sb2.append(str2);
                    sb2.toString();
                    $jacocoInit[14] = true;
                    i2 = i3;
                }
                $jacocoInit[15] = true;
            } else {
                $jacocoInit[16] = true;
            }
        }
        $jacocoInit[17] = true;
    }

    /* renamed from: w */
    public static void m46627w(@C0193h0 Object obj, @C0193h0 String str) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!SettingsManager.getInstance().isDebugEnabled()) {
            $jacocoInit[34] = true;
            return;
        }
        logTag(obj);
        $jacocoInit[35] = true;
    }

    public static void wtf(@C0193h0 Object obj, @C0193h0 String str) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!SettingsManager.getInstance().isDebugEnabled()) {
            $jacocoInit[42] = true;
            return;
        }
        logTag(obj);
        $jacocoInit[43] = true;
    }

    /* renamed from: e */
    public static void m46624e(@C0193h0 Object obj, @C0193h0 String str, @C0193h0 Throwable th) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!SettingsManager.getInstance().isDebugEnabled()) {
            $jacocoInit[38] = true;
        } else {
            $jacocoInit[39] = true;
            logTag(obj);
            $jacocoInit[40] = true;
        }
        $jacocoInit[41] = true;
    }

    public static void wtf(@C0193h0 Object obj, @C0193h0 String str, @C0193h0 Throwable th) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!SettingsManager.getInstance().isDebugEnabled()) {
            $jacocoInit[44] = true;
            return;
        }
        logTag(obj);
        $jacocoInit[45] = true;
    }
}
