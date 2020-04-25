package com.clevertap.android.sdk;

import android.content.Context;
import android.os.Bundle;

/* renamed from: com.clevertap.android.sdk.i1 */
/* compiled from: ManifestInfo */
class C3115i1 {

    /* renamed from: a */
    private static String f11161a;

    /* renamed from: b */
    private static String f11162b;

    /* renamed from: c */
    private static String f11163c;

    /* renamed from: d */
    private static String f11164d;

    /* renamed from: e */
    private static boolean f11165e;

    /* renamed from: f */
    private static boolean f11166f;

    /* renamed from: g */
    private static String f11167g;

    /* renamed from: h */
    private static C3115i1 f11168h;

    /* renamed from: i */
    private static String f11169i;

    /* renamed from: j */
    private static boolean f11170j;

    /* renamed from: k */
    private static boolean f11171k;

    /* renamed from: l */
    private static boolean f11172l;

    /* renamed from: m */
    private static String f11173m;

    private C3115i1(Context context) {
        Bundle bundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (Throwable unused) {
            bundle = null;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (f11161a == null) {
            f11161a = m14963a(bundle, "CLEVERTAP_ACCOUNT_ID");
        }
        if (f11162b == null) {
            f11162b = m14963a(bundle, "CLEVERTAP_TOKEN");
        }
        if (f11163c == null) {
            f11163c = m14963a(bundle, "CLEVERTAP_REGION");
        }
        f11164d = m14963a(bundle, "GCM_SENDER_ID");
        f11167g = m14963a(bundle, "CLEVERTAP_NOTIFICATION_ICON");
        String str = f11164d;
        String str2 = "";
        String str3 = "id:";
        if (str != null) {
            f11164d = str.replace(str3, str2);
        }
        String str4 = "1";
        f11165e = str4.equals(m14963a(bundle, "CLEVERTAP_USE_GOOGLE_AD_ID"));
        f11166f = str4.equals(m14963a(bundle, "CLEVERTAP_DISABLE_APP_LAUNCHED"));
        f11169i = m14963a(bundle, "CLEVERTAP_INAPP_EXCLUDE");
        f11170j = str4.equals(m14963a(bundle, "CLEVERTAP_SSL_PINNING"));
        f11171k = str4.equals(m14963a(bundle, "CLEVERTAP_BACKGROUND_SYNC"));
        f11172l = str4.equals(m14963a(bundle, "CLEVERTAP_USE_CUSTOM_ID"));
        f11173m = m14963a(bundle, "FCM_SENDER_ID");
        String str5 = f11173m;
        if (str5 != null) {
            f11173m = str5.replace(str3, str2);
        }
    }

    /* renamed from: a */
    private static String m14963a(Bundle bundle, String str) {
        try {
            Object obj = bundle.get(str);
            if (obj != null) {
                return obj.toString();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo12320b() {
        return f11163c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo12321c() {
        return f11162b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public String mo12322d() {
        return f11169i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public String mo12323e() {
        return f11173m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public String mo12324f() {
        return f11164d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public String mo12325g() {
        return f11167g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo12326h() {
        return f11166f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo12327i() {
        return f11171k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo12328j() {
        return f11170j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo12329k() {
        return f11172l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo12330l() {
        return f11165e;
    }

    /* renamed from: a */
    static synchronized C3115i1 m14962a(Context context) {
        C3115i1 i1Var;
        synchronized (C3115i1.class) {
            if (f11168h == null) {
                f11168h = new C3115i1(context);
            }
            i1Var = f11168h;
        }
        return i1Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo12319a() {
        return f11161a;
    }

    /* renamed from: a */
    static void m14964a(String str, String str2, String str3) {
        f11161a = str;
        f11162b = str2;
        f11163c = str3;
    }
}
