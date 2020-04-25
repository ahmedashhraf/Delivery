package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;
import java.util.NoSuchElementException;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
@C2775a
/* renamed from: com.google.common.collect.o0 */
/* compiled from: DiscreteDomain */
public abstract class C8078o0<C extends Comparable> {

    /* renamed from: com.google.common.collect.o0$a */
    /* compiled from: DiscreteDomain */
    private static final class C8079a extends C8078o0<BigInteger> implements Serializable {

        /* renamed from: N */
        private static final BigInteger f21881N = BigInteger.valueOf(Long.MAX_VALUE);
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C8079a f21882a = new C8079a();

        /* renamed from: b */
        private static final BigInteger f21883b = BigInteger.valueOf(Long.MIN_VALUE);
        private static final long serialVersionUID = 0;

        private C8079a() {
        }

        private Object readResolve() {
            return f21882a;
        }

        public String toString() {
            return "DiscreteDomain.bigIntegers()";
        }

        /* renamed from: b */
        public BigInteger mo30902b(BigInteger bigInteger) {
            return bigInteger.subtract(BigInteger.ONE);
        }

        /* renamed from: a */
        public BigInteger mo30901a(BigInteger bigInteger) {
            return bigInteger.add(BigInteger.ONE);
        }

        /* renamed from: a */
        public long mo30899a(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger2.subtract(bigInteger).max(f21883b).min(f21881N).longValue();
        }
    }

    /* renamed from: com.google.common.collect.o0$b */
    /* compiled from: DiscreteDomain */
    private static final class C8080b extends C8078o0<Integer> implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C8080b f21884a = new C8080b();
        private static final long serialVersionUID = 0;

        private C8080b() {
        }

        private Object readResolve() {
            return f21884a;
        }

        public String toString() {
            return "DiscreteDomain.integers()";
        }

        /* renamed from: b */
        public Integer mo30902b(Integer num) {
            int intValue = num.intValue();
            if (intValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue - 1);
        }

        /* renamed from: d */
        public Integer m38700d() {
            return Integer.valueOf(Integer.MIN_VALUE);
        }

        /* renamed from: a */
        public Integer mo30901a(Integer num) {
            int intValue = num.intValue();
            if (intValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue + 1);
        }

        /* renamed from: a */
        public long mo30899a(Integer num, Integer num2) {
            return ((long) num2.intValue()) - ((long) num.intValue());
        }

        /* renamed from: a */
        public Integer m38695a() {
            return Integer.valueOf(Integer.MAX_VALUE);
        }
    }

    /* renamed from: com.google.common.collect.o0$c */
    /* compiled from: DiscreteDomain */
    private static final class C8081c extends C8078o0<Long> implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C8081c f21885a = new C8081c();
        private static final long serialVersionUID = 0;

        private C8081c() {
        }

        private Object readResolve() {
            return f21885a;
        }

        public String toString() {
            return "DiscreteDomain.longs()";
        }

        /* renamed from: b */
        public Long mo30902b(Long l) {
            long longValue = l.longValue();
            if (longValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(longValue - 1);
        }

        /* renamed from: d */
        public Long m38711d() {
            return Long.valueOf(Long.MIN_VALUE);
        }

        /* renamed from: a */
        public Long mo30901a(Long l) {
            long longValue = l.longValue();
            if (longValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(longValue + 1);
        }

        /* renamed from: a */
        public long mo30899a(Long l, Long l2) {
            long longValue = l2.longValue() - l.longValue();
            if (l2.longValue() > l.longValue() && longValue < 0) {
                return Long.MAX_VALUE;
            }
            if (l2.longValue() >= l.longValue() || longValue <= 0) {
                return longValue;
            }
            return Long.MIN_VALUE;
        }

        /* renamed from: a */
        public Long m38706a() {
            return Long.valueOf(Long.MAX_VALUE);
        }
    }

    protected C8078o0() {
    }

    /* renamed from: e */
    public static C8078o0<BigInteger> m38675e() {
        return C8079a.f21882a;
    }

    /* renamed from: f */
    public static C8078o0<Integer> m38676f() {
        return C8080b.f21884a;
    }

    /* renamed from: g */
    public static C8078o0<Long> m38677g() {
        return C8081c.f21885a;
    }

    /* renamed from: a */
    public abstract long mo30899a(C c, C c2);

    /* renamed from: a */
    public C mo30900a() {
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    public abstract C mo30901a(C c);

    /* renamed from: b */
    public abstract C mo30902b(C c);

    /* renamed from: d */
    public C mo30903d() {
        throw new NoSuchElementException();
    }
}
