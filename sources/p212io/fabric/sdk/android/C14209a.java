package p212io.fabric.sdk.android;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* renamed from: io.fabric.sdk.android.a */
/* compiled from: ActivityLifecycleManager */
public class C14209a {

    /* renamed from: a */
    private final Application f41902a;

    /* renamed from: b */
    private C14210a f41903b;

    /* renamed from: io.fabric.sdk.android.a$a */
    /* compiled from: ActivityLifecycleManager */
    private static class C14210a {

        /* renamed from: a */
        private final Set<ActivityLifecycleCallbacks> f41904a = new HashSet();

        /* renamed from: b */
        private final Application f41905b;

        /* renamed from: io.fabric.sdk.android.a$a$a */
        /* compiled from: ActivityLifecycleManager */
        class C14211a implements ActivityLifecycleCallbacks {

            /* renamed from: a */
            final /* synthetic */ C14212b f41906a;

            C14211a(C14212b bVar) {
                this.f41906a = bVar;
            }

            public void onActivityCreated(Activity activity, Bundle bundle) {
                this.f41906a.onActivityCreated(activity, bundle);
            }

            public void onActivityDestroyed(Activity activity) {
                this.f41906a.onActivityDestroyed(activity);
            }

            public void onActivityPaused(Activity activity) {
                this.f41906a.onActivityPaused(activity);
            }

            public void onActivityResumed(Activity activity) {
                this.f41906a.onActivityResumed(activity);
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                this.f41906a.onActivitySaveInstanceState(activity, bundle);
            }

            public void onActivityStarted(Activity activity) {
                this.f41906a.onActivityStarted(activity);
            }

            public void onActivityStopped(Activity activity) {
                this.f41906a.onActivityStopped(activity);
            }
        }

        C14210a(Application application) {
            this.f41905b = application;
        }

        /* access modifiers changed from: private */
        @TargetApi(14)
        /* renamed from: a */
        public void m61643a() {
            for (ActivityLifecycleCallbacks unregisterActivityLifecycleCallbacks : this.f41904a) {
                this.f41905b.unregisterActivityLifecycleCallbacks(unregisterActivityLifecycleCallbacks);
            }
        }

        /* access modifiers changed from: private */
        @TargetApi(14)
        /* renamed from: a */
        public boolean m61646a(C14212b bVar) {
            if (this.f41905b == null) {
                return false;
            }
            C14211a aVar = new C14211a(bVar);
            this.f41905b.registerActivityLifecycleCallbacks(aVar);
            this.f41904a.add(aVar);
            return true;
        }
    }

    /* renamed from: io.fabric.sdk.android.a$b */
    /* compiled from: ActivityLifecycleManager */
    public static abstract class C14212b {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    public C14209a(Context context) {
        this.f41902a = (Application) context.getApplicationContext();
        if (VERSION.SDK_INT >= 14) {
            this.f41903b = new C14210a(this.f41902a);
        }
    }

    /* renamed from: a */
    public boolean mo45030a(C14212b bVar) {
        C14210a aVar = this.f41903b;
        return aVar != null && aVar.m61646a(bVar);
    }

    /* renamed from: a */
    public void mo45029a() {
        C14210a aVar = this.f41903b;
        if (aVar != null) {
            aVar.m61643a();
        }
    }
}
