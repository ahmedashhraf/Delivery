package com.amplitude.api;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

/* renamed from: com.amplitude.api.b */
/* compiled from: AmplitudeCallbacks */
class C2856b implements ActivityLifecycleCallbacks {

    /* renamed from: N */
    private static final String f9988N = "Need to initialize AmplitudeCallbacks with AmplitudeClient instance";

    /* renamed from: O */
    private static C2875d f9989O = C2875d.m13566a();

    /* renamed from: b */
    public static final String f9990b = "com.amplitude.api.AmplitudeCallbacks";

    /* renamed from: a */
    private C2857c f9991a = null;

    public C2856b(C2857c cVar) {
        if (cVar == null) {
            f9989O.mo11292b(f9990b, f9988N);
            return;
        }
        this.f9991a = cVar;
        cVar.mo11266r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo11174a() {
        return System.currentTimeMillis();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        C2857c cVar = this.f9991a;
        if (cVar == null) {
            f9989O.mo11292b(f9990b, f9988N);
        } else {
            cVar.mo11220b(mo11174a());
        }
    }

    public void onActivityResumed(Activity activity) {
        C2857c cVar = this.f9991a;
        if (cVar == null) {
            f9989O.mo11292b(f9990b, f9988N);
        } else {
            cVar.mo11197a(mo11174a());
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
