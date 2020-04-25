package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.core.content.C0841b;
import java.util.concurrent.atomic.AtomicInteger;
import p076c.p112d.p148d.p150g.C6637f;

/* renamed from: com.google.firebase.messaging.d */
/* compiled from: com.google.firebase:firebase-messaging@@20.0.0 */
public final class C8746d {

    /* renamed from: a */
    private static final AtomicInteger f22956a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX WARNING: Removed duplicated region for block: B:48:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0290  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.firebase.messaging.C8745c m41017a(android.content.Context r9, com.google.firebase.messaging.C8755m r10) {
        /*
            android.content.pm.PackageManager r0 = r9.getPackageManager()
            java.lang.String r1 = r9.getPackageName()
            android.os.Bundle r0 = m41016a(r0, r1)
            java.lang.String r1 = r9.getPackageName()
            java.lang.String r2 = "gcm.n.android_channel_id"
            java.lang.String r2 = r10.mo32264a(r2)
            java.lang.String r2 = m41021b(r9, r2, r0)
            android.content.res.Resources r3 = r9.getResources()
            android.content.pm.PackageManager r4 = r9.getPackageManager()
            androidx.core.app.p$e r5 = new androidx.core.app.p$e
            r5.<init>(r9, r2)
            java.lang.CharSequence r2 = m41018a(r1, r10, r4, r3)
            r5.mo4234c(r2)
            java.lang.String r2 = "gcm.n.body"
            java.lang.String r2 = r10.mo32263a(r3, r1, r2)
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 != 0) goto L_0x0049
            r5.mo4228b(r2)
            androidx.core.app.p$d r6 = new androidx.core.app.p$d
            r6.<init>()
            androidx.core.app.p$d r2 = r6.mo4193a(r2)
            r5.mo4213a(r2)
        L_0x0049:
            java.lang.String r2 = "gcm.n.icon"
            java.lang.String r2 = r10.mo32264a(r2)
            int r2 = m41014a(r4, r3, r1, r2, r0)
            r5.mo4253g(r2)
            java.lang.String r2 = r10.mo32265b()
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            r7 = 2
            r8 = 0
            if (r6 == 0) goto L_0x0064
            r2 = r8
            goto L_0x00a9
        L_0x0064:
            java.lang.String r6 = "default"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x00a5
            java.lang.String r6 = "raw"
            int r3 = r3.getIdentifier(r2, r6, r1)
            if (r3 == 0) goto L_0x00a5
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            int r3 = r3 + 24
            java.lang.String r6 = java.lang.String.valueOf(r2)
            int r6 = r6.length()
            int r3 = r3 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r3)
            java.lang.String r3 = "android.resource://"
            r6.append(r3)
            r6.append(r1)
            java.lang.String r3 = "/raw/"
            r6.append(r3)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            goto L_0x00a9
        L_0x00a5:
            android.net.Uri r2 = android.media.RingtoneManager.getDefaultUri(r7)
        L_0x00a9:
            if (r2 == 0) goto L_0x00ae
            r5.mo4207a(r2)
        L_0x00ae:
            java.lang.String r2 = "gcm.n.click_action"
            java.lang.String r2 = r10.mo32264a(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x00c8
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r2)
            r3.setPackage(r1)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r3.setFlags(r1)
            goto L_0x00e1
        L_0x00c8:
            android.net.Uri r2 = r10.mo32262a()
            if (r2 == 0) goto L_0x00dc
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "android.intent.action.VIEW"
            r3.<init>(r4)
            r3.setPackage(r1)
            r3.setData(r2)
            goto L_0x00e1
        L_0x00dc:
            android.content.Intent r1 = r4.getLaunchIntentForPackage(r1)
            r3 = r1
        L_0x00e1:
            java.lang.String r1 = "google.c.a.e"
            if (r3 != 0) goto L_0x00e7
            r2 = r8
            goto L_0x011e
        L_0x00e7:
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r3.addFlags(r2)
            android.os.Bundle r2 = r10.mo32271e()
            r3.putExtras(r2)
            java.util.concurrent.atomic.AtomicInteger r2 = f22956a
            int r2 = r2.incrementAndGet()
            r4 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r9, r2, r3, r4)
            boolean r3 = r10.mo32266b(r1)
            if (r3 == 0) goto L_0x011e
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "com.google.firebase.messaging.NOTIFICATION_OPEN"
            r3.<init>(r4)
            android.os.Bundle r4 = r10.mo32273f()
            android.content.Intent r3 = r3.putExtras(r4)
            java.lang.String r4 = "pending_intent"
            android.content.Intent r2 = r3.putExtra(r4, r2)
            android.app.PendingIntent r2 = m41015a(r9, r2)
        L_0x011e:
            r5.mo4204a(r2)
            boolean r1 = r10.mo32266b(r1)
            if (r1 != 0) goto L_0x0129
            r1 = r8
            goto L_0x013c
        L_0x0129:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            r1.<init>(r2)
            android.os.Bundle r2 = r10.mo32273f()
            android.content.Intent r1 = r1.putExtras(r2)
            android.app.PendingIntent r1 = m41015a(r9, r1)
        L_0x013c:
            if (r1 == 0) goto L_0x0141
            r5.mo4224b(r1)
        L_0x0141:
            java.lang.String r1 = "gcm.n.color"
            java.lang.String r1 = r10.mo32264a(r1)
            java.lang.Integer r9 = m41019a(r9, r1, r0)
            if (r9 == 0) goto L_0x0154
            int r9 = r9.intValue()
            r5.mo4221b(r9)
        L_0x0154:
            java.lang.String r9 = "gcm.n.sticky"
            boolean r9 = r10.mo32266b(r9)
            r0 = 1
            r9 = r9 ^ r0
            r5.mo4217a(r9)
            java.lang.String r9 = "gcm.n.local_only"
            boolean r9 = r10.mo32266b(r9)
            r5.mo4242d(r9)
            java.lang.String r9 = "gcm.n.ticker"
            java.lang.String r9 = r10.mo32264a(r9)
            if (r9 == 0) goto L_0x0173
            r5.mo4245e(r9)
        L_0x0173:
            java.lang.String r9 = "gcm.n.notification_priority"
            java.lang.Integer r9 = r10.mo32267c(r9)
            if (r9 != 0) goto L_0x017d
        L_0x017b:
            r9 = r8
            goto L_0x01ae
        L_0x017d:
            int r1 = r9.intValue()
            r2 = -2
            if (r1 < r2) goto L_0x018a
            int r1 = r9.intValue()
            if (r1 <= r7) goto L_0x01ae
        L_0x018a:
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r1 = java.lang.String.valueOf(r9)
            int r1 = r1.length()
            int r1 = r1 + 72
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "notificationPriority is invalid "
            r2.append(r1)
            r2.append(r9)
            java.lang.String r9 = ". Skipping setting notificationPriority."
            r2.append(r9)
            r2.toString()
            goto L_0x017b
        L_0x01ae:
            if (r9 == 0) goto L_0x01b7
            int r9 = r9.intValue()
            r5.mo4249f(r9)
        L_0x01b7:
            java.lang.String r9 = "gcm.n.visibility"
            java.lang.Integer r9 = r10.mo32267c(r9)
            if (r9 != 0) goto L_0x01c1
        L_0x01bf:
            r9 = r8
            goto L_0x01f2
        L_0x01c1:
            int r1 = r9.intValue()
            r2 = -1
            if (r1 < r2) goto L_0x01ce
            int r1 = r9.intValue()
            if (r1 <= r0) goto L_0x01f2
        L_0x01ce:
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r1 = java.lang.String.valueOf(r9)
            int r1 = r1.length()
            int r1 = r1 + 53
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "visibility is invalid: "
            r2.append(r1)
            r2.append(r9)
            java.lang.String r9 = ". Skipping setting visibility."
            r2.append(r9)
            r2.toString()
            goto L_0x01bf
        L_0x01f2:
            if (r9 == 0) goto L_0x01fb
            int r9 = r9.intValue()
            r5.mo4256h(r9)
        L_0x01fb:
            java.lang.String r9 = "gcm.n.notification_count"
            java.lang.Integer r9 = r10.mo32267c(r9)
            if (r9 != 0) goto L_0x0204
            goto L_0x022f
        L_0x0204:
            int r1 = r9.intValue()
            if (r1 >= 0) goto L_0x022e
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r1 = java.lang.String.valueOf(r9)
            int r1 = r1.length()
            int r1 = r1 + 67
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "notificationCount is invalid: "
            r2.append(r1)
            r2.append(r9)
            java.lang.String r9 = ". Skipping setting notificationCount."
            r2.append(r9)
            r2.toString()
            goto L_0x022f
        L_0x022e:
            r8 = r9
        L_0x022f:
            if (r8 == 0) goto L_0x0238
            int r9 = r8.intValue()
            r5.mo4244e(r9)
        L_0x0238:
            java.lang.String r9 = "gcm.n.event_time"
            java.lang.Long r9 = r10.mo32269d(r9)
            if (r9 == 0) goto L_0x0247
            long r1 = r9.longValue()
            r5.mo4223b(r1)
        L_0x0247:
            long[] r9 = r10.mo32268c()
            if (r9 == 0) goto L_0x0250
            r5.mo4218a(r9)
        L_0x0250:
            int[] r9 = r10.mo32270d()
            r1 = 0
            if (r9 == 0) goto L_0x0260
            r2 = r9[r1]
            r3 = r9[r0]
            r9 = r9[r7]
            r5.mo4199a(r2, r3, r9)
        L_0x0260:
            java.lang.String r9 = "gcm.n.default_sound"
            boolean r9 = r10.mo32266b(r9)
            if (r9 == 0) goto L_0x0269
            goto L_0x026a
        L_0x0269:
            r0 = 0
        L_0x026a:
            java.lang.String r9 = "gcm.n.default_vibrate_timings"
            boolean r9 = r10.mo32266b(r9)
            if (r9 == 0) goto L_0x0274
            r0 = r0 | 2
        L_0x0274:
            java.lang.String r9 = "gcm.n.default_light_settings"
            boolean r9 = r10.mo32266b(r9)
            if (r9 == 0) goto L_0x027e
            r0 = r0 | 4
        L_0x027e:
            r5.mo4232c(r0)
            com.google.firebase.messaging.c r9 = new com.google.firebase.messaging.c
            java.lang.String r0 = "gcm.n.tag"
            java.lang.String r10 = r10.mo32264a(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0290
            goto L_0x02a7
        L_0x0290:
            long r2 = android.os.SystemClock.uptimeMillis()
            r10 = 37
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r10)
            java.lang.String r10 = "FCM-Notification:"
            r0.append(r10)
            r0.append(r2)
            java.lang.String r10 = r0.toString()
        L_0x02a7:
            r9.<init>(r5, r10, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C8746d.m41017a(android.content.Context, com.google.firebase.messaging.m):com.google.firebase.messaging.c");
    }

    @TargetApi(26)
    /* renamed from: b */
    private static String m41021b(Context context, String str, Bundle bundle) {
        if (VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 122);
                sb.append("Notification Channel requested (");
                sb.append(str);
                sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                sb.toString();
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (!TextUtils.isEmpty(string) && notificationManager.getNotificationChannel(string) != null) {
                return string;
            }
            String str2 = "fcm_fallback_notification_channel";
            if (notificationManager.getNotificationChannel(str2) == null) {
                notificationManager.createNotificationChannel(new NotificationChannel(str2, context.getString(context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName())), 3));
            }
            return str2;
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    @C0193h0
    /* renamed from: a */
    private static CharSequence m41018a(String str, C8755m mVar, PackageManager packageManager, Resources resources) {
        String a = mVar.mo32263a(resources, str, "gcm.n.title");
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        try {
            return packageManager.getApplicationInfo(str, 0).loadLabel(packageManager);
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf);
            sb.toString();
            return "";
        }
    }

