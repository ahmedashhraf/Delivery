package com.instabug.featuresrequest.models;

import com.instabug.featuresrequest.models.C9573e.C9574a;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.util.InstabugSDKLogger;
import org.apache.http.cookie.C15222a;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.models.b */
/* compiled from: Comment */
public class C9570b extends C9573e {

    /* renamed from: W */
    private static transient /* synthetic */ boolean[] f25307W;

    /* renamed from: O */
    protected long f25308O;

    /* renamed from: P */
    private String f25309P;

    /* renamed from: Q */
    private boolean f25310Q;

    /* renamed from: R */
    private String f25311R;

    /* renamed from: S */
    private String f25312S;

    /* renamed from: T */
    private String f25313T;

    /* renamed from: U */
    private boolean f25314U = true;

    /* renamed from: V */
    private String f25315V;

    public C9570b() {
        boolean[] m = mo34299m();
        m[0] = true;
    }

    /* renamed from: m */
    private static /* synthetic */ boolean[] mo34299m() {
        boolean[] zArr = f25307W;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(4912300618948312413L, "com/instabug/featuresrequest/models/Comment", 61);
        f25307W = a;
        return a;
    }

    /* renamed from: a */
    public void mo34281a(boolean z) {
        boolean[] m = mo34299m();
        this.f25314U = z;
        m[4] = true;
    }

    /* renamed from: b */
    public void mo34283b(String str) {
        boolean[] m = mo34299m();
        this.f25315V = str;
        m[2] = true;
    }

    /* renamed from: c */
    public void mo34285c(String str) {
        boolean[] m = mo34299m();
        this.f25309P = str;
        m[8] = true;
    }

    /* renamed from: d */
    public void mo34286d(String str) {
        boolean[] m = mo34299m();
        this.f25311R = str;
        m[12] = true;
    }

    /* renamed from: e */
    public String mo34287e() {
        boolean[] m = mo34299m();
        String str = this.f25315V;
        m[1] = true;
        return str;
    }

    /* renamed from: f */
    public boolean mo34290f() {
        boolean[] m = mo34299m();
        boolean z = this.f25314U;
        m[3] = true;
        return z;
    }

    public void fromJson(String str) throws JSONException {
        boolean[] m = mo34299m();
        InstabugSDKLogger.m46622d(this, str);
        m[27] = true;
        JSONObject jSONObject = new JSONObject(str);
        m[28] = true;
        String str2 = "id";
        if (!jSONObject.has(str2)) {
            m[29] = true;
        } else {
            m[30] = true;
            mo34282b(jSONObject.getLong(str2));
            m[31] = true;
        }
        String str3 = "created_at";
        if (!jSONObject.has(str3)) {
            m[32] = true;
        } else {
            m[33] = true;
            mo34309a(jSONObject.getLong(str3));
            m[34] = true;
        }
        String str4 = "type";
        if (!jSONObject.has(str4)) {
            m[35] = true;
        } else {
            m[36] = true;
            String string = jSONObject.getString(str4);
            m[37] = true;
            char c = 65535;
            int hashCode = string.hashCode();
            if (hashCode != -144558306) {
                if (hashCode != 950398559) {
                    m[38] = true;
                } else if (!string.equals(C15222a.f44135A)) {
                    m[39] = true;
                } else {
                    m[40] = true;
                    c = 1;
                }
            } else if (!string.equals("state_change")) {
                m[41] = true;
            } else {
                m[42] = true;
                c = 2;
            }
            if (c != 2) {
                mo34310a(C9574a.COMMENT);
                m[43] = true;
            } else {
                mo34310a(C9574a.STATUS_CHANE);
                m[44] = true;
            }
        }
        String str5 = NetworkManager.UUID;
        if (!jSONObject.has(str5)) {
            m[45] = true;
        } else {
            m[46] = true;
            mo34289f(jSONObject.getString(str5));
            m[47] = true;
        }
        String str6 = "body";
        if (!jSONObject.has(str6)) {
            m[48] = true;
        } else {
            m[49] = true;
            mo34285c(jSONObject.getString(str6));
            m[50] = true;
        }
        String str7 = "admin";
        if (!jSONObject.has(str7)) {
            m[51] = true;
        } else {
            m[52] = true;
            mo34284b(jSONObject.getBoolean(str7));
            m[53] = true;
        }
        String str8 = "commenter_name";
        if (!jSONObject.has(str8)) {
            m[54] = true;
        } else {
            m[55] = true;
            mo34286d(jSONObject.getString(str8));
            m[56] = true;
        }
        String str9 = "avatar";
        if (!jSONObject.has(str9)) {
            m[57] = true;
        } else {
            m[58] = true;
            mo34288e(jSONObject.getString(str9));
            m[59] = true;
        }
        m[60] = true;
    }

    /* renamed from: g */
    public long mo34291g() {
        boolean[] m = mo34299m();
        long j = this.f25308O;
        m[5] = true;
        return j;
    }

    /* renamed from: h */
    public String mo34292h() {
        boolean[] m = mo34299m();
        String str = this.f25309P;
        m[7] = true;
        return str;
    }

    /* renamed from: i */
    public boolean mo34293i() {
        boolean[] m = mo34299m();
        boolean z = this.f25310Q;
        m[9] = true;
        return z;
    }

    /* renamed from: j */
    public String mo34294j() {
        boolean[] m = mo34299m();
        String str = this.f25311R;
        m[11] = true;
        return str;
    }

    /* renamed from: k */
    public String mo34295k() {
        boolean[] m = mo34299m();
        String str = this.f25312S;
        m[13] = true;
        return str;
    }

    /* renamed from: l */
    public String mo34296l() {
        boolean[] m = mo34299m();
        String str = this.f25313T;
        m[15] = true;
        return str;
    }

    public String toJson() throws JSONException {
        boolean[] m = mo34299m();
        JSONObject jSONObject = new JSONObject();
        m[17] = true;
        JSONObject put = jSONObject.put("id", mo34291g());
        m[18] = true;
        JSONObject put2 = put.put("created_at", mo34308a());
        m[19] = true;
        put2.put("type", mo34311d());
        m[20] = true;
        jSONObject.put(NetworkManager.UUID, mo34296l());
        m[21] = true;
        jSONObject.put("body", mo34292h());
        m[22] = true;
        jSONObject.put("admin", mo34293i());
        m[23] = true;
        jSONObject.put("commenter_name", mo34294j());
        m[24] = true;
        jSONObject.put("avatar", mo34295k());
        m[25] = true;
        String jSONObject2 = jSONObject.toString();
        m[26] = true;
        return jSONObject2;
    }

    /* renamed from: e */
    public void mo34288e(String str) {
        boolean[] m = mo34299m();
        this.f25312S = str;
        m[14] = true;
    }

    /* renamed from: f */
    public void mo34289f(String str) {
        boolean[] m = mo34299m();
        this.f25313T = str;
        m[16] = true;
    }

    /* renamed from: b */
    public void mo34282b(long j) {
        boolean[] m = mo34299m();
        this.f25308O = j;
        m[6] = true;
    }

    /* renamed from: b */
    public void mo34284b(boolean z) {
        boolean[] m = mo34299m();
        this.f25310Q = z;
        m[10] = true;
    }
}
