package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.util.C4503v;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p201f.p202a.p203u.C5966a;

@C4056a
/* renamed from: com.google.android.gms.common.api.internal.d */
public final class C4109d implements ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: P */
    private static final C4109d f12907P = new C4109d();
    @C5966a("sInstance")

    /* renamed from: N */
    private final ArrayList<C4110a> f12908N = new ArrayList<>();
    @C5966a("sInstance")

    /* renamed from: O */
    private boolean f12909O = false;

    /* renamed from: a */
    private final AtomicBoolean f12910a = new AtomicBoolean();

    /* renamed from: b */
    private final AtomicBoolean f12911b = new AtomicBoolean();

    @C4056a
    /* renamed from: com.google.android.gms.common.api.internal.d$a */
    public interface C4110a {
        @C4056a
        /* renamed from: a */
        void mo17803a(boolean z);
    }

    @C4056a
    private C4109d() {
    }

    @C4056a
    /* renamed from: a */
    public static void m17754a(Application application) {
        synchronized (f12907P) {
            if (!f12907P.f12909O) {
                application.registerActivityLifecycleCallbacks(f12907P);
                application.registerComponentCallbacks(f12907P);
                f12907P.f12909O = true;
            }
        }
    }

    @C4056a
    /* renamed from: b */
    public static C4109d m17755b() {
        return f12907P;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f12910a.compareAndSet(true, false);
        this.f12911b.set(true);
        if (compareAndSet) {
            m17756b(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f12910a.compareAndSet(true, false);
        this.f12911b.set(true);
        if (compareAndSet) {
            m17756b(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f12910a.compareAndSet(false, true)) {
            this.f12911b.set(true);
            m17756b(true);
        }
    }

    /* renamed from: b */
    private final void m17756b(boolean z) {
        synchronized (f12907P) {
            ArrayList<C4110a> arrayList = this.f12908N;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((C4110a) obj).mo17803a(z);
            }
        }
    }

    @C4056a
    @TargetApi(16)
    /* renamed from: a */
    public final boolean mo17792a(boolean z) {
        if (!this.f12911b.get()) {
            if (!C4503v.m19411e()) {
                return z;
            }
            RunningAppProcessInfo runningAppProcessInfo = new RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f12911b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f12910a.set(true);
            }
        }
        return mo17791a();
    }

    @C4056a
    /* renamed from: a */
    public final boolean mo17791a() {
        return this.f12910a.get();
    }

    @C4056a
    /* renamed from: a */
    public final void mo17790a(C4110a aVar) {
        synchronized (f12907P) {
            this.f12908N.add(aVar);
        }
    }
}
