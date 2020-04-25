package com.google.zxing.p325a0.p326c;

import com.google.zxing.C8974d;
import com.google.zxing.FormatException;
import com.google.zxing.p335u.C9045c;
import com.google.zxing.p335u.C9046d;
import com.google.zxing.p335u.C9054l;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Map;
import org.jcodec.codecs.mjpeg.JpegConst;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.google.zxing.a0.c.d */
/* compiled from: DecodedBitStreamParser */
final class C8943d {

    /* renamed from: a */
    private static final char[] f23377a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* renamed from: b */
    private static final int f23378b = 1;

    private C8943d() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e8 A[LOOP:0: B:1:0x001e->B:60:0x00e8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c6 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.zxing.p335u.C9047e m41743a(byte[] r17, com.google.zxing.p325a0.p326c.C8949j r18, com.google.zxing.p325a0.p326c.C8945f r19, java.util.Map<com.google.zxing.C8974d, ?> r20) throws com.google.zxing.FormatException {
        /*
            r0 = r18
            com.google.zxing.u.c r7 = new com.google.zxing.u.c
            r8 = r17
            r7.<init>(r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r1 = 50
            r9.<init>(r1)
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 1
            r10.<init>(r11)
            r1 = 0
            r2 = -1
            r12 = 0
            r14 = r12
            r13 = 0
            r15 = -1
            r16 = -1
        L_0x001e:
            int r1 = r7.mo33009a()     // Catch:{ IllegalArgumentException -> 0x00eb }
            r2 = 4
            if (r1 >= r2) goto L_0x0029
            com.google.zxing.a0.c.h r1 = com.google.zxing.p325a0.p326c.C8947h.TERMINATOR     // Catch:{ IllegalArgumentException -> 0x00eb }
        L_0x0027:
            r6 = r1
            goto L_0x0032
        L_0x0029:
            int r1 = r7.mo33010a(r2)     // Catch:{ IllegalArgumentException -> 0x00eb }
            com.google.zxing.a0.c.h r1 = com.google.zxing.p325a0.p326c.C8947h.m41762a(r1)     // Catch:{ IllegalArgumentException -> 0x00eb }
            goto L_0x0027
        L_0x0032:
            com.google.zxing.a0.c.h r1 = com.google.zxing.p325a0.p326c.C8947h.TERMINATOR     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r6 == r1) goto L_0x0059
            com.google.zxing.a0.c.h r1 = com.google.zxing.p325a0.p326c.C8947h.FNC1_FIRST_POSITION     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r6 == r1) goto L_0x00c0
            com.google.zxing.a0.c.h r1 = com.google.zxing.p325a0.p326c.C8947h.FNC1_SECOND_POSITION     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r6 != r1) goto L_0x0040
            goto L_0x00c0
        L_0x0040:
            com.google.zxing.a0.c.h r1 = com.google.zxing.p325a0.p326c.C8947h.STRUCTURED_APPEND     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r6 != r1) goto L_0x0061
            int r1 = r7.mo33009a()     // Catch:{ IllegalArgumentException -> 0x00eb }
            r2 = 16
            if (r1 < r2) goto L_0x005c
            r1 = 8
            int r2 = r7.mo33010a(r1)     // Catch:{ IllegalArgumentException -> 0x00eb }
            int r1 = r7.mo33010a(r1)     // Catch:{ IllegalArgumentException -> 0x00eb }
            r16 = r1
            r15 = r2
        L_0x0059:
            r11 = r6
            goto L_0x00c2
        L_0x005c:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.m41710a()     // Catch:{ IllegalArgumentException -> 0x00eb }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00eb }
        L_0x0061:
            com.google.zxing.a0.c.h r1 = com.google.zxing.p325a0.p326c.C8947h.ECI     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r6 != r1) goto L_0x0075
            int r1 = m41742a(r7)     // Catch:{ IllegalArgumentException -> 0x00eb }
            com.google.zxing.u.d r14 = com.google.zxing.p335u.C9046d.m42322a(r1)     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r14 == 0) goto L_0x0070
            goto L_0x0059
        L_0x0070:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.m41710a()     // Catch:{ IllegalArgumentException -> 0x00eb }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00eb }
        L_0x0075:
            com.google.zxing.a0.c.h r1 = com.google.zxing.p325a0.p326c.C8947h.HANZI     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r6 != r1) goto L_0x008b
            int r1 = r7.mo33010a(r2)     // Catch:{ IllegalArgumentException -> 0x00eb }
            int r2 = r6.mo32694a(r0)     // Catch:{ IllegalArgumentException -> 0x00eb }
            int r2 = r7.mo33010a(r2)     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r1 != r11) goto L_0x0059
            m41744a(r7, r9, r2)     // Catch:{ IllegalArgumentException -> 0x00eb }
            goto L_0x0059
        L_0x008b:
            int r1 = r6.mo32694a(r0)     // Catch:{ IllegalArgumentException -> 0x00eb }
            int r3 = r7.mo33010a(r1)     // Catch:{ IllegalArgumentException -> 0x00eb }
            com.google.zxing.a0.c.h r1 = com.google.zxing.p325a0.p326c.C8947h.NUMERIC     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r6 != r1) goto L_0x009b
            m41748c(r7, r9, r3)     // Catch:{ IllegalArgumentException -> 0x00eb }
            goto L_0x0059
        L_0x009b:
            com.google.zxing.a0.c.h r1 = com.google.zxing.p325a0.p326c.C8947h.ALPHANUMERIC     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r6 != r1) goto L_0x00a3
            m41746a(r7, r9, r3, r13)     // Catch:{ IllegalArgumentException -> 0x00eb }
            goto L_0x0059
        L_0x00a3:
            com.google.zxing.a0.c.h r1 = com.google.zxing.p325a0.p326c.C8947h.BYTE     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r6 != r1) goto L_0x00b2
            r1 = r7
            r2 = r9
            r4 = r14
            r5 = r10
            r11 = r6
            r6 = r20
            m41745a(r1, r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x00eb }
            goto L_0x00c2
        L_0x00b2:
            r11 = r6
            com.google.zxing.a0.c.h r1 = com.google.zxing.p325a0.p326c.C8947h.KANJI     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r11 != r1) goto L_0x00bb
            m41747b(r7, r9, r3)     // Catch:{ IllegalArgumentException -> 0x00eb }
            goto L_0x00c2
        L_0x00bb:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.m41710a()     // Catch:{ IllegalArgumentException -> 0x00eb }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00eb }
        L_0x00c0:
            r11 = r6
            r13 = 1
        L_0x00c2:
            com.google.zxing.a0.c.h r1 = com.google.zxing.p325a0.p326c.C8947h.TERMINATOR     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r11 != r1) goto L_0x00e8
            com.google.zxing.u.e r7 = new com.google.zxing.u.e
            java.lang.String r2 = r9.toString()
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x00d4
            r3 = r12
            goto L_0x00d5
        L_0x00d4:
            r3 = r10
        L_0x00d5:
            if (r19 != 0) goto L_0x00d9
            r4 = r12
            goto L_0x00de
        L_0x00d9:
            java.lang.String r0 = r19.toString()
            r4 = r0
        L_0x00de:
            r0 = r7
            r1 = r17
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        L_0x00e8:
            r11 = 1
            goto L_0x001e
        L_0x00eb:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.m41710a()
            goto L_0x00f1
        L_0x00f0:
            throw r0
        L_0x00f1:
            goto L_0x00f0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p325a0.p326c.C8943d.m41743a(byte[], com.google.zxing.a0.c.j, com.google.zxing.a0.c.f, java.util.Map):com.google.zxing.u.e");
    }

    /* renamed from: b */
    private static void m41747b(C9045c cVar, StringBuilder sb, int i) throws FormatException {
        if (i * 13 <= cVar.mo33009a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int a = cVar.mo33010a(13);
                int i3 = (a % 192) | ((a / 192) << 8);
                int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, C9054l.f23705b));
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.m41710a();
            }
        } else {
            throw FormatException.m41710a();
        }
    }

    /* renamed from: c */
    private static void m41748c(C9045c cVar, StringBuilder sb, int i) throws FormatException {
        while (i >= 3) {
            if (cVar.mo33009a() >= 10) {
                int a = cVar.mo33010a(10);
                if (a < 1000) {
                    sb.append(m41741a(a / 100));
                    sb.append(m41741a((a / 10) % 10));
                    sb.append(m41741a(a % 10));
                    i -= 3;
                } else {
                    throw FormatException.m41710a();
                }
            } else {
                throw FormatException.m41710a();
            }
        }
        if (i != 2) {
            if (i == 1) {
                if (cVar.mo33009a() >= 4) {
                    int a2 = cVar.mo33010a(4);
                    if (a2 < 10) {
                        sb.append(m41741a(a2));
                    } else {
                        throw FormatException.m41710a();
                    }
                } else {
                    throw FormatException.m41710a();
                }
            }
        } else if (cVar.mo33009a() >= 7) {
            int a3 = cVar.mo33010a(7);
            if (a3 < 100) {
                sb.append(m41741a(a3 / 10));
                sb.append(m41741a(a3 % 10));
                return;
            }
            throw FormatException.m41710a();
        } else {
            throw FormatException.m41710a();
        }
    }

    /* renamed from: a */
    private static void m41744a(C9045c cVar, StringBuilder sb, int i) throws FormatException {
        if (i * 13 <= cVar.mo33009a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int a = cVar.mo33010a(13);
                int i3 = (a % 96) | ((a / 96) << 8);
                int i4 = i3 + (i3 < 959 ? 41377 : 42657);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, C9054l.f23706c));
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.m41710a();
            }
        } else {
            throw FormatException.m41710a();
        }
    }

    /* renamed from: a */
    private static void m41745a(C9045c cVar, StringBuilder sb, int i, C9046d dVar, Collection<byte[]> collection, Map<C8974d, ?> map) throws FormatException {
        String str;
        if ((i << 3) <= cVar.mo33009a()) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) cVar.mo33010a(8);
            }
            if (dVar == null) {
                str = C9054l.m42367a(bArr, map);
            } else {
                str = dVar.name();
            }
            try {
                sb.append(new String(bArr, str));
                collection.add(bArr);
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.m41710a();
            }
        } else {
            throw FormatException.m41710a();
        }
    }

    /* renamed from: a */
    private static char m41741a(int i) throws FormatException {
        char[] cArr = f23377a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw FormatException.m41710a();
    }

    /* renamed from: a */
    private static void m41746a(C9045c cVar, StringBuilder sb, int i, boolean z) throws FormatException {
        while (i > 1) {
            if (cVar.mo33009a() >= 11) {
                int a = cVar.mo33010a(11);
                sb.append(m41741a(a / 45));
                sb.append(m41741a(a % 45));
                i -= 2;
            } else {
                throw FormatException.m41710a();
            }
        }
        if (i == 1) {
            if (cVar.mo33009a() >= 6) {
                sb.append(m41741a(cVar.mo33010a(6)));
            } else {
                throw FormatException.m41710a();
            }
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, 29);
                }
            }
        }
    }

    /* renamed from: a */
    private static int m41742a(C9045c cVar) throws FormatException {
        int a = cVar.mo33010a(8);
        if ((a & 128) == 0) {
            return a & C13959t.f40827P1;
        }
        if ((a & 192) == 128) {
            return cVar.mo33010a(8) | ((a & 63) << 8);
        }
        if ((a & JpegConst.APP0) == 192) {
            return cVar.mo33010a(16) | ((a & 31) << 16);
        }
        throw FormatException.m41710a();
    }
}
