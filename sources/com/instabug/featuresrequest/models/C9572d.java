package com.instabug.featuresrequest.models;

import com.instabug.featuresrequest.models.C9567a.C9568a;
import com.instabug.featuresrequest.models.C9573e.C9574a;
import com.instabug.library.util.InstabugSDKLogger;
import org.apache.http.cookie.C15222a;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.models.d */
/* compiled from: StatusChange */
public class C9572d extends C9573e {

    /* renamed from: S */
    private static transient /* synthetic */ boolean[] f25319S;

    /* renamed from: O */
    private C9568a f25320O;

    /* renamed from: P */
    private C9568a f25321P;

    /* renamed from: Q */
    private String f25322Q;

    /* renamed from: R */
    private String f25323R;

    public C9572d() {
        m44745i()[0] = true;
    }

    /* renamed from: i */
    private static /* synthetic */ boolean[] m44745i() {
        boolean[] zArr = f25319S;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(3526192300085955617L, "com/instabug/featuresrequest/models/StatusChange", 55);
        f25319S = a;
        return a;
    }

    /* renamed from: a */
    public void mo34301a(C9568a aVar) {
        boolean[] i = m44745i();
        this.f25320O = aVar;
        i[2] = true;
    }

    /* renamed from: b */
    public void mo34302b(C9568a aVar) {
        boolean[] i = m44745i();
        this.f25321P = aVar;
        i[4] = true;
    }

    /* renamed from: c */
    public void mo34304c(String str) {
        boolean[] i = m44745i();
        this.f25323R = str;
        i[7] = true;
    }

    /* renamed from: e */
    public C9568a mo34287e() {
        boolean[] i = m44745i();
        C9568a aVar = this.f25320O;
        i[1] = true;
        return aVar;
    }

    /* renamed from: f */
    public C9568a mo34305f() {
        boolean[] i = m44745i();
        C9568a aVar = this.f25321P;
        i[3] = true;
        return aVar;
    }

    public void fromJson(String str) throws JSONException {
        boolean[] i = m44745i();
        InstabugSDKLogger.m46622d(this, str);
        i[17] = true;
        JSONObject jSONObject = new JSONObject(str);
        i[18] = true;
        String str2 = "created_at";
        if (!jSONObject.has(str2)) {
            i[19] = true;
        } else {
            i[20] = true;
            mo34309a(jSONObject.getLong(str2));
            i[21] = true;
        }
        String str3 = "type";
        if (!jSONObject.has(str3)) {
            i[22] = true;
        } else {
            i[23] = true;
            String string = jSONObject.getString(str3);
            i[24] = true;
            char c = 65535;
            int hashCode = string.hashCode();
            if (hashCode != -144558306) {
                if (hashCode != 950398559) {
                    i[25] = true;
                } else if (!string.equals(C15222a.f44135A)) {
                    i[26] = true;
                } else {
                    i[27] = true;
                    c = 1;
                }
            } else if (!string.equals("state_change")) {
                i[28] = true;
            } else {
                i[29] = true;
                c = 2;
            }
            if (c != 2) {
                mo34310a(C9574a.COMMENT);
                i[30] = true;
            } else {
                mo34310a(C9574a.STATUS_CHANE);
                i[31] = true;
            }
        }
        String str4 = "old_status";
        if (!jSONObject.has(str4)) {
            i[32] = true;
        } else {
            i[33] = true;
            int i2 = jSONObject.getInt(str4);
            if (i2 == 0) {
                mo34301a(C9568a.Open);
                i[35] = true;
            } else if (i2 == 1) {
                mo34301a(C9568a.Planned);
                i[36] = true;
            } else if (i2 == 2) {
                mo34301a(C9568a.InProgress);
                i[37] = true;
            } else if (i2 == 3) {
                mo34301a(C9568a.Completed);
                i[38] = true;
            } else if (i2 != 4) {
                i[34] = true;
            } else {
                mo34301a(C9568a.MaybeLater);
                i[39] = true;
            }
        }
        String str5 = "new_status";
        if (!jSONObject.has(str5)) {
            i[40] = true;
        } else {
            i[41] = true;
            int i3 = jSONObject.getInt(str5);
            if (i3 == 0) {
                mo34302b(C9568a.Open);
                i[43] = true;
            } else if (i3 == 1) {
                mo34302b(C9568a.Planned);
                i[44] = true;
            } else if (i3 == 2) {
                mo34302b(C9568a.InProgress);
                i[45] = true;
            } else if (i3 == 3) {
                mo34302b(C9568a.Completed);
                i[46] = true;
            } else if (i3 != 4) {
                i[42] = true;
            } else {
                mo34302b(C9568a.MaybeLater);
                i[47] = true;
            }
        }
        String str6 = "new_status_color";
        if (!jSONObject.has(str6)) {
            i[48] = true;
        } else {
            i[49] = true;
            mo34303b(jSONObject.getString(str6));
            i[50] = true;
        }
        String str7 = "old_status_color";
        if (!jSONObject.has(str7)) {
            i[51] = true;
        } else {
            i[52] = true;
            mo34304c(jSONObject.getString(str7));
            i[53] = true;
        }
        i[54] = true;
    }

    /* renamed from: g */
    public String mo34306g() {
        boolean[] i = m44745i();
        String str = this.f25323R;
        i[6] = true;
        return str;
    }

    /* renamed from: h */
    public String mo34307h() {
        boolean[] i = m44745i();
        String str = this.f25322Q;
        i[8] = true;
        return str;
    }

    public String toJson() throws JSONException {
        boolean[] i = m44745i();
        JSONObject jSONObject = new JSONObject();
        i[9] = true;
        JSONObject put = jSONObject.put("created_at", mo34308a());
        i[10] = true;
        JSONObject put2 = put.put("type", mo34311d());
        i[11] = true;
        JSONObject put3 = put2.put("old_status", mo34287e().mo34279d());
        i[12] = true;
        JSONObject put4 = put3.put("new_status", mo34305f().mo34279d());
        i[13] = true;
        JSONObject put5 = put4.put("old_status_color", mo34306g());
        i[14] = true;
        JSONObject put6 = put5.put("new_status_color", mo34307h());
        i[15] = true;
        String jSONObject2 = put6.toString();
        i[16] = true;
        return jSONObject2;
    }

    /* renamed from: b */
    public void mo34303b(String str) {
        boolean[] i = m44745i();
        this.f25322Q = str;
        i[5] = true;
    }
}
