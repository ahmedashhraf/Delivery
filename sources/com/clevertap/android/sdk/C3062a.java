package com.clevertap.android.sdk;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

/* renamed from: com.clevertap.android.sdk.a */
/* compiled from: ActivityLifecycleCallback */
public final class C3062a {

    /* renamed from: a */
    static boolean f10919a = false;

    /* renamed from: com.clevertap.android.sdk.a$a */
    /* compiled from: ActivityLifecycleCallback */
    static class C3063a implements ActivityLifecycleCallbacks {

        /* renamed from: a */
        final /* synthetic */ String f10920a;

        C3063a(String str) {
            this.f10920a = str;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            String str = this.f10920a;
            if (str != null) {
                C3150p0.m15145a(activity, str);
            } else {
                C3150p0.m15269d(activity);
            }
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
            C3150p0.m15082A0();
        }

        public void onActivityResumed(Activity activity) {
            String str = this.f10920a;
            if (str != null) {
                C3150p0.m15214b(activity, str);
            } else {
                C3150p0.m15282e(activity);
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    @TargetApi(14)
    /* renamed from: a */
    public static synchronized void m14708a(Application application, String str) {
        synchronized (C3062a.class) {
            if (application == null) {
                C3111h1.m14934e("Application instance is null/system API is too old");
            } else if (f10919a) {
                C3111h1.m14938f("Lifecycle callbacks have already been registered");
            } else {
                f10919a = true;
                application.registerActivityLifecycleCallbacks(new C3063a(str));
                C3111h1.m14934e("Activity Lifecycle Callback successfully registered");
            }
        }
    }

    @TargetApi(14)
    /* renamed from: a */
    public static synchronized void m14707a(Application application) {
        synchronized (C3062a.class) {
            m14708a(application, null);
        }
    }
}
