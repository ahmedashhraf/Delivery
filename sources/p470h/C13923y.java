package p470h;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: h.y */
/* compiled from: SegmentedByteString */
final class C13923y extends C13896f {

    /* renamed from: Q */
    final transient byte[][] f40436Q;

    /* renamed from: R */
    final transient int[] f40437R;

    C13923y(C13887c cVar, int i) {
        super(null);
        C13893d0.m59606a(cVar.f40340b, 0, (long) i);
        int i2 = 0;
        C13921w wVar = cVar.f40339a;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = wVar.f40428c;
            int i6 = wVar.f40427b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                wVar = wVar.f40431f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f40436Q = new byte[i4][];
        this.f40437R = new int[(i4 * 2)];
        C13921w wVar2 = cVar.f40339a;
        int i7 = 0;
        while (i2 < i) {
            this.f40436Q[i7] = wVar2.f40426a;
            i2 += wVar2.f40428c - wVar2.f40427b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f40437R;
            iArr[i7] = i2;
            iArr[this.f40436Q.length + i7] = wVar2.f40427b;
            wVar2.f40429d = true;
            i7++;
            wVar2 = wVar2.f40431f;
        }
    }

    /* renamed from: w */
    private C13896f m59829w() {
        return new C13896f(mo43989u());
    }

    private Object writeReplace() {
        return m59829w();
    }

    /* renamed from: a */
    public String mo43954a(Charset charset) {
        return m59829w().mo43954a(charset);
    }

    /* renamed from: b */
    public C13896f mo43963b(int i) {
        return m59829w().mo43963b(i);
    }

    /* renamed from: c */
    public C13896f mo43966c(C13896f fVar) {
        return m59829w().mo43966c(fVar);
    }

    /* renamed from: d */
    public C13896f mo43968d(C13896f fVar) {
        return m59829w().mo43968d(fVar);
    }

    /* renamed from: e */
    public String mo43972e() {
        return m59829w().mo43972e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (mo43957a(0, r5, 0, mo43985r()) != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof p470h.C13896f
            r2 = 0
            if (r1 == 0) goto L_0x0020
            h.f r5 = (p470h.C13896f) r5
            int r1 = r5.mo43985r()
            int r3 = r4.mo43985r()
            if (r1 != r3) goto L_0x0020
            int r1 = r4.mo43985r()
            boolean r5 = r4.mo43957a(r2, r5, r2, r1)
            if (r5 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p470h.C13923y.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public String mo43975f() {
        return m59829w().mo43975f();
    }

    /* renamed from: g */
    public String mo43977g() {
        return m59829w().mo43977g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public byte[] mo43979h() {
        return mo43989u();
    }

    public int hashCode() {
        int i = this.f40355b;
        if (i != 0) {
            return i;
        }
        int length = this.f40436Q.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.f40436Q[i2];
            int[] iArr = this.f40437R;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f40355b = i3;
        return i3;
    }

    /* renamed from: j */
    public C13896f mo43981j() {
        return m59829w().mo43981j();
    }

    /* renamed from: k */
    public C13896f mo43982k() {
        return m59829w().mo43982k();
    }

    /* renamed from: p */
    public C13896f mo43983p() {
        return m59829w().mo43983p();
    }

    /* renamed from: r */
    public int mo43985r() {
        return this.f40437R[this.f40436Q.length - 1];
    }

    /* renamed from: s */
    public C13896f mo43986s() {
        return m59829w().mo43986s();
    }

    /* renamed from: t */
    public C13896f mo43987t() {
        return m59829w().mo43987t();
    }

    public String toString() {
        return m59829w().toString();
    }

    /* renamed from: u */
    public byte[] mo43989u() {
        int[] iArr = this.f40437R;
        byte[][] bArr = this.f40436Q;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f40437R;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f40436Q[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    /* renamed from: v */
    public String mo43990v() {
        return m59829w().mo43990v();
    }

    /* renamed from: c */
    private int m59828c(int i) {
        int binarySearch = Arrays.binarySearch(this.f40437R, 0, this.f40436Q.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ -1;
    }

    /* renamed from: a */
    public C13896f mo43953a(int i, int i2) {
        return m59829w().mo43953a(i, i2);
    }

    /* renamed from: b */
    public int mo43962b(byte[] bArr, int i) {
        return m59829w().mo43962b(bArr, i);
    }

    /* renamed from: d */
    public ByteBuffer mo43969d() {
        return ByteBuffer.wrap(mo43989u()).asReadOnlyBuffer();
    }

    /* renamed from: a */
    public byte mo43949a(int i) {
        int i2;
        C13893d0.m59606a((long) this.f40437R[this.f40436Q.length - 1], (long) i, 1);
        int c = m59828c(i);
        if (c == 0) {
            i2 = 0;
        } else {
            i2 = this.f40437R[c - 1];
        }
        int[] iArr = this.f40437R;
        byte[][] bArr = this.f40436Q;
        return bArr[c][(i - i2) + iArr[bArr.length + c]];
    }

    /* renamed from: a */
    public void mo43956a(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            int length = this.f40436Q.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int[] iArr = this.f40437R;
                int i3 = iArr[length + i];
                int i4 = iArr[i];
                outputStream.write(this.f40436Q[i], i3, i4 - i2);
                i++;
                i2 = i4;
            }
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo43955a(C13887c cVar) {
        int length = this.f40436Q.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f40437R;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C13921w wVar = new C13921w(this.f40436Q[i], i3, (i3 + i4) - i2, true, false);
            C13921w wVar2 = cVar.f40339a;
            if (wVar2 == null) {
                wVar.f40432g = wVar;
                wVar.f40431f = wVar;
                cVar.f40339a = wVar;
            } else {
                wVar2.f40432g.mo44029a(wVar);
            }
            i++;
            i2 = i4;
        }
        cVar.f40340b += (long) i2;
    }

    /* renamed from: a */
    public boolean mo43957a(int i, C13896f fVar, int i2, int i3) {
        int i4;
        if (i < 0 || i > mo43985r() - i3) {
            return false;
        }
        int c = m59828c(i);
        while (i3 > 0) {
            if (c == 0) {
                i4 = 0;
            } else {
                i4 = this.f40437R[c - 1];
            }
            int min = Math.min(i3, ((this.f40437R[c] - i4) + i4) - i);
            int[] iArr = this.f40437R;
            byte[][] bArr = this.f40436Q;
            if (!fVar.mo43958a(i2, bArr[c], (i - i4) + iArr[bArr.length + c], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            c++;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo43958a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i > mo43985r() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int c = m59828c(i);
        while (i3 > 0) {
            if (c == 0) {
                i4 = 0;
            } else {
                i4 = this.f40437R[c - 1];
            }
            int min = Math.min(i3, ((this.f40437R[c] - i4) + i4) - i);
            int[] iArr = this.f40437R;
            byte[][] bArr2 = this.f40436Q;
            if (!C13893d0.m59608a(bArr2[c], (i - i4) + iArr[bArr2.length + c], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            c++;
        }
        return true;
    }

    /* renamed from: a */
    public int mo43952a(byte[] bArr, int i) {
        return m59829w().mo43952a(bArr, i);
    }
}
