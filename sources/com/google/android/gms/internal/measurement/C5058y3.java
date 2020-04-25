package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.y3 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C5058y3 {

    /* renamed from: a */
    private static final C5032w3<?> f14534a = new C5019v3();

    /* renamed from: b */
    private static final C5032w3<?> f14535b = m21827c();

    /* renamed from: a */
    static C5032w3<?> m21825a() {
        return f14534a;
    }

    /* renamed from: b */
    static C5032w3<?> m21826b() {
        C5032w3<?> w3Var = f14535b;
        if (w3Var != null) {
            return w3Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: c */
    private static C5032w3<?> m21827c() {
        try {
            return (C5032w3) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
