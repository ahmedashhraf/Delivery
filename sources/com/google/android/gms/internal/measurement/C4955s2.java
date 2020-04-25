package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.s2 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4955s2 {

    /* renamed from: a */
    private static final Class<?> f14396a = m21099a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f14397b = (m21099a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    static boolean m21100a() {
        return f14396a != null && !f14397b;
    }

    /* renamed from: b */
    static Class<?> m21101b() {
        return f14396a;
    }

    /* renamed from: a */
    private static <T> Class<T> m21099a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
