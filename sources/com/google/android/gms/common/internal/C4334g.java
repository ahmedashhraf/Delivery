package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.collection.C0649h;
import com.google.android.gms.base.C4049R;
import com.google.android.gms.common.C4053R;
import com.google.android.gms.common.p172q.C4439c;
import com.google.android.gms.common.util.C4493l;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.android.gms.common.internal.g */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4334g {
    @C5966a("sCache")

    /* renamed from: a */
    private static final C0649h<String, String> f13477a = new C0649h<>();

    private C4334g() {
    }

    @C0193h0
    /* renamed from: a */
    public static String m18780a(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(C4049R.string.common_google_play_services_install_button);
        }
        if (i == 2) {
            return resources.getString(C4049R.string.common_google_play_services_update_button);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(C4049R.string.common_google_play_services_enable_button);
    }

    @C0193h0
    /* renamed from: b */
    public static String m18784b(Context context, int i) {
        Resources resources = context.getResources();
        String a = m18779a(context);
        if (i == 1) {
            return resources.getString(C4049R.string.common_google_play_services_install_text, new Object[]{a});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(C4049R.string.common_google_play_services_enable_text, new Object[]{a});
            } else if (i == 5) {
                return m18782a(context, "common_google_play_services_invalid_account_text", a);
            } else {
                if (i == 7) {
                    return m18782a(context, "common_google_play_services_network_error_text", a);
                }
                if (i == 9) {
                    return resources.getString(C4049R.string.common_google_play_services_unsupported_text, new Object[]{a});
                } else if (i == 20) {
                    return m18782a(context, "common_google_play_services_restricted_profile_text", a);
                } else {
                    switch (i) {
                        case 16:
                            return m18782a(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m18782a(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(C4049R.string.common_google_play_services_updating_text, new Object[]{a});
                        default:
                            return resources.getString(C4053R.string.common_google_play_services_unknown_issue, new Object[]{a});
                    }
                }
            }
        } else if (C4493l.m19382f(context)) {
            return resources.getString(C4049R.string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(C4049R.string.common_google_play_services_update_text, new Object[]{a});
        }
    }

    @C0193h0
    /* renamed from: c */
    public static String m18785c(Context context, int i) {
        if (i != 6 && i != 19) {
            return m18784b(context, i);
        }
        return m18782a(context, "common_google_play_services_resolution_required_text", m18779a(context));
    }

    @C0193h0
    /* renamed from: d */
    public static String m18786d(Context context, int i) {
        String str;
        if (i == 6) {
            str = m18781a(context, "common_google_play_services_resolution_required_title");
        } else {
            str = m18787e(context, i);
        }
        return str == null ? context.getResources().getString(C4049R.string.common_google_play_services_notification_ticker) : str;
    }

    @C0195i0
    /* renamed from: e */
    public static String m18787e(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C4049R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(C4049R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(C4049R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return m18781a(context, "common_google_play_services_invalid_account_title");
            case 7:
                return m18781a(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 17:
                return m18781a(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return m18781a(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                sb.toString();
                return null;
        }
    }

    /* renamed from: a */
    public static String m18779a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C4439c.m19110a(context).mo18452b(packageName).toString();
        } catch (NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: a */
    private static String m18782a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a = m18781a(context, str);
        if (a == null) {
            a = resources.getString(C4053R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, a, new Object[]{str2});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
        return null;
     */
    @androidx.annotation.C0195i0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m18781a(android.content.Context r4, java.lang.String r5) {
        /*
            androidx.collection.h<java.lang.String, java.lang.String> r0 = f13477a
            monitor-enter(r0)
            androidx.collection.h<java.lang.String, java.lang.String> r1 = f13477a     // Catch:{ all -> 0x0061 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x000f:
            android.content.res.Resources r4 = com.google.android.gms.common.GooglePlayServicesUtil.getRemoteResource(r4)     // Catch:{ all -> 0x0061 }
            r1 = 0
            if (r4 != 0) goto L_0x0018
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x0018:
            java.lang.String r2 = "string"
            java.lang.String r3 = "com.google.android.gms"
            int r2 = r4.getIdentifier(r5, r2, r3)     // Catch:{ all -> 0x0061 }
            if (r2 != 0) goto L_0x0039
            java.lang.String r4 = "Missing resource: "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0061 }
            int r2 = r5.length()     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0032
            r4.concat(r5)     // Catch:{ all -> 0x0061 }
            goto L_0x0037
        L_0x0032:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0061 }
            r5.<init>(r4)     // Catch:{ all -> 0x0061 }
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x0039:
            java.lang.String r4 = r4.getString(r2)     // Catch:{ all -> 0x0061 }
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x005a
            java.lang.String r4 = "Got empty resource: "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0061 }
            int r2 = r5.length()     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0053
            r4.concat(r5)     // Catch:{ all -> 0x0061 }
            goto L_0x0058
        L_0x0053:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0061 }
            r5.<init>(r4)     // Catch:{ all -> 0x0061 }
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x005a:
            androidx.collection.h<java.lang.String, java.lang.String> r1 = f13477a     // Catch:{ all -> 0x0061 }
            r1.put(r5, r4)     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r4
        L_0x0061:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C4334g.m18781a(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static String m18783b(Context context) {
        return context.getResources().getString(C4049R.string.common_google_play_services_notification_channel_name);
    }
}
