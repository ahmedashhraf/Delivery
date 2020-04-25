package com.google.zxing.p337v.p340e;

import java.util.Arrays;

/* renamed from: com.google.zxing.v.e.e */
/* compiled from: DefaultPlacement */
public class C9078e {

    /* renamed from: a */
    private final CharSequence f23753a;

    /* renamed from: b */
    private final int f23754b;

    /* renamed from: c */
    private final int f23755c;

    /* renamed from: d */
    private final byte[] f23756d;

    public C9078e(CharSequence charSequence, int i, int i2) {
        this.f23753a = charSequence;
        this.f23755c = i;
        this.f23754b = i2;
        this.f23756d = new byte[(i * i2)];
        Arrays.fill(this.f23756d, -1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final byte[] mo33071a() {
        return this.f23756d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo33072b() {
        return this.f23755c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo33073c() {
        return this.f23754b;
    }

    /* renamed from: d */
    public final void mo33074d() {
        int i;
        int i2;
        int i3 = 4;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i3 == this.f23754b && i4 == 0) {
                int i6 = i5 + 1;
                m42452a(i5);
                i5 = i6;
            }
            if (i3 == this.f23754b - 2 && i4 == 0 && this.f23755c % 4 != 0) {
                int i7 = i5 + 1;
                m42456b(i5);
                i5 = i7;
            }
            if (i3 == this.f23754b - 2 && i4 == 0 && this.f23755c % 8 == 4) {
                int i8 = i5 + 1;
                m42458c(i5);
                i5 = i8;
            }
            if (i3 == this.f23754b + 4 && i4 == 2 && this.f23755c % 8 == 0) {
                int i9 = i5 + 1;
                m42459d(i5);
                i5 = i9;
            }
            do {
                if (i3 < this.f23754b && i4 >= 0 && !m42457b(i4, i3)) {
                    int i10 = i5 + 1;
                    m42453a(i3, i4, i5);
                    i5 = i10;
                }
                i3 -= 2;
                i4 += 2;
                if (i3 < 0) {
                    break;
                }
            } while (i4 < this.f23755c);
            int i11 = i3 + 1;
            int i12 = i4 + 3;
            do {
                if (i11 >= 0 && i12 < this.f23755c && !m42457b(i12, i11)) {
                    int i13 = i5 + 1;
                    m42453a(i11, i12, i5);
                    i5 = i13;
                }
                i11 += 2;
                i12 -= 2;
                if (i11 >= this.f23754b) {
                    break;
                }
            } while (i12 >= 0);
            i3 = i11 + 3;
            i4 = i12 + 1;
            i = this.f23754b;
            if (i3 >= i) {
                i2 = this.f23755c;
                if (i4 >= i2) {
                    break;
                }
            }
        }
        if (!m42457b(i2 - 1, i - 1)) {
            m42455a(this.f23755c - 1, this.f23754b - 1, true);
            m42455a(this.f23755c - 2, this.f23754b - 2, true);
        }
    }

    /* renamed from: b */
    private boolean m42457b(int i, int i2) {
        return this.f23756d[(i2 * this.f23755c) + i] >= 0;
    }

    /* renamed from: c */
    private void m42458c(int i) {
        m42454a(this.f23754b - 3, 0, i, 1);
        m42454a(this.f23754b - 2, 0, i, 2);
        m42454a(this.f23754b - 1, 0, i, 3);
        m42454a(0, this.f23755c - 2, i, 4);
        m42454a(0, this.f23755c - 1, i, 5);
        m42454a(1, this.f23755c - 1, i, 6);
        m42454a(2, this.f23755c - 1, i, 7);
        m42454a(3, this.f23755c - 1, i, 8);
    }

    /* renamed from: a */
    public final boolean mo33070a(int i, int i2) {
        return this.f23756d[(i2 * this.f23755c) + i] == 1;
    }

    /* renamed from: a */
    private void m42455a(int i, int i2, boolean z) {
        this.f23756d[(i2 * this.f23755c) + i] = z ? (byte) 1 : 0;
    }

    /* renamed from: b */
    private void m42456b(int i) {
        m42454a(this.f23754b - 3, 0, i, 1);
        m42454a(this.f23754b - 2, 0, i, 2);
        m42454a(this.f23754b - 1, 0, i, 3);
        m42454a(0, this.f23755c - 4, i, 4);
        m42454a(0, this.f23755c - 3, i, 5);
        m42454a(0, this.f23755c - 2, i, 6);
        m42454a(0, this.f23755c - 1, i, 7);
        m42454a(1, this.f23755c - 1, i, 8);
    }

    /* renamed from: a */
    private void m42454a(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.f23754b;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.f23755c;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        boolean z = true;
        if ((this.f23753a.charAt(i3) & (1 << (8 - i4))) == 0) {
            z = false;
        }
        m42455a(i2, i, z);
    }

    /* renamed from: a */
    private void m42453a(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        m42454a(i4, i5, i3, 1);
        int i6 = i2 - 1;
        m42454a(i4, i6, i3, 2);
        int i7 = i - 1;
        m42454a(i7, i5, i3, 3);
        m42454a(i7, i6, i3, 4);
        m42454a(i7, i2, i3, 5);
        m42454a(i, i5, i3, 6);
        m42454a(i, i6, i3, 7);
        m42454a(i, i2, i3, 8);
    }

    /* renamed from: a */
    private void m42452a(int i) {
        m42454a(this.f23754b - 1, 0, i, 1);
        m42454a(this.f23754b - 1, 1, i, 2);
        m42454a(this.f23754b - 1, 2, i, 3);
        m42454a(0, this.f23755c - 2, i, 4);
        m42454a(0, this.f23755c - 1, i, 5);
        m42454a(1, this.f23755c - 1, i, 6);
        m42454a(2, this.f23755c - 1, i, 7);
        m42454a(3, this.f23755c - 1, i, 8);
    }

    /* renamed from: d */
    private void m42459d(int i) {
        m42454a(this.f23754b - 1, 0, i, 1);
        m42454a(this.f23754b - 1, this.f23755c - 1, i, 2);
        m42454a(0, this.f23755c - 3, i, 3);
        m42454a(0, this.f23755c - 2, i, 4);
        m42454a(0, this.f23755c - 1, i, 5);
        m42454a(1, this.f23755c - 3, i, 6);
        m42454a(1, this.f23755c - 2, i, 7);
        m42454a(1, this.f23755c - 1, i, 8);
    }
}
