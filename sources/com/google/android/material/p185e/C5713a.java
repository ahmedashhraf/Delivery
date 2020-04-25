package com.google.android.material.p185e;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.C0188f;
import androidx.annotation.C0193h0;
import androidx.annotation.C0198k;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0215r;
import androidx.core.p018c.C0821b;
import com.google.android.material.p302m.C6951b;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.e.a */
/* compiled from: MaterialColors */
public class C5713a {

    /* renamed from: a */
    public static final float f16570a = 1.0f;

    /* renamed from: b */
    public static final float f16571b = 0.54f;

    /* renamed from: c */
    public static final float f16572c = 0.38f;

    /* renamed from: d */
    public static final float f16573d = 0.32f;

    /* renamed from: e */
    public static final float f16574e = 0.12f;

    @C0198k
    /* renamed from: a */
    public static int m25190a(@C0193h0 View view, @C0188f int i) {
        return C6951b.m33325a(view, i);
    }

    @C0198k
    /* renamed from: b */
    public static int m25193b(@C0193h0 View view, @C0188f int i, @C0188f int i2) {
        return m25192a(view, i, i2, 1.0f);
    }

    @C0198k
    /* renamed from: a */
    public static int m25189a(Context context, @C0188f int i, String str) {
        return C6951b.m33329b(context, i, str);
    }

    @C0198k
    /* renamed from: a */
    public static int m25191a(@C0193h0 View view, @C0188f int i, @C0198k int i2) {
        return m25188a(view.getContext(), i, i2);
    }

    @C0198k
    /* renamed from: a */
    public static int m25188a(@C0193h0 Context context, @C0188f int i, @C0198k int i2) {
        TypedValue a = C6951b.m33326a(context, i);
        return a != null ? a.data : i2;
    }

    @C0198k
    /* renamed from: a */
    public static int m25192a(@C0193h0 View view, @C0188f int i, @C0188f int i2, @C0215r(from = 0.0d, mo670to = 1.0d) float f) {
        return m25187a(m25190a(view, i), m25190a(view, i2), f);
    }

    @C0198k
    /* renamed from: a */
    public static int m25187a(@C0198k int i, @C0198k int i2, @C0215r(from = 0.0d, mo670to = 1.0d) float f) {
        return m25186a(i, C0821b.m4811d(i2, Math.round(((float) Color.alpha(i2)) * f)));
    }

    @C0198k
    /* renamed from: a */
    public static int m25186a(@C0198k int i, @C0198k int i2) {
        return C0821b.m4810c(i2, i);
    }
}
