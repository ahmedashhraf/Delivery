package com.google.zxing.p337v.p340e;

import com.google.zxing.C8975e;
import java.util.Arrays;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.google.zxing.v.e.j */
/* compiled from: HighLevelEncoder */
public final class C9083j {

    /* renamed from: a */
    private static final char f23771a = '';

    /* renamed from: b */
    static final char f23772b = 'æ';

    /* renamed from: c */
    static final char f23773c = 'ç';

    /* renamed from: d */
    static final char f23774d = 'ë';

    /* renamed from: e */
    private static final char f23775e = 'ì';

    /* renamed from: f */
    private static final char f23776f = 'í';

    /* renamed from: g */
    static final char f23777g = 'î';

    /* renamed from: h */
    static final char f23778h = 'ï';

    /* renamed from: i */
    static final char f23779i = 'ð';

    /* renamed from: j */
    static final char f23780j = 'þ';

    /* renamed from: k */
    static final char f23781k = 'þ';

    /* renamed from: l */
    private static final String f23782l = "[)>\u001e05\u001d";

    /* renamed from: m */
    private static final String f23783m = "[)>\u001e06\u001d";

    /* renamed from: n */
    private static final String f23784n = "\u001e\u0004";

    /* renamed from: o */
    static final int f23785o = 0;

    /* renamed from: p */
    static final int f23786p = 1;

    /* renamed from: q */
    static final int f23787q = 2;

    /* renamed from: r */
    static final int f23788r = 3;

    /* renamed from: s */
    static final int f23789s = 4;

    /* renamed from: t */
    static final int f23790t = 5;

    private C9083j() {
    }

    /* renamed from: a */
    private static char m42495a(char c, int i) {
        int i2 = c + ((i * C13959t.f40925l2) % 253) + 1;
        if (i2 > 254) {
            i2 -= 254;
        }
        return (char) i2;
    }

