package com.google.android.play.core.missingsplits;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.AppTask;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import com.google.android.play.core.internal.C5742h;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.play.core.missingsplits.e */
final class C7155e implements C5770b {

    /* renamed from: e */
    private static final C5742h f20259e = new C5742h("MissingSplitsManagerImpl");

    /* renamed from: a */
    private final Context f20260a;

    /* renamed from: b */
    private final Runtime f20261b;

    /* renamed from: c */
    private final C7154d f20262c;

    /* renamed from: d */
    private final AtomicReference<Boolean> f20263d;

    C7155e(Context context, Runtime runtime, C7154d dVar, AtomicReference<Boolean> atomicReference) {
        this.f20260a = context;
        this.f20261b = runtime;
        this.f20262c = dVar;
        this.f20263d = atomicReference;
    }

    /* renamed from: a */
    private final boolean m34387a(ComponentName componentName) {
        String className = componentName.getClassName();
        try {
            Class cls = Class.forName(className);
            while (cls != null) {
                if (cls.equals(Activity.class)) {
                    return true;
                }
                Class superclass = cls.getSuperclass();
                cls = superclass != cls ? superclass : null;
            }
            return false;
        } catch (ClassNotFoundException unused) {
            f20259e.mo23046c("ClassNotFoundException when scanning class hierarchy of '%s'", className);
            try {
                return this.f20260a.getPackageManager().getActivityInfo(componentName, 0) != null;
            } catch (NameNotFoundException unused2) {
            }
        }
    }

    /* renamed from: c */
    private final boolean m34388c() {
        try {
            ApplicationInfo applicationInfo = this.f20260a.getPackageManager().getApplicationInfo(this.f20260a.getPackageName(), 128);
            return applicationInfo.metaData != null && Boolean.TRUE.equals(applicationInfo.metaData.get("com.android.vending.splits.required"));
        } catch (NameNotFoundException unused) {
            f20259e.mo23046c("App '%s' is not found in the PackageManager", this.f20260a.getPackageName());
            return false;
        }
    }

    /* renamed from: d */
    private final Set<String> m34389d() {
        if (VERSION.SDK_INT < 21) {
            return Collections.emptySet();
        }
        try {
            PackageInfo packageInfo = this.f20260a.getPackageManager().getPackageInfo(this.f20260a.getPackageName(), 0);
            HashSet hashSet = new HashSet();
            if (packageInfo.splitNames != null) {
                Collections.addAll(hashSet, packageInfo.splitNames);
            }
            return hashSet;
        } catch (NameNotFoundException unused) {
            f20259e.mo23046c("App '%s' is not found in PackageManager", this.f20260a.getPackageName());
            return Collections.emptySet();
        }
    }

