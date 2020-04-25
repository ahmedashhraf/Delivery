package p212io.branch.referral;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.branch.referral.C14168s.C14169a;

/* renamed from: io.branch.referral.x */
/* compiled from: PrefHelper */
public class C14204x {

    /* renamed from: A */
    private static final String f41832A = "bnc_user_url";

    /* renamed from: B */
    private static final String f41833B = "bnc_is_referrable";

    /* renamed from: C */
    private static final String f41834C = "bnc_buckets";

    /* renamed from: D */
    private static final String f41835D = "bnc_credit_base_";

    /* renamed from: E */
    private static final String f41836E = "bnc_actions";

    /* renamed from: F */
    private static final String f41837F = "bnc_total_base_";

    /* renamed from: G */
    private static final String f41838G = "bnc_balance_base_";

    /* renamed from: H */
    private static final String f41839H = "bnc_retry_count";

    /* renamed from: I */
    private static final String f41840I = "bnc_retry_interval";

    /* renamed from: J */
    private static final String f41841J = "bnc_timeout";

    /* renamed from: K */
    private static final String f41842K = "bnc_system_read_date";

    /* renamed from: L */
    private static final String f41843L = "bnc_external_intent_uri";

    /* renamed from: M */
    private static final String f41844M = "bnc_external_intent_extra";

    /* renamed from: N */
    private static final String f41845N = "bnc_branch_view_use";

    /* renamed from: O */
    private static final String f41846O = "bnc_branch_analytical_data";

    /* renamed from: P */
    private static final String f41847P = "bnc_branch_strong_match_time";

    /* renamed from: Q */
    private static final String f41848Q = "bnc_install_referrer";

    /* renamed from: R */
    private static final String f41849R = "bnc_is_full_app_conversion";

    /* renamed from: S */
    private static final String f41850S = "bnc_limit_facebook_tracking";

    /* renamed from: T */
    static final String f41851T = "bnc_original_install_time";

    /* renamed from: U */
    static final String f41852U = "bnc_last_known_update_time";

    /* renamed from: V */
    static final String f41853V = "bnc_previous_update_time";

    /* renamed from: W */
    static final String f41854W = "bnc_referrer_click_ts";

    /* renamed from: X */
    static final String f41855X = "bnc_install_begin_ts";

    /* renamed from: Y */
    static final String f41856Y = "bnc_tracking_state";

    /* renamed from: Z */
    private static String f41857Z = null;

    /* renamed from: a0 */
    private static C14204x f41858a0 = null;

    /* renamed from: b0 */
    private static JSONObject f41859b0 = null;

    /* renamed from: f */
    private static boolean f41860f = false;

    /* renamed from: g */
    public static final String f41861g = "bnc_no_value";

    /* renamed from: h */
    private static final int f41862h = 1000;

    /* renamed from: i */
    private static final int f41863i = 3;

    /* renamed from: j */
    private static final int f41864j = 5500;

    /* renamed from: k */
    private static final String f41865k = "branch_referral_shared_pref";

    /* renamed from: l */
    private static final String f41866l = "bnc_branch_key";

    /* renamed from: m */
    private static final String f41867m = "bnc_app_version";

    /* renamed from: n */
    private static final String f41868n = "bnc_device_fingerprint_id";

    /* renamed from: o */
    private static final String f41869o = "bnc_session_id";

    /* renamed from: p */
    private static final String f41870p = "bnc_identity_id";

    /* renamed from: q */
    private static final String f41871q = "bnc_identity";

    /* renamed from: r */
    private static final String f41872r = "bnc_link_click_id";

    /* renamed from: s */
    private static final String f41873s = "bnc_link_click_identifier";

    /* renamed from: t */
    private static final String f41874t = "bnc_google_search_install_identifier";

    /* renamed from: u */
    private static final String f41875u = "bnc_google_play_install_referrer_extras";

    /* renamed from: v */
    private static final String f41876v = "bnc_triggered_by_fb_app_link";

