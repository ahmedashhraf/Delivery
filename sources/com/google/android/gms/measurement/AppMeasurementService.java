package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.C0187e0;
import com.google.android.gms.measurement.internal.C5242e8;
import com.google.android.gms.measurement.internal.C5297j8;
import p053b.p068f.p070b.C2125a;

/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
public final class AppMeasurementService extends Service implements C5297j8 {

    /* renamed from: a */
    private C5242e8<AppMeasurementService> f14833a;

    /* renamed from: a */
    private final C5242e8<AppMeasurementService> m22467a() {
        if (this.f14833a == null) {
            this.f14833a = new C5242e8<>(this);
        }
        return this.f14833a;
    }

    @C0187e0
    public final IBinder onBind(Intent intent) {
        return m22467a().mo21315a(intent);
    }

    @C0187e0
    public final void onCreate() {
        super.onCreate();
        m22467a().mo21316a();
    }

    @C0187e0
    public final void onDestroy() {
        m22467a().mo21320b();
        super.onDestroy();
    }

    @C0187e0
    public final void onRebind(Intent intent) {
        m22467a().mo21322c(intent);
    }

    @C0187e0
    public final int onStartCommand(Intent intent, int i, int i2) {
        return m22467a().mo21314a(intent, i, i2);
    }

    @C0187e0
    public final boolean onUnbind(Intent intent) {
        return m22467a().mo21321b(intent);
    }

    /* renamed from: a */
    public final boolean mo21095a(int i) {
        return stopSelfResult(i);
    }

    /* renamed from: a */
    public final void mo21093a(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo21094a(Intent intent) {
        C2125a.m11086a(intent);
    }
}
