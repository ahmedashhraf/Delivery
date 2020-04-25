package com.google.zxing.p341w.p342b;

import com.google.common.base.C5785c;
import com.google.zxing.p335u.C9047e;
import java.text.DecimalFormat;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.google.zxing.w.b.b */
/* compiled from: DecodedBitStreamParser */
final class C9090b {

    /* renamed from: a */
    private static final char f23807a = '￰';

    /* renamed from: b */
    private static final char f23808b = '￱';

    /* renamed from: c */
    private static final char f23809c = '￲';

    /* renamed from: d */
    private static final char f23810d = '￳';

    /* renamed from: e */
    private static final char f23811e = '￴';

    /* renamed from: f */
    private static final char f23812f = '￵';

    /* renamed from: g */
    private static final char f23813g = '￶';

    /* renamed from: h */
    private static final char f23814h = '￷';

    /* renamed from: i */
    private static final char f23815i = '￸';

    /* renamed from: j */
    private static final char f23816j = '￹';

    /* renamed from: k */
    private static final char f23817k = '￺';

    /* renamed from: l */
    private static final char f23818l = '￻';

    /* renamed from: m */
    private static final char f23819m = '￼';

    /* renamed from: n */
    private static final char f23820n = '\u001c';

    /* renamed from: o */
    private static final char f23821o = '\u001d';

    /* renamed from: p */
    private static final char f23822p = '\u001e';

    /* renamed from: q */
    private static final String[] f23823q = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ￺\u001c\u001d\u001e￻ ￼\"#$%&'()*+,-./0123456789:￱￲￳￴￸", "`abcdefghijklmnopqrstuvwxyz￺\u001c\u001d\u001e￻{￼}~;<=>?[\\]^_ ,./:@!|￼￵￶￼￰￲￳￴￷", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ￺\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾￷ ￹￳￴￸", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú￺\u001c\u001d\u001e￻ûüýþÿ¡¨«¯°´·¸»¿￷ ￲￹￴￸", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a￺￼￼\u001b￻\u001c\u001d\u001e\u001f ¢£¤¥¦§©­®¶￷ ￲￳￹￸", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};

    private C9090b() {
    }

    /* renamed from: a */
    static C9047e m42542a(byte[] bArr, int i) {
        String str;
        StringBuilder sb = new StringBuilder(C13959t.f40902g2);
        if (i == 2 || i == 3) {
            if (i == 2) {
                String str2 = "0000000000";
                str = new DecimalFormat(str2.substring(0, m42545c(bArr))).format((long) m42544b(bArr));
            } else {
                str = m42546d(bArr);
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String format = decimalFormat.format((long) m42540a(bArr));
            String format2 = decimalFormat.format((long) m42547e(bArr));
            sb.append(m42543a(bArr, 10, 84));
            if (sb.toString().startsWith("[)>\u001e01\u001d")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(f23821o);
                sb2.append(format);
                sb2.append(f23821o);
                sb2.append(format2);
                sb2.append(f23821o);
                sb.insert(9, sb2.toString());
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(f23821o);
                sb3.append(format);
                sb3.append(f23821o);
                sb3.append(format2);
                sb3.append(f23821o);
                sb.insert(0, sb3.toString());
            }
        } else if (i == 4) {
            sb.append(m42543a(bArr, 1, 93));
        } else if (i == 5) {
            sb.append(m42543a(bArr, 1, 77));
        }
        return new C9047e(bArr, sb.toString(), null, String.valueOf(i));
    }

    /* renamed from: b */
    private static int m42544b(byte[] bArr) {
        return m42541a(bArr, new byte[]{33, 34, 35, 36, C5785c.f16670C, C5785c.f16671D, C5785c.f16672E, C5785c.f16673F, C5785c.f16674G, C5785c.f16675H, 19, C5785c.f16705x, C5785c.f16706y, C5785c.f16707z, C5785c.f16668A, C5785c.f16669B, 13, C5785c.f16697p, C5785c.f16698q, 16, 17, C5785c.f16702u, 7, 8, 9, 10, C5785c.f16694m, C5785c.f16695n, 1, 2});
    }

    /* renamed from: c */
    private static int m42545c(byte[] bArr) {
        return m42541a(bArr, new byte[]{39, 40, 41, 42, C5785c.f16676I, 32});
    }

    /* renamed from: d */
    private static String m42546d(byte[] bArr) {
        return String.valueOf(new char[]{f23823q[0].charAt(m42541a(bArr, new byte[]{39, 40, 41, 42, C5785c.f16676I, 32})), f23823q[0].charAt(m42541a(bArr, new byte[]{33, 34, 35, 36, C5785c.f16670C, C5785c.f16671D})), f23823q[0].charAt(m42541a(bArr, new byte[]{C5785c.f16672E, C5785c.f16673F, C5785c.f16674G, C5785c.f16675H, 19, C5785c.f16705x})), f23823q[0].charAt(m42541a(bArr, new byte[]{C5785c.f16706y, C5785c.f16707z, C5785c.f16668A, C5785c.f16669B, 13, C5785c.f16697p})), f23823q[0].charAt(m42541a(bArr, new byte[]{C5785c.f16698q, 16, 17, C5785c.f16702u, 7, 8})), f23823q[0].charAt(m42541a(bArr, new byte[]{9, 10, C5785c.f16694m, C5785c.f16695n, 1, 2}))});
    }

    /* renamed from: e */
    private static int m42547e(byte[] bArr) {
        return m42541a(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52});
    }

