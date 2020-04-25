package kotlin.p214b1.p216u;

import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.b1.u.z */
/* compiled from: PrimitiveSpreadBuilders.kt */
public final class C14497z extends C14494x0<float[]> {

    /* renamed from: d */
    private final float[] f42637d;

    public C14497z(int i) {
        super(i);
        this.f42637d = new float[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo45575b(@C6003d float[] fArr) {
        C14445h0.m62478f(fArr, "$receiver");
        return fArr.length;
    }

    @C6003d
    /* renamed from: c */
    public final float[] mo45577c() {
        return (float[]) mo45660a(this.f42637d, new float[mo45663b()]);
    }

    /* renamed from: a */
    public final void mo45670a(float f) {
        float[] fArr = this.f42637d;
        int a = mo45659a();
        mo45661a(a + 1);
        fArr[a] = f;
    }
}
