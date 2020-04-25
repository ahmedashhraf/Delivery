package com.google.zxing.p325a0.p328e;

import com.google.zxing.C8976f;
import com.google.zxing.WriterException;
import com.google.zxing.common.reedsolomon.C8970a;
import com.google.zxing.common.reedsolomon.C8973d;
import com.google.zxing.p325a0.p326c.C8945f;
import com.google.zxing.p325a0.p326c.C8947h;
import com.google.zxing.p325a0.p326c.C8949j;
import com.google.zxing.p325a0.p326c.C8949j.C8951b;
import com.google.zxing.p335u.C9043a;
import com.google.zxing.p335u.C9046d;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;
import org.jcodec.codecs.mjpeg.JpegConst;

/* renamed from: com.google.zxing.a0.e.c */
/* compiled from: Encoder */
public final class C8963c {

    /* renamed from: a */
    private static final int[] f23431a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: b */
    static final String f23432b = "ISO-8859-1";

    /* renamed from: com.google.zxing.a0.e.c$a */
    /* compiled from: Encoder */
    static /* synthetic */ class C8964a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23433a = new int[C8947h.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.google.zxing.a0.c.h[] r0 = com.google.zxing.p325a0.p326c.C8947h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23433a = r0
                int[] r0 = f23433a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.zxing.a0.c.h r1 = com.google.zxing.p325a0.p326c.C8947h.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f23433a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.zxing.a0.c.h r1 = com.google.zxing.p325a0.p326c.C8947h.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f23433a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.google.zxing.a0.c.h r1 = com.google.zxing.p325a0.p326c.C8947h.BYTE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f23433a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.google.zxing.a0.c.h r1 = com.google.zxing.p325a0.p326c.C8947h.KANJI     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p325a0.p328e.C8963c.C8964a.<clinit>():void");
        }
    }

    private C8963c() {
    }

    /* renamed from: a */
    private static int m41837a(C8962b bVar) {
        return C8965d.m41859a(bVar) + C8965d.m41864b(bVar) + C8965d.m41865c(bVar) + C8965d.m41866d(bVar);
    }

    /* renamed from: b */
    private static boolean m41858b(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                byte b = bytes[i] & 255;
                if ((b < 129 || b > 159) && (b < 224 || b > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static C8967f m41843a(String str, C8945f fVar) throws WriterException {
        return m41844a(str, fVar, null);
    }

    /* renamed from: b */
    static void m41857b(CharSequence charSequence, C9043a aVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                aVar.mo32966a((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    aVar.mo32966a((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    aVar.mo32966a(charAt, 4);
                }
            }
        }
    }

    /* renamed from: a */
    public static C8967f m41844a(String str, C8945f fVar, Map<C8976f, ?> map) throws WriterException {
        C8949j jVar;
        String str2 = "ISO-8859-1";
        String obj = (map == null || !map.containsKey(C8976f.CHARACTER_SET)) ? str2 : map.get(C8976f.CHARACTER_SET).toString();
        C8947h a = m41840a(str, obj);
        C9043a aVar = new C9043a();
        if (a == C8947h.BYTE && !str2.equals(obj)) {
            C9046d b = C9046d.m42323b(obj);
            if (b != null) {
                m41850a(b, aVar);
            }
        }
        m41849a(a, aVar);
        C9043a aVar2 = new C9043a();
        m41852a(str, a, aVar2, obj);
        if (map == null || !map.containsKey(C8976f.QR_VERSION)) {
            jVar = m41842a(fVar, a, aVar, aVar2);
        } else {
            jVar = C8949j.m41769c(Integer.parseInt(map.get(C8976f.QR_VERSION).toString()));
            if (!m41855a(m41836a(a, aVar, aVar2, jVar), jVar, fVar)) {
                throw new WriterException("Data too big for requested version");
            }
        }
        C9043a aVar3 = new C9043a();
        aVar3.mo32968a(aVar);
        m41847a(a == C8947h.BYTE ? aVar2.mo32981e() : str.length(), jVar, a, aVar3);
        aVar3.mo32968a(aVar2);
        C8951b a2 = jVar.mo32698a(fVar);
        int d = jVar.mo32702d() - a2.mo32710d();
        m41848a(d, aVar3);
        C9043a a3 = m41845a(aVar3, jVar.mo32702d(), d, a2.mo32709c());
        C8967f fVar2 = new C8967f();
        fVar2.mo32749a(fVar);
        fVar2.mo32750a(a);
        fVar2.mo32751a(jVar);
        int c = jVar.mo32701c();
        C8962b bVar = new C8962b(c, c);
        int a4 = m41838a(a3, fVar, jVar, bVar);
        fVar2.mo32748a(a4);
        C8966e.m41876a(a3, fVar, jVar, a4, bVar);
        fVar2.mo32752a(bVar);
        return fVar2;
    }

    /* renamed from: a */
    private static C8949j m41842a(C8945f fVar, C8947h hVar, C9043a aVar, C9043a aVar2) throws WriterException {
        return m41841a(m41836a(hVar, aVar, aVar2, m41841a(m41836a(hVar, aVar, aVar2, C8949j.m41769c(1)), fVar)), fVar);
    }

    /* renamed from: a */
    private static int m41836a(C8947h hVar, C9043a aVar, C9043a aVar2, C8949j jVar) {
        return aVar.mo32979d() + hVar.mo32694a(jVar) + aVar2.mo32979d();
    }

    /* renamed from: a */
    static int m41835a(int i) {
        int[] iArr = f23431a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    /* renamed from: a */
    public static C8947h m41839a(String str) {
        return m41840a(str, (String) null);
    }

    /* renamed from: a */
    private static C8947h m41840a(String str, String str2) {
        if ("Shift_JIS".equals(str2) && m41858b(str)) {
            return C8947h.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else if (m41835a((int) charAt) == -1) {
                return C8947h.BYTE;
            } else {
                z = true;
            }
        }
        if (z) {
            return C8947h.ALPHANUMERIC;
        }
        if (z2) {
            return C8947h.NUMERIC;
        }
        return C8947h.BYTE;
    }

    /* renamed from: a */
    private static int m41838a(C9043a aVar, C8945f fVar, C8949j jVar, C8962b bVar) throws WriterException {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            C8966e.m41876a(aVar, fVar, jVar, i3, bVar);
            int a = m41837a(bVar);
            if (a < i) {
                i2 = i3;
                i = a;
            }
        }
        return i2;
    }

    /* renamed from: a */
    private static C8949j m41841a(int i, C8945f fVar) throws WriterException {
        for (int i2 = 1; i2 <= 40; i2++) {
            C8949j c = C8949j.m41769c(i2);
            if (m41855a(i, c, fVar)) {
                return c;
            }
        }
        throw new WriterException("Data too big");
    }

    /* renamed from: a */
    private static boolean m41855a(int i, C8949j jVar, C8945f fVar) {
        return jVar.mo32702d() - jVar.mo32698a(fVar).mo32710d() >= (i + 7) / 8;
    }

    /* renamed from: a */
    static void m41848a(int i, C9043a aVar) throws WriterException {
        int i2 = i << 3;
        if (aVar.mo32979d() <= i2) {
            for (int i3 = 0; i3 < 4 && aVar.mo32979d() < i2; i3++) {
                aVar.mo32969a(false);
            }
            int d = aVar.mo32979d() & 7;
            if (d > 0) {
                while (d < 8) {
                    aVar.mo32969a(false);
                    d++;
                }
            }
            int e = i - aVar.mo32981e();
            for (int i4 = 0; i4 < e; i4++) {
                aVar.mo32966a((i4 & 1) == 0 ? JpegConst.APPC : 17, 8);
            }
            if (aVar.mo32979d() != i2) {
                throw new WriterException("Bits size does not equal capacity");
            }
            return;
        }
        StringBuilder sb = new StringBuilder("data bits cannot fit in the QR Code");
        sb.append(aVar.mo32979d());
        sb.append(" > ");
        sb.append(i2);
        throw new WriterException(sb.toString());
    }

    /* renamed from: a */
    static void m41846a(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws WriterException {
        if (i4 < i3) {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i7 + 1;
            int i9 = i2 / i3;
            int i10 = i9 + 1;
            int i11 = i7 - i9;
            int i12 = i8 - i10;
            if (i11 != i12) {
                throw new WriterException("EC bytes mismatch");
            } else if (i3 != i6 + i5) {
                throw new WriterException("RS blocks mismatch");
            } else if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
                throw new WriterException("Total bytes mismatch");
            } else if (i4 < i6) {
                iArr[0] = i9;
                iArr2[0] = i11;
            } else {
                iArr[0] = i10;
                iArr2[0] = i12;
            }
        } else {
            throw new WriterException("Block ID too large");
        }
    }

    /* renamed from: a */
    static C9043a m41845a(C9043a aVar, int i, int i2, int i3) throws WriterException {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (aVar.mo32981e() == i5) {
            ArrayList<C8961a> arrayList = new ArrayList<>(i6);
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                int[] iArr3 = iArr2;
                m41846a(i, i2, i3, i10, iArr, iArr2);
                int i11 = iArr[0];
                byte[] bArr = new byte[i11];
                aVar.mo32967a(i7 << 3, bArr, 0, i11);
                byte[] a = m41856a(bArr, iArr3[0]);
                arrayList.add(new C8961a(bArr, a));
                i8 = Math.max(i8, i11);
                i9 = Math.max(i9, a.length);
                i7 += iArr[0];
            }
            if (i5 == i7) {
                C9043a aVar2 = new C9043a();
                for (int i12 = 0; i12 < i8; i12++) {
                    for (C8961a a2 : arrayList) {
                        byte[] a3 = a2.mo32736a();
                        if (i12 < a3.length) {
                            aVar2.mo32966a(a3[i12], 8);
                        }
                    }
                }
                for (int i13 = 0; i13 < i9; i13++) {
                    for (C8961a b : arrayList) {
                        byte[] b2 = b.mo32737b();
                        if (i13 < b2.length) {
                            aVar2.mo32966a(b2[i13], 8);
                        }
                    }
                }
                if (i4 == aVar2.mo32981e()) {
                    return aVar2;
                }
                StringBuilder sb = new StringBuilder("Interleaving error: ");
                sb.append(i4);
                sb.append(" and ");
                sb.append(aVar2.mo32981e());
                sb.append(" differ.");
                throw new WriterException(sb.toString());
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    /* renamed from: a */
    static byte[] m41856a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[(length + i)];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new C8973d(C8970a.f23458l).mo32796a(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    /* renamed from: a */
    static void m41849a(C8947h hVar, C9043a aVar) {
        aVar.mo32966a(hVar.mo32695d(), 4);
    }

    /* renamed from: a */
    static void m41847a(int i, C8949j jVar, C8947h hVar, C9043a aVar) throws WriterException {
        int a = hVar.mo32694a(jVar);
        int i2 = 1 << a;
        if (i < i2) {
            aVar.mo32966a(i, a);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is bigger than ");
        sb.append(i2 - 1);
        throw new WriterException(sb.toString());
    }

    /* renamed from: a */
    static void m41852a(String str, C8947h hVar, C9043a aVar, String str2) throws WriterException {
        int i = C8964a.f23433a[hVar.ordinal()];
        if (i == 1) {
            m41857b(str, aVar);
        } else if (i == 2) {
            m41851a((CharSequence) str, aVar);
        } else if (i == 3) {
            m41854a(str, aVar, str2);
        } else if (i == 4) {
            m41853a(str, aVar);
        } else {
            StringBuilder sb = new StringBuilder("Invalid mode: ");
            sb.append(hVar);
            throw new WriterException(sb.toString());
        }
    }

    /* renamed from: a */
    static void m41851a(CharSequence charSequence, C9043a aVar) throws WriterException {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int a = m41835a((int) charSequence.charAt(i));
            if (a != -1) {
                int i2 = i + 1;
                if (i2 < length) {
                    int a2 = m41835a((int) charSequence.charAt(i2));
                    if (a2 != -1) {
                        aVar.mo32966a((a * 45) + a2, 11);
                        i += 2;
                    } else {
                        throw new WriterException();
                    }
                } else {
                    aVar.mo32966a(a, 6);
                    i = i2;
                }
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: a */
    static void m41854a(String str, C9043a aVar, String str2) throws WriterException {
        try {
            for (byte a : str.getBytes(str2)) {
                aVar.mo32966a(a, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException((Throwable) e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035 A[LOOP:0: B:4:0x0008->B:17:0x0035, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m41853a(java.lang.String r6, com.google.zxing.p335u.C9043a r7) throws com.google.zxing.WriterException {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x004d }
            int r0 = r6.length
            r1 = 0
        L_0x0008:
            if (r1 >= r0) goto L_0x004c
            byte r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            byte r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L_0x0024
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L_0x0024
        L_0x0022:
            int r2 = r2 - r3
            goto L_0x0033
        L_0x0024:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L_0x0032
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L_0x0032
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L_0x0022
        L_0x0032:
            r2 = -1
        L_0x0033:
            if (r2 == r4) goto L_0x0044
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.mo32966a(r3, r2)
            int r1 = r1 + 2
            goto L_0x0008
        L_0x0044:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>(r7)
            throw r6
        L_0x004c:
            return
        L_0x004d:
            r6 = move-exception
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            r7.<init>(r6)
            goto L_0x0055
        L_0x0054:
            throw r7
        L_0x0055:
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p325a0.p328e.C8963c.m41853a(java.lang.String, com.google.zxing.u.a):void");
    }

    /* renamed from: a */
    private static void m41850a(C9046d dVar, C9043a aVar) {
        aVar.mo32966a(C8947h.ECI.mo32695d(), 4);
        aVar.mo32966a(dVar.mo33013d(), 8);
    }
}
