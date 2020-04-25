package kotlin.p219v0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C6050b0;
import kotlin.C6096e0;
import kotlin.TypeCastException;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p215t.C6084p;
import kotlin.p214b1.p215t.C6085q;
import kotlin.p214b1.p215t.C6086r;
import kotlin.p214b1.p216u.C14431f1.C14437f;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14461m1;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.v0.h0 */
/* compiled from: Grouping.kt */
public final class C14780h0 {
    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static final <T, K, R> Map<K, R> m64043a(@C6003d C14777g0<T, ? extends K> g0Var, @C6003d C6086r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> rVar) {
        C14445h0.m62478f(g0Var, "$receiver");
        C14445h0.m62478f(rVar, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator a = g0Var.mo45822a();
        while (a.hasNext()) {
            Object next = a.next();
            Object a2 = g0Var.mo45821a(next);
            Object obj = linkedHashMap.get(a2);
            linkedHashMap.put(a2, rVar.mo24964a(a2, obj, next, Boolean.valueOf(obj == null && !linkedHashMap.containsKey(a2))));
        }
        return linkedHashMap;
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static final <T, K, R, M extends Map<? super K, R>> M m64040a(@C6003d C14777g0<T, ? extends K> g0Var, @C6003d M m, @C6003d C6086r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> rVar) {
        C14445h0.m62478f(g0Var, "$receiver");
        C14445h0.m62478f(m, "destination");
        C14445h0.m62478f(rVar, "operation");
        Iterator a = g0Var.mo45822a();
        while (a.hasNext()) {
            Object next = a.next();
            Object a2 = g0Var.mo45821a(next);
            Object obj = m.get(a2);
            m.put(a2, rVar.mo24964a(a2, obj, next, Boolean.valueOf(obj == null && !m.containsKey(a2))));
        }
        return m;
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static final <T, K> Map<K, Integer> m64034a(@C6003d C14777g0<T, ? extends K> g0Var) {
        C14445h0.m62478f(g0Var, "$receiver");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator a = g0Var.mo45822a();
        while (a.hasNext()) {
            Object a2 = g0Var.mo45821a(a.next());
            Object obj = linkedHashMap.get(a2);
            if (obj == null && !linkedHashMap.containsKey(a2)) {
                obj = new C14437f();
            }
            C14437f fVar = (C14437f) obj;
            fVar.f42564a++;
            linkedHashMap.put(a2, fVar);
        }
        for (Entry entry : linkedHashMap.entrySet()) {
            if (entry != null) {
                C14461m1.m62545g(entry).setValue(Integer.valueOf(((C14437f) entry.getValue()).f42564a));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K, R>");
            }
        }
        return C14461m1.m62543f(linkedHashMap);
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static final <T, K, M extends Map<? super K, Integer>> M m64036a(@C6003d C14777g0<T, ? extends K> g0Var, @C6003d M m) {
        C14445h0.m62478f(g0Var, "$receiver");
        C14445h0.m62478f(m, "destination");
        Object valueOf = Integer.valueOf(0);
        Iterator a = g0Var.mo45822a();
        while (a.hasNext()) {
            Object a2 = g0Var.mo45821a(a.next());
            Object obj = m.get(a2);
            if (obj == null && !m.containsKey(a2)) {
                obj = valueOf;
            }
            m.put(a2, Integer.valueOf(((Number) obj).intValue() + 1));
        }
        return m;
    }

    @C6041f
    @C6050b0
    /* renamed from: a */
    private static final <K, V, R> Map<K, R> m64033a(@C6003d Map<K, V> map, C6080l<? super Entry<? extends K, ? extends V>, ? extends R> lVar) {
        for (Entry entry : map.entrySet()) {
            if (entry != null) {
                C14461m1.m62545g(entry).setValue(lVar.invoke(entry));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K, R>");
            }
        }
        if (map != null) {
            return C14461m1.m62543f(map);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, R>");
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static final <T, K, R> Map<K, R> m64041a(@C6003d C14777g0<T, ? extends K> g0Var, @C6003d C6084p<? super K, ? super T, ? extends R> pVar, @C6003d C6085q<? super K, ? super R, ? super T, ? extends R> qVar) {
        C14445h0.m62478f(g0Var, "$receiver");
        C14445h0.m62478f(pVar, "initialValueSelector");
        C14445h0.m62478f(qVar, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator a = g0Var.mo45822a();
        while (a.hasNext()) {
            Object next = a.next();
            Object a2 = g0Var.mo45821a(next);
            Object obj = linkedHashMap.get(a2);
            if (obj == null && !linkedHashMap.containsKey(a2)) {
                obj = pVar.mo24962d(a2, next);
            }
            linkedHashMap.put(a2, qVar.mo24963b(a2, obj, next));
        }
        return linkedHashMap;
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static final <T, K, R, M extends Map<? super K, R>> M m64038a(@C6003d C14777g0<T, ? extends K> g0Var, @C6003d M m, @C6003d C6084p<? super K, ? super T, ? extends R> pVar, @C6003d C6085q<? super K, ? super R, ? super T, ? extends R> qVar) {
        C14445h0.m62478f(g0Var, "$receiver");
        C14445h0.m62478f(m, "destination");
        C14445h0.m62478f(pVar, "initialValueSelector");
        C14445h0.m62478f(qVar, "operation");
        Iterator a = g0Var.mo45822a();
        while (a.hasNext()) {
            Object next = a.next();
            Object a2 = g0Var.mo45821a(next);
            Object obj = m.get(a2);
            if (obj == null && !m.containsKey(a2)) {
                obj = pVar.mo24962d(a2, next);
            }
            m.put(a2, qVar.mo24963b(a2, obj, next));
        }
        return m;
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static final <T, K, R> Map<K, R> m64035a(@C6003d C14777g0<T, ? extends K> g0Var, R r, @C6003d C6084p<? super R, ? super T, ? extends R> pVar) {
        C14445h0.m62478f(g0Var, "$receiver");
        C14445h0.m62478f(pVar, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator a = g0Var.mo45822a();
        while (a.hasNext()) {
            Object next = a.next();
            Object a2 = g0Var.mo45821a(next);
            R r2 = linkedHashMap.get(a2);
            if (r2 == null && !linkedHashMap.containsKey(a2)) {
                r2 = r;
            }
            linkedHashMap.put(a2, pVar.mo24962d(r2, next));
        }
        return linkedHashMap;
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static final <T, K, R, M extends Map<? super K, R>> M m64037a(@C6003d C14777g0<T, ? extends K> g0Var, @C6003d M m, R r, @C6003d C6084p<? super R, ? super T, ? extends R> pVar) {
        C14445h0.m62478f(g0Var, "$receiver");
        C14445h0.m62478f(m, "destination");
        C14445h0.m62478f(pVar, "operation");
        Iterator a = g0Var.mo45822a();
        while (a.hasNext()) {
            Object next = a.next();
            Object a2 = g0Var.mo45821a(next);
            R r2 = m.get(a2);
            if (r2 == null && !m.containsKey(a2)) {
                r2 = r;
            }
            m.put(a2, pVar.mo24962d(r2, next));
        }
        return m;
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static final <S, T extends S, K> Map<K, S> m64042a(@C6003d C14777g0<T, ? extends K> g0Var, @C6003d C6085q<? super K, ? super S, ? super T, ? extends S> qVar) {
        C14445h0.m62478f(g0Var, "$receiver");
        C14445h0.m62478f(qVar, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator a = g0Var.mo45822a();
        while (a.hasNext()) {
            Object next = a.next();
            Object a2 = g0Var.mo45821a(next);
            Object obj = linkedHashMap.get(a2);
            if (!(obj == null && !linkedHashMap.containsKey(a2))) {
                next = qVar.mo24963b(a2, obj, next);
            }
            linkedHashMap.put(a2, next);
        }
        return linkedHashMap;
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static final <S, T extends S, K, M extends Map<? super K, S>> M m64039a(@C6003d C14777g0<T, ? extends K> g0Var, @C6003d M m, @C6003d C6085q<? super K, ? super S, ? super T, ? extends S> qVar) {
        C14445h0.m62478f(g0Var, "$receiver");
        C14445h0.m62478f(m, "destination");
        C14445h0.m62478f(qVar, "operation");
        Iterator a = g0Var.mo45822a();
        while (a.hasNext()) {
            Object next = a.next();
            Object a2 = g0Var.mo45821a(next);
            Object obj = m.get(a2);
            if (!(obj == null && !m.containsKey(a2))) {
                next = qVar.mo24963b(a2, obj, next);
            }
            m.put(a2, next);
        }
        return m;
    }
}
