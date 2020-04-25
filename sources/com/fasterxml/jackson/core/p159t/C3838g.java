package com.fasterxml.jackson.core.p159t;

import com.fasterxml.jackson.core.C3785a;
import com.fasterxml.jackson.core.C3791f.C3792a;
import com.fasterxml.jackson.core.C3800k;
import com.fasterxml.jackson.core.C3801l;
import com.fasterxml.jackson.core.C3802m;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.p158s.C3817b;
import com.fasterxml.jackson.core.p158s.C3818c;
import com.fasterxml.jackson.core.p158s.C3819d;
import com.fasterxml.jackson.core.p158s.C3824i;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.jcodec.codecs.mjpeg.JpegConst;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.fasterxml.jackson.core.t.g */
/* compiled from: UTF8JsonGenerator */
public class C3838g extends C3833c {

    /* renamed from: g0 */
    private static final byte f12098g0 = 117;

    /* renamed from: h0 */
    private static final byte f12099h0 = 48;

    /* renamed from: i0 */
    private static final byte f12100i0 = 91;

    /* renamed from: j0 */
    private static final byte f12101j0 = 93;

    /* renamed from: k0 */
    private static final byte f12102k0 = 123;

    /* renamed from: l0 */
    private static final byte f12103l0 = 125;

    /* renamed from: m0 */
    private static final byte f12104m0 = 92;

    /* renamed from: n0 */
    private static final byte f12105n0 = 44;

    /* renamed from: o0 */
    private static final byte f12106o0 = 58;

    /* renamed from: p0 */
    private static final byte f12107p0 = 34;

    /* renamed from: q0 */
    protected static final int f12108q0 = 55296;

    /* renamed from: r0 */
    protected static final int f12109r0 = 56319;

    /* renamed from: s0 */
    protected static final int f12110s0 = 56320;

    /* renamed from: t0 */
    protected static final int f12111t0 = 57343;

    /* renamed from: u0 */
    private static final int f12112u0 = 512;

    /* renamed from: v0 */
    static final byte[] f12113v0 = C3817b.m16260a();

    /* renamed from: w0 */
    private static final byte[] f12114w0 = {110, f12098g0, 108, 108};

    /* renamed from: x0 */
    private static final byte[] f12115x0 = {116, 114, f12098g0, 101};

    /* renamed from: y0 */
    private static final byte[] f12116y0 = {102, 97, 108, 115, 101};

    /* renamed from: X */
    protected final OutputStream f12117X;

    /* renamed from: Y */
    protected byte[] f12118Y;

    /* renamed from: Z */
    protected int f12119Z = 0;

    /* renamed from: a0 */
    protected final int f12120a0;

    /* renamed from: b0 */
    protected final int f12121b0;

    /* renamed from: c0 */
    protected char[] f12122c0;

    /* renamed from: d0 */
    protected final int f12123d0;

    /* renamed from: e0 */
    protected byte[] f12124e0;

    /* renamed from: f0 */
    protected boolean f12125f0;

    public C3838g(C3819d dVar, int i, C3800k kVar, OutputStream outputStream) {
        super(dVar, i, kVar);
        this.f12117X = outputStream;
        this.f12125f0 = true;
        this.f12118Y = dVar.mo16887e();
        this.f12120a0 = this.f12118Y.length;
        this.f12121b0 = this.f12120a0 >> 3;
        this.f12122c0 = dVar.mo16882b();
        this.f12123d0 = this.f12122c0.length;
        if (mo16634c(C3792a.ESCAPE_NON_ASCII)) {
            mo16589a((int) C13959t.f40827P1);
        }
    }

    /* renamed from: P */
    private void m16432P() throws IOException {
        if (this.f12119Z + 4 >= this.f12120a0) {
            mo16967O();
        }
        System.arraycopy(f12114w0, 0, this.f12118Y, this.f12119Z, 4);
        this.f12119Z += 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        m16433a((int) r8, r7, r2, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        r8 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if ((r6.f12119Z + 3) < r6.f12120a0) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        mo16967O();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r2 = r8 + 1;
        r8 = r7[r8];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r8 >= 2048) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r4 = r6.f12119Z;
        r6.f12119Z = r4 + 1;
        r1[r4] = (byte) ((r8 >> 6) | 192);
        r4 = r6.f12119Z;
        r6.f12119Z = r4 + 1;
        r1[r4] = (byte) ((r8 & '?') | 128);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m16448f(char[] r7, int r8, int r9) throws java.io.IOException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r6 = this;
            int r0 = r6.f12120a0
            byte[] r1 = r6.f12118Y
        L_0x0004:
            if (r8 >= r9) goto L_0x0052
        L_0x0006:
            char r2 = r7[r8]
            r3 = 128(0x80, float:1.794E-43)
            if (r2 < r3) goto L_0x003e
            int r2 = r6.f12119Z
            int r2 = r2 + 3
            int r4 = r6.f12120a0
            if (r2 < r4) goto L_0x0017
            r6.mo16967O()
        L_0x0017:
            int r2 = r8 + 1
            char r8 = r7[r8]
            r4 = 2048(0x800, float:2.87E-42)
            if (r8 >= r4) goto L_0x0039
            int r4 = r6.f12119Z
            int r5 = r4 + 1
            r6.f12119Z = r5
            int r5 = r8 >> 6
            r5 = r5 | 192(0xc0, float:2.69E-43)
            byte r5 = (byte) r5
            r1[r4] = r5
            int r4 = r6.f12119Z
            int r5 = r4 + 1
            r6.f12119Z = r5
            r8 = r8 & 63
            r8 = r8 | r3
            byte r8 = (byte) r8
            r1[r4] = r8
            goto L_0x003c
        L_0x0039:
            r6.m16433a(r8, r7, r2, r9)
        L_0x003c:
            r8 = r2
            goto L_0x0004
        L_0x003e:
            int r3 = r6.f12119Z
            if (r3 < r0) goto L_0x0045
            r6.mo16967O()
        L_0x0045:
            int r3 = r6.f12119Z
            int r4 = r3 + 1
            r6.f12119Z = r4
            byte r2 = (byte) r2
            r1[r3] = r2
            int r8 = r8 + 1
            if (r8 < r9) goto L_0x0006
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p159t.C3838g.m16448f(char[], int, int):void");
    }

