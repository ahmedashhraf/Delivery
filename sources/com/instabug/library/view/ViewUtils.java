package com.instabug.library.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class ViewUtils {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-6891894624569201674L, "com/instabug/library/view/ViewUtils", 4);
        $jacocoData = a;
        return a;
    }

    public ViewUtils() {
        $jacocoInit()[0] = true;
    }

    public static int convertDpToPx(Context context, float f) {
        boolean[] $jacocoInit = $jacocoInit();
        Resources resources = context.getResources();
        $jacocoInit[1] = true;
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        $jacocoInit[2] = true;
        int applyDimension = (int) TypedValue.applyDimension(1, f, displayMetrics);
        $jacocoInit[3] = true;
        return applyDimension;
    }
}
