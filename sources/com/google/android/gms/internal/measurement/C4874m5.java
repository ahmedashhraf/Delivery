package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.m5 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4874m5 {

    /* renamed from: a */
    private static final C4834k5 f14266a = m20680c();

    /* renamed from: b */
    private static final C4834k5 f14267b = new C4887n5();

    /* renamed from: a */
    static C4834k5 m20678a() {
        return f14266a;
    }

    /* renamed from: b */
    static C4834k5 m20679b() {
        return f14267b;
    }

    /* renamed from: c */
    private static C4834k5 m20680c() {
        try {
            return (C4834k5) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
