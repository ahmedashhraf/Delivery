package kotlin.p504e1;

import kotlin.C6096e0;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.e1.p */
/* compiled from: Ranges.kt */
class C14533p {
    @C6003d
    /* renamed from: a */
    public static final <T extends Comparable<? super T>> C14519g<T> m62896a(@C6003d T t, @C6003d T t2) {
        C14445h0.m62478f(t, "$receiver");
        C14445h0.m62478f(t2, "that");
        return new C14521h(t, t2);
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static final C14517f<Double> m62894a(double d, double d2) {
        return new C14515d(d, d2);
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static final C14517f<Float> m62895a(float f, float f2) {
        return new C14516e(f, f2);
    }

    /* renamed from: a */
    public static final void m62897a(boolean z, @C6003d Number number) {
        C14445h0.m62478f(number, "step");
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Step must be positive, was: ");
            sb.append(number);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
