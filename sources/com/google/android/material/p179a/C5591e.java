package com.google.android.material.p179a;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Property;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.util.WeakHashMap;

/* renamed from: com.google.android.material.a.e */
/* compiled from: DrawableAlphaProperty */
public class C5591e extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f15936b = new C5591e();

    /* renamed from: a */
    private final WeakHashMap<Drawable, Integer> f15937a = new WeakHashMap<>();

    private C5591e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    @C0195i0
    /* renamed from: a */
    public Integer get(@C0193h0 Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f15937a.containsKey(drawable)) {
            return (Integer) this.f15937a.get(drawable);
        }
        return Integer.valueOf(255);
    }

    /* renamed from: a */
    public void set(@C0193h0 Drawable drawable, @C0193h0 Integer num) {
        if (VERSION.SDK_INT < 19) {
            this.f15937a.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
