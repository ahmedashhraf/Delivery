package kotlin.p509w0;

import java.util.Comparator;
import kotlin.C6096e0;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.w0.c */
/* compiled from: _Comparisons.kt */
class C14871c extends C14856b {
    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: a */
    private static final byte m65885a(byte b, byte b2) {
        return (byte) Math.max(b, b2);
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: b */
    public static final <T extends Comparable<? super T>> T m65910b(@C6003d T t, @C6003d T t2) {
        C14445h0.m62478f(t, "a");
        C14445h0.m62478f(t2, "b");
        return t.compareTo(t2) >= 0 ? t : t2;
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: c */
    public static final <T extends Comparable<? super T>> T m65916c(@C6003d T t, @C6003d T t2) {
        C14445h0.m62478f(t, "a");
        C14445h0.m62478f(t2, "b");
        return t.compareTo(t2) <= 0 ? t : t2;
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: a */
    private static final short m65898a(short s, short s2) {
        return (short) Math.max(s, s2);
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: b */
    private static final byte m65900b(byte b, byte b2) {
        return (byte) Math.min(b, b2);
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: a */
    private static final int m65891a(int i, int i2) {
        return Math.max(i, i2);
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: b */
    private static final short m65914b(short s, short s2) {
        return (short) Math.min(s, s2);
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: a */
    private static final long m65893a(long j, long j2) {
        return Math.max(j, j2);
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: b */
    private static final int m65906b(int i, int i2) {
        return Math.min(i, i2);
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: a */
    private static final float m65889a(float f, float f2) {
        return Math.max(f, f2);
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: b */
    private static final long m65908b(long j, long j2) {
        return Math.min(j, j2);
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: a */
    private static final double m65887a(double d, double d2) {
        return Math.max(d, d2);
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: b */
    private static final float m65904b(float f, float f2) {
        return Math.min(f, f2);
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static final <T extends Comparable<? super T>> T m65895a(@C6003d T t, @C6003d T t2, @C6003d T t3) {
        C14445h0.m62478f(t, "a");
        C14445h0.m62478f(t2, "b");
        C14445h0.m62478f(t3, "c");
        return m65910b(t, (T) m65910b(t2, t3));
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: b */
    private static final double m65902b(double d, double d2) {
        return Math.min(d, d2);
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: a */
    private static final byte m65886a(byte b, byte b2, byte b3) {
        return (byte) Math.max(b, Math.max(b2, b3));
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: b */
    public static final <T extends Comparable<? super T>> T m65911b(@C6003d T t, @C6003d T t2, @C6003d T t3) {
        C14445h0.m62478f(t, "a");
        C14445h0.m62478f(t2, "b");
        C14445h0.m62478f(t3, "c");
        return m65916c(t, m65916c(t2, t3));
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: a */
    private static final short m65899a(short s, short s2, short s3) {
        return (short) Math.max(s, Math.max(s2, s3));
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: b */
    private static final byte m65901b(byte b, byte b2, byte b3) {
        return (byte) Math.min(b, Math.min(b2, b3));
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: a */
    private static final int m65892a(int i, int i2, int i3) {
        return Math.max(i, Math.max(i2, i3));
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: b */
    private static final short m65915b(short s, short s2, short s3) {
        return (short) Math.min(s, Math.min(s2, s3));
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: a */
    private static final long m65894a(long j, long j2, long j3) {
        return Math.max(j, Math.max(j2, j3));
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: b */
    private static final int m65907b(int i, int i2, int i3) {
        return Math.min(i, Math.min(i2, i3));
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: a */
    private static final float m65890a(float f, float f2, float f3) {
        return Math.max(f, Math.max(f2, f3));
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: b */
    private static final long m65909b(long j, long j2, long j3) {
        return Math.min(j, Math.min(j2, j3));
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: a */
    private static final double m65888a(double d, double d2, double d3) {
        return Math.max(d, Math.max(d2, d3));
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: b */
    private static final float m65905b(float f, float f2, float f3) {
        return Math.min(f, Math.min(f2, f3));
    }

    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static final <T> T m65896a(T t, T t2, T t3, @C6003d Comparator<? super T> comparator) {
        C14445h0.m62478f(comparator, "comparator");
        return m65897a(t, (T) m65897a(t2, t3, comparator), comparator);
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: b */
    private static final double m65903b(double d, double d2, double d3) {
        return Math.min(d, Math.min(d2, d3));
    }

    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static final <T> T m65897a(T t, T t2, @C6003d Comparator<? super T> comparator) {
        C14445h0.m62478f(comparator, "comparator");
        return comparator.compare(t, t2) >= 0 ? t : t2;
    }

    @C6096e0(version = "1.1")
    /* renamed from: b */
    public static final <T> T m65912b(T t, T t2, T t3, @C6003d Comparator<? super T> comparator) {
        C14445h0.m62478f(comparator, "comparator");
        return m65913b(t, (T) m65913b(t2, t3, comparator), comparator);
    }

    @C6096e0(version = "1.1")
    /* renamed from: b */
    public static final <T> T m65913b(T t, T t2, @C6003d Comparator<? super T> comparator) {
        C14445h0.m62478f(comparator, "comparator");
        return comparator.compare(t, t2) <= 0 ? t : t2;
    }
}
