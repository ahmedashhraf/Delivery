package p076c.p112d.p148d.p150g;

import com.google.common.base.C7397x;
import java.math.BigInteger;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5944c;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: c.d.d.g.m */
/* compiled from: UnsignedInteger */
public final class C2779m extends Number implements Comparable<C2779m> {

    /* renamed from: N */
    public static final C2779m f9916N = m13347b(1);

    /* renamed from: O */
    public static final C2779m f9917O = m13347b(-1);

    /* renamed from: b */
    public static final C2779m f9918b = m13347b(0);

    /* renamed from: a */
    private final int f9919a;

    private C2779m(int i) {
        this.f9919a = i & -1;
    }

    /* renamed from: a */
    public static C2779m m13344a(long j) {
        C7397x.m35672a((4294967295L & j) == j, "value (%s) is outside the range for an unsigned integer value", Long.valueOf(j));
        return m13347b((int) j);
    }

    /* renamed from: b */
    public static C2779m m13347b(int i) {
        return new C2779m(i);
    }

    @C5944c
    /* renamed from: c */
    public C2779m mo10491c(C2779m mVar) {
        return m13347b(this.f9919a - ((C2779m) C7397x.m35664a(mVar)).f9919a);
    }

    @C5944c
    /* renamed from: d */
    public C2779m mo10493d(C2779m mVar) {
        return m13347b(C6658n.m31796c(this.f9919a, ((C2779m) C7397x.m35664a(mVar)).f9919a));
    }

    public double doubleValue() {
        return (double) longValue();
    }

    @C5944c
    /* renamed from: e */
    public C2779m mo10496e(C2779m mVar) {
        return m13347b(this.f9919a + ((C2779m) C7397x.m35664a(mVar)).f9919a);
    }

    public boolean equals(@C5952h Object obj) {
        if (!(obj instanceof C2779m)) {
            return false;
        }
        if (this.f9919a == ((C2779m) obj).f9919a) {
            return true;
        }
        return false;
    }

    @C2777c("Does not truncate correctly")
    @C5944c
    /* renamed from: f */
    public C2779m mo10498f(C2779m mVar) {
        return m13347b(this.f9919a * ((C2779m) C7397x.m35664a(mVar)).f9919a);
    }

    public float floatValue() {
        return (float) longValue();
    }

    public int hashCode() {
        return this.f9919a;
    }

    public int intValue() {
        return this.f9919a;
    }

    public long longValue() {
        return C6658n.m31795b(this.f9919a);
    }

    public String toString() {
        return mo10489a(10);
    }

    /* renamed from: b */
    public static C2779m m13348b(String str) {
        return m13345a(str, 10);
    }

    /* renamed from: d */
    public BigInteger mo10494d() {
        return BigInteger.valueOf(longValue());
    }

    /* renamed from: a */
    public static C2779m m13346a(BigInteger bigInteger) {
        C7397x.m35664a(bigInteger);
        C7397x.m35672a(bigInteger.signum() >= 0 && bigInteger.bitLength() <= 32, "value (%s) is outside the range for an unsigned integer value", bigInteger);
        return m13347b(bigInteger.intValue());
    }

    @C5944c
    /* renamed from: b */
    public C2779m mo10490b(C2779m mVar) {
        return m13347b(C6658n.m31792b(this.f9919a, ((C2779m) C7397x.m35664a(mVar)).f9919a));
    }

    /* renamed from: a */
    public static C2779m m13345a(String str, int i) {
        return m13347b(C6658n.m31788a(str, i));
    }

    /* renamed from: a */
    public int compareTo(C2779m mVar) {
        C7397x.m35664a(mVar);
        return C6658n.m31786a(this.f9919a, mVar.f9919a);
    }

    /* renamed from: a */
    public String mo10489a(int i) {
        return C6658n.m31798d(this.f9919a, i);
    }
}
