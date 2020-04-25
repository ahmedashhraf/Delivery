package kotlin.p219v0;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;
import p212io.branch.referral.C6009d;

/* renamed from: kotlin.v0.p0 */
/* compiled from: MapWithDefault.kt */
final class C14833p0<K, V> implements C14831o0<K, V> {
    @C6003d

    /* renamed from: a */
    private final Map<K, V> f43080a;

    /* renamed from: b */
    private final C6080l<K, V> f43081b;

    public C14833p0(@C6003d Map<K, ? extends V> map, @C6003d C6080l<? super K, ? extends V> lVar) {
        C14445h0.m62478f(map, "map");
        C14445h0.m62478f(lVar, C6009d.f17209I);
        this.f43080a = map;
        this.f43081b = lVar;
    }

    @C6003d
    /* renamed from: a */
    public Set<Entry<K, V>> mo46256a() {
        return getMap().entrySet();
    }

    @C6003d
    /* renamed from: b */
    public Set<K> mo46257b() {
        return getMap().keySet();
    }

    /* renamed from: c */
    public int mo46258c() {
        return getMap().size();
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return getMap().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return getMap().containsValue(obj);
    }

    @C6003d
    /* renamed from: d */
    public Collection<V> mo46262d() {
        return getMap().values();
    }

    public final /* bridge */ Set<Entry<K, V>> entrySet() {
        return mo46256a();
    }

    public boolean equals(@C6004e Object obj) {
        return getMap().equals(obj);
    }

    @C6004e
    public V get(Object obj) {
        return getMap().get(obj);
    }

    @C6003d
    public Map<K, V> getMap() {
        return this.f43080a;
    }

    public int hashCode() {
        return getMap().hashCode();
    }

    public boolean isEmpty() {
        return getMap().isEmpty();
    }

    public final /* bridge */ Set<K> keySet() {
        return mo46257b();
    }

    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo46258c();
    }

    @C6003d
    public String toString() {
        return getMap().toString();
    }

    public final /* bridge */ Collection<V> values() {
        return mo46262d();
    }

    /* renamed from: a */
    public V mo46254a(K k) {
        Map map = getMap();
        V v = map.get(k);
        return (v != null || map.containsKey(k)) ? v : this.f43081b.invoke(k);
    }
}
