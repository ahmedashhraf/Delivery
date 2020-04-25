package com.instabug.featuresrequest.models;

import com.instabug.library.internal.storage.cache.Cacheable;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.models.f */
/* compiled from: TimelineResponse */
public class C9575f implements Cacheable, Serializable {

    /* renamed from: N */
    private static transient /* synthetic */ boolean[] f25327N;

    /* renamed from: a */
    private long f25328a;

    /* renamed from: b */
    private ArrayList<C9573e> f25329b;

    public C9575f() {
        m44763e()[0] = true;
    }

    /* renamed from: a */
    public static C9575f m44762a(JSONObject jSONObject) throws JSONException {
        boolean[] e = m44763e();
        C9575f fVar = new C9575f();
        e[1] = true;
        fVar.fromJson(jSONObject.toString());
        e[2] = true;
        return fVar;
    }

    /* renamed from: e */
    private static /* synthetic */ boolean[] m44763e() {
        boolean[] zArr = f25327N;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-6644521972419714488L, "com/instabug/featuresrequest/models/TimelineResponse", 19);
        f25327N = a;
        return a;
    }

    /* renamed from: d */
    public long mo34316d() {
        boolean[] e = m44763e();
        long j = this.f25328a;
        e[5] = true;
        return j;
    }

    public void fromJson(String str) throws JSONException {
        boolean[] e = m44763e();
        JSONObject jSONObject = new JSONObject(str);
        e[11] = true;
        String str2 = "featureId";
        if (!jSONObject.has(str2)) {
            e[12] = true;
        } else {
            e[13] = true;
            mo34314a(jSONObject.getLong(str2));
            e[14] = true;
        }
        String str3 = "timeline";
        if (!jSONObject.has(str3)) {
            e[15] = true;
        } else {
            e[16] = true;
            mo34315a(C9573e.m44754a(jSONObject.getJSONArray(str3)));
            e[17] = true;
        }
        e[18] = true;
    }

    public String toJson() throws JSONException {
        boolean[] e = m44763e();
        JSONObject jSONObject = new JSONObject();
        e[7] = true;
        JSONObject put = jSONObject.put("featureId", mo34316d());
        e[8] = true;
        JSONObject put2 = put.put("timeline", C9573e.m44755a(mo34313a()));
        e[9] = true;
        String jSONObject2 = put2.toString();
        e[10] = true;
        return jSONObject2;
    }

    /* renamed from: a */
    public ArrayList<C9573e> mo34313a() {
        boolean[] e = m44763e();
        ArrayList<C9573e> arrayList = this.f25329b;
        e[3] = true;
        return arrayList;
    }

    /* renamed from: a */
    public void mo34315a(ArrayList<C9573e> arrayList) {
        boolean[] e = m44763e();
        this.f25329b = arrayList;
        e[4] = true;
    }

    /* renamed from: a */
    public void mo34314a(long j) {
        boolean[] e = m44763e();
        this.f25328a = j;
        e[6] = true;
    }
}
