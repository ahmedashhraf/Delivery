package org.jcodec.common.model;

import org.jcodec.common.StringUtils;
import org.jcodec.common.tools.MathUtil;

public class RationalLarge {
    public static final Rational HALF = new Rational(1, 2);
    public static final Rational ONE = new Rational(1, 1);
    public static final RationalLarge ZERO = new RationalLarge(0, 1);
    final long den;
    final long num;

    public RationalLarge(long j, long j2) {
        this.num = j;
        this.den = j2;
    }

    /* renamed from: R */
    public static RationalLarge m68667R(long j, long j2) {
        return new RationalLarge(j, j2);
    }

    public static Rational parse(String str) {
        String[] split = StringUtils.split(str, ":");
        return new Rational(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
    }

    public RationalLarge divide(long j) {
        return new RationalLarge(this.den * j, this.num);
    }

    public RationalLarge divideBy(long j) {
        return new RationalLarge(this.num, this.den * j);
    }

    public long divideByS(long j) {
        return this.num / (this.den * j);
    }

    public long divideS(long j) {
        return (this.den * j) / this.num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RationalLarge.class != obj.getClass()) {
            return false;
        }
        RationalLarge rationalLarge = (RationalLarge) obj;
        return this.den == rationalLarge.den && this.num == rationalLarge.num;
    }

    public RationalLarge flip() {
        return new RationalLarge(this.den, this.num);
    }

    public long getDen() {
        return this.den;
    }

    public long getNum() {
        return this.num;
    }

    public boolean greaterOrEqualTo(RationalLarge rationalLarge) {
        return this.num * rationalLarge.den >= rationalLarge.num * this.den;
    }

    public boolean greaterThen(RationalLarge rationalLarge) {
        return this.num * rationalLarge.den > rationalLarge.num * this.den;
    }

    public int hashCode() {
        long j = this.den;
        int i = (((int) (j ^ (j >>> 32))) + 31) * 31;
        long j2 = this.num;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public boolean lessThen(RationalLarge rationalLarge) {
        return this.num * rationalLarge.den < rationalLarge.num * this.den;
    }

    public RationalLarge minus(RationalLarge rationalLarge) {
        long j = this.num;
        long j2 = rationalLarge.den;
        long j3 = j * j2;
        long j4 = rationalLarge.num;
        long j5 = this.den;
        return MathUtil.reduce(j3 - (j4 * j5), j5 * j2);
    }

    public RationalLarge multiply(long j) {
        return new RationalLarge(this.num * j, this.den);
    }

    public long multiplyS(long j) {
        return (this.num * j) / this.den;
    }

    public RationalLarge plus(RationalLarge rationalLarge) {
        long j = this.num;
        long j2 = rationalLarge.den;
        long j3 = j * j2;
        long j4 = rationalLarge.num;
        long j5 = this.den;
        return MathUtil.reduce(j3 + (j4 * j5), j5 * j2);
    }

    public double scalar() {
        double d = (double) this.num;
        double d2 = (double) this.den;
        Double.isNaN(d);
        Double.isNaN(d2);
        return d / d2;
    }

    public long scalarClip() {
        return this.num / this.den;
    }

    public boolean smallerOrEqualTo(RationalLarge rationalLarge) {
        return this.num * rationalLarge.den <= rationalLarge.num * this.den;
    }

    /* renamed from: R */
    public static RationalLarge m68666R(long j) {
        return m68667R(j, 1);
    }

    public RationalLarge divide(RationalLarge rationalLarge) {
        return MathUtil.reduce(rationalLarge.num * this.den, rationalLarge.den * this.num);
    }

    public RationalLarge divideBy(RationalLarge rationalLarge) {
        return MathUtil.reduce(this.num * rationalLarge.den, this.den * rationalLarge.num);
    }

    public RationalLarge minus(Rational rational) {
        long j = this.num;
        int i = rational.den;
        long j2 = j * ((long) i);
        long j3 = (long) rational.num;
        long j4 = this.den;
        return MathUtil.reduce(j2 - (j3 * j4), j4 * ((long) i));
    }

    public RationalLarge multiply(RationalLarge rationalLarge) {
        return MathUtil.reduce(this.num * rationalLarge.num, this.den * rationalLarge.den);
    }

    public RationalLarge plus(Rational rational) {
        long j = this.num;
        int i = rational.den;
        long j2 = j * ((long) i);
        long j3 = (long) rational.num;
        long j4 = this.den;
        return MathUtil.reduce(j2 + (j3 * j4), j4 * ((long) i));
    }

    public RationalLarge divide(Rational rational) {
        return MathUtil.reduce(((long) rational.num) * this.den, ((long) rational.den) * this.num);
    }

    public RationalLarge divideBy(Rational rational) {
        return MathUtil.reduce(this.num * ((long) rational.den), this.den * ((long) rational.num));
    }

    public RationalLarge minus(long j) {
        long j2 = this.num;
        long j3 = this.den;
        return new RationalLarge(j2 - (j * j3), j3);
    }

    public RationalLarge multiply(Rational rational) {
        return MathUtil.reduce(this.num * ((long) rational.num), this.den * ((long) rational.den));
    }

    public RationalLarge plus(long j) {
        long j2 = this.num;
        long j3 = this.den;
        return new RationalLarge(j2 + (j * j3), j3);
    }

    public boolean equals(RationalLarge rationalLarge) {
        return this.num * rationalLarge.den == rationalLarge.num * this.den;
    }
}
