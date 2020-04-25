package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.measurement.z1 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5069z1<T> extends C4694b2<T> {

    /* renamed from: a */
    static final C5069z1<Object> f14554a = new C5069z1<>();

    private C5069z1() {
    }

    /* renamed from: a */
    public final boolean mo18861a() {
        return false;
    }

    /* renamed from: d */
    public final T mo18862d() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
