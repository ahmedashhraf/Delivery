package kotlin.p219v0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C14737p0;
import kotlin.C14854w;
import kotlin.C6096e0;
import kotlin.p213a1.C6040e;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p506g1.C14594m;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

/* renamed from: kotlin.v0.u0 */
/* compiled from: _Maps.kt */
class C14842u0 extends C14841t0 {
    @C6003d
    /* renamed from: a */
    public static final <K, V, R, C extends Collection<? super R>> C m65609a(@C6003d Map<? extends K, ? extends V> map, @C6003d C c, @C6003d C6080l<? super Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> lVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(c, "destination");
        C14445h0.m62478f(lVar, "transform");
        for (Entry invoke : map.entrySet()) {
            C6135x.m28181a((Collection<? super T>) c, (Iterable) lVar.invoke(invoke));
        }
        return c;
    }

    @C6041f
    /* renamed from: b */
    private static final <K, V> Entry<K, V> m65612b(@C6003d Map<? extends K, ? extends V> map, Comparator<? super Entry<? extends K, ? extends V>> comparator) {
        return (Entry) C14848z.m65682a((Iterable<? extends T>) map.entrySet(), comparator);
    }

    @C6003d
    /* renamed from: c */
    public static final <K, V, R, C extends Collection<? super R>> C m65614c(@C6003d Map<? extends K, ? extends V> map, @C6003d C c, @C6003d C6080l<? super Entry<? extends K, ? extends V>, ? extends R> lVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(c, "destination");
        C14445h0.m62478f(lVar, "transform");
        for (Entry invoke : map.entrySet()) {
            c.add(lVar.invoke(invoke));
        }
        return c;
    }

    @C6003d
    /* renamed from: d */
    public static final <K, V> C14594m<Entry<K, V>> m65616d(@C6003d Map<? extends K, ? extends V> map) {
        C14445h0.m62478f(map, "$receiver");
        return C14848z.m65787h((Iterable<? extends T>) map.entrySet());
    }

    @C6041f
    /* renamed from: f */
    private static final <K, V> int m65617f(@C6003d Map<? extends K, ? extends V> map) {
        return map.size();
    }

