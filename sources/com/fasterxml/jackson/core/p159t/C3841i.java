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
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.p217i1.C14662d0;

/* renamed from: com.fasterxml.jackson.core.t.i */
/* compiled from: WriterBasedJsonGenerator */
public final class C3841i extends C3833c {

    /* renamed from: e0 */
    protected static final int f12138e0 = 32;

    /* renamed from: f0 */
    protected static final char[] f12139f0 = C3817b.m16261b();

    /* renamed from: X */
    protected final Writer f12140X;

    /* renamed from: Y */
    protected char[] f12141Y;

    /* renamed from: Z */
    protected int f12142Z = 0;

    /* renamed from: a0 */
    protected int f12143a0 = 0;

    /* renamed from: b0 */
    protected int f12144b0;

    /* renamed from: c0 */
    protected char[] f12145c0;

    /* renamed from: d0 */
    protected C3802m f12146d0;

    public C3841i(C3819d dVar, int i, C3800k kVar, Writer writer) {
        super(dVar, i, kVar);
        this.f12140X = writer;
        this.f12141Y = dVar.mo16882b();
        this.f12144b0 = this.f12141Y.length;
    }

    /* renamed from: P */
    private char[] m16575P() {
        char[] cArr = new char[14];
        cArr[0] = '\\';
        cArr[2] = '\\';
        cArr[3] = 'u';
        cArr[4] = '0';
        cArr[5] = '0';
        cArr[8] = '\\';
        cArr[9] = 'u';
        this.f12145c0 = cArr;
        return cArr;
    }

    /* renamed from: Q */
    private void m16576Q() throws IOException {
        if (this.f12143a0 + 4 >= this.f12144b0) {
            mo17002O();
        }
        int i = this.f12143a0;
        char[] cArr = this.f12141Y;
        cArr[i] = 'n';
        int i2 = i + 1;
        cArr[i2] = 'u';
        int i3 = i2 + 1;
        cArr[i3] = 'l';
        int i4 = i3 + 1;
        cArr[i4] = 'l';
        this.f12143a0 = i4 + 1;
    }

    /* renamed from: f */
    private void m16588f(int i) throws IOException {
        if (this.f12143a0 + 13 >= this.f12144b0) {
            mo17002O();
        }
        char[] cArr = this.f12141Y;
        int i2 = this.f12143a0;
        this.f12143a0 = i2 + 1;
        cArr[i2] = C14662d0.f42850a;
        this.f12143a0 = C3824i.m16319b(i, cArr, this.f12143a0);
        char[] cArr2 = this.f12141Y;
        int i3 = this.f12143a0;
        this.f12143a0 = i3 + 1;
        cArr2[i3] = C14662d0.f42850a;
    }

