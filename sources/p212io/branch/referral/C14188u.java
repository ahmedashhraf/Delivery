package p212io.branch.referral;

import android.text.TextUtils;
import com.crashlytics.android.answers.shim.AnswersOptionalLogger;
import com.crashlytics.android.answers.shim.KitEvent;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.branch.referral.C14168s.C14169a;

/* renamed from: io.branch.referral.u */
/* compiled from: ExtendedAnswerProvider */
class C14188u {

    /* renamed from: a */
    public static final String f41742a = "Branch Install";

    /* renamed from: b */
    public static final String f41743b = "Branch Open";

    /* renamed from: c */
    public static final String f41744c = "Branch Share";

    /* renamed from: d */
    private static final String f41745d = "+";

    /* renamed from: e */
    private static final String f41746e = "~";

    /* renamed from: f */
    private static final String f41747f = ".";

    C14188u() {
    }

    /* renamed from: a */
    public void mo44794a(String str, JSONObject jSONObject, String str2) {
        try {
            KitEvent kitEvent = new KitEvent(str);
            if (jSONObject != null) {
                m61354a(kitEvent, jSONObject, "");
                kitEvent.putAttribute(C14169a.BranchIdentity.mo44764d(), str2);
                AnswersOptionalLogger.get().logKitEvent(kitEvent);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m61354a(KitEvent kitEvent, JSONObject jSONObject, String str) throws JSONException {
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            Object obj = jSONObject.get(str2);
            if (!str2.startsWith("+")) {
                boolean z = obj instanceof JSONObject;
                String str3 = f41747f;
                if (z) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(str2);
                    sb.append(str3);
                    m61354a(kitEvent, jSONObject2, sb.toString());
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(str3);
                    m61353a(kitEvent, jSONArray, sb2.toString());
                } else {
                    m61352a(kitEvent, str, str2, jSONObject.getString(str2));
                }
            }
        }
    }

    /* renamed from: a */
    private void m61353a(KitEvent kitEvent, JSONArray jSONArray, String str) throws JSONException {
        for (int i = 0; i < jSONArray.length(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(f41746e);
            sb.append(Integer.toString(i));
            m61352a(kitEvent, str, sb.toString(), jSONArray.getString(i));
        }
    }

    /* renamed from: a */
    private void m61352a(KitEvent kitEvent, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str3)) {
            String str4 = f41746e;
            if (str2.startsWith(str4)) {
                StringBuilder sb = new StringBuilder();
                String str5 = "";
                sb.append(str.replaceFirst(str4, str5));
                sb.append(str2.replaceFirst(str4, str5));
                kitEvent.putAttribute(sb.toString(), str3);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("$");
            sb2.append(C14169a.IdentityID.mo44764d());
            if (str2.equals(sb2.toString())) {
                kitEvent.putAttribute(C14169a.ReferringBranchIdentity.mo44764d(), str3);
            }
        }
    }
}
