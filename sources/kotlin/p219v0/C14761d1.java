package kotlin.p219v0;

import com.facebook.share.internal.MessengerShareContentUtility;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p506g1.C14594m;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.v0.d1 */
/* compiled from: _Sets.kt */
class C14761d1 extends C14754c1 {
    @C6003d
    /* renamed from: a */
    public static final <T> Set<T> m63987a(@C6003d Set<? extends T> set, T t) {
        C14445h0.m62478f(set, "$receiver");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C14841t0.m65538a(set.size()));
        boolean z = false;
        for (Object next : set) {
            boolean z2 = true;
            if (!z && C14445h0.m62463a(next, (Object) t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(next);
            }
        }
        return linkedHashSet;
    }

    @C6041f
    /* renamed from: b */
    private static final <T> Set<T> m63991b(@C6003d Set<? extends T> set, T t) {
        return m63987a(set, t);
    }

    @C6003d
    /* renamed from: c */
    public static final <T> Set<T> m63994c(@C6003d Set<? extends T> set, T t) {
        C14445h0.m62478f(set, "$receiver");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C14841t0.m65538a(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }

    @C6041f
    /* renamed from: d */
    private static final <T> Set<T> m63995d(@C6003d Set<? extends T> set, T t) {
        return m63994c(set, t);
    }

    @C6003d
    /* renamed from: b */
    public static final <T> Set<T> m63993b(@C6003d Set<? extends T> set, @C6003d T[] tArr) {
        C14445h0.m62478f(set, "$receiver");
        C14445h0.m62478f(tArr, MessengerShareContentUtility.ELEMENTS);
        LinkedHashSet linkedHashSet = new LinkedHashSet(C14841t0.m65538a(set.size() + tArr.length));
        linkedHashSet.addAll(set);
        C6135x.m28184a((Collection<? super T>) linkedHashSet, tArr);
        return linkedHashSet;
    }

    @C6003d
    /* renamed from: a */
    public static final <T> Set<T> m63989a(@C6003d Set<? extends T> set, @C6003d T[] tArr) {
        C14445h0.m62478f(set, "$receiver");
        C14445h0.m62478f(tArr, MessengerShareContentUtility.ELEMENTS);
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        C6135x.m28203d((Collection<? super T>) linkedHashSet, tArr);
        return linkedHashSet;
    }

    @C6003d
    /* renamed from: b */
    public static final <T> Set<T> m63990b(@C6003d Set<? extends T> set, @C6003d Iterable<? extends T> iterable) {
        int i;
        C14445h0.m62478f(set, "$receiver");
        C14445h0.m62478f(iterable, MessengerShareContentUtility.ELEMENTS);
        Integer a = C6131v.m28160a(iterable);
        if (a != null) {
            i = set.size() + a.intValue();
        } else {
            i = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C14841t0.m65538a(i));
        linkedHashSet.addAll(set);
        C6135x.m28181a((Collection<? super T>) linkedHashSet, iterable);
        return linkedHashSet;
    }

    @C6003d
    /* renamed from: a */
    public static final <T> Set<T> m63986a(@C6003d Set<? extends T> set, @C6003d Iterable<? extends T> iterable) {
        C14445h0.m62478f(set, "$receiver");
        C14445h0.m62478f(iterable, MessengerShareContentUtility.ELEMENTS);
        Collection a = C6131v.m28162a(iterable, (Iterable<? extends T>) set);
        if (a.isEmpty()) {
            return C14848z.m65672P(set);
        }
        if (a instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object next : set) {
                if (!a.contains(next)) {
                    linkedHashSet.add(next);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(a);
        return linkedHashSet2;
    }

    @C6003d
    /* renamed from: b */
    public static final <T> Set<T> m63992b(@C6003d Set<? extends T> set, @C6003d C14594m<? extends T> mVar) {
        C14445h0.m62478f(set, "$receiver");
        C14445h0.m62478f(mVar, MessengerShareContentUtility.ELEMENTS);
        LinkedHashSet linkedHashSet = new LinkedHashSet(C14841t0.m65538a(set.size() * 2));
        linkedHashSet.addAll(set);
        C6135x.m28183a((Collection<? super T>) linkedHashSet, mVar);
        return linkedHashSet;
    }

    @C6003d
    /* renamed from: a */
    public static final <T> Set<T> m63988a(@C6003d Set<? extends T> set, @C6003d C14594m<? extends T> mVar) {
        C14445h0.m62478f(set, "$receiver");
        C14445h0.m62478f(mVar, MessengerShareContentUtility.ELEMENTS);
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        C6135x.m28202d((Collection<? super T>) linkedHashSet, mVar);
        return linkedHashSet;
    }
}