    /* renamed from: h */
    private final void m16451h(char[] cArr, int i, int i2) throws IOException, JsonGenerationException {
        if (this.f12119Z + ((i2 - i) * 6) > this.f12120a0) {
            mo16967O();
        }
        int i3 = this.f12119Z;
        byte[] bArr = this.f12118Y;
        int[] iArr = this.f12073S;
        while (i < i2) {
            int i4 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                if (iArr[c] == 0) {
                    int i5 = i3 + 1;
                    bArr[i3] = (byte) c;
                    i = i4;
                    i3 = i5;
                } else {
                    int i6 = iArr[c];
                    if (i6 > 0) {
                        int i7 = i3 + 1;
                        bArr[i3] = f12104m0;
                        i3 = i7 + 1;
                        bArr[i7] = (byte) i6;
                    } else {
                        i3 = m16441d(c, i3);
                    }
                }
            } else if (c <= 2047) {
                int i8 = i3 + 1;
                bArr[i3] = (byte) ((c >> 6) | 192);
                i3 = i8 + 1;
                bArr[i8] = (byte) ((c & '?') | 128);
            } else {
                i3 = m16439c(c, i3);
            }
            i = i4;
        }
        this.f12119Z = i3;
    }

    /* renamed from: j */
    private final void m16453j(char[] cArr, int i, int i2) throws IOException, JsonGenerationException {
        do {
            int min = Math.min(this.f12121b0, i2);
            if (this.f12119Z + min > this.f12120a0) {
                mo16967O();
            }
            m16450g(cArr, i, min);
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    /* renamed from: m */
    private void m16454m(String str) throws IOException, JsonGenerationException {
        if (this.f12119Z >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr = this.f12118Y;
        int i = this.f12119Z;
        this.f12119Z = i + 1;
        bArr[i] = f12107p0;
        m16455n(str);
        if (this.f12119Z >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr2 = this.f12118Y;
        int i2 = this.f12119Z;
        this.f12119Z = i2 + 1;
        bArr2[i2] = f12107p0;
    }

    /* renamed from: n */
    private final void m16455n(String str) throws IOException, JsonGenerationException {
        int length = str.length();
        char[] cArr = this.f12122c0;
        int i = 0;
        while (length > 0) {
            int min = Math.min(this.f12121b0, length);
            int i2 = i + min;
            str.getChars(i, i2, cArr, 0);
            if (this.f12119Z + min > this.f12120a0) {
                mo16967O();
            }
            m16450g(cArr, 0, min);
            length -= min;
            i = i2;
        }
    }

    /* renamed from: F */
    public final void mo16582F() throws IOException, JsonGenerationException {
        if (!this.f11862P.mo16740f()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Current context not an ARRAY but ");
            sb.append(this.f11862P.mo16739e());
            mo16805j(sb.toString());
        }
        C3801l lVar = this.f11835a;
        if (lVar != null) {
            lVar.mo16765b(this, this.f11862P.mo16737c());
        } else {
            if (this.f12119Z >= this.f12120a0) {
                mo16967O();
            }
            byte[] bArr = this.f12118Y;
            int i = this.f12119Z;
            this.f12119Z = i + 1;
            bArr[i] = f12101j0;
        }
        this.f11862P = this.f11862P.mo16738d();
    }

    /* renamed from: G */
    public final void mo16583G() throws IOException, JsonGenerationException {
        if (!this.f11862P.mo16741g()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Current context not an object but ");
            sb.append(this.f11862P.mo16739e());
            mo16805j(sb.toString());
        }
        C3801l lVar = this.f11835a;
        if (lVar != null) {
            lVar.mo16763a(this, this.f11862P.mo16737c());
        } else {
            if (this.f12119Z >= this.f12120a0) {
                mo16967O();
            }
            byte[] bArr = this.f12118Y;
            int i = this.f12119Z;
            this.f12119Z = i + 1;
            bArr[i] = f12103l0;
        }
        this.f11862P = this.f11862P.mo16738d();
    }

    /* renamed from: H */
    public void mo16584H() throws IOException, JsonGenerationException {
        mo16806k("write null value");
        m16432P();
    }

    /* renamed from: I */
    public final void mo16585I() throws IOException, JsonGenerationException {
        mo16806k("start an array");
        this.f11862P = this.f11862P.mo16946i();
        C3801l lVar = this.f11835a;
        if (lVar != null) {
            lVar.mo16768e(this);
            return;
        }
        if (this.f12119Z >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr = this.f12118Y;
        int i = this.f12119Z;
        this.f12119Z = i + 1;
        bArr[i] = f12100i0;
    }

    /* renamed from: J */
    public final void mo16586J() throws IOException, JsonGenerationException {
        mo16806k("start an object");
        this.f11862P = this.f11862P.mo16947j();
        C3801l lVar = this.f11835a;
        if (lVar != null) {
            lVar.mo16762a(this);
            return;
        }
        if (this.f12119Z >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr = this.f12118Y;
        int i = this.f12119Z;
        this.f12119Z = i + 1;
        bArr[i] = f12102k0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo16801L() {
        byte[] bArr = this.f12118Y;
        if (bArr != null && this.f12125f0) {
            this.f12118Y = null;
            this.f12072R.mo16883c(bArr);
        }
        char[] cArr = this.f12122c0;
        if (cArr != null) {
            this.f12122c0 = null;
            this.f12072R.mo16877a(cArr);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final void mo16967O() throws IOException {
        int i = this.f12119Z;
        if (i > 0) {
            this.f12119Z = 0;
            this.f12117X.write(this.f12118Y, 0, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16971a(C3802m mVar, boolean z) throws IOException, JsonGenerationException {
        if (z) {
            this.f11835a.mo16770g(this);
        } else {
            this.f11835a.mo16767d(this);
        }
        boolean c = mo16634c(C3792a.QUOTE_FIELD_NAMES);
        if (c) {
            if (this.f12119Z >= this.f12120a0) {
                mo16967O();
            }
            byte[] bArr = this.f12118Y;
            int i = this.f12119Z;
            this.f12119Z = i + 1;
            bArr[i] = f12107p0;
        }
        m16438b(mVar.mo16781d());
        if (c) {
            if (this.f12119Z >= this.f12120a0) {
                mo16967O();
            }
            byte[] bArr2 = this.f12118Y;
            int i2 = this.f12119Z;
            this.f12119Z = i2 + 1;
            bArr2[i2] = f12107p0;
        }
    }

    /* renamed from: b */
    public final void mo16624b(C3802m mVar) throws IOException, JsonGenerationException {
        int a = this.f11862P.mo16944a(mVar.getValue());
        if (a == 4) {
            mo16805j("Can not write a field name, expecting a value");
        }
        boolean z = true;
        if (this.f11835a != null) {
            if (a != 1) {
                z = false;
            }
            mo16971a(mVar, z);
            return;
        }
        if (a == 1) {
            if (this.f12119Z >= this.f12120a0) {
                mo16967O();
            }
            byte[] bArr = this.f12118Y;
            int i = this.f12119Z;
            this.f12119Z = i + 1;
            bArr[i] = f12105n0;
        }
        mo16976e(mVar);
    }

    /* renamed from: c */
    public final void mo16630c(String str) throws IOException, JsonGenerationException {
        int a = this.f11862P.mo16944a(str);
        if (a == 4) {
            mo16805j("Can not write a field name, expecting a value");
        }
        boolean z = true;
        if (this.f11835a != null) {
            if (a != 1) {
                z = false;
            }
            mo16975b(str, z);
            return;
        }
        if (a == 1) {
            if (this.f12119Z >= this.f12120a0) {
                mo16967O();
            }
            byte[] bArr = this.f12118Y;
            int i = this.f12119Z;
            this.f12119Z = i + 1;
            bArr[i] = f12105n0;
        }
        mo16977l(str);
    }

    public void close() throws IOException {
        super.close();
        if (this.f12118Y != null && mo16634c(C3792a.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                C3835e f = mo16642f();
                if (!f.mo16740f()) {
                    if (!f.mo16741g()) {
                        break;
                    }
                    mo16583G();
                } else {
                    mo16582F();
                }
            }
        }
        mo16967O();
        if (this.f12117X != null) {
            if (this.f12072R.mo16891i() || mo16634c(C3792a.AUTO_CLOSE_TARGET)) {
                this.f12117X.close();
            } else if (mo16634c(C3792a.FLUSH_PASSED_TO_STREAM)) {
                this.f12117X.flush();
            }
        }
        mo16801L();
    }

    /* renamed from: d */
    public final void mo16637d(C3802m mVar) throws IOException, JsonGenerationException {
        mo16806k("write text value");
        if (this.f12119Z >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr = this.f12118Y;
        int i = this.f12119Z;
        this.f12119Z = i + 1;
        bArr[i] = f12107p0;
        int a = mVar.mo16774a(bArr, this.f12119Z);
        if (a < 0) {
            m16438b(mVar.mo16781d());
        } else {
            this.f12119Z += a;
        }
        if (this.f12119Z >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr2 = this.f12118Y;
        int i2 = this.f12119Z;
        this.f12119Z = i2 + 1;
        bArr2[i2] = f12107p0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo16976e(C3802m mVar) throws IOException, JsonGenerationException {
        if (!mo16634c(C3792a.QUOTE_FIELD_NAMES)) {
            int a = mVar.mo16774a(this.f12118Y, this.f12119Z);
            if (a < 0) {
                m16438b(mVar.mo16781d());
            } else {
                this.f12119Z += a;
            }
            return;
        }
        if (this.f12119Z >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr = this.f12118Y;
        int i = this.f12119Z;
        this.f12119Z = i + 1;
        bArr[i] = f12107p0;
        int a2 = mVar.mo16774a(bArr, this.f12119Z);
        if (a2 < 0) {
            m16438b(mVar.mo16781d());
        } else {
            this.f12119Z += a2;
        }
        if (this.f12119Z >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr2 = this.f12118Y;
        int i2 = this.f12119Z;
        this.f12119Z = i2 + 1;
        bArr2[i2] = f12107p0;
    }

    public final void flush() throws IOException {
        mo16967O();
        if (this.f12117X != null && mo16634c(C3792a.FLUSH_PASSED_TO_STREAM)) {
            this.f12117X.flush();
        }
    }

    /* renamed from: g */
    public Object mo16645g() {
        return this.f12117X;
    }

    /* renamed from: i */
    public void mo16650i(String str) throws IOException, JsonGenerationException {
        mo16806k("write text value");
        if (str == null) {
            m16432P();
            return;
        }
        int length = str.length();
        if (length > this.f12123d0) {
            m16454m(str);
            return;
        }
        str.getChars(0, length, this.f12122c0, 0);
        if (length > this.f12121b0) {
            m16445e(this.f12122c0, 0, length);
            return;
        }
        if (this.f12119Z + length >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr = this.f12118Y;
        int i = this.f12119Z;
        this.f12119Z = i + 1;
        bArr[i] = f12107p0;
        m16450g(this.f12122c0, 0, length);
        if (this.f12119Z >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr2 = this.f12118Y;
        int i2 = this.f12119Z;
        this.f12119Z = i2 + 1;
        bArr2[i2] = f12107p0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo16806k(String str) throws IOException, JsonGenerationException {
        byte b;
        int k = this.f11862P.mo16948k();
        if (k == 5) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can not ");
            sb.append(str);
            sb.append(", expecting field name");
            mo16805j(sb.toString());
        }
        if (this.f11835a == null) {
            if (k == 1) {
                b = f12105n0;
            } else if (k == 2) {
                b = f12106o0;
            } else if (k == 3) {
                C3802m mVar = this.f12076V;
                if (mVar != null) {
                    byte[] e = mVar.mo16782e();
                    if (e.length > 0) {
                        m16438b(e);
                    }
                }
                return;
            } else {
                return;
            }
            if (this.f12119Z >= this.f12120a0) {
                mo16967O();
            }
            byte[] bArr = this.f12118Y;
            int i = this.f12119Z;
            bArr[i] = b;
            this.f12119Z = i + 1;
            return;
        }
        mo16974b(str, k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo16977l(String str) throws IOException, JsonGenerationException {
        if (!mo16634c(C3792a.QUOTE_FIELD_NAMES)) {
            m16455n(str);
            return;
        }
        if (this.f12119Z >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr = this.f12118Y;
        int i = this.f12119Z;
        this.f12119Z = i + 1;
        bArr[i] = f12107p0;
        int length = str.length();
        if (length <= this.f12123d0) {
            str.getChars(0, length, this.f12122c0, 0);
            if (length <= this.f12121b0) {
                if (this.f12119Z + length > this.f12120a0) {
                    mo16967O();
                }
                m16450g(this.f12122c0, 0, length);
            } else {
                m16453j(this.f12122c0, 0, length);
            }
        } else {
            m16455n(str);
        }
        if (this.f12119Z >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr2 = this.f12118Y;
        int i2 = this.f12119Z;
        this.f12119Z = i2 + 1;
        bArr2[i2] = f12107p0;
    }

    /* renamed from: g */
    public void mo16646g(String str) throws IOException, JsonGenerationException {
        int length = str.length();
        int i = 0;
        while (length > 0) {
            char[] cArr = this.f12122c0;
            int length2 = cArr.length;
            if (length < length2) {
                length2 = length;
            }
            int i2 = i + length2;
            str.getChars(i, i2, cArr, 0);
            mo16619a(cArr, 0, length2);
            length -= length2;
            i = i2;
        }
    }

    /* renamed from: g */
    private final void m16450g(char[] cArr, int i, int i2) throws IOException, JsonGenerationException {
        int i3 = i2 + i;
        int i4 = this.f12119Z;
        byte[] bArr = this.f12118Y;
        int[] iArr = this.f12073S;
        while (i < i3) {
            char c = cArr[i];
            if (c > 127 || iArr[c] != 0) {
                break;
            }
            int i5 = i4 + 1;
            bArr[i4] = (byte) c;
            i++;
            i4 = i5;
        }
        this.f12119Z = i4;
        if (i >= i3) {
            return;
        }
        if (this.f12075U != null) {
            m16443d(cArr, i, i3);
        } else if (this.f12074T == 0) {
            m16451h(cArr, i, i3);
        } else {
            m16452i(cArr, i, i3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo16975b(String str, boolean z) throws IOException, JsonGenerationException {
        if (z) {
            this.f11835a.mo16770g(this);
        } else {
            this.f11835a.mo16767d(this);
        }
        if (mo16634c(C3792a.QUOTE_FIELD_NAMES)) {
            if (this.f12119Z >= this.f12120a0) {
                mo16967O();
            }
            byte[] bArr = this.f12118Y;
            int i = this.f12119Z;
            this.f12119Z = i + 1;
            bArr[i] = f12107p0;
            int length = str.length();
            if (length <= this.f12123d0) {
                str.getChars(0, length, this.f12122c0, 0);
                if (length <= this.f12121b0) {
                    if (this.f12119Z + length > this.f12120a0) {
                        mo16967O();
                    }
                    m16450g(this.f12122c0, 0, length);
                } else {
                    m16453j(this.f12122c0, 0, length);
                }
            } else {
                m16455n(str);
            }
            if (this.f12119Z >= this.f12120a0) {
                mo16967O();
            }
            byte[] bArr2 = this.f12118Y;
            int i2 = this.f12119Z;
            this.f12119Z = i2 + 1;
            bArr2[i2] = f12107p0;
            return;
        }
        m16455n(str);
    }

    /* renamed from: c */
    public void mo16633c(char[] cArr, int i, int i2) throws IOException, JsonGenerationException {
        mo16806k("write text value");
        if (this.f12119Z >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr = this.f12118Y;
        int i3 = this.f12119Z;
        this.f12119Z = i3 + 1;
        bArr[i3] = f12107p0;
        if (i2 <= this.f12121b0) {
            if (this.f12119Z + i2 > this.f12120a0) {
                mo16967O();
            }
            m16450g(cArr, i, i2);
        } else {
            m16453j(cArr, i, i2);
        }
        if (this.f12119Z >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr2 = this.f12118Y;
        int i4 = this.f12119Z;
        this.f12119Z = i4 + 1;
        bArr2[i4] = f12107p0;
    }

    /* renamed from: d */
    private final void m16442d(byte[] bArr, int i, int i2) throws IOException {
        if (this.f12119Z + i2 > this.f12120a0) {
            mo16967O();
            if (i2 > 512) {
                this.f12117X.write(bArr, i, i2);
                return;
            }
        }
        System.arraycopy(bArr, i, this.f12118Y, this.f12119Z, i2);
        this.f12119Z += i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r0 = r6 + 1;
        r6 = r5[r6];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r6 >= 2048) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r1 = r4.f12118Y;
        r2 = r4.f12119Z;
        r4.f12119Z = r2 + 1;
        r1[r2] = (byte) ((r6 >> 6) | 192);
        r2 = r4.f12119Z;
        r4.f12119Z = r2 + 1;
        r1[r2] = (byte) ((r6 & '?') | 128);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        m16433a((int) r6, r5, r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        r6 = r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16619a(char[] r5, int r6, int r7) throws java.io.IOException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r4 = this;
            int r0 = r7 + r7
            int r0 = r0 + r7
            int r1 = r4.f12119Z
            int r1 = r1 + r0
            int r2 = r4.f12120a0
            if (r1 <= r2) goto L_0x0013
            if (r2 >= r0) goto L_0x0010
            r4.m16448f(r5, r6, r7)
            return
        L_0x0010:
            r4.mo16967O()
        L_0x0013:
            int r7 = r7 + r6
        L_0x0014:
            if (r6 >= r7) goto L_0x0055
        L_0x0016:
            char r0 = r5[r6]
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L_0x0046
            int r0 = r6 + 1
            char r6 = r5[r6]
            r1 = 2048(0x800, float:2.87E-42)
            if (r6 >= r1) goto L_0x0041
            byte[] r1 = r4.f12118Y
            int r2 = r4.f12119Z
            int r3 = r2 + 1
            r4.f12119Z = r3
            int r3 = r6 >> 6
            r3 = r3 | 192(0xc0, float:2.69E-43)
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r4.f12119Z
            int r3 = r2 + 1
            r4.f12119Z = r3
            r6 = r6 & 63
            r6 = r6 | 128(0x80, float:1.794E-43)
            byte r6 = (byte) r6
            r1[r2] = r6
            goto L_0x0044
        L_0x0041:
            r4.m16433a(r6, r5, r0, r7)
        L_0x0044:
            r6 = r0
            goto L_0x0014
        L_0x0046:
            byte[] r1 = r4.f12118Y
            int r2 = r4.f12119Z
            int r3 = r2 + 1
            r4.f12119Z = r3
            byte r0 = (byte) r0
            r1[r2] = r0
            int r6 = r6 + 1
            if (r6 < r7) goto L_0x0016
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p159t.C3838g.mo16619a(char[], int, int):void");
    }

    public C3838g(C3819d dVar, int i, C3800k kVar, OutputStream outputStream, byte[] bArr, int i2, boolean z) {
        super(dVar, i, kVar);
        this.f12117X = outputStream;
        this.f12125f0 = z;
        this.f12119Z = i2;
        this.f12118Y = bArr;
        this.f12120a0 = this.f12118Y.length;
        this.f12121b0 = this.f12120a0 >> 3;
        this.f12122c0 = dVar.mo16882b();
        this.f12123d0 = this.f12122c0.length;
    }

    /* renamed from: f */
    private void m16446f(int i) throws IOException {
        if (this.f12119Z + 13 >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr = this.f12118Y;
        int i2 = this.f12119Z;
        this.f12119Z = i2 + 1;
        bArr[i2] = f12107p0;
        this.f12119Z = C3824i.m16318b(i, bArr, this.f12119Z);
        byte[] bArr2 = this.f12118Y;
        int i3 = this.f12119Z;
        this.f12119Z = i3 + 1;
        bArr2[i3] = f12107p0;
    }

    /* renamed from: e */
    private void m16445e(char[] cArr, int i, int i2) throws IOException, JsonGenerationException {
        if (this.f12119Z >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr = this.f12118Y;
        int i3 = this.f12119Z;
        this.f12119Z = i3 + 1;
        bArr[i3] = f12107p0;
        m16453j(this.f12122c0, 0, i2);
        if (this.f12119Z >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr2 = this.f12118Y;
        int i4 = this.f12119Z;
        this.f12119Z = i4 + 1;
        bArr2[i4] = f12107p0;
    }

    /* renamed from: d */
    private void m16443d(char[] cArr, int i, int i2) throws IOException, JsonGenerationException {
        if (this.f12119Z + ((i2 - i) * 6) > this.f12120a0) {
            mo16967O();
        }
        int i3 = this.f12119Z;
        byte[] bArr = this.f12118Y;
        int[] iArr = this.f12073S;
        int i4 = this.f12074T;
        if (i4 <= 0) {
            i4 = 65535;
        }
        C3818c cVar = this.f12075U;
        while (i < i2) {
            int i5 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                if (iArr[c] == 0) {
                    int i6 = i3 + 1;
                    bArr[i3] = (byte) c;
                    i = i5;
                    i3 = i6;
                } else {
                    int i7 = iArr[c];
                    if (i7 > 0) {
                        int i8 = i3 + 1;
                        bArr[i3] = f12104m0;
                        i3 = i8 + 1;
                        bArr[i8] = (byte) i7;
                    } else if (i7 == -2) {
                        C3802m a = cVar.mo16873a(c);
                        if (a == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid custom escape definitions; custom escape not found for character code 0x");
                            sb.append(Integer.toHexString(c));
                            sb.append(", although was supposed to have one");
                            mo16805j(sb.toString());
                        }
                        i3 = m16436a(bArr, i3, a, i2 - i5);
                    } else {
                        i3 = m16441d(c, i3);
                    }
                }
            } else if (c > i4) {
                i3 = m16441d(c, i3);
            } else {
                C3802m a2 = cVar.mo16873a(c);
                if (a2 != null) {
                    i3 = m16436a(bArr, i3, a2, i2 - i5);
                } else if (c <= 2047) {
                    int i9 = i3 + 1;
                    bArr[i3] = (byte) ((c >> 6) | 192);
                    i3 = i9 + 1;
                    bArr[i9] = (byte) ((c & '?') | 128);
                } else {
                    i3 = m16439c(c, i3);
                }
            }
            i = i5;
        }
        this.f12119Z = i3;
    }

    /* renamed from: i */
    private final void m16452i(char[] cArr, int i, int i2) throws IOException, JsonGenerationException {
        if (this.f12119Z + ((i2 - i) * 6) > this.f12120a0) {
            mo16967O();
        }
        int i3 = this.f12119Z;
        byte[] bArr = this.f12118Y;
        int[] iArr = this.f12073S;
        int i4 = this.f12074T;
        while (i < i2) {
            int i5 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                if (iArr[c] == 0) {
                    int i6 = i3 + 1;
                    bArr[i3] = (byte) c;
                    i = i5;
                    i3 = i6;
                } else {
                    int i7 = iArr[c];
                    if (i7 > 0) {
                        int i8 = i3 + 1;
                        bArr[i3] = f12104m0;
                        i3 = i8 + 1;
                        bArr[i8] = (byte) i7;
                    } else {
                        i3 = m16441d(c, i3);
                    }
                }
            } else if (c > i4) {
                i3 = m16441d(c, i3);
            } else if (c <= 2047) {
                int i9 = i3 + 1;
                bArr[i3] = (byte) ((c >> 6) | 192);
                i3 = i9 + 1;
                bArr[i9] = (byte) ((c & '?') | 128);
            } else {
                i3 = m16439c(c, i3);
            }
            i = i5;
        }
        this.f12119Z = i3;
    }

    /* renamed from: f */
    private void m16447f(byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        int i3;
        int i4 = this.f12119Z;
        if ((i2 * 6) + i4 > this.f12120a0) {
            mo16967O();
            i4 = this.f12119Z;
        }
        byte[] bArr2 = this.f12118Y;
        int[] iArr = this.f12073S;
        int i5 = i2 + i;
        while (i < i5) {
            int i6 = i + 1;
            byte b = bArr[i];
            if (b < 0 || iArr[b] == 0) {
                int i7 = i3 + 1;
                bArr2[i3] = b;
                i = i6;
                i3 = i7;
            } else {
                int i8 = iArr[b];
                if (i8 > 0) {
                    int i9 = i3 + 1;
                    bArr2[i3] = f12104m0;
                    i3 = i9 + 1;
                    bArr2[i9] = (byte) i8;
                } else {
                    i3 = m16441d(b, i3);
                }
                i = i6;
            }
        }
        this.f12119Z = i3;
    }

    /* renamed from: g */
    private void m16449g(byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        do {
            int min = Math.min(this.f12121b0, i2);
            m16444e(bArr, i, min);
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    /* renamed from: a */
    public void mo16597a(char c) throws IOException, JsonGenerationException {
        if (this.f12119Z + 3 >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr = this.f12118Y;
        if (c <= 127) {
            int i = this.f12119Z;
            this.f12119Z = i + 1;
            bArr[i] = (byte) c;
        } else if (c < 2048) {
            int i2 = this.f12119Z;
            this.f12119Z = i2 + 1;
            bArr[i2] = (byte) ((c >> 6) | 192);
            int i3 = this.f12119Z;
            this.f12119Z = i3 + 1;
            bArr[i3] = (byte) ((c & '?') | 128);
        } else {
            m16433a((int) c, (char[]) null, 0, 0);
        }
    }

    /* renamed from: c */
    public void mo16632c(byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        mo16806k("write text value");
        if (this.f12119Z >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr2 = this.f12118Y;
        int i3 = this.f12119Z;
        this.f12119Z = i3 + 1;
        bArr2[i3] = f12107p0;
        if (i2 <= this.f12121b0) {
            m16444e(bArr, i, i2);
        } else {
            m16449g(bArr, i, i2);
        }
        if (this.f12119Z >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr3 = this.f12118Y;
        int i4 = this.f12119Z;
        this.f12119Z = i4 + 1;
        bArr3[i4] = f12107p0;
    }

    /* renamed from: e */
    public void mo16640e(int i) throws IOException, JsonGenerationException {
        mo16806k("write number");
        if (this.f12119Z + 11 >= this.f12120a0) {
            mo16967O();
        }
        if (this.f11861O) {
            m16446f(i);
        } else {
            this.f12119Z = C3824i.m16318b(i, this.f12118Y, this.f12119Z);
        }
    }

    /* renamed from: a */
    public void mo16601a(C3785a aVar, byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        mo16806k("write binary value");
        if (this.f12119Z >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr2 = this.f12118Y;
        int i3 = this.f12119Z;
        this.f12119Z = i3 + 1;
        bArr2[i3] = f12107p0;
        mo16973b(aVar, bArr, i, i2 + i);
        if (this.f12119Z >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr3 = this.f12118Y;
        int i4 = this.f12119Z;
        this.f12119Z = i4 + 1;
        bArr3[i4] = f12107p0;
    }

    /* renamed from: e */
    public void mo16641e(String str) throws IOException, JsonGenerationException {
        mo16806k("write number");
        if (this.f11861O) {
            m16440c((Object) str);
        } else {
            mo16646g(str);
        }
    }

    /* renamed from: b */
    public void mo16627b(byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        mo16806k("write text value");
        if (this.f12119Z >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr2 = this.f12118Y;
        int i3 = this.f12119Z;
        this.f12119Z = i3 + 1;
        bArr2[i3] = f12107p0;
        m16442d(bArr, i, i2);
        if (this.f12119Z >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr3 = this.f12118Y;
        int i4 = this.f12119Z;
        this.f12119Z = i4 + 1;
        bArr3[i4] = f12107p0;
    }

    /* renamed from: e */
    private void m16444e(byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        int[] iArr = this.f12073S;
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            int i5 = i4 + 1;
            byte b = bArr[i4];
            if (b < 0 || iArr[b] == 0) {
                i4 = i5;
            } else {
                m16447f(bArr, i, i2);
                return;
            }
        }
        if (this.f12119Z + i2 > this.f12120a0) {
            mo16967O();
        }
        System.arraycopy(bArr, i, this.f12118Y, this.f12119Z, i2);
        this.f12119Z += i2;
    }

    /* renamed from: c */
    public void mo16629c(C3802m mVar) throws IOException, JsonGenerationException {
        byte[] e = mVar.mo16782e();
        if (e.length > 0) {
            m16438b(e);
        }
    }

    /* renamed from: c */
    private void m16440c(Object obj) throws IOException {
        if (this.f12119Z >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr = this.f12118Y;
        int i = this.f12119Z;
        this.f12119Z = i + 1;
        bArr[i] = f12107p0;
        mo16646g(obj.toString());
        if (this.f12119Z >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr2 = this.f12118Y;
        int i2 = this.f12119Z;
        this.f12119Z = i2 + 1;
        bArr2[i2] = f12107p0;
    }

    /* renamed from: a */
    public int mo16587a(C3785a aVar, InputStream inputStream, int i) throws IOException, JsonGenerationException {
        mo16806k("write binary value");
        if (this.f12119Z >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr = this.f12118Y;
        int i2 = this.f12119Z;
        this.f12119Z = i2 + 1;
        bArr[i2] = f12107p0;
        byte[] a = this.f12072R.mo16878a();
        if (i < 0) {
            try {
                i = mo16969a(aVar, inputStream, a);
            } catch (Throwable th) {
                this.f12072R.mo16876a(a);
                throw th;
            }
        } else {
            int a2 = mo16970a(aVar, inputStream, a, i);
            if (a2 > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Too few bytes available: missing ");
                sb.append(a2);
                sb.append(" bytes (out of ");
                sb.append(i);
                sb.append(")");
                mo16805j(sb.toString());
            }
        }
        this.f12072R.mo16876a(a);
        if (this.f12119Z >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr2 = this.f12118Y;
        int i3 = this.f12119Z;
        this.f12119Z = i3 + 1;
        bArr2[i3] = f12107p0;
        return i;
    }

    /* renamed from: b */
    public void mo16626b(String str, int i, int i2) throws IOException, JsonGenerationException {
        while (i2 > 0) {
            char[] cArr = this.f12122c0;
            int length = cArr.length;
            if (i2 < length) {
                length = i2;
            }
            int i3 = i + length;
            str.getChars(i, i3, cArr, 0);
            mo16619a(cArr, 0, length);
            i2 -= length;
            i = i3;
        }
    }

    /* renamed from: b */
    private void m16437b(long j) throws IOException {
        if (this.f12119Z + 23 >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr = this.f12118Y;
        int i = this.f12119Z;
        this.f12119Z = i + 1;
        bArr[i] = f12107p0;
        this.f12119Z = C3824i.m16314a(j, bArr, this.f12119Z);
        byte[] bArr2 = this.f12118Y;
        int i2 = this.f12119Z;
        this.f12119Z = i2 + 1;
        bArr2[i2] = f12107p0;
    }

    /* renamed from: d */
    private int m16441d(int i, int i2) throws IOException {
        int i3;
        byte[] bArr = this.f12118Y;
        int i4 = i2 + 1;
        bArr[i2] = f12104m0;
        int i5 = i4 + 1;
        bArr[i4] = f12098g0;
        if (i > 255) {
            int i6 = 255 & (i >> 8);
            int i7 = i5 + 1;
            byte[] bArr2 = f12113v0;
            bArr[i5] = bArr2[i6 >> 4];
            i3 = i7 + 1;
            bArr[i7] = bArr2[i6 & 15];
            i &= 255;
        } else {
            int i8 = i5 + 1;
            bArr[i5] = f12099h0;
            i3 = i8 + 1;
            bArr[i8] = f12099h0;
        }
        int i9 = i3 + 1;
        byte[] bArr3 = f12113v0;
        bArr[i3] = bArr3[i >> 4];
        int i10 = i9 + 1;
        bArr[i9] = bArr3[i & 15];
        return i10;
    }

    /* renamed from: c */
    private int m16439c(int i, int i2) throws IOException {
        byte[] bArr = this.f12118Y;
        if (i < f12108q0 || i > f12111t0) {
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((i >> 12) | JpegConst.APP0);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((i >> 6) & 63) | 128);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i & 63) | 128);
            return i5;
        }
        int i6 = i2 + 1;
        bArr[i2] = f12104m0;
        int i7 = i6 + 1;
        bArr[i6] = f12098g0;
        int i8 = i7 + 1;
        byte[] bArr2 = f12113v0;
        bArr[i7] = bArr2[(i >> 12) & 15];
        int i9 = i8 + 1;
        bArr[i8] = bArr2[(i >> 8) & 15];
        int i10 = i9 + 1;
        bArr[i9] = bArr2[(i >> 4) & 15];
        int i11 = i10 + 1;
        bArr[i10] = bArr2[i & 15];
        return i11;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo16974b(String str, int i) throws IOException, JsonGenerationException {
        if (i != 0) {
            if (i == 1) {
                this.f11835a.mo16766c(this);
            } else if (i == 2) {
                this.f11835a.mo16771h(this);
            } else if (i != 3) {
                mo16800K();
            } else {
                this.f11835a.mo16764b(this);
            }
        } else if (this.f11862P.mo16740f()) {
            this.f11835a.mo16769f(this);
        } else if (this.f11862P.mo16741g()) {
            this.f11835a.mo16767d(this);
        }
    }

    /* renamed from: a */
    public void mo16600a(long j) throws IOException, JsonGenerationException {
        mo16806k("write number");
        if (this.f11861O) {
            m16437b(j);
            return;
        }
        if (this.f12119Z + 21 >= this.f12120a0) {
            mo16967O();
        }
        this.f12119Z = C3824i.m16314a(j, this.f12118Y, this.f12119Z);
    }

    /* renamed from: b */
    private final void m16438b(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.f12119Z + length > this.f12120a0) {
            mo16967O();
            if (length > 512) {
                this.f12117X.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this.f12118Y, this.f12119Z, length);
        this.f12119Z += length;
    }

    /* renamed from: a */
    public void mo16615a(BigInteger bigInteger) throws IOException, JsonGenerationException {
        mo16806k("write number");
        if (bigInteger == null) {
            m16432P();
        } else if (this.f11861O) {
            m16440c((Object) bigInteger);
        } else {
            mo16646g(bigInteger.toString());
        }
    }

    /* renamed from: a */
    public void mo16598a(double d) throws IOException, JsonGenerationException {
        if (this.f11861O || ((Double.isNaN(d) || Double.isInfinite(d)) && mo16634c(C3792a.QUOTE_NON_NUMERIC_NUMBERS))) {
            mo16650i(String.valueOf(d));
            return;
        }
        mo16806k("write number");
        mo16646g(String.valueOf(d));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo16973b(C3785a aVar, byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        int i3 = i2 - 3;
        int i4 = this.f12120a0 - 6;
        int a = aVar.mo16486a() >> 2;
        while (i <= i3) {
            if (this.f12119Z > i4) {
                mo16967O();
            }
            int i5 = i + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            this.f12119Z = aVar.mo16492a((int) (((bArr[i] << 8) | (bArr[i5] & 255)) << 8) | (bArr[i6] & 255), this.f12118Y, this.f12119Z);
            a--;
            if (a <= 0) {
                byte[] bArr2 = this.f12118Y;
                int i8 = this.f12119Z;
                this.f12119Z = i8 + 1;
                bArr2[i8] = f12104m0;
                int i9 = this.f12119Z;
                this.f12119Z = i9 + 1;
                bArr2[i9] = 110;
                a = aVar.mo16486a() >> 2;
            }
            i = i7;
        }
        int i10 = i2 - i;
        if (i10 > 0) {
            if (this.f12119Z > i4) {
                mo16967O();
            }
            int i11 = i + 1;
            int i12 = bArr[i] << 16;
            if (i10 == 2) {
                i12 |= (bArr[i11] & 255) << 8;
            }
            this.f12119Z = aVar.mo16490a(i12, i10, this.f12118Y, this.f12119Z);
        }
    }

    /* renamed from: a */
    public void mo16599a(float f) throws IOException, JsonGenerationException {
        if (this.f11861O || ((Float.isNaN(f) || Float.isInfinite(f)) && mo16634c(C3792a.QUOTE_NON_NUMERIC_NUMBERS))) {
            mo16650i(String.valueOf(f));
            return;
        }
        mo16806k("write number");
        mo16646g(String.valueOf(f));
    }

    /* renamed from: a */
    public void mo16614a(BigDecimal bigDecimal) throws IOException, JsonGenerationException {
        mo16806k("write number");
        if (bigDecimal == null) {
            m16432P();
        } else if (this.f11861O) {
            m16440c((Object) bigDecimal);
        } else {
            mo16646g(bigDecimal.toString());
        }
    }

    /* renamed from: a */
    public void mo16616a(boolean z) throws IOException, JsonGenerationException {
        mo16806k("write boolean value");
        if (this.f12119Z + 5 >= this.f12120a0) {
            mo16967O();
        }
        byte[] bArr = z ? f12115x0 : f12116y0;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this.f12118Y, this.f12119Z, length);
        this.f12119Z += length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo16972b(int i, int i2) throws IOException {
        int a = mo16968a(i, i2);
        if (this.f12119Z + 4 > this.f12120a0) {
            mo16967O();
        }
        byte[] bArr = this.f12118Y;
        int i3 = this.f12119Z;
        this.f12119Z = i3 + 1;
        bArr[i3] = (byte) ((a >> 18) | 240);
        int i4 = this.f12119Z;
        this.f12119Z = i4 + 1;
        bArr[i4] = (byte) (((a >> 12) & 63) | 128);
        int i5 = this.f12119Z;
        this.f12119Z = i5 + 1;
        bArr[i5] = (byte) (((a >> 6) & 63) | 128);
        int i6 = this.f12119Z;
        this.f12119Z = i6 + 1;
        bArr[i6] = (byte) ((a & 63) | 128);
    }

    /* renamed from: a */
    private int m16436a(byte[] bArr, int i, C3802m mVar, int i2) throws IOException, JsonGenerationException {
        byte[] e = mVar.mo16782e();
        int length = e.length;
        if (length > 6) {
            return m16435a(bArr, i, this.f12120a0, e, i2);
        }
        System.arraycopy(e, 0, bArr, i, length);
        return i + length;
    }

    /* renamed from: a */
    private int m16435a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException, JsonGenerationException {
        int length = bArr2.length;
        if (i + length > i2) {
            this.f12119Z = i;
            mo16967O();
            int i4 = this.f12119Z;
            if (length > bArr.length) {
                this.f12117X.write(bArr2, 0, length);
                return i4;
            }
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i = i4 + length;
        }
        if ((i3 * 6) + i <= i2) {
            return i;
        }
        mo16967O();
        return this.f12119Z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo16970a(C3785a aVar, InputStream inputStream, byte[] bArr, int i) throws IOException, JsonGenerationException {
        int i2 = this.f12120a0 - 6;
        int a = aVar.mo16486a() >> 2;
        int i3 = -3;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i <= 2) {
                break;
            }
            if (i4 > i3) {
                int a2 = m16434a(inputStream, bArr, i4, i5, i);
                if (a2 < 3) {
                    i5 = a2;
                    i4 = 0;
                    break;
                }
                i5 = a2;
                i3 = a2 - 3;
                i4 = 0;
            }
            if (this.f12119Z > i2) {
                mo16967O();
            }
            int i6 = i4 + 1;
            int i7 = bArr[i4] << 8;
            int i8 = i6 + 1;
            i4 = i8 + 1;
            i -= 3;
            this.f12119Z = aVar.mo16492a((int) (((bArr[i6] & 255) | i7) << 8) | (bArr[i8] & 255), this.f12118Y, this.f12119Z);
            a--;
            if (a <= 0) {
                byte[] bArr2 = this.f12118Y;
                int i9 = this.f12119Z;
                this.f12119Z = i9 + 1;
                bArr2[i9] = f12104m0;
                int i10 = this.f12119Z;
                this.f12119Z = i10 + 1;
                bArr2[i10] = 110;
                a = aVar.mo16486a() >> 2;
            }
        }
        if (i <= 0) {
            return i;
        }
        int a3 = m16434a(inputStream, bArr, i4, i5, i);
        if (a3 <= 0) {
            return i;
        }
        if (this.f12119Z > i2) {
            mo16967O();
        }
        int i11 = bArr[0] << 16;
        int i12 = 1;
        if (1 < a3) {
            i11 |= (bArr[1] & 255) << 8;
            i12 = 2;
        }
        this.f12119Z = aVar.mo16490a(i11, i12, this.f12118Y, this.f12119Z);
        return i - i12;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo16969a(C3785a aVar, InputStream inputStream, byte[] bArr) throws IOException, JsonGenerationException {
        int a;
        int i = this.f12120a0 - 6;
        int i2 = -3;
        int a2 = aVar.mo16486a() >> 2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 > i2) {
                a = m16434a(inputStream, bArr, i4, i5, bArr.length);
                if (a < 3) {
                    break;
                }
                i5 = a;
                i2 = a - 3;
                i4 = 0;
            }
            if (this.f12119Z > i) {
                mo16967O();
            }
            int i6 = i4 + 1;
            int i7 = bArr[i4] << 8;
            int i8 = i6 + 1;
            i4 = i8 + 1;
            i3 += 3;
            this.f12119Z = aVar.mo16492a((int) (((bArr[i6] & 255) | i7) << 8) | (bArr[i8] & 255), this.f12118Y, this.f12119Z);
            a2--;
            if (a2 <= 0) {
                byte[] bArr2 = this.f12118Y;
                int i9 = this.f12119Z;
                this.f12119Z = i9 + 1;
                bArr2[i9] = f12104m0;
                int i10 = this.f12119Z;
                this.f12119Z = i10 + 1;
                bArr2[i10] = 110;
                a2 = aVar.mo16486a() >> 2;
            }
        }
        if (a <= 0) {
            return i3;
        }
        if (this.f12119Z > i) {
            mo16967O();
        }
        int i11 = bArr[0] << 16;
        int i12 = 1;
        if (1 < a) {
            i11 |= (bArr[1] & 255) << 8;
            i12 = 2;
        }
        int i13 = i3 + i12;
        this.f12119Z = aVar.mo16490a(i11, i12, this.f12118Y, this.f12119Z);
        return i13;
    }

    /* renamed from: a */
    private int m16434a(InputStream inputStream, byte[] bArr, int i, int i2, int i3) throws IOException {
        int i4 = 0;
        while (i < i2) {
            int i5 = i4 + 1;
            int i6 = i + 1;
            bArr[i4] = bArr[i];
            i4 = i5;
            i = i6;
        }
        int min = Math.min(i3, bArr.length);
        do {
            int read = inputStream.read(bArr, i4, min - i4);
            if (read < 0) {
                return i4;
            }
            i4 += read;
        } while (i4 < 3);
        return i4;
    }

    /* renamed from: a */
    private int m16433a(int i, char[] cArr, int i2, int i3) throws IOException {
        if (i < f12108q0 || i > f12111t0) {
            byte[] bArr = this.f12118Y;
            int i4 = this.f12119Z;
            this.f12119Z = i4 + 1;
            bArr[i4] = (byte) ((i >> 12) | JpegConst.APP0);
            int i5 = this.f12119Z;
            this.f12119Z = i5 + 1;
            bArr[i5] = (byte) (((i >> 6) & 63) | 128);
            int i6 = this.f12119Z;
            this.f12119Z = i6 + 1;
            bArr[i6] = (byte) ((i & 63) | 128);
            return i2;
        }
        if (i2 >= i3) {
            mo16805j("Split surrogate on writeRaw() input (last character)");
        }
        mo16972b(i, (int) cArr[i2]);
        return i2 + 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo16968a(int i, int i2) throws IOException {
        if (i2 < f12110s0 || i2 > f12111t0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Incomplete surrogate pair: first char 0x");
            sb.append(Integer.toHexString(i));
            sb.append(", second 0x");
            sb.append(Integer.toHexString(i2));
            mo16805j(sb.toString());
        }
        return ((i - f12108q0) << 10) + 65536 + (i2 - f12110s0);
    }
}
