package kotlin.p214b1.p216u;

import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.b1.u.w */
/* compiled from: PrimitiveSpreadBuilders.kt */
public final class C14491w extends C14494x0<double[]> {

    /* renamed from: d */
    private final double[] f42624d;

    public C14491w(int i) {
        super(i);
        this.f42624d = new double[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo45575b(@C6003d double[] dArr) {
        C14445h0.m62478f(dArr, "$receiver");
        return dArr.length;
    }

    @C6003d
    /* renamed from: c */
    public final double[] mo45577c() {
        return (double[]) mo45660a(this.f42624d, new double[mo45663b()]);
    }

    /* renamed from: a */
    public final void mo45655a(double d) {
        double[] dArr = this.f42624d;
        int a = mo45659a();
        mo45661a(a + 1);
        dArr[a] = d;
    }
}
