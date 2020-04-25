package com.clevertap.android.sdk;

import android.text.TextUtils;
import androidx.core.app.C0770p;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.FeatureRequestEntry;
import com.instabug.library.model.State;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.clevertap.android.sdk.l0 */
/* compiled from: CTMessageDAO */
class C3129l0 {

    /* renamed from: a */
    private String f11188a;

    /* renamed from: b */
    private JSONObject f11189b;

    /* renamed from: c */
    private boolean f11190c;

    /* renamed from: d */
    private long f11191d;

    /* renamed from: e */
    private long f11192e;

    /* renamed from: f */
    private String f11193f;

    /* renamed from: g */
    private List<String> f11194g = new ArrayList();

    /* renamed from: h */
    private String f11195h;

    /* renamed from: i */
    private JSONObject f11196i;

    C3129l0() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12361a(JSONObject jSONObject) {
        this.f11189b = jSONObject;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo12365b(String str) {
        this.f11188a = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public long mo12367c() {
        return this.f11191d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public long mo12369d() {
        return this.f11192e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public String mo12371e() {
        return this.f11188a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public JSONObject mo12372f() {
        return this.f11189b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public String mo12373g() {
        return TextUtils.join(",", this.f11194g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public String mo12374h() {
        return this.f11193f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public JSONObject mo12375i() {
        return this.f11196i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo12376j() {
        return this.f11190c ? 1 : 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public JSONObject mo12377k() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f11188a);
            jSONObject.put(C0770p.f3520e0, this.f11189b);
            jSONObject.put("isRead", this.f11190c);
            jSONObject.put("date", this.f11191d);
            jSONObject.put("wzrk_ttl", this.f11192e);
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.f11194g.size(); i++) {
                jSONArray.put(this.f11194g.get(i));
            }
            jSONObject.put(State.KEY_TAGS, jSONArray);
            jSONObject.put("wzrk_id", this.f11195h);
            jSONObject.put("wzrkParams", this.f11196i);
            return jSONObject;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to convert CTMessageDao to JSON - ");
            sb.append(e.getLocalizedMessage());
            C3111h1.m14938f(sb.toString());
            return jSONObject;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12358a(int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.f11190c = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo12364b(long j) {
        this.f11192e = j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo12368c(String str) {
        this.f11194g.addAll(Arrays.asList(str.split(",")));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo12370d(String str) {
        this.f11193f = str;
    }

    private C3129l0(String str, JSONObject jSONObject, boolean z, long j, long j2, String str2, List<String> list, String str3, JSONObject jSONObject2) {
        this.f11188a = str;
        this.f11189b = jSONObject;
        this.f11190c = z;
        this.f11191d = j;
        this.f11192e = j2;
        this.f11193f = str2;
        this.f11194g = list;
        this.f11195h = str3;
        this.f11196i = jSONObject2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12359a(long j) {
        this.f11191d = j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo12363b() {
        return this.f11195h;
    }

    /* renamed from: c */
    private static JSONObject m15026c(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            if (str.startsWith("wzrk_")) {
                jSONObject2.put(str, jSONObject.get(str));
            }
        }
        return jSONObject2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12360a(String str) {
        this.f11195h = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo12366b(JSONObject jSONObject) {
        this.f11196i = jSONObject;
    }

    /* renamed from: a */
    static C3129l0 m15025a(JSONObject jSONObject, String str) {
        C3129l0 l0Var;
        JSONObject jSONObject2 = jSONObject;
        String str2 = State.KEY_TAGS;
        String str3 = C0770p.f3520e0;
        String str4 = "wzrk_ttl";
        String str5 = "date";
        String str6 = FeatureRequestEntry.COLUMN_ID;
        String str7 = "wzrk_id";
        try {
            String string = jSONObject2.has(str6) ? jSONObject2.getString(str6) : null;
            long j = jSONObject2.has(str5) ? (long) jSONObject2.getInt(str5) : System.currentTimeMillis() / 1000;
            long j2 = jSONObject2.has(str4) ? (long) jSONObject2.getInt(str4) : (System.currentTimeMillis() + 86400000) / 1000;
            JSONObject jSONObject3 = jSONObject2.has(str3) ? jSONObject2.getJSONObject(str3) : null;
            ArrayList arrayList = new ArrayList();
            if (jSONObject3 != null) {
                JSONArray jSONArray = jSONObject3.has(str2) ? jSONObject3.getJSONArray(str2) : null;
                if (jSONArray != null) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(jSONArray.getString(i));
                    }
                }
            }
            String str8 = "0_0";
            String string2 = jSONObject2.has(str7) ? jSONObject2.getString(str7) : str8;
            if (string2.equalsIgnoreCase(str8)) {
                jSONObject2.put(str7, string2);
            }
            JSONObject c = m15026c(jSONObject);
            if (string == null) {
                l0Var = null;
            } else {
                l0Var = new C3129l0(string, jSONObject3, false, j, j2, str, arrayList, string2, c);
            }
            return l0Var;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to parse Notification inbox message to CTMessageDao - ");
            sb.append(e.getLocalizedMessage());
            C3111h1.m14930d(sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo12362a() {
        CTInboxMessageContent cTInboxMessageContent = (CTInboxMessageContent) new CTInboxMessage(mo12377k()).mo12022p().get(0);
        if (cTInboxMessageContent.mo12063s() || cTInboxMessageContent.mo12060p()) {
            return true;
        }
        return false;
    }
}
