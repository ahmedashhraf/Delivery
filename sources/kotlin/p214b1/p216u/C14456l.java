package kotlin.p214b1.p216u;

import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.b1.u.l */
/* compiled from: PrimitiveSpreadBuilders.kt */
public final class C14456l extends C14494x0<boolean[]> {

    /* renamed from: d */
    private final boolean[] f42584d;

    public C14456l(int i) {
        super(i);
        this.f42584d = new boolean[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo45575b(@C6003d boolean[] zArr) {
        C14445h0.m62478f(zArr, "$receiver");
        return zArr.length;
    }

    @C6003d
    /* renamed from: c */
    public final boolean[] mo45577c() {
        return (boolean[]) mo45660a(this.f42584d, new boolean[mo45663b()]);
    }

    /* renamed from: a */
    public final void mo45604a(boolean z) {
        boolean[] zArr = this.f42584d;
        int a = mo45659a();
        mo45661a(a + 1);
        zArr[a] = z;
    }
}
