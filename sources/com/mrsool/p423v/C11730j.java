package com.mrsool.p423v;

import android.app.Activity;
import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import androidx.annotation.C0193h0;
import androidx.annotation.C0198k;
import androidx.appcompat.widget.Toolbar;
import androidx.core.p034l.C0962e0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.C5608a;

/* renamed from: com.mrsool.v.j */
/* compiled from: StatusBarCompat */
public class C11730j {
    /* renamed from: a */
    static int m52795a(int i, int i2) {
        float f = 1.0f - (((float) i2) / 255.0f);
        int i3 = (i >> 8) & 255;
        int i4 = i & 255;
        double d = (double) (((float) ((i >> 16) & 255)) * f);
        Double.isNaN(d);
        int i5 = (int) (d + 0.5d);
        double d2 = (double) (((float) i3) * f);
        Double.isNaN(d2);
        int i6 = (int) (d2 + 0.5d);
        double d3 = (double) (((float) i4) * f);
        Double.isNaN(d3);
        return ((int) (d3 + 0.5d)) | (i5 << 16) | C0962e0.f4343t | (i6 << 8);
    }

    /* renamed from: b */
    public static void m52801b(@C0193h0 Activity activity) {
        if (VERSION.SDK_INT >= 23 && activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                View decorView = window.getDecorView();
                if (decorView != null) {
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                }
            }
        }
    }

    /* renamed from: c */
    public static void m52802c(@C0193h0 Activity activity) {
        m52800a(activity, false);
    }

    /* renamed from: a */
    public static void m52798a(@C0193h0 Activity activity, @C0198k int i, int i2) {
        m52797a(activity, m52795a(i, i2));
    }

    /* renamed from: a */
    public static void m52797a(@C0193h0 Activity activity, @C0198k int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 21) {
            C11733l.m52814a(activity, i);
        } else if (i2 >= 19) {
            C11731k.m52806a(activity, i);
        }
    }

    /* renamed from: a */
    public static void m52800a(@C0193h0 Activity activity, boolean z) {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            C11733l.m52816a(activity, z);
        } else if (i >= 19) {
            C11731k.m52809b(activity);
        }
    }

    /* renamed from: a */
    public static void m52799a(@C0193h0 Activity activity, AppBarLayout appBarLayout, C5608a aVar, Toolbar toolbar, @C0198k int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 21) {
            C11733l.m52815a(activity, appBarLayout, aVar, toolbar, i);
        } else if (i2 >= 19) {
            C11731k.m52807a(activity, appBarLayout, aVar, toolbar, i);
        }
    }

    /* renamed from: a */
    public static void m52796a(@C0193h0 Activity activity) {
        if (VERSION.SDK_INT >= 23 && activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                View decorView = window.getDecorView();
                if (decorView != null) {
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() ^ 8192);
                }
            }
        }
    }
}
