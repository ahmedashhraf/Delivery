package com.google.zxing.p329s.p330d;

import com.bogdwellers.pinchtozoom.C2945d;
import com.facebook.appevents.AppEventsConstants;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.C8970a;
import com.google.zxing.common.reedsolomon.C8972c;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.p329s.C8990a;
import com.google.zxing.p335u.C9044b;
import com.google.zxing.p335u.C9047e;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.webservice.C11687c;
import java.util.Arrays;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.AckRequest;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import p053b.p063d.p064b.C2108a;
import p205i.p489f.C14069f;
import p212io.fabric.sdk.android.p493p.p496c.C14282d;

/* renamed from: com.google.zxing.s.d.a */
/* compiled from: Decoder */
public final class C8993a {

    /* renamed from: b */
    private static final String[] f23506b = {"CTRL_PS", C3868i.f12248b, C2108a.f8127Q4, "B", "C", "D", C2108a.f8095M4, "F", C11644i.f33184R6, "H", "I", "J", "K", "L", "M", "N", "O", C11644i.f33192S6, "Q", "R", C2108a.f8087L4, C2108a.f8183X4, "U", C2108a.f8135R4, C2108a.f8103N4, "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c */
    private static final String[] f23507c = {"CTRL_PS", C3868i.f12248b, "a", "b", "c", C2945d.f10439h, "e", "f", "g", XHTMLText.f45021H, "i", "j", "k", "l", "m", "n", "o", XHTMLText.f45024P, XHTMLText.f45025Q, AckRequest.ELEMENT, "s", "t", "u", C11687c.f33838t0, "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d */
    private static final String[] f23508d = {"CTRL_PS", C3868i.f12248b, "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", C14282d.ROLL_OVER_FILE_NAME_SEPARATOR, "`", "|", "~", "", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e */
    private static final String[] f23509e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", C14069f.f41343G, C14069f.f41344H, ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f */
    private static final String[] f23510f = {"CTRL_PS", C3868i.f12248b, AppEventsConstants.EVENT_PARAM_VALUE_NO, "1", "2", C2108a.f8151T4, "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a */
    private C8990a f23511a;

    /* renamed from: com.google.zxing.s.d.a$a */
    /* compiled from: Decoder */
    static /* synthetic */ class C8994a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23512a = new int[C8995b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.google.zxing.s.d.a$b[] r0 = com.google.zxing.p329s.p330d.C8993a.C8995b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23512a = r0
                int[] r0 = f23512a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.zxing.s.d.a$b r1 = com.google.zxing.p329s.p330d.C8993a.C8995b.UPPER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f23512a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.zxing.s.d.a$b r1 = com.google.zxing.p329s.p330d.C8993a.C8995b.LOWER     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f23512a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.google.zxing.s.d.a$b r1 = com.google.zxing.p329s.p330d.C8993a.C8995b.MIXED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f23512a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.google.zxing.s.d.a$b r1 = com.google.zxing.p329s.p330d.C8993a.C8995b.PUNCT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f23512a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.google.zxing.s.d.a$b r1 = com.google.zxing.p329s.p330d.C8993a.C8995b.DIGIT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p329s.p330d.C8993a.C8994a.<clinit>():void");
        }
    }

    /* renamed from: com.google.zxing.s.d.a$b */
    /* compiled from: Decoder */
    private enum C8995b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    /* renamed from: a */
    private static int m42008a(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    /* renamed from: b */
    private boolean[] m42014b(boolean[] zArr) throws FormatException {
        C8970a aVar;
        int i = 8;
        if (this.f23511a.mo32837d() <= 2) {
            i = 6;
            aVar = C8970a.f23456j;
        } else if (this.f23511a.mo32837d() <= 8) {
            aVar = C8970a.f23460n;
        } else if (this.f23511a.mo32837d() <= 22) {
            i = 10;
            aVar = C8970a.f23455i;
        } else {
            i = 12;
            aVar = C8970a.f23454h;
        }
        int c = this.f23511a.mo32836c();
        int length = zArr.length / i;
        if (length >= c) {
            int[] iArr = new int[length];
            int length2 = zArr.length % i;
            int i2 = 0;
            while (i2 < length) {
                iArr[i2] = m42009a(zArr, length2, i);
                i2++;
                length2 += i;
            }
            try {
                new C8972c(aVar).mo32795a(iArr, length - c);
                int i3 = (1 << i) - 1;
                int i4 = 0;
                for (int i5 = 0; i5 < c; i5++) {
                    int i6 = iArr[i5];
                    if (i6 == 0 || i6 == i3) {
                        throw FormatException.m41710a();
                    }
                    if (i6 == 1 || i6 == i3 - 1) {
                        i4++;
                    }
                }
                boolean[] zArr2 = new boolean[((c * i) - i4)];
                int i7 = 0;
                for (int i8 = 0; i8 < c; i8++) {
                    int i9 = iArr[i8];
                    if (i9 == 1 || i9 == i3 - 1) {
                        Arrays.fill(zArr2, i7, (i7 + i) - 1, i9 > 1);
                        i7 += i - 1;
                    } else {
                        int i10 = i - 1;
                        while (i10 >= 0) {
                            int i11 = i7 + 1;
                            zArr2[i7] = ((1 << i10) & i9) != 0;
                            i10--;
                            i7 = i11;
                        }
                    }
                }
                return zArr2;
            } catch (ReedSolomonException e) {
                throw FormatException.m41711a(e);
            }
        } else {
            throw FormatException.m41710a();
        }
    }

    /* renamed from: c */
    private static String m42015c(boolean[] zArr) {
        int length = zArr.length;
        C8995b bVar = C8995b.UPPER;
        StringBuilder sb = new StringBuilder(20);
        C8995b bVar2 = bVar;
        C8995b bVar3 = bVar2;
        int i = 0;
        while (i < length) {
            if (bVar2 == C8995b.BINARY) {
                if (length - i < 5) {
                    break;
                }
                int a = m42009a(zArr, i, 5);
                int i2 = i + 5;
                if (a == 0) {
                    if (length - i2 < 11) {
                        break;
                    }
                    a = m42009a(zArr, i2, 11) + 31;
                    i2 += 11;
                }
                int i3 = i2;
                int i4 = 0;
                while (true) {
                    if (i4 >= a) {
                        i = i3;
                        break;
                    } else if (length - i3 < 8) {
                        i = length;
                        break;
                    } else {
                        sb.append((char) m42009a(zArr, i3, 8));
                        i3 += 8;
                        i4++;
                    }
                }
            } else {
                int i5 = bVar2 == C8995b.DIGIT ? 4 : 5;
                if (length - i < i5) {
                    break;
                }
                int a2 = m42009a(zArr, i, i5);
                i += i5;
                String a3 = m42011a(bVar2, a2);
                if (a3.startsWith("CTRL_")) {
                    bVar3 = m42010a(a3.charAt(5));
                    if (a3.charAt(6) != 'L') {
                        C8995b bVar4 = bVar3;
                        bVar3 = bVar2;
                        bVar2 = bVar4;
                    }
                } else {
                    sb.append(a3);
                }
            }
            bVar2 = bVar3;
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static String m42016d(boolean[] zArr) {
        return m42015c(zArr);
    }

    /* renamed from: a */
    public C9047e mo32839a(C8990a aVar) throws FormatException {
        this.f23511a = aVar;
        boolean[] b = m42014b(m42013a(aVar.mo33031a()));
        C9047e eVar = new C9047e(m42012a(b), m42015c(b), null, null);
        eVar.mo33015a(b.length);
        return eVar;
    }

    /* renamed from: a */
    private static C8995b m42010a(char c) {
        if (c == 'B') {
            return C8995b.BINARY;
        }
        if (c == 'D') {
            return C8995b.DIGIT;
        }
        if (c == 'P') {
            return C8995b.PUNCT;
        }
        if (c == 'L') {
            return C8995b.LOWER;
        }
        if (c != 'M') {
            return C8995b.UPPER;
        }
        return C8995b.MIXED;
    }

    /* renamed from: a */
    private static String m42011a(C8995b bVar, int i) {
        int i2 = C8994a.f23512a[bVar.ordinal()];
        if (i2 == 1) {
            return f23506b[i];
        }
        if (i2 == 2) {
            return f23507c[i];
        }
        if (i2 == 3) {
            return f23508d[i];
        }
        if (i2 == 4) {
            return f23509e[i];
        }
        if (i2 == 5) {
            return f23510f[i];
        }
        throw new IllegalStateException("Bad table");
    }

    /* renamed from: a */
    private boolean[] m42013a(C9044b bVar) {
        C9044b bVar2 = bVar;
        boolean e = this.f23511a.mo32838e();
        int d = this.f23511a.mo32837d();
        int i = (e ? 11 : 14) + (d << 2);
        int[] iArr = new int[i];
        boolean[] zArr = new boolean[m42008a(d, e)];
        int i2 = 2;
        if (e) {
            for (int i3 = 0; i3 < iArr.length; i3++) {
                iArr[i3] = i3;
            }
        } else {
            int i4 = i / 2;
            int i5 = ((i + 1) + (((i4 - 1) / 15) * 2)) / 2;
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = (i6 / 15) + i6;
                iArr[(i4 - i6) - 1] = (i5 - i7) - 1;
                iArr[i4 + i6] = i7 + i5 + 1;
            }
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < d) {
            int i10 = ((d - i8) << i2) + (e ? 9 : 12);
            int i11 = i8 << 1;
            int i12 = (i - 1) - i11;
            int i13 = 0;
            while (i13 < i10) {
                int i14 = i13 << 1;
                int i15 = 0;
                while (i15 < i2) {
                    int i16 = i11 + i15;
                    int i17 = i11 + i13;
                    zArr[i9 + i14 + i15] = bVar2.mo32995b(iArr[i16], iArr[i17]);
                    int i18 = (i10 * 2) + i9 + i14 + i15;
                    int i19 = iArr[i17];
                    int i20 = i12 - i15;
                    boolean z = e;
                    zArr[i18] = bVar2.mo32995b(i19, iArr[i20]);
                    int i21 = (i10 * 4) + i9 + i14 + i15;
                    int i22 = iArr[i20];
                    int i23 = i12 - i13;
                    int i24 = d;
                    zArr[i21] = bVar2.mo32995b(i22, iArr[i23]);
                    zArr[(i10 * 6) + i9 + i14 + i15] = bVar2.mo32995b(iArr[i23], iArr[i16]);
                    i15++;
                    d = i24;
                    e = z;
                    i2 = 2;
                }
                boolean z2 = e;
                int i25 = d;
                i13++;
                i2 = 2;
            }
            boolean z3 = e;
            int i26 = d;
            i9 += i10 << 3;
            i8++;
            i2 = 2;
        }
        return zArr;
    }

    /* renamed from: a */
    private static int m42009a(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    /* renamed from: a */
    private static byte m42007a(boolean[] zArr, int i) {
        int a;
        int length = zArr.length - i;
        if (length >= 8) {
            a = m42009a(zArr, i, 8);
        } else {
            a = m42009a(zArr, i, length) << (8 - length);
        }
        return (byte) a;
    }

    /* renamed from: a */
    static byte[] m42012a(boolean[] zArr) {
        byte[] bArr = new byte[((zArr.length + 7) / 8)];
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = m42007a(zArr, i << 3);
        }
        return bArr;
    }
}
