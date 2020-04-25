package com.mrsool.utils;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import p053b.p072g.p073b.C2128a;

/* renamed from: com.mrsool.utils.e */
/* compiled from: ApplicationLifecycleHandler */
public class C5878e implements ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: O */
    private static boolean f16959O = false;

    /* renamed from: N */
    private Runnable f16960N;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f16961a;

    /* renamed from: b */
    private Handler f16962b;

    /* renamed from: com.mrsool.utils.e$a */
    /* compiled from: ApplicationLifecycleHandler */
    class C5879a implements Runnable {
        C5879a() {
        }

        public void run() {
            C5880q.m25751b("In backgrounf timer");
            C2128a.m11089a(C5878e.this.f16961a).mo9219a(new Intent(C11644i.f33370n4));
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f16961a = activity;
    }

    public void onActivityDestroyed(Activity activity) {
        this.f16961a = activity;
    }

    public void onActivityPaused(Activity activity) {
        this.f16961a = activity;
    }

    public void onActivityResumed(Activity activity) {
        if (f16959O) {
            C5880q.m25751b("In forground");
            C2128a.m11089a((Context) activity).mo9219a(new Intent(C11644i.f33362m4));
            C2128a.m11089a((Context) activity).mo9219a(new Intent(C11644i.f33450x4));
            f16959O = false;
            C5887x xVar = new C5887x(this.f16961a);
            if (!C11644i.f33216V6 && xVar.mo23612e()) {
                try {
                    int J = xVar.mo23482J();
                    xVar.mo23659s0();
                    if (J != C11644i.f33200T6) {
                        C11644i.f33200T6 = J;
                        if (J == 2) {
                            C11644i.f33208U6 = 102;
                        } else if (J == 3) {
                            C11644i.f33208U6 = 100;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Handler handler = this.f16962b;
            if (handler != null) {
                Runnable runnable = this.f16960N;
                if (runnable != null) {
                    handler.removeCallbacks(runnable);
                }
            }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f16961a = activity;
    }

    public void onActivityStarted(Activity activity) {
        this.f16961a = activity;
    }

    public void onActivityStopped(Activity activity) {
        this.f16961a = activity;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
        if (i == 20) {
            f16959O = true;
            if (this.f16961a != null) {
                C5880q.m25751b("In background");
                new C5887x(this.f16961a);
                this.f16962b = new Handler();
                this.f16960N = new C5879a();
                this.f16962b.postDelayed(this.f16960N, 10000);
            }
        }
    }
}
