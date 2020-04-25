package p076c.p112d.p148d.p150g;

import com.google.common.base.C7397x;
import java.io.Serializable;
import java.math.BigInteger;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5944c;
import p201f.p202a.C5952h;

@C2776b(serializable = true)
/* renamed from: c.d.d.g.o */
/* compiled from: UnsignedLong */
public final class C2780o extends Number implements Comparable<C2780o>, Serializable {

    /* renamed from: N */
    public static final C2780o f9920N = new C2780o(0);

    /* renamed from: O */
    public static final C2780o f9921O = new C2780o(1);

    /* renamed from: P */
    public static final C2780o f9922P = new C2780o(-1);

    /* renamed from: b */
    private static final long f9923b = Long.MAX_VALUE;

    /* renamed from: a */
    private final long f9924a;

    private C2780o(long j) {
        this.f9924a = j;
    }

    /* renamed from: a */
    public static C2780o m13357a(long j) {
        return new C2780o(j);
    }

    /* renamed from: b */
    public static C2780o m13360b(long j) {
        C7397x.m35672a(j >= 0, "value (%s) is outside the range for an unsigned long value", Long.valueOf(j));
        return m13357a(j);
    }

    /* renamed from: c */
    public C2780o mo10507c(C2780o oVar) {
        return m13357a(this.f9924a - ((C2780o) C7397x.m35664a(oVar)).f9924a);
    }

    @C5944c
    /* renamed from: d */
    public C2780o mo10509d(C2780o oVar) {
        return m13357a(C6660p.m31813c(this.f9924a, ((C2780o) C7397x.m35664a(oVar)).f9924a));
    }

    public double doubleValue() {
        long j = this.f9924a;
        double d = (double) (Long.MAX_VALUE & j);
        if (j >= 0) {
            return d;
        }
        Double.isNaN(d);
        return d + 9.223372036854776E18d;
    }

    /* renamed from: e */
    public C2780o mo10512e(C2780o oVar) {
        return m13357a(this.f9924a + ((C2780o) C7397x.m35664a(oVar)).f9924a);
    }

    public boolean equals(@C5952h Object obj) {
        if (!(obj instanceof C2780o)) {
            return false;
        }
        if (this.f9924a == ((C2780o) obj).f9924a) {
            return true;
        }
        return false;
    }

    @C5944c
    /* renamed from: f */
    public C2780o mo10514f(C2780o oVar) {
        return m13357a(this.f9924a * ((C2780o) C7397x.m35664a(oVar)).f9924a);
    }

    public float floatValue() {
        long j = this.f9924a;
        float f = (float) (Long.MAX_VALUE & j);
        return j < 0 ? f + 9.223372E18f : f;
    }

    public int hashCode() {
        return C6641g.m31690a(this.f9924a);
    }

    public int intValue() {
        return (int) this.f9924a;
    }

    public long longValue() {
        return this.f9924a;
    }

    public String toString() {
        return C6660p.m31812b(this.f9924a);
    }

    /* renamed from: a */
    public static C2780o m13359a(BigInteger bigInteger) {
        C7397x.m35664a(bigInteger);
        C7397x.m35672a(bigInteger.signum() >= 0 && bigInteger.bitLength() <= 64, "value (%s) is outside the range for an unsigned long value", bigInteger);
        return m13357a(bigInteger.longValue());
    }

    /* renamed from: d */
    public BigInteger mo10510d() {
        BigInteger valueOf = BigInteger.valueOf(this.f9924a & Long.MAX_VALUE);
        return this.f9924a < 0 ? valueOf.setBit(63) : valueOf;
    }

    /* renamed from: b */
    public static C2780o m13361b(String str) {
        return m13358a(str, 10);
    }

    @C5944c
    /* renamed from: b */
    public C2780o mo10506b(C2780o oVar) {
        return m13357a(C6660p.m31809b(this.f9924a, ((C2780o) C7397x.m35664a(oVar)).f9924a));
    }

    /* renamed from: a */
    public static C2780o m13358a(String str, int i) {
        return m13357a(C6660p.m31803a(str, i));
    }

    /* renamed from: a */
    public int compareTo(C2780o oVar) {
        C7397x.m35664a(oVar);
        return C6660p.m31800a(this.f9924a, oVar.f9924a);
    }

    /* renamed from: a */
    public String mo10505a(int i) {
        return C6660p.m31805a(this.f9924a, i);
    }
}
