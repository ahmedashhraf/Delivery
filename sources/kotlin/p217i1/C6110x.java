package kotlin.p217i1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.C6096e0;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

/* renamed from: kotlin.i1.x */
/* compiled from: StringNumberConversions.kt */
class C6110x extends C6109w {
    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: a */
    private static final String m27835a(byte b, int i) {
        String num = Integer.toString(b, C14661d.m63537a(C14661d.m63537a(i)));
        C14445h0.m62453a((Object) num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        return num;
    }

    @C6096e0(version = "1.2")
    @C6004e
    /* renamed from: b */
    public static final BigInteger m27844b(@C6003d String str, int i) {
        C14445h0.m62478f(str, "$receiver");
        C14661d.m63537a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        if (length != 1) {
            if (str.charAt(0) == '-') {
                i2 = 1;
            }
            while (i2 < length) {
                if (C14661d.m63536a(str.charAt(i2), i) < 0) {
                    return null;
                }
                i2++;
            }
        } else if (C14661d.m63536a(str.charAt(0), i) < 0) {
            return null;
        }
        return new BigInteger(str, C14661d.m63537a(i));
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: c */
    private static final byte m27845c(@C6003d String str, int i) {
        return Byte.parseByte(str, C14661d.m63537a(i));
    }

    @C6096e0(version = "1.1")
    @C6004e
    /* renamed from: d */
    public static final Byte m27846d(@C6003d String str, int i) {
        C14445h0.m62478f(str, "$receiver");
        Integer f = m27850f(str, i);
        if (f != null) {
            int intValue = f.intValue();
            if (intValue >= -128 && intValue <= 127) {
                return Byte.valueOf((byte) intValue);
            }
        }
        return null;
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: e */
    private static final int m27848e(@C6003d String str, int i) {
        return Integer.parseInt(str, C14661d.m63537a(i));
    }

    @C6041f
    /* renamed from: f */
    private static final boolean m27851f(@C6003d String str) {
        return Boolean.parseBoolean(str);
    }

    @C6041f
    /* renamed from: g */
    private static final byte m27852g(@C6003d String str) {
        return Byte.parseByte(str);
    }

    @C6096e0(version = "1.1")
    @C6004e
    /* renamed from: h */
    public static final Byte m27854h(@C6003d String str) {
        C14445h0.m62478f(str, "$receiver");
        return m27846d(str, 10);
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: i */
    private static final short m27857i(@C6003d String str, int i) {
        return Short.parseShort(str, C14661d.m63537a(i));
    }

    @C6096e0(version = "1.1")
    @C6004e
    /* renamed from: j */
    public static final Short m27859j(@C6003d String str, int i) {
        C14445h0.m62478f(str, "$receiver");
        Integer f = m27850f(str, i);
        if (f != null) {
            int intValue = f.intValue();
            if (intValue >= -32768 && intValue <= 32767) {
                return Short.valueOf((short) intValue);
            }
        }
        return null;
    }

    @C6041f
    /* renamed from: k */
    private static final float m27860k(@C6003d String str) {
        return Float.parseFloat(str);
    }

    @C6096e0(version = "1.1")
    @C6004e
    /* renamed from: l */
    public static final Float m27861l(@C6003d String str) {
        C14445h0.m62478f(str, "$receiver");
        try {
            if (C14689r.f42919a.mo45927c(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @C6041f
    /* renamed from: m */
    private static final int m27862m(@C6003d String str) {
        return Integer.parseInt(str);
    }

    @C6096e0(version = "1.1")
    @C6004e
    /* renamed from: n */
    public static final Integer m27863n(@C6003d String str) {
        C14445h0.m62478f(str, "$receiver");
        return m27850f(str, 10);
    }

    @C6041f
    /* renamed from: o */
    private static final long m27864o(@C6003d String str) {
        return Long.parseLong(str);
    }

    @C6096e0(version = "1.1")
    @C6004e
    /* renamed from: p */
    public static final Long m27865p(@C6003d String str) {
        C14445h0.m62478f(str, "$receiver");
        return m27855h(str, 10);
    }

    @C6041f
    /* renamed from: q */
    private static final short m27866q(@C6003d String str) {
        return Short.parseShort(str);
    }

    @C6096e0(version = "1.1")
    @C6004e
    /* renamed from: r */
    public static final Short m27867r(@C6003d String str) {
        C14445h0.m62478f(str, "$receiver");
        return m27859j(str, 10);
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: a */
    private static final String m27838a(short s, int i) {
        String num = Integer.toString(s, C14661d.m63537a(C14661d.m63537a(i)));
        C14445h0.m62453a((Object) num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        return num;
    }

    @C6096e0(version = "1.2")
    @C6004e
    /* renamed from: e */
    public static final BigInteger m27849e(@C6003d String str) {
        C14445h0.m62478f(str, "$receiver");
        return m27844b(str, 10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037 A[LOOP:0: B:18:0x0037->B:28:0x004f, LOOP_START, PHI: r2 r3 
      PHI: (r2v2 int) = (r2v0 int), (r2v4 int) binds: [B:17:0x0035, B:28:0x004f] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:17:0x0035, B:28:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0059  */
    @kotlin.C6096e0(version = "1.1")
    @p205i.p209c.p210a.C6004e
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Integer m27850f(@p205i.p209c.p210a.C6003d java.lang.String r9, int r10) {
        /*
            java.lang.String r0 = "$receiver"
            kotlin.p214b1.p216u.C14445h0.m62478f(r9, r0)
            kotlin.p217i1.C14661d.m63537a(r10)
            int r0 = r9.length()
            r1 = 0
            if (r0 != 0) goto L_0x0010
            return r1
        L_0x0010:
            r2 = 0
            char r3 = r9.charAt(r2)
            r4 = 48
            r5 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r6 = 1
            if (r3 >= r4) goto L_0x0030
            if (r0 != r6) goto L_0x0020
            return r1
        L_0x0020:
            r4 = 45
            if (r3 != r4) goto L_0x0029
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1
            r4 = 1
            goto L_0x0032
        L_0x0029:
            r4 = 43
            if (r3 != r4) goto L_0x002f
            r3 = 1
            goto L_0x0031
        L_0x002f:
            return r1
        L_0x0030:
            r3 = 0
        L_0x0031:
            r4 = 0
        L_0x0032:
            int r7 = r5 / r10
            int r0 = r0 - r6
            if (r3 > r0) goto L_0x0052
        L_0x0037:
            char r6 = r9.charAt(r3)
            int r6 = kotlin.p217i1.C14661d.m63536a(r6, r10)
            if (r6 >= 0) goto L_0x0042
            return r1
        L_0x0042:
            if (r2 >= r7) goto L_0x0045
            return r1
        L_0x0045:
            int r2 = r2 * r10
            int r8 = r5 + r6
            if (r2 >= r8) goto L_0x004c
            return r1
        L_0x004c:
            int r2 = r2 - r6
            if (r3 == r0) goto L_0x0052
            int r3 = r3 + 1
            goto L_0x0037
        L_0x0052:
            if (r4 == 0) goto L_0x0059
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            goto L_0x005e
        L_0x0059:
            int r9 = -r2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
        L_0x005e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p217i1.C6110x.m27850f(java.lang.String, int):java.lang.Integer");
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: g */
    private static final long m27853g(@C6003d String str, int i) {
        return Long.parseLong(str, C14661d.m63537a(i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f A[LOOP:0: B:17:0x003f->B:29:0x0062, LOOP_START, PHI: r3 r4 r14 
      PHI: (r3v1 java.lang.Long) = (r3v0 java.lang.Long), (r3v3 java.lang.Long) binds: [B:16:0x003d, B:29:0x0062] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v2 int) = (r4v1 int), (r4v4 int) binds: [B:16:0x003d, B:29:0x0062] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r14v2 long) = (r14v0 long), (r14v4 long) binds: [B:16:0x003d, B:29:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
    @kotlin.C6096e0(version = "1.1")
    @p205i.p209c.p210a.C6004e
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Long m27855h(@p205i.p209c.p210a.C6003d java.lang.String r19, int r20) {
        /*
            r0 = r19
            r1 = r20
            java.lang.String r2 = "$receiver"
            kotlin.p214b1.p216u.C14445h0.m62478f(r0, r2)
            kotlin.p217i1.C14661d.m63537a(r20)
            int r2 = r19.length()
            r3 = 0
            if (r2 != 0) goto L_0x0014
            return r3
        L_0x0014:
            r4 = 0
            char r5 = r0.charAt(r4)
            r6 = 48
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 1
            if (r5 >= r6) goto L_0x0036
            if (r2 != r9) goto L_0x0026
            return r3
        L_0x0026:
            r6 = 45
            if (r5 != r6) goto L_0x002f
            r7 = -9223372036854775808
            r4 = 1
            r5 = 1
            goto L_0x0037
        L_0x002f:
            r6 = 43
            if (r5 != r6) goto L_0x0035
            r4 = 1
            goto L_0x0036
        L_0x0035:
            return r3
        L_0x0036:
            r5 = 0
        L_0x0037:
            long r10 = (long) r1
            long r12 = r7 / r10
            r14 = 0
            int r2 = r2 - r9
            if (r4 > r2) goto L_0x0066
        L_0x003f:
            char r6 = r0.charAt(r4)
            int r6 = kotlin.p217i1.C14661d.m63536a(r6, r1)
            if (r6 >= 0) goto L_0x004a
            return r3
        L_0x004a:
            int r9 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r9 >= 0) goto L_0x004f
            return r3
        L_0x004f:
            long r14 = r14 * r10
            r16 = r4
            long r3 = (long) r6
            long r17 = r7 + r3
            int r6 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r6 >= 0) goto L_0x005c
            r6 = 0
            return r6
        L_0x005c:
            r6 = 0
            long r14 = r14 - r3
            r4 = r16
            if (r4 == r2) goto L_0x0066
            int r4 = r4 + 1
            r3 = r6
            goto L_0x003f
        L_0x0066:
            if (r5 == 0) goto L_0x006d
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            goto L_0x0072
        L_0x006d:
            long r0 = -r14
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0072:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p217i1.C6110x.m27855h(java.lang.String, int):java.lang.Long");
    }

    @C6041f
    /* renamed from: i */
    private static final double m27856i(@C6003d String str) {
        return Double.parseDouble(str);
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: a */
    private static final String m27836a(int i, int i2) {
        String num = Integer.toString(i, C14661d.m63537a(i2));
        C14445h0.m62453a((Object) num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        return num;
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: d */
    private static final BigInteger m27847d(@C6003d String str) {
        return new BigInteger(str);
    }

    @C6096e0(version = "1.1")
    @C6004e
    /* renamed from: j */
    public static final Double m27858j(@C6003d String str) {
        C14445h0.m62478f(str, "$receiver");
        try {
            if (C14689r.f42919a.mo45927c(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: a */
    private static final String m27837a(long j, int i) {
        String l = Long.toString(j, C14661d.m63537a(i));
        C14445h0.m62453a((Object) l, "java.lang.Long.toString(this, checkRadix(radix))");
        return l;
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final BigInteger m27841a(@C6003d String str, int i) {
        return new BigInteger(str, C14661d.m63537a(i));
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final BigDecimal m27839a(@C6003d String str) {
        return new BigDecimal(str);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final BigDecimal m27840a(@C6003d String str, MathContext mathContext) {
        return new BigDecimal(str, mathContext);
    }

    @C6096e0(version = "1.2")
    @C6004e
    /* renamed from: b */
    public static final BigDecimal m27842b(@C6003d String str) {
        C14445h0.m62478f(str, "$receiver");
        try {
            if (C14689r.f42919a.mo45927c(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static final <T> T m27834a(String str, C6080l<? super String, ? extends T> lVar) {
        try {
            if (C14689r.f42919a.mo45927c(str)) {
                return lVar.invoke(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @C6096e0(version = "1.2")
    @C6004e
    /* renamed from: b */
    public static final BigDecimal m27843b(@C6003d String str, @C6003d MathContext mathContext) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(mathContext, "mathContext");
        try {
            if (C14689r.f42919a.mo45927c(str)) {
                return new BigDecimal(str, mathContext);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
