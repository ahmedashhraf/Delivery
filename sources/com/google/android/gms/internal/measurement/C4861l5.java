package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.l5 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public final class C4861l5<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b */
    private static final C4861l5 f14248b;

    /* renamed from: a */
    private boolean f14249a = true;

    static {
        C4861l5 l5Var = new C4861l5();
        f14248b = l5Var;
        l5Var.f14249a = false;
    }

    private C4861l5() {
    }

    /* renamed from: a */
    public static <K, V> C4861l5<K, V> m20625a() {
        return f14248b;
    }

    /* renamed from: b */
    private static int m20626b(Object obj) {
        if (obj instanceof byte[]) {
            return C4819j4.m20400c((byte[]) obj);
        }
        if (!(obj instanceof C4873m4)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    private final void m20627g() {
        if (!this.f14249a) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        m20627g();
        super.clear();
    }

    /* renamed from: d */
    public final C4861l5<K, V> mo19259d() {
        return isEmpty() ? new C4861l5<>() : new C4861l5<>(this);
    }

    /* renamed from: e */
    public final void mo19260e() {
        this.f14249a = false;
    }

    public final Set<Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x0059
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0016
        L_0x0014:
            r7 = 0
            goto L_0x005a
        L_0x0016:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0056
        L_0x0052:
            boolean r3 = r4.equals(r3)
        L_0x0056:
            if (r3 != 0) goto L_0x001e
            goto L_0x0014
        L_0x0059:
            r7 = 1
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4861l5.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo19263f() {
        return this.f14249a;
    }

    public final int hashCode() {
        int i = 0;
        for (Entry entry : entrySet()) {
            i += m20626b(entry.getValue()) ^ m20626b(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        m20627g();
        C4819j4.m20394a(k);
        C4819j4.m20394a(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m20627g();
        for (Object next : map.keySet()) {
            C4819j4.m20394a(next);
            C4819j4.m20394a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m20627g();
        return super.remove(obj);
    }

    /* renamed from: a */
    public final void mo19257a(C4861l5<K, V> l5Var) {
        m20627g();
        if (!l5Var.isEmpty()) {
            putAll(l5Var);
        }
    }

    private C4861l5(Map<K, V> map) {
        super(map);
    }
}
