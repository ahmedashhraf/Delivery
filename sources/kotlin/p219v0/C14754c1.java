package kotlin.p219v0;

import com.facebook.share.internal.MessengerShareContentUtility;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import kotlin.C6096e0;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

/* renamed from: kotlin.v0.c1 */
/* compiled from: Sets.kt */
class C14754c1 {
    @C6003d
    /* renamed from: a */
    public static <T> Set<T> m63958a() {
        return C14769e0.f43017a;
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: b */
    private static final <T> HashSet<T> m63962b() {
        return new HashSet<>();
    }

    @C6003d
    /* renamed from: c */
    public static final <T> Set<T> m63966c(@C6003d T... tArr) {
        C14445h0.m62478f(tArr, MessengerShareContentUtility.ELEMENTS);
        return (Set) C14794o.m65011e(tArr, new LinkedHashSet(C14841t0.m65538a(tArr.length)));
    }

    @C6003d
    /* renamed from: d */
    public static final <T> Set<T> m63968d(@C6003d T... tArr) {
        C14445h0.m62478f(tArr, MessengerShareContentUtility.ELEMENTS);
        return tArr.length > 0 ? C14794o.m64265M(tArr) : m63958a();
    }

    @C6041f
    /* renamed from: e */
    private static final <T> Set<T> m63969e() {
        return m63958a();
    }

    @C6003d
    /* renamed from: a */
    public static final <T> HashSet<T> m63957a(@C6003d T... tArr) {
        C14445h0.m62478f(tArr, MessengerShareContentUtility.ELEMENTS);
        return (HashSet) C14794o.m65011e(tArr, new HashSet(C14841t0.m65538a(tArr.length)));
    }

    @C6003d
    /* renamed from: b */
    public static final <T> LinkedHashSet<T> m63963b(@C6003d T... tArr) {
        C14445h0.m62478f(tArr, MessengerShareContentUtility.ELEMENTS);
        return (LinkedHashSet) C14794o.m65011e(tArr, new LinkedHashSet(C14841t0.m65538a(tArr.length)));
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: c */
    private static final <T> LinkedHashSet<T> m63965c() {
        return new LinkedHashSet<>();
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: d */
    private static final <T> Set<T> m63967d() {
        return new LinkedHashSet();
    }

    @C6003d
    /* renamed from: e */
    public static final <T> TreeSet<T> m63970e(@C6003d T... tArr) {
        C14445h0.m62478f(tArr, MessengerShareContentUtility.ELEMENTS);
        return (TreeSet) C14794o.m65011e(tArr, new TreeSet());
    }

    @C6003d
    /* renamed from: a */
    public static <T> Set<T> m63959a(T t) {
        Set<T> singleton = Collections.singleton(t);
        C14445h0.m62453a((Object) singleton, "java.util.Collections.singleton(element)");
        return singleton;
    }

    @C6041f
    /* renamed from: b */
    private static final <T> Set<T> m63964b(@C6004e Set<? extends T> set) {
        return set != null ? set : m63958a();
    }

    @C6003d
    /* renamed from: a */
    public static final <T> TreeSet<T> m63961a(@C6003d Comparator<? super T> comparator, @C6003d T... tArr) {
        C14445h0.m62478f(comparator, "comparator");
        C14445h0.m62478f(tArr, MessengerShareContentUtility.ELEMENTS);
        return (TreeSet) C14794o.m65011e(tArr, new TreeSet(comparator));
    }

    @C6003d
    /* renamed from: a */
    public static <T> Set<T> m63960a(@C6003d Set<? extends T> set) {
        C14445h0.m62478f(set, "$receiver");
        int size = set.size();
        if (size == 0) {
            return m63958a();
        }
        if (size != 1) {
            return set;
        }
        return m63959a((T) set.iterator().next());
    }
}
