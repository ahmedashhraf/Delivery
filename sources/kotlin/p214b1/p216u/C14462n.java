package kotlin.p214b1.p216u;

import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.b1.u.n */
/* compiled from: PrimitiveSpreadBuilders.kt */
public final class C14462n extends C14494x0<byte[]> {

    /* renamed from: d */
    private final byte[] f42593d;

    public C14462n(int i) {
        super(i);
        this.f42593d = new byte[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo45575b(@C6003d byte[] bArr) {
        C14445h0.m62478f(bArr, "$receiver");
        return bArr.length;
    }

    @C6003d
    /* renamed from: c */
    public final byte[] mo45577c() {
        return (byte[]) mo45660a(this.f42593d, new byte[mo45663b()]);
    }

    /* renamed from: a */
    public final void mo45608a(byte b) {
        byte[] bArr = this.f42593d;
        int a = mo45659a();
        mo45661a(a + 1);
        bArr[a] = b;
    }
}
