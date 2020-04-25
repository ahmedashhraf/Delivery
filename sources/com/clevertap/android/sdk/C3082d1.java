package com.clevertap.android.sdk;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.clevertap.android.sdk.d1 */
/* compiled from: GifHeaderParser */
class C3082d1 {

    /* renamed from: e */
    public static final String f11039e = "GifHeaderParser";

    /* renamed from: f */
    static final int f11040f = 2;

    /* renamed from: g */
    static final int f11041g = 10;

    /* renamed from: h */
    private static final int f11042h = 256;

    /* renamed from: a */
    private final byte[] f11043a = new byte[256];

    /* renamed from: b */
    private ByteBuffer f11044b;

    /* renamed from: c */
    private C3075c1 f11045c;

    /* renamed from: d */
    private int f11046d = 0;

    C3082d1() {
    }

    /* renamed from: d */
    private boolean m14777d() {
        return this.f11045c.f10994b != 0;
    }

    /* renamed from: e */
    private int m14778e() {
        try {
            return this.f11044b.get() & 255;
        } catch (Exception unused) {
            this.f11045c.f10994b = 1;
            return 0;
        }
    }

    /* renamed from: f */
    private void m14779f() {
        this.f11045c.f10996d.f10970a = m14786m();
        this.f11045c.f10996d.f10971b = m14786m();
        this.f11045c.f10996d.f10972c = m14786m();
        this.f11045c.f10996d.f10973d = m14786m();
        int e = m14778e();
        boolean z = false;
        boolean z2 = (e & 128) != 0;
        int pow = (int) Math.pow(2.0d, (double) ((e & 7) + 1));
        C3072b1 b1Var = this.f11045c.f10996d;
        if ((e & 64) != 0) {
            z = true;
        }
        b1Var.f10974e = z;
        if (z2) {
            this.f11045c.f10996d.f10980k = m14775a(pow);
        } else {
            this.f11045c.f10996d.f10980k = null;
        }
        this.f11045c.f10996d.f10979j = this.f11044b.position();
        m14789p();
        if (!m14777d()) {
            C3075c1 c1Var = this.f11045c;
            c1Var.f10995c++;
            c1Var.f10997e.add(c1Var.f10996d);
        }
    }

    /* renamed from: g */
    private int m14780g() {
        this.f11046d = m14778e();
        int i = 0;
        if (this.f11046d > 0) {
            while (i < this.f11046d) {
                try {
                    int i2 = this.f11046d - i;
                    this.f11044b.get(this.f11043a, i, i2);
                    i += i2;
                } catch (Exception unused) {
                    this.f11045c.f10994b = 1;
                }
            }
        }
        return i;
    }

    /* renamed from: h */
    private void m14781h() {
        m14776b(Integer.MAX_VALUE);
    }

    /* renamed from: i */
    private void m14782i() {
        m14778e();
        int e = m14778e();
        C3072b1 b1Var = this.f11045c.f10996d;
        b1Var.f10976g = (e & 28) >> 2;
        boolean z = true;
        if (b1Var.f10976g == 0) {
            b1Var.f10976g = 1;
        }
        C3072b1 b1Var2 = this.f11045c.f10996d;
        if ((e & 1) == 0) {
            z = false;
        }
        b1Var2.f10975f = z;
        int m = m14786m();
        if (m < 2) {
            m = 10;
        }
        C3072b1 b1Var3 = this.f11045c.f10996d;
        b1Var3.f10978i = m * 10;
        b1Var3.f10977h = m14778e();
        m14778e();
    }

    /* renamed from: j */
    private void m14783j() {
        String str = "";
        for (int i = 0; i < 6; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append((char) m14778e());
            str = sb.toString();
        }
        if (!str.startsWith("GIF")) {
            this.f11045c.f10994b = 1;
            return;
        }
        m14784k();
        if (this.f11045c.f11000h && !m14777d()) {
            C3075c1 c1Var = this.f11045c;
            c1Var.f10993a = m14775a(c1Var.f11001i);
            C3075c1 c1Var2 = this.f11045c;
            c1Var2.f11004l = c1Var2.f10993a[c1Var2.f11002j];
        }
    }