    /* renamed from: h */
    private void m16590h(int i) throws IOException, JsonGenerationException {
        char c;
        int[] iArr = this.f12073S;
        int i2 = this.f12074T;
        if (i2 < 1) {
            i2 = 65535;
        }
        int min = Math.min(iArr.length, i2 + 1);
        C3818c cVar = this.f12075U;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i) {
            while (true) {
                c = this.f12141Y[i3];
                if (c >= min) {
                    if (c <= i2) {
                        C3802m a = cVar.mo16873a(c);
                        this.f12146d0 = a;
                        if (a != null) {
                            i5 = -2;
                            break;
                        }
                    } else {
                        i5 = -1;
                        break;
                    }
                } else {
                    i5 = iArr[c];
                    if (i5 != 0) {
                        break;
                    }
                }
                i3++;
                if (i3 >= i) {
                    break;
                }
            }
            int i6 = i3 - i4;
            if (i6 > 0) {
                this.f12140X.write(this.f12141Y, i4, i6);
                if (i3 >= i) {
                    return;
                }
            }
            i3++;
            i4 = m16578a(this.f12141Y, i3, i, c, i5);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052 A[SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16592j(int r12) throws java.io.IOException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r11 = this;
            int r0 = r11.f12143a0
            int r0 = r0 + r12
            int[] r12 = r11.f12073S
            int r1 = r11.f12074T
            r2 = 1
            if (r1 >= r2) goto L_0x000d
            r1 = 65535(0xffff, float:9.1834E-41)
        L_0x000d:
            int r3 = r12.length
            int r4 = r1 + 1
            int r3 = java.lang.Math.min(r3, r4)
            com.fasterxml.jackson.core.s.c r4 = r11.f12075U
        L_0x0016:
            int r5 = r11.f12143a0
            if (r5 >= r0) goto L_0x0052
        L_0x001a:
            char[] r5 = r11.f12141Y
            int r6 = r11.f12143a0
            char r5 = r5[r6]
            if (r5 >= r3) goto L_0x0027
            r6 = r12[r5]
            if (r6 == 0) goto L_0x004b
            goto L_0x0034
        L_0x0027:
            if (r5 <= r1) goto L_0x002b
            r6 = -1
            goto L_0x0034
        L_0x002b:
            com.fasterxml.jackson.core.m r6 = r4.mo16873a(r5)
            r11.f12146d0 = r6
            if (r6 == 0) goto L_0x004b
            r6 = -2
        L_0x0034:
            int r7 = r11.f12143a0
            int r8 = r11.f12142Z
            int r7 = r7 - r8
            if (r7 <= 0) goto L_0x0042
            java.io.Writer r9 = r11.f12140X
            char[] r10 = r11.f12141Y
            r9.write(r10, r8, r7)
        L_0x0042:
            int r7 = r11.f12143a0
            int r7 = r7 + r2
            r11.f12143a0 = r7
            r11.m16582b(r5, r6)
            goto L_0x0016
        L_0x004b:
            int r5 = r11.f12143a0
            int r5 = r5 + r2
            r11.f12143a0 = r5
            if (r5 < r0) goto L_0x001a
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p159t.C3841i.m16592j(int):void");
    }

    /* renamed from: l */
    private void m16593l(String str) throws IOException, JsonGenerationException {
        mo17002O();
        int length = str.length();
        int i = 0;
        while (true) {
            int i2 = this.f12144b0;
            if (i + i2 > length) {
                i2 = length - i;
            }
            int i3 = i + i2;
            str.getChars(i, i3, this.f12141Y, 0);
            if (this.f12075U != null) {
                m16590h(i2);
            } else {
                int i4 = this.f12074T;
                if (i4 != 0) {
                    m16580a(i2, i4);
                } else {
                    m16589g(i2);
                }
            }
            if (i3 < length) {
                i = i3;
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    private void m16594m(String str) throws IOException, JsonGenerationException {
        int length = str.length();
        int i = this.f12144b0;
        if (length > i) {
            m16593l(str);
            return;
        }
        if (this.f12143a0 + length > i) {
            mo17002O();
        }
        str.getChars(0, length, this.f12141Y, this.f12143a0);
        if (this.f12075U != null) {
            m16592j(length);
        } else {
            int i2 = this.f12074T;
            if (i2 != 0) {
                m16583b(length, i2);
            } else {
                m16591i(length);
            }
        }
    }

    /* renamed from: n */
    private void m16595n(String str) throws IOException, JsonGenerationException {
        int i = this.f12144b0;
        int i2 = this.f12143a0;
        int i3 = i - i2;
        str.getChars(0, i3, this.f12141Y, i2);
        this.f12143a0 += i3;
        mo17002O();
        int length = str.length() - i3;
        while (true) {
            int i4 = this.f12144b0;
            if (length > i4) {
                int i5 = i3 + i4;
                str.getChars(i3, i5, this.f12141Y, 0);
                this.f12142Z = 0;
                this.f12143a0 = i4;
                mo17002O();
                length -= i4;
                i3 = i5;
            } else {
                str.getChars(i3, i3 + length, this.f12141Y, 0);
                this.f12142Z = 0;
                this.f12143a0 = length;
                return;
            }
        }
    }

    /* renamed from: F */
    public void mo16582F() throws IOException, JsonGenerationException {
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
            if (this.f12143a0 >= this.f12144b0) {
                mo17002O();
            }
            char[] cArr = this.f12141Y;
            int i = this.f12143a0;
            this.f12143a0 = i + 1;
            cArr[i] = ']';
        }
        this.f11862P = this.f11862P.mo16738d();
    }

    /* renamed from: G */
    public void mo16583G() throws IOException, JsonGenerationException {
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
            if (this.f12143a0 >= this.f12144b0) {
                mo17002O();
            }
            char[] cArr = this.f12141Y;
            int i = this.f12143a0;
            this.f12143a0 = i + 1;
            cArr[i] = '}';
        }
        this.f11862P = this.f11862P.mo16738d();
    }

    /* renamed from: H */
    public void mo16584H() throws IOException, JsonGenerationException {
        mo16806k("write null value");
        m16576Q();
    }

    /* renamed from: I */
    public void mo16585I() throws IOException, JsonGenerationException {
        mo16806k("start an array");
        this.f11862P = this.f11862P.mo16946i();
        C3801l lVar = this.f11835a;
        if (lVar != null) {
            lVar.mo16768e(this);
            return;
        }
        if (this.f12143a0 >= this.f12144b0) {
            mo17002O();
        }
        char[] cArr = this.f12141Y;
        int i = this.f12143a0;
        this.f12143a0 = i + 1;
        cArr[i] = '[';
    }

    /* renamed from: J */
    public void mo16586J() throws IOException, JsonGenerationException {
        mo16806k("start an object");
        this.f11862P = this.f11862P.mo16947j();
        C3801l lVar = this.f11835a;
        if (lVar != null) {
            lVar.mo16762a(this);
            return;
        }
        if (this.f12143a0 >= this.f12144b0) {
            mo17002O();
        }
        char[] cArr = this.f12141Y;
        int i = this.f12143a0;
        this.f12143a0 = i + 1;
        cArr[i] = '{';
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo16801L() {
        char[] cArr = this.f12141Y;
        if (cArr != null) {
            this.f12141Y = null;
            this.f12072R.mo16877a(cArr);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo17002O() throws IOException {
        int i = this.f12143a0;
        int i2 = this.f12142Z;
        int i3 = i - i2;
        if (i3 > 0) {
            this.f12142Z = 0;
            this.f12143a0 = 0;
            this.f12140X.write(this.f12141Y, i2, i3);
        }
    }

    /* renamed from: a */
    public void mo17005a(C3802m mVar, boolean z) throws IOException, JsonGenerationException {
        if (this.f11835a != null) {
            mo17007b(mVar, z);
            return;
        }
        if (this.f12143a0 + 1 >= this.f12144b0) {
            mo17002O();
        }
        if (z) {
            char[] cArr = this.f12141Y;
            int i = this.f12143a0;
            this.f12143a0 = i + 1;
            cArr[i] = ',';
        }
        char[] a = mVar.mo16776a();
        if (!mo16634c(C3792a.QUOTE_FIELD_NAMES)) {
            mo16619a(a, 0, a.length);
            return;
        }
        char[] cArr2 = this.f12141Y;
        int i2 = this.f12143a0;
        this.f12143a0 = i2 + 1;
        cArr2[i2] = C14662d0.f42850a;
        int length = a.length;
        int i3 = this.f12143a0;
        if (i3 + length + 1 >= this.f12144b0) {
            mo16619a(a, 0, length);
            if (this.f12143a0 >= this.f12144b0) {
                mo17002O();
            }
            char[] cArr3 = this.f12141Y;
            int i4 = this.f12143a0;
            this.f12143a0 = i4 + 1;
            cArr3[i4] = C14662d0.f42850a;
        } else {
            System.arraycopy(a, 0, cArr2, i3, length);
            this.f12143a0 += length;
            char[] cArr4 = this.f12141Y;
            int i5 = this.f12143a0;
            this.f12143a0 = i5 + 1;
            cArr4[i5] = C14662d0.f42850a;
        }
    }

    /* renamed from: b */
    public void mo16624b(C3802m mVar) throws IOException, JsonGenerationException {
        int a = this.f11862P.mo16944a(mVar.getValue());
        if (a == 4) {
            mo16805j("Can not write a field name, expecting a value");
        }
        boolean z = true;
        if (a != 1) {
            z = false;
        }
        mo17005a(mVar, z);
    }

    /* renamed from: c */
    public void mo16630c(String str) throws IOException, JsonGenerationException {
        int a = this.f11862P.mo16944a(str);
        if (a == 4) {
            mo16805j("Can not write a field name, expecting a value");
        }
        boolean z = true;
        if (a != 1) {
            z = false;
        }
        mo17009b(str, z);
    }

    public void close() throws IOException {
        super.close();
        if (this.f12141Y != null && mo16634c(C3792a.AUTO_CLOSE_JSON_CONTENT)) {
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
        mo17002O();
        if (this.f12140X != null) {
            if (this.f12072R.mo16891i() || mo16634c(C3792a.AUTO_CLOSE_TARGET)) {
                this.f12140X.close();
            } else if (mo16634c(C3792a.FLUSH_PASSED_TO_STREAM)) {
                this.f12140X.flush();
            }
        }
        mo16801L();
    }

    /* renamed from: d */
    public void mo16637d(C3802m mVar) throws IOException, JsonGenerationException {
        mo16806k("write text value");
        if (this.f12143a0 >= this.f12144b0) {
            mo17002O();
        }
        char[] cArr = this.f12141Y;
        int i = this.f12143a0;
        this.f12143a0 = i + 1;
        cArr[i] = C14662d0.f42850a;
        char[] a = mVar.mo16776a();
        int length = a.length;
        if (length < 32) {
            if (length > this.f12144b0 - this.f12143a0) {
                mo17002O();
            }
            System.arraycopy(a, 0, this.f12141Y, this.f12143a0, length);
            this.f12143a0 += length;
        } else {
            mo17002O();
            this.f12140X.write(a, 0, length);
        }
        if (this.f12143a0 >= this.f12144b0) {
            mo17002O();
        }
        char[] cArr2 = this.f12141Y;
        int i2 = this.f12143a0;
        this.f12143a0 = i2 + 1;
        cArr2[i2] = C14662d0.f42850a;
    }

    /* renamed from: e */
    public void mo16640e(int i) throws IOException, JsonGenerationException {
        mo16806k("write number");
        if (this.f11861O) {
            m16588f(i);
            return;
        }
        if (this.f12143a0 + 11 >= this.f12144b0) {
            mo17002O();
        }
        this.f12143a0 = C3824i.m16319b(i, this.f12141Y, this.f12143a0);
    }

    public void flush() throws IOException {
        mo17002O();
        if (this.f12140X != null && mo16634c(C3792a.FLUSH_PASSED_TO_STREAM)) {
            this.f12140X.flush();
        }
    }

    /* renamed from: g */
    public Object mo16645g() {
        return this.f12140X;
    }

    /* renamed from: i */
    public void mo16650i(String str) throws IOException, JsonGenerationException {
        mo16806k("write text value");
        if (str == null) {
            m16576Q();
            return;
        }
        if (this.f12143a0 >= this.f12144b0) {
            mo17002O();
        }
        char[] cArr = this.f12141Y;
        int i = this.f12143a0;
        this.f12143a0 = i + 1;
        cArr[i] = C14662d0.f42850a;
        m16594m(str);
        if (this.f12143a0 >= this.f12144b0) {
            mo17002O();
        }
        char[] cArr2 = this.f12141Y;
        int i2 = this.f12143a0;
        this.f12143a0 = i2 + 1;
        cArr2[i2] = C14662d0.f42850a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo16806k(String str) throws IOException, JsonGenerationException {
        char c;
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
                c = ',';
            } else if (k == 2) {
                c = ':';
            } else if (k == 3) {
                C3802m mVar = this.f12076V;
                if (mVar != null) {
                    mo16646g(mVar.getValue());
                }
                return;
            } else {
                return;
            }
            if (this.f12143a0 >= this.f12144b0) {
                mo17002O();
            }
            char[] cArr = this.f12141Y;
            int i = this.f12143a0;
            cArr[i] = c;
            this.f12143a0 = i + 1;
            return;
        }
        mo17008b(str, k);
    }

    /* renamed from: g */
    public void mo16646g(String str) throws IOException, JsonGenerationException {
        int length = str.length();
        int i = this.f12144b0 - this.f12143a0;
        if (i == 0) {
            mo17002O();
            i = this.f12144b0 - this.f12143a0;
        }
        if (i >= length) {
            str.getChars(0, length, this.f12141Y, this.f12143a0);
            this.f12143a0 += length;
            return;
        }
        m16595n(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17009b(String str, boolean z) throws IOException, JsonGenerationException {
        if (this.f11835a != null) {
            mo17010c(str, z);
            return;
        }
        if (this.f12143a0 + 1 >= this.f12144b0) {
            mo17002O();
        }
        if (z) {
            char[] cArr = this.f12141Y;
            int i = this.f12143a0;
            this.f12143a0 = i + 1;
            cArr[i] = ',';
        }
        if (!mo16634c(C3792a.QUOTE_FIELD_NAMES)) {
            m16594m(str);
            return;
        }
        char[] cArr2 = this.f12141Y;
        int i2 = this.f12143a0;
        this.f12143a0 = i2 + 1;
        cArr2[i2] = C14662d0.f42850a;
        m16594m(str);
        if (this.f12143a0 >= this.f12144b0) {
            mo17002O();
        }
        char[] cArr3 = this.f12141Y;
        int i3 = this.f12143a0;
        this.f12143a0 = i3 + 1;
        cArr3[i3] = C14662d0.f42850a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo17010c(String str, boolean z) throws IOException, JsonGenerationException {
        if (z) {
            this.f11835a.mo16770g(this);
        } else {
            this.f11835a.mo16767d(this);
        }
        if (mo16634c(C3792a.QUOTE_FIELD_NAMES)) {
            if (this.f12143a0 >= this.f12144b0) {
                mo17002O();
            }
            char[] cArr = this.f12141Y;
            int i = this.f12143a0;
            this.f12143a0 = i + 1;
            cArr[i] = C14662d0.f42850a;
            m16594m(str);
            if (this.f12143a0 >= this.f12144b0) {
                mo17002O();
            }
            char[] cArr2 = this.f12141Y;
            int i2 = this.f12143a0;
            this.f12143a0 = i2 + 1;
            cArr2[i2] = C14662d0.f42850a;
            return;
        }
        m16594m(str);
    }

    /* renamed from: e */
    public void mo16641e(String str) throws IOException, JsonGenerationException {
        mo16806k("write number");
        if (this.f11861O) {
            m16585c((Object) str);
        } else {
            mo16646g(str);
        }
    }

    /* renamed from: g */
    private void m16589g(int i) throws IOException, JsonGenerationException {
        char c;
        int[] iArr = this.f12073S;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            do {
                c = this.f12141Y[i2];
                if (c < length && iArr[c] != 0) {
                    break;
                }
                i2++;
            } while (i2 < i);
            int i4 = i2 - i3;
            if (i4 > 0) {
                this.f12140X.write(this.f12141Y, i3, i4);
                if (i2 >= i) {
                    return;
                }
            }
            i2++;
            i3 = m16578a(this.f12141Y, i2, i, c, iArr[c]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r2 = r6.f12141Y;
        r3 = r6.f12143a0;
        r6.f12143a0 = r3 + 1;
        r2 = r2[r3];
        m16582b(r2, r7[r2]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        r4 = r6.f12142Z;
        r3 = r3 - r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r3 <= 0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r6.f12140X.write(r2, r4, r3);
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16591i(int r7) throws java.io.IOException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r6 = this;
            int r0 = r6.f12143a0
            int r0 = r0 + r7
            int[] r7 = r6.f12073S
            int r1 = r7.length
        L_0x0006:
            int r2 = r6.f12143a0
            if (r2 >= r0) goto L_0x0038
        L_0x000a:
            char[] r2 = r6.f12141Y
            int r3 = r6.f12143a0
            char r4 = r2[r3]
            if (r4 >= r1) goto L_0x0030
            r4 = r7[r4]
            if (r4 == 0) goto L_0x0030
            int r4 = r6.f12142Z
            int r3 = r3 - r4
            if (r3 <= 0) goto L_0x0020
            java.io.Writer r5 = r6.f12140X
            r5.write(r2, r4, r3)
        L_0x0020:
            char[] r2 = r6.f12141Y
            int r3 = r6.f12143a0
            int r4 = r3 + 1
            r6.f12143a0 = r4
            char r2 = r2[r3]
            r3 = r7[r2]
            r6.m16582b(r2, r3)
            goto L_0x0006
        L_0x0030:
            int r2 = r6.f12143a0
            int r2 = r2 + 1
            r6.f12143a0 = r2
            if (r2 < r0) goto L_0x000a
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p159t.C3841i.m16591i(int):void");
    }

    /* renamed from: e */
    private void m16587e(char[] cArr, int i, int i2) throws IOException, JsonGenerationException {
        char c;
        int i3 = i2 + i;
        int[] iArr = this.f12073S;
        int i4 = this.f12074T;
        if (i4 < 1) {
            i4 = 65535;
        }
        int min = Math.min(iArr.length, i4 + 1);
        C3818c cVar = this.f12075U;
        int i5 = 0;
        while (i < i3) {
            int i6 = i5;
            int i7 = i;
            while (true) {
                c = cArr[i7];
                if (c >= min) {
                    if (c <= i4) {
                        C3802m a = cVar.mo16873a(c);
                        this.f12146d0 = a;
                        if (a != null) {
                            i6 = -2;
                            break;
                        }
                    } else {
                        i6 = -1;
                        break;
                    }
                } else {
                    i6 = iArr[c];
                    if (i6 != 0) {
                        break;
                    }
                }
                i7++;
                if (i7 >= i3) {
                    break;
                }
            }
            int i8 = i7 - i;
            if (i8 < 32) {
                if (this.f12143a0 + i8 > this.f12144b0) {
                    mo17002O();
                }
                if (i8 > 0) {
                    System.arraycopy(cArr, i, this.f12141Y, this.f12143a0, i8);
                    this.f12143a0 += i8;
                }
            } else {
                mo17002O();
                this.f12140X.write(cArr, i, i8);
            }
            if (i7 < i3) {
                i = i7 + 1;
                m16579a(c, i6);
                i5 = i6;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo16633c(char[] cArr, int i, int i2) throws IOException, JsonGenerationException {
        mo16806k("write text value");
        if (this.f12143a0 >= this.f12144b0) {
            mo17002O();
        }
        char[] cArr2 = this.f12141Y;
        int i3 = this.f12143a0;
        this.f12143a0 = i3 + 1;
        cArr2[i3] = C14662d0.f42850a;
        m16586d(cArr, i, i2);
        if (this.f12143a0 >= this.f12144b0) {
            mo17002O();
        }
        char[] cArr3 = this.f12141Y;
        int i4 = this.f12143a0;
        this.f12143a0 = i4 + 1;
        cArr3[i4] = C14662d0.f42850a;
    }

    /* renamed from: d */
    private void m16586d(char[] cArr, int i, int i2) throws IOException, JsonGenerationException {
        if (this.f12075U != null) {
            m16587e(cArr, i, i2);
            return;
        }
        int i3 = this.f12074T;
        if (i3 != 0) {
            m16581a(cArr, i, i2, i3);
            return;
        }
        int i4 = i2 + i;
        int[] iArr = this.f12073S;
        int length = iArr.length;
        while (i < i4) {
            int i5 = i;
            do {
                char c = cArr[i5];
                if (c < length && iArr[c] != 0) {
                    break;
                }
                i5++;
            } while (i5 < i4);
            int i6 = i5 - i;
            if (i6 < 32) {
                if (this.f12143a0 + i6 > this.f12144b0) {
                    mo17002O();
                }
                if (i6 > 0) {
                    System.arraycopy(cArr, i, this.f12141Y, this.f12143a0, i6);
                    this.f12143a0 += i6;
                }
            } else {
                mo17002O();
                this.f12140X.write(cArr, i, i6);
            }
            if (i5 >= i4) {
                break;
            }
            i = i5 + 1;
            char c2 = cArr[i5];
            m16579a(c2, iArr[c2]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17007b(C3802m mVar, boolean z) throws IOException, JsonGenerationException {
        if (z) {
            this.f11835a.mo16770g(this);
        } else {
            this.f11835a.mo16767d(this);
        }
        char[] a = mVar.mo16776a();
        if (mo16634c(C3792a.QUOTE_FIELD_NAMES)) {
            if (this.f12143a0 >= this.f12144b0) {
                mo17002O();
            }
            char[] cArr = this.f12141Y;
            int i = this.f12143a0;
            this.f12143a0 = i + 1;
            cArr[i] = C14662d0.f42850a;
            mo16619a(a, 0, a.length);
            if (this.f12143a0 >= this.f12144b0) {
                mo17002O();
            }
            char[] cArr2 = this.f12141Y;
            int i2 = this.f12143a0;
            this.f12143a0 = i2 + 1;
            cArr2[i2] = C14662d0.f42850a;
            return;
        }
        mo16619a(a, 0, a.length);
    }

    /* renamed from: a */
    public void mo16619a(char[] cArr, int i, int i2) throws IOException, JsonGenerationException {
        if (i2 < 32) {
            if (i2 > this.f12144b0 - this.f12143a0) {
                mo17002O();
            }
            System.arraycopy(cArr, i, this.f12141Y, this.f12143a0, i2);
            this.f12143a0 += i2;
            return;
        }
        mo17002O();
        this.f12140X.write(cArr, i, i2);
    }

    /* renamed from: c */
    public void mo16632c(byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        mo16802M();
    }

    /* renamed from: c */
    public void mo16629c(C3802m mVar) throws IOException, JsonGenerationException {
        mo16646g(mVar.getValue());
    }

    /* renamed from: c */
    private void m16585c(Object obj) throws IOException {
        if (this.f12143a0 >= this.f12144b0) {
            mo17002O();
        }
        char[] cArr = this.f12141Y;
        int i = this.f12143a0;
        this.f12143a0 = i + 1;
        cArr[i] = C14662d0.f42850a;
        mo16646g(obj.toString());
        if (this.f12143a0 >= this.f12144b0) {
            mo17002O();
        }
        char[] cArr2 = this.f12141Y;
        int i2 = this.f12143a0;
        this.f12143a0 = i2 + 1;
        cArr2[i2] = C14662d0.f42850a;
    }

    /* renamed from: a */
    public void mo16597a(char c) throws IOException, JsonGenerationException {
        if (this.f12143a0 >= this.f12144b0) {
            mo17002O();
        }
        char[] cArr = this.f12141Y;
        int i = this.f12143a0;
        this.f12143a0 = i + 1;
        cArr[i] = c;
    }

    /* renamed from: a */
    public void mo16601a(C3785a aVar, byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        mo16806k("write binary value");
        if (this.f12143a0 >= this.f12144b0) {
            mo17002O();
        }
        char[] cArr = this.f12141Y;
        int i3 = this.f12143a0;
        this.f12143a0 = i3 + 1;
        cArr[i3] = C14662d0.f42850a;
        mo17006b(aVar, bArr, i, i2 + i);
        if (this.f12143a0 >= this.f12144b0) {
            mo17002O();
        }
        char[] cArr2 = this.f12141Y;
        int i4 = this.f12143a0;
        this.f12143a0 = i4 + 1;
        cArr2[i4] = C14662d0.f42850a;
    }

    /* renamed from: b */
    public void mo16627b(byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        mo16802M();
    }

    /* renamed from: b */
    public void mo16626b(String str, int i, int i2) throws IOException, JsonGenerationException {
        int i3 = this.f12144b0 - this.f12143a0;
        if (i3 < i2) {
            mo17002O();
            i3 = this.f12144b0 - this.f12143a0;
        }
        if (i3 >= i2) {
            str.getChars(i, i + i2, this.f12141Y, this.f12143a0);
            this.f12143a0 += i2;
            return;
        }
        m16595n(str.substring(i, i2 + i));
    }

    /* renamed from: b */
    private void m16584b(long j) throws IOException {
        if (this.f12143a0 + 23 >= this.f12144b0) {
            mo17002O();
        }
        char[] cArr = this.f12141Y;
        int i = this.f12143a0;
        this.f12143a0 = i + 1;
        cArr[i] = C14662d0.f42850a;
        this.f12143a0 = C3824i.m16315a(j, cArr, this.f12143a0);
        char[] cArr2 = this.f12141Y;
        int i2 = this.f12143a0;
        this.f12143a0 = i2 + 1;
        cArr2[i2] = C14662d0.f42850a;
    }

    /* renamed from: a */
    public int mo16587a(C3785a aVar, InputStream inputStream, int i) throws IOException, JsonGenerationException {
        mo16806k("write binary value");
        if (this.f12143a0 >= this.f12144b0) {
            mo17002O();
        }
        char[] cArr = this.f12141Y;
        int i2 = this.f12143a0;
        this.f12143a0 = i2 + 1;
        cArr[i2] = C14662d0.f42850a;
        byte[] a = this.f12072R.mo16878a();
        if (i < 0) {
            try {
                i = mo17003a(aVar, inputStream, a);
            } catch (Throwable th) {
                this.f12072R.mo16876a(a);
                throw th;
            }
        } else {
            int a2 = mo17004a(aVar, inputStream, a, i);
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
        if (this.f12143a0 >= this.f12144b0) {
            mo17002O();
        }
        char[] cArr2 = this.f12141Y;
        int i3 = this.f12143a0;
        this.f12143a0 = i3 + 1;
        cArr2[i3] = C14662d0.f42850a;
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17008b(String str, int i) throws IOException, JsonGenerationException {
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

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16583b(int r9, int r10) throws java.io.IOException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r8 = this;
            int r0 = r8.f12143a0
            int r0 = r0 + r9
            int[] r9 = r8.f12073S
            int r1 = r9.length
            int r2 = r10 + 1
            int r1 = java.lang.Math.min(r1, r2)
        L_0x000c:
            int r2 = r8.f12143a0
            if (r2 >= r0) goto L_0x0040
        L_0x0010:
            char[] r2 = r8.f12141Y
            int r3 = r8.f12143a0
            char r2 = r2[r3]
            if (r2 >= r1) goto L_0x001d
            r3 = r9[r2]
            if (r3 == 0) goto L_0x0038
            goto L_0x0020
        L_0x001d:
            if (r2 <= r10) goto L_0x0038
            r3 = -1
        L_0x0020:
            int r4 = r8.f12143a0
            int r5 = r8.f12142Z
            int r4 = r4 - r5
            if (r4 <= 0) goto L_0x002e
            java.io.Writer r6 = r8.f12140X
            char[] r7 = r8.f12141Y
            r6.write(r7, r5, r4)
        L_0x002e:
            int r4 = r8.f12143a0
            int r4 = r4 + 1
            r8.f12143a0 = r4
            r8.m16582b(r2, r3)
            goto L_0x000c
        L_0x0038:
            int r2 = r8.f12143a0
            int r2 = r2 + 1
            r8.f12143a0 = r2
            if (r2 < r0) goto L_0x0010
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p159t.C3841i.m16583b(int, int):void");
    }

    /* renamed from: a */
    public void mo16600a(long j) throws IOException, JsonGenerationException {
        mo16806k("write number");
        if (this.f11861O) {
            m16584b(j);
            return;
        }
        if (this.f12143a0 + 21 >= this.f12144b0) {
            mo17002O();
        }
        this.f12143a0 = C3824i.m16315a(j, this.f12141Y, this.f12143a0);
    }

    /* renamed from: a */
    public void mo16615a(BigInteger bigInteger) throws IOException, JsonGenerationException {
        mo16806k("write number");
        if (bigInteger == null) {
            m16576Q();
        } else if (this.f11861O) {
            m16585c((Object) bigInteger);
        } else {
            mo16646g(bigInteger.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17006b(C3785a aVar, byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        int i3 = i2 - 3;
        int i4 = this.f12144b0 - 6;
        int a = aVar.mo16486a() >> 2;
        while (i <= i3) {
            if (this.f12143a0 > i4) {
                mo17002O();
            }
            int i5 = i + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            this.f12143a0 = aVar.mo16493a((int) (((bArr[i] << 8) | (bArr[i5] & 255)) << 8) | (bArr[i6] & 255), this.f12141Y, this.f12143a0);
            a--;
            if (a <= 0) {
                char[] cArr = this.f12141Y;
                int i8 = this.f12143a0;
                this.f12143a0 = i8 + 1;
                cArr[i8] = '\\';
                int i9 = this.f12143a0;
                this.f12143a0 = i9 + 1;
                cArr[i9] = 'n';
                a = aVar.mo16486a() >> 2;
            }
            i = i7;
        }
        int i10 = i2 - i;
        if (i10 > 0) {
            if (this.f12143a0 > i4) {
                mo17002O();
            }
            int i11 = i + 1;
            int i12 = bArr[i] << 16;
            if (i10 == 2) {
                i12 |= (bArr[i11] & 255) << 8;
            }
            this.f12143a0 = aVar.mo16491a(i12, i10, this.f12141Y, this.f12143a0);
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
            m16576Q();
        } else if (this.f11861O) {
            m16585c((Object) bigDecimal);
        } else {
            mo16646g(bigDecimal.toString());
        }
    }

    /* renamed from: a */
    public void mo16616a(boolean z) throws IOException, JsonGenerationException {
        int i;
        mo16806k("write boolean value");
        if (this.f12143a0 + 5 >= this.f12144b0) {
            mo17002O();
        }
        int i2 = this.f12143a0;
        char[] cArr = this.f12141Y;
        if (z) {
            cArr[i2] = 't';
            int i3 = i2 + 1;
            cArr[i3] = 'r';
            int i4 = i3 + 1;
            cArr[i4] = 'u';
            i = i4 + 1;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            int i5 = i2 + 1;
            cArr[i5] = 'a';
            int i6 = i5 + 1;
            cArr[i6] = 'l';
            int i7 = i6 + 1;
            cArr[i7] = 's';
            i = i7 + 1;
            cArr[i] = 'e';
        }
        this.f12143a0 = i + 1;
    }

    /* renamed from: b */
    private void m16582b(char c, int i) throws IOException, JsonGenerationException {
        String str;
        int i2;
        if (i >= 0) {
            int i3 = this.f12143a0;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this.f12142Z = i4;
                char[] cArr = this.f12141Y;
                int i5 = i4 + 1;
                cArr[i4] = '\\';
                cArr[i5] = (char) i;
                return;
            }
            char[] cArr2 = this.f12145c0;
            if (cArr2 == null) {
                cArr2 = m16575P();
            }
            this.f12142Z = this.f12143a0;
            cArr2[1] = (char) i;
            this.f12140X.write(cArr2, 0, 2);
        } else if (i != -2) {
            int i6 = this.f12143a0;
            if (i6 >= 6) {
                char[] cArr3 = this.f12141Y;
                int i7 = i6 - 6;
                this.f12142Z = i7;
                cArr3[i7] = '\\';
                int i8 = i7 + 1;
                cArr3[i8] = 'u';
                if (c > 255) {
                    int i9 = (c >> 8) & 255;
                    int i10 = i8 + 1;
                    char[] cArr4 = f12139f0;
                    cArr3[i10] = cArr4[i9 >> 4];
                    i2 = i10 + 1;
                    cArr3[i2] = cArr4[i9 & 15];
                    c = (char) (c & 255);
                } else {
                    int i11 = i8 + 1;
                    cArr3[i11] = '0';
                    i2 = i11 + 1;
                    cArr3[i2] = '0';
                }
                int i12 = i2 + 1;
                char[] cArr5 = f12139f0;
                cArr3[i12] = cArr5[c >> 4];
                cArr3[i12 + 1] = cArr5[c & 15];
                return;
            }
            char[] cArr6 = this.f12145c0;
            if (cArr6 == null) {
                cArr6 = m16575P();
            }
            this.f12142Z = this.f12143a0;
            if (c > 255) {
                int i13 = (c >> 8) & 255;
                char c2 = c & 255;
                char[] cArr7 = f12139f0;
                cArr6[10] = cArr7[i13 >> 4];
                cArr6[11] = cArr7[i13 & 15];
                cArr6[12] = cArr7[c2 >> 4];
                cArr6[13] = cArr7[c2 & 15];
                this.f12140X.write(cArr6, 8, 6);
            } else {
                char[] cArr8 = f12139f0;
                cArr6[6] = cArr8[c >> 4];
                cArr6[7] = cArr8[c & 15];
                this.f12140X.write(cArr6, 2, 6);
            }
        } else {
            C3802m mVar = this.f12146d0;
            if (mVar == null) {
                str = this.f12075U.mo16873a(c).getValue();
            } else {
                str = mVar.getValue();
                this.f12146d0 = null;
            }
            int length = str.length();
            int i14 = this.f12143a0;
            if (i14 >= length) {
                int i15 = i14 - length;
                this.f12142Z = i15;
                str.getChars(0, length, this.f12141Y, i15);
                return;
            }
            this.f12142Z = i14;
            this.f12140X.write(str);
        }
    }

    /* renamed from: a */
    private void m16580a(int i, int i2) throws IOException, JsonGenerationException {
        char c;
        int[] iArr = this.f12073S;
        int min = Math.min(iArr.length, i2 + 1);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i) {
            while (true) {
                c = this.f12141Y[i3];
                if (c >= min) {
                    if (c > i2) {
                        i5 = -1;
                        break;
                    }
                } else {
                    i5 = iArr[c];
                    if (i5 != 0) {
                        break;
                    }
                }
                i3++;
                if (i3 >= i) {
                    break;
                }
            }
            int i6 = i3 - i4;
            if (i6 > 0) {
                this.f12140X.write(this.f12141Y, i4, i6);
                if (i3 >= i) {
                    return;
                }
            }
            i3++;
            i4 = m16578a(this.f12141Y, i3, i, c, i5);
        }
    }

    /* renamed from: a */
    private void m16581a(char[] cArr, int i, int i2, int i3) throws IOException, JsonGenerationException {
        char c;
        int i4 = i2 + i;
        int[] iArr = this.f12073S;
        int min = Math.min(iArr.length, i3 + 1);
        int i5 = 0;
        while (i < i4) {
            int i6 = i5;
            int i7 = i;
            while (true) {
                c = cArr[i7];
                if (c >= min) {
                    if (c > i3) {
                        i6 = -1;
                        break;
                    }
                } else {
                    i6 = iArr[c];
                    if (i6 != 0) {
                        break;
                    }
                }
                i7++;
                if (i7 >= i4) {
                    break;
                }
            }
            int i8 = i7 - i;
            if (i8 < 32) {
                if (this.f12143a0 + i8 > this.f12144b0) {
                    mo17002O();
                }
                if (i8 > 0) {
                    System.arraycopy(cArr, i, this.f12141Y, this.f12143a0, i8);
                    this.f12143a0 += i8;
                }
            } else {
                mo17002O();
                this.f12140X.write(cArr, i, i8);
            }
            if (i7 < i4) {
                i = i7 + 1;
                m16579a(c, i6);
                i5 = i6;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo17004a(C3785a aVar, InputStream inputStream, byte[] bArr, int i) throws IOException, JsonGenerationException {
        int i2 = this.f12144b0 - 6;
        int a = aVar.mo16486a() >> 2;
        int i3 = -3;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i <= 2) {
                break;
            }
            if (i4 > i3) {
                int a2 = m16577a(inputStream, bArr, i4, i5, i);
                if (a2 < 3) {
                    i5 = a2;
                    i4 = 0;
                    break;
                }
                i5 = a2;
                i3 = a2 - 3;
                i4 = 0;
            }
            if (this.f12143a0 > i2) {
                mo17002O();
            }
            int i6 = i4 + 1;
            int i7 = bArr[i4] << 8;
            int i8 = i6 + 1;
            i4 = i8 + 1;
            i -= 3;
            this.f12143a0 = aVar.mo16493a((int) (((bArr[i6] & 255) | i7) << 8) | (bArr[i8] & 255), this.f12141Y, this.f12143a0);
            a--;
            if (a <= 0) {
                char[] cArr = this.f12141Y;
                int i9 = this.f12143a0;
                this.f12143a0 = i9 + 1;
                cArr[i9] = '\\';
                int i10 = this.f12143a0;
                this.f12143a0 = i10 + 1;
                cArr[i10] = 'n';
                a = aVar.mo16486a() >> 2;
            }
        }
        if (i <= 0) {
            return i;
        }
        int a3 = m16577a(inputStream, bArr, i4, i5, i);
        if (a3 <= 0) {
            return i;
        }
        if (this.f12143a0 > i2) {
            mo17002O();
        }
        int i11 = bArr[0] << 16;
        int i12 = 1;
        if (1 < a3) {
            i11 |= (bArr[1] & 255) << 8;
            i12 = 2;
        }
        this.f12143a0 = aVar.mo16491a(i11, i12, this.f12141Y, this.f12143a0);
        return i - i12;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo17003a(C3785a aVar, InputStream inputStream, byte[] bArr) throws IOException, JsonGenerationException {
        int a;
        int i = this.f12144b0 - 6;
        int i2 = -3;
        int a2 = aVar.mo16486a() >> 2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 > i2) {
                a = m16577a(inputStream, bArr, i4, i5, bArr.length);
                if (a < 3) {
                    break;
                }
                i5 = a;
                i2 = a - 3;
                i4 = 0;
            }
            if (this.f12143a0 > i) {
                mo17002O();
            }
            int i6 = i4 + 1;
            int i7 = bArr[i4] << 8;
            int i8 = i6 + 1;
            i4 = i8 + 1;
            i3 += 3;
            this.f12143a0 = aVar.mo16493a((int) (((bArr[i6] & 255) | i7) << 8) | (bArr[i8] & 255), this.f12141Y, this.f12143a0);
            a2--;
            if (a2 <= 0) {
                char[] cArr = this.f12141Y;
                int i9 = this.f12143a0;
                this.f12143a0 = i9 + 1;
                cArr[i9] = '\\';
                int i10 = this.f12143a0;
                this.f12143a0 = i10 + 1;
                cArr[i10] = 'n';
                a2 = aVar.mo16486a() >> 2;
            }
        }
        if (a <= 0) {
            return i3;
        }
        if (this.f12143a0 > i) {
            mo17002O();
        }
        int i11 = bArr[0] << 16;
        int i12 = 1;
        if (1 < a) {
            i11 |= (bArr[1] & 255) << 8;
            i12 = 2;
        }
        int i13 = i3 + i12;
        this.f12143a0 = aVar.mo16491a(i11, i12, this.f12141Y, this.f12143a0);
        return i13;
    }

    /* renamed from: a */
    private int m16577a(InputStream inputStream, byte[] bArr, int i, int i2, int i3) throws IOException {
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
    private int m16578a(char[] cArr, int i, int i2, char c, int i3) throws IOException, JsonGenerationException {
        String str;
        int i4;
        if (i3 >= 0) {
            if (i <= 1 || i >= i2) {
                char[] cArr2 = this.f12145c0;
                if (cArr2 == null) {
                    cArr2 = m16575P();
                }
                cArr2[1] = (char) i3;
                this.f12140X.write(cArr2, 0, 2);
            } else {
                i -= 2;
                cArr[i] = '\\';
                cArr[i + 1] = (char) i3;
            }
            return i;
        } else if (i3 != -2) {
            if (i <= 5 || i >= i2) {
                char[] cArr3 = this.f12145c0;
                if (cArr3 == null) {
                    cArr3 = m16575P();
                }
                this.f12142Z = this.f12143a0;
                if (c > 255) {
                    int i5 = (c >> 8) & 255;
                    char c2 = c & 255;
                    char[] cArr4 = f12139f0;
                    cArr3[10] = cArr4[i5 >> 4];
                    cArr3[11] = cArr4[i5 & 15];
                    cArr3[12] = cArr4[c2 >> 4];
                    cArr3[13] = cArr4[c2 & 15];
                    this.f12140X.write(cArr3, 8, 6);
                } else {
                    char[] cArr5 = f12139f0;
                    cArr3[6] = cArr5[c >> 4];
                    cArr3[7] = cArr5[c & 15];
                    this.f12140X.write(cArr3, 2, 6);
                }
            } else {
                int i6 = i - 6;
                int i7 = i6 + 1;
                cArr[i6] = '\\';
                int i8 = i7 + 1;
                cArr[i7] = 'u';
                if (c > 255) {
                    int i9 = (c >> 8) & 255;
                    int i10 = i8 + 1;
                    char[] cArr6 = f12139f0;
                    cArr[i8] = cArr6[i9 >> 4];
                    i4 = i10 + 1;
                    cArr[i10] = cArr6[i9 & 15];
                    c = (char) (c & 255);
                } else {
                    int i11 = i8 + 1;
                    cArr[i8] = '0';
                    i4 = i11 + 1;
                    cArr[i11] = '0';
                }
                int i12 = i4 + 1;
                char[] cArr7 = f12139f0;
                cArr[i4] = cArr7[c >> 4];
                cArr[i12] = cArr7[c & 15];
                i = i12 - 5;
            }
            return i;
        } else {
            C3802m mVar = this.f12146d0;
            if (mVar == null) {
                str = this.f12075U.mo16873a(c).getValue();
            } else {
                str = mVar.getValue();
                this.f12146d0 = null;
            }
            int length = str.length();
            if (i < length || i >= i2) {
                this.f12140X.write(str);
            } else {
                i -= length;
                str.getChars(0, length, cArr, i);
            }
            return i;
        }
    }

    /* renamed from: a */
    private void m16579a(char c, int i) throws IOException, JsonGenerationException {
        String str;
        int i2;
        if (i >= 0) {
            if (this.f12143a0 + 2 > this.f12144b0) {
                mo17002O();
            }
            char[] cArr = this.f12141Y;
            int i3 = this.f12143a0;
            this.f12143a0 = i3 + 1;
            cArr[i3] = '\\';
            int i4 = this.f12143a0;
            this.f12143a0 = i4 + 1;
            cArr[i4] = (char) i;
        } else if (i != -2) {
            if (this.f12143a0 + 2 > this.f12144b0) {
                mo17002O();
            }
            int i5 = this.f12143a0;
            char[] cArr2 = this.f12141Y;
            int i6 = i5 + 1;
            cArr2[i5] = '\\';
            int i7 = i6 + 1;
            cArr2[i6] = 'u';
            if (c > 255) {
                int i8 = 255 & (c >> 8);
                int i9 = i7 + 1;
                char[] cArr3 = f12139f0;
                cArr2[i7] = cArr3[i8 >> 4];
                i2 = i9 + 1;
                cArr2[i9] = cArr3[i8 & 15];
                c = (char) (c & 255);
            } else {
                int i10 = i7 + 1;
                cArr2[i7] = '0';
                i2 = i10 + 1;
                cArr2[i10] = '0';
            }
            int i11 = i2 + 1;
            char[] cArr4 = f12139f0;
            cArr2[i2] = cArr4[c >> 4];
            cArr2[i11] = cArr4[c & 15];
            this.f12143a0 = i11;
        } else {
            C3802m mVar = this.f12146d0;
            if (mVar == null) {
                str = this.f12075U.mo16873a(c).getValue();
            } else {
                str = mVar.getValue();
                this.f12146d0 = null;
            }
            int length = str.length();
            if (this.f12143a0 + length > this.f12144b0) {
                mo17002O();
                if (length > this.f12144b0) {
                    this.f12140X.write(str);
                    return;
                }
            }
            str.getChars(0, length, this.f12141Y, this.f12143a0);
            this.f12143a0 += length;
        }
    }
}
