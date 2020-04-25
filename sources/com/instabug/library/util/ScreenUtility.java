package com.instabug.library.util;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class ScreenUtility {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-8294281647365146003L, "com/instabug/library/util/ScreenUtility", 23);
        $jacocoData = a;
        return a;
    }

    public ScreenUtility() {
        $jacocoInit()[0] = true;
    }

    public static int getNavigationBarHeight(Resources resources) {
        boolean[] $jacocoInit = $jacocoInit();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            $jacocoInit[20] = true;
            int dimensionPixelSize = resources.getDimensionPixelSize(identifier);
            $jacocoInit[21] = true;
            return dimensionPixelSize;
        }
        $jacocoInit[22] = true;
        return 0;
    }

    public static int getNavigationBarWidth(Resources resources) {
        boolean[] $jacocoInit = $jacocoInit();
        int identifier = resources.getIdentifier("navigation_bar_width", "dimen", "android");
        if (identifier > 0) {
            $jacocoInit[17] = true;
            int dimensionPixelSize = resources.getDimensionPixelSize(identifier);
            $jacocoInit[18] = true;
            return dimensionPixelSize;
        }
        $jacocoInit[19] = true;
        return 0;
    }

    public static int getScreenHeight(Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        $jacocoInit[1] = true;
        WindowManager windowManager = activity.getWindowManager();
        $jacocoInit[2] = true;
        Display defaultDisplay = windowManager.getDefaultDisplay();
        $jacocoInit[3] = true;
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        $jacocoInit[4] = true;
        return i;
    }

    public static boolean hasNavBar(Resources resources) {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        $jacocoInit[11] = true;
        if (identifier <= 0) {
            $jacocoInit[12] = true;
        } else if (!resources.getBoolean(identifier)) {
            $jacocoInit[13] = true;
        } else {
            $jacocoInit[14] = true;
            z = true;
            $jacocoInit[16] = true;
            return z;
        }
        z = false;
        $jacocoInit[15] = true;
        $jacocoInit[16] = true;
        return z;
    }

    public static boolean isLandscape(Activity activity) {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        $jacocoInit[5] = true;
        WindowManager windowManager = activity.getWindowManager();
        $jacocoInit[6] = true;
        Display defaultDisplay = windowManager.getDefaultDisplay();
        $jacocoInit[7] = true;
        defaultDisplay.getMetrics(displayMetrics);
        if (displayMetrics.widthPixels > displayMetrics.heightPixels) {
            $jacocoInit[8] = true;
            z = true;
        } else {
            z = false;
            $jacocoInit[9] = true;
        }
        $jacocoInit[10] = true;
        return z;
    }
}
