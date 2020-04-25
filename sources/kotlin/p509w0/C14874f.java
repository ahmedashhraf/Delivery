package kotlin.p509w0;

import java.util.Comparator;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.w0.f */
/* compiled from: Comparisons.kt */
final class C14874f<T> implements Comparator<T> {
    @C6003d

    /* renamed from: a */
    private final Comparator<T> f43124a;

    public C14874f(@C6003d Comparator<T> comparator) {
        C14445h0.m62478f(comparator, "comparator");
        this.f43124a = comparator;
    }

    @C6003d
    /* renamed from: a */
    public final Comparator<T> mo46332a() {
        return this.f43124a;
    }

    public int compare(T t, T t2) {
        return this.f43124a.compare(t2, t);
    }

    @C6003d
    public final Comparator<T> reversed() {
        return this.f43124a;
    }
}
