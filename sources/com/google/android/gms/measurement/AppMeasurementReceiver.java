package com.google.android.gms.measurement;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0187e0;
import com.google.android.gms.measurement.internal.C5249f4;
import com.google.android.gms.measurement.internal.C5304k4;
import p053b.p068f.p070b.C2125a;

/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
public final class AppMeasurementReceiver extends C2125a implements C5304k4 {

    /* renamed from: d */
    private C5249f4 f14832d;

    @C0187e0
    /* renamed from: a */
    public final void mo21091a(Context context, Intent intent) {
        C2125a.m11087b(context, intent);
    }

    @C0187e0
    public final void onReceive(Context context, Intent intent) {
        if (this.f14832d == null) {
            this.f14832d = new C5249f4(this);
        }
        this.f14832d.mo21332a(context, intent);
    }

    /* renamed from: a */
    public final PendingResult mo21090a() {
        return goAsync();
    }
}
