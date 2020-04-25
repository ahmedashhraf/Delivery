package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.s1 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C4954s1 extends C4896o1<Double> {
    C4954s1(C5003u1 u1Var, String str, Double d) {
        super(u1Var, str, d, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Double mo19351a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String a = super.mo19352a();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 27 + String.valueOf(valueOf).length());
        sb.append("Invalid double value for ");
        sb.append(a);
        sb.append(": ");
        sb.append(valueOf);
        sb.toString();
        return null;
    }
}
