package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* renamed from: com.google.android.gms.measurement.internal.g8 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
final /* synthetic */ class C5264g8 implements Runnable {

    /* renamed from: N */
    private final JobParameters f15067N;

    /* renamed from: a */
    private final C5242e8 f15068a;

    /* renamed from: b */
    private final C5303k3 f15069b;

    C5264g8(C5242e8 e8Var, C5303k3 k3Var, JobParameters jobParameters) {
        this.f15068a = e8Var;
        this.f15069b = k3Var;
        this.f15067N = jobParameters;
    }

    public final void run() {
        this.f15068a.mo21318a(this.f15069b, this.f15067N);
    }
}
