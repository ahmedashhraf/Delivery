package p076c.p082c.p083a.p087t;

import androidx.core.app.C0753l;
import java.io.IOException;
import java.io.OutputStream;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: c.c.a.t.b */
/* compiled from: LZWEncoder */
class C2268b {

    /* renamed from: x */
    private static final int f9027x = -1;

    /* renamed from: y */
    static final int f9028y = 12;

    /* renamed from: z */
    static final int f9029z = 5003;

    /* renamed from: a */
    private int f9030a;

    /* renamed from: b */
    private int f9031b;

    /* renamed from: c */
    private byte[] f9032c;

    /* renamed from: d */
    private int f9033d;

    /* renamed from: e */
    private int f9034e;

    /* renamed from: f */
    private int f9035f;

    /* renamed from: g */
    int f9036g;

    /* renamed from: h */
    int f9037h = 12;

    /* renamed from: i */
    int f9038i;

    /* renamed from: j */
    int f9039j = 4096;

    /* renamed from: k */
    int[] f9040k = new int[f9029z];

    /* renamed from: l */
    int[] f9041l = new int[f9029z];

    /* renamed from: m */
    int f9042m = f9029z;

    /* renamed from: n */
    int f9043n = 0;

    /* renamed from: o */
    boolean f9044o = false;

    /* renamed from: p */
    int f9045p;

    /* renamed from: q */
    int f9046q;

    /* renamed from: r */
    int f9047r;

    /* renamed from: s */
    int f9048s = 0;

    /* renamed from: t */
    int f9049t = 0;

    /* renamed from: u */
    int[] f9050u = {0, 1, 3, 7, 15, 31, 63, C13959t.f40827P1, 255, C0753l.f3451u, 1023, 2047, 4095, 8191, 16383, 32767, 65535};

    /* renamed from: v */
    int f9051v;

    /* renamed from: w */
    byte[] f9052w = new byte[256];

    C2268b(int i, int i2, byte[] bArr, int i3) {
        this.f9030a = i;
        this.f9031b = i2;
        this.f9032c = bArr;
        this.f9033d = Math.max(2, i3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo9617a(int i) {
        return (1 << i) - 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9618a(byte b, OutputStream outputStream) throws IOException {
        byte[] bArr = this.f9052w;
        int i = this.f9051v;
        this.f9051v = i + 1;
        bArr[i] = b;
        if (this.f9051v >= 254) {
            mo9624c(outputStream);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9621b(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.f9040k[i2] = -1;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo9624c(OutputStream outputStream) throws IOException {
        int i = this.f9051v;
        if (i > 0) {
            outputStream.write(i);
            outputStream.write(this.f9052w, 0, this.f9051v);
            this.f9051v = 0;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9623b(OutputStream outputStream) throws IOException {
        outputStream.write(this.f9033d);
        this.f9034e = this.f9030a * this.f9031b;
        this.f9035f = 0;
        mo9619a(this.f9033d + 1, outputStream);
        outputStream.write(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9620a(OutputStream outputStream) throws IOException {
        mo9621b(this.f9042m);
        int i = this.f9046q;
        this.f9043n = i + 2;
        this.f9044o = true;
        mo9622b(i, outputStream);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9622b(int i, OutputStream outputStream) throws IOException {
        int i2 = this.f9048s;
        int[] iArr = this.f9050u;
        int i3 = this.f9049t;
        this.f9048s = i2 & iArr[i3];
        if (i3 > 0) {
            this.f9048s |= i << i3;
        } else {
            this.f9048s = i;
        }
        this.f9049t += this.f9036g;
        while (this.f9049t >= 8) {
            mo9618a((byte) (this.f9048s & 255), outputStream);
            this.f9048s >>= 8;
            this.f9049t -= 8;
        }
        if (this.f9043n > this.f9038i || this.f9044o) {
            if (this.f9044o) {
                int i4 = this.f9045p;
                this.f9036g = i4;
                this.f9038i = mo9617a(i4);
                this.f9044o = false;
            } else {
                this.f9036g++;
                int i5 = this.f9036g;
                if (i5 == this.f9037h) {
                    this.f9038i = this.f9039j;
                } else {
                    this.f9038i = mo9617a(i5);
                }
            }
        }
        if (i == this.f9047r) {
            while (this.f9049t > 0) {
                mo9618a((byte) (this.f9048s & 255), outputStream);
                this.f9048s >>= 8;
                this.f9049t -= 8;
            }
            mo9624c(outputStream);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9619a(int i, OutputStream outputStream) throws IOException {
        this.f9045p = i;
        int i2 = 0;
        this.f9044o = false;
        this.f9036g = this.f9045p;
        this.f9038i = mo9617a(this.f9036g);
        this.f9046q = 1 << (i - 1);
        int i3 = this.f9046q;
        this.f9047r = i3 + 1;
        this.f9043n = i3 + 2;
        this.f9051v = 0;
        int a = m11886a();
        for (int i4 = this.f9042m; i4 < 65536; i4 *= 2) {
            i2++;
        }
        int i5 = 8 - i2;
        int i6 = this.f9042m;
        mo9621b(i6);
        mo9622b(this.f9046q, outputStream);
        while (true) {
            int a2 = m11886a();
            if (a2 != -1) {
                int i7 = (a2 << this.f9037h) + a;
                int i8 = (a2 << i5) ^ a;
                int[] iArr = this.f9040k;
                if (iArr[i8] == i7) {
                    a = this.f9041l[i8];
                } else if (iArr[i8] >= 0) {
                    int i9 = i6 - i8;
                    if (i8 == 0) {
                        i9 = 1;
                    }
                    while (true) {
                        i8 -= i9;
                        if (i8 < 0) {
                            i8 += i6;
                        }
                        int[] iArr2 = this.f9040k;
                        if (iArr2[i8] != i7) {
                            if (iArr2[i8] < 0) {
                                break;
                            }
                        } else {
                            a = this.f9041l[i8];
                            break;
                        }
                    }
                } else {
                    mo9622b(a, outputStream);
                    int i10 = this.f9043n;
                    if (i10 < this.f9039j) {
                        int[] iArr3 = this.f9041l;
                        this.f9043n = i10 + 1;
                        iArr3[i8] = i10;
                        this.f9040k[i8] = i7;
                    } else {
                        mo9620a(outputStream);
                    }
                    a = a2;
                }
            } else {
                mo9622b(a, outputStream);
                mo9622b(this.f9047r, outputStream);
                return;
            }
        }
    }

    /* renamed from: a */
    private int m11886a() {
        int i = this.f9034e;
        if (i == 0) {
            return -1;
        }
        this.f9034e = i - 1;
        byte[] bArr = this.f9032c;
        int i2 = this.f9035f;
        this.f9035f = i2 + 1;
        return bArr[i2] & 255;
    }
}
