package com.instabug.library.model;

import androidx.annotation.C0193h0;
import com.instabug.library.internal.storage.cache.Cacheable;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.model.b */
/* compiled from: UserAttributes */
public class C9948b implements Cacheable, Serializable {

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f26444b;

    /* renamed from: a */
    private HashMap<String, String> f26445a;

    public C9948b() {
        m46261d()[0] = true;
    }

    /* renamed from: d */
    private static /* synthetic */ boolean[] m46261d() {
        boolean[] zArr = f26444b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-928001846597539828L, "com/instabug/library/model/UserAttributes", 25);
        f26444b = a;
        return a;
    }

    /* renamed from: a */
    public void mo35472a(@C0193h0 HashMap<String, String> hashMap) {
        boolean[] d = m46261d();
        this.f26445a = hashMap;
        d[2] = true;
    }

    /* renamed from: b */
    public String mo35473b(@C0193h0 String str) {
        String str2 = (String) this.f26445a.get(str);
        m46261d()[1] = true;
        return str2;
    }

    /* renamed from: c */
    public void mo35474c(@C0193h0 String str) {
        boolean[] d = m46261d();
        this.f26445a.remove(str);
        d[8] = true;
    }

    public void fromJson(String str) throws JSONException {
        boolean[] d = m46261d();
        JSONObject jSONObject = new JSONObject(str);
        d[14] = true;
        Iterator keys = jSONObject.keys();
        d[15] = true;
        this.f26445a = new HashMap<>();
        d[16] = true;
        while (keys.hasNext()) {
            d[17] = true;
            String str2 = (String) keys.next();
            d[18] = true;
            String optString = jSONObject.optString(str2);
            d[19] = true;
            this.f26445a.put(str2, optString);
            d[20] = true;
        }
        d[21] = true;
    }

    public String toJson() throws JSONException {
        boolean[] d = m46261d();
        JSONObject jSONObject = new JSONObject();
        d[9] = true;
        d[10] = true;
        for (Entry entry : this.f26445a.entrySet()) {
            d[11] = true;
            jSONObject.put((String) entry.getKey(), entry.getValue());
            d[12] = true;
        }
        String jSONObject2 = jSONObject.toString();
        d[13] = true;
        return jSONObject2;
    }

    public String toString() {
        boolean[] d = m46261d();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("userAttributesMap = ");
            sb.append(toJson());
            String sb2 = sb.toString();
            d[22] = true;
            return sb2;
        } catch (JSONException e) {
            d[23] = true;
            e.printStackTrace();
            d[24] = true;
            return "{}";
        }
    }

    /* renamed from: a */
    public HashMap<String, String> mo35471a() {
        boolean[] d = m46261d();
        HashMap<String, String> hashMap = this.f26445a;
        d[3] = true;
        return hashMap;
    }

    /* renamed from: a */
    public C9948b mo35470a(@C0193h0 String str, String str2) {
        boolean[] d = m46261d();
        if (this.f26445a != null) {
            d[4] = true;
        } else {
            d[5] = true;
            this.f26445a = new HashMap<>();
            d[6] = true;
        }
        this.f26445a.put(str, str2);
        d[7] = true;
        return this;
    }
}
