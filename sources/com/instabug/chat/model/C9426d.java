package com.instabug.chat.model;

import com.instabug.library.internal.storage.cache.Cacheable;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.chat.model.d */
/* compiled from: ReadMessage */
public class C9426d implements Cacheable {

    /* renamed from: O */
    private static transient /* synthetic */ boolean[] f24962O;

    /* renamed from: N */
    private String f24963N;

    /* renamed from: a */
    private String f24964a;

    /* renamed from: b */
    private long f24965b;

    public C9426d() {
        m44113d()[0] = true;
    }

    /* renamed from: d */
    private static /* synthetic */ boolean[] m44113d() {
        boolean[] zArr = f24962O;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(8026571163759837584L, "com/instabug/chat/model/ReadMessage", 41);
        f24962O = a;
        return a;
    }

    /* renamed from: a */
    public String mo33972a() {
        boolean[] d = m44113d();
        String str = this.f24964a;
        d[1] = true;
        return str;
    }

    /* renamed from: b */
    public long mo33975b() {
        boolean[] d = m44113d();
        long j = this.f24965b;
        d[3] = true;
        return j;
    }

    /* renamed from: c */
    public String mo33977c() {
        boolean[] d = m44113d();
        String str = this.f24963N;
        d[5] = true;
        return str;
    }

    public boolean equals(Object obj) {
        boolean[] d = m44113d();
        boolean z = false;
        if (obj == null) {
            d[23] = true;
        } else if (!(obj instanceof C9426d)) {
            d[24] = true;
        } else {
            C9426d dVar = (C9426d) obj;
            d[25] = true;
            String valueOf = String.valueOf(dVar.mo33972a());
            d[26] = true;
            String valueOf2 = String.valueOf(mo33972a());
            d[27] = true;
            if (!valueOf.equals(valueOf2)) {
                d[28] = true;
            } else {
                d[29] = true;
                String c = dVar.mo33977c();
                d[30] = true;
                String valueOf3 = String.valueOf(c);
                d[31] = true;
                String c2 = mo33977c();
                d[32] = true;
                if (!valueOf3.equals(String.valueOf(c2))) {
                    d[33] = true;
                } else {
                    d[34] = true;
                    if (dVar.mo33975b() != mo33975b()) {
                        d[35] = true;
                    } else {
                        d[36] = true;
                        z = true;
                        d[38] = true;
                        return z;
                    }
                }
            }
            d[37] = true;
            d[38] = true;
            return z;
        }
        d[39] = true;
        return false;
    }

    public void fromJson(String str) throws JSONException {
        boolean[] d = m44113d();
        JSONObject jSONObject = new JSONObject(str);
        d[12] = true;
        String str2 = "chat_number";
        if (!jSONObject.has(str2)) {
            d[13] = true;
        } else {
            d[14] = true;
            mo33974a(jSONObject.getString(str2));
            d[15] = true;
        }
        String str3 = "message_id";
        if (!jSONObject.has(str3)) {
            d[16] = true;
        } else {
            d[17] = true;
            mo33976b(jSONObject.getString(str3));
            d[18] = true;
        }
        String str4 = "read_at";
        if (!jSONObject.has(str4)) {
            d[19] = true;
        } else {
            d[20] = true;
            mo33973a(jSONObject.getLong(str4));
            d[21] = true;
        }
        d[22] = true;
    }

    public int hashCode() {
        boolean[] d = m44113d();
        int hashCode = this.f24964a.hashCode();
        d[40] = true;
        return hashCode;
    }

    public String toJson() throws JSONException {
        boolean[] d = m44113d();
        JSONObject jSONObject = new JSONObject();
        d[7] = true;
        JSONObject put = jSONObject.put("chat_number", mo33972a());
        d[8] = true;
        JSONObject put2 = put.put("message_id", mo33977c());
        d[9] = true;
        put2.put("read_at", mo33975b());
        d[10] = true;
        String jSONObject2 = jSONObject.toString();
        d[11] = true;
        return jSONObject2;
    }

    /* renamed from: a */
    public void mo33974a(String str) {
        boolean[] d = m44113d();
        this.f24964a = str;
        d[2] = true;
    }

    /* renamed from: b */
    public void mo33976b(String str) {
        boolean[] d = m44113d();
        this.f24963N = str;
        d[6] = true;
    }

    /* renamed from: a */
    public void mo33973a(long j) {
        boolean[] d = m44113d();
        this.f24965b = j;
        d[4] = true;
    }
}
