package kotlin.p219v0;

import com.facebook.share.internal.MessengerShareContentUtility;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.RandomAccess;
import kotlin.C14743v;
import kotlin.C6049b;
import kotlin.C6093c;
import kotlin.C6094c0;
import kotlin.C6096e0;
import kotlin.TypeCastException;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p215t.C6084p;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14461m1;
import kotlin.p506g1.C14594m;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.v0.x */
/* compiled from: MutableCollections.kt */
class C6135x extends C6133w {
    @C6041f
    /* renamed from: a */
    private static final <T> boolean m28182a(@C6003d Collection<? extends T> collection, Collection<? extends T> collection2) {
        if (collection != null) {
            return C14461m1.m62531a((Object) collection).removeAll(collection2);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
    }

    @C6041f
    /* renamed from: b */
    private static final <T> boolean m28193b(@C6003d Collection<? extends T> collection, Collection<? extends T> collection2) {
        if (collection != null) {
            return C14461m1.m62531a((Object) collection).retainAll(collection2);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
    }

    @C6041f
    /* renamed from: c */
    private static final <T> boolean m28199c(@C6003d Collection<? extends T> collection, T t) {
        if (collection != null) {
            return C14461m1.m62531a((Object) collection).remove(t);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
    }

    /* renamed from: d */
    public static final <T> boolean m28201d(@C6003d Collection<? super T> collection, @C6003d Iterable<? extends T> iterable) {
        C14445h0.m62478f(collection, "$receiver");
        C14445h0.m62478f(iterable, MessengerShareContentUtility.ELEMENTS);
        return C14461m1.m62531a((Object) collection).removeAll(C6131v.m28162a(iterable, (Iterable<? extends T>) collection));
    }

    /* renamed from: e */
    public static final <T> boolean m28205e(@C6003d Collection<? super T> collection, @C6003d Iterable<? extends T> iterable) {
        C14445h0.m62478f(collection, "$receiver");
        C14445h0.m62478f(iterable, MessengerShareContentUtility.ELEMENTS);
        return C14461m1.m62531a((Object) collection).retainAll(C6131v.m28162a(iterable, (Iterable<? extends T>) collection));
    }

    @C6041f
    @C6049b(level = C6093c.ERROR, message = "Use removeAt(index) instead.", replaceWith = @C6094c0(expression = "removeAt(index)", imports = {}))
    /* renamed from: a */
    private static final <T> T m28171a(@C6003d List<T> list, int i) {
        return list.remove(i);
    }

    @C6041f
    /* renamed from: b */
    private static final <T> void m28188b(@C6003d Collection<? super T> collection, T t) {
        C14445h0.m62478f(collection, "$receiver");
        collection.add(t);
    }

    @C6041f
    /* renamed from: c */
    private static final <T> void m28195c(@C6003d Collection<? super T> collection, Iterable<? extends T> iterable) {
        C14445h0.m62478f(collection, "$receiver");
        m28181a(collection, iterable);
    }

    /* renamed from: d */
    public static final <T> boolean m28202d(@C6003d Collection<? super T> collection, @C6003d C14594m<? extends T> mVar) {
        C14445h0.m62478f(collection, "$receiver");
        C14445h0.m62478f(mVar, MessengerShareContentUtility.ELEMENTS);
        HashSet J = C14604p.m63209J(mVar);
        return (J.isEmpty() ^ true) && collection.removeAll(J);
    }

    /* renamed from: e */
    public static final <T> boolean m28207e(@C6003d Collection<? super T> collection, @C6003d T[] tArr) {
        C14445h0.m62478f(collection, "$receiver");
        C14445h0.m62478f(tArr, MessengerShareContentUtility.ELEMENTS);
        if (!(tArr.length == 0)) {
            return collection.retainAll(C14794o.m64221I(tArr));
        }
        return m28180a(collection);
    }

    @C6041f
    @C6049b(level = C6093c.ERROR, message = "Use sortWith(comparator) instead.", replaceWith = @C6094c0(expression = "this.sortWith(comparator)", imports = {}))
    /* renamed from: a */
    private static final <T> void m28175a(@C6003d List<T> list, Comparator<? super T> comparator) {
        throw new C14743v(null, 1, null);
    }

    @C6041f
    /* renamed from: b */
    private static final <T> void m28187b(@C6003d Collection<? super T> collection, Iterable<? extends T> iterable) {
        C14445h0.m62478f(collection, "$receiver");
        m28201d(collection, iterable);
    }

    @C6041f
    /* renamed from: c */
    private static final <T> void m28197c(@C6003d Collection<? super T> collection, T[] tArr) {
        C14445h0.m62478f(collection, "$receiver");
        m28184a(collection, tArr);
    }

    @C6041f
    @C6049b(level = C6093c.ERROR, message = "Use sortWith(Comparator(comparison)) instead.", replaceWith = @C6094c0(expression = "this.sortWith(Comparator(comparison))", imports = {}))
    /* renamed from: a */
    private static final <T> void m28177a(@C6003d List<T> list, C6084p<? super T, ? super T, Integer> pVar) {
        throw new C14743v(null, 1, null);
    }

    @C6041f
    /* renamed from: b */
    private static final <T> void m28190b(@C6003d Collection<? super T> collection, T[] tArr) {
        C14445h0.m62478f(collection, "$receiver");
        m28203d(collection, tArr);
    }

    @C6041f
    /* renamed from: c */
    private static final <T> void m28196c(@C6003d Collection<? super T> collection, C14594m<? extends T> mVar) {
        C14445h0.m62478f(collection, "$receiver");
        m28183a(collection, mVar);
    }

    /* renamed from: d */
    public static final <T> boolean m28203d(@C6003d Collection<? super T> collection, @C6003d T[] tArr) {
        C14445h0.m62478f(collection, "$receiver");
        C14445h0.m62478f(tArr, MessengerShareContentUtility.ELEMENTS);
        return ((tArr.length == 0) ^ true) && collection.removeAll(C14794o.m64221I(tArr));
    }

    @C6041f
    /* renamed from: a */
    private static final <T> void m28173a(@C6003d Collection<? super T> collection, T t) {
        C14445h0.m62478f(collection, "$receiver");
        collection.remove(t);
    }

    @C6041f
    /* renamed from: b */
    private static final <T> void m28189b(@C6003d Collection<? super T> collection, C14594m<? extends T> mVar) {
        C14445h0.m62478f(collection, "$receiver");
        m28202d(collection, mVar);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: c */
    private static final <T> void m28198c(@C6003d List<T> list) {
        Collections.shuffle(list);
    }

    /* renamed from: d */
    public static <T extends Comparable<? super T>> void m28200d(@C6003d List<T> list) {
        C14445h0.m62478f(list, "$receiver");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* renamed from: e */
    public static final <T> boolean m28206e(@C6003d Collection<? super T> collection, @C6003d C14594m<? extends T> mVar) {
        C14445h0.m62478f(collection, "$receiver");
        C14445h0.m62478f(mVar, MessengerShareContentUtility.ELEMENTS);
        HashSet J = C14604p.m63209J(mVar);
        if (!J.isEmpty()) {
            return collection.retainAll(J);
        }
        return m28180a(collection);
    }

    /* renamed from: a */
    public static <T> boolean m28181a(@C6003d Collection<? super T> collection, @C6003d Iterable<? extends T> iterable) {
        C14445h0.m62478f(collection, "$receiver");
        C14445h0.m62478f(iterable, MessengerShareContentUtility.ELEMENTS);
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public static <T> boolean m28192b(@C6003d Iterable<? extends T> iterable, @C6003d C6080l<? super T, Boolean> lVar) {
        C14445h0.m62478f(iterable, "$receiver");
        C14445h0.m62478f(lVar, "predicate");
        return m28179a(iterable, lVar, false);
    }

    /* renamed from: b */
    public static final <T> boolean m28194b(@C6003d List<T> list, @C6003d C6080l<? super T, Boolean> lVar) {
        C14445h0.m62478f(list, "$receiver");
        C14445h0.m62478f(lVar, "predicate");
        return m28186a(list, lVar, false);
    }

    /* renamed from: b */
    public static <T> void m28191b(@C6003d List<T> list, @C6003d Comparator<? super T> comparator) {
        C14445h0.m62478f(list, "$receiver");
        C14445h0.m62478f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: a */
    public static <T> boolean m28183a(@C6003d Collection<? super T> collection, @C6003d C14594m<? extends T> mVar) {
        C14445h0.m62478f(collection, "$receiver");
        C14445h0.m62478f(mVar, MessengerShareContentUtility.ELEMENTS);
        boolean z = false;
        for (Object add : mVar) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }

    @C6003d
    @C6096e0(version = "1.2")
    /* renamed from: e */
    public static final <T> List<T> m28204e(@C6003d Iterable<? extends T> iterable) {
        C14445h0.m62478f(iterable, "$receiver");
        List<T> N = C14848z.m65670N(iterable);
        Collections.shuffle(N);
        return N;
    }

    /* renamed from: a */
    public static final <T> boolean m28184a(@C6003d Collection<? super T> collection, @C6003d T[] tArr) {
        C14445h0.m62478f(collection, "$receiver");
        C14445h0.m62478f(tArr, MessengerShareContentUtility.ELEMENTS);
        return collection.addAll(C14794o.m64862c(tArr));
    }

    /* renamed from: a */
    public static final <T> boolean m28178a(@C6003d Iterable<? extends T> iterable, @C6003d C6080l<? super T, Boolean> lVar) {
        C14445h0.m62478f(iterable, "$receiver");
        C14445h0.m62478f(lVar, "predicate");
        return m28179a(iterable, lVar, true);
    }

    /* renamed from: a */
    private static final <T> boolean m28179a(@C6003d Iterable<? extends T> iterable, C6080l<? super T, Boolean> lVar, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: a */
    public static final <T> boolean m28185a(@C6003d List<T> list, @C6003d C6080l<? super T, Boolean> lVar) {
        C14445h0.m62478f(list, "$receiver");
        C14445h0.m62478f(lVar, "predicate");
        return m28186a(list, lVar, true);
    }

    /* renamed from: a */
    private static final <T> boolean m28186a(@C6003d List<T> list, C6080l<? super T, Boolean> lVar, boolean z) {
        int i;
        if (list instanceof RandomAccess) {
            int a = C6129u.m28125a(list);
            if (a >= 0) {
                int i2 = 0;
                i = 0;
                while (true) {
                    Object obj = list.get(i2);
                    if (((Boolean) lVar.invoke(obj)).booleanValue() != z) {
                        if (i != i2) {
                            list.set(i, obj);
                        }
                        i++;
                    }
                    if (i2 == a) {
                        break;
                    }
                    i2++;
                }
            } else {
                i = 0;
            }
            if (i >= list.size()) {
                return false;
            }
            int a2 = C6129u.m28125a(list);
            if (a2 >= i) {
                while (true) {
                    list.remove(a2);
                    if (a2 == i) {
                        break;
                    }
                    a2--;
                }
            }
            return true;
        } else if (list != null) {
            return m28179a(C14461m1.m62534b(list), lVar, z);
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableIterable<T>");
        }
    }

    /* renamed from: a */
    private static final boolean m28180a(@C6003d Collection<?> collection) {
        boolean z = !collection.isEmpty();
        collection.clear();
        return z;
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final <T> void m28174a(@C6003d List<T> list, T t) {
        Collections.fill(list, t);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final <T> void m28176a(@C6003d List<T> list, Random random) {
        Collections.shuffle(list, random);
    }

    @C6003d
    @C6096e0(version = "1.2")
    /* renamed from: a */
    public static final <T> List<T> m28172a(@C6003d Iterable<? extends T> iterable, @C6003d Random random) {
        C14445h0.m62478f(iterable, "$receiver");
        C14445h0.m62478f(random, "random");
        List<T> N = C14848z.m65670N(iterable);
        Collections.shuffle(N, random);
        return N;
    }
}
