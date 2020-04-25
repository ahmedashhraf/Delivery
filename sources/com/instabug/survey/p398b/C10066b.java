package com.instabug.survey.p398b;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.b.b */
/* compiled from: KeyboardUtils */
public class C10066b {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26795a;

    /* renamed from: a */
    public static void m46827a(Activity activity) {
        boolean[] a = m46829a();
        if (activity == null) {
            a[1] = true;
        } else {
            a[2] = true;
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            a[3] = true;
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus != null) {
                a[4] = true;
            } else {
                a[5] = true;
                currentFocus = new View(activity);
                a[6] = true;
            }
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            a[7] = true;
        }
        a[8] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m46829a() {
        boolean[] zArr = f26795a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1104366475917982482L, "com/instabug/survey/utils/KeyboardUtils", 11);
        f26795a = a;
        return a;
    }

    /* renamed from: a */
    public static void m46828a(Activity activity, EditText editText) {
        boolean[] a = m46829a();
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        a[9] = true;
        inputMethodManager.showSoftInput(editText, 1);
        a[10] = true;
    }
}
