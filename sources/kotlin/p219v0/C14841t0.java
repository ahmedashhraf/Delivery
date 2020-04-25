package kotlin.p219v0;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C14854w;
import kotlin.C6050b0;
import kotlin.C6096e0;
import kotlin.TypeCastException;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.C6055e;
import kotlin.p214b1.p215t.C6069a;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14461m1;
import kotlin.p506g1.C14594m;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

/* renamed from: kotlin.v0.t0 */
/* compiled from: Maps.kt */
class C14841t0 extends C14839s0 {

    /* renamed from: a */
    private static final int f43082a = 1073741824;

    @C6003d
    /* renamed from: a */
    public static final <K, V> Map<K, V> m65541a() {
        C14760d0 d0Var = C14760d0.f43008a;
        if (d0Var != null) {
            return d0Var;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: b */
    private static final <K, V> HashMap<K, V> m65559b() {
        return new HashMap<>();
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: c */
    private static final <K, V> LinkedHashMap<K, V> m65571c() {
        return new LinkedHashMap<>();
    }

    @C6003d
    /* renamed from: d */
    public static final <K, V> Map<K, V> m65585d(@C6003d C14854w<? extends K, ? extends V>... wVarArr) {
        C14445h0.m62478f(wVarArr, "pairs");
        return wVarArr.length > 0 ? m65554a(wVarArr, (M) new LinkedHashMap(m65538a(wVarArr.length))) : m65541a();
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: e */
    private static final <K, V> Map<K, V> m65590e() {
        return new LinkedHashMap();
    }

    @C6041f
    /* renamed from: f */
    private static final <K, V> Map<K, V> m65597f(@C6004e Map<K, ? extends V> map) {
        return map != null ? map : m65541a();
    }

    @C6003d
    /* renamed from: g */
    public static final <K, V, R> Map<R, V> m65602g(@C6003d Map<? extends K, ? extends V> map, @C6003d C6080l<? super Entry<? extends K, ? extends V>, ? extends R> lVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(m65538a(map.size()));
        for (Object next : map.entrySet()) {
            linkedHashMap.put(lVar.invoke(next), ((Entry) next).getValue());
        }
        return linkedHashMap;
    }

    @C6003d
    /* renamed from: h */
    public static final <K, V, R> Map<K, R> m65604h(@C6003d Map<? extends K, ? extends V> map, @C6003d C6080l<? super Entry<? extends K, ? extends V>, ? extends R> lVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(m65538a(map.size()));
        for (Object next : map.entrySet()) {
            linkedHashMap.put(((Entry) next).getKey(), lVar.invoke(next));
        }
        return linkedHashMap;
    }

    @C6041f
    /* renamed from: i */
    private static final <K, V> V m65606i(@C6003d Map<? extends K, V> map, K k) {
        if (map != null) {
            return C14461m1.m62543f(map).remove(k);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
    }

    @C6041f
    /* renamed from: j */
    private static final <K, V> Map<K, V> m65608j(@C6003d Map<K, ? extends V> map) {
        return m65607i(map);
    }

    @C6003d
    /* renamed from: a */
    public static final <K, V> Map<K, V> m65553a(@C6003d C14854w<? extends K, ? extends V> wVar) {
        C14445h0.m62478f(wVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(wVar.mo46307e(), wVar.mo46309f());
        C14445h0.m62453a((Object) singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return singletonMap;
    }

    @C6003d
    /* renamed from: b */
    public static final <K, V> HashMap<K, V> m65560b(@C6003d C14854w<? extends K, ? extends V>... wVarArr) {
        C14445h0.m62478f(wVarArr, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(m65538a(wVarArr.length));
        m65579c((Map<? super K, ? super V>) hashMap, wVarArr);
        return hashMap;
    }

    @C6003d
    /* renamed from: c */
    public static final <K, V> LinkedHashMap<K, V> m65572c(@C6003d C14854w<? extends K, ? extends V>... wVarArr) {
        C14445h0.m62478f(wVarArr, "pairs");
        return (LinkedHashMap) m65554a(wVarArr, (M) new LinkedHashMap(m65538a(wVarArr.length)));
    }

    @C6041f
    /* renamed from: d */
    private static final <K, V> Map<K, V> m65582d() {
        return m65541a();
    }

    @C6003d
    /* renamed from: e */
    public static final <K, V> Map<K, V> m65593e(@C6003d C14854w<? extends K, ? extends V>... wVarArr) {
        C14445h0.m62478f(wVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(m65538a(wVarArr.length));
        m65579c((Map<? super K, ? super V>) linkedHashMap, wVarArr);
        return linkedHashMap;
    }

    @C6096e0(version = "1.1")
    /* renamed from: f */
    public static final <K, V> V m65596f(@C6003d Map<K, ? extends V> map, K k) {
        C14445h0.m62478f(map, "$receiver");
        return C14837r0.m65508a(map, k);
    }

    @C6003d
    /* renamed from: i */
    public static final <K, V> Map<K, V> m65607i(@C6003d Map<? extends K, ? extends V> map) {
        C14445h0.m62478f(map, "$receiver");
        Entry entry = (Entry) map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        C14445h0.m62453a((Object) singletonMap, "java.util.Collections.singletonMap(key, value)");
        C14445h0.m62453a((Object) singletonMap, "with (entries.iterator()…ingletonMap(key, value) }");
        return singletonMap;
    }

    @C6050b0
    /* renamed from: a */
    public static int m65538a(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return i + (i / 3);
        }
        return Integer.MAX_VALUE;
    }

    @C6041f
    /* renamed from: b */
    private static final <K, V> boolean m65568b(@C6003d Map<? extends K, ? extends V> map, K k) {
        C14445h0.m62478f(map, "$receiver");
        return map.containsKey(k);
    }

    @C6041f
    /* renamed from: c */
    private static final <K> boolean m65580c(@C6003d Map<? extends K, ?> map, K k) {
        if (map != null) {
            return map.containsKey(k);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
    }

    @C6041f
    /* renamed from: d */
    private static final <K, V> boolean m65588d(@C6003d Map<K, ? extends V> map, V v) {
        return map.containsValue(v);
    }

    @C6041f
    /* renamed from: e */
    private static final <K, V> V m65589e(@C6003d Map<? extends K, ? extends V> map, K k) {
        C14445h0.m62478f(map, "$receiver");
        return map.get(k);
    }

    @C6003d
    /* renamed from: f */
    public static final <K, V> Map<K, V> m65598f(@C6003d Map<? extends K, ? extends V> map, @C6003d C6080l<? super V, Boolean> lVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(lVar, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            if (((Boolean) lVar.invoke(entry.getValue())).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @C6041f
    /* renamed from: a */
    private static final <K, V> boolean m65556a(@C6003d Map<? extends K, ? extends V> map) {
        return !map.isEmpty();
    }

    @C6041f
    /* renamed from: b */
    private static final <K, V> V m65557b(@C6003d Entry<? extends K, ? extends V> entry) {
        C14445h0.m62478f(entry, "$receiver");
        return entry.getValue();
    }

    @C6041f
    /* renamed from: c */
    private static final <K, V> C14854w<K, V> m65578c(@C6003d Entry<? extends K, ? extends V> entry) {
        return new C14854w<>(entry.getKey(), entry.getValue());
    }

    @C6041f
    @C6055e(name = "mutableIterator")
    /* renamed from: d */
    private static final <K, V> Iterator<Entry<K, V>> m65581d(@C6003d Map<K, V> map) {
        C14445h0.m62478f(map, "$receiver");
        return map.entrySet().iterator();
    }

    /* renamed from: e */
    public static final <K, V> void m65594e(@C6003d Map<? super K, ? super V> map, @C6003d Iterable<? extends C14854w<? extends K, ? extends V>> iterable) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(iterable, "pairs");
        for (C14854w wVar : iterable) {
            map.put(wVar.mo46304a(), wVar.mo46306d());
        }
    }

    @C6041f
    /* renamed from: a */
    private static final <K, V> void m65555a(@C6003d Map<K, V> map, K k, V v) {
        C14445h0.m62478f(map, "$receiver");
        map.put(k, v);
    }

    /* renamed from: b */
    public static final <K, V> V m65558b(@C6003d Map<K, ? extends V> map, K k, @C6003d C6069a<? extends V> aVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(aVar, "defaultValue");
        V v = map.get(k);
        return (v != null || map.containsKey(k)) ? v : aVar.mo24947p();
    }

    /* renamed from: c */
    public static final <K, V> V m65569c(@C6003d Map<K, V> map, K k, @C6003d C6069a<? extends V> aVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(aVar, "defaultValue");
        V v = map.get(k);
        if (v != null) {
            return v;
        }
        V p = aVar.mo24947p();
        map.put(k, p);
        return p;
    }

    @C6003d
    /* renamed from: d */
    public static final <K, V, R, M extends Map<? super K, ? super R>> M m65583d(@C6003d Map<? extends K, ? extends V> map, @C6003d M m, @C6003d C6080l<? super Entry<? extends K, ? extends V>, ? extends R> lVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(m, "destination");
        C14445h0.m62478f(lVar, "transform");
        for (Object next : map.entrySet()) {
            m.put(((Entry) next).getKey(), lVar.invoke(next));
        }
        return m;
    }

    @C6041f
    /* renamed from: a */
    private static final <K, V> K m65539a(@C6003d Entry<? extends K, ? extends V> entry) {
        C14445h0.m62478f(entry, "$receiver");
        return entry.getKey();
    }

    /* renamed from: e */
    public static final <K, V> void m65595e(@C6003d Map<? super K, ? super V> map, @C6003d C14594m<? extends C14854w<? extends K, ? extends V>> mVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(mVar, "pairs");
        for (C14854w wVar : mVar) {
            map.put(wVar.mo46304a(), wVar.mo46306d());
        }
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: g */
    public static final <K, V> Map<K, V> m65600g(@C6003d Map<? extends K, ? extends V> map) {
        C14445h0.m62478f(map, "$receiver");
        int size = map.size();
        if (size == 0) {
            return m65541a();
        }
        if (size != 1) {
            return m65603h(map);
        }
        return m65607i(map);
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: h */
    public static final <K, V> Map<K, V> m65603h(@C6003d Map<? extends K, ? extends V> map) {
        C14445h0.m62478f(map, "$receiver");
        return new LinkedHashMap(map);
    }

    @C6041f
    /* renamed from: a */
    private static final <K, V> V m65540a(@C6003d Map<K, ? extends V> map, K k, C6069a<? extends V> aVar) {
        V v = map.get(k);
        return v != null ? v : aVar.mo24947p();
    }

    @C6003d
    /* renamed from: f */
    public static final <K, V> Map<K, V> m65599f(@C6003d C14854w<? extends K, ? extends V>[] wVarArr) {
        C14445h0.m62478f(wVarArr, "$receiver");
        int length = wVarArr.length;
        if (length == 0) {
            return m65541a();
        }
        if (length != 1) {
            return m65554a(wVarArr, (M) new LinkedHashMap(m65538a(wVarArr.length)));
        }
        return m65553a(wVarArr[0]);
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: h */
    private static final <K, V> void m65605h(@C6003d Map<K, V> map, K k) {
        C14445h0.m62478f(map, "$receiver");
        map.remove(k);
    }

    @C6003d
    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m65546a(@C6003d Map<? extends K, ? extends V> map, @C6003d M m, @C6003d C6080l<? super Entry<? extends K, ? extends V>, Boolean> lVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(m, "destination");
        C14445h0.m62478f(lVar, "predicate");
        for (Entry entry : map.entrySet()) {
            if (!((Boolean) lVar.invoke(entry)).booleanValue()) {
                m.put(entry.getKey(), entry.getValue());
            }
        }
        return m;
    }

    @C6003d
    /* renamed from: b */
    public static final <K, V, M extends Map<? super K, ? super V>> M m65561b(@C6003d Map<? extends K, ? extends V> map, @C6003d M m, @C6003d C6080l<? super Entry<? extends K, ? extends V>, Boolean> lVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(m, "destination");
        C14445h0.m62478f(lVar, "predicate");
        for (Entry entry : map.entrySet()) {
            if (((Boolean) lVar.invoke(entry)).booleanValue()) {
                m.put(entry.getKey(), entry.getValue());
            }
        }
        return m;
    }

    @C6041f
    /* renamed from: c */
    private static final <K, V> Iterator<Entry<K, V>> m65570c(@C6003d Map<? extends K, ? extends V> map) {
        C14445h0.m62478f(map, "$receiver");
        return map.entrySet().iterator();
    }

    @C6003d
    /* renamed from: e */
    public static final <K, V> Map<K, V> m65592e(@C6003d Map<? extends K, ? extends V> map, @C6003d C6080l<? super Entry<? extends K, ? extends V>, Boolean> lVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(lVar, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            if (!((Boolean) lVar.invoke(entry)).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @C6003d
    /* renamed from: c */
    public static final <K, V, R, M extends Map<? super R, ? super V>> M m65575c(@C6003d Map<? extends K, ? extends V> map, @C6003d M m, @C6003d C6080l<? super Entry<? extends K, ? extends V>, ? extends R> lVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(m, "destination");
        C14445h0.m62478f(lVar, "transform");
        for (Object next : map.entrySet()) {
            m.put(lVar.invoke(next), ((Entry) next).getValue());
        }
        return m;
    }

    @C6003d
    /* renamed from: d */
    public static final <K, V> Map<K, V> m65584d(@C6003d Map<? extends K, ? extends V> map, @C6003d C6080l<? super K, Boolean> lVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(lVar, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            if (((Boolean) lVar.invoke(entry.getKey())).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: g */
    public static final <K, V> Map<K, V> m65601g(@C6003d Map<? extends K, ? extends V> map, K k) {
        C14445h0.m62478f(map, "$receiver");
        Map h = m65603h(map);
        h.remove(k);
        return m65591e(h);
    }

    @C6003d
    /* renamed from: a */
    public static final <K, V> Map<K, V> m65542a(@C6003d Iterable<? extends C14854w<? extends K, ? extends V>> iterable) {
        Map<K, V> map;
        C14445h0.m62478f(iterable, "$receiver");
        if (!(iterable instanceof Collection)) {
            return m65591e(m65543a(iterable, (M) new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            map = m65541a();
        } else if (size != 1) {
            map = m65543a(iterable, (M) new LinkedHashMap(m65538a(collection.size())));
        } else {
            map = m65553a((C14854w) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
        }
        return map;
    }

    @C6041f
    /* renamed from: b */
    private static final <K, V> void m65565b(@C6003d Map<? super K, ? super V> map, C14854w<? extends K, ? extends V> wVar) {
        C14445h0.m62478f(map, "$receiver");
        map.put(wVar.mo46307e(), wVar.mo46309f());
    }

    @C6041f
    /* renamed from: b */
    private static final <K, V> void m65567b(@C6003d Map<? super K, ? super V> map, C14854w<? extends K, ? extends V>[] wVarArr) {
        C14445h0.m62478f(map, "$receiver");
        m65579c(map, wVarArr);
    }

    @C6003d
    /* renamed from: e */
    public static final <K, V> Map<K, V> m65591e(@C6003d Map<K, ? extends V> map) {
        C14445h0.m62478f(map, "$receiver");
        int size = map.size();
        if (size == 0) {
            return m65541a();
        }
        if (size != 1) {
            return map;
        }
        return m65607i(map);
    }

    @C6041f
    /* renamed from: b */
    private static final <K, V> void m65563b(@C6003d Map<? super K, ? super V> map, Map<K, ? extends V> map2) {
        C14445h0.m62478f(map, "$receiver");
        map.putAll(map2);
    }

    /* renamed from: c */
    public static final <K, V> void m65579c(@C6003d Map<? super K, ? super V> map, @C6003d C14854w<? extends K, ? extends V>[] wVarArr) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(wVarArr, "pairs");
        for (C14854w<? extends K, ? extends V> wVar : wVarArr) {
            map.put(wVar.mo46304a(), wVar.mo46306d());
        }
    }

    @C6041f
    /* renamed from: d */
    private static final <K, V> void m65586d(@C6003d Map<? super K, ? super V> map, Iterable<? extends C14854w<? extends K, ? extends V>> iterable) {
        C14445h0.m62478f(map, "$receiver");
        m65594e(map, iterable);
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: b */
    private static final <K, V> void m65562b(@C6003d Map<K, V> map, Iterable<? extends K> iterable) {
        C14445h0.m62478f(map, "$receiver");
        C6135x.m28201d((Collection<? super T>) map.keySet(), iterable);
    }

    @C6041f
    /* renamed from: d */
    private static final <K, V> void m65587d(@C6003d Map<? super K, ? super V> map, C14594m<? extends C14854w<? extends K, ? extends V>> mVar) {
        C14445h0.m62478f(map, "$receiver");
        m65595e(map, mVar);
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: b */
    private static final <K, V> void m65566b(@C6003d Map<K, V> map, K[] kArr) {
        C14445h0.m62478f(map, "$receiver");
        C6135x.m28203d((Collection<? super T>) map.keySet(), (T[]) kArr);
    }

    @C6003d
    /* renamed from: c */
    public static final <K, V> Map<K, V> m65576c(@C6003d Map<? extends K, ? extends V> map, @C6003d C6080l<? super Entry<? extends K, ? extends V>, Boolean> lVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(lVar, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            if (((Boolean) lVar.invoke(entry)).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: b */
    private static final <K, V> void m65564b(@C6003d Map<K, V> map, C14594m<? extends K> mVar) {
        C14445h0.m62478f(map, "$receiver");
        C6135x.m28202d((Collection<? super T>) map.keySet(), mVar);
    }

    @C6003d
    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m65543a(@C6003d Iterable<? extends C14854w<? extends K, ? extends V>> iterable, @C6003d M m) {
        C14445h0.m62478f(iterable, "$receiver");
        C14445h0.m62478f(m, "destination");
        m65594e((Map<? super K, ? super V>) m, iterable);
        return m;
    }

    @C6003d
    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m65554a(@C6003d C14854w<? extends K, ? extends V>[] wVarArr, @C6003d M m) {
        C14445h0.m62478f(wVarArr, "$receiver");
        C14445h0.m62478f(m, "destination");
        m65579c((Map<? super K, ? super V>) m, wVarArr);
        return m;
    }

    @C6003d
    /* renamed from: a */
    public static final <K, V> Map<K, V> m65551a(@C6003d C14594m<? extends C14854w<? extends K, ? extends V>> mVar) {
        C14445h0.m62478f(mVar, "$receiver");
        return m65591e(m65552a(mVar, (M) new LinkedHashMap()));
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: c */
    public static final <K, V, M extends Map<? super K, ? super V>> M m65574c(@C6003d Map<? extends K, ? extends V> map, @C6003d M m) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(m, "destination");
        m.putAll(map);
        return m;
    }

    @C6003d
    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m65552a(@C6003d C14594m<? extends C14854w<? extends K, ? extends V>> mVar, @C6003d M m) {
        C14445h0.m62478f(mVar, "$receiver");
        C14445h0.m62478f(m, "destination");
        m65595e((Map<? super K, ? super V>) m, mVar);
        return m;
    }

    @C6003d
    /* renamed from: c */
    public static final <K, V> Map<K, V> m65573c(@C6003d Map<? extends K, ? extends V> map, @C6003d Iterable<? extends C14854w<? extends K, ? extends V>> iterable) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(iterable, "pairs");
        if (map.isEmpty()) {
            return m65542a(iterable);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        m65594e((Map<? super K, ? super V>) linkedHashMap, iterable);
        return linkedHashMap;
    }

    @C6003d
    /* renamed from: a */
    public static final <K, V> Map<K, V> m65548a(@C6003d Map<? extends K, ? extends V> map, @C6003d C14854w<? extends K, ? extends V> wVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(wVar, "pair");
        if (map.isEmpty()) {
            return m65553a(wVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(wVar.mo46307e(), wVar.mo46309f());
        return linkedHashMap;
    }

    @C6003d
    /* renamed from: c */
    public static final <K, V> Map<K, V> m65577c(@C6003d Map<? extends K, ? extends V> map, @C6003d C14594m<? extends C14854w<? extends K, ? extends V>> mVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(mVar, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        m65595e((Map<? super K, ? super V>) linkedHashMap, mVar);
        return m65591e((Map<K, ? extends V>) linkedHashMap);
    }

    @C6003d
    /* renamed from: a */
    public static final <K, V> Map<K, V> m65550a(@C6003d Map<? extends K, ? extends V> map, @C6003d C14854w<? extends K, ? extends V>[] wVarArr) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(wVarArr, "pairs");
        if (map.isEmpty()) {
            return m65599f(wVarArr);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        m65579c((Map<? super K, ? super V>) linkedHashMap, wVarArr);
        return linkedHashMap;
    }

    @C6003d
    /* renamed from: a */
    public static final <K, V> Map<K, V> m65545a(@C6003d Map<? extends K, ? extends V> map, @C6003d Map<? extends K, ? extends V> map2) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static final <K, V> Map<K, V> m65544a(@C6003d Map<? extends K, ? extends V> map, @C6003d Iterable<? extends K> iterable) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(iterable, "keys");
        Map h = m65603h(map);
        C6135x.m28201d((Collection<? super T>) h.keySet(), iterable);
        return m65591e(h);
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static final <K, V> Map<K, V> m65549a(@C6003d Map<? extends K, ? extends V> map, @C6003d K[] kArr) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(kArr, "keys");
        Map h = m65603h(map);
        C6135x.m28203d((Collection<? super T>) h.keySet(), (T[]) kArr);
        return m65591e(h);
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static final <K, V> Map<K, V> m65547a(@C6003d Map<? extends K, ? extends V> map, @C6003d C14594m<? extends K> mVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(mVar, "keys");
        Map h = m65603h(map);
        C6135x.m28202d((Collection<? super T>) h.keySet(), mVar);
        return m65591e(h);
    }
}
