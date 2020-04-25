package p076c.p082c.p083a.p088u.p089h;

import com.google.common.base.C5785c;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: c.c.a.u.h.d */
/* compiled from: ExifOrientationStream */
public class C2280d extends FilterInputStream {

    /* renamed from: N */
    private static final int f9098N = 2;

    /* renamed from: O */
    private static final byte[] f9099O = {-1, -31, 0, C5785c.f16673F, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, C5785c.f16702u, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: P */
    private static final int f9100P = f9099O.length;

    /* renamed from: Q */
    private static final int f9101Q = (f9100P + 2);

    /* renamed from: a */
    private final byte f9102a;

    /* renamed from: b */
    private int f9103b;

    public C2280d(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot add invalid orientation: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f9102a = (byte) i;
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read() throws java.io.IOException {
        /*
            r3 = this;
            int r0 = r3.f9103b
            r1 = 2
            if (r0 < r1) goto L_0x0017
            int r2 = f9101Q
            if (r0 <= r2) goto L_0x000a
            goto L_0x0017
        L_0x000a:
            if (r0 != r2) goto L_0x000f
            byte r0 = r3.f9102a
            goto L_0x001b
        L_0x000f:
            byte[] r2 = f9099O
            int r0 = r0 - r1
            byte r0 = r2[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            goto L_0x001b
        L_0x0017:
            int r0 = super.read()
        L_0x001b:
            r1 = -1
            if (r0 == r1) goto L_0x0024
            int r1 = r3.f9103b
            int r1 = r1 + 1
            r3.f9103b = r1
        L_0x0024:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p082c.p083a.p088u.p089h.C2280d.read():int");
    }

    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    public long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f9103b = (int) (((long) this.f9103b) + skip);
        }
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f9103b;
        int i5 = f9101Q;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f9102a;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f9099O, this.f9103b - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f9103b += i3;
        }
        return i3;
    }
}
