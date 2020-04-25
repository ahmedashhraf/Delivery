package com.google.android.material.bottomappbar;

import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import com.google.android.material.p187p.C6974g;
import com.google.android.material.p187p.C6993q;

/* renamed from: com.google.android.material.bottomappbar.a */
/* compiled from: BottomAppBarTopEdgeTreatment */
public class C5642a extends C6974g implements Cloneable {

    /* renamed from: Q */
    private static final int f16173Q = 90;

    /* renamed from: R */
    private static final int f16174R = 180;

    /* renamed from: S */
    private static final int f16175S = 270;

    /* renamed from: T */
    private static final int f16176T = 180;

    /* renamed from: N */
    private float f16177N;

    /* renamed from: O */
    private float f16178O;

    /* renamed from: P */
    private float f16179P;

    /* renamed from: a */
    private float f16180a;

    /* renamed from: b */
    private float f16181b;

    public C5642a(float f, float f2, float f3) {
        this.f16181b = f;
        this.f16180a = f2;
        this.f16178O = f3;
        if (f3 >= 0.0f) {
            this.f16179P = 0.0f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* renamed from: a */
    public void mo22347a(float f, float f2, float f3, @C0193h0 C6993q qVar) {
        float f4 = f;
        C6993q qVar2 = qVar;
        float f5 = this.f16177N;
        if (f5 == 0.0f) {
            qVar2.mo27907a(f4, 0.0f);
            return;
        }
        float f6 = ((this.f16181b * 2.0f) + f5) / 2.0f;
        float f7 = f3 * this.f16180a;
        float f8 = f2 + this.f16179P;
        float f9 = (this.f16178O * f3) + ((1.0f - f3) * f6);
        if (f9 / f6 >= 1.0f) {
            qVar2.mo27907a(f4, 0.0f);
            return;
        }
        float f10 = f6 + f7;
        float f11 = f9 + f7;
        float sqrt = (float) Math.sqrt((double) ((f10 * f10) - (f11 * f11)));
        float f12 = f8 - sqrt;
        float f13 = f8 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f11)));
        float f14 = 90.0f - degrees;
        qVar2.mo27907a(f12, 0.0f);
        float f15 = f7 * 2.0f;
        float f16 = degrees;
        qVar.mo27909a(f12 - f7, 0.0f, f12 + f7, f15, 270.0f, degrees);
        qVar.mo27909a(f8 - f6, (-f6) - f9, f8 + f6, f6 - f9, 180.0f - f14, (f14 * 2.0f) - 180.0f);
        qVar.mo27909a(f13 - f7, 0.0f, f13 + f7, f15, 270.0f - f16, f16);
        qVar2.mo27907a(f4, 0.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo22348b(float f) {
        this.f16181b = f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public float mo22349c() {
        return this.f16178O;
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: d */
    public void mo22352d(float f) {
        this.f16177N = f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo22354e(float f) {
        this.f16179P = f;
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: f */
    public float mo22355f() {
        return this.f16177N;
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: g */
    public float mo22356g() {
        return this.f16179P;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo22350c(float f) {
        this.f16180a = f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public float mo22351d() {
        return this.f16181b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public float mo22353e() {
        return this.f16180a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22346a(float f) {
        this.f16178O = f;
    }
}
