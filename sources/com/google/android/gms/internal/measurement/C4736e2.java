package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.measurement.e2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C4736e2<T> extends C4694b2<T> {

    /* renamed from: a */
    private final T f14053a;

    C4736e2(T t) {
        this.f14053a = t;
    }

    /* renamed from: a */
    public final boolean mo18861a() {
        return true;
    }

    /* renamed from: d */
    public final T mo18862d() {
        return this.f14053a;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof C4736e2)) {
            return false;
        }
        return this.f14053a.equals(((C4736e2) obj).f14053a);
    }

    public final int hashCode() {
        return this.f14053a.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f14053a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