    /* renamed from: k */
    private void m14784k() {
        this.f11045c.f10998f = m14786m();
        this.f11045c.f10999g = m14786m();
        int e = m14778e();
        this.f11045c.f11000h = (e & 128) != 0;
        C3075c1 c1Var = this.f11045c;
        c1Var.f11001i = 2 << (e & 7);
        c1Var.f11002j = m14778e();
        this.f11045c.f11003k = m14778e();
    }

    /* renamed from: l */
    private void m14785l() {
        do {
            m14780g();
            byte[] bArr = this.f11043a;
            if (bArr[0] == 1) {
                byte b = bArr[1] & 255;
                byte b2 = bArr[2] & 255;
                C3075c1 c1Var = this.f11045c;
                c1Var.f11005m = (b2 << 8) | b;
                if (c1Var.f11005m == 0) {
                    c1Var.f11005m = -1;
                }
            }
            if (this.f11046d <= 0) {
                return;
            }
        } while (!m14777d());
    }

    /* renamed from: m */
    private int m14786m() {
        return this.f11044b.getShort();
    }

    /* renamed from: n */
    private void m14787n() {
        this.f11044b = null;
        Arrays.fill(this.f11043a, 0);
        this.f11045c = new C3075c1();
        this.f11046d = 0;
    }

    /* renamed from: o */
    private void m14788o() {
        int e;
        do {
            try {
                e = m14778e();
                this.f11044b.position(this.f11044b.position() + e);
            } catch (IllegalArgumentException unused) {
                return;
            }
        } while (e > 0);
    }

    /* renamed from: p */
    private void m14789p() {
        m14778e();
        m14788o();
    }

    /* renamed from: a */
    public C3082d1 mo12233a(ByteBuffer byteBuffer) {
        m14787n();
        this.f11044b = byteBuffer.asReadOnlyBuffer();
        this.f11044b.position(0);
        this.f11044b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /* renamed from: b */
    public boolean mo12236b() {
        m14783j();
        if (!m14777d()) {
            m14776b(2);
        }
        return this.f11045c.f10995c > 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C3075c1 mo12237c() {
        if (this.f11044b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (m14777d()) {
            return this.f11045c;
        } else {
            m14783j();
            if (!m14777d()) {
                m14781h();
                C3075c1 c1Var = this.f11045c;
                if (c1Var.f10995c < 0) {
                    c1Var.f10994b = 1;
                }
            }
            return this.f11045c;
        }
    }

    /* renamed from: b */
    private void m14776b(int i) {
        boolean z = false;
        while (!z && !m14777d() && this.f11045c.f10995c <= i) {
            int e = m14778e();
            if (e == 33) {
                int e2 = m14778e();
                if (e2 == 1) {
                    m14788o();
                } else if (e2 == 249) {
                    this.f11045c.f10996d = new C3072b1();
                    m14782i();
                } else if (e2 == 254) {
                    m14788o();
                } else if (e2 != 255) {
                    m14788o();
                } else {
                    m14780g();
                    String str = "";
                    for (int i2 = 0; i2 < 11; i2++) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append((char) this.f11043a[i2]);
                        str = sb.toString();
                    }
                    if (str.equals("NETSCAPE2.0")) {
                        m14785l();
                    } else {
                        m14788o();
                    }
                }
            } else if (e == 44) {
                C3075c1 c1Var = this.f11045c;
                if (c1Var.f10996d == null) {
                    c1Var.f10996d = new C3072b1();
                }
                m14779f();
            } else if (e != 59) {
                this.f11045c.f10994b = 1;
            } else {
                z = true;
            }
        }
    }

    /* renamed from: a */
    public C3082d1 mo12234a(byte[] bArr) {
        if (bArr != null) {
            mo12233a(ByteBuffer.wrap(bArr));
        } else {
            this.f11044b = null;
            this.f11045c.f10994b = 2;
        }
        return this;
    }

    /* renamed from: a */
    public void mo12235a() {
        this.f11044b = null;
        this.f11045c = null;
    }

    /* renamed from: a */
    private int[] m14775a(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f11044b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            C3111h1.m14932d("GifHeaderParser", "Format Error Reading Color Table", e);
            this.f11045c.f10994b = 1;
        }
        return iArr;
    }
}
