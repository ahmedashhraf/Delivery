package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

@C0207n0({C0208a.LIBRARY})
/* renamed from: androidx.core.app.d */
/* compiled from: ActivityRecreator */
final class C0739d {

    /* renamed from: a */
    private static final String f3402a = "ActivityRecreator";

    /* renamed from: b */
    protected static final Class<?> f3403b = m4290a();

    /* renamed from: c */
    protected static final Field f3404c = m4294b();

    /* renamed from: d */
    protected static final Field f3405d = m4296c();

    /* renamed from: e */
    protected static final Method f3406e = m4295b(f3403b);

    /* renamed from: f */
    protected static final Method f3407f = m4291a(f3403b);

    /* renamed from: g */
    protected static final Method f3408g = m4297c(f3403b);

    /* renamed from: h */
    private static final Handler f3409h = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.core.app.d$a */
    /* compiled from: ActivityRecreator */
    static class C0740a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0743d f3410a;

        /* renamed from: b */
        final /* synthetic */ Object f3411b;

        C0740a(C0743d dVar, Object obj) {
            this.f3410a = dVar;
            this.f3411b = obj;
        }

        public void run() {
            this.f3410a.f3419a = this.f3411b;
        }
    }

    /* renamed from: androidx.core.app.d$b */
    /* compiled from: ActivityRecreator */
    static class C0741b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Application f3412a;

        /* renamed from: b */
        final /* synthetic */ C0743d f3413b;

        C0741b(Application application, C0743d dVar) {
            this.f3412a = application;
            this.f3413b = dVar;
        }

        public void run() {
            this.f3412a.unregisterActivityLifecycleCallbacks(this.f3413b);
        }
    }

    /* renamed from: androidx.core.app.d$c */
    /* compiled from: ActivityRecreator */
    static class C0742c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Object f3414a;

        /* renamed from: b */
        final /* synthetic */ Object f3415b;

        C0742c(Object obj, Object obj2) {
            this.f3414a = obj;
            this.f3415b = obj2;
        }

        public void run() {
            try {
                if (C0739d.f3406e != null) {
                    C0739d.f3406e.invoke(this.f3414a, new Object[]{this.f3415b, Boolean.valueOf(false), "AppCompat recreation"});
                    return;
                }
                C0739d.f3407f.invoke(this.f3414a, new Object[]{this.f3415b, Boolean.valueOf(false)});
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: androidx.core.app.d$d */
    /* compiled from: ActivityRecreator */
    private static final class C0743d implements ActivityLifecycleCallbacks {

        /* renamed from: N */
        private boolean f3416N = false;

        /* renamed from: O */
        private boolean f3417O = false;

        /* renamed from: P */
        private boolean f3418P = false;

        /* renamed from: a */
        Object f3419a;

        /* renamed from: b */
        private Activity f3420b;

        C0743d(@C0193h0 Activity activity) {
            this.f3420b = activity;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f3420b == activity) {
                this.f3420b = null;
                this.f3417O = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f3417O && !this.f3418P && !this.f3416N && C0739d.m4293a(this.f3419a, activity)) {
                this.f3418P = true;
                this.f3419a = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f3420b == activity) {
                this.f3416N = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    private C0739d() {
    }

    /* renamed from: a */
    static boolean m4292a(@C0193h0 Activity activity) {
        Application application;
        C0743d dVar;
        if (VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m4298d() && f3408g == null) {
            return false;
        } else {
            if (f3407f == null && f3406e == null) {
                return false;
            }
            try {
                Object obj = f3405d.get(activity);
                if (obj == null) {
                    return false;
                }
                Object obj2 = f3404c.get(activity);
                if (obj2 == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new C0743d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                f3409h.post(new C0740a(dVar, obj));
                if (m4298d()) {
                    f3408g.invoke(obj2, new Object[]{obj, null, null, Integer.valueOf(0), Boolean.valueOf(false), null, null, Boolean.valueOf(false), Boolean.valueOf(false)});
                } else {
                    activity.recreate();
                }
                f3409h.post(new C0741b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    /* renamed from: b */
    private static Method m4295b(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m4297c(Class<?> cls) {
        if (m4298d() && cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m4298d() {
        int i = VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: b */
    private static Field m4294b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Field m4296c() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    protected static boolean m4293a(Object obj, Activity activity) {
        try {
            Object obj2 = f3405d.get(activity);
            if (obj2 != obj) {
                return false;
            }
            f3409h.postAtFrontOfQueue(new C0742c(f3404c.get(activity), obj2));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static Method m4291a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Class<?> m4290a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }
}
