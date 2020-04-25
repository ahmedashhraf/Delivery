package kotlin.p214b1.p216u;

import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.b1.u.m0 */
/* compiled from: PrimitiveSpreadBuilders.kt */
public final class C14460m0 extends C14494x0<long[]> {

    /* renamed from: d */
    private final long[] f42592d;

    public C14460m0(int i) {
        super(i);
        this.f42592d = new long[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo45575b(@C6003d long[] jArr) {
        C14445h0.m62478f(jArr, "$receiver");
        return jArr.length;
    }

    @C6003d
    /* renamed from: c */
    public final long[] mo45577c() {
        return (long[]) mo45660a(this.f42592d, new long[mo45663b()]);
    }

    /* renamed from: a */
    public final void mo45606a(long j) {
        long[] jArr = this.f42592d;
        int a = mo45659a();
        mo45661a(a + 1);
        jArr[a] = j;
    }
}
