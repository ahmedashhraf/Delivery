package com.instabug.chat.model;

import com.instabug.library.internal.storage.cache.Cacheable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.chat.model.b */
/* compiled from: MessageAction */
public class C9423b implements Cacheable {

    /* renamed from: O */
    private static transient /* synthetic */ boolean[] f24954O;

    /* renamed from: N */
    private String f24955N;

    /* renamed from: a */
    private C9424a f24956a;

    /* renamed from: b */
    private String f24957b;

    /* renamed from: com.instabug.chat.model.b$a */
    /* compiled from: MessageAction */
    public enum C9424a {
        BUTTON("button"),
        NOT_AVAILABLE("not-available");
        
        private final String name;

        static {
            boolean[] d;
            d[4] = true;
        }

        private C9424a(String str) {
            boolean[] d = m44105d();
            this.name = str;
            d[2] = true;
        }

        public String toString() {
            boolean[] d = m44105d();
            String str = this.name;
            d[3] = true;
            return str;
        }
    }

    public C9423b() {
        m44098d()[0] = true;
    }

    /* renamed from: a */
    public static ArrayList<C9423b> m44096a(JSONArray jSONArray) throws JSONException {
        boolean[] d = m44098d();
        ArrayList<C9423b> arrayList = new ArrayList<>();
        d[1] = true;
        d[2] = true;
        int i = 0;
        while (i < jSONArray.length()) {
            d[3] = true;
            C9423b bVar = new C9423b();
            d[4] = true;
            bVar.fromJson(jSONArray.getString(i));
            d[5] = true;
            arrayList.add(bVar);
            i++;
            d[6] = true;
        }
        d[7] = true;
        return arrayList;
    }

    /* renamed from: d */
    private static /* synthetic */ boolean[] m44098d() {
        boolean[] zArr = f24954O;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(4465028393026133666L, "com/instabug/chat/model/MessageAction", 65);
        f24954O = a;
        return a;
    }

    /* renamed from: b */
    public String mo33959b() {
        boolean[] d = m44098d();
        String str = this.f24957b;
        d[15] = true;
        return str;
    }

    /* renamed from: c */
    public String mo33961c() {
        boolean[] d = m44098d();
        String str = this.f24955N;
        d[17] = true;
        return str;
    }

    public boolean equals(Object obj) {
        boolean[] d = m44098d();
        boolean z = false;
        if (obj == null) {
            d[40] = true;
        } else if (!(obj instanceof C9423b)) {
            d[41] = true;
        } else {
            C9423b bVar = (C9423b) obj;
            d[42] = true;
            String valueOf = String.valueOf(bVar.mo33959b());
            d[43] = true;
            String valueOf2 = String.valueOf(mo33959b());
            d[44] = true;
            if (!valueOf.equals(valueOf2)) {
                d[45] = true;
            } else {
                d[46] = true;
                String valueOf3 = String.valueOf(bVar.mo33961c());
                d[47] = true;
                String valueOf4 = String.valueOf(mo33961c());
                d[48] = true;
                if (!valueOf3.equals(valueOf4)) {
                    d[49] = true;
                } else {
                    d[50] = true;
                    if (bVar.mo33956a() != mo33956a()) {
                        d[51] = true;
                    } else {
                        d[52] = true;
                        z = true;
                        d[54] = true;
                        return z;
                    }
                }
            }
            d[53] = true;
            d[54] = true;
            return z;
        }
        d[55] = true;
        return false;
    }

    public void fromJson(String str) throws JSONException {
        boolean[] d = m44098d();
        JSONObject jSONObject = new JSONObject(str);
        d[19] = true;
        String str2 = "url";
        if (!jSONObject.has(str2)) {
            d[20] = true;
        } else {
            d[21] = true;
            mo33960b(jSONObject.getString(str2));
            d[22] = true;
        }
        String str3 = "title";
        if (!jSONObject.has(str3)) {
            d[23] = true;
        } else {
            d[24] = true;
            mo33958a(jSONObject.getString(str3));
            d[25] = true;
        }
        String str4 = "type";
        if (!jSONObject.has(str4)) {
            d[26] = true;
        } else {
            d[27] = true;
            String string = jSONObject.getString(str4);
            char c = 65535;
            if (string.hashCode() != -1377687758) {
                d[28] = true;
            } else if (!string.equals("button")) {
                d[29] = true;
            } else {
                c = 0;
                d[30] = true;
            }
            if (c != 0) {
                mo33957a(C9424a.NOT_AVAILABLE);
                d[32] = true;
            } else {
                mo33957a(C9424a.BUTTON);
                d[31] = true;
            }
        }
        d[33] = true;
    }

    public int hashCode() {
        boolean[] d = m44098d();
        if (mo33959b() == null) {
            d[56] = true;
        } else if (mo33961c() == null) {
            d[57] = true;
        } else if (mo33956a() == null) {
            d[58] = true;
        } else {
            d[59] = true;
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(mo33959b().hashCode()));
            d[60] = true;
            sb.append(String.valueOf(mo33961c().hashCode()));
            d[61] = true;
            sb.append(String.valueOf(mo33956a().toString().hashCode()));
            String sb2 = sb.toString();
            d[62] = true;
            int hashCode = sb2.hashCode();
            d[63] = true;
            return hashCode;
        }
        d[64] = true;
        return -1;
    }

    public String toJson() throws JSONException {
        boolean[] d = m44098d();
        JSONObject jSONObject = new JSONObject();
        d[34] = true;
        jSONObject.put("type", this.f24956a.toString());
        d[35] = true;
        jSONObject.put("title", this.f24957b);
        d[36] = true;
        jSONObject.put("url", this.f24955N);
        d[37] = true;
        String jSONObject2 = jSONObject.toString();
        d[38] = true;
        return jSONObject2;
    }

    public String toString() {
        boolean[] d = m44098d();
        StringBuilder sb = new StringBuilder();
        sb.append("Type: ");
        sb.append(mo33956a());
        sb.append(", title: ");
        sb.append(mo33959b());
        sb.append(", url: ");
        sb.append(mo33961c());
        String sb2 = sb.toString();
        d[39] = true;
        return sb2;
    }

    /* renamed from: b */
    public void mo33960b(String str) {
        boolean[] d = m44098d();
        this.f24955N = str;
        d[18] = true;
    }

    /* renamed from: a */
    public static JSONArray m44097a(ArrayList<C9423b> arrayList) throws JSONException {
        boolean[] d = m44098d();
        JSONArray jSONArray = new JSONArray();
        d[8] = true;
        d[9] = true;
        int i = 0;
        while (i < arrayList.size()) {
            d[10] = true;
            jSONArray.put(((C9423b) arrayList.get(i)).toJson());
            i++;
            d[11] = true;
        }
        d[12] = true;
        return jSONArray;
    }

    /* renamed from: a */
    public C9424a mo33956a() {
        boolean[] d = m44098d();
        C9424a aVar = this.f24956a;
        d[13] = true;
        return aVar;
    }

    /* renamed from: a */
    public void mo33957a(C9424a aVar) {
        boolean[] d = m44098d();
        this.f24956a = aVar;
        d[14] = true;
    }

    /* renamed from: a */
    public void mo33958a(String str) {
        boolean[] d = m44098d();
        this.f24957b = str;
        d[16] = true;
    }
}