    /* renamed from: w */
    private static final String f41877w = "bnc_app_link";

    /* renamed from: x */
    private static final String f41878x = "bnc_push_identifier";

    /* renamed from: y */
    private static final String f41879y = "bnc_session_params";

    /* renamed from: z */
    private static final String f41880z = "bnc_install_params";

    /* renamed from: a */
    private SharedPreferences f41881a;

    /* renamed from: b */
    private Editor f41882b = this.f41881a.edit();

    /* renamed from: c */
    private final JSONObject f41883c;

    /* renamed from: d */
    private final JSONObject f41884d;

    /* renamed from: e */
    private Context f41885e;

    private C14204x(Context context) {
        this.f41881a = context.getSharedPreferences(f41865k, 0);
        this.f41885e = context;
        this.f41883c = new JSONObject();
        this.f41884d = new JSONObject();
    }

    /* renamed from: M */
    private void m61502M() {
        String y = mo45009y();
        String z = mo45011z();
        String f = mo44972f();
        String A = mo44926A();
        this.f41882b.clear();
        mo45003v(y);
        mo45006w(z);
        mo44980j(f);
        mo45008x(A);
        f41858a0.f41882b.apply();
    }

    /* renamed from: N */
    private ArrayList<String> m61503N() {
        String i = mo44978i(f41836E);
        if (i.equals("bnc_no_value")) {
            return new ArrayList<>();
        }
        return m61501C(i);
    }

    /* renamed from: O */
    private ArrayList<String> m61504O() {
        String i = mo44978i(f41834C);
        if (i.equals("bnc_no_value")) {
            return new ArrayList<>();
        }
        return m61501C(i);
    }

    /* renamed from: a */
    public static C14204x m61505a(Context context) {
        if (f41858a0 == null) {
            f41858a0 = new C14204x(context);
        }
        return f41858a0;
    }

    /* renamed from: A */
    public String mo44926A() {
        return mo44978i(f41878x);
    }

    /* renamed from: B */
    public void mo44929B(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("bnc_branch_view_use_");
        sb.append(str);
        mo44970e(sb.toString(), mo44964d(str) + 1);
    }

    /* renamed from: C */
    public int mo44930C() {
        return mo44941a(f41839H, 3);
    }

    /* renamed from: D */
    public int mo44931D() {
        return mo44941a(f41840I, 1000);
    }

    /* renamed from: E */
    public String mo44932E() {
        return mo44978i(f41869o);
    }

    /* renamed from: F */
    public String mo44933F() {
        return mo44978i(f41879y);
    }

    /* renamed from: G */
    public int mo44934G() {
        return mo44941a(f41841J, (int) f41864j);
    }

