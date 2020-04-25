package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.b3 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4695b3 implements Comparator<C5070z2> {
    C4695b3() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C5070z2 z2Var = (C5070z2) obj;
        C5070z2 z2Var2 = (C5070z2) obj2;
        C4755f3 f3Var = (C4755f3) z2Var.iterator();
        C4755f3 f3Var2 = (C4755f3) z2Var2.iterator();
        while (f3Var.hasNext() && f3Var2.hasNext()) {
            int compare = Integer.compare(C5070z2.m21870b(f3Var.mo18981a()), C5070z2.m21870b(f3Var2.mo18981a()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(z2Var.mo18883a(), z2Var2.mo18883a());
    }
}
