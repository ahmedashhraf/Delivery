package kotlin.p214b1.p216u;

import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.b1.u.g0 */
/* compiled from: PrimitiveSpreadBuilders.kt */
public final class C14442g0 extends C14494x0<int[]> {

    /* renamed from: d */
    private final int[] f42570d;

    public C14442g0(int i) {
        super(i);
        this.f42570d = new int[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo45575b(@C6003d int[] iArr) {
        C14445h0.m62478f(iArr, "$receiver");
        return iArr.length;
    }

    @C6003d
    /* renamed from: c */
    public final int[] mo45577c() {
        return (int[]) mo45660a(this.f42570d, new int[mo45663b()]);
    }

    /* renamed from: b */
    public final void mo45576b(int i) {
        int[] iArr = this.f42570d;
        int a = mo45659a();
        mo45661a(a + 1);
        iArr[a] = i;
    }
}
