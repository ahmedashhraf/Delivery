package p205i.p471b.p472a.p473a.p474c.p475i;

import com.google.common.base.C5785c;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: i.b.a.a.c.i.e */
/* compiled from: ClassReader */
public class C13944e {

    /* renamed from: f */
    static final boolean f40486f = true;

    /* renamed from: g */
    static final boolean f40487g = true;

    /* renamed from: h */
    static final boolean f40488h = true;

    /* renamed from: i */
    static final boolean f40489i = true;

    /* renamed from: j */
    static final boolean f40490j = true;

    /* renamed from: k */
    public static final int f40491k = 1;

    /* renamed from: l */
    public static final int f40492l = 2;

    /* renamed from: m */
    public static final int f40493m = 4;

    /* renamed from: n */
    public static final int f40494n = 8;

    /* renamed from: o */
    static final int f40495o = 256;

    /* renamed from: a */
    public final byte[] f40496a;

    /* renamed from: b */
    private final int[] f40497b;

    /* renamed from: c */
    private final String[] f40498c;

    /* renamed from: d */
    private final int f40499d;

    /* renamed from: e */
    public final int f40500e;

    public C13944e(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    private int m59935g() {
        int i = this.f40500e;
        int f = i + 8 + (mo44092f(i + 6) * 2);
        for (int f2 = mo44092f(f); f2 > 0; f2--) {
            for (int f3 = mo44092f(f + 8); f3 > 0; f3--) {
                f += mo44085c(f + 12) + 6;
            }
            f += 8;
        }
        int i2 = f + 2;
        for (int f4 = mo44092f(i2); f4 > 0; f4--) {
            for (int f5 = mo44092f(i2 + 8); f5 > 0; f5--) {
                i2 += mo44085c(i2 + 12) + 6;
            }
            i2 += 8;
        }
        return i2 + 2;
    }

    /* renamed from: a */
    public int mo44075a() {
        return mo44092f(this.f40500e);
    }

    /* renamed from: b */
    public String mo44084b() {
        return mo44078a(this.f40500e + 2, new char[this.f40499d]);
    }

    /* renamed from: c */
    public String[] mo44087c() {
        int i = this.f40500e + 6;
        int f = mo44092f(i);
        String[] strArr = new String[f];
        if (f > 0) {
            char[] cArr = new char[this.f40499d];
            for (int i2 = 0; i2 < f; i2++) {
                i += 2;
                strArr[i2] = mo44078a(i, cArr);
            }
        }
        return strArr;
    }

    /* renamed from: d */
    public int mo44088d() {
        return this.f40497b.length;
    }

    /* renamed from: e */
    public int mo44090e() {
        return this.f40499d;
    }

    /* renamed from: f */
    public String mo44093f() {
        return mo44078a(this.f40500e + 4, new char[this.f40499d]);
    }

    public C13944e(byte[] bArr, int i, int i2) {
        this.f40496a = bArr;
        if (mo44091e(i + 6) <= 52) {
            this.f40497b = new int[mo44092f(i + 8)];
            int length = this.f40497b.length;
            this.f40498c = new String[length];
            int i3 = 0;
            int i4 = i + 10;
            int i5 = 1;
            while (i5 < length) {
                int i6 = i4 + 1;
                this.f40497b[i5] = i6;
                byte b = bArr[i4];
                int i7 = 5;
                if (b == 1) {
                    i7 = mo44092f(i6) + 3;
                    if (i7 > i3) {
                        i3 = i7;
                    }
                } else if (b != 15) {
                    if (!(b == 18 || b == 3 || b == 4)) {
                        if (b != 5 && b != 6) {
                            switch (b) {
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                    break;
                                default:
                                    i7 = 3;
                                    break;
                            }
                        } else {
                            i7 = 9;
                            i5++;
                        }
                    }
                } else {
                    i7 = 4;
                }
                i4 += i7;
                i5++;
            }
            this.f40499d = i3;
            this.f40500e = i4;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c2, code lost:
        if (r1.f40758t3 == 0) goto L_0x01e1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01e6  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m59933b(p205i.p471b.p472a.p473a.p474c.p475i.C13945f r32, p205i.p471b.p472a.p473a.p474c.p475i.C13947h r33, int r34) {
        /*
            r31 = this;
            r8 = r31
            r9 = r33
            r0 = r34
            char[] r10 = r9.f40587c
            int r1 = r8.mo44092f(r0)
            r9.f40589e = r1
            int r1 = r0 + 2
            java.lang.String r1 = r8.mo44086c(r1, r10)
            r9.f40590f = r1
            int r1 = r0 + 4
            java.lang.String r1 = r8.mo44086c(r1, r10)
            r9.f40591g = r1
            int r11 = r0 + 6
            int r0 = r8.mo44092f(r11)
            r14 = r0
            r15 = r11
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r13 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
        L_0x0037:
            if (r14 <= 0) goto L_0x0185
            int r12 = r15 + 2
            java.lang.String r12 = r8.mo44086c(r12, r10)
            r21 = r0
            java.lang.String r0 = "Code"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0068
            int r0 = r9.f40586b
            r12 = 1
            r0 = r0 & r12
            if (r0 != 0) goto L_0x0057
            int r0 = r15 + 8
            r19 = r0
        L_0x0053:
            r0 = r21
            goto L_0x0178
        L_0x0057:
            r27 = r1
            r28 = r2
            r12 = r3
            r29 = r4
            r30 = r5
            r22 = r7
        L_0x0062:
            r26 = r21
            r21 = r6
            goto L_0x0169
        L_0x0068:
            java.lang.String r0 = "Exceptions"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0090
            int r0 = r15 + 8
            int r0 = r8.mo44092f(r0)
            java.lang.String[] r0 = new java.lang.String[r0]
            int r6 = r15 + 10
            r20 = r1
            r12 = r6
            r6 = 0
        L_0x007e:
            int r1 = r0.length
            if (r6 >= r1) goto L_0x008c
            java.lang.String r1 = r8.mo44078a(r12, r10)
            r0[r6] = r1
            int r12 = r12 + 2
            int r6 = r6 + 1
            goto L_0x007e
        L_0x008c:
            r6 = r0
            r17 = r12
            goto L_0x00a1
        L_0x0090:
            r20 = r1
            java.lang.String r0 = "Signature"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00a4
            int r0 = r15 + 8
            java.lang.String r0 = r8.mo44086c(r0, r10)
            r7 = r0
        L_0x00a1:
            r1 = r20
            goto L_0x0053
        L_0x00a4:
            java.lang.String r0 = "Deprecated"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00bf
            int r0 = r9.f40589e
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 | r1
            r9.f40589e = r0
        L_0x00b3:
            r28 = r2
            r12 = r3
            r29 = r4
            r30 = r5
            r22 = r7
            r27 = r20
            goto L_0x0062
        L_0x00bf:
            java.lang.String r0 = "RuntimeVisibleAnnotations"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00cb
            int r0 = r15 + 8
            r5 = r0
            goto L_0x00a1
        L_0x00cb:
            java.lang.String r0 = "RuntimeVisibleTypeAnnotations"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00d7
            int r0 = r15 + 8
            r2 = r0
            goto L_0x00a1
        L_0x00d7:
            java.lang.String r0 = "AnnotationDefault"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00e3
            int r0 = r15 + 8
            r3 = r0
            goto L_0x00a1
        L_0x00e3:
            java.lang.String r0 = "Synthetic"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00f4
            int r0 = r9.f40589e
            r1 = 266240(0x41000, float:3.73082E-40)
            r0 = r0 | r1
            r9.f40589e = r0
            goto L_0x00b3
        L_0x00f4:
            java.lang.String r0 = "RuntimeInvisibleAnnotations"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0100
            int r0 = r15 + 8
            r4 = r0
            goto L_0x00a1
        L_0x0100:
            java.lang.String r0 = "RuntimeInvisibleTypeAnnotations"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x010d
            int r0 = r15 + 8
            r1 = r0
            goto L_0x0053
        L_0x010d:
            java.lang.String r0 = "RuntimeVisibleParameterAnnotations"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x011b
            int r0 = r15 + 8
            r1 = r20
            goto L_0x0178
        L_0x011b:
            java.lang.String r0 = "RuntimeInvisibleParameterAnnotations"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0129
            int r0 = r15 + 8
            r18 = r0
            goto L_0x00a1
        L_0x0129:
            java.lang.String r0 = "MethodParameters"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0137
            int r0 = r15 + 8
            r16 = r0
            goto L_0x00a1
        L_0x0137:
            i.b.a.a.c.i.c[] r1 = r9.f40585a
            int r22 = r15 + 8
            int r0 = r15 + 4
            int r23 = r8.mo44085c(r0)
            r24 = -1
            r25 = 0
            r26 = r21
            r0 = r31
            r27 = r20
            r28 = r2
            r2 = r12
            r12 = r3
            r3 = r22
            r29 = r4
            r4 = r23
            r30 = r5
            r5 = r10
            r21 = r6
            r6 = r24
            r22 = r7
            r7 = r25
            i.b.a.a.c.i.c r0 = r0.m59926a(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x0169
            r0.f40483c = r13
            r13 = r0
        L_0x0169:
            r3 = r12
            r6 = r21
            r7 = r22
            r0 = r26
            r1 = r27
            r2 = r28
            r4 = r29
            r5 = r30
        L_0x0178:
            int r12 = r15 + 4
            int r12 = r8.mo44085c(r12)
            int r12 = r12 + 6
            int r15 = r15 + r12
            int r14 = r14 + -1
            goto L_0x0037
        L_0x0185:
            r26 = r0
            r27 = r1
            r28 = r2
            r12 = r3
            r29 = r4
            r30 = r5
            r21 = r6
            r22 = r7
            int r15 = r15 + 2
            int r1 = r9.f40589e
            java.lang.String r2 = r9.f40590f
            java.lang.String r3 = r9.f40591g
            r0 = r32
            r4 = r22
            r5 = r21
            i.b.a.a.c.i.r r0 = r0.mo44097a(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x01a9
            return r15
        L_0x01a9:
            boolean r1 = r0 instanceof p205i.p471b.p472a.p473a.p474c.p475i.C13958s
            if (r1 == 0) goto L_0x01ed
            r1 = r0
            i.b.a.a.c.i.s r1 = (p205i.p471b.p472a.p473a.p474c.p475i.C13958s) r1
            i.b.a.a.c.i.g r2 = r1.f40750l3
            i.b.a.a.c.i.e r2 = r2.f40561c
            if (r2 != r8) goto L_0x01ed
            java.lang.String r2 = r1.f40755q3
            r7 = r22
            if (r7 != r2) goto L_0x01ed
            r6 = r21
            if (r6 != 0) goto L_0x01c5
            int r2 = r1.f40758t3
            if (r2 != 0) goto L_0x01e3
            goto L_0x01e1
        L_0x01c5:
            int r2 = r6.length
            int r3 = r1.f40758t3
            if (r2 != r3) goto L_0x01e3
            int r2 = r6.length
            r3 = 1
            int r2 = r2 - r3
        L_0x01cd:
            if (r2 < 0) goto L_0x01e1
            int r3 = r17 + -2
            int[] r4 = r1.f40759u3
            r4 = r4[r2]
            int r5 = r8.mo44092f(r3)
            if (r4 == r5) goto L_0x01dc
            goto L_0x01e3
        L_0x01dc:
            int r2 = r2 + -1
            r17 = r3
            goto L_0x01cd
        L_0x01e1:
            r2 = 1
            goto L_0x01e4
        L_0x01e3:
            r2 = 0
        L_0x01e4:
            if (r2 == 0) goto L_0x01ed
            r1.f40756r3 = r11
            int r0 = r15 - r11
            r1.f40757s3 = r0
            return r15
        L_0x01ed:
            if (r16 == 0) goto L_0x020e
            byte[] r1 = r8.f40496a
            byte r1 = r1[r16]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 1
            int r16 = r16 + 1
            r2 = r16
        L_0x01fa:
            if (r1 <= 0) goto L_0x020e
            java.lang.String r3 = r8.mo44086c(r2, r10)
            int r4 = r2 + 2
            int r4 = r8.mo44092f(r4)
            r0.mo44193b(r3, r4)
            int r1 = r1 + -1
            int r2 = r2 + 4
            goto L_0x01fa
        L_0x020e:
            if (r12 == 0) goto L_0x021d
            i.b.a.a.c.i.a r1 = r0.mo44167a()
            r2 = 0
            r8.m59921a(r12, r10, r2, r1)
            if (r1 == 0) goto L_0x021d
            r1.mo44053a()
        L_0x021d:
            r5 = r30
            if (r5 == 0) goto L_0x023b
            int r1 = r8.mo44092f(r5)
            int r5 = r5 + 2
        L_0x0227:
            if (r1 <= 0) goto L_0x023b
            int r2 = r5 + 2
            java.lang.String r3 = r8.mo44086c(r5, r10)
            r4 = 1
            i.b.a.a.c.i.a r3 = r0.mo44171a(r3, r4)
            int r5 = r8.m59922a(r2, r10, r4, r3)
            int r1 = r1 + -1
            goto L_0x0227
        L_0x023b:
            r4 = r29
            if (r4 == 0) goto L_0x025b
            int r1 = r8.mo44092f(r4)
            int r4 = r4 + 2
        L_0x0245:
            if (r1 <= 0) goto L_0x025b
            int r2 = r4 + 2
            java.lang.String r3 = r8.mo44086c(r4, r10)
            r4 = 0
            i.b.a.a.c.i.a r3 = r0.mo44171a(r3, r4)
            r4 = 1
            int r2 = r8.m59922a(r2, r10, r4, r3)
            int r1 = r1 + -1
            r4 = r2
            goto L_0x0245
        L_0x025b:
            r2 = r28
            if (r2 == 0) goto L_0x0281
            int r1 = r8.mo44092f(r2)
            int r2 = r2 + 2
        L_0x0265:
            if (r1 <= 0) goto L_0x0281
            int r2 = r8.m59924a(r9, r2)
            int r3 = r2 + 2
            int r4 = r9.f40593i
            i.b.a.a.c.i.v r5 = r9.f40594j
            java.lang.String r2 = r8.mo44086c(r2, r10)
            r6 = 1
            i.b.a.a.c.i.a r2 = r0.mo44194c(r4, r5, r2, r6)
            int r2 = r8.m59922a(r3, r10, r6, r2)
            int r1 = r1 + -1
            goto L_0x0265
        L_0x0281:
            r1 = r27
            if (r1 == 0) goto L_0x02a8
            int r2 = r8.mo44092f(r1)
            int r1 = r1 + 2
        L_0x028b:
            if (r2 <= 0) goto L_0x02a8
            int r1 = r8.m59924a(r9, r1)
            int r3 = r1 + 2
            int r4 = r9.f40593i
            i.b.a.a.c.i.v r5 = r9.f40594j
            java.lang.String r1 = r8.mo44086c(r1, r10)
            r6 = 0
            i.b.a.a.c.i.a r1 = r0.mo44194c(r4, r5, r1, r6)
            r4 = 1
            int r1 = r8.m59922a(r3, r10, r4, r1)
            int r2 = r2 + -1
            goto L_0x028b
        L_0x02a8:
            r4 = 1
            r1 = r26
            if (r1 == 0) goto L_0x02b0
            r8.m59931a(r0, r9, r1, r4)
        L_0x02b0:
            r1 = r18
            if (r1 == 0) goto L_0x02b8
            r2 = 0
            r8.m59931a(r0, r9, r1, r2)
        L_0x02b8:
            if (r13 == 0) goto L_0x02c4
            i.b.a.a.c.i.c r1 = r13.f40483c
            r2 = 0
            r13.f40483c = r2
            r0.mo44179a(r13)
            r13 = r1
            goto L_0x02b8
        L_0x02c4:
            r13 = r19
            if (r13 == 0) goto L_0x02ce
            r0.mo44188b()
            r8.m59930a(r0, r9, r13)
        L_0x02ce:
            r0.mo44195c()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p205i.p471b.p472a.p473a.p474c.p475i.C13944e.m59933b(i.b.a.a.c.i.f, i.b.a.a.c.i.h, int):int");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44081a(C13946g gVar) {
        char[] cArr = new char[this.f40499d];
        int length = this.f40497b.length;
        C13955p[] pVarArr = new C13955p[length];
        int i = 1;
        while (i < length) {
            int i2 = this.f40497b[i];
            byte b = this.f40496a[i2 - 1];
            C13955p pVar = new C13955p(i);
            if (b == 1) {
                String[] strArr = this.f40498c;
                String str = strArr[i];
                if (str == null) {
                    int i3 = this.f40497b[i];
                    str = m59927a(i3 + 2, mo44092f(i3), cArr);
                    strArr[i] = str;
                }
                pVar.mo44154a(b, str, null, null);
            } else if (b == 15) {
                int i4 = this.f40497b[mo44092f(i2 + 1)];
                int i5 = this.f40497b[mo44092f(i4 + 2)];
                pVar.mo44154a(mo44082b(i2) + 20, mo44078a(i4, cArr), mo44086c(i5, cArr), mo44086c(i5 + 2, cArr));
            } else if (b == 18) {
                if (gVar.f40554H == null) {
                    m59928a(gVar, pVarArr, cArr);
                }
                int i6 = this.f40497b[mo44092f(i2 + 2)];
                pVar.mo44156a(mo44086c(i6, cArr), mo44086c(i6 + 2, cArr), mo44092f(i2));
            } else if (b == 3) {
                pVar.mo44152a(mo44085c(i2));
            } else if (b != 4) {
                if (b == 5) {
                    pVar.mo44155a(mo44089d(i2));
                } else if (b != 6) {
                    switch (b) {
                        case 9:
                        case 10:
                        case 11:
                            int i7 = this.f40497b[mo44092f(i2 + 2)];
                            pVar.mo44154a(b, mo44078a(i2, cArr), mo44086c(i7, cArr), mo44086c(i7 + 2, cArr));
                            break;
                        case 12:
                            pVar.mo44154a(b, mo44086c(i2, cArr), mo44086c(i2 + 2, cArr), null);
                            break;
                        default:
                            pVar.mo44154a(b, mo44086c(i2, cArr), null, null);
                            break;
                    }
                } else {
                    pVar.mo44150a(Double.longBitsToDouble(mo44089d(i2)));
                }
                i++;
            } else {
                pVar.mo44151a(Float.intBitsToFloat(mo44085c(i2)));
            }
            int length2 = pVar.f40674h % pVarArr.length;
            pVar.f40675i = pVarArr[length2];
            pVarArr[length2] = pVar;
            i++;
        }
        int i8 = this.f40497b[1] - 1;
        gVar.f40564f.mo44071a(this.f40496a, i8, this.f40500e - i8);
        gVar.f40565g = pVarArr;
        double d = (double) length;
        Double.isNaN(d);
        gVar.f40566h = (int) (d * 0.75d);
        gVar.f40563e = length;
    }

    /* renamed from: d */
    public long mo44089d(int i) {
        return (((long) mo44085c(i)) << 32) | (((long) mo44085c(i + 4)) & 4294967295L);
    }

    /* renamed from: e */
    public short mo44091e(int i) {
        byte[] bArr = this.f40496a;
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: f */
    public int mo44092f(int i) {
        byte[] bArr = this.f40496a;
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: c */
    public int mo44085c(int i) {
        byte[] bArr = this.f40496a;
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << C5785c.f16669B) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: c */
    public String mo44086c(int i, char[] cArr) {
        int f = mo44092f(i);
        if (i == 0 || f == 0) {
            return null;
        }
        String[] strArr = this.f40498c;
        String str = strArr[f];
        if (str != null) {
            return str;
        }
        int i2 = this.f40497b[f];
        String a = m59927a(i2 + 2, mo44092f(i2), cArr);
        strArr[f] = a;
        return a;
    }

    public C13944e(InputStream inputStream) throws IOException {
        this(m59932a(inputStream, false));
    }

    public C13944e(String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace('.', '/'));
        sb.append(".class");
        this(m59932a(ClassLoader.getSystemResourceAsStream(sb.toString()), true));
    }

    /* renamed from: a */
    private void m59928a(C13946g gVar, C13955p[] pVarArr, char[] cArr) {
        int i;
        boolean z;
        int g = m59935g();
        int f = mo44092f(g);
        while (true) {
            if (f <= 0) {
                z = false;
                break;
            }
            if ("BootstrapMethods".equals(mo44086c(g + 2, cArr))) {
                z = true;
                break;
            } else {
                g += mo44085c(g + 4) + 6;
                f--;
            }
        }
        if (z) {
            int f2 = mo44092f(g + 8);
            int i2 = g + 10;
            int i3 = i2;
            for (i = 0; i < f2; i++) {
                int i4 = (i3 - g) - 10;
                int hashCode = mo44083b(mo44092f(i3), cArr).hashCode();
                for (int f3 = mo44092f(i3 + 2); f3 > 0; f3--) {
                    hashCode ^= mo44083b(mo44092f(i3 + 4), cArr).hashCode();
                    i3 += 2;
                }
                i3 += 4;
                C13955p pVar = new C13955p(i);
                pVar.mo44153a(i4, hashCode & Integer.MAX_VALUE);
                int length = pVar.f40674h % pVarArr.length;
                pVar.f40675i = pVarArr[length];
                pVarArr[length] = pVar;
            }
            int c = mo44085c(g + 4);
            C13943d dVar = new C13943d(c + 62);
            dVar.mo44071a(this.f40496a, i2, c - 2);
            gVar.f40553G = f2;
            gVar.f40554H = dVar;
        }
    }

    /* renamed from: a */
    private static byte[] m59932a(InputStream inputStream, boolean z) throws IOException {
        if (inputStream != null) {
            try {
                byte[] bArr = new byte[inputStream.available()];
                int i = 0;
                while (true) {
                    int read = inputStream.read(bArr, i, bArr.length - i);
                    if (read == -1) {
                        if (i < bArr.length) {
                            byte[] bArr2 = new byte[i];
                            System.arraycopy(bArr, 0, bArr2, 0, i);
                            bArr = bArr2;
                        }
                        if (z) {
                            inputStream.close();
                        }
                        return bArr;
                    }
                    i += read;
                    if (i == bArr.length) {
                        int read2 = inputStream.read();
                        if (read2 < 0) {
                            return bArr;
                        }
                        byte[] bArr3 = new byte[(bArr.length + 1000)];
                        System.arraycopy(bArr, 0, bArr3, 0, i);
                        int i2 = i + 1;
                        bArr3[i] = (byte) read2;
                        i = i2;
                        bArr = bArr3;
                    }
                }
            } finally {
                if (z) {
                    inputStream.close();
                }
            }
        } else {
            throw new IOException("Class not found");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] m59934b(p205i.p471b.p472a.p473a.p474c.p475i.C13957r r11, p205i.p471b.p472a.p473a.p474c.p475i.C13947h r12, int r13, boolean r14) {
        /*
            r10 = this;
            char[] r0 = r12.f40587c
            int r1 = r10.mo44092f(r13)
            int[] r1 = new int[r1]
            int r13 = r13 + 2
            r2 = 0
        L_0x000b:
            int r3 = r1.length
            if (r2 >= r3) goto L_0x008a
            r1[r2] = r13
            int r3 = r10.mo44085c(r13)
            int r4 = r3 >>> 24
            r5 = 1
            if (r4 == 0) goto L_0x0056
            if (r4 == r5) goto L_0x0056
            r6 = 64
            if (r4 == r6) goto L_0x0032
            r6 = 65
            if (r4 == r6) goto L_0x0032
            switch(r4) {
                case 19: goto L_0x002f;
                case 20: goto L_0x002f;
                case 21: goto L_0x002f;
                case 22: goto L_0x0056;
                default: goto L_0x0026;
            }
        L_0x0026:
            switch(r4) {
                case 71: goto L_0x002c;
                case 72: goto L_0x002c;
                case 73: goto L_0x002c;
                case 74: goto L_0x002c;
                case 75: goto L_0x002c;
                default: goto L_0x0029;
            }
        L_0x0029:
            int r13 = r13 + 3
            goto L_0x0058
        L_0x002c:
            int r13 = r13 + 4
            goto L_0x0058
        L_0x002f:
            int r13 = r13 + 1
            goto L_0x0058
        L_0x0032:
            int r6 = r13 + 1
            int r6 = r10.mo44092f(r6)
        L_0x0038:
            if (r6 <= 0) goto L_0x0029
            int r7 = r13 + 3
            int r7 = r10.mo44092f(r7)
            int r8 = r13 + 5
            int r8 = r10.mo44092f(r8)
            i.b.a.a.c.i.q[] r9 = r12.f40592h
            r10.mo44077a(r7, r9)
            int r7 = r7 + r8
            i.b.a.a.c.i.q[] r8 = r12.f40592h
            r10.mo44077a(r7, r8)
            int r13 = r13 + 6
            int r6 = r6 + -1
            goto L_0x0038
        L_0x0056:
            int r13 = r13 + 2
        L_0x0058:
            int r6 = r10.mo44082b(r13)
            r7 = 66
            r8 = 0
            if (r4 != r7) goto L_0x007e
            if (r6 != 0) goto L_0x0064
            goto L_0x006b
        L_0x0064:
            i.b.a.a.c.i.v r8 = new i.b.a.a.c.i.v
            byte[] r4 = r10.f40496a
            r8.<init>(r4, r13)
        L_0x006b:
            int r6 = r6 * 2
            int r6 = r6 + r5
            int r13 = r13 + r6
            int r4 = r13 + 2
            java.lang.String r13 = r10.mo44086c(r13, r0)
            i.b.a.a.c.i.a r13 = r11.mo44187b(r3, r8, r13, r14)
            int r13 = r10.m59922a(r4, r0, r5, r13)
            goto L_0x0087
        L_0x007e:
            int r13 = r13 + 3
            int r6 = r6 * 2
            int r13 = r13 + r6
            int r13 = r10.m59922a(r13, r0, r5, r8)
        L_0x0087:
            int r2 = r2 + 1
            goto L_0x000b
        L_0x008a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p205i.p471b.p472a.p473a.p474c.p475i.C13944e.m59934b(i.b.a.a.c.i.r, i.b.a.a.c.i.h, int, boolean):int[]");
    }

    /* renamed from: a */
    public void mo44079a(C13945f fVar, int i) {
        mo44080a(fVar, new C13942c[0], i);
    }

    /* renamed from: a */
    public void mo44080a(C13945f fVar, C13942c[] cVarArr, int i) {
        C13947h hVar;
        String[] strArr;
        char[] cArr;
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        C13942c cVar;
        int i3;
        C13945f fVar2 = fVar;
        int i4 = i;
        int i5 = this.f40500e;
        char[] cArr2 = new char[this.f40499d];
        C13947h hVar2 = new C13947h();
        hVar2.f40585a = cVarArr;
        hVar2.f40586b = i4;
        hVar2.f40587c = cArr2;
        int f = mo44092f(i5);
        String a = mo44078a(i5 + 2, cArr2);
        String a2 = mo44078a(i5 + 4, cArr2);
        String[] strArr2 = new String[mo44092f(i5 + 6)];
        int i6 = i5 + 8;
        for (int i7 = 0; i7 < strArr2.length; i7++) {
            strArr2[i7] = mo44078a(i6, cArr2);
            i6 += 2;
        }
        int g = m59935g();
        int i8 = g;
        int i9 = f;
        int f2 = mo44092f(g);
        String[] strArr3 = strArr2;
        String str5 = null;
        int i10 = 0;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        C13942c cVar2 = null;
        while (f2 > 0) {
            String c = mo44086c(i8 + 2, cArr2);
            if ("SourceFile".equals(c)) {
                str8 = mo44086c(i8 + 8, cArr2);
            } else if ("InnerClasses".equals(c)) {
                i14 = i8 + 8;
            } else if ("EnclosingMethod".equals(c)) {
                str5 = mo44078a(i8 + 8, cArr2);
                int f3 = mo44092f(i8 + 10);
                if (f3 != 0) {
                    str10 = mo44086c(this.f40497b[f3], cArr2);
                    str6 = mo44086c(this.f40497b[f3] + 2, cArr2);
                }
            } else if ("Signature".equals(c)) {
                str9 = mo44086c(i8 + 8, cArr2);
            } else if ("RuntimeVisibleAnnotations".equals(c)) {
                i10 = i8 + 8;
            } else if ("RuntimeVisibleTypeAnnotations".equals(c)) {
                i12 = i8 + 8;
            } else {
                if ("Deprecated".equals(c)) {
                    i3 = 131072;
                } else if ("Synthetic".equals(c)) {
                    i3 = 266240;
                } else if ("SourceDebugExtension".equals(c)) {
                    int c2 = mo44085c(i8 + 4);
                    str7 = m59927a(i8 + 8, c2, new char[c2]);
                } else if ("RuntimeInvisibleAnnotations".equals(c)) {
                    i11 = i8 + 8;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(c)) {
                    i13 = i8 + 8;
                } else {
                    if ("BootstrapMethods".equals(c)) {
                        int[] iArr = new int[mo44092f(i8 + 8)];
                        int i15 = i8 + 10;
                        for (int i16 = 0; i16 < iArr.length; i16++) {
                            iArr[i16] = i15;
                            i15 += (mo44092f(i15 + 2) + 2) << 1;
                        }
                        hVar2.f40588d = iArr;
                        str2 = str5;
                        i2 = i10;
                        cArr = cArr2;
                        hVar = hVar2;
                        cVar = cVar2;
                        strArr = strArr3;
                        str = str6;
                        str3 = str7;
                        str4 = str8;
                    } else {
                        str2 = str5;
                        hVar = hVar2;
                        i2 = i10;
                        String str11 = str6;
                        String str12 = c;
                        String str13 = str7;
                        int i17 = i8 + 8;
                        String str14 = str8;
                        String str15 = str13;
                        char[] cArr3 = cArr2;
                        cArr = cArr2;
                        str4 = str14;
                        strArr = strArr3;
                        str = str11;
                        str3 = str15;
                        C13942c a3 = m59926a(cVarArr, str12, i17, mo44085c(i8 + 4), cArr3, -1, null);
                        cVar = cVar2;
                        if (a3 != null) {
                            a3.f40483c = cVar;
                            cVar2 = a3;
                            str8 = str4;
                            str7 = str3;
                            str5 = str2;
                            str6 = str;
                            i10 = i2;
                            i8 += mo44085c(i8 + 4) + 6;
                            f2--;
                            C13942c[] cVarArr2 = cVarArr;
                            cArr2 = cArr;
                            strArr3 = strArr;
                            hVar2 = hVar;
                        }
                    }
                    cVar2 = cVar;
                    str8 = str4;
                    str7 = str3;
                    str5 = str2;
                    str6 = str;
                    i10 = i2;
                    i8 += mo44085c(i8 + 4) + 6;
                    f2--;
                    C13942c[] cVarArr22 = cVarArr;
                    cArr2 = cArr;
                    strArr3 = strArr;
                    hVar2 = hVar;
                }
                i9 |= i3;
            }
            cArr = cArr2;
            hVar = hVar2;
            strArr = strArr3;
            i8 += mo44085c(i8 + 4) + 6;
            f2--;
            C13942c[] cVarArr222 = cVarArr;
            cArr2 = cArr;
            strArr3 = strArr;
            hVar2 = hVar;
        }
        String str16 = str5;
        int i18 = i10;
        char[] cArr4 = cArr2;
        C13947h hVar3 = hVar2;
        C13942c cVar3 = cVar2;
        String[] strArr4 = strArr3;
        String str17 = str6;
        String str18 = str7;
        String str19 = str8;
        fVar.mo44098a(mo44085c(this.f40497b[1] - 7), i9, a, str9, a2, strArr4);
        if ((i4 & 2) == 0 && !(str19 == null && str18 == null)) {
            fVar2.mo44100a(str19, str18);
        }
        if (str16 != null) {
            fVar2.mo44101a(str16, str10, str17);
        }
        if (i18 != 0) {
            int i19 = i18;
            int i20 = i19 + 2;
            for (int f4 = mo44092f(i19); f4 > 0; f4--) {
                char[] cArr5 = cArr4;
                i20 = m59922a(i20 + 2, cArr5, true, fVar2.mo44095a(mo44086c(i20, cArr5), true));
            }
        }
        char[] cArr6 = cArr4;
        int i21 = i11;
        if (i21 != 0) {
            int i22 = i21 + 2;
            for (int f5 = mo44092f(i21); f5 > 0; f5--) {
                i22 = m59922a(i22 + 2, cArr6, true, fVar2.mo44095a(mo44086c(i22, cArr6), false));
            }
        }
        int i23 = i12;
        if (i23 != 0) {
            int i24 = i23 + 2;
            for (int f6 = mo44092f(i23); f6 > 0; f6--) {
                C13947h hVar4 = hVar3;
                int a4 = m59924a(hVar4, i24);
                i24 = m59922a(a4 + 2, cArr6, true, fVar2.mo44094a(hVar4.f40593i, hVar4.f40594j, mo44086c(a4, cArr6), true));
            }
        }
        C13947h hVar5 = hVar3;
        int i25 = i13;
        if (i25 != 0) {
            int i26 = i25 + 2;
            for (int f7 = mo44092f(i25); f7 > 0; f7--) {
                int a5 = m59924a(hVar5, i26);
                i26 = m59922a(a5 + 2, cArr6, true, fVar2.mo44094a(hVar5.f40593i, hVar5.f40594j, mo44086c(a5, cArr6), false));
            }
        }
        while (cVar3 != null) {
            C13942c cVar4 = cVar3.f40483c;
            cVar3.f40483c = null;
            fVar2.mo44099a(cVar3);
            cVar3 = cVar4;
        }
        int i27 = i14;
        if (i27 != 0) {
            int i28 = i27 + 2;
            int i29 = i28;
            for (int f8 = mo44092f(i27); f8 > 0; f8--) {
                fVar2.mo44102a(mo44078a(i29, cArr6), mo44078a(i29 + 2, cArr6), mo44086c(i29 + 4, cArr6), mo44092f(i29 + 6));
                i29 += 8;
            }
        }
        int length = this.f40500e + 10 + (strArr4.length * 2);
        for (int f9 = mo44092f(length - 2); f9 > 0; f9--) {
            length = m59923a(fVar2, hVar5, length);
        }
        int i30 = length + 2;
        for (int f10 = mo44092f(i30 - 2); f10 > 0; f10--) {
            i30 = m59933b(fVar2, hVar5, i30);
        }
        fVar.mo44103b();
    }

    /* renamed from: b */
    public int mo44082b(int i) {
        return this.f40496a[i] & 255;
    }

    /* renamed from: b */
    public Object mo44083b(int i, char[] cArr) {
        int i2 = this.f40497b[i];
        byte b = this.f40496a[i2 - 1];
        if (b == 16) {
            return C13960u.m60146c(mo44086c(i2, cArr));
        }
        switch (b) {
            case 3:
                return Integer.valueOf(mo44085c(i2));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(mo44085c(i2)));
            case 5:
                return Long.valueOf(mo44089d(i2));
            case 6:
                return Double.valueOf(Double.longBitsToDouble(mo44089d(i2)));
            case 7:
                return C13960u.m60148d(mo44086c(i2, cArr));
            case 8:
                return mo44086c(i2, cArr);
            default:
                int b2 = mo44082b(i2);
                int[] iArr = this.f40497b;
                int i3 = iArr[mo44092f(i2 + 1)];
                boolean z = this.f40496a[i3 + -1] == 11;
                String a = mo44078a(i3, cArr);
                int i4 = iArr[mo44092f(i3 + 2)];
                C13953n nVar = new C13953n(b2, a, mo44086c(i4, cArr), mo44086c(i4 + 2, cArr), z);
                return nVar;
        }
    }

    /* renamed from: a */
    private int m59923a(C13945f fVar, C13947h hVar, int i) {
        int i2;
        C13947h hVar2 = hVar;
        int i3 = i;
        char[] cArr = hVar2.f40587c;
        int f = mo44092f(i3);
        String c = mo44086c(i3 + 2, cArr);
        String c2 = mo44086c(i3 + 4, cArr);
        int i4 = i3 + 6;
        int i5 = i4;
        int i6 = f;
        int f2 = mo44092f(i4);
        C13942c cVar = null;
        String str = null;
        Object obj = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (f2 > 0) {
            String c3 = mo44086c(i5 + 2, cArr);
            if ("ConstantValue".equals(c3)) {
                int f3 = mo44092f(i5 + 8);
                if (f3 == 0) {
                    obj = null;
                } else {
                    obj = mo44083b(f3, cArr);
                }
            } else if ("Signature".equals(c3)) {
                str = mo44086c(i5 + 8, cArr);
            } else {
                if ("Deprecated".equals(c3)) {
                    i2 = 131072;
                } else if ("Synthetic".equals(c3)) {
                    i2 = 266240;
                } else if ("RuntimeVisibleAnnotations".equals(c3)) {
                    i10 = i5 + 8;
                } else if ("RuntimeVisibleTypeAnnotations".equals(c3)) {
                    i8 = i5 + 8;
                } else if ("RuntimeInvisibleAnnotations".equals(c3)) {
                    i9 = i5 + 8;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(c3)) {
                    i7 = i5 + 8;
                } else {
                    C13942c cVar2 = cVar;
                    int i11 = i7;
                    int i12 = i8;
                    int i13 = i9;
                    int i14 = i10;
                    C13942c a = m59926a(hVar2.f40585a, c3, i5 + 8, mo44085c(i5 + 4), cArr, -1, null);
                    C13942c cVar3 = cVar2;
                    if (a != null) {
                        a.f40483c = cVar3;
                        i9 = i13;
                        cVar = a;
                    } else {
                        i9 = i13;
                        cVar = cVar3;
                    }
                    i10 = i14;
                    i7 = i11;
                    i8 = i12;
                }
                i6 |= i2;
            }
            i5 += mo44085c(i5 + 4) + 6;
            f2--;
            hVar2 = hVar;
        }
        C13942c cVar4 = cVar;
        int i15 = i7;
        int i16 = i8;
        int i17 = i9;
        int i18 = i10;
        int i19 = i5 + 2;
        C13950k a2 = fVar.mo44096a(i6, c, c2, str, obj);
        if (a2 == null) {
            return i19;
        }
        if (i18 != 0) {
            int i20 = i18 + 2;
            for (int f4 = mo44092f(i18); f4 > 0; f4--) {
                i20 = m59922a(i20 + 2, cArr, true, a2.mo44133a(mo44086c(i20, cArr), true));
            }
        }
        if (i17 != 0) {
            int i21 = i17;
            int i22 = i21 + 2;
            for (int f5 = mo44092f(i21); f5 > 0; f5--) {
                i22 = m59922a(i22 + 2, cArr, true, a2.mo44133a(mo44086c(i22, cArr), false));
            }
        }
        int i23 = i16;
        if (i23 != 0) {
            int i24 = i23 + 2;
            for (int f6 = mo44092f(i23); f6 > 0; f6--) {
                C13947h hVar3 = hVar;
                int a3 = m59924a(hVar3, i24);
                i24 = m59922a(a3 + 2, cArr, true, a2.mo44132a(hVar3.f40593i, hVar3.f40594j, mo44086c(a3, cArr), true));
            }
        }
        C13947h hVar4 = hVar;
        int i25 = i15;
        if (i25 != 0) {
            int i26 = i25 + 2;
            for (int f7 = mo44092f(i25); f7 > 0; f7--) {
                int a4 = m59924a(hVar4, i26);
                i26 = m59922a(a4 + 2, cArr, true, a2.mo44132a(hVar4.f40593i, hVar4.f40594j, mo44086c(a4, cArr), false));
            }
        }
        while (cVar4 != null) {
            C13942c cVar5 = cVar4.f40483c;
            cVar4.f40483c = null;
            a2.mo44135a(cVar4);
            cVar4 = cVar5;
        }
        a2.mo44134a();
        return i19;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04e0, code lost:
        r0 = r17;
        r1 = r28;
        r13 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0576, code lost:
        r38 = r9;
        r9 = r14;
        r0 = r17;
        r1 = r28;
        r13 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c8, code lost:
        r0 = r0 + 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0615, code lost:
        r38 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0617, code lost:
        r9 = r14;
        r0 = r17;
        r1 = r28;
        r13 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x061e, code lost:
        r14 = r44;
        r41 = r30;
        r30 = r11;
        r11 = r41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00cc, code lost:
        r0 = r0 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0683, code lost:
        r0 = r26 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0685, code lost:
        r38 = r9;
        r30 = r11;
        r9 = r14;
        r1 = r28;
        r13 = r36;
        r14 = r44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0692, code lost:
        r11 = r5;
        r5 = r0;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x07e5, code lost:
        r5 = r26 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0801, code lost:
        r5 = r26 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0819, code lost:
        r5 = r26 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x081d, code lost:
        if (r13 == null) goto L_0x085a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0820, code lost:
        if (r0 >= r13.length) goto L_0x085a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0822, code lost:
        if (r1 > r9) goto L_0x085a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0824, code lost:
        if (r1 != r9) goto L_0x083e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0826, code lost:
        r1 = m59924a(r14, r13[r0]);
        m59922a(r1 + 2, r11, true, r6.mo44168a(r14.f40593i, r14.f40594j, mo44086c(r1, r11), true));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x083e, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0841, code lost:
        if (r0 >= r13.length) goto L_0x0858;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x084b, code lost:
        if (mo44082b(r13[r0]) >= 67) goto L_0x084e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x084e, code lost:
        r1 = mo44092f(r13[r0] + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0858, code lost:
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x085a, code lost:
        r2 = r20;
        r3 = r29;
        r12 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0860, code lost:
        if (r12 == null) goto L_0x08b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0863, code lost:
        if (r2 >= r12.length) goto L_0x08b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0865, code lost:
        if (r3 > r9) goto L_0x08b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0867, code lost:
        if (r3 != r9) goto L_0x0889;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0869, code lost:
        r3 = m59924a(r14, r12[r2]);
        r17 = r0;
        r20 = r1;
        r45 = r10;
        m59922a(r3 + 2, r11, true, r6.mo44168a(r14.f40593i, r14.f40594j, mo44086c(r3, r11), false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0889, code lost:
        r17 = r0;
        r20 = r1;
        r45 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0890, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0893, code lost:
        if (r2 >= r12.length) goto L_0x08aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x089d, code lost:
        if (mo44082b(r12[r2]) >= 67) goto L_0x08a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x08a0, code lost:
        r3 = mo44092f(r12[r2] + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x08ac, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x08ad, code lost:
        r10 = r45;
        r0 = r17;
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x08b4, code lost:
        r17 = r0;
        r10 = r10;
        r29 = r3;
        r37 = r12;
        r36 = r13;
        r28 = r1;
        r3 = r30;
        r12 = r32;
        r9 = r33;
        r13 = r34;
        r26 = r35;
        r21 = r38;
        r20 = r2;
        r30 = r11;
        r11 = r31;
     */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x04be  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x054b  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0583  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x05c6  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0601  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x062a  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x063f  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0656  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x066f  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0698  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0704  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0765  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0781  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x07b0  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x07cb  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x07e9  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0805  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m59930a(p205i.p471b.p472a.p473a.p474c.p475i.C13957r r43, p205i.p471b.p472a.p473a.p474c.p475i.C13947h r44, int r45) {
        /*
            r42 = this;
            r7 = r42
            r15 = r43
            r14 = r44
            r0 = r45
            byte[] r8 = r7.f40496a
            char[] r13 = r14.f40587c
            int r12 = r7.mo44092f(r0)
            int r1 = r0 + 2
            int r11 = r7.mo44092f(r1)
            int r1 = r0 + 4
            int r9 = r7.mo44085c(r1)
            r10 = 8
            int r16 = r0 + 8
            int r6 = r16 + r9
            int r0 = r9 + 2
            i.b.a.a.c.i.q[] r5 = new p205i.p471b.p472a.p473a.p474c.p475i.C13956q[r0]
            r14.f40592h = r5
            int r0 = r9 + 1
            r7.mo44077a(r0, r5)
            r0 = r16
        L_0x002f:
            r4 = 132(0x84, float:1.85E-43)
            r3 = 1
            if (r0 >= r6) goto L_0x00d8
            int r1 = r0 - r16
            byte r2 = r8[r0]
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte[] r17 = p205i.p471b.p472a.p473a.p474c.p475i.C13946g.f40533m0
            byte r2 = r17[r2]
            switch(r2) {
                case 0: goto L_0x00d4;
                case 1: goto L_0x00d0;
                case 2: goto L_0x00cc;
                case 3: goto L_0x00d0;
                case 4: goto L_0x00d4;
                case 5: goto L_0x00cc;
                case 6: goto L_0x00cc;
                case 7: goto L_0x00c8;
                case 8: goto L_0x00c8;
                case 9: goto L_0x00bd;
                case 10: goto L_0x00b2;
                case 11: goto L_0x00d0;
                case 12: goto L_0x00cc;
                case 13: goto L_0x00cc;
                case 14: goto L_0x0082;
                case 15: goto L_0x005b;
                case 16: goto L_0x0041;
                case 17: goto L_0x0050;
                case 18: goto L_0x0044;
                default: goto L_0x0041;
            }
        L_0x0041:
            int r0 = r0 + 4
            goto L_0x002f
        L_0x0044:
            int r2 = r0 + 1
            int r2 = r7.mo44092f(r2)
            int r1 = r1 + r2
            r7.mo44077a(r1, r5)
            goto L_0x00cc
        L_0x0050:
            int r1 = r0 + 1
            byte r1 = r8[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            if (r1 != r4) goto L_0x0041
            int r0 = r0 + 6
            goto L_0x002f
        L_0x005b:
            int r0 = r0 + 4
            r2 = r1 & 3
            int r0 = r0 - r2
            int r2 = r7.mo44085c(r0)
            int r2 = r2 + r1
            r7.mo44077a(r2, r5)
            int r2 = r0 + 4
            int r2 = r7.mo44085c(r2)
        L_0x006e:
            if (r2 <= 0) goto L_0x007f
            int r3 = r0 + 12
            int r3 = r7.mo44085c(r3)
            int r3 = r3 + r1
            r7.mo44077a(r3, r5)
            int r0 = r0 + 8
            int r2 = r2 + -1
            goto L_0x006e
        L_0x007f:
            int r0 = r0 + 8
            goto L_0x002f
        L_0x0082:
            int r0 = r0 + 4
            r2 = r1 & 3
            int r0 = r0 - r2
            int r2 = r7.mo44085c(r0)
            int r2 = r2 + r1
            r7.mo44077a(r2, r5)
            int r2 = r0 + 8
            int r2 = r7.mo44085c(r2)
            int r4 = r0 + 4
            int r4 = r7.mo44085c(r4)
            int r2 = r2 - r4
            int r2 = r2 + r3
        L_0x009d:
            if (r2 <= 0) goto L_0x00ae
            int r3 = r0 + 12
            int r3 = r7.mo44085c(r3)
            int r3 = r3 + r1
            r7.mo44077a(r3, r5)
            int r0 = r0 + 4
            int r2 = r2 + -1
            goto L_0x009d
        L_0x00ae:
            int r0 = r0 + 12
            goto L_0x002f
        L_0x00b2:
            int r2 = r0 + 1
            int r2 = r7.mo44085c(r2)
            int r1 = r1 + r2
            r7.mo44077a(r1, r5)
            goto L_0x00c8
        L_0x00bd:
            int r2 = r0 + 1
            short r2 = r7.mo44091e(r2)
            int r1 = r1 + r2
            r7.mo44077a(r1, r5)
            goto L_0x00cc
        L_0x00c8:
            int r0 = r0 + 5
            goto L_0x002f
        L_0x00cc:
            int r0 = r0 + 3
            goto L_0x002f
        L_0x00d0:
            int r0 = r0 + 2
            goto L_0x002f
        L_0x00d4:
            int r0 = r0 + 1
            goto L_0x002f
        L_0x00d8:
            int r1 = r7.mo44092f(r0)
        L_0x00dc:
            if (r1 <= 0) goto L_0x0115
            int r2 = r0 + 2
            int r2 = r7.mo44092f(r2)
            i.b.a.a.c.i.q r2 = r7.mo44077a(r2, r5)
            int r4 = r0 + 4
            int r4 = r7.mo44092f(r4)
            i.b.a.a.c.i.q r4 = r7.mo44077a(r4, r5)
            int r3 = r0 + 6
            int r3 = r7.mo44092f(r3)
            i.b.a.a.c.i.q r3 = r7.mo44077a(r3, r5)
            int[] r10 = r7.f40497b
            int r0 = r0 + 8
            int r19 = r7.mo44092f(r0)
            r10 = r10[r19]
            java.lang.String r10 = r7.mo44086c(r10, r13)
            r15.mo44181a(r2, r4, r3, r10)
            int r1 = r1 + -1
            r3 = 1
            r4 = 132(0x84, float:1.85E-43)
            r10 = 8
            goto L_0x00dc
        L_0x0115:
            int r0 = r0 + 2
            int r1 = r14.f40586b
            r2 = 8
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0120
            r4 = 1
            goto L_0x0121
        L_0x0120:
            r4 = 0
        L_0x0121:
            int r1 = r7.mo44092f(r0)
            r20 = r0
            r19 = r1
            r30 = r4
            r0 = 0
            r1 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 1
            r27 = 0
            r28 = -1
            r29 = -1
        L_0x013f:
            r4 = 67
            if (r19 <= 0) goto L_0x035d
            int r2 = r20 + 2
            java.lang.String r2 = r7.mo44086c(r2, r13)
            java.lang.String r3 = "LocalVariableTable"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x01b2
            int r2 = r14.f40586b
            r2 = r2 & 2
            if (r2 != 0) goto L_0x01ab
            int r2 = r20 + 8
            int r3 = r7.mo44092f(r2)
            r4 = r20
        L_0x015f:
            if (r3 <= 0) goto L_0x019f
            int r10 = r4 + 10
            r33 = r0
            int r0 = r7.mo44092f(r10)
            r24 = r5[r0]
            r34 = r1
            if (r24 != 0) goto L_0x017e
            i.b.a.a.c.i.q r1 = r7.mo44077a(r0, r5)
            r24 = r2
            int r2 = r1.f40689b
            r17 = 1
            r2 = r2 | 1
            r1.f40689b = r2
            goto L_0x0180
        L_0x017e:
            r24 = r2
        L_0x0180:
            int r4 = r4 + 12
            int r1 = r7.mo44092f(r4)
            int r0 = r0 + r1
            r1 = r5[r0]
            if (r1 != 0) goto L_0x0195
            i.b.a.a.c.i.q r0 = r7.mo44077a(r0, r5)
            int r1 = r0.f40689b
            r2 = 1
            r1 = r1 | r2
            r0.f40689b = r1
        L_0x0195:
            int r3 = r3 + -1
            r4 = r10
            r2 = r24
            r0 = r33
            r1 = r34
            goto L_0x015f
        L_0x019f:
            r33 = r0
            r34 = r1
            r24 = r2
            r45 = r5
            r39 = r30
            goto L_0x02c7
        L_0x01ab:
            r33 = r0
            r34 = r1
        L_0x01af:
            r3 = 1
            goto L_0x02bf
        L_0x01b2:
            r33 = r0
            r34 = r1
            java.lang.String r0 = "LocalVariableTypeTable"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x01c4
            int r0 = r20 + 8
            r25 = r0
            goto L_0x02bf
        L_0x01c4:
            java.lang.String r0 = "LineNumberTable"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0211
            int r0 = r14.f40586b
            r0 = r0 & 2
            if (r0 != 0) goto L_0x01af
            int r0 = r20 + 8
            int r0 = r7.mo44092f(r0)
            r1 = r20
        L_0x01da:
            if (r0 <= 0) goto L_0x01af
            int r2 = r1 + 10
            int r2 = r7.mo44092f(r2)
            r3 = r5[r2]
            if (r3 != 0) goto L_0x01f0
            i.b.a.a.c.i.q r3 = r7.mo44077a(r2, r5)
            int r4 = r3.f40689b
            r10 = 1
            r4 = r4 | r10
            r3.f40689b = r4
        L_0x01f0:
            r2 = r5[r2]
        L_0x01f2:
            int r3 = r2.f40690c
            if (r3 <= 0) goto L_0x0204
            i.b.a.a.c.i.q r3 = r2.f40699l
            if (r3 != 0) goto L_0x0201
            i.b.a.a.c.i.q r3 = new i.b.a.a.c.i.q
            r3.<init>()
            r2.f40699l = r3
        L_0x0201:
            i.b.a.a.c.i.q r2 = r2.f40699l
            goto L_0x01f2
        L_0x0204:
            int r3 = r1 + 12
            int r3 = r7.mo44092f(r3)
            r2.f40690c = r3
            int r1 = r1 + 4
            int r0 = r0 + -1
            goto L_0x01da
        L_0x0211:
            java.lang.String r0 = "RuntimeVisibleTypeAnnotations"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0241
            int r0 = r20 + 8
            r1 = 1
            int[] r0 = r7.m59934b(r15, r14, r0, r1)
            int r2 = r0.length
            if (r2 == 0) goto L_0x0235
            r2 = 0
            r3 = r0[r2]
            int r3 = r7.mo44082b(r3)
            if (r3 >= r4) goto L_0x022d
            goto L_0x0235
        L_0x022d:
            r3 = r0[r2]
            int r3 = r3 + r1
            int r2 = r7.mo44092f(r3)
            goto L_0x0236
        L_0x0235:
            r2 = -1
        L_0x0236:
            r1 = r0
            r28 = r2
            r45 = r5
            r39 = r30
            r0 = r33
            goto L_0x02c7
        L_0x0241:
            java.lang.String r0 = "RuntimeInvisibleTypeAnnotations"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x026e
            int r0 = r20 + 8
            r1 = 0
            int[] r0 = r7.m59934b(r15, r14, r0, r1)
            int r2 = r0.length
            if (r2 == 0) goto L_0x0265
            r2 = r0[r1]
            int r2 = r7.mo44082b(r2)
            if (r2 >= r4) goto L_0x025c
            goto L_0x0265
        L_0x025c:
            r2 = r0[r1]
            r3 = 1
            int r2 = r2 + r3
            int r2 = r7.mo44092f(r2)
            goto L_0x0267
        L_0x0265:
            r3 = 1
            r2 = -1
        L_0x0267:
            r29 = r2
            r45 = r5
            r39 = r30
            goto L_0x02c5
        L_0x026e:
            r3 = 1
            java.lang.String r0 = "StackMapTable"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0292
            int r0 = r14.f40586b
            r0 = r0 & 4
            if (r0 != 0) goto L_0x02bf
            int r0 = r20 + 10
            int r1 = r20 + 4
            int r1 = r7.mo44085c(r1)
            int r2 = r20 + 8
            int r2 = r7.mo44092f(r2)
            r21 = r0
            r22 = r1
            r27 = r2
            goto L_0x02bf
        L_0x0292:
            java.lang.String r0 = "StackMap"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x02cc
            int r0 = r14.f40586b
            r0 = r0 & 4
            if (r0 != 0) goto L_0x02bf
            int r0 = r20 + 10
            int r1 = r20 + 4
            int r1 = r7.mo44085c(r1)
            int r2 = r20 + 8
            int r2 = r7.mo44092f(r2)
            r21 = r0
            r22 = r1
            r27 = r2
            r45 = r5
            r39 = r30
            r0 = r33
            r1 = r34
            r26 = 0
            goto L_0x02c7
        L_0x02bf:
            r45 = r5
            r39 = r30
            r0 = r33
        L_0x02c5:
            r1 = r34
        L_0x02c7:
            r30 = r13
            r13 = r6
            goto L_0x0346
        L_0x02cc:
            r4 = r23
            r10 = 0
        L_0x02cf:
            i.b.a.a.c.i.c[] r0 = r14.f40585a
            int r1 = r0.length
            if (r10 >= r1) goto L_0x0334
            r0 = r0[r10]
            java.lang.String r0 = r0.f40481a
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0312
            i.b.a.a.c.i.c[] r0 = r14.f40585a
            r0 = r0[r10]
            int r17 = r20 + 8
            int r1 = r20 + 4
            int r23 = r7.mo44085c(r1)
            int r35 = r16 + -8
            r1 = r33
            r37 = r1
            r36 = r34
            r1 = r42
            r31 = r2
            r15 = -1
            r2 = r17
            r3 = r23
            r15 = r4
            r39 = r30
            r4 = r13
            r45 = r5
            r5 = r35
            r30 = r13
            r13 = r6
            r6 = r45
            i.b.a.a.c.i.c r0 = r0.mo44060a(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0320
            r0.f40483c = r15
            r4 = r0
            goto L_0x0321
        L_0x0312:
            r31 = r2
            r15 = r4
            r45 = r5
            r39 = r30
            r37 = r33
            r36 = r34
            r30 = r13
            r13 = r6
        L_0x0320:
            r4 = r15
        L_0x0321:
            int r10 = r10 + 1
            r15 = r43
            r5 = r45
            r6 = r13
            r13 = r30
            r2 = r31
            r34 = r36
            r33 = r37
            r30 = r39
            r3 = 1
            goto L_0x02cf
        L_0x0334:
            r15 = r4
            r45 = r5
            r39 = r30
            r37 = r33
            r36 = r34
            r30 = r13
            r13 = r6
            r23 = r15
            r1 = r36
            r0 = r37
        L_0x0346:
            int r2 = r20 + 4
            int r2 = r7.mo44085c(r2)
            int r2 = r2 + 6
            int r20 = r20 + r2
            int r19 = r19 + -1
            r15 = r43
            r5 = r45
            r6 = r13
            r13 = r30
            r30 = r39
            goto L_0x013f
        L_0x035d:
            r37 = r0
            r36 = r1
            r45 = r5
            r39 = r30
            r30 = r13
            r13 = r6
            if (r21 == 0) goto L_0x03b9
            r6 = -1
            r14.f40595k = r6
            r0 = 0
            r14.f40599o = r0
            r14.f40600p = r0
            r14.f40601q = r0
            r14.f40603s = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r14.f40602r = r0
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r14.f40604t = r0
            r10 = r39
            if (r10 == 0) goto L_0x0385
            r7.m59929a(r14)
        L_0x0385:
            r0 = r21
        L_0x0387:
            int r1 = r21 + r22
            int r1 = r1 + -2
            if (r0 >= r1) goto L_0x03b4
            byte r1 = r8[r0]
            r2 = 8
            if (r1 != r2) goto L_0x03ad
            int r1 = r0 + 1
            int r1 = r7.mo44092f(r1)
            if (r1 < 0) goto L_0x03ad
            if (r1 >= r9) goto L_0x03ad
            int r2 = r16 + r1
            byte r2 = r8[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 187(0xbb, float:2.62E-43)
            if (r2 != r3) goto L_0x03ad
            r15 = r45
            r7.mo44077a(r1, r15)
            goto L_0x03af
        L_0x03ad:
            r15 = r45
        L_0x03af:
            int r0 = r0 + 1
            r45 = r15
            goto L_0x0387
        L_0x03b4:
            r15 = r45
            r17 = r14
            goto L_0x03c0
        L_0x03b9:
            r15 = r45
            r10 = r39
            r6 = -1
            r17 = 0
        L_0x03c0:
            int r0 = r14.f40586b
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x03d7
            r1 = -1
            r3 = 0
            r5 = 0
            r19 = 0
            r0 = r43
            r2 = r11
            r6 = 67
            r4 = r5
            r5 = r19
            r0.mo44174a(r1, r2, r3, r4, r5)
            goto L_0x03d9
        L_0x03d7:
            r6 = 67
        L_0x03d9:
            int r0 = r14.f40586b
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x03e4
            r0 = -33
            r19 = -33
            goto L_0x03e6
        L_0x03e4:
            r19 = 0
        L_0x03e6:
            r5 = r16
            r3 = r17
            r17 = 0
            r20 = 0
        L_0x03ee:
            if (r5 >= r13) goto L_0x08dd
            int r4 = r5 - r16
            r0 = r15[r4]
            if (r0 == 0) goto L_0x041a
            i.b.a.a.c.i.q r1 = r0.f40699l
            r2 = 0
            r0.f40699l = r2
            r6 = r43
            r31 = r11
            r11 = -1
            r6.mo44180a(r0)
            int r2 = r14.f40586b
            r2 = r2 & 2
            if (r2 != 0) goto L_0x041f
            int r2 = r0.f40690c
            if (r2 <= 0) goto L_0x041f
            r6.mo44191b(r2, r0)
        L_0x0410:
            if (r1 == 0) goto L_0x041f
            int r2 = r1.f40690c
            r6.mo44191b(r2, r0)
            i.b.a.a.c.i.q r1 = r1.f40699l
            goto L_0x0410
        L_0x041a:
            r6 = r43
            r31 = r11
            r11 = -1
        L_0x041f:
            r2 = r21
        L_0x0421:
            if (r3 == 0) goto L_0x04a6
            int r0 = r3.f40595k
            if (r0 == r4) goto L_0x0429
            if (r0 != r11) goto L_0x04a6
        L_0x0429:
            int r0 = r3.f40595k
            if (r0 == r11) goto L_0x0476
            r1 = r26
            if (r1 == 0) goto L_0x045b
            if (r10 == 0) goto L_0x0434
            goto L_0x045b
        L_0x0434:
            int r0 = r3.f40599o
            int r11 = r3.f40601q
            r45 = r4
            java.lang.Object[] r4 = r3.f40602r
            r26 = r5
            int r5 = r3.f40603s
            r32 = r12
            java.lang.Object[] r12 = r3.f40604t
            r33 = r0
            r0 = r43
            r34 = r13
            r13 = r1
            r1 = r33
            r33 = r9
            r9 = r2
            r2 = r11
            r11 = r3
            r3 = r4
            r14 = r45
            r4 = r5
            r5 = r12
            r0.mo44174a(r1, r2, r3, r4, r5)
            goto L_0x0483
        L_0x045b:
            r11 = r3
            r14 = r4
            r26 = r5
            r33 = r9
            r32 = r12
            r34 = r13
            r13 = r1
            r9 = r2
            r1 = -1
            int r2 = r11.f40600p
            java.lang.Object[] r3 = r11.f40602r
            int r4 = r11.f40603s
            java.lang.Object[] r5 = r11.f40604t
            r0 = r43
            r0.mo44174a(r1, r2, r3, r4, r5)
            goto L_0x0483
        L_0x0476:
            r11 = r3
            r14 = r4
            r33 = r9
            r32 = r12
            r34 = r13
            r13 = r26
            r9 = r2
            r26 = r5
        L_0x0483:
            if (r27 <= 0) goto L_0x0494
            int r2 = r7.m59920a(r9, r13, r10, r11)
            int r27 = r27 + -1
            r3 = r11
            r4 = r14
            r5 = r26
            r12 = r32
            r9 = r33
            goto L_0x049d
        L_0x0494:
            r2 = r9
            r4 = r14
            r5 = r26
            r12 = r32
            r9 = r33
            r3 = 0
        L_0x049d:
            r11 = -1
            r14 = r44
            r26 = r13
            r13 = r34
            goto L_0x0421
        L_0x04a6:
            r11 = r3
            r14 = r4
            r33 = r9
            r32 = r12
            r34 = r13
            r13 = r26
            r9 = r2
            r26 = r5
            byte r0 = r8[r26]
            r12 = r0 & 255(0xff, float:3.57E-43)
            byte[] r0 = p205i.p471b.p472a.p473a.p474c.p475i.C13946g.f40533m0
            byte r0 = r0[r12]
            switch(r0) {
                case 0: goto L_0x0805;
                case 1: goto L_0x07e9;
                case 2: goto L_0x07cb;
                case 3: goto L_0x07b0;
                case 4: goto L_0x0781;
                case 5: goto L_0x0765;
                case 6: goto L_0x0704;
                case 7: goto L_0x0704;
                case 8: goto L_0x0698;
                case 9: goto L_0x066f;
                case 10: goto L_0x0656;
                case 11: goto L_0x063f;
                case 12: goto L_0x062a;
                case 13: goto L_0x0601;
                case 14: goto L_0x05c6;
                case 15: goto L_0x0583;
                case 16: goto L_0x04be;
                case 17: goto L_0x054b;
                case 18: goto L_0x04e8;
                default: goto L_0x04be;
            }
        L_0x04be:
            r38 = r9
            r35 = r13
            r9 = r14
            r18 = 8
            r39 = 132(0x84, float:1.85E-43)
            r14 = r44
            r41 = r30
            r30 = r11
            r11 = r41
            int r5 = r26 + 1
            java.lang.String r0 = r7.mo44078a(r5, r11)
            int r5 = r26 + 3
            byte r1 = r8[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r6.mo44184a(r0, r1)
            int r5 = r26 + 4
        L_0x04e0:
            r0 = r17
            r1 = r28
            r13 = r36
            goto L_0x081d
        L_0x04e8:
            r0 = 218(0xda, float:3.05E-43)
            if (r12 >= r0) goto L_0x04ef
            int r12 = r12 + -49
            goto L_0x04f1
        L_0x04ef:
            int r12 = r12 + -20
        L_0x04f1:
            int r5 = r26 + 1
            int r0 = r7.mo44092f(r5)
            int r4 = r14 + r0
            r0 = r15[r4]
            r1 = 167(0xa7, float:2.34E-43)
            if (r12 == r1) goto L_0x0540
            r1 = 168(0xa8, float:2.35E-43)
            if (r12 != r1) goto L_0x0504
            goto L_0x0540
        L_0x0504:
            r1 = 166(0xa6, float:2.33E-43)
            if (r12 > r1) goto L_0x050f
            int r12 = r12 + 1
            r5 = 1
            r1 = r12 ^ 1
            int r1 = r1 - r5
            goto L_0x0512
        L_0x050f:
            r5 = 1
            r1 = r12 ^ 1
        L_0x0512:
            i.b.a.a.c.i.q r2 = new i.b.a.a.c.i.q
            r2.<init>()
            r6.mo44175a(r1, r2)
            r1 = 200(0xc8, float:2.8E-43)
            r6.mo44175a(r1, r0)
            r6.mo44180a(r2)
            if (r9 == 0) goto L_0x053c
            if (r11 == 0) goto L_0x052c
            int r0 = r11.f40595k
            int r4 = r14 + 3
            if (r0 == r4) goto L_0x053c
        L_0x052c:
            r1 = 256(0x100, float:3.59E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r12 = 0
            r0 = r43
            r35 = r13
            r13 = 1
            r5 = r12
            r0.mo44174a(r1, r2, r3, r4, r5)
            goto L_0x0548
        L_0x053c:
            r35 = r13
            r13 = 1
            goto L_0x0548
        L_0x0540:
            r35 = r13
            r13 = 1
            int r12 = r12 + 33
            r6.mo44175a(r12, r0)
        L_0x0548:
            int r5 = r26 + 3
            goto L_0x0576
        L_0x054b:
            r35 = r13
            r13 = 1
            int r5 = r26 + 1
            byte r0 = r8[r5]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r5 = 132(0x84, float:1.85E-43)
            if (r0 != r5) goto L_0x056a
            int r0 = r26 + 2
            int r0 = r7.mo44092f(r0)
            int r1 = r26 + 4
            short r1 = r7.mo44091e(r1)
            r6.mo44172a(r0, r1)
            int r0 = r26 + 6
            goto L_0x0575
        L_0x056a:
            int r1 = r26 + 2
            int r1 = r7.mo44092f(r1)
            r6.mo44197d(r0, r1)
            int r0 = r26 + 4
        L_0x0575:
            r5 = r0
        L_0x0576:
            r38 = r9
            r9 = r14
            r0 = r17
            r1 = r28
            r13 = r36
            r18 = 8
            goto L_0x061e
        L_0x0583:
            r35 = r13
            r5 = 132(0x84, float:1.85E-43)
            r13 = 1
            int r0 = r26 + 4
            r1 = r14 & 3
            int r0 = r0 - r1
            int r1 = r7.mo44085c(r0)
            int r4 = r14 + r1
            int r1 = r0 + 4
            int r1 = r7.mo44085c(r1)
            int[] r2 = new int[r1]
            i.b.a.a.c.i.q[] r3 = new p205i.p471b.p472a.p473a.p474c.p475i.C13956q[r1]
            r18 = 8
            int r0 = r0 + 8
            r12 = r0
            r0 = 0
        L_0x05a3:
            if (r0 >= r1) goto L_0x05bd
            int r26 = r7.mo44085c(r12)
            r2[r0] = r26
            int r5 = r12 + 4
            int r5 = r7.mo44085c(r5)
            int r5 = r5 + r14
            r5 = r15[r5]
            r3[r0] = r5
            int r12 = r12 + 8
            int r0 = r0 + 1
            r5 = 132(0x84, float:1.85E-43)
            goto L_0x05a3
        L_0x05bd:
            r0 = r15[r4]
            r6.mo44182a(r0, r2, r3)
            r38 = r9
            r5 = r12
            goto L_0x0617
        L_0x05c6:
            r35 = r13
            r13 = 1
            r18 = 8
            int r5 = r26 + 4
            r0 = r14 & 3
            int r5 = r5 - r0
            int r0 = r7.mo44085c(r5)
            int r4 = r14 + r0
            int r0 = r5 + 4
            int r0 = r7.mo44085c(r0)
            int r1 = r5 + 8
            int r1 = r7.mo44085c(r1)
            int r2 = r1 - r0
            int r2 = r2 + r13
            i.b.a.a.c.i.q[] r2 = new p205i.p471b.p472a.p473a.p474c.p475i.C13956q[r2]
            int r5 = r5 + 12
            r3 = 0
        L_0x05ea:
            int r12 = r2.length
            if (r3 >= r12) goto L_0x05fb
            int r12 = r7.mo44085c(r5)
            int r12 = r12 + r14
            r12 = r15[r12]
            r2[r3] = r12
            int r5 = r5 + 4
            int r3 = r3 + 1
            goto L_0x05ea
        L_0x05fb:
            r3 = r15[r4]
            r6.mo44173a(r0, r1, r3, r2)
            goto L_0x0615
        L_0x0601:
            r35 = r13
            r13 = 1
            r18 = 8
            int r5 = r26 + 1
            byte r0 = r8[r5]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r5 = r26 + 2
            byte r1 = r8[r5]
            r6.mo44172a(r0, r1)
            int r5 = r26 + 3
        L_0x0615:
            r38 = r9
        L_0x0617:
            r9 = r14
            r0 = r17
            r1 = r28
            r13 = r36
        L_0x061e:
            r39 = 132(0x84, float:1.85E-43)
            r14 = r44
            r41 = r30
            r30 = r11
            r11 = r41
            goto L_0x081d
        L_0x062a:
            r35 = r13
            r13 = 1
            r18 = 8
            int r5 = r26 + 1
            int r0 = r7.mo44092f(r5)
            r5 = r30
            java.lang.Object r0 = r7.mo44083b(r0, r5)
            r6.mo44183a(r0)
            goto L_0x0683
        L_0x063f:
            r35 = r13
            r5 = r30
            r13 = 1
            r18 = 8
            int r0 = r26 + 1
            byte r0 = r8[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.Object r0 = r7.mo44083b(r0, r5)
            r6.mo44183a(r0)
            int r0 = r26 + 2
            goto L_0x0685
        L_0x0656:
            r35 = r13
            r5 = r30
            r13 = 1
            r18 = 8
            int r12 = r12 + r19
            int r0 = r26 + 1
            int r0 = r7.mo44085c(r0)
            int r4 = r14 + r0
            r0 = r15[r4]
            r6.mo44175a(r12, r0)
            int r0 = r26 + 5
            goto L_0x0685
        L_0x066f:
            r35 = r13
            r5 = r30
            r13 = 1
            r18 = 8
            int r0 = r26 + 1
            short r0 = r7.mo44091e(r0)
            int r4 = r14 + r0
            r0 = r15[r4]
            r6.mo44175a(r12, r0)
        L_0x0683:
            int r0 = r26 + 3
        L_0x0685:
            r38 = r9
            r30 = r11
            r9 = r14
            r1 = r28
            r13 = r36
            r39 = 132(0x84, float:1.85E-43)
            r14 = r44
        L_0x0692:
            r11 = r5
            r5 = r0
            r0 = r17
            goto L_0x081d
        L_0x0698:
            r35 = r13
            r5 = r30
            r13 = 1
            r18 = 8
            int[] r0 = r7.f40497b
            int r1 = r26 + 1
            int r1 = r7.mo44092f(r1)
            r0 = r0[r1]
            r4 = r14
            r14 = r44
            int[] r1 = r14.f40588d
            int r2 = r7.mo44092f(r0)
            r1 = r1[r2]
            int r2 = r7.mo44092f(r1)
            java.lang.Object r2 = r7.mo44083b(r2, r5)
            i.b.a.a.c.i.n r2 = (p205i.p471b.p472a.p473a.p474c.p475i.C13953n) r2
            int r3 = r1 + 2
            int r3 = r7.mo44092f(r3)
            java.lang.Object[] r12 = new java.lang.Object[r3]
            int r1 = r1 + 4
            r13 = r1
            r1 = 0
        L_0x06ca:
            if (r1 >= r3) goto L_0x06df
            r45 = r3
            int r3 = r7.mo44092f(r13)
            java.lang.Object r3 = r7.mo44083b(r3, r5)
            r12[r1] = r3
            int r13 = r13 + 2
            int r1 = r1 + 1
            r3 = r45
            goto L_0x06ca
        L_0x06df:
            int[] r1 = r7.f40497b
            int r0 = r0 + 2
            int r0 = r7.mo44092f(r0)
            r0 = r1[r0]
            java.lang.String r1 = r7.mo44086c(r0, r5)
            int r0 = r0 + 2
            java.lang.String r0 = r7.mo44086c(r0, r5)
            r6.mo44185a(r1, r0, r2, r12)
            int r0 = r26 + 5
            r38 = r9
            r30 = r11
            r1 = r28
            r13 = r36
            r39 = 132(0x84, float:1.85E-43)
            r9 = r4
            goto L_0x0692
        L_0x0704:
            r35 = r13
            r4 = r14
            r5 = r30
            r18 = 8
            r14 = r44
            int[] r0 = r7.f40497b
            int r1 = r26 + 1
            int r1 = r7.mo44092f(r1)
            r0 = r0[r1]
            int r1 = r0 + -1
            byte r1 = r8[r1]
            r2 = 11
            if (r1 != r2) goto L_0x0721
            r13 = 1
            goto L_0x0722
        L_0x0721:
            r13 = 0
        L_0x0722:
            java.lang.String r2 = r7.mo44078a(r0, r5)
            int[] r1 = r7.f40497b
            int r0 = r0 + 2
            int r0 = r7.mo44092f(r0)
            r0 = r1[r0]
            java.lang.String r3 = r7.mo44086c(r0, r5)
            int r0 = r0 + 2
            java.lang.String r1 = r7.mo44086c(r0, r5)
            r0 = 182(0xb6, float:2.55E-43)
            if (r12 >= r0) goto L_0x074a
            r6.mo44177a(r12, r2, r3, r1)
            r38 = r9
            r30 = r11
            r39 = 132(0x84, float:1.85E-43)
            r9 = r4
            r11 = r5
            goto L_0x075d
        L_0x074a:
            r0 = r43
            r30 = r1
            r1 = r12
            r38 = r9
            r9 = r4
            r4 = r30
            r30 = r11
            r39 = 132(0x84, float:1.85E-43)
            r11 = r5
            r5 = r13
            r0.mo44178a(r1, r2, r3, r4, r5)
        L_0x075d:
            r0 = 185(0xb9, float:2.59E-43)
            if (r12 != r0) goto L_0x07e5
            int r5 = r26 + 5
            goto L_0x04e0
        L_0x0765:
            r38 = r9
            r35 = r13
            r9 = r14
            r18 = 8
            r39 = 132(0x84, float:1.85E-43)
            r14 = r44
            r41 = r30
            r30 = r11
            r11 = r41
            int r5 = r26 + 1
            java.lang.String r0 = r7.mo44078a(r5, r11)
            r6.mo44176a(r12, r0)
            goto L_0x07e5
        L_0x0781:
            r38 = r9
            r35 = r13
            r9 = r14
            r18 = 8
            r39 = 132(0x84, float:1.85E-43)
            r14 = r44
            r41 = r30
            r30 = r11
            r11 = r41
            r0 = 54
            if (r12 <= r0) goto L_0x07a3
            int r12 = r12 + -59
            int r0 = r12 >> 2
            int r0 = r0 + 54
            r1 = r12 & 3
            r6.mo44197d(r0, r1)
            goto L_0x0819
        L_0x07a3:
            int r12 = r12 + -26
            int r0 = r12 >> 2
            int r0 = r0 + 21
            r1 = r12 & 3
            r6.mo44197d(r0, r1)
            goto L_0x0819
        L_0x07b0:
            r38 = r9
            r35 = r13
            r9 = r14
            r18 = 8
            r39 = 132(0x84, float:1.85E-43)
            r14 = r44
            r41 = r30
            r30 = r11
            r11 = r41
            int r5 = r26 + 1
            byte r0 = r8[r5]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r6.mo44197d(r12, r0)
            goto L_0x0801
        L_0x07cb:
            r38 = r9
            r35 = r13
            r9 = r14
            r18 = 8
            r39 = 132(0x84, float:1.85E-43)
            r14 = r44
            r41 = r30
            r30 = r11
            r11 = r41
            int r5 = r26 + 1
            short r0 = r7.mo44091e(r5)
            r6.mo44190b(r12, r0)
        L_0x07e5:
            int r5 = r26 + 3
            goto L_0x04e0
        L_0x07e9:
            r38 = r9
            r35 = r13
            r9 = r14
            r18 = 8
            r39 = 132(0x84, float:1.85E-43)
            r14 = r44
            r41 = r30
            r30 = r11
            r11 = r41
            int r5 = r26 + 1
            byte r0 = r8[r5]
            r6.mo44190b(r12, r0)
        L_0x0801:
            int r5 = r26 + 2
            goto L_0x04e0
        L_0x0805:
            r38 = r9
            r35 = r13
            r9 = r14
            r18 = 8
            r39 = 132(0x84, float:1.85E-43)
            r14 = r44
            r41 = r30
            r30 = r11
            r11 = r41
            r6.mo44189b(r12)
        L_0x0819:
            int r5 = r26 + 1
            goto L_0x04e0
        L_0x081d:
            if (r13 == 0) goto L_0x085a
            int r2 = r13.length
            if (r0 >= r2) goto L_0x085a
            if (r1 > r9) goto L_0x085a
            if (r1 != r9) goto L_0x083e
            r1 = r13[r0]
            int r1 = r7.m59924a(r14, r1)
            int r2 = r1 + 2
            int r3 = r14.f40593i
            i.b.a.a.c.i.v r4 = r14.f40594j
            java.lang.String r1 = r7.mo44086c(r1, r11)
            r12 = 1
            i.b.a.a.c.i.a r1 = r6.mo44168a(r3, r4, r1, r12)
            r7.m59922a(r2, r11, r12, r1)
        L_0x083e:
            int r0 = r0 + 1
            int r1 = r13.length
            if (r0 >= r1) goto L_0x0858
            r1 = r13[r0]
            int r1 = r7.mo44082b(r1)
            r2 = 67
            if (r1 >= r2) goto L_0x084e
            goto L_0x0858
        L_0x084e:
            r1 = r13[r0]
            r2 = 1
            int r1 = r1 + r2
            int r2 = r7.mo44092f(r1)
            r1 = r2
            goto L_0x081d
        L_0x0858:
            r1 = -1
            goto L_0x081d
        L_0x085a:
            r2 = r20
            r3 = r29
            r12 = r37
        L_0x0860:
            if (r12 == 0) goto L_0x08b4
            int r4 = r12.length
            if (r2 >= r4) goto L_0x08b4
            if (r3 > r9) goto L_0x08b4
            if (r3 != r9) goto L_0x0889
            r3 = r12[r2]
            int r3 = r7.m59924a(r14, r3)
            int r4 = r3 + 2
            r17 = r0
            int r0 = r14.f40593i
            r20 = r1
            i.b.a.a.c.i.v r1 = r14.f40594j
            java.lang.String r3 = r7.mo44086c(r3, r11)
            r45 = r10
            r10 = 0
            i.b.a.a.c.i.a r0 = r6.mo44168a(r0, r1, r3, r10)
            r1 = 1
            r7.m59922a(r4, r11, r1, r0)
            goto L_0x0890
        L_0x0889:
            r17 = r0
            r20 = r1
            r45 = r10
            r10 = 0
        L_0x0890:
            int r2 = r2 + 1
            int r0 = r12.length
            if (r2 >= r0) goto L_0x08aa
            r0 = r12[r2]
            int r0 = r7.mo44082b(r0)
            r1 = 67
            if (r0 >= r1) goto L_0x08a0
            goto L_0x08ac
        L_0x08a0:
            r0 = r12[r2]
            r3 = 1
            int r0 = r0 + r3
            int r0 = r7.mo44092f(r0)
            r3 = r0
            goto L_0x08ad
        L_0x08aa:
            r1 = 67
        L_0x08ac:
            r3 = -1
        L_0x08ad:
            r10 = r45
            r0 = r17
            r1 = r20
            goto L_0x0860
        L_0x08b4:
            r17 = r0
            r20 = r1
            r45 = r10
            r1 = 67
            r10 = 0
            r10 = r45
            r29 = r3
            r37 = r12
            r36 = r13
            r28 = r20
            r3 = r30
            r12 = r32
            r9 = r33
            r13 = r34
            r26 = r35
            r21 = r38
            r6 = 67
            r20 = r2
            r30 = r11
            r11 = r31
            goto L_0x03ee
        L_0x08dd:
            r6 = r43
            r33 = r9
            r31 = r11
            r32 = r12
            r11 = r30
            r13 = r36
            r12 = r37
            r10 = 0
            r0 = r15[r33]
            if (r0 == 0) goto L_0x08f5
            r0 = r15[r33]
            r6.mo44180a(r0)
        L_0x08f5:
            int r0 = r14.f40586b
            r0 = r0 & 2
            if (r0 != 0) goto L_0x0990
            r0 = r24
            if (r0 == 0) goto L_0x0990
            r1 = r25
            if (r1 == 0) goto L_0x092e
            int r25 = r1 + 2
            int r1 = r7.mo44092f(r1)
            int r1 = r1 * 3
            int[] r3 = new int[r1]
            int r1 = r3.length
            r2 = r25
        L_0x0910:
            if (r1 <= 0) goto L_0x092c
            int r1 = r1 + -1
            int r4 = r2 + 6
            r3[r1] = r4
            r4 = -1
            int r1 = r1 + r4
            int r5 = r2 + 8
            int r5 = r7.mo44092f(r5)
            r3[r1] = r5
            int r1 = r1 + r4
            int r5 = r7.mo44092f(r2)
            r3[r1] = r5
            int r2 = r2 + 10
            goto L_0x0910
        L_0x092c:
            r8 = r3
            goto L_0x092f
        L_0x092e:
            r8 = 0
        L_0x092f:
            int r24 = r0 + 2
            int r0 = r7.mo44092f(r0)
            r9 = r0
            r5 = r24
        L_0x0938:
            if (r9 <= 0) goto L_0x0990
            int r0 = r7.mo44092f(r5)
            int r1 = r5 + 2
            int r1 = r7.mo44092f(r1)
            int r2 = r5 + 8
            int r4 = r7.mo44092f(r2)
            if (r8 == 0) goto L_0x0967
            r2 = 0
        L_0x094d:
            int r3 = r8.length
            if (r2 >= r3) goto L_0x0967
            r3 = r8[r2]
            if (r3 != r0) goto L_0x0964
            int r3 = r2 + 1
            r3 = r8[r3]
            if (r3 != r4) goto L_0x0964
            int r2 = r2 + 2
            r2 = r8[r2]
            java.lang.String r2 = r7.mo44086c(r2, r11)
            r3 = r2
            goto L_0x0968
        L_0x0964:
            int r2 = r2 + 3
            goto L_0x094d
        L_0x0967:
            r3 = 0
        L_0x0968:
            int r2 = r5 + 4
            java.lang.String r2 = r7.mo44086c(r2, r11)
            int r10 = r5 + 6
            java.lang.String r10 = r7.mo44086c(r10, r11)
            r16 = r15[r0]
            int r0 = r0 + r1
            r17 = r15[r0]
            r0 = r43
            r1 = r2
            r2 = r10
            r10 = r4
            r4 = r16
            r24 = r5
            r5 = r17
            r6 = r10
            r0.mo44186a(r1, r2, r3, r4, r5, r6)
            int r5 = r24 + 10
            int r9 = r9 + -1
            r6 = r43
            r10 = 0
            goto L_0x0938
        L_0x0990:
            if (r13 == 0) goto L_0x09f5
            r0 = 0
        L_0x0993:
            int r1 = r13.length
            if (r0 >= r1) goto L_0x09f5
            r1 = r13[r0]
            int r1 = r7.mo44082b(r1)
            r2 = 1
            int r1 = r1 >> r2
            r3 = 32
            if (r1 != r3) goto L_0x09d9
            r1 = r13[r0]
            int r1 = r7.m59924a(r14, r1)
            int r3 = r1 + 2
            int r9 = r14.f40593i
            i.b.a.a.c.i.v r10 = r14.f40594j
            i.b.a.a.c.i.q[] r4 = r14.f40596l
            i.b.a.a.c.i.q[] r5 = r14.f40597m
            int[] r6 = r14.f40598n
            java.lang.String r1 = r7.mo44086c(r1, r11)
            r15 = 1
            r8 = r43
            r16 = 0
            r17 = r11
            r2 = r31
            r11 = r4
            r40 = r12
            r4 = r32
            r12 = r5
            r5 = r17
            r17 = r13
            r13 = r6
            r6 = r14
            r14 = r1
            r1 = r43
            i.b.a.a.c.i.a r8 = r8.mo44169a(r9, r10, r11, r12, r13, r14, r15)
            r15 = 1
            r7.m59922a(r3, r5, r15, r8)
            goto L_0x09e8
        L_0x09d9:
            r1 = r43
            r5 = r11
            r40 = r12
            r17 = r13
            r6 = r14
            r2 = r31
            r4 = r32
            r15 = 1
            r16 = 0
        L_0x09e8:
            int r0 = r0 + 1
            r31 = r2
            r32 = r4
            r11 = r5
            r14 = r6
            r13 = r17
            r12 = r40
            goto L_0x0993
        L_0x09f5:
            r1 = r43
            r5 = r11
            r6 = r14
            r2 = r31
            r4 = r32
            r15 = 1
            r16 = 0
            r0 = r12
            if (r0 == 0) goto L_0x0a47
            r3 = 0
        L_0x0a04:
            int r8 = r0.length
            if (r3 >= r8) goto L_0x0a47
            r8 = r0[r3]
            int r8 = r7.mo44082b(r8)
            int r8 = r8 >> r15
            r9 = 32
            if (r8 != r9) goto L_0x0a3c
            r8 = r0[r3]
            int r8 = r7.m59924a(r6, r8)
            int r14 = r8 + 2
            int r9 = r6.f40593i
            i.b.a.a.c.i.v r10 = r6.f40594j
            i.b.a.a.c.i.q[] r11 = r6.f40596l
            i.b.a.a.c.i.q[] r12 = r6.f40597m
            int[] r13 = r6.f40598n
            java.lang.String r16 = r7.mo44086c(r8, r5)
            r17 = 0
            r8 = r43
            r33 = r0
            r0 = r14
            r14 = r16
            r6 = 1
            r15 = r17
            i.b.a.a.c.i.a r8 = r8.mo44169a(r9, r10, r11, r12, r13, r14, r15)
            r7.m59922a(r0, r5, r6, r8)
            goto L_0x0a3f
        L_0x0a3c:
            r33 = r0
            r6 = 1
        L_0x0a3f:
            int r3 = r3 + 1
            r6 = r44
            r0 = r33
            r15 = 1
            goto L_0x0a04
        L_0x0a47:
            r0 = r23
        L_0x0a49:
            if (r0 == 0) goto L_0x0a55
            i.b.a.a.c.i.c r3 = r0.f40483c
            r5 = 0
            r0.f40483c = r5
            r1.mo44179a(r0)
            r0 = r3
            goto L_0x0a49
        L_0x0a55:
            r1.mo44196c(r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p205i.p471b.p472a.p473a.p474c.p475i.C13944e.m59930a(i.b.a.a.c.i.r, i.b.a.a.c.i.h, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0084  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m59924a(p205i.p471b.p472a.p473a.p474c.p475i.C13947h r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.mo44085c(r10)
            int r1 = r0 >>> 24
            r2 = 1
            if (r1 == 0) goto L_0x0075
            if (r1 == r2) goto L_0x0075
            r3 = 64
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r1 == r3) goto L_0x002f
            r3 = 65
            if (r1 == r3) goto L_0x002f
            switch(r1) {
                case 19: goto L_0x002c;
                case 20: goto L_0x002c;
                case 21: goto L_0x002c;
                case 22: goto L_0x0075;
                default: goto L_0x0018;
            }
        L_0x0018:
            switch(r1) {
                case 71: goto L_0x0025;
                case 72: goto L_0x0025;
                case 73: goto L_0x0025;
                case 74: goto L_0x0025;
                case 75: goto L_0x0025;
                default: goto L_0x001b;
            }
        L_0x001b:
            r3 = 67
            if (r1 >= r3) goto L_0x0021
            r4 = -256(0xffffffffffffff00, float:NaN)
        L_0x0021:
            r0 = r0 & r4
            int r10 = r10 + 3
            goto L_0x007a
        L_0x0025:
            r1 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r0 = r0 & r1
            int r10 = r10 + 4
            goto L_0x007a
        L_0x002c:
            r0 = r0 & r4
            int r10 = r10 + r2
            goto L_0x007a
        L_0x002f:
            r0 = r0 & r4
            int r1 = r10 + 1
            int r1 = r8.mo44092f(r1)
            i.b.a.a.c.i.q[] r3 = new p205i.p471b.p472a.p473a.p474c.p475i.C13956q[r1]
            r9.f40596l = r3
            i.b.a.a.c.i.q[] r3 = new p205i.p471b.p472a.p473a.p474c.p475i.C13956q[r1]
            r9.f40597m = r3
            int[] r3 = new int[r1]
            r9.f40598n = r3
            int r10 = r10 + 3
            r3 = 0
        L_0x0045:
            if (r3 >= r1) goto L_0x007a
            int r4 = r8.mo44092f(r10)
            int r5 = r10 + 2
            int r5 = r8.mo44092f(r5)
            i.b.a.a.c.i.q[] r6 = r9.f40596l
            i.b.a.a.c.i.q[] r7 = r9.f40592h
            i.b.a.a.c.i.q r7 = r8.mo44077a(r4, r7)
            r6[r3] = r7
            i.b.a.a.c.i.q[] r6 = r9.f40597m
            int r4 = r4 + r5
            i.b.a.a.c.i.q[] r5 = r9.f40592h
            i.b.a.a.c.i.q r4 = r8.mo44077a(r4, r5)
            r6[r3] = r4
            int[] r4 = r9.f40598n
            int r5 = r10 + 4
            int r5 = r8.mo44092f(r5)
            r4[r3] = r5
            int r10 = r10 + 6
            int r3 = r3 + 1
            goto L_0x0045
        L_0x0075:
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r1
            int r10 = r10 + 2
        L_0x007a:
            int r1 = r8.mo44082b(r10)
            r9.f40593i = r0
            if (r1 != 0) goto L_0x0084
            r0 = 0
            goto L_0x008b
        L_0x0084:
            i.b.a.a.c.i.v r0 = new i.b.a.a.c.i.v
            byte[] r3 = r8.f40496a
            r0.<init>(r3, r10)
        L_0x008b:
            r9.f40594j = r0
            int r10 = r10 + r2
            int r1 = r1 * 2
            int r10 = r10 + r1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p205i.p471b.p472a.p473a.p474c.p475i.C13944e.m59924a(i.b.a.a.c.i.h, int):int");
    }

    /* renamed from: a */
    private void m59931a(C13957r rVar, C13947h hVar, int i, boolean z) {
        int i2 = i + 1;
        byte b = this.f40496a[i] & 255;
        int length = C13960u.m60138a(hVar.f40591g).length - b;
        int i3 = 0;
        while (i3 < length) {
            C13940a a = rVar.mo44170a(i3, "Ljava/lang/Synthetic;", false);
            if (a != null) {
                a.mo44053a();
            }
            i3++;
        }
        char[] cArr = hVar.f40587c;
        while (i3 < b + length) {
            i2 += 2;
            for (int f = mo44092f(i2); f > 0; f--) {
                i2 = m59922a(i2 + 2, cArr, true, rVar.mo44170a(i3, mo44086c(i2, cArr), z));
            }
            i3++;
        }
    }

    /* renamed from: a */
    private int m59922a(int i, char[] cArr, boolean z, C13940a aVar) {
        int f = mo44092f(i);
        int i2 = i + 2;
        if (z) {
            while (f > 0) {
                i2 = m59921a(i2 + 2, cArr, mo44086c(i2, cArr), aVar);
                f--;
            }
        } else {
            while (f > 0) {
                i2 = m59921a(i2, cArr, (String) null, aVar);
                f--;
            }
        }
        if (aVar != null) {
            aVar.mo44053a();
        }
        return i2;
    }

    /* renamed from: a */
    private int m59921a(int i, char[] cArr, String str, C13940a aVar) {
        int i2 = 0;
        if (aVar == null) {
            byte b = this.f40496a[i] & 255;
            if (b == 64) {
                return m59922a(i + 3, cArr, true, (C13940a) null);
            }
            if (b != 91) {
                return b != 101 ? i + 3 : i + 5;
            }
            return m59922a(i + 1, cArr, false, (C13940a) null);
        }
        int i3 = i + 1;
        byte b2 = this.f40496a[i] & 255;
        if (b2 != 64) {
            if (b2 != 70) {
                if (b2 == 83) {
                    aVar.mo44054a(str, (Object) Short.valueOf((short) mo44085c(this.f40497b[mo44092f(i3)])));
                } else if (b2 == 99) {
                    aVar.mo44054a(str, (Object) C13960u.m60151f(mo44086c(i3, cArr)));
                } else if (b2 == 101) {
                    aVar.mo44055a(str, mo44086c(i3, cArr), mo44086c(i3 + 2, cArr));
                    i3 += 4;
                } else if (b2 == 115) {
                    aVar.mo44054a(str, (Object) mo44086c(i3, cArr));
                } else if (!(b2 == 73 || b2 == 74)) {
                    if (b2 == 90) {
                        aVar.mo44054a(str, (Object) mo44085c(this.f40497b[mo44092f(i3)]) == 0 ? Boolean.FALSE : Boolean.TRUE);
                    } else if (b2 != 91) {
                        switch (b2) {
                            case 66:
                                aVar.mo44054a(str, (Object) Byte.valueOf((byte) mo44085c(this.f40497b[mo44092f(i3)])));
                                break;
                            case 67:
                                aVar.mo44054a(str, (Object) Character.valueOf((char) mo44085c(this.f40497b[mo44092f(i3)])));
                                break;
                            case 68:
                                break;
                        }
                    } else {
                        int f = mo44092f(i3);
                        int i4 = i3 + 2;
                        if (f == 0) {
                            return m59922a(i4 - 2, cArr, false, aVar.mo44051a(str));
                        }
                        int i5 = i4 + 1;
                        byte b3 = this.f40496a[i4] & 255;
                        if (b3 == 70) {
                            float[] fArr = new float[f];
                            while (i2 < f) {
                                fArr[i2] = Float.intBitsToFloat(mo44085c(this.f40497b[mo44092f(i5)]));
                                i5 += 3;
                                i2++;
                            }
                            aVar.mo44054a(str, (Object) fArr);
                        } else if (b3 == 83) {
                            short[] sArr = new short[f];
                            while (i2 < f) {
                                sArr[i2] = (short) mo44085c(this.f40497b[mo44092f(i5)]);
                                i5 += 3;
                                i2++;
                            }
                            aVar.mo44054a(str, (Object) sArr);
                        } else if (b3 == 90) {
                            boolean[] zArr = new boolean[f];
                            for (int i6 = 0; i6 < f; i6++) {
                                zArr[i6] = mo44085c(this.f40497b[mo44092f(i5)]) != 0;
                                i5 += 3;
                            }
                            aVar.mo44054a(str, (Object) zArr);
                        } else if (b3 == 73) {
                            int[] iArr = new int[f];
                            while (i2 < f) {
                                iArr[i2] = mo44085c(this.f40497b[mo44092f(i5)]);
                                i5 += 3;
                                i2++;
                            }
                            aVar.mo44054a(str, (Object) iArr);
                        } else if (b3 != 74) {
                            switch (b3) {
                                case 66:
                                    byte[] bArr = new byte[f];
                                    while (i2 < f) {
                                        bArr[i2] = (byte) mo44085c(this.f40497b[mo44092f(i5)]);
                                        i5 += 3;
                                        i2++;
                                    }
                                    aVar.mo44054a(str, (Object) bArr);
                                    break;
                                case 67:
                                    char[] cArr2 = new char[f];
                                    while (i2 < f) {
                                        cArr2[i2] = (char) mo44085c(this.f40497b[mo44092f(i5)]);
                                        i5 += 3;
                                        i2++;
                                    }
                                    aVar.mo44054a(str, (Object) cArr2);
                                    break;
                                case 68:
                                    double[] dArr = new double[f];
                                    while (i2 < f) {
                                        dArr[i2] = Double.longBitsToDouble(mo44089d(this.f40497b[mo44092f(i5)]));
                                        i5 += 3;
                                        i2++;
                                    }
                                    aVar.mo44054a(str, (Object) dArr);
                                    break;
                                default:
                                    i3 = m59922a(i5 - 3, cArr, false, aVar.mo44051a(str));
                                    break;
                            }
                        } else {
                            long[] jArr = new long[f];
                            while (i2 < f) {
                                jArr[i2] = mo44089d(this.f40497b[mo44092f(i5)]);
                                i5 += 3;
                                i2++;
                            }
                            aVar.mo44054a(str, (Object) jArr);
                        }
                        i3 = i5 - 1;
                    }
                }
                i3 += 2;
            }
            aVar.mo44054a(str, mo44083b(mo44092f(i3), cArr));
            i3 += 2;
        } else {
            i3 = m59922a(i3 + 2, cArr, true, aVar.mo44052a(str, mo44086c(i3, cArr)));
        }
        return i3;
    }

    /* renamed from: a */
    private void m59929a(C13947h hVar) {
        int i;
        int i2;
        String str = hVar.f40591g;
        Object[] objArr = hVar.f40602r;
        int i3 = 0;
        if ((hVar.f40589e & 8) == 0) {
            if ("<init>".equals(hVar.f40590f)) {
                objArr[0] = C13959t.f40905h0;
            } else {
                objArr[0] = mo44078a(this.f40500e + 2, hVar.f40587c);
            }
            i3 = 1;
        }
        int i4 = 1;
        while (true) {
            int i5 = i4 + 1;
            char charAt = str.charAt(i4);
            if (charAt == 'F') {
                i2 = i + 1;
                objArr[i] = C13959t.f40885d0;
            } else if (charAt != 'L') {
                if (!(charAt == 'S' || charAt == 'I')) {
                    if (charAt == 'J') {
                        i2 = i + 1;
                        objArr[i] = C13959t.f40895f0;
                    } else if (charAt != 'Z') {
                        if (charAt != '[') {
                            switch (charAt) {
                                case 'B':
                                case 'C':
                                    break;
                                case 'D':
                                    i2 = i + 1;
                                    objArr[i] = C13959t.f40890e0;
                                    break;
                                default:
                                    hVar.f40600p = i;
                                    return;
                            }
                        } else {
                            while (str.charAt(i5) == '[') {
                                i5++;
                            }
                            if (str.charAt(i5) == 'L') {
                                do {
                                    i5++;
                                } while (str.charAt(i5) != ';');
                            }
                            int i6 = i + 1;
                            int i7 = i5 + 1;
                            objArr[i] = str.substring(i4, i7);
                            i4 = i7;
                            i = i6;
                        }
                    }
                }
                i2 = i + 1;
                objArr[i] = C13959t.f40880c0;
            } else {
                int i8 = i5;
                while (str.charAt(i8) != ';') {
                    i8++;
                }
                int i9 = i + 1;
                int i10 = i8 + 1;
                objArr[i] = str.substring(i5, i8);
                i = i9;
                i4 = i10;
            }
            i = i2;
            i4 = i5;
        }
    }

    /* renamed from: a */
    private int m59920a(int i, boolean z, boolean z2, C13947h hVar) {
        int i2;
        int i3;
        int i4;
        char[] cArr = hVar.f40587c;
        C13956q[] qVarArr = hVar.f40592h;
        if (z) {
            int i5 = i + 1;
            i2 = this.f40496a[i] & 255;
            i3 = i5;
        } else {
            hVar.f40595k = -1;
            i3 = i;
            i2 = 255;
        }
        hVar.f40601q = 0;
        if (i2 < 64) {
            hVar.f40599o = 3;
            hVar.f40603s = 0;
        } else if (i2 < 128) {
            i2 -= 64;
            i3 = m59925a(hVar.f40604t, 0, i3, cArr, qVarArr);
            hVar.f40599o = 4;
            hVar.f40603s = 1;
        } else {
            i4 = mo44092f(i3);
            i3 += 2;
            if (i2 == 247) {
                i3 = m59925a(hVar.f40604t, 0, i3, cArr, qVarArr);
                hVar.f40599o = 4;
                hVar.f40603s = 1;
            } else if (i2 >= 248 && i2 < 251) {
                hVar.f40599o = 2;
                hVar.f40601q = 251 - i2;
                hVar.f40600p -= hVar.f40601q;
                hVar.f40603s = 0;
            } else if (i2 == 251) {
                hVar.f40599o = 3;
                hVar.f40603s = 0;
            } else if (i2 < 255) {
                int i6 = i2 - 251;
                int i7 = z2 ? hVar.f40600p : 0;
                int i8 = i6;
                while (i8 > 0) {
                    int i9 = i7 + 1;
                    i3 = m59925a(hVar.f40602r, i7, i3, cArr, qVarArr);
                    i8--;
                    i7 = i9;
                }
                hVar.f40599o = 1;
                hVar.f40601q = i6;
                hVar.f40600p += hVar.f40601q;
                hVar.f40603s = 0;
            } else {
                hVar.f40599o = 0;
                int f = mo44092f(i3);
                int i10 = i3 + 2;
                hVar.f40601q = f;
                hVar.f40600p = f;
                int i11 = 0;
                while (f > 0) {
                    int i12 = i11 + 1;
                    i10 = m59925a(hVar.f40602r, i11, i10, cArr, qVarArr);
                    f--;
                    i11 = i12;
                }
                int f2 = mo44092f(i10);
                int i13 = i10 + 2;
                hVar.f40603s = f2;
                int i14 = 0;
                while (f2 > 0) {
                    int i15 = i14 + 1;
                    i13 = m59925a(hVar.f40604t, i14, i3, cArr, qVarArr);
                    f2--;
                    i14 = i15;
                }
            }
            hVar.f40595k += i4 + 1;
            mo44077a(hVar.f40595k, qVarArr);
            return i3;
        }
        i4 = i2;
        hVar.f40595k += i4 + 1;
        mo44077a(hVar.f40595k, qVarArr);
        return i3;
    }

    /* renamed from: a */
    private int m59925a(Object[] objArr, int i, int i2, char[] cArr, C13956q[] qVarArr) {
        int i3 = i2 + 1;
        switch (this.f40496a[i2] & 255) {
            case 0:
                objArr[i] = C13959t.f40875b0;
                return i3;
            case 1:
                objArr[i] = C13959t.f40880c0;
                return i3;
            case 2:
                objArr[i] = C13959t.f40885d0;
                return i3;
            case 3:
                objArr[i] = C13959t.f40890e0;
                return i3;
            case 4:
                objArr[i] = C13959t.f40895f0;
                return i3;
            case 5:
                objArr[i] = C13959t.f40900g0;
                return i3;
            case 6:
                objArr[i] = C13959t.f40905h0;
                return i3;
            case 7:
                objArr[i] = mo44078a(i3, cArr);
                break;
            default:
                objArr[i] = mo44077a(mo44092f(i3), qVarArr);
                break;
        }
        return i3 + 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13956q mo44077a(int i, C13956q[] qVarArr) {
        if (qVarArr[i] == null) {
            qVarArr[i] = new C13956q();
        }
        return qVarArr[i];
    }

    /* renamed from: a */
    private C13942c m59926a(C13942c[] cVarArr, String str, int i, int i2, char[] cArr, int i3, C13956q[] qVarArr) {
        C13942c[] cVarArr2 = cVarArr;
        String str2 = str;
        for (int i4 = 0; i4 < cVarArr2.length; i4++) {
            if (cVarArr2[i4].f40481a.equals(str)) {
                return cVarArr2[i4].mo44060a(this, i, i2, cArr, i3, qVarArr);
            }
        }
        return new C13942c(str).mo44060a(this, i, i2, (char[]) null, -1, (C13956q[]) null);
    }

    /* renamed from: a */
    public int mo44076a(int i) {
        return this.f40497b[i];
    }

    /* renamed from: a */
    private String m59927a(int i, int i2, char[] cArr) {
        byte b;
        int i3 = i2 + i;
        byte[] bArr = this.f40496a;
        int i4 = 0;
        char c = 0;
        int i5 = 0;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = bArr[i];
            if (c != 0) {
                if (c == 1) {
                    int i7 = i4 + 1;
                    cArr[i4] = (char) ((b2 & 63) | (i5 << 6));
                    i4 = i7;
                    c = 0;
                } else if (c == 2) {
                    b = (b2 & 63) | (i5 << 6);
                }
                i = i6;
            } else {
                byte b3 = b2 & 255;
                if (b3 < 128) {
                    int i8 = i4 + 1;
                    cArr[i4] = (char) b3;
                    i4 = i8;
                } else if (b3 >= 224 || b3 <= 191) {
                    i5 = (char) (b3 & C5785c.f16698q);
                    c = 2;
                } else {
                    b = b3 & C5785c.f16676I;
                }
                i = i6;
            }
            i5 = (char) b;
            c = 1;
            i = i6;
        }
        return new String(cArr, 0, i4);
    }

    /* renamed from: a */
    public String mo44078a(int i, char[] cArr) {
        return mo44086c(this.f40497b[mo44092f(i)], cArr);
    }
}
