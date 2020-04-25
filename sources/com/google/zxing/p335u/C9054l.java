package com.google.zxing.p335u;

import com.google.zxing.C8974d;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: com.google.zxing.u.l */
/* compiled from: StringUtils */
public final class C9054l {

    /* renamed from: a */
    private static final String f23704a = Charset.defaultCharset().name();

    /* renamed from: b */
    public static final String f23705b = "SJIS";

    /* renamed from: c */
    public static final String f23706c = "GB2312";

    /* renamed from: d */
    private static final String f23707d = "EUC_JP";

    /* renamed from: e */
    private static final String f23708e = "UTF8";

    /* renamed from: f */
    private static final String f23709f = "ISO8859_1";

    /* renamed from: g */
    private static final boolean f23710g;

    static {
        boolean z;
        if (!f23705b.equalsIgnoreCase(f23704a)) {
            if (!f23707d.equalsIgnoreCase(f23704a)) {
                z = false;
                f23710g = z;
            }
        }
        z = true;
        f23710g = z;
    }

    private C9054l() {
    }

    /* renamed from: a */
    public static String m42367a(byte[] bArr, Map<C8974d, ?> map) {
        byte[] bArr2 = bArr;
        Map<C8974d, ?> map2 = map;
        if (map2 != null && map2.containsKey(C8974d.CHARACTER_SET)) {
            return map2.get(C8974d.CHARACTER_SET).toString();
        }
        int length = bArr2.length;
        int i = 0;
        boolean z = bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i3 < length && (z2 || z3 || z4)) {
            byte b = bArr2[i3] & 255;
            if (z4) {
                if (i4 > 0) {
                    if ((b & 128) != 0) {
                        i4--;
                    }
                } else if ((b & 128) != 0) {
                    if ((b & 64) != 0) {
                        i4++;
                        if ((b & 32) == 0) {
                            i6++;
                        } else {
                            i4++;
                            if ((b & 16) == 0) {
                                i7++;
                            } else {
                                i4++;
                                if ((b & 8) == 0) {
                                    i8++;
                                }
                            }
                        }
                    }
                }
                z4 = false;
            }
            if (z2) {
                if (b > Byte.MAX_VALUE && b < 160) {
                    z2 = false;
                } else if (b > 159 && (b < 192 || b == 215 || b == 247)) {
                    i10++;
                }
            }
            if (z3) {
                if (i5 > 0) {
                    if (b >= 64 && b != Byte.MAX_VALUE && b <= 252) {
                        i5--;
                    }
                } else if (!(b == 128 || b == 160 || b > 239)) {
                    if (b <= 160 || b >= 224) {
                        if (b > Byte.MAX_VALUE) {
                            i5++;
                            int i13 = i11 + 1;
                            if (i13 > i) {
                                i = i13;
                                i11 = i;
                            } else {
                                i11 = i13;
                            }
                        } else {
                            i11 = 0;
                        }
                        i12 = 0;
                    } else {
                        i2++;
                        int i14 = i12 + 1;
                        if (i14 > i9) {
                            i9 = i14;
                            i12 = i9;
                        } else {
                            i12 = i14;
                        }
                        i11 = 0;
                    }
                }
                z3 = false;
            }
            i3++;
            bArr2 = bArr;
        }
        if (z4 && i4 > 0) {
            z4 = false;
        }
        if (z3 && i5 > 0) {
            z3 = false;
        }
        String str = "UTF8";
        if (z4 && (z || i6 + i7 + i8 > 0)) {
            return str;
        }
        String str2 = f23705b;
        if (z3 && (f23710g || i9 >= 3 || i >= 3)) {
            return str2;
        }
        String str3 = f23709f;
        if (z2 && z3) {
            return (!(i9 == 2 && i2 == 2) && i10 * 10 < length) ? str3 : str2;
        }
        if (z2) {
            return str3;
        }
        if (z3) {
            return str2;
        }
        if (z4) {
            return str;
        }
        return f23704a;
    }
}
