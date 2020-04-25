package p212io.fabric.sdk.android.p493p.p495b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: io.fabric.sdk.android.p.b.l */
/* compiled from: DataCollectionArbiter */
public class C14255l {

    /* renamed from: f */
    private static final String f42047f = "firebase_crashlytics_collection_enabled";

    /* renamed from: g */
    private static final String f42048g = "com.google.firebase.crashlytics.prefs";

    /* renamed from: h */
    private static C14255l f42049h;

    /* renamed from: i */
    private static Object f42050i = new Object();

    /* renamed from: a */
    private final SharedPreferences f42051a;

    /* renamed from: b */
    private volatile boolean f42052b;

    /* renamed from: c */
    private volatile boolean f42053c;

    /* renamed from: d */
    private final C14262p f42054d;

    /* renamed from: e */
    private boolean f42055e = false;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C14255l(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.f42055e = r0
            if (r7 == 0) goto L_0x006a
            java.lang.String r1 = "com.google.firebase.crashlytics.prefs"
            android.content.SharedPreferences r1 = r7.getSharedPreferences(r1, r0)
            r6.f42051a = r1
            io.fabric.sdk.android.p.b.p r1 = p212io.fabric.sdk.android.p493p.p495b.C14263q.m61868a(r7)
            r6.f42054d = r1
            android.content.SharedPreferences r1 = r6.f42051a
            java.lang.String r2 = "firebase_crashlytics_collection_enabled"
            boolean r1 = r1.contains(r2)
            r3 = 1
            if (r1 == 0) goto L_0x0029
            android.content.SharedPreferences r1 = r6.f42051a
            boolean r1 = r1.getBoolean(r2, r3)
        L_0x0027:
            r2 = 1
            goto L_0x005c
        L_0x0029:
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x004e }
            if (r1 == 0) goto L_0x005a
            java.lang.String r4 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x004e }
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x004e }
            if (r1 == 0) goto L_0x005a
            android.os.Bundle r4 = r1.metaData     // Catch:{ NameNotFoundException -> 0x004e }
            if (r4 == 0) goto L_0x005a
            android.os.Bundle r4 = r1.metaData     // Catch:{ NameNotFoundException -> 0x004e }
            boolean r4 = r4.containsKey(r2)     // Catch:{ NameNotFoundException -> 0x004e }
            if (r4 == 0) goto L_0x005a
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x004e }
            boolean r1 = r1.getBoolean(r2)     // Catch:{ NameNotFoundException -> 0x004e }
            goto L_0x0027
        L_0x004e:
            r1 = move-exception
            io.fabric.sdk.android.l r2 = p212io.fabric.sdk.android.C14215d.m61672j()
            java.lang.String r4 = "Fabric"
            java.lang.String r5 = "Unable to get PackageManager. Falling through"
            r2.mo45043d(r4, r5, r1)
        L_0x005a:
            r1 = 1
            r2 = 0
        L_0x005c:
            r6.f42053c = r1
            r6.f42052b = r2
            java.lang.String r7 = p212io.fabric.sdk.android.p493p.p495b.C14248i.m61848p(r7)
            if (r7 == 0) goto L_0x0067
            r0 = 1
        L_0x0067:
            r6.f42055e = r0
            return
        L_0x006a:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "null context"
            r7.<init>(r0)
            goto L_0x0073
        L_0x0072:
            throw r7
        L_0x0073:
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: p212io.fabric.sdk.android.p493p.p495b.C14255l.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public static C14255l m61854a(Context context) {
        C14255l lVar;
        synchronized (f42050i) {
            if (f42049h == null) {
                f42049h = new C14255l(context);
            }
            lVar = f42049h;
        }
        return lVar;
    }

    /* renamed from: b */
    public static void m61855b(Context context) {
        synchronized (f42050i) {
            f42049h = new C14255l(context);
        }
    }

    /* renamed from: b */
    public boolean mo45148b() {
        return this.f42053c;
    }

    /* renamed from: a */
    public boolean mo45147a() {
        if (this.f42055e && this.f42052b) {
            return this.f42053c;
        }
        C14262p pVar = this.f42054d;
        if (pVar != null) {
            return pVar.mo45152a();
        }
        return true;
    }

    @SuppressLint({"CommitPrefEdits", "ApplySharedPref"})
    /* renamed from: a */
    public void mo45146a(boolean z) {
        this.f42053c = z;
        this.f42052b = true;
        this.f42051a.edit().putBoolean(f42047f, z).commit();
    }
}
