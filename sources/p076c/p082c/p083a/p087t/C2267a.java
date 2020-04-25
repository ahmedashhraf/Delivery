package p076c.p082c.p083a.p087t;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: c.c.a.t.a */
/* compiled from: AnimatedGifEncoder */
public class C2267a {

    /* renamed from: v */
    private static final String f9004v = "AnimatedGifEncoder";

    /* renamed from: w */
    private static final double f9005w = 4.0d;

    /* renamed from: a */
    private int f9006a;

    /* renamed from: b */
    private int f9007b;

    /* renamed from: c */
    private Integer f9008c = null;

    /* renamed from: d */
    private int f9009d;

    /* renamed from: e */
    private int f9010e = -1;

    /* renamed from: f */
    private int f9011f = 0;

    /* renamed from: g */
    private boolean f9012g = false;

    /* renamed from: h */
    private OutputStream f9013h;

    /* renamed from: i */
    private Bitmap f9014i;

    /* renamed from: j */
    private byte[] f9015j;

    /* renamed from: k */
    private byte[] f9016k;

    /* renamed from: l */
    private int f9017l;

    /* renamed from: m */
    private byte[] f9018m;

    /* renamed from: n */
    private boolean[] f9019n = new boolean[256];

    /* renamed from: o */
    private int f9020o = 7;

    /* renamed from: p */
    private int f9021p = -1;

    /* renamed from: q */
    private boolean f9022q = false;

    /* renamed from: r */
    private boolean f9023r = true;

    /* renamed from: s */
    private boolean f9024s = false;

    /* renamed from: t */
    private int f9025t = 10;

    /* renamed from: u */
    private boolean f9026u;

    /* renamed from: f */
    private int m11869f(int i) {
        if (this.f9018m == null) {
            return -1;
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        int length = this.f9018m.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 16777216;
        while (i2 < length) {
            byte[] bArr = this.f9018m;
            int i5 = i2 + 1;
            int i6 = red - (bArr[i2] & 255);
            int i7 = i5 + 1;
            int i8 = green - (bArr[i5] & 255);
            int i9 = blue - (bArr[i7] & 255);
            int i10 = (i6 * i6) + (i8 * i8) + (i9 * i9);
            int i11 = i7 / 3;
            if (this.f9019n[i11] && i10 < i4) {
                i4 = i10;
                i3 = i11;
            }
            i2 = i7 + 1;
        }
        return i3;
    }

    /* renamed from: g */
    private void m11871g() throws IOException {
        this.f9013h.write(33);
        this.f9013h.write(255);
        this.f9013h.write(11);
        m11865b("NETSCAPE2.0");
        this.f9013h.write(3);
        this.f9013h.write(1);
        m11872g(this.f9010e);
        this.f9013h.write(0);
    }

    /* renamed from: h */
    private void m11873h() throws IOException {
        OutputStream outputStream = this.f9013h;
        byte[] bArr = this.f9018m;
        outputStream.write(bArr, 0, bArr.length);
        int length = 768 - this.f9018m.length;
        for (int i = 0; i < length; i++) {
            this.f9013h.write(0);
        }
    }

    /* renamed from: i */
    private void m11874i() throws IOException {
        new C2268b(this.f9006a, this.f9007b, this.f9016k, this.f9017l).mo9623b(this.f9013h);
    }

    /* renamed from: a */
    public void mo9607a(int i) {
        this.f9011f = Math.round(((float) i) / 10.0f);
    }

    /* renamed from: b */
    public void mo9613b(int i) {
        if (i >= 0) {
            this.f9021p = i;
        }
    }

    /* renamed from: c */
    public void mo9614c(int i) {
        if (i < 1) {
            i = 1;
        }
        this.f9025t = i;
    }

    /* renamed from: d */
    public void mo9615d(int i) {
        if (i >= 0) {
            this.f9010e = i;
        }
    }

    /* renamed from: e */
    public void mo9616e(int i) {
        this.f9008c = Integer.valueOf(i);
    }

    /* renamed from: b */
    private void m11864b() {
        byte[] bArr = this.f9015j;
        int length = bArr.length;
        int i = length / 3;
        this.f9016k = new byte[i];
        C2269c cVar = new C2269c(bArr, length, this.f9025t);
        this.f9018m = cVar.mo9632d();
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.f9018m;
            if (i2 >= bArr2.length) {
                break;
            }
            byte b = bArr2[i2];
            int i3 = i2 + 2;
            bArr2[i2] = bArr2[i3];
            bArr2[i3] = b;
            this.f9019n[i2 / 3] = false;
            i2 += 3;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            byte[] bArr3 = this.f9015j;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            int b2 = cVar.mo9628b(bArr3[i5] & 255, bArr3[i6] & 255, bArr3[i7] & 255);
            this.f9019n[b2] = true;
            this.f9016k[i4] = (byte) b2;
            i4++;
            i5 = i8;
        }
        this.f9015j = null;
        this.f9017l = 8;
        this.f9020o = 7;
        Integer num = this.f9008c;
        if (num != null) {
            this.f9009d = m11869f(num.intValue());
        } else if (this.f9026u) {
            this.f9009d = m11869f(0);
        }
    }

