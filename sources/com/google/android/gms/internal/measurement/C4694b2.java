package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.measurement.b2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public abstract class C4694b2<T> implements Serializable {
    C4694b2() {
    }

    /* renamed from: a */
    public static <T> C4694b2<T> m19949a(T t) {
        return new C4736e2(C4680a2.m19904a(t));
    }

    /* renamed from: e */
    public static <T> C4694b2<T> m19950e() {
        return C5069z1.f14554a;
    }

    /* renamed from: a */
    public abstract boolean mo18861a();

    /* renamed from: d */
    public abstract T mo18862d();
}
