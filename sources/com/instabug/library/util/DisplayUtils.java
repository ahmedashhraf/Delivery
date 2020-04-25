package com.instabug.library.util;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class DisplayUtils {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-9052009179636252262L, "com/instabug/library/util/DisplayUtils", 5);
        $jacocoData = a;
        return a;
    }

    public DisplayUtils() {
        $jacocoInit()[0] = true;
    }

    public static int dpToPx(Resources resources, int i) {
        boolean[] $jacocoInit = $jacocoInit();
        int round = Math.round(((float) i) * (resources.getDisplayMetrics().xdpi / 160.0f));
        $jacocoInit[4] = true;
        return round;
    }

    public static int getDisplayHeightInPx(Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        $jacocoInit[1] = true;
        Point point = new Point();
        $jacocoInit[2] = true;
        defaultDisplay.getSize(point);
        int i = point.y;
        $jacocoInit[3] = true;
        return i;
    }
}
