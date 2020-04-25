package com.fasterxml.jackson.core.p158s;

import com.fasterxml.jackson.core.p162w.C3854a;
import com.fasterxml.jackson.core.p162w.C3857b;
import com.fasterxml.jackson.core.p162w.C3869j;
import java.lang.ref.SoftReference;
import org.jcodec.codecs.mjpeg.JpegConst;

/* renamed from: com.fasterxml.jackson.core.s.f */
/* compiled from: JsonStringEncoder */
public final class C3821f {

    /* renamed from: d */
    private static final char[] f12001d = C3817b.m16261b();

    /* renamed from: e */
    private static final byte[] f12002e = C3817b.m16260a();

    /* renamed from: f */
    private static final int f12003f = 55296;

    /* renamed from: g */
    private static final int f12004g = 56319;

    /* renamed from: h */
    private static final int f12005h = 56320;

    /* renamed from: i */
    private static final int f12006i = 57343;

    /* renamed from: j */
    private static final int f12007j = 92;

    /* renamed from: k */
    private static final int f12008k = 117;

    /* renamed from: l */
    private static final int f12009l = 48;

    /* renamed from: m */
    protected static final ThreadLocal<SoftReference<C3821f>> f12010m = new ThreadLocal<>();

    /* renamed from: a */
    protected C3869j f12011a;

    /* renamed from: b */
    protected C3857b f12012b;

    /* renamed from: c */
    protected final char[] f12013c = new char[6];

    public C3821f() {
        char[] cArr = this.f12013c;
        cArr[0] = '\\';
        cArr[2] = '0';
        cArr[3] = '0';
    }

