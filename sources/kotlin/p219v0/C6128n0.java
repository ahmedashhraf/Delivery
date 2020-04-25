package kotlin.p219v0;

import java.util.Map;
import kotlin.C6049b;
import kotlin.p213a1.C6041f;
import kotlin.p213a1.C6042g;
import kotlin.p214b1.C6055e;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p505f1.C14557l;
import p205i.p209c.p210a.C6003d;

@C6055e(name = "MapAccessorsKt")
/* renamed from: kotlin.v0.n0 */
/* compiled from: MapAccessors.kt */
public final class C6128n0 {
    @C6041f
    /* renamed from: a */
    private static final <V, V1 extends V> V1 m28121a(@C6003d Map<? super String, ? extends V> map, Object obj, C14557l<?> lVar) {
        C14445h0.m62478f(map, "$receiver");
        return C14837r0.m65508a(map, lVar.getName());
    }

    @C6041f
    @C6055e(name = "getVar")
    /* renamed from: b */
    private static final <V, V1 extends V> V1 m28123b(@C6003d Map<? super String, ? extends V> map, Object obj, C14557l<?> lVar) {
        C14445h0.m62478f(map, "$receiver");
        return C14837r0.m65508a(map, lVar.getName());
    }

    @C6055e(name = "getVarContravariant")
    @C6049b(message = "Use getValue() with two type parameters instead")
    @C6041f
    @C6042g
    /* renamed from: c */
    private static final <V> V m28124c(@C6003d Map<? super String, ? super V> map, Object obj, C14557l<?> lVar) {
        return C14837r0.m65508a(map, lVar.getName());
    }

    @C6041f
    /* renamed from: a */
    private static final <V> void m28122a(@C6003d Map<? super String, ? super V> map, Object obj, C14557l<?> lVar, V v) {
        C14445h0.m62478f(map, "$receiver");
        map.put(lVar.getName(), v);
    }
}
