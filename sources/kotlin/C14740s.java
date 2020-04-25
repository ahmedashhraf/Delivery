package kotlin;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.s */
/* compiled from: BigIntegers.kt */
class C14740s extends C6118r {
    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final BigInteger m63896a(@C6003d BigInteger bigInteger) {
        C14445h0.m62478f(bigInteger, "$receiver");
        BigInteger subtract = bigInteger.subtract(BigInteger.ONE);
        C14445h0.m62453a((Object) subtract, "this.subtract(BigInteger.ONE)");
        return subtract;
    }

    @C6041f
    /* renamed from: b */
    private static final BigInteger m63901b(@C6003d BigInteger bigInteger, BigInteger bigInteger2) {
        C14445h0.m62478f(bigInteger, "$receiver");
        BigInteger divide = bigInteger.divide(bigInteger2);
        C14445h0.m62453a((Object) divide, "this.divide(other)");
        return divide;
    }

    @C6041f
    /* renamed from: c */
    private static final BigInteger m63903c(@C6003d BigInteger bigInteger, BigInteger bigInteger2) {
        C14445h0.m62478f(bigInteger, "$receiver");
        BigInteger subtract = bigInteger.subtract(bigInteger2);
        C14445h0.m62453a((Object) subtract, "this.subtract(other)");
        return subtract;
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: d */
    private static final BigInteger m63905d(@C6003d BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger or = bigInteger.or(bigInteger2);
        C14445h0.m62453a((Object) or, "this.or(other)");
        return or;
    }

    @C6041f
    /* renamed from: e */
    private static final BigInteger m63907e(@C6003d BigInteger bigInteger, BigInteger bigInteger2) {
        C14445h0.m62478f(bigInteger, "$receiver");
        BigInteger add = bigInteger.add(bigInteger2);
        C14445h0.m62453a((Object) add, "this.add(other)");
        return add;
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: f */
    private static final BigInteger m63908f(@C6003d BigInteger bigInteger, BigInteger bigInteger2) {
        C14445h0.m62478f(bigInteger, "$receiver");
        BigInteger remainder = bigInteger.remainder(bigInteger2);
        C14445h0.m62453a((Object) remainder, "this.remainder(other)");
        return remainder;
    }

    @C6041f
    /* renamed from: g */
    private static final BigInteger m63909g(@C6003d BigInteger bigInteger, BigInteger bigInteger2) {
        C14445h0.m62478f(bigInteger, "$receiver");
        BigInteger multiply = bigInteger.multiply(bigInteger2);
        C14445h0.m62453a((Object) multiply, "this.multiply(other)");
        return multiply;
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: h */
    private static final BigInteger m63910h(@C6003d BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger xor = bigInteger.xor(bigInteger2);
        C14445h0.m62453a((Object) xor, "this.xor(other)");
        return xor;
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final BigInteger m63898a(@C6003d BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger and = bigInteger.and(bigInteger2);
        C14445h0.m62453a((Object) and, "this.and(other)");
        return and;
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: b */
    private static final BigInteger m63899b(@C6003d BigInteger bigInteger) {
        C14445h0.m62478f(bigInteger, "$receiver");
        BigInteger add = bigInteger.add(BigInteger.ONE);
        C14445h0.m62453a((Object) add, "this.add(BigInteger.ONE)");
        return add;
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: c */
    private static final BigInteger m63902c(@C6003d BigInteger bigInteger) {
        BigInteger not = bigInteger.not();
        C14445h0.m62453a((Object) not, "this.not()");
        return not;
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: d */
    private static final BigDecimal m63904d(@C6003d BigInteger bigInteger) {
        return new BigDecimal(bigInteger);
    }

    @C6041f
    /* renamed from: e */
    private static final BigInteger m63906e(@C6003d BigInteger bigInteger) {
        C14445h0.m62478f(bigInteger, "$receiver");
        BigInteger negate = bigInteger.negate();
        C14445h0.m62453a((Object) negate, "this.negate()");
        return negate;
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final BigInteger m63897a(@C6003d BigInteger bigInteger, int i) {
        BigInteger shiftLeft = bigInteger.shiftLeft(i);
        C14445h0.m62453a((Object) shiftLeft, "this.shiftLeft(n)");
        return shiftLeft;
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: b */
    private static final BigInteger m63900b(@C6003d BigInteger bigInteger, int i) {
        BigInteger shiftRight = bigInteger.shiftRight(i);
        C14445h0.m62453a((Object) shiftRight, "this.shiftRight(n)");
        return shiftRight;
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final BigInteger m63894a(int i) {
        BigInteger valueOf = BigInteger.valueOf((long) i);
        C14445h0.m62453a((Object) valueOf, "BigInteger.valueOf(this.toLong())");
        return valueOf;
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final BigInteger m63895a(long j) {
        BigInteger valueOf = BigInteger.valueOf(j);
        C14445h0.m62453a((Object) valueOf, "BigInteger.valueOf(this)");
        return valueOf;
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    static /* synthetic */ BigDecimal m63893a(BigInteger bigInteger, int i, MathContext mathContext, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
            C14445h0.m62453a((Object) mathContext, "MathContext.UNLIMITED");
        }
        return new BigDecimal(bigInteger, i, mathContext);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final BigDecimal m63892a(@C6003d BigInteger bigInteger, int i, MathContext mathContext) {
        return new BigDecimal(bigInteger, i, mathContext);
    }
}
