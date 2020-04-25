package p076c.p082c.p083a.p086s;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: c.c.a.s.d */
/* compiled from: GifHeaderParser */
public class C2266d {

    /* renamed from: e */
    public static final String f8996e = "GifHeaderParser";

    /* renamed from: f */
    static final int f8997f = 3;

    /* renamed from: g */
    static final int f8998g = 10;

    /* renamed from: h */
    private static final int f8999h = 256;

    /* renamed from: a */
    private final byte[] f9000a = new byte[256];

    /* renamed from: b */
    private ByteBuffer f9001b;

    /* renamed from: c */
    private C2265c f9002c;

    /* renamed from: d */
    private int f9003d = 0;

    /* renamed from: c */
    private boolean m11848c() {
        return this.f9002c.f8984b != 0;
    }

    /* renamed from: d */
    private int m11849d() {
        try {
            return this.f9001b.get() & 255;
        } catch (Exception unused) {
            this.f9002c.f8984b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    private void m11850e() {
        this.f9002c.f8986d.f8972a = m11857l();
        this.f9002c.f8986d.f8973b = m11857l();
        this.f9002c.f8986d.f8974c = m11857l();
        this.f9002c.f8986d.f8975d = m11857l();
        int d = m11849d();
        boolean z = false;
        boolean z2 = (d & 128) != 0;
        int pow = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        C2264b bVar = this.f9002c.f8986d;
        if ((d & 64) != 0) {
            z = true;
        }
        bVar.f8976e = z;
        if (z2) {
            this.f9002c.f8986d.f8982k = m11847a(pow);
        } else {
            this.f9002c.f8986d.f8982k = null;
        }
        this.f9002c.f8986d.f8981j = this.f9001b.position();
        m11860o();
        if (!m11848c()) {
            C2265c cVar = this.f9002c;
            cVar.f8985c++;
            cVar.f8987e.add(cVar.f8986d);
        }
    }

    /* renamed from: f */
    private int m11851f() {
        this.f9003d = m11849d();
        int i = 0;
        if (this.f9003d > 0) {
            int i2 = 0;
            while (i < this.f9003d) {
                try {
                    i2 = this.f9003d - i;
                    this.f9001b.get(this.f9000a, i, i2);
                    i += i2;
                } catch (Exception unused) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error Reading Block n: ");
                        sb.append(i);
                        sb.append(" count: ");
                        sb.append(i2);
                        sb.append(" blockSize: ");
                        sb.append(this.f9003d);
                        sb.toString();
                    }
                    this.f9002c.f8984b = 1;
                }
            }
        }
        return i;
    }

    /* renamed from: g */
    private void m11852g() {
        boolean z = false;
        while (!z && !m11848c()) {
            int d = m11849d();
            if (d == 33) {
                int d2 = m11849d();
                if (d2 == 1) {
                    m11859n();
                } else if (d2 == 249) {
                    this.f9002c.f8986d = new C2264b();
                    m11853h();
                } else if (d2 == 254) {
                    m11859n();
                } else if (d2 != 255) {
                    m11859n();
                } else {
                    m11851f();
                    String str = "";
                    for (int i = 0; i < 11; i++) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append((char) this.f9000a[i]);
                        str = sb.toString();
                    }
                    if (str.equals("NETSCAPE2.0")) {
                        m11856k();
                    } else {
                        m11859n();
                    }
                }
            } else if (d == 44) {
                C2265c cVar = this.f9002c;
                if (cVar.f8986d == null) {
                    cVar.f8986d = new C2264b();
                }
                m11850e();
            } else if (d != 59) {
                this.f9002c.f8984b = 1;
            } else {
                z = true;
            }
        }
    }

    /* renamed from: h */
    private void m11853h() {
        m11849d();
        int d = m11849d();
        C2264b bVar = this.f9002c.f8986d;
        bVar.f8978g = (d & 28) >> 2;
        boolean z = true;
        if (bVar.f8978g == 0) {
            bVar.f8978g = 1;
        }
        C2264b bVar2 = this.f9002c.f8986d;
        if ((d & 1) == 0) {
            z = false;
        }
        bVar2.f8977f = z;
        int l = m11857l();
        if (l < 3) {
            l = 10;
        }
        C2264b bVar3 = this.f9002c.f8986d;
        bVar3.f8980i = l * 10;
        bVar3.f8979h = m11849d();
        m11849d();
    }

    /* renamed from: i */
    private void m11854i() {
        String str = "";
        for (int i = 0; i < 6; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append((char) m11849d());
            str = sb.toString();
        }
        if (!str.startsWith("GIF")) {
            this.f9002c.f8984b = 1;
            return;
        }
        m11855j();
        if (this.f9002c.f8990h && !m11848c()) {
            C2265c cVar = this.f9002c;
            cVar.f8983a = m11847a(cVar.f8991i);
            C2265c cVar2 = this.f9002c;
            cVar2.f8994l = cVar2.f8983a[cVar2.f8992j];
        }
    }

    /* renamed from: j */
    private void m11855j() {
        this.f9002c.f8988f = m11857l();
        this.f9002c.f8989g = m11857l();
        int d = m11849d();
        this.f9002c.f8990h = (d & 128) != 0;
        C2265c cVar = this.f9002c;
        cVar.f8991i = 2 << (d & 7);
        cVar.f8992j = m11849d();
        this.f9002c.f8993k = m11849d();
    }

    /* renamed from: k */
    private void m11856k() {
        do {
            m11851f();
            byte[] bArr = this.f9000a;
            if (bArr[0] == 1) {
                this.f9002c.f8995m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f9003d <= 0) {
                return;
            }
        } while (!m11848c());
    }

    /* renamed from: l */
    private int m11857l() {
        return this.f9001b.getShort();
    }

    /* renamed from: m */
    private void m11858m() {
        this.f9001b = null;
        Arrays.fill(this.f9000a, 0);
        this.f9002c = new C2265c();
        this.f9003d = 0;
    }

    /* renamed from: n */
    private void m11859n() {
        int d;
        do {
            d = m11849d();
            ByteBuffer byteBuffer = this.f9001b;
            byteBuffer.position(byteBuffer.position() + d);
        } while (d > 0);
    }

    /* renamed from: o */
    private void m11860o() {
        m11849d();
        m11859n();
    }

    /* renamed from: a */
    public C2266d mo9603a(byte[] bArr) {
        m11858m();
        if (bArr != null) {
            this.f9001b = ByteBuffer.wrap(bArr);
            this.f9001b.rewind();
            this.f9001b.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f9001b = null;
            this.f9002c.f8984b = 2;
        }
        return this;
    }

    /* renamed from: b */
    public C2265c mo9605b() {
        if (this.f9001b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (m11848c()) {
            return this.f9002c;
        } else {
            m11854i();
            if (!m11848c()) {
                m11852g();
                C2265c cVar = this.f9002c;
                if (cVar.f8985c < 0) {
                    cVar.f8984b = 1;
                }
            }
            return this.f9002c;
        }
    }

    /* renamed from: a */
    public void mo9604a() {
        this.f9001b = null;
        this.f9002c = null;
    }

    /* renamed from: a */
    private int[] m11847a(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f9001b.get(bArr);
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
        } catch (BufferUnderflowException unused) {
            boolean isLoggable = Log.isLoggable("GifHeaderParser", 3);
            this.f9002c.f8984b = 1;
        }
        return iArr;
    }
}
