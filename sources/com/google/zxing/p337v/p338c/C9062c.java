package com.google.zxing.p337v.p338c;

import androidx.recyclerview.widget.C1744m.C1750f;
import com.google.common.base.C5785c;
import com.google.zxing.FormatException;
import com.google.zxing.p335u.C9045c;
import com.google.zxing.p335u.C9047e;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.p217i1.C14662d0;
import org.jcodec.codecs.mjpeg.JpegConst;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.google.zxing.v.c.c */
/* compiled from: DecodedBitStreamParser */
final class C9062c {

    /* renamed from: a */
    private static final char[] f23729a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: b */
    private static final char[] f23730b = {'!', C14662d0.f42850a, '#', C14662d0.f42851b, '%', C14662d0.f42852c, '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', C14662d0.f42853d, '=', C14662d0.f42854e, '?', '@', '[', '\\', ']', '^', '_'};

    /* renamed from: c */
    private static final char[] f23731c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: d */
    private static final char[] f23732d = f23730b;

    /* renamed from: e */
    private static final char[] f23733e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', C5785c.f16681N};

    /* renamed from: com.google.zxing.v.c.c$a */
    /* compiled from: DecodedBitStreamParser */
    static /* synthetic */ class C9063a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23734a = new int[C9064b.values().length];

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
                com.google.zxing.v.c.c$b[] r0 = com.google.zxing.p337v.p338c.C9062c.C9064b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23734a = r0
                int[] r0 = f23734a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.zxing.v.c.c$b r1 = com.google.zxing.p337v.p338c.C9062c.C9064b.C40_ENCODE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f23734a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.zxing.v.c.c$b r1 = com.google.zxing.p337v.p338c.C9062c.C9064b.TEXT_ENCODE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f23734a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.google.zxing.v.c.c$b r1 = com.google.zxing.p337v.p338c.C9062c.C9064b.ANSIX12_ENCODE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f23734a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.google.zxing.v.c.c$b r1 = com.google.zxing.p337v.p338c.C9062c.C9064b.EDIFACT_ENCODE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f23734a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.google.zxing.v.c.c$b r1 = com.google.zxing.p337v.p338c.C9062c.C9064b.BASE256_ENCODE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p337v.p338c.C9062c.C9063a.<clinit>():void");
        }
    }

    /* renamed from: com.google.zxing.v.c.c$b */
    /* compiled from: DecodedBitStreamParser */
    private enum C9064b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    private C9062c() {
    }

    /* renamed from: a */
    static C9047e m42401a(byte[] bArr) throws FormatException {
        C9045c cVar = new C9045c(bArr);
        StringBuilder sb = new StringBuilder(100);
        StringBuilder sb2 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        C9064b bVar = C9064b.ASCII_ENCODE;
        do {
            if (bVar == C9064b.ASCII_ENCODE) {
                bVar = m42402a(cVar, sb, sb2);
            } else {
                int i = C9063a.f23734a[bVar.ordinal()];
                if (i == 1) {
                    m42406b(cVar, sb);
                } else if (i == 2) {
                    m42408d(cVar, sb);
                } else if (i == 3) {
                    m42404a(cVar, sb);
                } else if (i == 4) {
                    m42407c(cVar, sb);
                } else if (i == 5) {
                    m42405a(cVar, sb, (Collection<byte[]>) arrayList);
                } else {
                    throw FormatException.m41710a();
                }
                bVar = C9064b.ASCII_ENCODE;
            }
            if (bVar == C9064b.PAD_ENCODE) {
                break;
            }
        } while (cVar.mo33009a() > 0);
        if (sb2.length() > 0) {
            sb.append(sb2);
        }
        String sb3 = sb.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new C9047e(bArr, sb3, arrayList, null);
    }

    /* renamed from: b */
    private static void m42406b(C9045c cVar, StringBuilder sb) throws FormatException {
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (cVar.mo33009a() != 8) {
            int a = cVar.mo33010a(8);
            if (a != 254) {
                m42403a(a, cVar.mo33010a(8), iArr);
                boolean z2 = z;
                for (int i2 = 0; i2 < 3; i2++) {
                    int i3 = iArr[i2];
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                char[] cArr = f23730b;
                                if (i3 < cArr.length) {
                                    char c = cArr[i3];
                                    if (z2) {
                                        sb.append((char) (c + 128));
                                    } else {
                                        sb.append(c);
                                    }
                                } else if (i3 == 27) {
                                    sb.append(29);
                                } else if (i3 == 30) {
                                    z2 = true;
                                } else {
                                    throw FormatException.m41710a();
                                }
                                i = 0;
                            } else if (i != 3) {
                                throw FormatException.m41710a();
                            } else if (z2) {
                                sb.append((char) (i3 + JpegConst.APP0));
                            } else {
                                sb.append((char) (i3 + 96));
                                i = 0;
                            }
                        } else if (z2) {
                            sb.append((char) (i3 + 128));
                        } else {
                            sb.append((char) i3);
                            i = 0;
                        }
                        z2 = false;
                        i = 0;
                    } else if (i3 < 3) {
                        i = i3 + 1;
                    } else {
                        char[] cArr2 = f23729a;
                        if (i3 < cArr2.length) {
                            char c2 = cArr2[i3];
                            if (z2) {
                                sb.append((char) (c2 + 128));
                                z2 = false;
                            } else {
                                sb.append(c2);
                            }
                        } else {
                            throw FormatException.m41710a();
                        }
                    }
                }
                if (cVar.mo33009a() > 0) {
                    z = z2;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    private static void m42407c(C9045c cVar, StringBuilder sb) {
        while (cVar.mo33009a() > 16) {
            for (int i = 0; i < 4; i++) {
                int a = cVar.mo33010a(6);
                if (a == 31) {
                    int b = 8 - cVar.mo33011b();
                    if (b != 8) {
                        cVar.mo33010a(b);
                    }
                    return;
                }
                if ((a & 32) == 0) {
                    a |= 64;
                }
                sb.append((char) a);
            }
            if (cVar.mo33009a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: d */
    private static void m42408d(C9045c cVar, StringBuilder sb) throws FormatException {
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (cVar.mo33009a() != 8) {
            int a = cVar.mo33010a(8);
            if (a != 254) {
                m42403a(a, cVar.mo33010a(8), iArr);
                boolean z2 = z;
                for (int i2 = 0; i2 < 3; i2++) {
                    int i3 = iArr[i2];
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                char[] cArr = f23732d;
                                if (i3 < cArr.length) {
                                    char c = cArr[i3];
                                    if (z2) {
                                        sb.append((char) (c + 128));
                                    } else {
                                        sb.append(c);
                                    }
                                } else if (i3 == 27) {
                                    sb.append(29);
                                } else if (i3 == 30) {
                                    z2 = true;
                                } else {
                                    throw FormatException.m41710a();
                                }
                                i = 0;
                            } else if (i == 3) {
                                char[] cArr2 = f23733e;
                                if (i3 < cArr2.length) {
                                    char c2 = cArr2[i3];
                                    if (z2) {
                                        sb.append((char) (c2 + 128));
                                    } else {
                                        sb.append(c2);
                                        i = 0;
                                    }
                                } else {
                                    throw FormatException.m41710a();
                                }
                            } else {
                                throw FormatException.m41710a();
                            }
                        } else if (z2) {
                            sb.append((char) (i3 + 128));
                        } else {
                            sb.append((char) i3);
                            i = 0;
                        }
                        z2 = false;
                        i = 0;
                    } else if (i3 < 3) {
                        i = i3 + 1;
                    } else {
                        char[] cArr3 = f23731c;
                        if (i3 < cArr3.length) {
                            char c3 = cArr3[i3];
                            if (z2) {
                                sb.append((char) (c3 + 128));
                                z2 = false;
                            } else {
                                sb.append(c3);
                            }
                        } else {
                            throw FormatException.m41710a();
                        }
                    }
                }
                if (cVar.mo33009a() > 0) {
                    z = z2;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static C9064b m42402a(C9045c cVar, StringBuilder sb, StringBuilder sb2) throws FormatException {
        boolean z = false;
        do {
            int a = cVar.mo33010a(8);
            if (a == 0) {
                throw FormatException.m41710a();
            } else if (a <= 128) {
                if (z) {
                    a += 128;
                }
                sb.append((char) (a - 1));
                return C9064b.ASCII_ENCODE;
            } else if (a == 129) {
                return C9064b.PAD_ENCODE;
            } else {
                if (a <= 229) {
                    int i = a - 130;
                    if (i < 10) {
                        sb.append('0');
                    }
                    sb.append(i);
                } else if (a == 230) {
                    return C9064b.C40_ENCODE;
                } else {
                    if (a == 231) {
                        return C9064b.BASE256_ENCODE;
                    }
                    if (a == 232) {
                        sb.append(29);
                    } else if (!(a == 233 || a == 234)) {
                        if (a == 235) {
                            z = true;
                        } else {
                            String str = "\u001e\u0004";
                            if (a == 236) {
                                sb.append("[)>\u001e05\u001d");
                                sb2.insert(0, str);
                            } else if (a == 237) {
                                sb.append("[)>\u001e06\u001d");
                                sb2.insert(0, str);
                            } else if (a == 238) {
                                return C9064b.ANSIX12_ENCODE;
                            } else {
                                if (a == 239) {
                                    return C9064b.TEXT_ENCODE;
                                }
                                if (a == 240) {
                                    return C9064b.EDIFACT_ENCODE;
                                }
                                if (!(a == 241 || a < 242 || (a == 254 && cVar.mo33009a() == 0))) {
                                    throw FormatException.m41710a();
                                }
                            }
                        }
                    }
                }
            }
        } while (cVar.mo33009a() > 0);
        return C9064b.ASCII_ENCODE;
    }

    /* renamed from: a */
    private static void m42404a(C9045c cVar, StringBuilder sb) throws FormatException {
        int[] iArr = new int[3];
        while (cVar.mo33009a() != 8) {
            int a = cVar.mo33010a(8);
            if (a != 254) {
                m42403a(a, cVar.mo33010a(8), iArr);
                for (int i = 0; i < 3; i++) {
                    int i2 = iArr[i];
                    if (i2 == 0) {
                        sb.append(13);
                    } else if (i2 == 1) {
                        sb.append('*');
                    } else if (i2 == 2) {
                        sb.append(C14662d0.f42854e);
                    } else if (i2 == 3) {
                        sb.append(' ');
                    } else if (i2 < 14) {
                        sb.append((char) (i2 + 44));
                    } else if (i2 < 40) {
                        sb.append((char) (i2 + 51));
                    } else {
                        throw FormatException.m41710a();
                    }
                }
                if (cVar.mo33009a() <= 0) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m42403a(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    /* renamed from: a */
    private static void m42405a(C9045c cVar, StringBuilder sb, Collection<byte[]> collection) throws FormatException {
        int c = cVar.mo33012c() + 1;
        int i = c + 1;
        int a = m42400a(cVar.mo33010a(8), c);
        if (a == 0) {
            a = cVar.mo33009a() / 8;
        } else if (a >= 250) {
            a = ((a - 249) * C1750f.f6813c) + m42400a(cVar.mo33010a(8), i);
            i++;
        }
        if (a >= 0) {
            byte[] bArr = new byte[a];
            int i2 = 0;
            while (i2 < a) {
                if (cVar.mo33009a() >= 8) {
                    int i3 = i + 1;
                    bArr[i2] = (byte) m42400a(cVar.mo33010a(8), i);
                    i2++;
                    i = i3;
                } else {
                    throw FormatException.m41710a();
                }
            }
            collection.add(bArr);
            try {
                sb.append(new String(bArr, "ISO8859_1"));
            } catch (UnsupportedEncodingException e) {
                StringBuilder sb2 = new StringBuilder("Platform does not support required encoding: ");
                sb2.append(e);
                throw new IllegalStateException(sb2.toString());
            }
        } else {
            throw FormatException.m41710a();
        }
    }

    /* renamed from: a */
    private static int m42400a(int i, int i2) {
        int i3 = i - (((i2 * C13959t.f40925l2) % 255) + 1);
        return i3 >= 0 ? i3 : i3 + 256;
    }
}
