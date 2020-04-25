package kotlin.p504e1;

import kotlin.C6096e0;
import kotlin.p214b1.C6055e;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p504e1.C14510a.C14511a;
import kotlin.p504e1.C14522i.C14523a;
import kotlin.p504e1.C14527l.C14528a;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement.RangeValidateElement;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: kotlin.e1.q */
/* compiled from: _Ranges.kt */
class C14534q extends C14533p {
    /* renamed from: a */
    public static final byte m62898a(byte b, byte b2) {
        return b < b2 ? b2 : b;
    }

    /* renamed from: a */
    public static int m62902a(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public static final long m62905a(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* renamed from: a */
    public static final short m62935a(short s, short s2) {
        return s < s2 ? s2 : s;
    }

    @C6055e(name = "doubleRangeContains")
    /* renamed from: a */
    public static final boolean m62937a(@C6003d C14519g<Double> gVar, byte b) {
        C14445h0.m62478f(gVar, "$receiver");
        return gVar.mo45694a(Double.valueOf((double) b));
    }

    /* renamed from: b */
    public static final byte m62943b(byte b, byte b2) {
        return b > b2 ? b2 : b;
    }

    /* renamed from: b */
    public static final double m62944b(double d, double d2) {
        return d < d2 ? d2 : d;
    }

    /* renamed from: b */
    public static final float m62945b(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    /* renamed from: b */
    public static int m62946b(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: b */
    public static final long m62947b(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* renamed from: b */
    public static final short m62966b(short s, short s2) {
        return s > s2 ? s2 : s;
    }

    @C6055e(name = "floatRangeContains")
    /* renamed from: b */
    public static final boolean m62967b(@C6003d C14519g<Float> gVar, byte b) {
        C14445h0.m62478f(gVar, "$receiver");
        return gVar.mo45694a(Float.valueOf((float) b));
    }

    /* renamed from: c */
    public static final double m62973c(double d, double d2) {
        return d > d2 ? d2 : d;
    }

    /* renamed from: c */
    public static final float m62974c(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    @C6055e(name = "intRangeContains")
    /* renamed from: c */
    public static final boolean m62983c(@C6003d C14519g<Integer> gVar, byte b) {
        C14445h0.m62478f(gVar, "$receiver");
        return gVar.mo45694a(Integer.valueOf(b));
    }

    @C6055e(name = "longRangeContains")
    /* renamed from: d */
    public static final boolean m62995d(@C6003d C14519g<Long> gVar, byte b) {
        C14445h0.m62478f(gVar, "$receiver");
        return gVar.mo45694a(Long.valueOf((long) b));
    }

    @C6055e(name = "shortRangeContains")
    /* renamed from: e */
    public static final boolean m63001e(@C6003d C14519g<Short> gVar, byte b) {
        C14445h0.m62478f(gVar, "$receiver");
        return gVar.mo45694a(Short.valueOf((short) b));
    }

    @C6055e(name = "byteRangeContains")
    /* renamed from: a */
    public static final boolean m62938a(@C6003d C14519g<Byte> gVar, double d) {
        C14445h0.m62478f(gVar, "$receiver");
        Byte a = m62908a(d);
        if (a != null) {
            return gVar.mo45694a(a);
        }
        return false;
    }

    @C6055e(name = "floatRangeContains")
    /* renamed from: b */
    public static final boolean m62968b(@C6003d C14519g<Float> gVar, double d) {
        C14445h0.m62478f(gVar, "$receiver");
        return gVar.mo45694a(Float.valueOf((float) d));
    }

    @C6055e(name = "intRangeContains")
    /* renamed from: c */
    public static final boolean m62984c(@C6003d C14519g<Integer> gVar, double d) {
        C14445h0.m62478f(gVar, "$receiver");
        Integer b = m62949b(d);
        if (b != null) {
            return gVar.mo45694a(b);
        }
        return false;
    }

    @C6055e(name = "longRangeContains")
    /* renamed from: d */
    public static final boolean m62996d(@C6003d C14519g<Long> gVar, double d) {
        C14445h0.m62478f(gVar, "$receiver");
        Long c = m62976c(d);
        if (c != null) {
            return gVar.mo45694a(c);
        }
        return false;
    }

    @C6055e(name = "shortRangeContains")
    /* renamed from: e */
    public static final boolean m63002e(@C6003d C14519g<Short> gVar, double d) {
        C14445h0.m62478f(gVar, "$receiver");
        Short d2 = m62989d(d);
        if (d2 != null) {
            return gVar.mo45694a(d2);
        }
        return false;
    }

    @C6055e(name = "byteRangeContains")
    /* renamed from: a */
    public static final boolean m62939a(@C6003d C14519g<Byte> gVar, float f) {
        C14445h0.m62478f(gVar, "$receiver");
        Byte a = m62909a(f);
        if (a != null) {
            return gVar.mo45694a(a);
        }
        return false;
    }

    @C6055e(name = "doubleRangeContains")
    /* renamed from: b */
    public static final boolean m62969b(@C6003d C14519g<Double> gVar, float f) {
        C14445h0.m62478f(gVar, "$receiver");
        return gVar.mo45694a(Double.valueOf((double) f));
    }

    @C6055e(name = "intRangeContains")
    /* renamed from: c */
    public static boolean m62985c(@C6003d C14519g<Integer> gVar, float f) {
        C14445h0.m62478f(gVar, "$receiver");
        Integer b = m62950b(f);
        if (b != null) {
            return gVar.mo45694a(b);
        }
        return false;
    }

    @C6055e(name = "longRangeContains")
    /* renamed from: d */
    public static final boolean m62997d(@C6003d C14519g<Long> gVar, float f) {
        C14445h0.m62478f(gVar, "$receiver");
        Long c = m62977c(f);
        if (c != null) {
            return gVar.mo45694a(c);
        }
        return false;
    }

    @C6055e(name = "shortRangeContains")
    /* renamed from: e */
    public static final boolean m63003e(@C6003d C14519g<Short> gVar, float f) {
        C14445h0.m62478f(gVar, "$receiver");
        Short d = m62990d(f);
        if (d != null) {
            return gVar.mo45694a(d);
        }
        return false;
    }

    @C6055e(name = "byteRangeContains")
    /* renamed from: a */
    public static final boolean m62940a(@C6003d C14519g<Byte> gVar, int i) {
        C14445h0.m62478f(gVar, "$receiver");
        Byte a = m62910a(i);
        if (a != null) {
            return gVar.mo45694a(a);
        }
        return false;
    }

    @C6055e(name = "doubleRangeContains")
    /* renamed from: b */
    public static final boolean m62970b(@C6003d C14519g<Double> gVar, int i) {
        C14445h0.m62478f(gVar, "$receiver");
        return gVar.mo45694a(Double.valueOf((double) i));
    }

    @C6055e(name = "floatRangeContains")
    /* renamed from: c */
    public static final boolean m62986c(@C6003d C14519g<Float> gVar, int i) {
        C14445h0.m62478f(gVar, "$receiver");
        return gVar.mo45694a(Float.valueOf((float) i));
    }

    @C6055e(name = "longRangeContains")
    /* renamed from: d */
    public static final boolean m62998d(@C6003d C14519g<Long> gVar, int i) {
        C14445h0.m62478f(gVar, "$receiver");
        return gVar.mo45694a(Long.valueOf((long) i));
    }

    @C6055e(name = "shortRangeContains")
    /* renamed from: e */
    public static final boolean m63004e(@C6003d C14519g<Short> gVar, int i) {
        C14445h0.m62478f(gVar, "$receiver");
        Short b = m62952b(i);
        if (b != null) {
            return gVar.mo45694a(b);
        }
        return false;
    }

    @C6055e(name = "byteRangeContains")
    /* renamed from: a */
    public static final boolean m62941a(@C6003d C14519g<Byte> gVar, long j) {
        C14445h0.m62478f(gVar, "$receiver");
        Byte a = m62911a(j);
        if (a != null) {
            return gVar.mo45694a(a);
        }
        return false;
    }

    @C6055e(name = "doubleRangeContains")
    /* renamed from: b */
    public static final boolean m62971b(@C6003d C14519g<Double> gVar, long j) {
        C14445h0.m62478f(gVar, "$receiver");
        return gVar.mo45694a(Double.valueOf((double) j));
    }

    @C6055e(name = "floatRangeContains")
    /* renamed from: c */
    public static final boolean m62987c(@C6003d C14519g<Float> gVar, long j) {
        C14445h0.m62478f(gVar, "$receiver");
        return gVar.mo45694a(Float.valueOf((float) j));
    }

    @C6055e(name = "intRangeContains")
    /* renamed from: d */
    public static final boolean m62999d(@C6003d C14519g<Integer> gVar, long j) {
        C14445h0.m62478f(gVar, "$receiver");
        Integer b = m62951b(j);
        if (b != null) {
            return gVar.mo45694a(b);
        }
        return false;
    }

    @C6055e(name = "shortRangeContains")
    /* renamed from: e */
    public static final boolean m63005e(@C6003d C14519g<Short> gVar, long j) {
        C14445h0.m62478f(gVar, "$receiver");
        Short c = m62978c(j);
        if (c != null) {
            return gVar.mo45694a(c);
        }
        return false;
    }

    @C6055e(name = "byteRangeContains")
    /* renamed from: a */
    public static final boolean m62942a(@C6003d C14519g<Byte> gVar, short s) {
        C14445h0.m62478f(gVar, "$receiver");
        Byte a = m62912a(s);
        if (a != null) {
            return gVar.mo45694a(a);
        }
        return false;
    }

    @C6055e(name = "doubleRangeContains")
    /* renamed from: b */
    public static final boolean m62972b(@C6003d C14519g<Double> gVar, short s) {
        C14445h0.m62478f(gVar, "$receiver");
        return gVar.mo45694a(Double.valueOf((double) s));
    }

    @C6055e(name = "floatRangeContains")
    /* renamed from: c */
    public static final boolean m62988c(@C6003d C14519g<Float> gVar, short s) {
        C14445h0.m62478f(gVar, "$receiver");
        return gVar.mo45694a(Float.valueOf((float) s));
    }

    @C6055e(name = "intRangeContains")
    /* renamed from: d */
    public static final boolean m63000d(@C6003d C14519g<Integer> gVar, short s) {
        C14445h0.m62478f(gVar, "$receiver");
        return gVar.mo45694a(Integer.valueOf(s));
    }

    @C6055e(name = "longRangeContains")
    /* renamed from: e */
    public static final boolean m63006e(@C6003d C14519g<Long> gVar, short s) {
        C14445h0.m62478f(gVar, "$receiver");
        return gVar.mo45694a(Long.valueOf((long) s));
    }

    @C6003d
    /* renamed from: a */
    public static final C14522i m62921a(int i, byte b) {
        return C14522i.f42677O.mo45720a(i, b, -1);
    }

    @C6004e
    /* renamed from: b */
    public static final Integer m62951b(long j) {
        long j2 = (long) Integer.MAX_VALUE;
        if (((long) Integer.MIN_VALUE) <= j && j2 >= j) {
            return Integer.valueOf((int) j);
        }
        return null;
    }

    @C6003d
    /* renamed from: c */
    public static final C14522i m62979c(byte b, byte b2) {
        return C14522i.f42677O.mo45720a(b, b2, -1);
    }

    @C6004e
    /* renamed from: d */
    public static final Short m62989d(double d) {
        double d2 = (double) 32767;
        if (d < ((double) -32768) || d > d2) {
            return null;
        }
        return Short.valueOf((short) ((int) d));
    }

    @C6003d
    /* renamed from: a */
    public static final C14527l m62929a(long j, byte b) {
        return C14527l.f42687O.mo45733a(j, (long) b, -1);
    }

    @C6004e
    /* renamed from: b */
    public static final Integer m62949b(double d) {
        double d2 = (double) Integer.MAX_VALUE;
        if (d < ((double) Integer.MIN_VALUE) || d > d2) {
            return null;
        }
        return Integer.valueOf((int) d);
    }

    @C6003d
    /* renamed from: c */
    public static C14522i m62980c(int i, int i2) {
        return C14522i.f42677O.mo45720a(i, i2, -1);
    }

    @C6004e
    /* renamed from: d */
    public static final Short m62990d(float f) {
        float f2 = (float) 32767;
        if (f < ((float) -32768) || f > f2) {
            return null;
        }
        return Short.valueOf((short) ((int) f));
    }

    @C6003d
    /* renamed from: a */
    public static final C14522i m62925a(short s, byte b) {
        return C14522i.f42677O.mo45720a(s, b, -1);
    }

    @C6004e
    /* renamed from: b */
    public static final Integer m62950b(float f) {
        float f2 = (float) Integer.MAX_VALUE;
        if (f < ((float) Integer.MIN_VALUE) || f > f2) {
            return null;
        }
        return Integer.valueOf((int) f);
    }

    @C6003d
    /* renamed from: c */
    public static final C14527l m62982c(long j, long j2) {
        return C14527l.f42687O.mo45733a(j, j2, -1);
    }

    @C6003d
    /* renamed from: d */
    public static final C14525k m62991d(byte b, byte b2) {
        return new C14525k(b, b2 - 1);
    }

    @C6003d
    /* renamed from: a */
    public static final C14510a m62916a(char c, char c2) {
        return C14510a.f42661O.mo45690a(c, c2, -1);
    }

    @C6004e
    /* renamed from: b */
    public static final Short m62952b(int i) {
        if (-32768 <= i && 32767 >= i) {
            return Short.valueOf((short) i);
        }
        return null;
    }

    @C6003d
    /* renamed from: c */
    public static final C14522i m62981c(short s, short s2) {
        return C14522i.f42677O.mo45720a(s, s2, -1);
    }

    @C6003d
    /* renamed from: d */
    public static C14525k m62992d(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C14525k.f42686Q.mo45724a();
        }
        return new C14525k(i, i2 - 1);
    }

    @C6003d
    /* renamed from: a */
    public static final C14527l m62930a(long j, int i) {
        return C14527l.f42687O.mo45733a(j, (long) i, -1);
    }

    @C6003d
    /* renamed from: b */
    public static final C14525k m62956b(int i, byte b) {
        return new C14525k(i, b - 1);
    }

    @C6004e
    /* renamed from: c */
    public static final Long m62976c(double d) {
        double d2 = (double) Long.MAX_VALUE;
        if (d < ((double) Long.MIN_VALUE) || d > d2) {
            return null;
        }
        return Long.valueOf((long) d);
    }

    @C6003d
    /* renamed from: a */
    public static final C14522i m62919a(byte b, int i) {
        return C14522i.f42677O.mo45720a(b, i, -1);
    }

    @C6003d
    /* renamed from: b */
    public static final C14530n m62962b(long j, byte b) {
        return new C14530n(j, ((long) b) - 1);
    }

    @C6004e
    /* renamed from: c */
    public static final Long m62977c(float f) {
        float f2 = (float) Long.MAX_VALUE;
        if (f < ((float) Long.MIN_VALUE) || f > f2) {
            return null;
        }
        return Long.valueOf((long) f);
    }

    @C6003d
    /* renamed from: d */
    public static final C14530n m62994d(long j, long j2) {
        if (j2 <= Long.MIN_VALUE) {
            return C14530n.f42696Q.mo45737a();
        }
        return new C14530n(j, j2 - 1);
    }

    @C6003d
    /* renamed from: a */
    public static final C14522i m62926a(short s, int i) {
        return C14522i.f42677O.mo45720a(s, i, -1);
    }

    @C6003d
    /* renamed from: b */
    public static final C14525k m62958b(short s, byte b) {
        return new C14525k(s, b - 1);
    }

    @C6004e
    /* renamed from: c */
    public static final Short m62978c(long j) {
        long j2 = (long) 32767;
        if (((long) -32768) <= j && j2 >= j) {
            return Short.valueOf((short) ((int) j));
        }
        return null;
    }

    @C6003d
    /* renamed from: a */
    public static final C14527l m62928a(int i, long j) {
        return C14527l.f42687O.mo45733a((long) i, j, -1);
    }

    @C6003d
    /* renamed from: b */
    public static final C14513c m62953b(char c, char c2) {
        if (c2 <= 0) {
            return C14513c.f42670Q.mo45697a();
        }
        return new C14513c(c, (char) (c2 - 1));
    }

    @C6003d
    /* renamed from: c */
    public static final <T extends Comparable<? super T>> T m62975c(@C6003d T t, @C6003d T t2) {
        C14445h0.m62478f(t, "$receiver");
        C14445h0.m62478f(t2, "maximumValue");
        return t.compareTo(t2) > 0 ? t2 : t;
    }

    @C6003d
    /* renamed from: d */
    public static final C14525k m62993d(short s, short s2) {
        return new C14525k(s, s2 - 1);
    }

    @C6003d
    /* renamed from: a */
    public static final C14527l m62927a(byte b, long j) {
        return C14527l.f42687O.mo45733a((long) b, j, -1);
    }

    @C6003d
    /* renamed from: a */
    public static final C14527l m62934a(short s, long j) {
        return C14527l.f42687O.mo45733a((long) s, j, -1);
    }

    @C6003d
    /* renamed from: b */
    public static final C14530n m62963b(long j, int i) {
        return new C14530n(j, ((long) i) - 1);
    }

    @C6003d
    /* renamed from: a */
    public static final C14522i m62922a(int i, short s) {
        return C14522i.f42677O.mo45720a(i, s, -1);
    }

    @C6003d
    /* renamed from: b */
    public static final C14525k m62954b(byte b, int i) {
        if (i <= Integer.MIN_VALUE) {
            return C14525k.f42686Q.mo45724a();
        }
        return new C14525k(b, i - 1);
    }

    @C6003d
    /* renamed from: a */
    public static final C14527l m62931a(long j, short s) {
        return C14527l.f42687O.mo45733a(j, (long) s, -1);
    }

    @C6003d
    /* renamed from: a */
    public static final C14522i m62920a(byte b, short s) {
        return C14522i.f42677O.mo45720a(b, s, -1);
    }

    @C6003d
    /* renamed from: b */
    public static final C14525k m62959b(short s, int i) {
        if (i <= Integer.MIN_VALUE) {
            return C14525k.f42686Q.mo45724a();
        }
        return new C14525k(s, i - 1);
    }

    @C6003d
    /* renamed from: a */
    public static final C14522i m62923a(@C6003d C14522i iVar) {
        C14445h0.m62478f(iVar, "$receiver");
        return C14522i.f42677O.mo45720a(iVar.getLast(), iVar.getFirst(), -iVar.mo45712e());
    }

    @C6003d
    /* renamed from: a */
    public static final C14527l m62932a(@C6003d C14527l lVar) {
        C14445h0.m62478f(lVar, "$receiver");
        return C14527l.f42687O.mo45733a(lVar.getLast(), lVar.getFirst(), -lVar.mo45725e());
    }

    @C6003d
    /* renamed from: b */
    public static final C14530n m62961b(int i, long j) {
        if (j <= Long.MIN_VALUE) {
            return C14530n.f42696Q.mo45737a();
        }
        return new C14530n((long) i, j - 1);
    }

    @C6003d
    /* renamed from: a */
    public static final C14510a m62917a(@C6003d C14510a aVar) {
        C14445h0.m62478f(aVar, "$receiver");
        return C14510a.f42661O.mo45690a(aVar.getLast(), aVar.getFirst(), -aVar.mo45682e());
    }

    @C6003d
    /* renamed from: a */
    public static C14522i m62924a(@C6003d C14522i iVar, int i) {
        C14445h0.m62478f(iVar, "$receiver");
        C14533p.m62897a(i > 0, (Number) Integer.valueOf(i));
        C14523a aVar = C14522i.f42677O;
        int first = iVar.getFirst();
        int last = iVar.getLast();
        if (iVar.mo45712e() <= 0) {
            i = -i;
        }
        return aVar.mo45720a(first, last, i);
    }

    @C6003d
    /* renamed from: b */
    public static final C14530n m62960b(byte b, long j) {
        if (j <= Long.MIN_VALUE) {
            return C14530n.f42696Q.mo45737a();
        }
        return new C14530n((long) b, j - 1);
    }

    @C6003d
    /* renamed from: a */
    public static final C14527l m62933a(@C6003d C14527l lVar, long j) {
        C14445h0.m62478f(lVar, "$receiver");
        C14533p.m62897a(j > 0, (Number) Long.valueOf(j));
        C14528a aVar = C14527l.f42687O;
        long first = lVar.getFirst();
        long last = lVar.getLast();
        if (lVar.mo45725e() <= 0) {
            j = -j;
        }
        return aVar.mo45733a(first, last, j);
    }

    @C6003d
    /* renamed from: b */
    public static final C14530n m62965b(short s, long j) {
        if (j <= Long.MIN_VALUE) {
            return C14530n.f42696Q.mo45737a();
        }
        return new C14530n((long) s, j - 1);
    }

    @C6003d
    /* renamed from: a */
    public static final C14510a m62918a(@C6003d C14510a aVar, int i) {
        C14445h0.m62478f(aVar, "$receiver");
        C14533p.m62897a(i > 0, (Number) Integer.valueOf(i));
        C14511a aVar2 = C14510a.f42661O;
        char first = aVar.getFirst();
        char last = aVar.getLast();
        if (aVar.mo45682e() <= 0) {
            i = -i;
        }
        return aVar2.mo45690a(first, last, i);
    }

    @C6003d
    /* renamed from: b */
    public static final C14525k m62957b(int i, short s) {
        return new C14525k(i, s - 1);
    }

    @C6003d
    /* renamed from: b */
    public static final C14530n m62964b(long j, short s) {
        return new C14530n(j, ((long) s) - 1);
    }

    @C6004e
    /* renamed from: a */
    public static final Byte m62910a(int i) {
        if (-128 <= i && 127 >= i) {
            return Byte.valueOf((byte) i);
        }
        return null;
    }

    @C6003d
    /* renamed from: b */
    public static final C14525k m62955b(byte b, short s) {
        return new C14525k(b, s - 1);
    }

    @C6004e
    /* renamed from: a */
    public static final Byte m62911a(long j) {
        long j2 = (long) C13959t.f40827P1;
        if (((long) -128) <= j && j2 >= j) {
            return Byte.valueOf((byte) ((int) j));
        }
        return null;
    }

    @C6003d
    /* renamed from: b */
    public static final <T extends Comparable<? super T>> T m62948b(@C6003d T t, @C6003d T t2) {
        C14445h0.m62478f(t, "$receiver");
        C14445h0.m62478f(t2, "minimumValue");
        return t.compareTo(t2) < 0 ? t2 : t;
    }

    @C6004e
    /* renamed from: a */
    public static final Byte m62912a(short s) {
        short s2 = (short) C13959t.f40827P1;
        if (((short) -128) <= s && s2 >= s) {
            return Byte.valueOf((byte) s);
        }
        return null;
    }

    @C6004e
    /* renamed from: a */
    public static final Byte m62908a(double d) {
        double d2 = (double) C13959t.f40827P1;
        if (d < ((double) -128) || d > d2) {
            return null;
        }
        return Byte.valueOf((byte) ((int) d));
    }

    @C6004e
    /* renamed from: a */
    public static final Byte m62909a(float f) {
        float f2 = (float) C13959t.f40827P1;
        if (f < ((float) -128) || f > f2) {
            return null;
        }
        return Byte.valueOf((byte) ((int) f));
    }

    @C6003d
    /* renamed from: a */
    public static final <T extends Comparable<? super T>> T m62913a(@C6003d T t, @C6004e T t2, @C6004e T t3) {
        C14445h0.m62478f(t, "$receiver");
        if (t2 == null || t3 == null) {
            if (t2 == null || t.compareTo(t2) >= 0) {
                return (t3 == null || t.compareTo(t3) <= 0) ? t : t3;
            }
            return t2;
        } else if (t2.compareTo(t3) > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(t3);
            sb.append(" is less than minimum ");
            sb.append(t2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        } else if (t.compareTo(t2) < 0) {
            return t2;
        } else {
            if (t.compareTo(t3) > 0) {
                return t3;
            }
        }
    }

    /* renamed from: a */
    public static final byte m62899a(byte b, byte b2, byte b3) {
        if (b2 > b3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(b3);
            sb.append(" is less than minimum ");
            sb.append(b2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        } else if (b < b2) {
            return b2;
        } else {
            return b > b3 ? b3 : b;
        }
    }

    /* renamed from: a */
    public static final short m62936a(short s, short s2, short s3) {
        if (s2 > s3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(s3);
            sb.append(" is less than minimum ");
            sb.append(s2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        } else if (s < s2) {
            return s2;
        } else {
            return s > s3 ? s3 : s;
        }
    }

    /* renamed from: a */
    public static int m62903a(int i, int i2, int i3) {
        if (i2 > i3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(i3);
            sb.append(" is less than minimum ");
            sb.append(i2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        } else if (i < i2) {
            return i2;
        } else {
            return i > i3 ? i3 : i;
        }
    }

    /* renamed from: a */
    public static final long m62906a(long j, long j2, long j3) {
        if (j2 > j3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(j3);
            sb.append(" is less than minimum ");
            sb.append(j2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        } else if (j < j2) {
            return j2;
        } else {
            return j > j3 ? j3 : j;
        }
    }

    /* renamed from: a */
    public static final float m62901a(float f, float f2, float f3) {
        if (f2 > f3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(f3);
            sb.append(" is less than minimum ");
            sb.append(f2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        } else if (f < f2) {
            return f2;
        } else {
            return f > f3 ? f3 : f;
        }
    }

    /* renamed from: a */
    public static final double m62900a(double d, double d2, double d3) {
        if (d2 > d3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(d3);
            sb.append(" is less than minimum ");
            sb.append(d2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        } else if (d < d2) {
            return d2;
        } else {
            return d > d3 ? d3 : d;
        }
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static final <T extends Comparable<? super T>> T m62914a(@C6003d T t, @C6003d C14517f<T> fVar) {
        C14445h0.m62478f(t, "$receiver");
        C14445h0.m62478f(fVar, RangeValidateElement.METHOD);
        if (fVar.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: ");
            sb.append(fVar);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        } else if (!fVar.mo45700a(t, fVar.mo45695b()) || fVar.mo45700a(fVar.mo45695b(), t)) {
            return (!fVar.mo45700a(fVar.mo45696c(), t) || fVar.mo45700a(t, fVar.mo45696c())) ? t : fVar.mo45696c();
        } else {
            return fVar.mo45695b();
        }
    }

    @C6003d
    /* renamed from: a */
    public static final <T extends Comparable<? super T>> T m62915a(@C6003d T t, @C6003d C14519g<T> gVar) {
        C14445h0.m62478f(t, "$receiver");
        C14445h0.m62478f(gVar, RangeValidateElement.METHOD);
        if (gVar instanceof C14517f) {
            return m62914a(t, (C14517f) gVar);
        }
        if (!gVar.isEmpty()) {
            if (t.compareTo(gVar.mo45695b()) < 0) {
                t = gVar.mo45695b();
            } else if (t.compareTo(gVar.mo45696c()) > 0) {
                t = gVar.mo45696c();
            }
            return t;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot coerce value to an empty range: ");
        sb.append(gVar);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static final int m62904a(int i, @C6003d C14519g<Integer> gVar) {
        C14445h0.m62478f(gVar, RangeValidateElement.METHOD);
        if (gVar instanceof C14517f) {
            return ((Number) m62914a((T) Integer.valueOf(i), (C14517f) gVar)).intValue();
        }
        if (!gVar.isEmpty()) {
            if (i < ((Number) gVar.mo45695b()).intValue()) {
                i = ((Number) gVar.mo45695b()).intValue();
            } else if (i > ((Number) gVar.mo45696c()).intValue()) {
                i = ((Number) gVar.mo45696c()).intValue();
            }
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot coerce value to an empty range: ");
        sb.append(gVar);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static final long m62907a(long j, @C6003d C14519g<Long> gVar) {
        C14445h0.m62478f(gVar, RangeValidateElement.METHOD);
        if (gVar instanceof C14517f) {
            return ((Number) m62914a((T) Long.valueOf(j), (C14517f) gVar)).longValue();
        }
        if (!gVar.isEmpty()) {
            if (j < ((Number) gVar.mo45695b()).longValue()) {
                j = ((Number) gVar.mo45695b()).longValue();
            } else if (j > ((Number) gVar.mo45696c()).longValue()) {
                j = ((Number) gVar.mo45696c()).longValue();
            }
            return j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot coerce value to an empty range: ");
        sb.append(gVar);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }
}
