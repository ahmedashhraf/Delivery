package com.github.aakira.expandablelayout;

import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.annotation.C0237z;
import p053b.p065e.p066b.p067a.C2116a;
import p053b.p065e.p066b.p067a.C2117b;
import p053b.p065e.p066b.p067a.C2118c;

/* renamed from: com.github.aakira.expandablelayout.g */
/* compiled from: Utils */
public class C3911g {

    /* renamed from: a */
    public static final int f12382a = 0;

    /* renamed from: b */
    public static final int f12383b = 1;

    /* renamed from: c */
    public static final int f12384c = 2;

    /* renamed from: d */
    public static final int f12385d = 3;

    /* renamed from: e */
    public static final int f12386e = 4;

    /* renamed from: f */
    public static final int f12387f = 5;

    /* renamed from: g */
    public static final int f12388g = 6;

    /* renamed from: h */
    public static final int f12389h = 7;

    /* renamed from: i */
    public static final int f12390i = 8;

    /* renamed from: j */
    public static final int f12391j = 9;

    /* renamed from: k */
    public static final int f12392k = 10;

    /* renamed from: a */
    public static TimeInterpolator m17082a(@C0237z(from = 0, mo691to = 10) int i) {
        switch (i) {
            case 0:
                return new AccelerateDecelerateInterpolator();
            case 1:
                return new AccelerateInterpolator();
            case 2:
                return new AnticipateInterpolator();
            case 3:
                return new AnticipateOvershootInterpolator();
            case 4:
                return new BounceInterpolator();
            case 5:
                return new DecelerateInterpolator();
            case 6:
                return new C2116a();
            case 7:
                return new C2117b();
            case 8:
                return new LinearInterpolator();
            case 9:
                return new C2118c();
            case 10:
                return new OvershootInterpolator();
            default:
                return new LinearInterpolator();
        }
    }
}
