package com.instabug.library.model;

import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.SessionEntry;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class Session implements Cacheable {

    /* renamed from: S */
    private static transient /* synthetic */ boolean[] f26432S;

    /* renamed from: N */
    private long f26433N;

    /* renamed from: O */
    private String f26434O;

    /* renamed from: P */
    private String f26435P;

    /* renamed from: Q */
    private String f26436Q;

    /* renamed from: R */
    private String f26437R;

    /* renamed from: a */
    private int f26438a;

    /* renamed from: b */
    private long f26439b;

    public enum SessionState {
        START,
        RESUME,
        FINISH;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[3] = true;
        }
    }

    public Session() {
        m46245h()[0] = true;
    }

    /* renamed from: h */
    private static /* synthetic */ boolean[] m46245h() {
        boolean[] zArr = f26432S;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-8891172986040633397L, "com/instabug/library/model/Session", 56);
        f26432S = a;
        return a;
    }

    /* renamed from: a */
    public int mo35366a() {
        boolean[] h = m46245h();
        int i = this.f26438a;
        h[7] = true;
        return i;
    }

    /* renamed from: b */
    public long mo35367b() {
        boolean[] h = m46245h();
        long j = this.f26439b;
        h[8] = true;
        return j;
    }

    /* renamed from: c */
    public long mo35368c() {
        boolean[] h = m46245h();
        long j = this.f26433N;
        h[9] = true;
        return j;
    }

    /* renamed from: d */
    public String mo35369d() {
        boolean[] h = m46245h();
        String str = this.f26434O;
        h[10] = true;
        return str;
    }

    /* renamed from: e */
    public String mo35370e() {
        boolean[] h = m46245h();
        String str = this.f26435P;
        h[11] = true;
        return str;
    }

    public boolean equals(Object obj) {
        boolean[] h = m46245h();
        boolean z = false;
        if (obj == null) {
            h[39] = true;
        } else if (!(obj instanceof Session)) {
            h[40] = true;
        } else {
            Session session = (Session) obj;
            h[41] = true;
            if (session.mo35366a() != mo35366a()) {
                h[42] = true;
            } else {
                h[43] = true;
                if (session.mo35367b() != mo35367b()) {
                    h[44] = true;
                } else {
                    h[45] = true;
                    if (session.mo35368c() != mo35368c()) {
                        h[46] = true;
                    } else {
                        h[47] = true;
                        if (!String.valueOf(session.mo35369d()).equals(String.valueOf(mo35369d()))) {
                            h[48] = true;
                        } else {
                            h[49] = true;
                            if (!String.valueOf(session.mo35370e()).equals(String.valueOf(mo35370e()))) {
                                h[50] = true;
                            } else {
                                h[51] = true;
                                z = true;
                                h[53] = true;
                                return z;
                            }
                        }
                    }
                }
            }
            h[52] = true;
            h[53] = true;
            return z;
        }
        h[54] = true;
        return false;
    }

    /* renamed from: f */
    public String mo35372f() {
        boolean[] h = m46245h();
        String str = this.f26437R;
        h[12] = true;
        return str;
    }

    public void fromJson(String str) throws JSONException {
        boolean[] h = m46245h();
        JSONObject jSONObject = new JSONObject(str);
        h[21] = true;
        String str2 = "id";
        if (!jSONObject.has(str2)) {
            h[22] = true;
        } else {
            h[23] = true;
            this.f26438a = jSONObject.getInt(str2);
            h[24] = true;
        }
        String str3 = SessionEntry.COLUMN_STARTED_AT;
        if (!jSONObject.has(str3)) {
            h[25] = true;
        } else {
            h[26] = true;
            this.f26439b = jSONObject.getLong(str3);
            h[27] = true;
        }
        String str4 = "duration";
        if (!jSONObject.has(str4)) {
            h[28] = true;
        } else {
            h[29] = true;
            this.f26433N = jSONObject.getLong(str4);
            h[30] = true;
        }
        String str5 = "user_events";
        if (!jSONObject.has(str5)) {
            h[31] = true;
        } else {
            h[32] = true;
            this.f26434O = jSONObject.getString(str5);
            h[33] = true;
        }
        String str6 = "user_attributes";
        if (!jSONObject.has(str6)) {
            h[34] = true;
        } else {
            h[35] = true;
            this.f26435P = jSONObject.getString(str6);
            h[36] = true;
        }
        h[37] = true;
    }

    /* renamed from: g */
    public String mo35373g() {
        boolean[] h = m46245h();
        String str = this.f26436Q;
        h[13] = true;
        return str;
    }

    public int hashCode() {
        boolean[] h = m46245h();
        int a = mo35366a();
        h[55] = true;
        return a;
    }

    public String toJson() throws JSONException {
        boolean[] h = m46245h();
        JSONObject jSONObject = new JSONObject();
        h[14] = true;
        JSONObject put = jSONObject.put("id", mo35366a());
        h[15] = true;
        JSONObject put2 = put.put(SessionEntry.COLUMN_STARTED_AT, mo35367b());
        h[16] = true;
        JSONObject put3 = put2.put("duration", mo35368c());
        h[17] = true;
        JSONObject put4 = put3.put("user_events", mo35369d());
        h[18] = true;
        put4.put("user_attributes", mo35370e());
        h[19] = true;
        String jSONObject2 = jSONObject.toString();
        h[20] = true;
        return jSONObject2;
    }

    public String toString() {
        boolean[] h = m46245h();
        StringBuilder sb = new StringBuilder();
        sb.append("id: ");
        sb.append(mo35366a());
        sb.append(", startedAt: ");
        sb.append(this.f26439b);
        sb.append(", duration: ");
        sb.append(this.f26433N);
        String sb2 = sb.toString();
        h[38] = true;
        return sb2;
    }

    public Session(int i, long j, long j2, String str, String str2) {
        boolean[] h = m46245h();
        this.f26438a = i;
        this.f26439b = j;
        this.f26433N = j2;
        this.f26434O = str;
        this.f26435P = str2;
        h[1] = true;
    }

    public Session(int i, long j, long j2, String str, String str2, String str3, String str4) {
        boolean[] h = m46245h();
        this.f26438a = i;
        this.f26439b = j;
        this.f26433N = j2;
        this.f26434O = str;
        this.f26435P = str2;
        String str5 = "";
        if (str3 == null) {
            h[2] = true;
            str3 = str5;
        } else {
            h[3] = true;
        }
        this.f26436Q = str3;
        if (str4 == null) {
            h[4] = true;
        } else {
            h[5] = true;
            str5 = str4;
        }
        this.f26437R = str5;
        h[6] = true;
    }
}