    /* renamed from: i */
    public static final <K, V> boolean m65618i(@C6003d Map<? extends K, ? extends V> map, @C6003d C6080l<? super Entry<? extends K, ? extends V>, Boolean> lVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(lVar, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        for (Entry invoke : map.entrySet()) {
            if (!((Boolean) lVar.invoke(invoke)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public static final <K, V> boolean m65620j(@C6003d Map<? extends K, ? extends V> map, @C6003d C6080l<? super Entry<? extends K, ? extends V>, Boolean> lVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(lVar, "predicate");
        if (map.isEmpty()) {
            return false;
        }
        for (Entry invoke : map.entrySet()) {
            if (((Boolean) lVar.invoke(invoke)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @C6003d
    /* renamed from: k */
    public static final <K, V> List<C14854w<K, V>> m65622k(@C6003d Map<? extends K, ? extends V> map) {
        C14445h0.m62478f(map, "$receiver");
        if (map.size() == 0) {
            return C6129u.m28145b();
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return C6129u.m28145b();
        }
        Entry entry = (Entry) it.next();
        if (!it.hasNext()) {
            return C6129u.m28137a(new C14854w(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new C14854w(entry.getKey(), entry.getValue()));
        do {
            Entry entry2 = (Entry) it.next();
            arrayList.add(new C14854w(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    @C6003d
    /* renamed from: l */
    public static final <K, V, R> List<R> m65623l(@C6003d Map<? extends K, ? extends V> map, @C6003d C6080l<? super Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> lVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (Entry invoke : map.entrySet()) {
            C6135x.m28181a((Collection<? super T>) arrayList, (Iterable) lVar.invoke(invoke));
        }
        return arrayList;
    }

    @C6040e
    /* renamed from: m */
    public static final <K, V> void m65624m(@C6003d Map<? extends K, ? extends V> map, @C6003d C6080l<? super Entry<? extends K, ? extends V>, C14737p0> lVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(lVar, "action");
        for (Entry invoke : map.entrySet()) {
            lVar.invoke(invoke);
        }
    }

    @C6003d
    /* renamed from: n */
    public static final <K, V, R> List<R> m65625n(@C6003d Map<? extends K, ? extends V> map, @C6003d C6080l<? super Entry<? extends K, ? extends V>, ? extends R> lVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(lVar, "transform");
        ArrayList arrayList = new ArrayList(map.size());
        for (Entry invoke : map.entrySet()) {
            arrayList.add(lVar.invoke(invoke));
        }
        return arrayList;
    }

    @C6003d
    /* renamed from: o */
    public static final <K, V, R> List<R> m65626o(@C6003d Map<? extends K, ? extends V> map, @C6003d C6080l<? super Entry<? extends K, ? extends V>, ? extends R> lVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (Entry invoke : map.entrySet()) {
            Object invoke2 = lVar.invoke(invoke);
            if (invoke2 != null) {
                arrayList.add(invoke2);
            }
        }
        return arrayList;
    }

    @C6041f
    /* renamed from: p */
    private static final <K, V, R extends Comparable<? super R>> Entry<K, V> m65627p(@C6003d Map<? extends K, ? extends V> map, C6080l<? super Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Object obj;
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            Comparable comparable = (Comparable) lVar.invoke(next);
            while (it.hasNext()) {
                Object next2 = it.next();
                Comparable comparable2 = (Comparable) lVar.invoke(next2);
                if (comparable.compareTo(comparable2) < 0) {
                    next = next2;
                    comparable = comparable2;
                }
            }
            obj = next;
        }
        return (Entry) obj;
    }

    @C6004e
    /* renamed from: q */
    public static final <K, V, R extends Comparable<? super R>> Entry<K, V> m65628q(@C6003d Map<? extends K, ? extends V> map, @C6003d C6080l<? super Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Object obj;
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(lVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            Comparable comparable = (Comparable) lVar.invoke(next);
            while (it.hasNext()) {
                Object next2 = it.next();
                Comparable comparable2 = (Comparable) lVar.invoke(next2);
                if (comparable.compareTo(comparable2) > 0) {
                    next = next2;
                    comparable = comparable2;
                }
            }
            obj = next;
        }
        return (Entry) obj;
    }

    /* renamed from: r */
    public static final <K, V> boolean m65629r(@C6003d Map<? extends K, ? extends V> map, @C6003d C6080l<? super Entry<? extends K, ? extends V>, Boolean> lVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(lVar, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        for (Entry invoke : map.entrySet()) {
            if (((Boolean) lVar.invoke(invoke)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: s */
    public static final <K, V, M extends Map<? extends K, ? extends V>> M m65630s(@C6003d M m, @C6003d C6080l<? super Entry<? extends K, ? extends V>, C14737p0> lVar) {
        C14445h0.m62478f(m, "$receiver");
        C14445h0.m62478f(lVar, "action");
        for (Entry invoke : m.entrySet()) {
            lVar.invoke(invoke);
        }
        return m;
    }

    @C6003d
    /* renamed from: b */
    public static final <K, V, R, C extends Collection<? super R>> C m65611b(@C6003d Map<? extends K, ? extends V> map, @C6003d C c, @C6003d C6080l<? super Entry<? extends K, ? extends V>, ? extends R> lVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(c, "destination");
        C14445h0.m62478f(lVar, "transform");
        for (Entry invoke : map.entrySet()) {
            Object invoke2 = lVar.invoke(invoke);
            if (invoke2 != null) {
                c.add(invoke2);
            }
        }
        return c;
    }

    @C6004e
    /* renamed from: c */
    public static final <K, V> Entry<K, V> m65615c(@C6003d Map<? extends K, ? extends V> map, @C6003d Comparator<? super Entry<? extends K, ? extends V>> comparator) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(comparator, "comparator");
        return (Entry) C14848z.m65716b((Iterable<? extends T>) map.entrySet(), comparator);
    }

    /* renamed from: j */
    public static final <K, V> boolean m65619j(@C6003d Map<? extends K, ? extends V> map) {
        C14445h0.m62478f(map, "$receiver");
        return map.isEmpty();
    }

    /* renamed from: a */
    public static final <K, V> boolean m65610a(@C6003d Map<? extends K, ? extends V> map) {
        C14445h0.m62478f(map, "$receiver");
        return !map.isEmpty();
    }

    @C6041f
    /* renamed from: c */
    private static final <K, V> Iterable<Entry<K, V>> m65613c(@C6003d Map<? extends K, ? extends V> map) {
        return map.entrySet();
    }

    /* renamed from: k */
    public static final <K, V> int m65621k(@C6003d Map<? extends K, ? extends V> map, @C6003d C6080l<? super Entry<? extends K, ? extends V>, Boolean> lVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(lVar, "predicate");
        int i = 0;
        if (map.isEmpty()) {
            return 0;
        }
        for (Entry invoke : map.entrySet()) {
            if (((Boolean) lVar.invoke(invoke)).booleanValue()) {
                i++;
            }
        }
        return i;
    }
}
