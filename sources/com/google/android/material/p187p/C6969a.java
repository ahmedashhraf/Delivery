package com.google.android.material.p187p;

import android.graphics.RectF;
import androidx.annotation.C0193h0;
import java.util.Arrays;

/* renamed from: com.google.android.material.p.a */
/* compiled from: AbsoluteCornerSize */
public final class C6969a implements C6971d {

    /* renamed from: a */
    private final float f19529a;

    public C6969a(float f) {
        this.f19529a = f;
    }

    /* renamed from: a */
    public float mo27763a(@C0193h0 RectF rectF) {
        return this.f19529a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6969a)) {
            return false;
        }
        if (this.f19529a != ((C6969a) obj).f19529a) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f19529a)});
    }

    /* renamed from: a */
    public float mo27762a() {
        return this.f19529a;
    }
}
