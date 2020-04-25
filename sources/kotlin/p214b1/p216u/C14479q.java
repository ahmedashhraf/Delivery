package kotlin.p214b1.p216u;

import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.b1.u.q */
/* compiled from: PrimitiveSpreadBuilders.kt */
public final class C14479q extends C14494x0<char[]> {

    /* renamed from: d */
    private final char[] f42605d;

    public C14479q(int i) {
        super(i);
        this.f42605d = new char[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo45575b(@C6003d char[] cArr) {
        C14445h0.m62478f(cArr, "$receiver");
        return cArr.length;
    }

    @C6003d
    /* renamed from: c */
    public final char[] mo45577c() {
        return (char[]) mo45660a(this.f42605d, new char[mo45663b()]);
    }

    /* renamed from: a */
    public final void mo45625a(char c) {
        char[] cArr = this.f42605d;
        int a = mo45659a();
        mo45661a(a + 1);
        cArr[a] = c;
    }
}