    /* renamed from: H */
    public String mo44935H() {
        return mo44978i(f41832A);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: I */
    public boolean mo44936I() {
        return mo44963c(f41850S);
    }

    /* renamed from: J */
    public boolean mo44937J() {
        return mo44963c(f41849R);
    }

    /* renamed from: K */
    public void mo44938K() {
        f41860f = true;
    }

    /* renamed from: L */
    public void mo44939L() {
        mo44970e(f41833B, 1);
    }

    /* renamed from: b */
    public void mo44954b(int i) {
        mo44970e(f41839H, i);
    }

    /* renamed from: c */
    public void mo44959c(int i) {
        mo44970e(f41840I, i);
    }

    /* renamed from: d */
    public void mo44966d(int i) {
        mo44970e(f41841J, i);
    }

    /* renamed from: e */
    public int mo44968e(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(f41835D);
        sb.append(str);
        return mo44973g(sb.toString());
    }

    /* renamed from: e */
    public String mo44969e() {
        return "https://api.branch.io/";
    }

    /* renamed from: f */
    public String mo44972f() {
        return mo44978i(f41877w);
    }

    /* renamed from: g */
    public String mo44974g() {
        return mo44978i(f41867m);
    }

    /* renamed from: h */
    public long mo44975h(String str) {
        return f41858a0.f41881a.getLong(str, 0);
    }

    /* renamed from: i */
    public String mo44977i() {
        if (f41857Z == null) {
            f41857Z = mo44978i(f41866l);
        }
        return f41857Z;
    }

    /* renamed from: j */
    public void mo44980j(String str) {
        mo44961c(f41877w, str);
    }

    /* renamed from: k */
    public void mo44982k(String str) {
        mo44961c(f41867m, str);
    }

    /* renamed from: l */
    public boolean mo44984l(String str) {
        f41857Z = str;
        String str2 = f41866l;
        String i = mo44978i(str2);
        if (str != null && i != null && i.equals(str)) {
            return false;
        }
        m61502M();
        mo44961c(str2, str);
        return true;
    }

    /* renamed from: m */
    public void mo44986m(String str) {
        mo44961c(f41868n, str);
    }

    /* renamed from: n */
    public String mo44987n() {
        return mo44978i(f41843L);
    }

    /* renamed from: o */
    public void mo44990o(String str) {
        mo44961c(f41843L, str);
    }

    /* renamed from: p */
    public String mo44991p() {
        return mo44978i(f41874t);
    }

    /* renamed from: q */
    public String mo44993q() {
        return mo44978i(f41871q);
    }

    /* renamed from: r */
    public String mo44995r() {
        return mo44978i(f41870p);
    }

    /* renamed from: s */
    public void mo44998s(String str) {
        mo44961c(f41870p, str);
    }

    /* renamed from: t */
    public String mo44999t() {
        return mo44978i(f41880z);
    }

    /* renamed from: u */
    public void mo45002u(String str) {
        mo44961c(f41848Q, str);
    }

    /* renamed from: v */
    public void mo45003v(String str) {
        mo44961c(f41872r, str);
    }

    /* renamed from: w */
    public void mo45006w(String str) {
        mo44961c(f41873s, str);
    }

    /* renamed from: x */
    public void mo45008x(String str) {
        mo44961c(f41878x, str);
    }

    /* renamed from: y */
    public void mo45010y(String str) {
        mo44961c(f41869o, str);
    }

    /* renamed from: z */
    public String mo45011z() {
        return mo44978i(f41873s);
    }

    /* renamed from: C */
    private ArrayList<String> m61501C(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, str.split(","));
        return arrayList;
    }

    /* renamed from: A */
    public void mo44927A(String str) {
        mo44961c(f41832A, str);
    }

    /* renamed from: b */
    public void mo44957b(boolean z) {
        mo44949a(f41849R, Boolean.valueOf(z));
    }

    /* renamed from: c */
    public void mo44958c() {
        mo44948a(f41842K, Calendar.getInstance().getTimeInMillis() / 1000);
    }

