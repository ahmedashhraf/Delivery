package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4801i4.C4805d;

/* renamed from: com.google.android.gms.internal.measurement.g4 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4774g4 implements C4900o5 {

    /* renamed from: a */
    private static final C4774g4 f14141a = new C4774g4();

    private C4774g4() {
    }

    /* renamed from: a */
    public static C4774g4 m20232a() {
        return f14141a;
    }

    /* renamed from: b */
    public final C4913p5 mo19009b(Class<?> cls) {
        Class<C4801i4> cls2 = C4801i4.class;
        if (!cls2.isAssignableFrom(cls)) {
            String str = "Unsupported message type: ";
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        try {
            return (C4913p5) C4801i4.m20286a(cls.asSubclass(cls2)).mo19042a(C4805d.f14189c, (Object) null, (Object) null);
        } catch (Exception e) {
            String str2 = "Unable to get message info for ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
        }
    }

    /* renamed from: a */
    public final boolean mo19008a(Class<?> cls) {
        return C4801i4.class.isAssignableFrom(cls);
    }
}
