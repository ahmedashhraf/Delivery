package com.instabug.featuresrequest.models;

import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.models.a */
/* compiled from: FeatureRequest */
public class C9567a implements Cacheable, Serializable {

    /* renamed from: W */
    public static final String f25284W = "id";

    /* renamed from: X */
    public static final String f25285X = "title";

    /* renamed from: Y */
    public static final String f25286Y = "description";

    /* renamed from: Z */
    public static final String f25287Z = "status";

    /* renamed from: a0 */
    public static final String f25288a0 = "likes_count";

    /* renamed from: b0 */
    public static final String f25289b0 = "comments_count";

    /* renamed from: c0 */
    public static final String f25290c0 = "liked";

    /* renamed from: d0 */
    public static final String f25291d0 = "date";

    /* renamed from: e0 */
    public static final String f25292e0 = "color_code";

    /* renamed from: f0 */
    public static final String f25293f0 = "creator_name";

    /* renamed from: g0 */
    private static final String f25294g0 = "ib_user_vote_status";

    /* renamed from: h0 */
    private static transient /* synthetic */ boolean[] f25295h0;

    /* renamed from: N */
    private String f25296N;

    /* renamed from: O */
    private C9568a f25297O = C9568a.Open;

    /* renamed from: P */
    private String f25298P;

    /* renamed from: Q */
    private String f25299Q;

    /* renamed from: R */
    private long f25300R;

    /* renamed from: S */
    private int f25301S;

    /* renamed from: T */
    private int f25302T;

    /* renamed from: U */
    private boolean f25303U;

    /* renamed from: V */
    private C9569b f25304V = C9569b.NOTHING;

    /* renamed from: a */
    private long f25305a;

    /* renamed from: b */
    private String f25306b;

    /* renamed from: com.instabug.featuresrequest.models.a$a */
    /* compiled from: FeatureRequest */
    public enum C9568a {
        Open(0),
        Planned(1),
        InProgress(2),
        Completed(3),
        MaybeLater(4);
        
        private int status;

        static {
            boolean[] e;
            e[4] = true;
        }

        private C9568a(int i) {
            boolean[] e = m44719e();
            this.status = i;
            e[2] = true;
        }

        /* renamed from: d */
        public int mo34279d() {
            boolean[] e = m44719e();
            int i = this.status;
            e[3] = true;
            return i;
        }
    }

    /* renamed from: com.instabug.featuresrequest.models.a$b */
    /* compiled from: FeatureRequest */
    public enum C9569b {
        NOTHING(0),
        UPLOADED(1),
        USER_VOTED_UP(2),
        USER_UN_VOTED(3);
        
        private int status;

        static {
            boolean[] e;
            e[4] = true;
        }

        private C9569b(int i) {
            boolean[] e = m44721e();
            this.status = i;
            e[2] = true;
        }

        /* renamed from: d */
        public int mo34280d() {
            boolean[] e = m44721e();
            int i = this.status;
            e[3] = true;
            return i;
        }
    }

    public C9567a() {
        boolean[] p = m44694p();
        p[10] = true;
        this.f25305a = System.currentTimeMillis() / 1000;
        p[11] = true;
    }

    /* renamed from: a */
    public static List<C9567a> m44693a(JSONArray jSONArray) throws JSONException {
        boolean[] p = m44694p();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        p[0] = true;
        p[1] = true;
        while (i < jSONArray.length()) {
            p[2] = true;
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            p[3] = true;
            C9567a aVar = new C9567a();
            p[4] = true;
            aVar.fromJson(jSONObject.toString());
            p[5] = true;
            arrayList.add(aVar);
            i++;
            p[6] = true;
        }
        p[7] = true;
        return arrayList;
    }

