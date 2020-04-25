package kotlin.p219v0;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.C6050b0;
import kotlin.p214b1.C6055e;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.v0.r0 */
/* compiled from: MapWithDefault.kt */
class C14837r0 {
    @C6050b0
    @C6055e(name = "getOrImplicitDefaultNullable")
    /* renamed from: a */
    public static final <K, V> V m65508a(@C6003d Map<K, ? extends V> map, K k) {
        C14445h0.m62478f(map, "$receiver");
        if (map instanceof C14831o0) {
            return ((C14831o0) map).mo46254a(k);
        }
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Key ");
        sb.append(k);
        sb.append(" is missing in the map.");
        throw new NoSuchElementException(sb.toString());
    }

    @C6003d
    @C6055e(name = "withDefaultMutable")
    /* renamed from: b */
    public static final <K, V> Map<K, V> m65510b(@C6003d Map<K, V> map, @C6003d C6080l<? super K, ? extends V> lVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(lVar, "defaultValue");
        if (map instanceof C14844w0) {
            return m65510b(((C14844w0) map).getMap(), lVar);
        }
        return new C14845x0(map, lVar);
    }

    @C6003d
    /* renamed from: a */
    public static final <K, V> Map<K, V> m65509a(@C6003d Map<K, ? extends V> map, @C6003d C6080l<? super K, ? extends V> lVar) {
        C14445h0.m62478f(map, "$receiver");
        C14445h0.m62478f(lVar, "defaultValue");
        if (map instanceof C14831o0) {
            return m65509a(((C14831o0) map).getMap(), lVar);
        }
        return new C14833p0(map, lVar);
    }
}
