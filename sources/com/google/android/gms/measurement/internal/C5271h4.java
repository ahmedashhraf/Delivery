package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzv;

/* renamed from: com.google.android.gms.measurement.internal.h4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5271h4 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ Bundle f15090N;

    /* renamed from: O */
    private final /* synthetic */ Context f15091O;

    /* renamed from: P */
    private final /* synthetic */ C5303k3 f15092P;

    /* renamed from: Q */
    private final /* synthetic */ PendingResult f15093Q;

    /* renamed from: a */
    private final /* synthetic */ C5359p4 f15094a;

    /* renamed from: b */
    private final /* synthetic */ long f15095b;

    C5271h4(C5249f4 f4Var, C5359p4 p4Var, long j, Bundle bundle, Context context, C5303k3 k3Var, PendingResult pendingResult) {
        this.f15094a = p4Var;
        this.f15095b = j;
        this.f15090N = bundle;
        this.f15091O = context;
        this.f15092P = k3Var;
        this.f15093Q = pendingResult;
    }

    public final void run() {
        long a = this.f15094a.mo21601o().f15575j.mo21825a();
        long j = this.f15095b;
        if (a > 0 && (j >= a || j <= 0)) {
            j = a - 1;
        }
        if (j > 0) {
            this.f15090N.putLong("click_timestamp", j);
        }
        this.f15090N.putString("_cis", "referrer broadcast");
        C5359p4.m23334a(this.f15091O, (zzv) null).mo21606t().mo21764a("auto", "_cmp", this.f15090N);
        this.f15092P.mo21528C().mo21549a("Install campaign recorded");
        PendingResult pendingResult = this.f15093Q;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
