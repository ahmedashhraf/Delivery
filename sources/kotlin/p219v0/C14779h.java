package kotlin.p219v0;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.C6096e0;
import kotlin.p214b1.p216u.p500n1.C14470g;
import p205i.p209c.p210a.C6004e;

@C6096e0(version = "1.1")
/* renamed from: kotlin.v0.h */
/* compiled from: AbstractMutableMap.kt */
public abstract class C14779h<K, V> extends AbstractMap<K, V> implements Map<K, V>, C14470g {
    protected C14779h() {
    }

    /* renamed from: a */
    public abstract Set mo46173a();

    /* renamed from: b */
    public /* bridge */ Set mo46174b() {
        return super.keySet();
    }

    /* renamed from: c */
    public /* bridge */ int mo46175c() {
        return super.size();
    }

    /* renamed from: d */
    public /* bridge */ Collection mo46176d() {
        return super.values();
    }

    public final /* bridge */ Set<Entry<K, V>> entrySet() {
        return mo46173a();
    }

    public final /* bridge */ Set<K> keySet() {
        return mo46174b();
    }

    @C6004e
    public abstract V put(K k, V v);

    public final /* bridge */ int size() {
        return mo46175c();
    }

    public final /* bridge */ Collection<V> values() {
        return mo46176d();
    }
}
