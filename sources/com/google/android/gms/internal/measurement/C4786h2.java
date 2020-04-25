package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.measurement.h2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C4786h2<T> implements C4708c2<T>, Serializable {
    @NullableDecl

    /* renamed from: a */
    private final T f14165a;

    C4786h2(@NullableDecl T t) {
        this.f14165a = t;
    }

    /* renamed from: a */
    public final T mo18847a() {
        return this.f14165a;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof C4786h2)) {
            return false;
        }
        C4786h2 h2Var = (C4786h2) obj;
        T t = this.f14165a;
        T t2 = h2Var.f14165a;
        if (t == t2 || (t != null && t.equals(t2))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14165a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f14165a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
