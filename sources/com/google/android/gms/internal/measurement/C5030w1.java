package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;

/* renamed from: com.google.android.gms.internal.measurement.w1 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final /* synthetic */ class C5030w1 implements OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final C5043x1 f14490a;

    C5030w1(C5043x1 x1Var) {
        this.f14490a = x1Var;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.f14490a.mo19734a(sharedPreferences, str);
    }
}
