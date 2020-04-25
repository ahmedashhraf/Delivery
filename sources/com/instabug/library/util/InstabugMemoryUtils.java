package com.instabug.library.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InstabugMemoryUtils {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3148386426403902740L, "com/instabug/library/util/InstabugMemoryUtils", 8);
        $jacocoData = a;
        return a;
    }

    public InstabugMemoryUtils() {
        $jacocoInit()[0] = true;
    }

    public static boolean isLowMemory() {
        boolean[] $jacocoInit = $jacocoInit();
        Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
        if (currentActivity == null) {
            $jacocoInit[1] = true;
        } else {
            $jacocoInit[2] = true;
            ActivityManager activityManager = (ActivityManager) currentActivity.getSystemService("activity");
            $jacocoInit[3] = true;
            MemoryInfo memoryInfo = new MemoryInfo();
            if (activityManager == null) {
                $jacocoInit[4] = true;
            } else {
                $jacocoInit[5] = true;
                activityManager.getMemoryInfo(memoryInfo);
                boolean z = memoryInfo.lowMemory;
                $jacocoInit[6] = true;
                return z;
            }
        }
        $jacocoInit[7] = true;
        return true;
    }
}
