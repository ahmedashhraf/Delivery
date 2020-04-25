package com.google.zxing.p350z.p354g;

/* renamed from: com.google.zxing.z.g.b */
/* compiled from: BarcodeRow */
final class C9183b {

    /* renamed from: a */
    private final byte[] f24132a;

    /* renamed from: b */
    private int f24133b = 0;

    C9183b(int i) {
        this.f24132a = new byte[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33284a(int i, byte b) {
        this.f24132a[i] = b;
    }

    /* renamed from: a */
    private void m42967a(int i, boolean z) {
        this.f24132a[i] = z ? (byte) 1 : 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33285a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f24133b;
            this.f24133b = i3 + 1;
            m42967a(i3, z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public byte[] mo33286a(int i) {
        byte[] bArr = new byte[(this.f24132a.length * i)];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = this.f24132a[i2 / i];
        }
        return bArr;
    }
}
