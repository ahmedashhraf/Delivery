package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.measurement.AppMeasurement.OnEventListener;

/* renamed from: com.google.firebase.analytics.connector.internal.g */
/* compiled from: com.google.android.gms:play-services-measurement-api@@17.1.0 */
final class C8634g implements OnEventListener {

    /* renamed from: a */
    private final /* synthetic */ C8632e f22661a;

    public C8634g(C8632e eVar) {
        this.f22661a = eVar;
    }

    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        if (str != null && !str.equals("crash") && C8631d.m40612b(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle(NativeProtocol.WEB_DIALOG_PARAMS, bundle);
            this.f22661a.f22657a.mo31977a(3, bundle2);
        }
    }
}