    /* renamed from: d */
    public void mo44965d() {
        Iterator it = m61504O().iterator();
        while (it.hasNext()) {
            mo44967d((String) it.next(), 0);
        }
        m61508c(new ArrayList<>());
        Iterator it2 = m61503N().iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            mo44955b(str, 0);
            mo44960c(str, 0);
        }
        m61507b(new ArrayList<>());
    }

    /* renamed from: e */
    public void mo44970e(String str, int i) {
        f41858a0.f41882b.putInt(str, i);
        f41858a0.f41882b.apply();
    }

    /* renamed from: f */
    public float mo44971f(String str) {
        return f41858a0.f41881a.getFloat(str, 0.0f);
    }

    /* renamed from: g */
    public int mo44973g(String str) {
        return mo44941a(str, 0);
    }

    /* renamed from: h */
    public JSONObject mo44976h() {
        JSONObject jSONObject = f41859b0;
        if (jSONObject != null) {
            return jSONObject;
        }
        String i = mo44978i(f41846O);
        JSONObject jSONObject2 = new JSONObject();
        if (!TextUtils.isEmpty(i) && !i.equals("bnc_no_value")) {
            try {
                return new JSONObject(i);
            } catch (JSONException unused) {
            }
        }
        return jSONObject2;
    }

    /* renamed from: j */
    public int mo44979j() {
        return mo44968e(C14169a.DefaultBucket.mo44764d());
    }

    /* renamed from: k */
    public String mo44981k() {
        return mo44978i(f41868n);
    }

    /* renamed from: m */
    public String mo44985m() {
        return mo44978i(f41844M);
    }

    /* renamed from: n */
    public void mo44988n(String str) {
        mo44961c(f41844M, str);
    }

    /* renamed from: o */
    public String mo44989o() {
        return mo44978i(f41875u);
    }

    /* renamed from: p */
    public void mo44992p(String str) {
        mo44961c(f41875u, str);
    }

    /* renamed from: q */
    public void mo44994q(String str) {
        mo44961c(f41874t, str);
    }

    /* renamed from: r */
    public void mo44996r(String str) {
        mo44961c(f41871q, str);
    }

    /* renamed from: s */
    public JSONObject mo44997s() {
        return this.f41884d;
    }

    /* renamed from: t */
    public void mo45000t(String str) {
        mo44961c(f41880z, str);
    }

    /* renamed from: u */
    public String mo45001u() {
        return mo44978i(f41848Q);
    }

    /* renamed from: v */
    public boolean mo45004v() {
        return mo44963c(f41876v);
    }

    /* renamed from: w */
    public int mo45005w() {
        return mo44973g(f41833B);
    }

    /* renamed from: x */
    public long mo45007x() {
        return mo44975h(f41847P);
    }

    /* renamed from: y */
    public String mo45009y() {
        return mo44978i(f41872r);
    }

    /* renamed from: z */
    public void mo45012z(String str) {
        mo44961c(f41879y, str);
    }

    /* renamed from: b */
    public void mo44953b() {
        mo44970e(f41833B, 0);
    }

    /* renamed from: b */
    private void m61507b(ArrayList<String> arrayList) {
        int size = arrayList.size();
        String str = f41836E;
        if (size == 0) {
            mo44961c(str, "bnc_no_value");
        } else {
            mo44961c(str, m61506a(arrayList));
        }
    }

    /* renamed from: B */
    public JSONObject mo44928B() {
        return this.f41883c;
    }

    /* renamed from: a */
    public String mo44942a(boolean z) {
        String str = "io.branch.sdk.BranchKey";
        String str2 = z ? str : "io.branch.sdk.BranchKey.test";
        if (!z) {
            mo44938K();
        }
        String str3 = null;
        try {
            ApplicationInfo applicationInfo = this.f41885e.getPackageManager().getApplicationInfo(this.f41885e.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                str3 = applicationInfo.metaData.getString(str2);
                if (str3 == null && !z) {
                    str3 = applicationInfo.metaData.getString(str);
                }
            }
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(str3)) {
            try {
                Resources resources = this.f41885e.getResources();
                str3 = resources.getString(resources.getIdentifier(str2, "string", this.f41885e.getPackageName()));
            } catch (Exception unused2) {
            }
        }
        return str3 == null ? "bnc_no_value" : str3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo44962c(boolean z) {
        mo44949a(f41850S, Boolean.valueOf(z));
    }

    /* renamed from: i */
    public String mo44978i(String str) {
        return f41858a0.f41881a.getString(str, "bnc_no_value");
    }

    /* renamed from: c */
    private void m61508c(ArrayList<String> arrayList) {
        int size = arrayList.size();
        String str = f41834C;
        if (size == 0) {
            mo44961c(str, "bnc_no_value");
        } else {
            mo44961c(str, m61506a(arrayList));
        }
    }

    /* renamed from: l */
    public boolean mo44983l() {
        return f41860f;
    }

    /* renamed from: b */
    public void mo44955b(String str, int i) {
        ArrayList N = m61503N();
        if (!N.contains(str)) {
            N.add(str);
            m61507b(N);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f41837F);
        sb.append(str);
        mo44970e(sb.toString(), i);
    }

    /* renamed from: c */
    public void mo44960c(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(f41838G);
        sb.append(str);
        mo44970e(sb.toString(), i);
    }

    /* renamed from: c */
    public boolean mo44963c(String str) {
        return f41858a0.f41881a.getBoolean(str, false);
    }

    /* renamed from: c */
    public void mo44961c(String str, String str2) {
        f41858a0.f41882b.putString(str, str2);
        f41858a0.f41882b.apply();
    }

    /* renamed from: d */
    public void mo44967d(String str, int i) {
        ArrayList O = m61504O();
        if (!O.contains(str)) {
            O.add(str);
            m61508c(O);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f41835D);
        sb.append(str);
        mo44970e(sb.toString(), i);
    }

    /* renamed from: a */
    public void mo44946a(Boolean bool) {
        mo44949a(f41876v, bool);
    }

    /* renamed from: b */
    public int mo44952b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(f41838G);
        sb.append(str);
        return mo44973g(sb.toString());
    }

    /* renamed from: a */
    public void mo44944a(int i) {
        mo44967d(C14169a.DefaultBucket.mo44764d(), i);
    }

    /* renamed from: b */
    public void mo44956b(@C0193h0 String str, @C0193h0 String str2) {
        if (str != null) {
            if (this.f41883c.has(str) && str2 == null) {
                this.f41883c.remove(str);
            }
            try {
                this.f41883c.put(str, str2);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public int mo44940a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(f41837F);
        sb.append(str);
        return mo44973g(sb.toString());
    }

    /* renamed from: a */
    private String m61506a(ArrayList<String> arrayList) {
        Iterator it = arrayList.iterator();
        String str = "";
        while (it.hasNext()) {
            String str2 = (String) it.next();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            sb.append(",");
            str = sb.toString();
        }
        return str.substring(0, str.length() - 1);
    }

    /* renamed from: d */
    public int mo44964d(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("bnc_branch_view_use_");
        sb.append(str);
        return mo44941a(sb.toString(), 0);
    }

    /* renamed from: d */
    public static void m61509d(String str, String str2) {
        if (C6009d.f17239m0 != null || !f41860f) {
            Boolean bool = C6009d.f17239m0;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
            }
        }
    }

    /* renamed from: a */
    public int mo44941a(String str, int i) {
        return f41858a0.f41881a.getInt(str, i);
    }

    /* renamed from: a */
    public void mo44948a(String str, long j) {
        f41858a0.f41882b.putLong(str, j);
        f41858a0.f41882b.apply();
    }

    /* renamed from: a */
    public void mo44947a(String str, float f) {
        f41858a0.f41882b.putFloat(str, f);
        f41858a0.f41882b.apply();
    }

    /* renamed from: a */
    public void mo44949a(String str, Boolean bool) {
        f41858a0.f41882b.putBoolean(str, bool.booleanValue());
        f41858a0.f41882b.apply();
    }

    /* renamed from: a */
    public void mo44943a() {
        f41859b0 = null;
        mo44961c(f41846O, "");
    }

    /* renamed from: a */
    public void mo44951a(JSONObject jSONObject) {
        JSONArray jSONArray;
        String E = mo44932E();
        if (!E.equals("bnc_no_value")) {
            if (f41859b0 == null) {
                f41859b0 = mo44976h();
            }
            try {
                if (f41859b0.has(E)) {
                    jSONArray = f41859b0.getJSONArray(E);
                } else {
                    JSONArray jSONArray2 = new JSONArray();
                    f41859b0.put(E, jSONArray2);
                    jSONArray = jSONArray2;
                }
                jSONArray.put(jSONObject);
                mo44961c(f41846O, f41859b0.toString());
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo44945a(long j) {
        mo44948a(f41847P, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44950a(String str, String str2) {
        if (str != null) {
            try {
                this.f41884d.putOpt(str, str2);
            } catch (JSONException unused) {
            }
        }
    }
}
