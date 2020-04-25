package kotlin;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.r */
/* compiled from: BigDecimals.kt */
class C6118r {
    @C6041f
    /* renamed from: a */
    private static final BigDecimal m28105a(@C6003d BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C14445h0.m62478f(bigDecimal, "$receiver");
        BigDecimal divide = bigDecimal.divide(bigDecimal2, RoundingMode.HALF_EVEN);
        C14445h0.m62453a((Object) divide, "this.divide(other, RoundingMode.HALF_EVEN)");
        return divide;
    }

    @C6041f
    /* renamed from: b */
    private static final BigDecimal m28107b(@C6003d BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C14445h0.m62478f(bigDecimal, "$receiver");
        BigDecimal subtract = bigDecimal.subtract(bigDecimal2);
        C14445h0.m62453a((Object) subtract, "this.subtract(other)");
        return subtract;
    }

    @C6041f
    @C6049b(level = C6093c.WARNING, message = "Use rem(other) instead", replaceWith = @C6094c0(expression = "rem(other)", imports = {}))
    /* renamed from: c */
    private static final BigDecimal m28109c(@C6003d BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C14445h0.m62478f(bigDecimal, "$receiver");
        BigDecimal remainder = bigDecimal.remainder(bigDecimal2);
        C14445h0.m62453a((Object) remainder, "this.remainder(other)");
        return remainder;
    }

    @C6041f
    /* renamed from: d */
    private static final BigDecimal m28110d(@C6003d BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C14445h0.m62478f(bigDecimal, "$receiver");
        BigDecimal add = bigDecimal.add(bigDecimal2);
        C14445h0.m62453a((Object) add, "this.add(other)");
        return add;
    }

    @C6041f
    /* renamed from: e */
    private static final BigDecimal m28111e(@C6003d BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C14445h0.m62478f(bigDecimal, "$receiver");
        BigDecimal remainder = bigDecimal.remainder(bigDecimal2);
        C14445h0.m62453a((Object) remainder, "this.remainder(other)");
        return remainder;
    }

    @C6041f
    /* renamed from: f */
    private static final BigDecimal m28112f(@C6003d BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C14445h0.m62478f(bigDecimal, "$receiver");
        BigDecimal multiply = bigDecimal.multiply(bigDecimal2);
        C14445h0.m62453a((Object) multiply, "this.multiply(other)");
        return multiply;
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final BigDecimal m28104a(@C6003d BigDecimal bigDecimal) {
        C14445h0.m62478f(bigDecimal, "$receiver");
        BigDecimal subtract = bigDecimal.subtract(BigDecimal.ONE);
        C14445h0.m62453a((Object) subtract, "this.subtract(BigDecimal.ONE)");
        return subtract;
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: b */
    private static final BigDecimal m28106b(@C6003d BigDecimal bigDecimal) {
        C14445h0.m62478f(bigDecimal, "$receiver");
        BigDecimal add = bigDecimal.add(BigDecimal.ONE);
        C14445h0.m62453a((Object) add, "this.add(BigDecimal.ONE)");
        return add;
    }

    @C6041f
    /* renamed from: c */
    private static final BigDecimal m28108c(@C6003d BigDecimal bigDecimal) {
        C14445h0.m62478f(bigDecimal, "$receiver");
        BigDecimal negate = bigDecimal.negate();
        C14445h0.m62453a((Object) negate, "this.negate()");
        return negate;
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final BigDecimal m28100a(int i) {
        BigDecimal valueOf = BigDecimal.valueOf((long) i);
        C14445h0.m62453a((Object) valueOf, "BigDecimal.valueOf(this.toLong())");
        return valueOf;
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final BigDecimal m28101a(int i, MathContext mathContext) {
        return new BigDecimal(i, mathContext);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final BigDecimal m28102a(long j) {
        BigDecimal valueOf = BigDecimal.valueOf(j);
        C14445h0.m62453a((Object) valueOf, "BigDecimal.valueOf(this)");
        return valueOf;
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final BigDecimal m28103a(long j, MathContext mathContext) {
        return new BigDecimal(j, mathContext);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final BigDecimal m28098a(float f) {
        return new BigDecimal(String.valueOf(f));
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final BigDecimal m28099a(float f, MathContext mathContext) {
        return new BigDecimal(String.valueOf(f), mathContext);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final BigDecimal m28096a(double d) {
        return new BigDecimal(String.valueOf(d));
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final BigDecimal m28097a(double d, MathContext mathContext) {
        return new BigDecimal(String.valueOf(d), mathContext);
    }
}
