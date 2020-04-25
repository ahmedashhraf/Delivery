package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t1 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C4990t1 extends C4896o1<Boolean> {
    C4990t1(C5003u1 u1Var, String str, Boolean bool) {
        super(u1Var, str, bool, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo19351a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (C5055y0.f14520c.matcher(str).matches()) {
                return Boolean.valueOf(true);
            }
            if (C5055y0.f14521d.matcher(str).matches()) {
                return Boolean.valueOf(false);
            }
        }
        String a = super.mo19352a();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 28 + String.valueOf(valueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(a);
        sb.append(": ");
        sb.append(valueOf);
        sb.toString();
        return null;
    }
}
