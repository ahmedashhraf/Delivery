package com.google.zxing.p350z.p351e;

import com.google.zxing.FormatException;
import com.google.zxing.p335u.C9046d;
import com.google.zxing.p335u.C9047e;
import com.google.zxing.p350z.C9163c;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: com.google.zxing.z.e.e */
/* compiled from: DecodedBitStreamParser */
final class C9169e {

    /* renamed from: a */
    private static final int f24067a = 900;

    /* renamed from: b */
    private static final int f24068b = 901;

    /* renamed from: c */
    private static final int f24069c = 902;

    /* renamed from: d */
    private static final int f24070d = 924;

    /* renamed from: e */
    private static final int f24071e = 925;

    /* renamed from: f */
    private static final int f24072f = 926;

    /* renamed from: g */
    private static final int f24073g = 927;

    /* renamed from: h */
    private static final int f24074h = 928;

    /* renamed from: i */
    private static final int f24075i = 923;

    /* renamed from: j */
    private static final int f24076j = 922;

    /* renamed from: k */
    private static final int f24077k = 913;

    /* renamed from: l */
    private static final int f24078l = 15;

    /* renamed from: m */
    private static final int f24079m = 25;

    /* renamed from: n */
    private static final int f24080n = 27;

    /* renamed from: o */
    private static final int f24081o = 27;

    /* renamed from: p */
    private static final int f24082p = 28;

    /* renamed from: q */
    private static final int f24083q = 28;

    /* renamed from: r */
    private static final int f24084r = 29;

    /* renamed from: s */
    private static final int f24085s = 29;

    /* renamed from: t */
    private static final char[] f24086t = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: u */
    private static final char[] f24087u = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: v */
    private static final Charset f24088v = Charset.forName("ISO-8859-1");

    /* renamed from: w */
    private static final BigInteger[] f24089w;

    /* renamed from: x */
    private static final int f24090x = 2;