    /* renamed from: p */
    private static /* synthetic */ boolean[] m44694p() {
        boolean[] zArr = f25295h0;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1056363252820638549L, "com/instabug/featuresrequest/models/FeatureRequest", 98);
        f25295h0 = a;
        return a;
    }

    /* renamed from: b */
    public void mo34262b(long j) {
        boolean[] p = m44694p();
        this.f25305a = j;
        p[13] = true;
    }

    /* renamed from: c */
    public void mo34264c(String str) {
        boolean[] p = m44694p();
        this.f25299Q = str;
        p[31] = true;
    }

    /* renamed from: d */
    public int mo34265d() {
        boolean[] p = m44694p();
        int i = this.f25302T;
        p[20] = true;
        return i;
    }

    /* renamed from: e */
    public void mo34268e(String str) {
        boolean[] p = m44694p();
        this.f25306b = str;
        p[15] = true;
    }

    /* renamed from: f */
    public long mo34269f() {
        boolean[] p = m44694p();
        long j = this.f25300R;
        p[28] = true;
        return j;
    }

    public void fromJson(String str) throws JSONException {
        boolean[] p = m44694p();
        InstabugSDKLogger.m46622d(this, str);
        p[48] = true;
        JSONObject jSONObject = new JSONObject(str);
        p[49] = true;
        String str2 = "id";
        if (!jSONObject.has(str2)) {
            p[50] = true;
        } else {
            p[51] = true;
            mo34262b(jSONObject.getLong(str2));
            p[52] = true;
        }
        String str3 = "title";
        if (!jSONObject.has(str3)) {
            p[53] = true;
        } else {
            p[54] = true;
            mo34268e(jSONObject.getString(str3));
            p[55] = true;
        }
        String str4 = "description";
        if (!jSONObject.has(str4)) {
            p[56] = true;
        } else {
            p[57] = true;
            mo34266d(jSONObject.getString(str4));
            p[58] = true;
        }
        String str5 = "creator_name";
        if (!jSONObject.has(str5)) {
            p[59] = true;
        } else {
            p[60] = true;
            mo34264c(jSONObject.getString(str5));
            p[61] = true;
        }
        String str6 = "status";
        if (!jSONObject.has(str6)) {
            p[62] = true;
        } else {
            p[63] = true;
            int i = jSONObject.getInt(str6);
            if (i == 0) {
                mo34258a(C9568a.Open);
                p[65] = true;
            } else if (i == 1) {
                mo34258a(C9568a.Planned);
                p[66] = true;
            } else if (i == 2) {
                mo34258a(C9568a.InProgress);
                p[67] = true;
            } else if (i == 3) {
                mo34258a(C9568a.Completed);
                p[68] = true;
            } else if (i != 4) {
                p[64] = true;
            } else {
                mo34258a(C9568a.MaybeLater);
                p[69] = true;
            }
        }
        String str7 = "color_code";
        if (!jSONObject.has(str7)) {
            p[70] = true;
        } else {
            p[71] = true;
            mo34263b(jSONObject.getString(str7));
            p[72] = true;
        }
        String str8 = "likes_count";
        if (!jSONObject.has(str8)) {
            p[73] = true;
        } else {
            p[74] = true;
            mo34261b(jSONObject.getInt(str8));
            p[75] = true;
        }
        String str9 = "date";
        if (!jSONObject.has(str9)) {
            p[76] = true;
        } else {
            p[77] = true;
            mo34257a(jSONObject.getLong(str9));
            p[78] = true;
        }
        String str10 = "comments_count";
        if (!jSONObject.has(str10)) {
            p[79] = true;
        } else {
            p[80] = true;
            mo34256a(jSONObject.getInt(str10));
            p[81] = true;
        }
        String str11 = "liked";
        if (!jSONObject.has(str11)) {
            p[82] = true;
        } else {
            p[83] = true;
            mo34260a(jSONObject.getBoolean(str11));
            p[84] = true;
        }
        String str12 = "ib_user_vote_status";
        if (!jSONObject.has(str12)) {
            p[85] = true;
        } else {
            p[86] = true;
            int i2 = jSONObject.getInt(str12);
            if (i2 == 0) {
                mo34259a(C9569b.NOTHING);
                p[87] = true;
            } else if (i2 == 1) {
                mo34259a(C9569b.UPLOADED);
                p[88] = true;
            } else if (i2 == 2) {
                mo34259a(C9569b.USER_VOTED_UP);
                p[89] = true;
            } else if (i2 != 3) {
                mo34259a(C9569b.NOTHING);
                p[91] = true;
            } else {
                mo34259a(C9569b.USER_UN_VOTED);
                p[90] = true;
            }
        }
        p[92] = true;
    }

    /* renamed from: g */
    public String mo34270g() {
        boolean[] p = m44694p();
        String str = this.f25296N;
        p[93] = true;
        return str;
    }

    /* renamed from: h */
    public long mo34271h() {
        boolean[] p = m44694p();
        long j = this.f25305a;
        p[12] = true;
        return j;
    }

    /* renamed from: i */
    public JSONObject mo34272i() throws JSONException {
        boolean[] p = m44694p();
        JSONObject jSONObject = new JSONObject();
        p[32] = true;
        JSONObject put = jSONObject.put("title", mo34275l());
        p[33] = true;
        put.put("description", mo34270g());
        p[34] = true;
        return jSONObject;
    }

    /* renamed from: j */
    public int mo34273j() {
        boolean[] p = m44694p();
        int i = this.f25301S;
        p[18] = true;
        return i;
    }

    /* renamed from: k */
    public C9568a mo34274k() {
        boolean[] p = m44694p();
        C9568a aVar = this.f25297O;
        p[16] = true;
        return aVar;
    }

    /* renamed from: l */
    public String mo34275l() {
        boolean[] p = m44694p();
        String str = this.f25306b;
        p[14] = true;
        return str;
    }

    /* renamed from: m */
    public C9569b mo34276m() {
        boolean[] p = m44694p();
        C9569b bVar = this.f25304V;
        p[24] = true;
        return bVar;
    }

    /* renamed from: n */
    public boolean mo34277n() {
        boolean z;
        boolean[] p = m44694p();
        if (mo34274k() == C9568a.Completed) {
            p[95] = true;
            z = true;
        } else {
            z = false;
            p[96] = true;
        }
        p[97] = true;
        return z;
    }

    /* renamed from: o */
    public boolean mo34278o() {
        boolean[] p = m44694p();
        boolean z = this.f25303U;
        p[22] = true;
        return z;
    }

    public String toJson() throws JSONException {
        boolean[] p = m44694p();
        JSONObject jSONObject = new JSONObject();
        p[35] = true;
        JSONObject put = jSONObject.put("id", mo34271h());
        p[36] = true;
        JSONObject put2 = put.put("title", mo34275l());
        p[37] = true;
        JSONObject put3 = put2.put("description", mo34270g());
        p[38] = true;
        JSONObject put4 = put3.put("status", mo34274k().mo34279d());
        p[39] = true;
        JSONObject put5 = put4.put("date", mo34269f());
        p[40] = true;
        JSONObject put6 = put5.put("likes_count", mo34273j());
        p[41] = true;
        JSONObject put7 = put6.put("comments_count", mo34265d());
        p[42] = true;
        JSONObject put8 = put7.put("liked", mo34278o());
        p[43] = true;
        JSONObject put9 = put8.put("ib_user_vote_status", mo34276m().mo34280d());
        p[44] = true;
        JSONObject put10 = put9.put("color_code", mo34255a());
        p[45] = true;
        put10.put("creator_name", mo34267e());
        p[46] = true;
        String jSONObject2 = jSONObject.toString();
        p[47] = true;
        return jSONObject2;
    }

    /* renamed from: d */
    public void mo34266d(String str) {
        boolean[] p = m44694p();
        this.f25296N = str;
        p[94] = true;
    }

    /* renamed from: b */
    public void mo34261b(int i) {
        boolean[] p = m44694p();
        this.f25301S = i;
        p[19] = true;
    }

    /* renamed from: e */
    public String mo34267e() {
        boolean[] p = m44694p();
        String str = this.f25299Q;
        p[30] = true;
        return str;
    }

    /* renamed from: b */
    public void mo34263b(String str) {
        boolean[] p = m44694p();
        this.f25298P = str;
        p[27] = true;
    }

    /* renamed from: a */
    public static C9567a m44692a(JSONObject jSONObject) throws JSONException {
        boolean[] p = m44694p();
        C9567a aVar = new C9567a();
        p[8] = true;
        aVar.fromJson(jSONObject.toString());
        p[9] = true;
        return aVar;
    }

    /* renamed from: a */
    public void mo34258a(C9568a aVar) {
        boolean[] p = m44694p();
        this.f25297O = aVar;
        p[17] = true;
    }

    /* renamed from: a */
    public void mo34256a(int i) {
        boolean[] p = m44694p();
        this.f25302T = i;
        p[21] = true;
    }

    /* renamed from: a */
    public void mo34260a(boolean z) {
        boolean[] p = m44694p();
        this.f25303U = z;
        p[23] = true;
    }

    /* renamed from: a */
    public void mo34259a(C9569b bVar) {
        boolean[] p = m44694p();
        this.f25304V = bVar;
        p[25] = true;
    }

    /* renamed from: a */
    public String mo34255a() {
        boolean[] p = m44694p();
        String str = this.f25298P;
        p[26] = true;
        return str;
    }

    /* renamed from: a */
    public void mo34257a(long j) {
        boolean[] p = m44694p();
        this.f25300R = j;
        p[29] = true;
    }
}