    /* renamed from: a */
    private static int m42539a(int i, byte[] bArr) {
        int i2 = i - 1;
        return ((1 << (5 - (i2 % 6))) & bArr[i2 / 6]) == 0 ? 0 : 1;
    }

    /* renamed from: a */
    private static int m42541a(byte[] bArr, byte[] bArr2) {
        if (bArr2.length != 0) {
            int i = 0;
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                i += m42539a((int) bArr2[i2], bArr) << ((bArr2.length - i2) - 1);
            }
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    private static int m42540a(byte[] bArr) {
        return m42541a(bArr, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0055, code lost:
        r6 = r4;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
        r7 = r5 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0062, code lost:
        if (r5 != 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0065, code lost:
        r3 = r3 + 1;
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0050, code lost:
        r5 = -1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m42543a(byte[] r12, int r13, int r14) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = -1
            r3 = r13
            r4 = 0
            r5 = -1
            r6 = 0
        L_0x000b:
            int r7 = r13 + r14
            r8 = 1
            if (r3 >= r7) goto L_0x0068
            java.lang.String[] r7 = f23823q
            r7 = r7[r4]
            byte r9 = r12[r3]
            char r7 = r7.charAt(r9)
            switch(r7) {
                case 65520: goto L_0x0058;
                case 65521: goto L_0x0058;
                case 65522: goto L_0x0058;
                case 65523: goto L_0x0058;
                case 65524: goto L_0x0058;
                case 65525: goto L_0x0054;
                case 65526: goto L_0x0052;
                case 65527: goto L_0x004f;
                case 65528: goto L_0x004d;
                case 65529: goto L_0x0050;
                case 65530: goto L_0x001d;
                case 65531: goto L_0x0021;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0.append(r7)
            goto L_0x0060
        L_0x0021:
            int r3 = r3 + 1
            byte r7 = r12[r3]
            int r7 = r7 << 24
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r9 = r9 << 18
            int r7 = r7 + r9
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r9 = r9 << 12
            int r7 = r7 + r9
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r9 = r9 << 6
            int r7 = r7 + r9
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r7 = r7 + r9
            java.text.DecimalFormat r9 = new java.text.DecimalFormat
            java.lang.String r10 = "000000000"
            r9.<init>(r10)
            long r10 = (long) r7
            java.lang.String r7 = r9.format(r10)
            r0.append(r7)
            goto L_0x0060
        L_0x004d:
            r4 = 1
            goto L_0x0050
        L_0x004f:
            r4 = 0
        L_0x0050:
            r5 = -1
            goto L_0x0060
        L_0x0052:
            r5 = 3
            goto L_0x0055
        L_0x0054:
            r5 = 2
        L_0x0055:
            r6 = r4
            r4 = 0
            goto L_0x0060
        L_0x0058:
            r5 = 65520(0xfff0, float:9.1813E-41)
            int r5 = r7 - r5
            r6 = r4
            r4 = r5
            r5 = 1
        L_0x0060:
            int r7 = r5 + -1
            if (r5 != 0) goto L_0x0065
            r4 = r6
        L_0x0065:
            int r3 = r3 + r8
            r5 = r7
            goto L_0x000b
        L_0x0068:
            int r12 = r0.length()
            if (r12 <= 0) goto L_0x0085
            int r12 = r0.length()
            int r12 = r12 - r8
            char r12 = r0.charAt(r12)
            r13 = 65532(0xfffc, float:9.183E-41)
            if (r12 != r13) goto L_0x0085
            int r12 = r0.length()
            int r12 = r12 - r8
            r0.setLength(r12)
            goto L_0x0068
        L_0x0085:
            java.lang.String r12 = r0.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p341w.p342b.C9090b.m42543a(byte[], int, int):java.lang.String");
    }
}
