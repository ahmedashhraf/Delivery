package kotlin.p219v0;

import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.C14854w;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.p215t.C6069a;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.v0.s0 */
/* compiled from: MapsJVM.kt */
class C14839s0 extends C14837r0 {
    /* renamed from: a */
    public static final <K, V> V m65512a(@C6003d ConcurrentMap<K, V> concurrentMap, K k, @C6003d C6069a<? extends V> aVar) {
        C14445h0.m62478f(concurrentMap, "$receiver");
        C14445h0.m62478f(aVar, "defaultValue");
        V v = concurrentMap.get(k);
        if (v != null) {
            return v;
        }
        V p = aVar.mo24947p();
        Object putIfAbsent = concurrentMap.putIfAbsent(k, p);
        return putIfAbsent != null ? putIfAbsent : p;
    }

    @C6003d
    /* renamed from: b */
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> m65516b(@C6003d Map<? extends K, ? extends V> map) {
        C14445h0.m62478f(map, "$receiver");
        return new TreeMap(map);
    }

    @C6003d
    /* renamed from: a */
    public static final <K, V> SortedMap<K, V> m65514a(@C6003d Map<? extends K, ? extends V> map, @C6003d Comparator<? super K> comparator) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }

    @C6003d
    /* renamed from: a */
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> m65515a(@C6003d C14854w<? extends K, ? extends V>... wVarArr) {
        C14445h0.m62478f(wVarArr, "pairs");
        TreeMap treeMap = new TreeMap();
        C14841t0.m65579c((Map<? super K, ? super V>) treeMap, wVarArr);
        return treeMap;
    }

    @C6041f
    /* renamed from: a */
    private static final Properties m65513a(@C6003d Map<String, String> map) {
        Properties properties = new Properties();
        properties.putAll(map);
        return properties;
    }
}
