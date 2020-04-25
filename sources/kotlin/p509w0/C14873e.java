package kotlin.p509w0;

import java.util.Comparator;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.w0.e */
/* compiled from: Comparisons.kt */
final class C14873e implements Comparator<Comparable<? super Object>> {

    /* renamed from: a */
    public static final C14873e f43123a = new C14873e();

    private C14873e() {
    }

    /* renamed from: a */
    public int compare(@C6003d Comparable<Object> comparable, @C6003d Comparable<Object> comparable2) {
        C14445h0.m62478f(comparable, "a");
        C14445h0.m62478f(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    @C6003d
    public final Comparator<Comparable<Object>> reversed() {
        return C14872d.f43122a;
    }
}
