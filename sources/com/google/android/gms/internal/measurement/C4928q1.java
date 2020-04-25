package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q1 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C4928q1 extends C4896o1<Long> {
    C4928q1(C5003u1 u1Var, String str, Long l) {
        super(u1Var, str, l, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Long mo19351a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String a = super.mo19352a();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 25 + String.valueOf(valueOf).length());
        sb.append("Invalid long value for ");
        sb.append(a);
        sb.append(": ");
        sb.append(valueOf);
        sb.toString();
        return null;
    }
}
