package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement.OnEventListener;

/* renamed from: com.google.firebase.analytics.connector.internal.f */
/* compiled from: com.google.android.gms:play-services-measurement-api@@17.1.0 */
final class C8633f implements OnEventListener {

    /* renamed from: a */
    private final /* synthetic */ C8630c f22660a;

    public C8633f(C8630c cVar) {
        this.f22660a = cVar;
    }

    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        if (this.f22660a.f22647a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", C8631d.m40615e(str2));
            this.f22660a.f22648b.mo31977a(2, bundle2);
        }
    }
}
