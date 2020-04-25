package kotlin.p219v0;

import java.util.List;
import kotlin.p214b1.C6055e;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p504e1.C14525k;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.v0.y */
/* compiled from: ReversedViews.kt */
class C14846y extends C6135x {
    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final int m65640c(@C6003d List<?> list, int i) {
        int a = C6129u.m28125a(list);
        if (i >= 0 && a >= i) {
            return C6129u.m28125a(list) - i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Element index ");
        sb.append(i);
        sb.append(" must be in range [");
        sb.append(new C14525k(0, C6129u.m28125a(list)));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final int m65642d(@C6003d List<?> list, int i) {
        int size = list.size();
        if (i >= 0 && size >= i) {
            return list.size() - i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Position index ");
        sb.append(i);
        sb.append(" must be in range [");
        sb.append(new C14525k(0, list.size()));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @C6003d
    @C6055e(name = "asReversedMutable")
    /* renamed from: e */
    public static final <T> List<T> m65643e(@C6003d List<T> list) {
        C14445h0.m62478f(list, "$receiver");
        return new C14847y0(list);
    }

    @C6003d
    /* renamed from: c */
    public static final <T> List<T> m65641c(@C6003d List<? extends T> list) {
        C14445h0.m62478f(list, "$receiver");
        return new C14853z0(list);
    }
}
