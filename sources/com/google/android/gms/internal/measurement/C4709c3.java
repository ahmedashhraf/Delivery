package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.c3 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4709c3 extends C4832k3 {

    /* renamed from: Q */
    private final int f14023Q;

    /* renamed from: R */
    private final int f14024R;

    C4709c3(byte[] bArr, int i, int i2) {
        super(bArr);
        C5070z2.m21871b(i, i + i2, bArr.length);
        this.f14023Q = i;
        this.f14024R = i2;
    }

    /* renamed from: a */
    public final byte mo18882a(int i) {
        int a = mo18883a();
        if (((a - (i + 1)) | i) >= 0) {
            return this.f14238P[this.f14023Q + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(a);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final byte mo18884e(int i) {
        return this.f14238P[this.f14023Q + i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int mo18885l() {
        return this.f14023Q;
    }

    /* renamed from: a */
    public final int mo18883a() {
        return this.f14024R;
    }
}
