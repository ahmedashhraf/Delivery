package com.google.android.material.p187p;

import android.graphics.RectF;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.util.Arrays;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.p.b */
/* compiled from: AdjustedCornerSize */
public final class C6970b implements C6971d {

    /* renamed from: a */
    private final C6971d f19530a;

    /* renamed from: b */
    private final float f19531b;

    public C6970b(float f, @C0193h0 C6971d dVar) {
        while (dVar instanceof C6970b) {
            dVar = ((C6970b) dVar).f19530a;
            f += ((C6970b) dVar).f19531b;
        }
        this.f19530a = dVar;
        this.f19531b = f;
    }

    /* renamed from: a */
    public float mo27763a(@C0193h0 RectF rectF) {
        return Math.max(0.0f, this.f19530a.mo27763a(rectF) + this.f19531b);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6970b)) {
            return false;
        }
        C6970b bVar = (C6970b) obj;
        if (!this.f19530a.equals(bVar.f19530a) || this.f19531b != bVar.f19531b) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19530a, Float.valueOf(this.f19531b)});
    }
}