    /* renamed from: e */
    private final List<AppTask> m34390e() {
        List<AppTask> appTasks = ((ActivityManager) this.f20260a.getSystemService("activity")).getAppTasks();
        return appTasks != null ? appTasks : Collections.emptyList();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo23057a() {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r0 = r6.f20263d
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r1 = r6.f20263d     // Catch:{ all -> 0x0051 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0051 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0051 }
            if (r1 != 0) goto L_0x0043
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r1 = r6.f20263d     // Catch:{ all -> 0x0051 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0051 }
            r3 = 21
            r4 = 0
            r5 = 1
            if (r2 < r3) goto L_0x003c
            boolean r2 = r6.m34388c()     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x003c
            java.util.Set r2 = r6.m34389d()     // Catch:{ all -> 0x0051 }
            boolean r3 = r2.isEmpty()     // Catch:{ all -> 0x0051 }
            if (r3 != 0) goto L_0x0038
            int r3 = r2.size()     // Catch:{ all -> 0x0051 }
            if (r3 != r5) goto L_0x0036
            java.lang.String r3 = ""
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r2 = 0
            goto L_0x0039
        L_0x0038:
            r2 = 1
        L_0x0039:
            if (r2 == 0) goto L_0x003c
            r4 = 1
        L_0x003c:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0051 }
            r1.set(r2)     // Catch:{ all -> 0x0051 }
        L_0x0043:
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r1 = r6.f20263d     // Catch:{ all -> 0x0051 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0051 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0051 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0051 }
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return r1
        L_0x0051:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.missingsplits.C7155e.mo23057a():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0091 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo23058b() {
        /*
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 21
            if (r0 >= r2) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r6.mo23057a()
            if (r0 == 0) goto L_0x00df
            java.util.List r0 = r6.m34390e()
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r2 = r0.hasNext()
            r3 = 1
            if (r2 == 0) goto L_0x0059
            java.lang.Object r2 = r0.next()
            android.app.ActivityManager$AppTask r2 = (android.app.ActivityManager.AppTask) r2
            android.app.ActivityManager$RecentTaskInfo r4 = r2.getTaskInfo()
            if (r4 == 0) goto L_0x0016
            android.app.ActivityManager$RecentTaskInfo r4 = r2.getTaskInfo()
            android.content.Intent r4 = r4.baseIntent
            if (r4 == 0) goto L_0x0016
            android.app.ActivityManager$RecentTaskInfo r4 = r2.getTaskInfo()
            android.content.Intent r4 = r4.baseIntent
            android.content.ComponentName r4 = r4.getComponent()
            if (r4 == 0) goto L_0x0016
            android.app.ActivityManager$RecentTaskInfo r2 = r2.getTaskInfo()
            android.content.Intent r2 = r2.baseIntent
            android.content.ComponentName r2 = r2.getComponent()
            java.lang.String r2 = r2.getClassName()
            java.lang.Class<com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity> r4 = com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity.class
            java.lang.String r4 = r4.getName()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0016
            r0 = 1
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            if (r0 != 0) goto L_0x00de
            java.util.List r0 = r6.m34390e()
            java.util.Iterator r0 = r0.iterator()
        L_0x0064:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0093
            java.lang.Object r2 = r0.next()
            android.app.ActivityManager$AppTask r2 = (android.app.ActivityManager.AppTask) r2
            android.app.ActivityManager$RecentTaskInfo r2 = r2.getTaskInfo()
            if (r2 == 0) goto L_0x008e
            android.content.Intent r4 = r2.baseIntent
            if (r4 == 0) goto L_0x008e
            android.content.ComponentName r4 = r4.getComponent()
            if (r4 == 0) goto L_0x008e
            android.content.Intent r2 = r2.baseIntent
            android.content.ComponentName r2 = r2.getComponent()
            boolean r2 = r6.m34387a(r2)
            if (r2 == 0) goto L_0x008e
            r2 = 1
            goto L_0x008f
        L_0x008e:
            r2 = 0
        L_0x008f:
            if (r2 == 0) goto L_0x0064
            r0 = 1
            goto L_0x0094
        L_0x0093:
            r0 = 0
        L_0x0094:
            com.google.android.play.core.missingsplits.d r2 = r6.f20262c
            r2.mo28559b()
            java.util.List r2 = r6.m34390e()
            java.util.Iterator r2 = r2.iterator()
        L_0x00a1:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00b1
            java.lang.Object r4 = r2.next()
            android.app.ActivityManager$AppTask r4 = (android.app.ActivityManager.AppTask) r4
            r4.finishAndRemoveTask()
            goto L_0x00a1
        L_0x00b1:
            if (r0 == 0) goto L_0x00d9
            android.content.Context r0 = r6.f20260a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.ComponentName r2 = new android.content.ComponentName
            android.content.Context r4 = r6.f20260a
            java.lang.Class<com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity> r5 = com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity.class
            r2.<init>(r4, r5)
            r0.setComponentEnabledSetting(r2, r3, r3)
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r2 = r6.f20260a
            java.lang.Class<com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity> r4 = com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity.class
            r0.<init>(r2, r4)
            r2 = 884998144(0x34c00000, float:3.5762787E-7)
            android.content.Intent r0 = r0.addFlags(r2)
            android.content.Context r2 = r6.f20260a
            r2.startActivity(r0)
        L_0x00d9:
            java.lang.Runtime r0 = r6.f20261b
            r0.exit(r1)
        L_0x00de:
            return r3
        L_0x00df:
            com.google.android.play.core.missingsplits.d r0 = r6.f20262c
            boolean r0 = r0.mo28558a()
            if (r0 == 0) goto L_0x00f1
            com.google.android.play.core.missingsplits.d r0 = r6.f20262c
            r0.mo28560c()
            java.lang.Runtime r0 = r6.f20261b
            r0.exit(r1)
        L_0x00f1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.missingsplits.C7155e.mo23058b():boolean");
    }
}
