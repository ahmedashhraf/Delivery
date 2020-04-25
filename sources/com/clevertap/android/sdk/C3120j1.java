package com.clevertap.android.sdk;

import android.app.Application;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.clevertap.android.sdk.j1 */
/* compiled from: ManifestValidator */
final class C3120j1 {

    /* renamed from: a */
    private static final String f11177a = "com.clevertap.android.sdk.Application";

    /* renamed from: com.clevertap.android.sdk.j1$a */
    /* compiled from: ManifestValidator */
    static /* synthetic */ class C3121a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11178a = new int[C3145n1.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.clevertap.android.sdk.n1[] r0 = com.clevertap.android.sdk.C3145n1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11178a = r0
                int[] r0 = f11178a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.clevertap.android.sdk.n1 r1 = com.clevertap.android.sdk.C3145n1.GCM     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f11178a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.clevertap.android.sdk.n1 r1 = com.clevertap.android.sdk.C3145n1.FCM     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3120j1.C3121a.<clinit>():void");
        }
    }

    C3120j1() {
    }

    /* renamed from: a */
    private static void m14987a(C3220t0 t0Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("SDK Version Code is ");
        sb.append(t0Var.mo12608t());
        C3111h1.m14934e(sb.toString());
    }

    /* renamed from: b */
    static void m14990b(Context context, C3220t0 t0Var) {
        if (!t0Var.mo12588a(context, "android.permission.INTERNET")) {
            C3111h1.m14930d("Missing Permission: android.permission.INTERNET");
        }
        m14987a(t0Var);
        m14989b(context);
        m14986a(context, t0Var);
    }

    /* renamed from: a */
    private static void m14986a(Context context, C3220t0 t0Var) {
        String str = "Receiver/Service issue : ";
        try {
            m14984a((Application) context.getApplicationContext(), CTPushNotificationReceiver.class.getName());
            m14984a((Application) context.getApplicationContext(), InstallReferrerBroadcastReceiver.class.getName());
            m14988b((Application) context.getApplicationContext(), C3136m0.class.getName());
            m14988b((Application) context.getApplicationContext(), CTBackgroundJobService.class.getName());
            m14988b((Application) context.getApplicationContext(), CTBackgroundIntentService.class.getName());
            m14983a((Application) context.getApplicationContext(), InAppNotificationActivity.class);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(e.toString());
            C3111h1.m14938f(sb.toString());
        }
        ArrayList i = t0Var.mo12597i();
        if (i != null) {
            Iterator it = i.iterator();
            while (it.hasNext()) {
                int i2 = C3121a.f11178a[((C3145n1) it.next()).ordinal()];
                String str2 = "FATAL : ";
                if (i2 == 1) {
                    try {
                        m14988b((Application) context.getApplicationContext(), "com.clevertap.android.sdk.GcmMessageListenerService");
                        m14988b((Application) context.getApplicationContext(), "com.clevertap.android.sdk.GcmTokenListenerService");
                    } catch (Exception e2) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(e2.toString());
                        C3111h1.m14938f(sb2.toString());
                    } catch (Error e3) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str2);
                        sb3.append(e3.getMessage());
                        C3111h1.m14938f(sb3.toString());
                    }
                } else if (i2 == 2) {
                    try {
                        m14988b((Application) context.getApplicationContext(), "com.clevertap.android.sdk.FcmMessageListenerService");
                        m14988b((Application) context.getApplicationContext(), "com.clevertap.android.sdk.FcmTokenListenerService");
                    } catch (Exception e4) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str);
                        sb4.append(e4.toString());
                        C3111h1.m14938f(sb4.toString());
                    } catch (Error e5) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(str2);
                        sb5.append(e5.getMessage());
                        C3111h1.m14938f(sb5.toString());
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private static void m14988b(Application application, String str) throws NameNotFoundException {
        ServiceInfo[] serviceInfoArr = application.getPackageManager().getPackageInfo(application.getPackageName(), 4).services;
        int length = serviceInfoArr.length;
        int i = 0;
        while (true) {
            String str2 = "";
            String str3 = "com.clevertap.android.sdk.";
            if (i >= length) {
                StringBuilder sb = new StringBuilder();
                sb.append(str.replaceFirst(str3, str2));
                sb.append(" not present");
                C3111h1.m14934e(sb.toString());
                return;
            } else if (serviceInfoArr[i].name.equals(str)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str.replaceFirst(str3, str2));
                sb2.append(" is present");
                C3111h1.m14934e(sb2.toString());
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: b */
    private static void m14989b(Context context) {
        if (!C3062a.f10919a && !C3150p0.m15349q0()) {
            C3111h1.m14934e("Activity Lifecycle Callback not registered. Either set the android:name in your AndroidManifest.xml application tag to com.clevertap.android.sdk.Application, \n or, if you have a custom Application class, call ActivityLifecycleCallback.register(this); before super.onCreate() in your class");
            m14985a(context);
        }
    }

    /* renamed from: a */
    private static void m14984a(Application application, String str) throws NameNotFoundException {
        ActivityInfo[] activityInfoArr = application.getPackageManager().getPackageInfo(application.getPackageName(), 2).receivers;
        int length = activityInfoArr.length;
        int i = 0;
        while (true) {
            String str2 = "";
            String str3 = "com.clevertap.android.sdk.";
            if (i >= length) {
                StringBuilder sb = new StringBuilder();
                sb.append(str.replaceFirst(str3, str2));
                sb.append(" not present");
                C3111h1.m14934e(sb.toString());
                return;
            } else if (activityInfoArr[i].name.equals(str)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str.replaceFirst(str3, str2));
                sb2.append(" is present");
                C3111h1.m14934e(sb2.toString());
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: a */
    private static void m14983a(Application application, Class cls) throws NameNotFoundException {
        ActivityInfo[] activityInfoArr = application.getPackageManager().getPackageInfo(application.getPackageName(), 1).activities;
        String name = cls.getName();
        int length = activityInfoArr.length;
        int i = 0;
        while (true) {
            String str = "";
            String str2 = "com.clevertap.android.sdk.";
            if (i >= length) {
                StringBuilder sb = new StringBuilder();
                sb.append(name.replaceFirst(str2, str));
                sb.append(" not present");
                C3111h1.m14934e(sb.toString());
                return;
            } else if (activityInfoArr[i].name.equals(name)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(name.replaceFirst(str2, str));
                sb2.append(" is present");
                C3111h1.m14934e(sb2.toString());
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: a */
    private static void m14985a(Context context) {
        String str = context.getApplicationInfo().className;
        if (str == null || str.isEmpty()) {
            C3111h1.m14934e("Unable to determine Application Class");
        } else if (str.equals(f11177a)) {
            C3111h1.m14934e("AndroidManifest.xml uses the CleverTap Application class, be sure you have properly added the CleverTap Account ID and Token to your AndroidManifest.xml, \nor set them programmatically in the onCreate method of your custom application class prior to calling super.onCreate()");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Application Class is ");
            sb.append(str);
            C3111h1.m14934e(sb.toString());
        }
    }
}