    /* renamed from: com.google.zxing.z.e.e$a */
    /* compiled from: DecodedBitStreamParser */
    static /* synthetic */ class C9170a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24091a = new int[C9171b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.google.zxing.z.e.e$b[] r0 = com.google.zxing.p350z.p351e.C9169e.C9171b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24091a = r0
                int[] r0 = f24091a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.zxing.z.e.e$b r1 = com.google.zxing.p350z.p351e.C9169e.C9171b.ALPHA     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f24091a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.zxing.z.e.e$b r1 = com.google.zxing.p350z.p351e.C9169e.C9171b.LOWER     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f24091a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.google.zxing.z.e.e$b r1 = com.google.zxing.p350z.p351e.C9169e.C9171b.MIXED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f24091a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.google.zxing.z.e.e$b r1 = com.google.zxing.p350z.p351e.C9169e.C9171b.PUNCT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f24091a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.google.zxing.z.e.e$b r1 = com.google.zxing.p350z.p351e.C9169e.C9171b.ALPHA_SHIFT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f24091a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.google.zxing.z.e.e$b r1 = com.google.zxing.p350z.p351e.C9169e.C9171b.PUNCT_SHIFT     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p350z.p351e.C9169e.C9170a.<clinit>():void");
        }
    }

    /* renamed from: com.google.zxing.z.e.e$b */
    /* compiled from: DecodedBitStreamParser */
    private enum C9171b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f24089w = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900);
        f24089w[1] = valueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f24089w;
            if (i < bigIntegerArr2.length) {
                bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(valueOf);
                i++;
            } else {
                return;
            }
        }
    }

    private C9169e() {
    }

    /* renamed from: a */
    static C9047e m42865a(int[] iArr, String str) throws FormatException {
        int i;
        StringBuilder sb = new StringBuilder(iArr.length << 1);
        Charset charset = f24088v;
        int i2 = iArr[1];
        C9163c cVar = new C9163c();
        int i3 = 2;
        while (i3 < iArr[0]) {
            if (i2 != f24077k) {
                switch (i2) {
                    case f24067a /*900*/:
                        i = m42868b(iArr, i3, sb);
                        break;
                    case f24068b /*901*/:
                        i = m42862a(i2, iArr, charset, i3, sb);
                        break;
                    case f24069c /*902*/:
                        i = m42864a(iArr, i3, sb);
                        break;
                    default:
                        switch (i2) {
                            case f24076j /*922*/:
                            case f24075i /*923*/:
                                throw FormatException.m41710a();
                            case f24070d /*924*/:
                                break;
                            case f24071e /*925*/:
                                i = i3 + 1;
                                break;
                            case f24072f /*926*/:
                                i = i3 + 2;
                                break;
                            case f24073g /*927*/:
                                i = i3 + 1;
                                charset = Charset.forName(C9046d.m42322a(iArr[i3]).name());
                                break;
                            case 928:
                                i = m42863a(iArr, i3, cVar);
                                break;
                            default:
                                i = m42868b(iArr, i3 - 1, sb);
                                break;
                        }
                        i = m42862a(i2, iArr, charset, i3, sb);
                        break;
                }
            } else {
                i = i3 + 1;
                sb.append((char) iArr[i3]);
            }
            if (i < iArr.length) {
                i3 = i + 1;
                i2 = iArr[i];
            } else {
                throw FormatException.m41710a();
            }
        }
        if (sb.length() != 0) {
            C9047e eVar = new C9047e(null, sb.toString(), null, str);
            eVar.mo33017a((Object) cVar);
            return eVar;
        }
        throw FormatException.m41710a();
    }

    /* renamed from: b */
    private static int m42868b(int[] iArr, int i, StringBuilder sb) {
        int[] iArr2 = new int[((iArr[0] - i) << 1)];
        int[] iArr3 = new int[((iArr[0] - i) << 1)];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i4 < f24067a) {
                iArr2[i2] = i4 / 30;
                iArr2[i2 + 1] = i4 % 30;
                i2 += 2;
            } else if (i4 != f24077k) {
                if (i4 != 928) {
                    switch (i4) {
                        case f24067a /*900*/:
                            int i5 = i2 + 1;
                            iArr2[i2] = f24067a;
                            i2 = i5;
                            break;
                        case f24068b /*901*/:
                        case f24069c /*902*/:
                            break;
                        default:
                            switch (i4) {
                                case f24076j /*922*/:
                                case f24075i /*923*/:
                                case f24070d /*924*/:
                                    break;
                            }
                    }
                }
                i = i3 - 1;
                z = true;
            } else {
                iArr2[i2] = f24077k;
                i = i3 + 1;
                iArr3[i2] = iArr[i3];
                i2++;
            }
            i = i3;
        }
        m42867a(iArr2, iArr3, i2, sb);
        return i;
    }

    /* renamed from: a */
    private static int m42863a(int[] iArr, int i, C9163c cVar) throws FormatException {
        if (i + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            int i2 = i;
            int i3 = 0;
            while (i3 < 2) {
                iArr2[i3] = iArr[i2];
                i3++;
                i2++;
            }
            cVar.mo33199a(Integer.parseInt(m42866a(iArr2, 2)));
            StringBuilder sb = new StringBuilder();
            int b = m42868b(iArr, i2, sb);
            cVar.mo33200a(sb.toString());
            if (iArr[b] == f24075i) {
                int i4 = b + 1;
                int[] iArr3 = new int[(iArr[0] - i4)];
                boolean z = false;
                int i5 = 0;
                while (i4 < iArr[0] && !z) {
                    int i6 = i4 + 1;
                    int i7 = iArr[i4];
                    if (i7 < f24067a) {
                        int i8 = i5 + 1;
                        iArr3[i5] = i7;
                        i4 = i6;
                        i5 = i8;
                    } else if (i7 == f24076j) {
                        cVar.mo33201a(true);
                        i4 = i6 + 1;
                        z = true;
                    } else {
                        throw FormatException.m41710a();
                    }
                }
                cVar.mo33202a(Arrays.copyOf(iArr3, i5));
                return i4;
            } else if (iArr[b] != f24076j) {
                return b;
            } else {
                cVar.mo33201a(true);
                return b + 1;
            }
        } else {
            throw FormatException.m41710a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        r6 = r4;
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ba, code lost:
        r6 = 0;
        r15 = r5;
        r5 = r4;
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00db, code lost:
        r6 = (char) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00df, code lost:
        r6 = ' ';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00ff, code lost:
        if (r6 == 0) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0101, code lost:
        r0.append(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0104, code lost:
        r3 = r3 + 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m42867a(int[] r16, int[] r17, int r18, java.lang.StringBuilder r19) {
        /*
            r0 = r19
            com.google.zxing.z.e.e$b r1 = com.google.zxing.p350z.p351e.C9169e.C9171b.ALPHA
            r2 = 0
            r4 = r1
            r5 = r4
            r3 = 0
            r1 = r18
        L_0x000a:
            if (r3 >= r1) goto L_0x0108
            r6 = r16[r3]
            int[] r7 = com.google.zxing.p350z.p351e.C9169e.C9170a.f24091a
            int r8 = r4.ordinal()
            r7 = r7[r8]
            r8 = 28
            r9 = 27
            r10 = 32
            r11 = 913(0x391, float:1.28E-42)
            r12 = 900(0x384, float:1.261E-42)
            r13 = 29
            r14 = 26
            switch(r7) {
                case 1: goto L_0x00d7;
                case 2: goto L_0x00ae;
                case 3: goto L_0x007a;
                case 4: goto L_0x005c;
                case 5: goto L_0x0045;
                case 6: goto L_0x0029;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x00fe
        L_0x0029:
            if (r6 >= r13) goto L_0x0030
            char[] r4 = f24086t
            char r4 = r4[r6]
            goto L_0x004a
        L_0x0030:
            if (r6 != r13) goto L_0x0036
            com.google.zxing.z.e.e$b r4 = com.google.zxing.p350z.p351e.C9169e.C9171b.ALPHA
            goto L_0x00fe
        L_0x0036:
            if (r6 != r11) goto L_0x003f
            r4 = r17[r3]
            char r4 = (char) r4
            r0.append(r4)
            goto L_0x0059
        L_0x003f:
            if (r6 != r12) goto L_0x0059
            com.google.zxing.z.e.e$b r4 = com.google.zxing.p350z.p351e.C9169e.C9171b.ALPHA
            goto L_0x00fe
        L_0x0045:
            if (r6 >= r14) goto L_0x004e
            int r6 = r6 + 65
            char r4 = (char) r6
        L_0x004a:
            r6 = r4
            r4 = r5
            goto L_0x00ff
        L_0x004e:
            if (r6 != r14) goto L_0x0053
            r4 = r5
            goto L_0x00df
        L_0x0053:
            if (r6 != r12) goto L_0x0059
            com.google.zxing.z.e.e$b r4 = com.google.zxing.p350z.p351e.C9169e.C9171b.ALPHA
            goto L_0x00fe
        L_0x0059:
            r4 = r5
            goto L_0x00fe
        L_0x005c:
            if (r6 >= r13) goto L_0x0064
            char[] r7 = f24086t
            char r6 = r7[r6]
            goto L_0x00ff
        L_0x0064:
            if (r6 != r13) goto L_0x006a
            com.google.zxing.z.e.e$b r4 = com.google.zxing.p350z.p351e.C9169e.C9171b.ALPHA
            goto L_0x00fe
        L_0x006a:
            if (r6 != r11) goto L_0x0074
            r6 = r17[r3]
            char r6 = (char) r6
            r0.append(r6)
            goto L_0x00fe
        L_0x0074:
            if (r6 != r12) goto L_0x00fe
            com.google.zxing.z.e.e$b r4 = com.google.zxing.p350z.p351e.C9169e.C9171b.ALPHA
            goto L_0x00fe
        L_0x007a:
            r7 = 25
            if (r6 >= r7) goto L_0x0084
            char[] r7 = f24087u
            char r6 = r7[r6]
            goto L_0x00ff
        L_0x0084:
            if (r6 != r7) goto L_0x008a
            com.google.zxing.z.e.e$b r4 = com.google.zxing.p350z.p351e.C9169e.C9171b.PUNCT
            goto L_0x00fe
        L_0x008a:
            if (r6 != r14) goto L_0x008d
            goto L_0x00df
        L_0x008d:
            if (r6 != r9) goto L_0x0093
            com.google.zxing.z.e.e$b r4 = com.google.zxing.p350z.p351e.C9169e.C9171b.LOWER
            goto L_0x00fe
        L_0x0093:
            if (r6 != r8) goto L_0x0099
            com.google.zxing.z.e.e$b r4 = com.google.zxing.p350z.p351e.C9169e.C9171b.ALPHA
            goto L_0x00fe
        L_0x0099:
            if (r6 != r13) goto L_0x009e
            com.google.zxing.z.e.e$b r5 = com.google.zxing.p350z.p351e.C9169e.C9171b.PUNCT_SHIFT
            goto L_0x00ba
        L_0x009e:
            if (r6 != r11) goto L_0x00a8
            r6 = r17[r3]
            char r6 = (char) r6
            r0.append(r6)
            goto L_0x00fe
        L_0x00a8:
            if (r6 != r12) goto L_0x00fe
            com.google.zxing.z.e.e$b r4 = com.google.zxing.p350z.p351e.C9169e.C9171b.ALPHA
            goto L_0x00fe
        L_0x00ae:
            if (r6 >= r14) goto L_0x00b3
            int r6 = r6 + 97
            goto L_0x00db
        L_0x00b3:
            if (r6 != r14) goto L_0x00b6
            goto L_0x00df
        L_0x00b6:
            if (r6 != r9) goto L_0x00bf
            com.google.zxing.z.e.e$b r5 = com.google.zxing.p350z.p351e.C9169e.C9171b.ALPHA_SHIFT
        L_0x00ba:
            r6 = 0
            r15 = r5
            r5 = r4
            r4 = r15
            goto L_0x00ff
        L_0x00bf:
            if (r6 != r8) goto L_0x00c4
            com.google.zxing.z.e.e$b r4 = com.google.zxing.p350z.p351e.C9169e.C9171b.MIXED
            goto L_0x00fe
        L_0x00c4:
            if (r6 != r13) goto L_0x00c9
            com.google.zxing.z.e.e$b r5 = com.google.zxing.p350z.p351e.C9169e.C9171b.PUNCT_SHIFT
            goto L_0x00ba
        L_0x00c9:
            if (r6 != r11) goto L_0x00d2
            r6 = r17[r3]
            char r6 = (char) r6
            r0.append(r6)
            goto L_0x00fe
        L_0x00d2:
            if (r6 != r12) goto L_0x00fe
            com.google.zxing.z.e.e$b r4 = com.google.zxing.p350z.p351e.C9169e.C9171b.ALPHA
            goto L_0x00fe
        L_0x00d7:
            if (r6 >= r14) goto L_0x00dd
            int r6 = r6 + 65
        L_0x00db:
            char r6 = (char) r6
            goto L_0x00ff
        L_0x00dd:
            if (r6 != r14) goto L_0x00e2
        L_0x00df:
            r6 = 32
            goto L_0x00ff
        L_0x00e2:
            if (r6 != r9) goto L_0x00e7
            com.google.zxing.z.e.e$b r4 = com.google.zxing.p350z.p351e.C9169e.C9171b.LOWER
            goto L_0x00fe
        L_0x00e7:
            if (r6 != r8) goto L_0x00ec
            com.google.zxing.z.e.e$b r4 = com.google.zxing.p350z.p351e.C9169e.C9171b.MIXED
            goto L_0x00fe
        L_0x00ec:
            if (r6 != r13) goto L_0x00f1
            com.google.zxing.z.e.e$b r5 = com.google.zxing.p350z.p351e.C9169e.C9171b.PUNCT_SHIFT
            goto L_0x00ba
        L_0x00f1:
            if (r6 != r11) goto L_0x00fa
            r6 = r17[r3]
            char r6 = (char) r6
            r0.append(r6)
            goto L_0x00fe
        L_0x00fa:
            if (r6 != r12) goto L_0x00fe
            com.google.zxing.z.e.e$b r4 = com.google.zxing.p350z.p351e.C9169e.C9171b.ALPHA
        L_0x00fe:
            r6 = 0
        L_0x00ff:
            if (r6 == 0) goto L_0x0104
            r0.append(r6)
        L_0x0104:
            int r3 = r3 + 1
            goto L_0x000a
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p350z.p351e.C9169e.m42867a(int[], int[], int, java.lang.StringBuilder):void");
    }

    /* renamed from: a */
    private static int m42862a(int i, int[] iArr, Charset charset, int i2, StringBuilder sb) {
        int i3;
        long j;
        int i4;
        int i5;
        int i6 = i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i7 = f24076j;
        int i8 = f24075i;
        int i9 = 928;
        long j2 = 900;
        if (i6 == f24068b) {
            int[] iArr2 = new int[6];
            int i10 = i2 + 1;
            int i11 = iArr[i2];
            boolean z = false;
            loop0:
            while (true) {
                i4 = 0;
                long j3 = 0;
                while (i3 < iArr[0] && !z) {
                    int i12 = i4 + 1;
                    iArr2[i4] = i11;
                    j3 = (j3 * j) + ((long) i11);
                    int i13 = i3 + 1;
                    i11 = iArr[i3];
                    if (i11 == f24067a || i11 == f24068b || i11 == f24069c || i11 == f24070d || i11 == 928 || i11 == i8 || i11 == i7) {
                        i3 = i13 - 1;
                        i4 = i12;
                        i7 = f24076j;
                        i8 = f24075i;
                        j = 900;
                        z = true;
                    } else if (i12 % 5 != 0 || i12 <= 0) {
                        i3 = i13;
                        i4 = i12;
                        i7 = f24076j;
                        i8 = f24075i;
                        j = 900;
                    } else {
                        int i14 = 0;
                        while (i14 < 6) {
                            byteArrayOutputStream.write((byte) ((int) (j3 >> ((5 - i14) * 8))));
                            i14++;
                            i7 = f24076j;
                            i8 = f24075i;
                        }
                        i10 = i13;
                        j2 = 900;
                    }
                }
            }
            if (i3 != iArr[0] || i11 >= f24067a) {
                i5 = i4;
            } else {
                i5 = i4 + 1;
                iArr2[i4] = i11;
            }
            for (int i15 = 0; i15 < i5; i15++) {
                byteArrayOutputStream.write((byte) iArr2[i15]);
            }
        } else if (i6 == f24070d) {
            int i16 = i2;
            int i17 = 0;
            long j4 = 0;
            boolean z2 = false;
            while (i16 < iArr[0] && !z2) {
                int i18 = i16 + 1;
                int i19 = iArr[i16];
                if (i19 < f24067a) {
                    i17++;
                    j4 = (j4 * 900) + ((long) i19);
                    i16 = i18;
                } else {
                    if (i19 != f24067a && i19 != f24068b && i19 != f24069c && i19 != f24070d && i19 != i9) {
                        if (!(i19 == f24075i || i19 == f24076j)) {
                            i16 = i18;
                        }
                    }
                    i16 = i18 - 1;
                    z2 = true;
                }
                if (i17 % 5 == 0 && i17 > 0) {
                    int i20 = 0;
                    for (int i21 = 6; i20 < i21; i21 = 6) {
                        byteArrayOutputStream.write((byte) ((int) (j4 >> ((5 - i20) * 8))));
                        i20++;
                    }
                    i17 = 0;
                    j4 = 0;
                }
                i9 = 928;
            }
            i3 = i16;
        } else {
            i3 = i2;
        }
        sb.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return i3;
    }

    /* renamed from: a */
    private static int m42864a(int[] iArr, int i, StringBuilder sb) throws FormatException {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i3 == iArr[0]) {
                z = true;
            }
            if (i4 < f24067a) {
                iArr2[i2] = i4;
                i2++;
            } else if (i4 == f24067a || i4 == f24068b || i4 == f24070d || i4 == 928 || i4 == f24075i || i4 == f24076j) {
                i3--;
                z = true;
            }
            if ((i2 % 15 == 0 || i4 == f24069c || z) && i2 > 0) {
                sb.append(m42866a(iArr2, i2));
                i2 = 0;
            }
            i = i3;
        }
        return i;
    }

    /* renamed from: a */
    private static String m42866a(int[] iArr, int i) throws FormatException {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(f24089w[(i - i2) - 1].multiply(BigInteger.valueOf((long) iArr[i2])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw FormatException.m41710a();
    }
}
