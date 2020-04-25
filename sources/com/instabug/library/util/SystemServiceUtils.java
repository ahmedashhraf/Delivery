package com.instabug.library.util;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class SystemServiceUtils {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-2521262007098000212L, "com/instabug/library/util/SystemServiceUtils", 6);
        $jacocoData = a;
        return a;
    }

    private SystemServiceUtils() {
        $jacocoInit()[0] = true;
    }

    public static void hideInputMethod(Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            $jacocoInit[1] = true;
        } else {
            $jacocoInit[2] = true;
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            $jacocoInit[3] = true;
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            $jacocoInit[4] = true;
        }
        $jacocoInit[5] = true;
    }
}
