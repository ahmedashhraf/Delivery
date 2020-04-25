package org.jcodec.common.model;

import org.jcodec.common.StringUtils;
import org.jcodec.common.tools.MathUtil;

public class Rational {
    public static final Rational HALF = new Rational(1, 2);
    public static final Rational ONE = new Rational(1, 1);
    public static final Rational ZERO = new Rational(0, 1);
    final int den;
    final int num;

    public Rational(int i, int i2) {
        this.num = i;
        this.den = i2;
    }

    /* renamed from: R */
    public static Rational m68665R(int i, int i2) {
        return new Rational(i, i2);
    }

    public static Rational parse(String str) {
        String[] split = StringUtils.split(str, ":");
        return new Rational(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
    }

    public long divide(long j) {
        return (((long) this.den) * j) / ((long) this.num);
    }

    public Rational divideBy(int i) {
        return new Rational(this.num, this.den * i);
    }

    public int divideByS(int i) {
        return this.num / (this.den * i);
    }

    public int divideS(int i) {
        return (int) ((((long) this.den) * ((long) i)) / ((long) this.num));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Rational.class != obj.getClass()) {
            return false;
        }
        Rational rational = (Rational) obj;
        return this.den == rational.den && this.num == rational.num;
    }

    public Rational flip() {
        return new Rational(this.den, this.num);
    }

    public int getDen() {
        return this.den;
    }

    public int getNum() {
        return this.num;
    }

    public boolean greaterOrEqualTo(Rational rational) {
        return this.num * rational.den >= rational.num * this.den;
    }

    public boolean greaterThen(Rational rational) {
        return this.num * rational.den > rational.num * this.den;
    }

    public int hashCode() {
        return ((this.den + 31) * 31) + this.num;
    }

    public Rational minus(Rational rational) {
        int i = this.num;
        int i2 = rational.den;
        int i3 = i * i2;
        int i4 = rational.num;
        int i5 = this.den;
        return MathUtil.reduce(i3 - (i4 * i5), i5 * i2);
    }

    public long multiply(long j) {
        return (((long) this.num) * j) / ((long) this.den);
    }

    public int multiplyS(int i) {
        return (int) ((((long) this.num) * ((long) i)) / ((long) this.den));
    }

    public Rational plus(Rational rational) {
        int i = this.num;
        int i2 = rational.den;
        int i3 = i * i2;
        int i4 = rational.num;
        int i5 = this.den;
        return MathUtil.reduce(i3 + (i4 * i5), i5 * i2);
    }

    public float scalar() {
        return ((float) this.num) / ((float) this.den);
    }

    public int scalarClip() {
        return this.num / this.den;
    }

    public boolean smallerOrEqualTo(Rational rational) {
        return this.num * rational.den <= rational.num * this.den;
    }

    public boolean smallerThen(Rational rational) {
        return this.num * rational.den < rational.num * this.den;
    }

    /* renamed from: R */
    public static Rational m68664R(int i) {
        return m68665R(i, 1);
    }

    public Rational divide(int i) {
        return new Rational(this.den * i, this.num);
    }

    public Rational divideBy(Rational rational) {
        return MathUtil.reduce(this.num * rational.den, this.den * rational.num);
    }

    public RationalLarge minus(RationalLarge rationalLarge) {
        long j = (long) this.num;
        long j2 = rationalLarge.den;
        long j3 = j * j2;
        long j4 = rationalLarge.num;
        int i = this.den;
        return MathUtil.reduce(j3 - (j4 * ((long) i)), ((long) i) * j2);
    }

    public Rational multiply(int i) {
        return new Rational(this.num * i, this.den);
    }

    public RationalLarge plus(RationalLarge rationalLarge) {
        long j = (long) this.num;
        long j2 = rationalLarge.den;
        long j3 = j * j2;
        long j4 = rationalLarge.num;
        int i = this.den;
        return MathUtil.reduce(j3 + (j4 * ((long) i)), ((long) i) * j2);
    }

    public Rational divide(Rational rational) {
        return MathUtil.reduce(rational.num * this.den, rational.den * this.num);
    }

    public RationalLarge divideBy(RationalLarge rationalLarge) {
        return MathUtil.reduce(((long) this.num) * rationalLarge.den, ((long) this.den) * rationalLarge.num);
    }

    public Rational minus(int i) {
        int i2 = this.num;
        int i3 = this.den;
        return new Rational(i2 - (i * i3), i3);
    }

    public Rational multiply(Rational rational) {
        return MathUtil.reduce(this.num * rational.num, this.den * rational.den);
    }

    public Rational plus(int i) {
        int i2 = this.num;
        int i3 = this.den;
        return new Rational(i2 + (i * i3), i3);
    }

    public RationalLarge divide(RationalLarge rationalLarge) {
        return MathUtil.reduce(rationalLarge.num * ((long) this.den), rationalLarge.den * ((long) this.num));
    }

    public RationalLarge multiply(RationalLarge rationalLarge) {
        return MathUtil.reduce(((long) this.num) * rationalLarge.num, ((long) this.den) * rationalLarge.den);
    }

    public boolean equals(Rational rational) {
        return this.num * rational.den == rational.num * this.den;
    }
}
