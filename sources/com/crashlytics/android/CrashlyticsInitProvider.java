package com.crashlytics.android;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.p493p.p495b.C14264r;

public class CrashlyticsInitProvider extends ContentProvider {
    private static final String NDK_MANIFEST_FLAG = "firebase_crashlytics_ndk_enabled";
    private static final String TAG = "CrashlyticsInitProvider";

    interface EnabledCheckStrategy {
        boolean isCrashlyticsEnabled(Context context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032 A[SYNTHETIC, Splitter:B:12:0x0032] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p212io.fabric.sdk.android.C14225i[] createCrashlyticsKits(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Fabric"
            r1 = 1
            r2 = 0
            android.content.pm.PackageManager r3 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0020 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0020 }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r7 = r3.getApplicationInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x0020 }
            android.os.Bundle r7 = r7.metaData     // Catch:{ NameNotFoundException -> 0x0020 }
            if (r7 == 0) goto L_0x002a
            java.lang.String r3 = "firebase_crashlytics_ndk_enabled"
            boolean r7 = r7.getBoolean(r3, r2)     // Catch:{ NameNotFoundException -> 0x0020 }
            if (r7 == 0) goto L_0x002a
            r7 = 1
            goto L_0x002b
        L_0x0020:
            r7 = move-exception
            io.fabric.sdk.android.l r3 = p212io.fabric.sdk.android.C14215d.m61672j()
            java.lang.String r4 = "Unable to get PackageManager while determining if Crashlytics NDK should be initialized"
            r3.mo45043d(r0, r4, r7)
        L_0x002a:
            r7 = 0
        L_0x002b:
            com.crashlytics.android.Crashlytics r3 = new com.crashlytics.android.Crashlytics
            r3.<init>()
            if (r7 == 0) goto L_0x0052
            io.fabric.sdk.android.l r7 = p212io.fabric.sdk.android.C14215d.m61672j()     // Catch:{ all -> 0x0048 }
            java.lang.String r4 = "Crashlytics is initializing NDK crash reporter."
            r7.mo45046i(r0, r4)     // Catch:{ all -> 0x0048 }
            r7 = 2
            io.fabric.sdk.android.i[] r7 = new p212io.fabric.sdk.android.C14225i[r7]     // Catch:{ all -> 0x0048 }
            r7[r2] = r3     // Catch:{ all -> 0x0048 }
            com.crashlytics.android.ndk.CrashlyticsNdk r4 = new com.crashlytics.android.ndk.CrashlyticsNdk     // Catch:{ all -> 0x0048 }
            r4.<init>()     // Catch:{ all -> 0x0048 }
            r7[r1] = r4     // Catch:{ all -> 0x0048 }
            return r7
        L_0x0048:
            r7 = move-exception
            io.fabric.sdk.android.l r4 = p212io.fabric.sdk.android.C14215d.m61672j()
            java.lang.String r5 = "Crashlytics failed to initialize NDK crash reporting. Attempting to intialize SDK..."
            r4.mo45045e(r0, r5, r7)
        L_0x0052:
            io.fabric.sdk.android.i[] r7 = new p212io.fabric.sdk.android.C14225i[r1]
            r7[r2] = r3
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.CrashlyticsInitProvider.createCrashlyticsKits(android.content.Context):io.fabric.sdk.android.i[]");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        Context context = getContext();
        boolean shouldInitializeFabric = shouldInitializeFabric(context, new C14264r(), new ManifestEnabledCheckStrategy());
        String str = TAG;
        if (shouldInitializeFabric) {
            try {
                C14215d.m61661a(context, createCrashlyticsKits(context.getApplicationContext()));
                C14215d.m61672j().mo45046i(str, "CrashlyticsInitProvider initialization successful");
            } catch (IllegalStateException unused) {
                C14215d.m61672j().mo45046i(str, "CrashlyticsInitProvider initialization unsuccessful");
                return false;
            }
        } else {
            C14215d.m61672j().mo45046i(str, "CrashlyticsInitProvider skipping initialization");
        }
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    /* access modifiers changed from: 0000 */
    public boolean shouldInitializeFabric(Context context, C14264r rVar, EnabledCheckStrategy enabledCheckStrategy) {
        if (rVar.mo45158e(context)) {
            return enabledCheckStrategy.isCrashlyticsEnabled(context);
        }
        return rVar.mo45157d(context);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
