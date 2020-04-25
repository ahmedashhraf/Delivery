package kotlin.p214b1.p216u;

import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.b1.u.j1 */
/* compiled from: PrimitiveSpreadBuilders.kt */
public final class C14452j1 extends C14494x0<short[]> {

    /* renamed from: d */
    private final short[] f42580d;

    public C14452j1(int i) {
        super(i);
        this.f42580d = new short[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo45575b(@C6003d short[] sArr) {
        C14445h0.m62478f(sArr, "$receiver");
        return sArr.length;
    }

    @C6003d
    /* renamed from: c */
    public final short[] mo45577c() {
        return (short[]) mo45660a(this.f42580d, new short[mo45663b()]);
    }

    /* renamed from: a */
    public final void mo45596a(short s) {
        short[] sArr = this.f42580d;
        int a = mo45659a();
        mo45661a(a + 1);
        sArr[a] = s;
    }
}
