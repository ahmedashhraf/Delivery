package com.instabug.library.tracking;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import com.instabug.library.C9810g;
import com.instabug.library.PresentationManager;
import com.instabug.library._InstabugActivity;
import com.instabug.library.logging.InstabugUserEventLogger;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.HashSet;
import java.util.Set;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.tracking.a */
/* compiled from: InstabugActivityLifecycleListener */
public class C9991a implements ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: P */
    private static transient /* synthetic */ boolean[] f26587P;

    /* renamed from: N */
    private long f26588N = 0;

    /* renamed from: O */
    private final Set<String> f26589O;

    /* renamed from: a */
    private boolean f26590a = true;

    /* renamed from: b */
    private boolean f26591b = false;

    public C9991a() {
        boolean[] a = m46528a();
        a[0] = true;
        this.f26589O = new HashSet();
        a[1] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m46528a() {
        boolean[] zArr = f26587P;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-186888797723916862L, "com/instabug/library/tracking/InstabugActivityLifecycleListener", 34);
        f26587P = a;
        return a;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        boolean[] a = m46528a();
        this.f26589O.add(activity.getClass().getSimpleName());
        a[2] = true;
        InstabugInternalTrackingDelegate.getInstance().handleActivityCreatedEvent(activity);
        a[3] = true;
    }

    public void onActivityDestroyed(Activity activity) {
        boolean[] a = m46528a();
        this.f26589O.remove(activity.getClass().getSimpleName());
        a[22] = true;
        if (!this.f26589O.isEmpty()) {
            a[23] = true;
        } else {
            a[24] = true;
            InstabugSDKLogger.m46626v(this, "app is getting terminated, clearing user event logs");
            a[25] = true;
            InstabugUserEventLogger.getInstance().clearAll();
            a[26] = true;
        }
        InstabugInternalTrackingDelegate.getInstance().handleActivityDestroyedEvent(activity);
        a[27] = true;
    }

    public void onActivityPaused(Activity activity) {
        boolean[] a = m46528a();
        InstabugInternalTrackingDelegate.getInstance().handleActivityPausedEvent(activity);
        a[19] = true;
    }

    public void onActivityResumed(Activity activity) {
        boolean[] a = m46528a();
        if (!this.f26590a) {
            a[5] = true;
        } else {
            a[6] = true;
            C9810g.m45766e().mo34934c();
            this.f26590a = false;
            a[7] = true;
        }
        InstabugInternalTrackingDelegate.getInstance().handleActivityResumedEvent(activity);
        a[8] = true;
        if (SystemClock.elapsedRealtime() - this.f26588N < 300) {
            a[9] = true;
            return;
        }
        if (!PresentationManager.getInstance().getCurrentActivityName().equalsIgnoreCase(activity.getLocalClassName())) {
            a[10] = true;
        } else if (!this.f26591b) {
            a[11] = true;
        } else {
            a[12] = true;
            this.f26588N = SystemClock.elapsedRealtime();
            a[13] = true;
        }
        PresentationManager.getInstance().setCurrentActivity(activity);
        if (this.f26591b) {
            this.f26591b = false;
            a[14] = true;
        } else if (activity instanceof _InstabugActivity) {
            a[15] = true;
        } else {
            a[16] = true;
            PresentationManager.getInstance().notifyActivityChanged();
            a[17] = true;
        }
        a[18] = true;
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        boolean[] a = m46528a();
        StringBuilder sb = new StringBuilder();
        sb.append(activity.getClass().getSimpleName());
        sb.append(" SaveInstanceState");
        InstabugSDKLogger.m46622d(this, sb.toString());
        a[21] = true;
    }

    public void onActivityStarted(Activity activity) {
        boolean[] a = m46528a();
        InstabugInternalTrackingDelegate.getInstance().handleActivityStartedEvent(activity);
        a[4] = true;
    }

    public void onActivityStopped(Activity activity) {
        boolean[] a = m46528a();
        InstabugInternalTrackingDelegate.getInstance().handleActivityStoppedEvent(activity);
        a[20] = true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        boolean[] a = m46528a();
        this.f26591b = true;
        a[32] = true;
    }

    public void onLowMemory() {
        m46528a()[33] = true;
    }

    public void onTrimMemory(int i) {
        boolean[] a = m46528a();
        if (i != 20) {
            a[28] = true;
        } else {
            this.f26590a = true;
            a[29] = true;
            C9810g.m45766e().mo34933b();
            a[30] = true;
        }
        a[31] = true;
    }
}
