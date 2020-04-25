package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4863l7 extends IllegalArgumentException {
    C4863l7(int i, int i2) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unpaired surrogate at index ");
        sb.append(i);
        sb.append(" of ");
        sb.append(i2);
        super(sb.toString());
    }
}
