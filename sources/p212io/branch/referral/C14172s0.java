package p212io.branch.referral;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.referral.s0 */
/* compiled from: UniversalResourceAnalyser */
class C14172s0 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static JSONObject f41693c = null;

    /* renamed from: d */
    private static final String f41694d = "skip_url_format_key";

    /* renamed from: e */
    private static final String f41695e = "version";

    /* renamed from: f */
    private static final String f41696f = "uri_skip_list";

    /* renamed from: g */
    private static final String f41697g = "https://cdn.branch.io/sdk/uriskiplist_v#.json";

    /* renamed from: h */
    private static C14172s0 f41698h;

    /* renamed from: a */
    private final ArrayList<String> f41699a;

    /* renamed from: b */
    private final JSONObject f41700b = new JSONObject();

    /* renamed from: io.branch.referral.s0$b */
    /* compiled from: UniversalResourceAnalyser */
    private static class C14174b extends C14126f<Void, Void, JSONObject> {

        /* renamed from: a */
        private final C14204x f41701a;

        /* renamed from: b */
        private final int f41702b;

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0057, code lost:
            if (r1 != null) goto L_0x0059;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0059, code lost:
            r1.disconnect();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
            if (r1 != null) goto L_0x0059;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
            return r7;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public org.json.JSONObject doInBackground(java.lang.Void... r7) {
            /*
                r6 = this;
                org.json.JSONObject r7 = new org.json.JSONObject
                r7.<init>()
                r0 = 0
                java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x005f }
                java.lang.String r2 = "https://cdn.branch.io/sdk/uriskiplist_v#.json"
                java.lang.String r3 = "#"
                org.json.JSONObject r4 = p212io.branch.referral.C14172s0.f41693c     // Catch:{ all -> 0x005f }
                java.lang.String r5 = "version"
                int r4 = r4.optInt(r5)     // Catch:{ all -> 0x005f }
                int r4 = r4 + 1
                java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x005f }
                java.lang.String r2 = r2.replace(r3, r4)     // Catch:{ all -> 0x005f }
                r1.<init>(r2)     // Catch:{ all -> 0x005f }
                java.net.URLConnection r1 = r1.openConnection()     // Catch:{ all -> 0x005f }
                javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch:{ all -> 0x005f }
                r0 = 1500(0x5dc, float:2.102E-42)
                r1.setConnectTimeout(r0)     // Catch:{ all -> 0x005d }
                r1.setReadTimeout(r0)     // Catch:{ all -> 0x005d }
                int r0 = r1.getResponseCode()     // Catch:{ all -> 0x005d }
                r2 = 200(0xc8, float:2.8E-43)
                if (r0 != r2) goto L_0x0057
                java.io.InputStream r0 = r1.getInputStream()     // Catch:{ all -> 0x005d }
                if (r0 == 0) goto L_0x0057
                java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x005d }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x005d }
                java.io.InputStream r3 = r1.getInputStream()     // Catch:{ all -> 0x005d }
                r2.<init>(r3)     // Catch:{ all -> 0x005d }
                r0.<init>(r2)     // Catch:{ all -> 0x005d }
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x005d }
                java.lang.String r0 = r0.readLine()     // Catch:{ all -> 0x005d }
                r2.<init>(r0)     // Catch:{ all -> 0x005d }
                r7 = r2
            L_0x0057:
                if (r1 == 0) goto L_0x0063
            L_0x0059:
                r1.disconnect()
                goto L_0x0063
            L_0x005d:
                goto L_0x0060
            L_0x005f:
                r1 = r0
            L_0x0060:
                if (r1 == 0) goto L_0x0063
                goto L_0x0059
            L_0x0063:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p212io.branch.referral.C14172s0.C14174b.doInBackground(java.lang.Void[]):org.json.JSONObject");
        }

        private C14174b(Context context) {
            this.f41702b = ConnectionResult.f12762k0;
            this.f41701a = C14204x.m61505a(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(JSONObject jSONObject) {
            super.onPostExecute(jSONObject);
            String str = "version";
            if (jSONObject.optInt(str) > C14172s0.f41693c.optInt(str)) {
                C14172s0.f41693c = jSONObject;
                this.f41701a.mo44961c(C14172s0.f41694d, C14172s0.f41693c.toString());
            }
        }
    }

    private C14172s0(Context context) {
        try {
            this.f41700b.putOpt("version", Integer.valueOf(0));
            JSONArray jSONArray = new JSONArray();
            this.f41700b.putOpt(f41696f, jSONArray);
            jSONArray.put("^fb\\d+:");
            jSONArray.put("^li\\d+:");
            jSONArray.put("^pdk\\d+:");
            jSONArray.put("^twitterkit-.*:");
            jSONArray.put("^com\\.googleusercontent\\.apps\\.\\d+-.*:\\/oauth");
            jSONArray.put("^(?i)(?!(http|https):).*(:|:.*\\b)(password|o?auth|o?auth.?token|access|access.?token)\\b");
            jSONArray.put("^(?i)((http|https):\\/\\/).*[\\/|?|#].*\\b(password|o?auth|o?auth.?token|access|access.?token)\\b");
        } catch (JSONException unused) {
        }
        f41693c = m61308c(context);
        this.f41699a = new ArrayList<>();
    }

    /* renamed from: b */
    public static C14172s0 m61307b(Context context) {
        if (f41698h == null) {
            f41698h = new C14172s0(context);
        }
        return f41698h;
    }

    /* renamed from: c */
    private JSONObject m61308c(Context context) {
        C14204x a = C14204x.m61505a(context);
        JSONObject jSONObject = new JSONObject();
        String i = a.mo44978i(f41694d);
        if (TextUtils.isEmpty(i) || "bnc_no_value".equals(i)) {
            return this.f41700b;
        }
        try {
            return new JSONObject(i);
        } catch (JSONException unused) {
            return jSONObject;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44771a(String str) {
        this.f41699a.add(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44772a(List<String> list) {
        this.f41699a.addAll(list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo44773b(String str) {
        JSONObject jSONObject = f41693c;
        String str2 = f41696f;
        JSONArray optJSONArray = jSONObject.optJSONArray(str2);
        if (optJSONArray == null) {
            try {
                optJSONArray = new JSONArray();
                f41693c.put(str2, optJSONArray);
            } catch (Exception unused) {
                return;
            }
        }
        optJSONArray.put(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44770a(Context context) {
        try {
            new C14174b(context).mo44642a(new Void[0]);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo44774c(String str) {
        String str2;
        try {
            JSONArray optJSONArray = f41693c.optJSONArray(f41696f);
            if (optJSONArray != null) {
                int i = 0;
                while (true) {
                    if (i >= optJSONArray.length()) {
                        break;
                    }
                    try {
                        String string = optJSONArray.getString(i);
                        if (Pattern.compile(string).matcher(str).find()) {
                            str2 = string;
                            break;
                        }
                        i++;
                    } catch (JSONException unused) {
                    }
                }
            }
            str2 = null;
            if (str2 == null) {
                if (this.f41699a.size() <= 0) {
                    return str;
                }
                Iterator it = this.f41699a.iterator();
                while (it.hasNext()) {
                    if (str.matches((String) it.next())) {
                        return str;
                    }
                }
            }
            return str2;
        } catch (Exception unused2) {
            return str;
        }
    }
}
