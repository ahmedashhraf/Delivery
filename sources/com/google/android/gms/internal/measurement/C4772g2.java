package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.measurement.g2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C4772g2 {
    /* renamed from: a */
    public static <T> C4708c2<T> m20229a(C4708c2<T> c2Var) {
        if ((c2Var instanceof C4799i2) || (c2Var instanceof C4754f2)) {
            return c2Var;
        }
        if (c2Var instanceof Serializable) {
            return new C4754f2(c2Var);
        }
        return new C4799i2(c2Var);
    }

    /* renamed from: a */
    public static <T> C4708c2<T> m20230a(@NullableDecl T t) {
        return new C4786h2(t);
    }
}
