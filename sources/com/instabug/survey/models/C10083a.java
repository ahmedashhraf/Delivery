package com.instabug.survey.models;

import com.instabug.library.internal.storage.cache.Cacheable;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.models.a */
/* compiled from: Condition */
public class C10083a implements Cacheable, Serializable {

    /* renamed from: O */
    private static transient /* synthetic */ boolean[] f26818O;

    /* renamed from: N */
    private String f26819N;

    /* renamed from: a */
    private String f26820a;

    /* renamed from: b */
    private String f26821b;

    public C10083a() {
        m46898f()[0] = true;
    }

    /* renamed from: a */
    public static JSONArray m46897a(ArrayList<C10083a> arrayList) throws JSONException {
        boolean[] f = m46898f();
        JSONArray jSONArray = new JSONArray();
        f[1] = true;
        f[2] = true;
        int i = 0;
        while (i < arrayList.size()) {
            f[3] = true;
            jSONArray.put(new JSONObject(((C10083a) arrayList.get(i)).toJson()));
            i++;
            f[4] = true;
        }
        f[5] = true;
        return jSONArray;
    }

    /* renamed from: f */
    private static /* synthetic */ boolean[] m46898f() {
        boolean[] zArr = f26818O;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(3318509865249926827L, "com/instabug/survey/models/Condition", 33);
        f26818O = a;
        return a;
    }

    /* renamed from: b */
    public C10083a mo36204b(String str) {
        boolean[] f = m46898f();
        this.f26820a = str;
        f[14] = true;
        return this;
    }

    /* renamed from: c */
    public C10083a mo36205c(String str) {
        boolean[] f = m46898f();
        this.f26821b = str;
        f[16] = true;
        return this;
    }

    /* renamed from: d */
    public String mo36207d() {
        boolean[] f = m46898f();
        String str = this.f26821b;
        f[15] = true;
        return str;
    }

    /* renamed from: e */
    public String mo36208e() {
        boolean[] f = m46898f();
        String str = this.f26819N;
        f[17] = true;
        return str;
    }

    public void fromJson(String str) throws JSONException {
        boolean[] f = m46898f();
        JSONObject jSONObject = new JSONObject(str);
        f[22] = true;
        String str2 = "key";
        if (!jSONObject.has(str2)) {
            f[23] = true;
        } else {
            f[24] = true;
            mo36204b(jSONObject.getString(str2));
            f[25] = true;
        }
        String str3 = "value";
        if (!jSONObject.has(str3)) {
            f[26] = true;
        } else {
            f[27] = true;
            mo36205c(jSONObject.getString(str3));
            f[28] = true;
        }
        String str4 = "operator";
        if (!jSONObject.has(str4)) {
            f[29] = true;
        } else {
            f[30] = true;
            mo36206d(jSONObject.getString(str4));
            f[31] = true;
        }
        f[32] = true;
    }

    public String toJson() throws JSONException {
        boolean[] f = m46898f();
        JSONObject jSONObject = new JSONObject();
        f[19] = true;
        String str = "value";
        String str2 = "operator";
        jSONObject.put("key", mo36203a()).put(str, this.f26821b).put(str2, this.f26819N);
        f[20] = true;
        String jSONObject2 = jSONObject.toString();
        f[21] = true;
        return jSONObject2;
    }

    /* renamed from: d */
    public C10083a mo36206d(String str) {
        boolean[] f = m46898f();
        this.f26819N = str;
        f[18] = true;
        return this;
    }

    /* renamed from: a */
    public static ArrayList<C10083a> m46896a(JSONArray jSONArray) throws JSONException {
        boolean[] f = m46898f();
        ArrayList<C10083a> arrayList = new ArrayList<>();
        f[6] = true;
        f[7] = true;
        int i = 0;
        while (i < jSONArray.length()) {
            f[8] = true;
            C10083a aVar = new C10083a();
            f[9] = true;
            aVar.fromJson(jSONArray.getJSONObject(i).toString());
            f[10] = true;
            arrayList.add(aVar);
            i++;
            f[11] = true;
        }
        f[12] = true;
        return arrayList;
    }

    /* renamed from: a */
    public String mo36203a() {
        boolean[] f = m46898f();
        String str = this.f26820a;
        f[13] = true;
        return str;
    }
}
