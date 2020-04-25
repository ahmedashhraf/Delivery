package p212io.fabric.sdk.android.p493p.p495b;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14228l;

/* renamed from: io.fabric.sdk.android.p.b.g */
/* compiled from: ApiKey */
public class C14246g {

    /* renamed from: a */
    static final String f42010a = "io.fabric.ApiKey";

    /* renamed from: b */
    static final String f42011b = "com.crashlytics.ApiKey";

    /* renamed from: c */
    static final String f42012c = "@string/twitter_consumer_secret";

    @Deprecated
    /* renamed from: a */
    public static String m61785a(Context context, boolean z) {
        C14215d.m61672j().mo45051w(C14215d.f41919m, "getApiKey(context, debug) is deprecated, please upgrade kit(s) to the latest version.");
        return new C14246g().mo45138d(context);
    }

    @Deprecated
    /* renamed from: f */
    public static String m61786f(Context context) {
        C14215d.m61672j().mo45051w(C14215d.f41919m, "getApiKey(context) is deprecated, please upgrade kit(s) to the latest version.");
        return new C14246g().mo45138d(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo45134a() {
        return "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo45136b(Context context) {
        String str = C14215d.f41919m;
        String str2 = null;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString(f42010a);
            try {
                if (f42012c.equals(string)) {
                    C14215d.m61672j().mo45042d(str, "Ignoring bad default value for Fabric ApiKey set by FirebaseUI-Auth");
                } else {
                    str2 = string;
                }
                if (str2 != null) {
                    return str2;
                }
                C14215d.m61672j().mo45042d(str, "Falling back to Crashlytics key lookup from Manifest");
                return bundle.getString(f42011b);
            } catch (Exception e) {
                e = e;
                str2 = string;
                C14228l j = C14215d.m61672j();
                StringBuilder sb = new StringBuilder();
                sb.append("Caught non-fatal exception while retrieving apiKey: ");
                sb.append(e);
                j.mo45042d(str, sb.toString());
                return str2;
            }
        } catch (Exception e2) {
            e = e2;
            C14228l j2 = C14215d.m61672j();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Caught non-fatal exception while retrieving apiKey: ");
            sb2.append(e);
            j2.mo45042d(str, sb2.toString());
            return str2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo45137c(Context context) {
        String str = "string";
        int a = C14248i.m61794a(context, f42010a, str);
        if (a == 0) {
            C14215d.m61672j().mo45042d(C14215d.f41919m, "Falling back to Crashlytics key lookup from Strings");
            a = C14248i.m61794a(context, f42011b, str);
        }
        if (a != 0) {
            return context.getResources().getString(a);
        }
        return null;
    }

    /* renamed from: d */
    public String mo45138d(Context context) {
        String b = mo45136b(context);
        if (TextUtils.isEmpty(b)) {
            b = mo45137c(context);
        }
        if (TextUtils.isEmpty(b)) {
            b = mo45135a(context);
        }
        if (TextUtils.isEmpty(b)) {
            mo45139e(context);
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo45139e(Context context) {
        if (C14215d.m61674l() || C14248i.m61842j(context)) {
            throw new IllegalArgumentException(mo45134a());
        }
        C14215d.m61672j().mo45044e(C14215d.f41919m, mo45134a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo45135a(Context context) {
        return new C14264r().mo45153a(context);
    }
}
