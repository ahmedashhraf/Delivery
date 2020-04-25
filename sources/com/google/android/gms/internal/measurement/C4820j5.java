package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.j5 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public final class C4820j5<K, V> {
    /* renamed from: a */
    static <K, V> void m20402a(zzek zzek, C4807i5<K, V> i5Var, K k, V v) throws IOException {
        C5045x3.m21779a(zzek, i5Var.f14201a, 1, k);
        C5045x3.m21779a(zzek, i5Var.f14203c, 2, v);
    }

    /* renamed from: a */
    static <K, V> int m20401a(C4807i5<K, V> i5Var, K k, V v) {
        return C5045x3.m21774a(i5Var.f14201a, 1, k) + C5045x3.m21774a(i5Var.f14203c, 2, v);
    }
}
