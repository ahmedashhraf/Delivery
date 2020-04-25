package com.instabug.library.util;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class KeyboardUtils {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1533344811420510329L, "com/instabug/library/util/KeyboardUtils", 10);
        $jacocoData = a;
        return a;
    }

    public KeyboardUtils() {
        $jacocoInit()[0] = true;
    }

    public static void hide(Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (activity == null) {
            $jacocoInit[1] = true;
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        $jacocoInit[2] = true;
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            $jacocoInit[3] = true;
        } else {
            $jacocoInit[4] = true;
            currentFocus = new View(activity);
            $jacocoInit[5] = true;
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        $jacocoInit[6] = true;
    }

    public static void showKeyboard(Activity activity, EditText editText) {
        boolean[] $jacocoInit = $jacocoInit();
        if (activity == null) {
            $jacocoInit[7] = true;
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        $jacocoInit[8] = true;
        inputMethodManager.showSoftInput(editText, 1);
        $jacocoInit[9] = true;
    }
}
