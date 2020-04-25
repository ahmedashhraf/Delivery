package com.instabug.featuresrequest.models;

import com.instabug.library.internal.storage.cache.Cacheable;
import java.io.Serializable;
import java.util.ArrayList;
import org.apache.http.cookie.C15222a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.models.e */
/* compiled from: TimelineObject */
public abstract class C9573e implements Cacheable, Serializable {

    /* renamed from: N */
    private static transient /* synthetic */ boolean[] f25324N;

    /* renamed from: a */
    private C9574a f25325a;

    /* renamed from: b */
    protected long f25326b;

    /* renamed from: com.instabug.featuresrequest.models.e$a */
    /* compiled from: TimelineObject */
    public enum C9574a {
        COMMENT(C15222a.f44135A),
        STATUS_CHANE("state_change");
        
        private final String type;

        static {
            boolean[] d;
            d[4] = true;
        }

        private C9574a(String str) {
            boolean[] d = m44761d();
            this.type = str;
            d[2] = true;
        }

        public String toString() {
            boolean[] d = m44761d();
            String str = this.type;
            d[3] = true;
            return str;
        }
    }

    public C9573e() {
        mo34287e()[0] = true;
    }

    /* renamed from: e */
    private static /* synthetic */ boolean[] mo34287e() {
        boolean[] zArr = f25324N;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-7854381328924208150L, "com/instabug/featuresrequest/models/TimelineObject", 28);
        f25324N = a;
        return a;
    }

    /* renamed from: a */
    public long mo34308a() {
        boolean[] e = mo34287e();
        long j = this.f25326b;
        e[1] = true;
        return j;
    }

    /* renamed from: d */
    public C9574a mo34311d() {
        boolean[] e = mo34287e();
        C9574a aVar = this.f25325a;
        e[3] = true;
        return aVar;
    }

    public String toJson() throws JSONException {
        mo34287e()[5] = true;
        return null;
    }

    /* renamed from: a */
    public void mo34309a(long j) {
        boolean[] e = mo34287e();
        this.f25326b = j;
        e[2] = true;
    }

    /* renamed from: a */
    public void mo34310a(C9574a aVar) {
        boolean[] e = mo34287e();
        this.f25325a = aVar;
        e[4] = true;
    }

    /* renamed from: a */
    public static JSONArray m44755a(ArrayList<C9573e> arrayList) throws JSONException {
        boolean[] e = mo34287e();
        JSONArray jSONArray = new JSONArray();
        e[6] = true;
        e[7] = true;
        int i = 0;
        while (i < arrayList.size()) {
            e[8] = true;
            if (arrayList.get(i) instanceof C9570b) {
                e[9] = true;
                jSONArray.put(new JSONObject(((C9570b) arrayList.get(i)).toJson()));
                e[10] = true;
            } else {
                jSONArray.put(new JSONObject(((C9572d) arrayList.get(i)).toJson()));
                e[11] = true;
            }
            i++;
            e[12] = true;
        }
        e[13] = true;
        return jSONArray;
    }

    /* renamed from: a */
    public static ArrayList<C9573e> m44754a(JSONArray jSONArray) throws JSONException {
        boolean[] e = mo34287e();
        ArrayList<C9573e> arrayList = new ArrayList<>();
        e[14] = true;
        e[15] = true;
        int i = 0;
        while (i < jSONArray.length()) {
            e[16] = true;
            String str = "type";
            if (!jSONArray.getJSONObject(i).has(str)) {
                e[17] = true;
            } else {
                e[18] = true;
                if (jSONArray.getJSONObject(i).getString(str).equals(C15222a.f44135A)) {
                    e[19] = true;
                    C9570b bVar = new C9570b();
                    e[20] = true;
                    bVar.fromJson(jSONArray.getJSONObject(i).toString());
                    e[21] = true;
                    arrayList.add(bVar);
                    e[22] = true;
                } else {
                    C9572d dVar = new C9572d();
                    e[23] = true;
                    dVar.fromJson(jSONArray.getJSONObject(i).toString());
                    e[24] = true;
                    arrayList.add(dVar);
                    e[25] = true;
                }
            }
            i++;
            e[26] = true;
        }
        e[27] = true;
        return arrayList;
    }
}
