package com.instabug.library.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import androidx.annotation.C0193h0;
import androidx.core.content.C0841b;
import com.instabug.library.C9700R;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.settings.SettingsManager;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class StatusBarUtils {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(7432274974930608803L, "com/instabug/library/util/StatusBarUtils", 36);
        $jacocoData = a;
        return a;
    }

    public StatusBarUtils() {
        $jacocoInit()[0] = true;
    }

    private static int darkenColor(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        float[] fArr = new float[3];
        $jacocoInit[33] = true;
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 0.8f;
        $jacocoInit[34] = true;
        int HSVToColor = Color.HSVToColor(fArr);
        $jacocoInit[35] = true;
        return HSVToColor;
    }

    public static void darkenStatusBarColor(@C0193h0 Activity activity, int i) {
        int i2;
        boolean[] $jacocoInit = $jacocoInit();
        if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
            $jacocoInit[20] = true;
            i2 = darkenColor(i);
            $jacocoInit[21] = true;
        } else {
            i2 = darkenColor(C0841b.m4915a((Context) activity, C9700R.C9702color.instabug_toolbar_color_dark));
            $jacocoInit[22] = true;
        }
        if (VERSION.SDK_INT < 21) {
            $jacocoInit[23] = true;
        } else {
            $jacocoInit[24] = true;
            Window window = activity.getWindow();
            $jacocoInit[25] = true;
            window.addFlags(Integer.MIN_VALUE);
            $jacocoInit[26] = true;
            window.setStatusBarColor(i2);
            $jacocoInit[27] = true;
        }
        if (VERSION.SDK_INT < 23) {
            $jacocoInit[28] = true;
        } else {
            $jacocoInit[29] = true;
            View decorView = activity.getWindow().getDecorView();
            $jacocoInit[30] = true;
            decorView.setSystemUiVisibility(0);
            $jacocoInit[31] = true;
        }
        $jacocoInit[32] = true;
    }

    public static void setStatusBar(Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (VERSION.SDK_INT < 21) {
            $jacocoInit[1] = true;
        } else {
            $jacocoInit[2] = true;
            Window window = activity.getWindow();
            $jacocoInit[3] = true;
            window.addFlags(Integer.MIN_VALUE);
            $jacocoInit[4] = true;
            window.setStatusBarColor(SettingsManager.getInstance().getStatusBarColor());
            $jacocoInit[5] = true;
        }
        if (VERSION.SDK_INT < 23) {
            $jacocoInit[6] = true;
        } else {
            $jacocoInit[7] = true;
            View decorView = activity.getWindow().getDecorView();
            $jacocoInit[8] = true;
            if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
                $jacocoInit[9] = true;
                decorView.setSystemUiVisibility(8192);
                $jacocoInit[10] = true;
            } else {
                decorView.setSystemUiVisibility(0);
                $jacocoInit[11] = true;
            }
        }
        $jacocoInit[12] = true;
    }

    public static void setStatusBarForDialog(@C0193h0 Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (VERSION.SDK_INT < 19) {
            $jacocoInit[13] = true;
        } else {
            $jacocoInit[14] = true;
            Window window = activity.getWindow();
            $jacocoInit[15] = true;
            window.setFlags(512, 512);
            $jacocoInit[16] = true;
            View decorView = activity.getWindow().getDecorView();
            $jacocoInit[17] = true;
            decorView.setSystemUiVisibility(4096);
            $jacocoInit[18] = true;
        }
        $jacocoInit[19] = true;
    }
}
