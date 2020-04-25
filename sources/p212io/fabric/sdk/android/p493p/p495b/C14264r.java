package p212io.fabric.sdk.android.p493p.p495b;

import android.content.Context;
import android.text.TextUtils;
import p212io.fabric.sdk.android.C14215d;

/* renamed from: io.fabric.sdk.android.p.b.r */
/* compiled from: FirebaseInfo */
public class C14264r {

    /* renamed from: a */
    static final String f42071a = "google_app_id";

    /* renamed from: b */
    static final String f42072b = "com.crashlytics.useFirebaseAppId";

    /* renamed from: c */
    static final String f42073c = "io.fabric.auto_initialize";

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo45153a(Context context) {
        int a = C14248i.m61794a(context, f42071a, "string");
        if (a == 0) {
            return null;
        }
        C14215d.m61672j().mo45042d(C14215d.f41919m, "Generating Crashlytics ApiKey from google_app_id in Strings");
        return mo45154a(context.getResources().getString(a));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo45155b(Context context) {
        if (!TextUtils.isEmpty(new C14246g().mo45136b(context))) {
            return true;
        }
        return !TextUtils.isEmpty(new C14246g().mo45137c(context));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo45156c(Context context) {
        int a = C14248i.m61794a(context, f42071a, "string");
        if (a == 0) {
            return false;
        }
        return !TextUtils.isEmpty(context.getResources().getString(a));
    }

    /* renamed from: d */
    public boolean mo45157d(Context context) {
        int a = C14248i.m61794a(context, f42073c, "bool");
        if (a == 0) {
            return false;
        }
        boolean z = context.getResources().getBoolean(a);
        if (z) {
            C14215d.m61672j().mo45042d(C14215d.f41919m, "Found Fabric auto-initialization flag for joint Firebase/Fabric customers");
        }
        return z;
    }

    /* renamed from: e */
    public boolean mo45158e(Context context) {
        boolean z = false;
        if (C14248i.m61819a(context, f42072b, false)) {
            return true;
        }
        if (mo45156c(context) && !mo45155b(context)) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo45154a(String str) {
        return C14248i.m61837e(str).substring(0, 40);
    }
}
