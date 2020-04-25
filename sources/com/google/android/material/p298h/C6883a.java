package com.google.android.material.p298h;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0198k;
import androidx.core.p018c.C0821b;
import com.google.android.material.C5582R;
import com.google.android.material.internal.C6936w;
import com.google.android.material.p185e.C5713a;
import com.google.android.material.p302m.C6951b;

/* renamed from: com.google.android.material.h.a */
/* compiled from: ElevationOverlayProvider */
public class C6883a {

    /* renamed from: e */
    private static final float f19223e = 4.5f;

    /* renamed from: f */
    private static final float f19224f = 2.0f;

    /* renamed from: a */
    private final boolean f19225a;

    /* renamed from: b */
    private final int f19226b;

    /* renamed from: c */
    private final int f19227c;

    /* renamed from: d */
    private final float f19228d;

    public C6883a(@C0193h0 Context context) {
        this.f19225a = C6951b.m33328a(context, C5582R.attr.elevationOverlayEnabled, false);
        this.f19226b = C5713a.m25188a(context, C5582R.attr.elevationOverlayColor, 0);
        this.f19227c = C5713a.m25188a(context, C5582R.attr.colorSurface, 0);
        this.f19228d = context.getResources().getDisplayMetrics().density;
    }

    @C0198k
    /* renamed from: a */
    public int mo27478a(float f, @C0193h0 View view) {
        return mo27485c(f + mo27475a(view));
    }

    @C0198k
    /* renamed from: b */
    public int mo27484b(@C0198k int i, float f, @C0193h0 View view) {
        return mo27483b(i, f + mo27475a(view));
    }

    @C0198k
    /* renamed from: c */
    public int mo27485c(float f) {
        return mo27483b(this.f19227c, f);
    }

    /* renamed from: c */
    public boolean mo27486c() {
        return this.f19225a;
    }

    @C0198k
    /* renamed from: a */
    public int mo27480a(@C0198k int i, float f, @C0193h0 View view) {
        return mo27479a(i, f + mo27475a(view));
    }

    @C0198k
    /* renamed from: b */
    public int mo27483b(@C0198k int i, float f) {
        return (!this.f19225a || !m33054a(i)) ? i : mo27479a(i, f);
    }

    @C0198k
    /* renamed from: a */
    public int mo27479a(@C0198k int i, float f) {
        float b = mo27481b(f);
        return C0821b.m4811d(C5713a.m25187a(C0821b.m4811d(i, 255), this.f19226b, b), Color.alpha(i));
    }

    /* renamed from: b */
    public float mo27481b(float f) {
        float f2 = this.f19228d;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f / f2))) * f19223e) + f19224f) / 100.0f, 1.0f);
    }

    @C0198k
    /* renamed from: b */
    public int mo27482b() {
        return this.f19227c;
    }

    /* renamed from: a */
    public int mo27477a(float f) {
        return Math.round(mo27481b(f) * 255.0f);
    }

    @C0198k
    /* renamed from: a */
    public int mo27476a() {
        return this.f19226b;
    }

    /* renamed from: a */
    public float mo27475a(@C0193h0 View view) {
        return C6936w.m33300d(view);
    }

    /* renamed from: a */
    private boolean m33054a(@C0198k int i) {
        return C0821b.m4811d(i, 255) == this.f19227c;
    }
}
