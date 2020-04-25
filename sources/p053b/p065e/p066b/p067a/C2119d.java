package p053b.p065e.p066b.p067a;

import android.view.animation.Interpolator;

/* renamed from: b.e.b.a.d */
/* compiled from: LookupTableInterpolator */
abstract class C2119d implements Interpolator {

    /* renamed from: a */
    private final float[] f8445a;

    /* renamed from: b */
    private final float f8446b = (1.0f / ((float) (this.f8445a.length - 1)));

    protected C2119d(float[] fArr) {
        this.f8445a = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f8445a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = (float) min;
        float f3 = this.f8446b;
        float f4 = (f - (f2 * f3)) / f3;
        float[] fArr2 = this.f8445a;
        return fArr2[min] + (f4 * (fArr2[min + 1] - fArr2[min]));
    }
}
