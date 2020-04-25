package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.b6 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4698b6 {

    /* renamed from: a */
    private static final C5073z5 f13996a = m19959c();

    /* renamed from: b */
    private static final C5073z5 f13997b = new C5060y5();

    /* renamed from: a */
    static C5073z5 m19957a() {
        return f13996a;
    }

    /* renamed from: b */
    static C5073z5 m19958b() {
        return f13997b;
    }

    /* renamed from: c */
    private static C5073z5 m19959c() {
        try {
            return (C5073z5) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