    @TargetApi(26)
    /* renamed from: a */
    private static boolean m41020a(Resources resources, int i) {
        if (VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i);
            sb.toString();
            return false;
        } catch (NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i);
            sb2.append(", treating it as an invalid icon");
            sb2.toString();
            return false;
        }
    }

    /* renamed from: a */
    private static int m41014a(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m41020a(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m41020a(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 61);
            sb.append("Icon resource ");
            sb.append(str2);
            sb.append(" not found. Notification will use default icon.");
            sb.toString();
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !m41020a(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb2.append("Couldn't get own application info: ");
                sb2.append(valueOf);
                sb2.toString();
            }
        }
        if (i == 0 || !m41020a(resources, i)) {
            i = 17301651;
        }
        return i;
    }

    /* renamed from: a */
    private static Integer m41019a(Context context, String str, Bundle bundle) {
        if (VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                sb.append("Color is invalid: ");
                sb.append(str);
                sb.append(". Notification will use default color.");
                sb.toString();
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(C0841b.m4915a(context, i));
            } catch (NotFoundException unused2) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Bundle m41016a(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                return applicationInfo.metaData;
            }
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf);
            sb.toString();
        }
        return Bundle.EMPTY;
    }

    /* renamed from: a */
    private static PendingIntent m41015a(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, f22956a.incrementAndGet(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), C6637f.f18605b);
    }
}
