package com.instabug.featuresrequest.models;

import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.models.c */
/* compiled from: NewComment */
public class C9571c extends C9570b {

    /* renamed from: Z */
    private static transient /* synthetic */ boolean[] f25316Z;

    /* renamed from: X */
    private String f25317X;

    /* renamed from: Y */
    private long f25318Y;

    public C9571c(long j, String str, String str2, String str3) {
        boolean[] o = m44740o();
        o[0] = true;
        mo34297c(j);
        o[1] = true;
        mo34309a(System.currentTimeMillis() / 1000);
        o[2] = true;
        mo34286d(str2);
        o[3] = true;
        mo34298g(str3);
        o[4] = true;
        mo34285c(str);
        o[5] = true;
    }

    /* renamed from: o */
    private static /* synthetic */ boolean[] m44740o() {
        boolean[] zArr = f25316Z;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1507772086259578808L, "com/instabug/featuresrequest/models/NewComment", 23);
        f25316Z = a;
        return a;
    }

    /* renamed from: c */
    public void mo34297c(long j) {
        boolean[] o = m44740o();
        this.f25318Y = j;
        o[7] = true;
    }

    public void fromJson(String str) throws JSONException {
        boolean[] o = m44740o();
        super.fromJson(str);
        o[14] = true;
        JSONObject jSONObject = new JSONObject(str);
        o[15] = true;
        String str2 = "email";
        if (!jSONObject.has(str2)) {
            o[16] = true;
        } else {
            o[17] = true;
            mo34298g(jSONObject.getString(str2));
            o[18] = true;
        }
        String str3 = "feature_id";
        if (!jSONObject.has(str3)) {
            o[19] = true;
        } else {
            o[20] = true;
            mo34297c(jSONObject.getLong(str3));
            o[21] = true;
        }
        o[22] = true;
    }

    /* renamed from: g */
    public void mo34298g(String str) {
        boolean[] o = m44740o();
        this.f25317X = str;
        o[9] = true;
    }

    /* renamed from: m */
    public long mo34299m() {
        boolean[] o = m44740o();
        long j = this.f25318Y;
        o[6] = true;
        return j;
    }

    /* renamed from: n */
    public String mo34300n() {
        boolean[] o = m44740o();
        String str = this.f25317X;
        o[8] = true;
        return str;
    }

    public String toJson() throws JSONException {
        boolean[] o = m44740o();
        JSONObject jSONObject = new JSONObject(super.toJson());
        o[10] = true;
        jSONObject.put("feature_id", mo34299m());
        o[11] = true;
        jSONObject.put("email", mo34300n());
        o[12] = true;
        String jSONObject2 = jSONObject.toString();
        o[13] = true;
        return jSONObject2;
    }
}
