package p212io.branch.referral.p492t0;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p212io.branch.referral.C14204x;
import p212io.branch.referral.C14205y;
import p212io.branch.referral.C6009d;
import p212io.branch.referral.C6031o;
import p212io.branch.referral.p492t0.C14186d.C14187a;

/* renamed from: io.branch.referral.t0.c */
/* compiled from: IntegrationValidator */
public class C14185c implements C14187a {

    /* renamed from: c */
    private static C14185c f41738c;

    /* renamed from: a */
    private final C14176a f41739a;

    /* renamed from: b */
    private final String f41740b = "BranchSDK_Doctor";

    private C14185c(Context context) {
        this.f41739a = new C14176a(context);
    }

    /* renamed from: a */
    private void m61336a() {
    }

    /* renamed from: a */
    public static void m61337a(Context context) {
        if (f41738c == null) {
            f41738c = new C14185c(context);
        }
        f41738c.m61340b(context);
    }

    /* renamed from: b */
    private void m61340b(Context context) {
        m61343c("\n\n------------------- Initiating Branch integration verification ---------------------------");
        m61343c("1. Verifying Branch instance creation");
        if (C6009d.m27463J() == null) {
            m61338a("Branch is not initialised from your Application class. Please add `Branch.getAutoInstance(this);` to your Application#onCreate() method.", "https://docs.branch.io/pages/apps/android/#load-branch");
            return;
        }
        m61336a();
        m61343c("2. Checking Branch keys");
        if (TextUtils.isEmpty(C14204x.m61505a(context).mo44942a(!C6031o.m27714c(context)))) {
            m61338a("Unable to read Branch keys from your application. Did you forget to add Branch keys in your application?.", "https://docs.branch.io/pages/apps/android/#configure-app");
            return;
        }
        m61336a();
        C6009d.m27463J().mo24758a((C14205y) new C14186d(context, this));
    }

    /* renamed from: c */
    private void m61343c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ... ");
        sb.toString();
    }

    /* renamed from: a */
    private boolean m61339a(String str) {
        if (!TextUtils.isEmpty(str)) {
            List<String> list = this.f41739a.f41723d;
            if (list != null) {
                for (String equals : list) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo44793a(JSONObject jSONObject) {
        if (jSONObject != null) {
            m61341b(jSONObject);
        } else {
            m61338a("Unable to read Dashboard config. Please confirm that your Branch key is properly added to the manifest. Please fix your Dashboard settings.", "https://branch.app.link/link-settings-page");
        }
    }

    /* renamed from: a */
    private void m61338a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("** ERROR ** : ");
        sb.append(str);
        sb.append("\nPlease follow the link for more info ");
        sb.append(str2);
        sb.toString();
    }

    /* renamed from: b */
    private void m61341b(JSONObject jSONObject) {
        m61343c("3. Verifying application package name");
        String str = "https://docs.branch.io/pages/dashboard/integrate/#android";
        if (!this.f41739a.f41724e.equals(jSONObject.optString("android_package_name"))) {
            m61338a("Incorrect package name in Branch dashboard. Please correct your package name in dashboard -> link Settings page.", str);
            return;
        }
        m61336a();
        m61343c("4. Checking Android Manifest for URI based deep link config");
        JSONObject jSONObject2 = this.f41739a.f41720a;
        String str2 = "android_uri_scheme";
        String str3 = "https://docs.branch.io/pages/apps/android/#configure-app";
        if (jSONObject2 != null && jSONObject2.length() != 0) {
            m61336a();
        } else if (!this.f41739a.f41725f) {
            m61343c("- Skipping. Unable to verify the deep link config. Failed to read the Android Manifest");
        } else {
            m61338a(String.format("No intent found for opening the app through uri Scheme '%s'.Please add the intent with URI scheme to your Android manifest.", new Object[]{jSONObject.optString(str2)}), str3);
            return;
        }
        m61343c("5. Verifying URI based deep link config with Branch dash board.");
        String optString = jSONObject.optString(str2);
        if (TextUtils.isEmpty(optString)) {
            m61338a("Uri Scheme to open your app is not specified in Branch dashboard. Please add URI scheme in Branch dashboard.", str);
            return;
        }
        m61336a();
        m61343c("6. Verifying intent for receiving URI scheme.");
        String str4 = "- Skipping. Unable to verify intent for receiving URI scheme. Failed to read the Android Manifest";
        if (m61342b(optString)) {
            m61336a();
        } else if (!this.f41739a.f41725f) {
            m61343c(str4);
        } else {
            m61338a(String.format("Uri scheme '%s' specified in Branch dashboard doesn't match with the deep link intent in manifest file", new Object[]{optString}), str);
            return;
        }
        m61343c("7. Checking AndroidManifest for AppLink config.");
        if (!this.f41739a.f41723d.isEmpty()) {
            m61336a();
        } else if (!this.f41739a.f41725f) {
            m61343c(str4);
        } else {
            m61338a("Could not find any App Link hosts to support Android AppLinks. Please add intent filter for handling AppLinks in your Android Manifest file", "https://docs.branch.io/pages/deep-linking/android-app-links/#add-intent-filter-to-manifest");
            return;
        }
        m61343c("8. Verifying any supported custom link domains.");
        String optString2 = jSONObject.optString("short_url_domain");
        if (TextUtils.isEmpty(optString2) || m61339a(optString2)) {
            m61336a();
        } else if (!this.f41739a.f41725f) {
            m61343c("- Skipping. Unable to verify supported custom link domains. Failed to read the Android Manifest");
        } else {
            m61338a(String.format("Could not find intent filter to support custom link domain '%s'. Please add intent filter for handling custom link domain in your Android Manifest file ", new Object[]{optString2}), str3);
            return;
        }
        m61343c("9. Verifying default link domains integrations.");
        String optString3 = jSONObject.optString("default_short_url_domain");
        if (TextUtils.isEmpty(optString3) || m61339a(optString3)) {
            m61336a();
        } else if (!this.f41739a.f41725f) {
            m61343c("- Skipping. Unable to verify default link domains. Failed to read the Android Manifest");
        } else {
            m61338a(String.format("Could not find intent filter to support Branch default link domain '%s'. Please add intent filter for handling custom link domain in your Android Manifest file ", new Object[]{optString3}), str3);
            return;
        }
        m61343c("10. Verifying alternate link domains integrations.");
        String optString4 = jSONObject.optString("alternate_short_url_domain");
        if (TextUtils.isEmpty(optString4) || m61339a(optString4)) {
            m61336a();
        } else if (!this.f41739a.f41725f) {
            m61343c("- Skipping.Unable to verify alternate link domains. Failed to read the Android Manifest");
        } else {
            m61338a(String.format("Could not find intent filter to support alternate link domain '%s'. Please add intent filter for handling custom link domain in your Android Manifest file ", new Object[]{optString4}), str3);
            return;
        }
        m61336a();
    }

    /* renamed from: b */
    private boolean m61342b(String str) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        if (TextUtils.isEmpty(host)) {
            host = "open";
        }
        JSONObject jSONObject = this.f41739a.f41720a;
        if (jSONObject == null) {
            return false;
        }
        Iterator keys = jSONObject.keys();
        boolean z = false;
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            if (scheme.equals(str2)) {
                JSONArray optJSONArray = this.f41739a.f41720a.optJSONArray(str2);
                if (optJSONArray == null || optJSONArray.length() <= 0) {
                    return true;
                }
                int i = 0;
                while (true) {
                    if (i >= optJSONArray.length()) {
                        break;
                    } else if (host.equals(optJSONArray.optString(i))) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        return z;
    }
}
