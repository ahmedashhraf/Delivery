package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.C0187e0;
import com.google.android.gms.measurement.internal.C5242e8;
import com.google.android.gms.measurement.internal.C5297j8;

@TargetApi(24)
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
public final class AppMeasurementJobService extends JobService implements C5297j8 {

    /* renamed from: a */
    private C5242e8<AppMeasurementJobService> f14831a;

    /* renamed from: a */
    private final C5242e8<AppMeasurementJobService> m22461a() {
        if (this.f14831a == null) {
            this.f14831a = new C5242e8<>(this);
        }
        return this.f14831a;
    }

    /* renamed from: a */
    public final void mo21094a(Intent intent) {
    }

    @C0187e0
    public final void onCreate() {
        super.onCreate();
        m22461a().mo21316a();
    }

    @C0187e0
    public final void onDestroy() {
        m22461a().mo21320b();
        super.onDestroy();
    }

    @C0187e0
    public final void onRebind(Intent intent) {
        m22461a().mo21322c(intent);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return m22461a().mo21319a(jobParameters);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @C0187e0
    public final boolean onUnbind(Intent intent) {
        return m22461a().mo21321b(intent);
    }

    /* renamed from: a */
    public final boolean mo21095a(int i) {
        throw new UnsupportedOperationException();
    }

    @TargetApi(24)
    /* renamed from: a */
    public final void mo21093a(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }
}
