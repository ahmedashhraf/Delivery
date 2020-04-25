package com.google.android.gms.location;

import java.util.Comparator;

/* renamed from: com.google.android.gms.location.h0 */
final class C5133h0 implements Comparator<ActivityTransition> {
    C5133h0() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        ActivityTransition activityTransition = (ActivityTransition) obj;
        ActivityTransition activityTransition2 = (ActivityTransition) obj2;
        int N = activityTransition.mo19977N();
        int N2 = activityTransition2.mo19977N();
        if (N != N2) {
            return N < N2 ? -1 : 1;
        }
        int O = activityTransition.mo19978O();
        int O2 = activityTransition2.mo19978O();
        if (O == O2) {
            return 0;
        }
        return O < O2 ? -1 : 1;
    }
}
