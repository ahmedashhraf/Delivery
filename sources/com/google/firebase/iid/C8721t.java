package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.C0187e0;
import androidx.annotation.C0195i0;
import java.util.ArrayDeque;
import java.util.Queue;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.firebase.iid.t */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
public final class C8721t {

    /* renamed from: e */
    private static C8721t f22871e;
    @C0195i0
    @C5966a("this")

    /* renamed from: a */
    private String f22872a = null;

    /* renamed from: b */
    private Boolean f22873b = null;

    /* renamed from: c */
    private Boolean f22874c = null;

    /* renamed from: d */
    private final Queue<Intent> f22875d = new ArrayDeque();

    private C8721t() {
    }

    /* renamed from: b */
    public static synchronized C8721t m40887b() {
        C8721t tVar;
        synchronized (C8721t.class) {
            if (f22871e == null) {
                f22871e = new C8721t();
            }
            tVar = f22871e;
        }
        return tVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0094, code lost:
        return null;
     */
    @androidx.annotation.C0195i0
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized java.lang.String m40888c(android.content.Context r4, android.content.Intent r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r3.f22872a     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x0009
            java.lang.String r4 = r3.f22872a     // Catch:{ all -> 0x0095 }
            monitor-exit(r3)
            return r4
        L_0x0009:
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch:{ all -> 0x0095 }
            r1 = 0
            android.content.pm.ResolveInfo r5 = r0.resolveService(r5, r1)     // Catch:{ all -> 0x0095 }
            r0 = 0
            if (r5 == 0) goto L_0x0093
            android.content.pm.ServiceInfo r1 = r5.serviceInfo     // Catch:{ all -> 0x0095 }
            if (r1 != 0) goto L_0x001b
            goto L_0x0093
        L_0x001b:
            android.content.pm.ServiceInfo r5 = r5.serviceInfo     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = r4.getPackageName()     // Catch:{ all -> 0x0095 }
            java.lang.String r2 = r5.packageName     // Catch:{ all -> 0x0095 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0095 }
            if (r1 == 0) goto L_0x0062
            java.lang.String r1 = r5.name     // Catch:{ all -> 0x0095 }
            if (r1 != 0) goto L_0x002e
            goto L_0x0062
        L_0x002e:
            java.lang.String r0 = r5.name     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = "."
            boolean r0 = r0.startsWith(r1)     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x005a
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x0095 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0095 }
            java.lang.String r5 = r5.name     // Catch:{ all -> 0x0095 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0095 }
            int r0 = r5.length()     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x0051
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x0095 }
            goto L_0x0057
        L_0x0051:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0095 }
            r5.<init>(r4)     // Catch:{ all -> 0x0095 }
            r4 = r5
        L_0x0057:
            r3.f22872a = r4     // Catch:{ all -> 0x0095 }
            goto L_0x005e
        L_0x005a:
            java.lang.String r4 = r5.name     // Catch:{ all -> 0x0095 }
            r3.f22872a = r4     // Catch:{ all -> 0x0095 }
        L_0x005e:
            java.lang.String r4 = r3.f22872a     // Catch:{ all -> 0x0095 }
            monitor-exit(r3)
            return r4
        L_0x0062:
            java.lang.String r4 = r5.packageName     // Catch:{ all -> 0x0095 }
            java.lang.String r5 = r5.name     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0095 }
            int r1 = r1.length()     // Catch:{ all -> 0x0095 }
            int r1 = r1 + 94
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0095 }
            int r2 = r2.length()     // Catch:{ all -> 0x0095 }
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0095 }
            r2.<init>(r1)     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = "Error resolving target intent service, skipping classname enforcement. Resolved service was: "
            r2.append(r1)     // Catch:{ all -> 0x0095 }
            r2.append(r4)     // Catch:{ all -> 0x0095 }
            java.lang.String r4 = "/"
            r2.append(r4)     // Catch:{ all -> 0x0095 }
            r2.append(r5)     // Catch:{ all -> 0x0095 }
            r2.toString()     // Catch:{ all -> 0x0095 }
            monitor-exit(r3)
            return r0
        L_0x0093:
            monitor-exit(r3)
            return r0
        L_0x0095:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C8721t.m40888c(android.content.Context, android.content.Intent):java.lang.String");
    }

    @C0187e0
    /* renamed from: a */
    public final Intent mo32154a() {
        return (Intent) this.f22875d.poll();
    }

    @C0187e0
    /* renamed from: a */
    public final int mo32153a(Context context, Intent intent) {
        boolean isLoggable = Log.isLoggable("FirebaseInstanceId", 3);
        this.f22875d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m40886b(context, intent2);
    }

    /* renamed from: b */
    private final int m40886b(Context context, Intent intent) {
        ComponentName componentName;
        String c = m40888c(context, intent);
        if (c != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String str = "Restricting intent to a specific service: ";
                String valueOf = String.valueOf(c);
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    new String(str);
                }
            }
            intent.setClassName(context.getPackageName(), c);
        }
        try {
            if (mo32155a(context)) {
                componentName = C8733z.m40935a(context, intent);
            } else {
                componentName = context.startService(intent);
            }
            return componentName == null ? 404 : -1;
        } catch (SecurityException unused) {
            return 401;
        } catch (IllegalStateException e) {
            String valueOf2 = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 45);
            sb.append("Failed to start service while in background: ");
            sb.append(valueOf2);
            sb.toString();
            return 402;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo32155a(Context context) {
        if (this.f22873b == null) {
            this.f22873b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f22873b.booleanValue()) {
            boolean isLoggable = Log.isLoggable("FirebaseInstanceId", 3);
        }
        return this.f22873b.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo32156b(Context context) {
        if (this.f22874c == null) {
            this.f22874c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f22873b.booleanValue()) {
            boolean isLoggable = Log.isLoggable("FirebaseInstanceId", 3);
        }
        return this.f22874c.booleanValue();
    }
}