    /* renamed from: a */
    public static C3821f m16294a() {
        C3821f fVar;
        SoftReference softReference = (SoftReference) f12010m.get();
        if (softReference == null) {
            fVar = null;
        } else {
            fVar = (C3821f) softReference.get();
        }
        if (fVar != null) {
            return fVar;
        }
        C3821f fVar2 = new C3821f();
        f12010m.set(new SoftReference(fVar2));
        return fVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r9 >= 0) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        r1 = m16296b(r1, r11.f12013c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r1 = m16293a(r9, r11.f12013c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        r9 = r7 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r9 <= r6.length) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        r9 = r6.length - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (r9 <= 0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        java.lang.System.arraycopy(r11.f12013c, 0, r6, r7, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        r6 = r0.mo17127h();
        r1 = r1 - r9;
        java.lang.System.arraycopy(r11.f12013c, r9, r6, 0, r1);
        r7 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        java.lang.System.arraycopy(r11.f12013c, 0, r6, r7, r1);
        r7 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        r8 = r1 + 1;
        r1 = r12.charAt(r1);
        r9 = r2[r1];
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public char[] mo16896b(java.lang.String r12) {
        /*
            r11 = this;
            com.fasterxml.jackson.core.w.j r0 = r11.f12011a
            if (r0 != 0) goto L_0x000c
            com.fasterxml.jackson.core.w.j r0 = new com.fasterxml.jackson.core.w.j
            r1 = 0
            r0.<init>(r1)
            r11.f12011a = r0
        L_0x000c:
            char[] r1 = r0.mo17124e()
            int[] r2 = com.fasterxml.jackson.core.p158s.C3817b.m16262c()
            int r3 = r2.length
            int r4 = r12.length()
            r5 = 0
            r6 = r1
            r1 = 0
            r7 = 0
        L_0x001d:
            if (r1 >= r4) goto L_0x0076
        L_0x001f:
            char r8 = r12.charAt(r1)
            if (r8 >= r3) goto L_0x0062
            r9 = r2[r8]
            if (r9 == 0) goto L_0x0062
            int r8 = r1 + 1
            char r1 = r12.charAt(r1)
            r9 = r2[r1]
            if (r9 >= 0) goto L_0x003a
            char[] r9 = r11.f12013c
            int r1 = r11.m16296b(r1, r9)
            goto L_0x0040
        L_0x003a:
            char[] r1 = r11.f12013c
            int r1 = r11.m16293a(r9, r1)
        L_0x0040:
            int r9 = r7 + r1
            int r10 = r6.length
            if (r9 <= r10) goto L_0x005a
            int r9 = r6.length
            int r9 = r9 - r7
            if (r9 <= 0) goto L_0x004e
            char[] r10 = r11.f12013c
            java.lang.System.arraycopy(r10, r5, r6, r7, r9)
        L_0x004e:
            char[] r6 = r0.mo17127h()
            int r1 = r1 - r9
            char[] r7 = r11.f12013c
            java.lang.System.arraycopy(r7, r9, r6, r5, r1)
            r7 = r1
            goto L_0x0060
        L_0x005a:
            char[] r10 = r11.f12013c
            java.lang.System.arraycopy(r10, r5, r6, r7, r1)
            r7 = r9
        L_0x0060:
            r1 = r8
            goto L_0x001d
        L_0x0062:
            int r9 = r6.length
            if (r7 < r9) goto L_0x006a
            char[] r6 = r0.mo17127h()
            r7 = 0
        L_0x006a:
            int r9 = r7 + 1
            r6[r7] = r8
            int r1 = r1 + 1
            if (r1 < r4) goto L_0x0074
            r7 = r9
            goto L_0x0076
        L_0x0074:
            r7 = r9
            goto L_0x001f
        L_0x0076:
            r0.mo17114a(r7)
            char[] r12 = r0.mo17118a()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p158s.C3821f.mo16896b(java.lang.String):char[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r5 < r4.length) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        r4 = r0.mo17084a();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        r7 = r2 + 1;
        r2 = r11.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (r2 > 127) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        r5 = m16292a(r2, r6[r2], r0, r5);
        r4 = r0.mo17086d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005f, code lost:
        if (r2 > 2047) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        r6 = r5 + 1;
        r4[r5] = (byte) ((r2 >> 6) | 192);
        r2 = (r2 & '?') | 128;
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r2 < f12003f) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
        if (r2 <= f12006i) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        if (r2 <= f12004g) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0081, code lost:
        m16295a((int) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0084, code lost:
        if (r7 < r1) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        m16295a((int) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0089, code lost:
        r6 = r7 + 1;
        r2 = m16291a((int) r2, (int) r11.charAt(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0096, code lost:
        if (r2 <= 1114111) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0098, code lost:
        m16295a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009b, code lost:
        r7 = r5 + 1;
        r4[r5] = (byte) ((r2 >> 18) | 240);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a5, code lost:
        if (r7 < r4.length) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a7, code lost:
        r4 = r0.mo17084a();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ac, code lost:
        r5 = r7 + 1;
        r4[r7] = (byte) (((r2 >> 12) & 63) | 128);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b8, code lost:
        if (r5 < r4.length) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ba, code lost:
        r4 = r0.mo17084a();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bf, code lost:
        r7 = r5 + 1;
        r4[r5] = (byte) (((r2 >> 6) & 63) | 128);
        r2 = (r2 & '?') | 128;
        r5 = r7;
        r7 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d1, code lost:
        r6 = r5 + 1;
        r4[r5] = (byte) ((r2 >> 12) | org.jcodec.codecs.mjpeg.JpegConst.APP0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00db, code lost:
        if (r6 < r4.length) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00dd, code lost:
        r4 = r0.mo17084a();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e2, code lost:
        r5 = r6 + 1;
        r4[r6] = (byte) (((r2 >> 6) & 63) | 128);
        r2 = (r2 & '?') | 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f2, code lost:
        if (r5 < r4.length) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f4, code lost:
        r4 = r0.mo17084a();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f9, code lost:
        r6 = r5 + 1;
        r4[r5] = (byte) r2;
        r5 = r6;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo16897c(java.lang.String r11) {
        /*
            r10 = this;
            com.fasterxml.jackson.core.w.b r0 = r10.f12012b
            if (r0 != 0) goto L_0x000c
            com.fasterxml.jackson.core.w.b r0 = new com.fasterxml.jackson.core.w.b
            r1 = 0
            r0.<init>(r1)
            r10.f12012b = r0
        L_0x000c:
            int r1 = r11.length()
            byte[] r2 = r0.mo17092g()
            r3 = 0
            r4 = r2
            r2 = 0
            r5 = 0
        L_0x0018:
            if (r2 >= r1) goto L_0x0101
            int[] r6 = com.fasterxml.jackson.core.p158s.C3817b.m16262c()
        L_0x001e:
            char r7 = r11.charAt(r2)
            r8 = 127(0x7f, float:1.78E-43)
            if (r7 > r8) goto L_0x0041
            r9 = r6[r7]
            if (r9 == 0) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            int r8 = r4.length
            if (r5 < r8) goto L_0x0033
            byte[] r4 = r0.mo17084a()
            r5 = 0
        L_0x0033:
            int r8 = r5 + 1
            byte r7 = (byte) r7
            r4[r5] = r7
            int r2 = r2 + 1
            if (r2 < r1) goto L_0x003f
            r5 = r8
            goto L_0x0101
        L_0x003f:
            r5 = r8
            goto L_0x001e
        L_0x0041:
            int r7 = r4.length
            if (r5 < r7) goto L_0x0049
            byte[] r4 = r0.mo17084a()
            r5 = 0
        L_0x0049:
            int r7 = r2 + 1
            char r2 = r11.charAt(r2)
            if (r2 > r8) goto L_0x005d
            r4 = r6[r2]
            int r5 = r10.m16292a(r2, r4, r0, r5)
            byte[] r4 = r0.mo17086d()
        L_0x005b:
            r2 = r7
            goto L_0x0018
        L_0x005d:
            r6 = 2047(0x7ff, float:2.868E-42)
            if (r2 > r6) goto L_0x0071
            int r6 = r5 + 1
            int r8 = r2 >> 6
            r8 = r8 | 192(0xc0, float:2.69E-43)
            byte r8 = (byte) r8
            r4[r5] = r8
            r2 = r2 & 63
            r2 = r2 | 128(0x80, float:1.794E-43)
            r5 = r6
            goto L_0x00f1
        L_0x0071:
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r6) goto L_0x00d1
            r6 = 57343(0xdfff, float:8.0355E-41)
            if (r2 <= r6) goto L_0x007c
            goto L_0x00d1
        L_0x007c:
            r6 = 56319(0xdbff, float:7.892E-41)
            if (r2 <= r6) goto L_0x0084
            r10.m16295a(r2)
        L_0x0084:
            if (r7 < r1) goto L_0x0089
            r10.m16295a(r2)
        L_0x0089:
            int r6 = r7 + 1
            char r7 = r11.charAt(r7)
            int r2 = r10.m16291a(r2, r7)
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r2 <= r7) goto L_0x009b
            r10.m16295a(r2)
        L_0x009b:
            int r7 = r5 + 1
            int r8 = r2 >> 18
            r8 = r8 | 240(0xf0, float:3.36E-43)
            byte r8 = (byte) r8
            r4[r5] = r8
            int r5 = r4.length
            if (r7 < r5) goto L_0x00ac
            byte[] r4 = r0.mo17084a()
            r7 = 0
        L_0x00ac:
            int r5 = r7 + 1
            int r8 = r2 >> 12
            r8 = r8 & 63
            r8 = r8 | 128(0x80, float:1.794E-43)
            byte r8 = (byte) r8
            r4[r7] = r8
            int r7 = r4.length
            if (r5 < r7) goto L_0x00bf
            byte[] r4 = r0.mo17084a()
            r5 = 0
        L_0x00bf:
            int r7 = r5 + 1
            int r8 = r2 >> 6
            r8 = r8 & 63
            r8 = r8 | 128(0x80, float:1.794E-43)
            byte r8 = (byte) r8
            r4[r5] = r8
            r2 = r2 & 63
            r2 = r2 | 128(0x80, float:1.794E-43)
            r5 = r7
            r7 = r6
            goto L_0x00f1
        L_0x00d1:
            int r6 = r5 + 1
            int r8 = r2 >> 12
            r8 = r8 | 224(0xe0, float:3.14E-43)
            byte r8 = (byte) r8
            r4[r5] = r8
            int r5 = r4.length
            if (r6 < r5) goto L_0x00e2
            byte[] r4 = r0.mo17084a()
            r6 = 0
        L_0x00e2:
            int r5 = r6 + 1
            int r8 = r2 >> 6
            r8 = r8 & 63
            r8 = r8 | 128(0x80, float:1.794E-43)
            byte r8 = (byte) r8
            r4[r6] = r8
            r2 = r2 & 63
            r2 = r2 | 128(0x80, float:1.794E-43)
        L_0x00f1:
            int r6 = r4.length
            if (r5 < r6) goto L_0x00f9
            byte[] r4 = r0.mo17084a()
            r5 = 0
        L_0x00f9:
            int r6 = r5 + 1
            byte r2 = (byte) r2
            r4[r5] = r2
            r5 = r6
            goto L_0x005b
        L_0x0101:
            com.fasterxml.jackson.core.w.b r11 = r10.f12012b
            byte[] r11 = r11.mo17093g(r5)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p158s.C3821f.mo16897c(java.lang.String):byte[]");
    }

    /* renamed from: a */
    public byte[] mo16895a(String str) {
        int i;
        C3857b bVar = this.f12012b;
        if (bVar == null) {
            bVar = new C3857b((C3854a) null);
            this.f12012b = bVar;
        }
        int length = str.length();
        byte[] g = bVar.mo17092g();
        int length2 = g.length;
        byte[] bArr = g;
        int i2 = 0;
        int i3 = 0;
        loop0:
        while (true) {
            if (i2 >= length) {
                break;
            }
            int i4 = i2 + 1;
            int charAt = str.charAt(i2);
            while (charAt <= 127) {
                if (i3 >= length2) {
                    byte[] a = bVar.mo17084a();
                    i3 = 0;
                    bArr = a;
                    length2 = a.length;
                }
                int i5 = i3 + 1;
                bArr[i3] = (byte) charAt;
                if (i4 >= length) {
                    i3 = i5;
                    break loop0;
                }
                int i6 = i4 + 1;
                int charAt2 = str.charAt(i4);
                i4 = i6;
                charAt = charAt2;
                i3 = i5;
            }
            if (i3 >= length2) {
                bArr = bVar.mo17084a();
                length2 = bArr.length;
                i3 = 0;
            }
            if (charAt < 2048) {
                int i7 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> 6) | 192);
                i = i7;
            } else if (charAt < f12003f || charAt > f12006i) {
                int i8 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> 12) | JpegConst.APP0);
                if (i8 >= length2) {
                    bArr = bVar.mo17084a();
                    length2 = bArr.length;
                    i8 = 0;
                }
                i = i8 + 1;
                bArr[i8] = (byte) (((charAt >> 6) & 63) | 128);
            } else {
                if (charAt > f12004g) {
                    m16295a(charAt);
                }
                if (i4 >= length) {
                    m16295a(charAt);
                }
                int i9 = i4 + 1;
                charAt = m16291a(charAt, (int) str.charAt(i4));
                if (charAt > 1114111) {
                    m16295a(charAt);
                }
                int i10 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> 18) | 240);
                if (i10 >= length2) {
                    bArr = bVar.mo17084a();
                    length2 = bArr.length;
                    i10 = 0;
                }
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((charAt >> 12) & 63) | 128);
                if (i11 >= length2) {
                    byte[] a2 = bVar.mo17084a();
                    i11 = 0;
                    bArr = a2;
                    length2 = a2.length;
                }
                int i12 = i11 + 1;
                bArr[i11] = (byte) (((charAt >> 6) & 63) | 128);
                i = i12;
                i4 = i9;
            }
            if (i >= length2) {
                byte[] a3 = bVar.mo17084a();
                i = 0;
                bArr = a3;
                length2 = a3.length;
            }
            int i13 = i + 1;
            bArr[i] = (byte) ((charAt & 63) | 128);
            i2 = i4;
            i3 = i13;
        }
        return this.f12012b.mo17093g(i3);
    }

    /* renamed from: b */
    private int m16296b(int i, char[] cArr) {
        cArr[1] = 'u';
        char[] cArr2 = f12001d;
        cArr[4] = cArr2[i >> 4];
        cArr[5] = cArr2[i & 15];
        return 6;
    }

    /* renamed from: a */
    private int m16293a(int i, char[] cArr) {
        cArr[1] = (char) i;
        return 2;
    }

    /* renamed from: a */
    private int m16292a(int i, int i2, C3857b bVar, int i3) {
        bVar.mo17094h(i3);
        bVar.mo17083a(92);
        if (i2 < 0) {
            bVar.mo17083a(117);
            if (i > 255) {
                int i4 = i >> 8;
                bVar.mo17083a(f12002e[i4 >> 4]);
                bVar.mo17083a(f12002e[i4 & 15]);
                i &= 255;
            } else {
                bVar.mo17083a(48);
                bVar.mo17083a(48);
            }
            bVar.mo17083a(f12002e[i >> 4]);
            bVar.mo17083a(f12002e[i & 15]);
        } else {
            bVar.mo17083a((byte) i2);
        }
        return bVar.mo17087e();
    }

    /* renamed from: a */
    private int m16291a(int i, int i2) {
        if (i2 >= f12005h && i2 <= f12006i) {
            return ((i - f12003f) << 10) + 65536 + (i2 - f12005h);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Broken surrogate pair: first char 0x");
        sb.append(Integer.toHexString(i));
        sb.append(", second 0x");
        sb.append(Integer.toHexString(i2));
        sb.append("; illegal combination");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private void m16295a(int i) {
        String str = "Illegal character point (0x";
        if (i > 1114111) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(Integer.toHexString(i));
            sb.append(") to output; max is 0x10FFFF as per RFC 4627");
            throw new IllegalArgumentException(sb.toString());
        } else if (i >= f12003f) {
            String str2 = ")";
            if (i <= f12004g) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unmatched first part of surrogate pair (0x");
                sb2.append(Integer.toHexString(i));
                sb2.append(str2);
                throw new IllegalArgumentException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unmatched second part of surrogate pair (0x");
            sb3.append(Integer.toHexString(i));
            sb3.append(str2);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(Integer.toHexString(i));
            sb4.append(") to output");
            throw new IllegalArgumentException(sb4.toString());
        }
    }
}
