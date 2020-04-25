package com.google.android.material.p187p;

import android.graphics.RectF;
import androidx.annotation.C0193h0;
import java.util.Arrays;

/* renamed from: com.google.android.material.p.m */
/* compiled from: RelativeCornerSize */
public final class C6984m implements C6971d {

    /* renamed from: a */
    private final float f19596a;

    public C6984m(float f) {
        this.f19596a = f;
    }

    /* renamed from: a */
    public float mo27852a() {
        return this.f19596a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6984m)) {
            return false;
        }
        if (this.f19596a != ((C6984m) obj).f19596a) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f19596a)});
    }

    /* renamed from: a */
    public float mo27763a(@C0193h0 RectF rectF) {
        return this.f19596a * rectF.height();
    }
}
