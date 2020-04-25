package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.measurement.c6 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4712c6 {

    /* renamed from: c */
    private static final C4712c6 f14026c = new C4712c6();

    /* renamed from: a */
    private final C4835k6 f14027a = new C4739e5();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, C4790h6<?>> f14028b = new ConcurrentHashMap();

    private C4712c6() {
    }

    /* renamed from: a */
    public static C4712c6 m19997a() {
        return f14026c;
    }

    /* renamed from: a */
    public final <T> C4790h6<T> mo18887a(Class<T> cls) {
        String str = "messageType";
        C4819j4.m20396a(cls, str);
        C4790h6<T> h6Var = (C4790h6) this.f14028b.get(cls);
        if (h6Var != null) {
            return h6Var;
        }
        C4790h6<T> a = this.f14027a.mo18935a(cls);
        C4819j4.m20396a(cls, str);
        C4819j4.m20396a(a, "schema");
        C4790h6 h6Var2 = (C4790h6) this.f14028b.putIfAbsent(cls, a);
        return h6Var2 != null ? h6Var2 : a;
    }

    /* renamed from: a */
    public final <T> C4790h6<T> mo18888a(T t) {
        return mo18887a(t.getClass());
    }
}