    /* renamed from: c */
    private void m11866c() {
        int width = this.f9014i.getWidth();
        int height = this.f9014i.getHeight();
        if (!(width == this.f9006a && height == this.f9007b)) {
            Bitmap createBitmap = Bitmap.createBitmap(this.f9006a, this.f9007b, Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(createBitmap, 0.0f, 0.0f, null);
            this.f9014i = createBitmap;
        }
        int[] iArr = new int[(width * height)];
        this.f9014i.getPixels(iArr, 0, width, 0, 0, width, height);
        this.f9015j = new byte[(iArr.length * 3)];
        boolean z = false;
        this.f9026u = false;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = iArr[i];
            if (i4 == 0) {
                i2++;
            }
            byte[] bArr = this.f9015j;
            int i5 = i3 + 1;
            bArr[i3] = (byte) (i4 & 255);
            int i6 = i5 + 1;
            bArr[i5] = (byte) ((i4 >> 8) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) ((i4 >> 16) & 255);
            i++;
            i3 = i7;
        }
        double d = (double) (i2 * 100);
        double length2 = (double) iArr.length;
        Double.isNaN(d);
        Double.isNaN(length2);
        double d2 = d / length2;
        if (d2 > f9005w) {
            z = true;
        }
        this.f9026u = z;
        if (Log.isLoggable(f9004v, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("got pixels for frame with ");
            sb.append(d2);
            sb.append("% transparent pixels");
            sb.toString();
        }
    }

    /* renamed from: d */
    private void m11867d() throws IOException {
        int i;
        int i2;
        this.f9013h.write(33);
        this.f9013h.write(249);
        this.f9013h.write(4);
        if (this.f9008c != null || this.f9026u) {
            i2 = 1;
            i = 2;
        } else {
            i2 = 0;
            i = 0;
        }
        int i3 = this.f9021p;
        if (i3 >= 0) {
            i = i3 & 7;
        }
        this.f9013h.write(i2 | (i << 2) | 0 | 0);
        m11872g(this.f9011f);
        this.f9013h.write(this.f9009d);
        this.f9013h.write(0);
    }

    /* renamed from: e */
    private void m11868e() throws IOException {
        this.f9013h.write(44);
        m11872g(0);
        m11872g(0);
        m11872g(this.f9006a);
        m11872g(this.f9007b);
        if (this.f9023r) {
            this.f9013h.write(0);
        } else {
            this.f9013h.write(this.f9020o | 128);
        }
    }

    /* renamed from: a */
    public boolean mo9610a(Bitmap bitmap) {
        if (bitmap == null || !this.f9012g) {
            return false;
        }
        try {
            if (!this.f9024s) {
                mo9608a(bitmap.getWidth(), bitmap.getHeight());
            }
            this.f9014i = bitmap;
            m11866c();
            m11864b();
            if (this.f9023r) {
                m11870f();
                m11873h();
                if (this.f9010e >= 0) {
                    m11871g();
                }
            }
            m11867d();
            m11868e();
            if (!this.f9023r) {
                m11873h();
            }
            m11874i();
            this.f9023r = false;
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: g */
    private void m11872g(int i) throws IOException {
        this.f9013h.write(i & 255);
        this.f9013h.write((i >> 8) & 255);
    }

    /* renamed from: f */
    private void m11870f() throws IOException {
        m11872g(this.f9006a);
        m11872g(this.f9007b);
        this.f9013h.write(this.f9020o | 240);
        this.f9013h.write(0);
        this.f9013h.write(0);
    }

    /* renamed from: a */
    public boolean mo9609a() {
        boolean z;
        if (!this.f9012g) {
            return false;
        }
        this.f9012g = false;
        try {
            this.f9013h.write(59);
            this.f9013h.flush();
            if (this.f9022q) {
                this.f9013h.close();
            }
            z = true;
        } catch (IOException unused) {
            z = false;
        }
        this.f9009d = 0;
        this.f9013h = null;
        this.f9014i = null;
        this.f9015j = null;
        this.f9016k = null;
        this.f9018m = null;
        this.f9022q = false;
        this.f9023r = true;
        return z;
    }

    /* renamed from: b */
    private void m11865b(String str) throws IOException {
        for (int i = 0; i < str.length(); i++) {
            this.f9013h.write((byte) str.charAt(i));
        }
    }

    /* renamed from: a */
    public void mo9606a(float f) {
        if (f != 0.0f) {
            this.f9011f = Math.round(100.0f / f);
        }
    }

    /* renamed from: a */
    public void mo9608a(int i, int i2) {
        if (!this.f9012g || this.f9023r) {
            this.f9006a = i;
            this.f9007b = i2;
            if (this.f9006a < 1) {
                this.f9006a = 320;
            }
            if (this.f9007b < 1) {
                this.f9007b = 240;
            }
            this.f9024s = true;
        }
    }

    /* renamed from: a */
    public boolean mo9611a(OutputStream outputStream) {
        boolean z = false;
        if (outputStream == null) {
            return false;
        }
        this.f9022q = false;
        this.f9013h = outputStream;
        try {
            m11865b("GIF89a");
            z = true;
        } catch (IOException unused) {
        }
        this.f9012g = z;
        return z;
    }

    /* renamed from: a */
    public boolean mo9612a(String str) {
        boolean z;
        try {
            this.f9013h = new BufferedOutputStream(new FileOutputStream(str));
            z = mo9611a(this.f9013h);
            this.f9022q = true;
        } catch (IOException unused) {
            z = false;
        }
        this.f9012g = z;
        return z;
    }
}
