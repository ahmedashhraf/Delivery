package p212io.branch.indexing;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.indexing.c */
/* compiled from: ContentDiscoveryManifest */
public class C14099c {

    /* renamed from: j */
    private static C14099c f41428j = null;

    /* renamed from: k */
    public static final String f41429k = "mv";

    /* renamed from: l */
    public static final String f41430l = "pn";

    /* renamed from: m */
    static final String f41431m = "h";

    /* renamed from: n */
    private static final String f41432n = "m";

    /* renamed from: o */
    private static final String f41433o = "p";

    /* renamed from: p */
    private static final String f41434p = "ck";

    /* renamed from: q */
    private static final String f41435q = "mtl";

    /* renamed from: r */
    private static final String f41436r = "mhl";

    /* renamed from: s */
    private static final String f41437s = "mps";

    /* renamed from: t */
    public static final String f41438t = "cd";

    /* renamed from: u */
    private static final String f41439u = "dri";

    /* renamed from: v */
    private static final String f41440v = "mdr";

    /* renamed from: w */
    static final int f41441w = 15;

    /* renamed from: x */
    static final int f41442x = 500;

    /* renamed from: a */
    private JSONObject f41443a;

    /* renamed from: b */
    private String f41444b;

    /* renamed from: c */
    private int f41445c = 0;

    /* renamed from: d */
    private int f41446d = 1;

    /* renamed from: e */
    private int f41447e = 0;

    /* renamed from: f */
    private boolean f41448f = false;

    /* renamed from: g */
    private JSONArray f41449g;

    /* renamed from: h */
    private SharedPreferences f41450h;

    /* renamed from: i */
    private final String f41451i = "BNC_CD_MANIFEST";

    /* renamed from: io.branch.indexing.c$a */
    /* compiled from: ContentDiscoveryManifest */
    class C14100a {

        /* renamed from: a */
        final JSONObject f41452a;

        /* renamed from: b */
        private boolean f41453b;

        /* renamed from: c */
        private int f41454c;

        /* renamed from: d */
        private int f41455d = 15;

        /* renamed from: e */
        final /* synthetic */ C14099c f41456e;

        C14100a(C14099c cVar, JSONObject jSONObject) {
            String str = C14099c.f41440v;
            String str2 = C14099c.f41439u;
            this.f41456e = cVar;
            this.f41452a = jSONObject;
            String str3 = "h";
            if (jSONObject.has(str3)) {
                try {
                    this.f41453b = !jSONObject.getBoolean(str3);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            try {
                if (jSONObject.has(str2)) {
                    this.f41454c = jSONObject.getInt(str2);
                }
                if (jSONObject.has(str)) {
                    this.f41455d = jSONObject.getInt(str);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo44583a() {
            return this.f41454c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public JSONArray mo44584b() {
            JSONObject jSONObject = this.f41452a;
            String str = C14099c.f41434p;
            if (jSONObject.has(str)) {
                try {
                    return this.f41452a.getJSONArray(str);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo44585c() {
            return this.f41455d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo44586d() {
            return this.f41453b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public boolean mo44587e() {
            JSONArray b = mo44584b();
            return b != null && b.length() == 0;
        }
    }

    private C14099c(Context context) {
        this.f41450h = context.getSharedPreferences("bnc_content_discovery_manifest_storage", 0);
        m60967b(context);
    }

    /* renamed from: a */
    public static C14099c m60966a(Context context) {
        if (f41428j == null) {
            f41428j = new C14099c(context);
        }
        return f41428j;
    }

    /* renamed from: b */
    private void m60967b(Context context) {
        String str = f41432n;
        String str2 = f41429k;
        String string = this.f41450h.getString("BNC_CD_MANIFEST", null);
        if (string != null) {
            try {
                this.f41443a = new JSONObject(string);
                if (this.f41443a.has(str2)) {
                    this.f41444b = this.f41443a.getString(str2);
                }
                if (this.f41443a.has(str)) {
                    this.f41449g = this.f41443a.getJSONArray(str);
                }
            } catch (JSONException unused) {
                this.f41443a = new JSONObject();
            }
        } else {
            this.f41443a = new JSONObject();
        }
    }

    /* renamed from: f */
    private void m60968f() {
        this.f41450h.edit().putString("BNC_CD_MANIFEST", this.f41443a.toString()).apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo44580c() {
        return this.f41445c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo44581d() {
        return this.f41446d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo44582e() {
        return this.f41448f;
    }

    /* renamed from: a */
    public void mo44578a(JSONObject jSONObject) {
        String str = f41437s;
        String str2 = f41435q;
        String str3 = f41436r;
        String str4 = f41432n;
        String str5 = f41429k;
        String str6 = f41438t;
        if (jSONObject.has(str6)) {
            this.f41448f = true;
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject(str6);
                if (jSONObject2.has(str5)) {
                    this.f41444b = jSONObject2.getString(str5);
                }
                if (jSONObject2.has(str3)) {
                    this.f41446d = jSONObject2.getInt(str3);
                }
                if (jSONObject2.has(str4)) {
                    this.f41449g = jSONObject2.getJSONArray(str4);
                }
                if (jSONObject2.has(str2)) {
                    int i = jSONObject2.getInt(str2);
                    if (i > 0) {
                        this.f41445c = i;
                    }
                }
                if (jSONObject2.has(str)) {
                    this.f41447e = jSONObject2.getInt(str);
                }
                this.f41443a.put(str5, this.f41444b);
                this.f41443a.put(str4, this.f41449g);
                m60968f();
            } catch (JSONException unused) {
            }
        } else {
            this.f41448f = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo44579b() {
        return this.f41447e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C14100a mo44576a(Activity activity) {
        String str = "p";
        if (this.f41449g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("/");
        sb.append(activity.getClass().getSimpleName());
        String sb2 = sb.toString();
        int i = 0;
        while (i < this.f41449g.length()) {
            try {
                JSONObject jSONObject = this.f41449g.getJSONObject(i);
                if (jSONObject.has(str) && jSONObject.getString(str).equals(sb2)) {
                    return new C14100a(this, jSONObject);
                }
                i++;
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public String mo44577a() {
        if (TextUtils.isEmpty(this.f41444b)) {
            return "-1";
        }
        return this.f41444b;
    }
}
