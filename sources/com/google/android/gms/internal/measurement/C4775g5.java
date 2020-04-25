package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.g5 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4775g5 implements C4900o5 {

    /* renamed from: a */
    private C4900o5[] f14142a;

    C4775g5(C4900o5... o5VarArr) {
        this.f14142a = o5VarArr;
    }

    /* renamed from: a */
    public final boolean mo19008a(Class<?> cls) {
        for (C4900o5 a : this.f14142a) {
            if (a.mo19008a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C4913p5 mo19009b(Class<?> cls) {
        C4900o5[] o5VarArr;
        for (C4900o5 o5Var : this.f14142a) {
            if (o5Var.mo19008a(cls)) {
                return o5Var.mo19009b(cls);
            }
        }
        String str = "No factory is available for message type: ";
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
