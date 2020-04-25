package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0187e0;
import com.google.android.gms.measurement.internal.C5249f4;
import com.google.android.gms.measurement.internal.C5304k4;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver implements C5304k4 {

    /* renamed from: a */
    private C5249f4 f14830a;

    /* renamed from: a */
    public final PendingResult mo21090a() {
        return goAsync();
    }

    /* renamed from: a */
    public final void mo21091a(Context context, Intent intent) {
    }

    @C0187e0
    public final void onReceive(Context context, Intent intent) {
        if (this.f14830a == null) {
            this.f14830a = new C5249f4(this);
        }
        this.f14830a.mo21332a(context, intent);
    }
}
