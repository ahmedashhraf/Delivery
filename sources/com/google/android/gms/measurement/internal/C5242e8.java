package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.C0187e0;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.internal.measurement.zzv;
import com.google.android.gms.measurement.internal.C5297j8;

/* renamed from: com.google.android.gms.measurement.internal.e8 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
public final class C5242e8<T extends Context & C5297j8> {

    /* renamed from: a */
    private final T f15011a;

    public C5242e8(T t) {
        C4300a0.m18620a(t);
        this.f15011a = t;
    }

    @C0187e0
    /* renamed from: a */
    public final void mo21316a() {
        C5359p4 a = C5359p4.m23334a((Context) this.f15011a, (zzv) null);
        C5303k3 d = a.mo21205d();
        a.mo21189B();
        d.mo21528C().mo21549a("Local AppMeasurementService is starting up");
    }

    @C0187e0
    /* renamed from: b */
    public final void mo21320b() {
        C5359p4 a = C5359p4.m23334a((Context) this.f15011a, (zzv) null);
        C5303k3 d = a.mo21205d();
        a.mo21189B();
        d.mo21528C().mo21549a("Local AppMeasurementService is shutting down");
    }

    @C0187e0
    /* renamed from: c */
    public final void mo21322c(Intent intent) {
        if (intent == null) {
            m22729c().mo21533t().mo21549a("onRebind called with null intent");
            return;
        }
        m22729c().mo21528C().mo21550a("onRebind called. action", intent.getAction());
    }

    /* renamed from: c */
    private final C5303k3 m22729c() {
        return C5359p4.m23334a((Context) this.f15011a, (zzv) null).mo21205d();
    }

    @C0187e0
    /* renamed from: a */
    public final int mo21314a(Intent intent, int i, int i2) {
        C5359p4 a = C5359p4.m23334a((Context) this.f15011a, (zzv) null);
        C5303k3 d = a.mo21205d();
        if (intent == null) {
            d.mo21536w().mo21549a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        a.mo21189B();
        d.mo21528C().mo21551a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m22728a((Runnable) new C5286i8(this, i2, d, intent));
        }
        return 2;
    }

    @C0187e0
    /* renamed from: b */
    public final boolean mo21321b(Intent intent) {
        if (intent == null) {
            m22729c().mo21533t().mo21549a("onUnbind called with null intent");
            return true;
        }
        m22729c().mo21528C().mo21550a("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    /* renamed from: a */
    private final void m22728a(Runnable runnable) {
        C5461y8 a = C5461y8.m23770a((Context) this.f15011a);
        a.mo21203c().mo21555a((Runnable) new C5308k8(this, a, runnable));
    }

    @C0187e0
    /* renamed from: a */
    public final IBinder mo21315a(Intent intent) {
        if (intent == null) {
            m22729c().mo21533t().mo21549a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new C5414u4(C5461y8.m23770a((Context) this.f15011a));
        }
        m22729c().mo21536w().mo21550a("onBind received unknown action", action);
        return null;
    }

    @TargetApi(24)
    @C0187e0
    /* renamed from: a */
    public final boolean mo21319a(JobParameters jobParameters) {
        C5359p4 a = C5359p4.m23334a((Context) this.f15011a, (zzv) null);
        C5303k3 d = a.mo21205d();
        String string = jobParameters.getExtras().getString("action");
        a.mo21189B();
        d.mo21528C().mo21550a("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            m22728a((Runnable) new C5264g8(this, d, jobParameters));
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21318a(C5303k3 k3Var, JobParameters jobParameters) {
        k3Var.mo21528C().mo21549a("AppMeasurementJobService processed last upload request.");
        ((C5297j8) this.f15011a).mo21093a(jobParameters, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21317a(int i, C5303k3 k3Var, Intent intent) {
        if (((C5297j8) this.f15011a).mo21095a(i)) {
            k3Var.mo21528C().mo21550a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m22729c().mo21528C().mo21549a("Completed wakeful intent.");
            ((C5297j8) this.f15011a).mo21094a(intent);
        }
    }
}