    /* renamed from: b */
    static boolean m42503b(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: c */
    static boolean m42504c(char c) {
        return c >= 128 && c <= 255;
    }

    /* renamed from: d */
    private static boolean m42505d(char c) {
        return c == ' ' || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z');
    }

    /* renamed from: e */
    private static boolean m42506e(char c) {
        return c >= ' ' && c <= '^';
    }

    /* renamed from: f */
    private static boolean m42507f(char c) {
        return c == ' ' || (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z');
    }

    /* renamed from: g */
    private static boolean m42508g(char c) {
        return m42510i(c) || c == ' ' || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z');
    }

    /* renamed from: h */
    private static boolean m42509h(char c) {
        return false;
    }

    /* renamed from: i */
    private static boolean m42510i(char c) {
        return c == 13 || c == '*' || c == '>';
    }

    /* renamed from: a */
    public static String m42500a(String str) {
        return m42501a(str, C9085l.FORCE_NONE, (C8975e) null, (C8975e) null);
    }

    /* renamed from: a */
    public static String m42501a(String str, C9085l lVar, C8975e eVar, C8975e eVar2) {
        int i = 0;
        C9080g[] gVarArr = {new C9074a(), new C9076c(), new C9086m(), new C9087n(), new C9079f(), new C9075b()};
        C9081h hVar = new C9081h(str);
        hVar.mo33079a(lVar);
        hVar.mo33078a(eVar, eVar2);
        boolean startsWith = str.startsWith(f23782l);
        String str2 = f23784n;
        if (startsWith && str.endsWith(str2)) {
            hVar.mo33076a((char) f23775e);
            hVar.mo33077a(2);
            hVar.f23762f += 7;
        } else if (str.startsWith(f23783m) && str.endsWith(str2)) {
            hVar.mo33076a((char) f23776f);
            hVar.mo33077a(2);
            hVar.f23762f += 7;
        }
        while (hVar.mo33090i()) {
            gVarArr[i].mo33065a(hVar);
            if (hVar.mo33087f() >= 0) {
                i = hVar.mo33087f();
                hVar.mo33091j();
            }
        }
        int a = hVar.mo33075a();
        hVar.mo33093l();
        int b = hVar.mo33089h().mo33095b();
        if (!(a >= b || i == 0 || i == 5)) {
            hVar.mo33076a(254);
        }
        StringBuilder b2 = hVar.mo33081b();
        if (b2.length() < b) {
            b2.append(f23771a);
        }
        while (b2.length() < b) {
            b2.append(m42495a((char) f23771a, b2.length() + 1));
        }
        return hVar.mo33081b().toString();
    }

    /* renamed from: a */
    static int m42497a(CharSequence charSequence, int i, int i2) {
        float[] fArr;
        char c;
        CharSequence charSequence2 = charSequence;
        int i3 = i;
        if (i3 >= charSequence.length()) {
            return i2;
        }
        if (i2 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i2] = 0.0f;
        }
        int i4 = 0;
        while (true) {
            int i5 = i3 + i4;
            if (i5 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int a = m42499a(fArr, iArr, Integer.MAX_VALUE, bArr);
                int a2 = m42498a(bArr);
                if (iArr[0] == a) {
                    return 0;
                }
                if (a2 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (a2 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (a2 != 1 || bArr[2] <= 0) {
                    return (a2 != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char charAt = charSequence2.charAt(i5);
            i4++;
            if (m42503b(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (m42504c(charAt)) {
                fArr[0] = (float) Math.ceil((double) fArr[0]);
                fArr[0] = fArr[0] + 2.0f;
            } else {
                fArr[0] = (float) Math.ceil((double) fArr[0]);
                fArr[0] = fArr[0] + 1.0f;
            }
            if (m42505d(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (m42504c(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (m42507f(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (m42504c(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (m42508g(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (m42504c(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (m42506e(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (m42504c(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (m42509h(charAt)) {
                c = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i4 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                m42499a(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int a3 = m42498a(bArr2);
                if (iArr2[0] < iArr2[c] && iArr2[0] < iArr2[1] && iArr2[0] < iArr2[2] && iArr2[0] < iArr2[3] && iArr2[0] < iArr2[4]) {
                    return 0;
                }
                if (iArr2[5] >= iArr2[0] && bArr2[1] + bArr2[2] + bArr2[3] + bArr2[4] != 0) {
                    if (a3 == 1 && bArr2[4] > 0) {
                        return 4;
                    }
                    if (a3 == 1 && bArr2[2] > 0) {
                        return 2;
                    }
                    if (a3 == 1 && bArr2[3] > 0) {
                        return 3;
                    }
                    if (iArr2[1] + 1 < iArr2[0] && iArr2[1] + 1 < iArr2[5] && iArr2[1] + 1 < iArr2[4] && iArr2[1] + 1 < iArr2[2]) {
                        if (iArr2[1] < iArr2[3]) {
                            return 1;
                        }
                        if (iArr2[1] == iArr2[3]) {
                            int i6 = i3 + i4 + 1;
                            while (i6 < charSequence.length()) {
                                char charAt2 = charSequence2.charAt(i6);
                                if (!m42510i(charAt2)) {
                                    if (!m42508g(charAt2)) {
                                        break;
                                    }
                                    i6++;
                                } else {
                                    return 3;
                                }
                            }
                            return 1;
                        }
                    }
                }
            }
        }
        return 5;
    }

    /* renamed from: a */
    private static int m42499a(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, 0);
        int i2 = i;
        for (int i3 = 0; i3 < 6; i3++) {
            iArr[i3] = (int) Math.ceil((double) fArr[i3]);
            int i4 = iArr[i3];
            if (i2 > i4) {
                Arrays.fill(bArr, 0);
                i2 = i4;
            }
            if (i2 == i4) {
                bArr[i3] = (byte) (bArr[i3] + 1);
            }
        }
        return i2;
    }

    /* renamed from: a */
    private static int m42498a(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    /* renamed from: a */
    public static int m42496a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (m42503b(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* renamed from: a */
    static void m42502a(char c) {
        String hexString = Integer.toHexString(c);
        StringBuilder sb = new StringBuilder();
        sb.append("0000".substring(0, 4 - hexString.length()));
        sb.append(hexString);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("Illegal character: ");
        sb3.append(c);
        sb3.append(" (0x");
        sb3.append(sb2);
        sb3.append(')');
        throw new IllegalArgumentException(sb3.toString());
    }
}
