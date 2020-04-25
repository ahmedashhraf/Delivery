package com.instabug.survey.models;

import android.text.TextUtils;
import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.models.b */
/* compiled from: Question */
public class C10084b implements Cacheable, Serializable {

    /* renamed from: R */
    private static transient /* synthetic */ boolean[] f26822R;

    /* renamed from: N */
    private C10085a f26823N = C10085a.NOT_AVAILABLE;

    /* renamed from: O */
    private ArrayList<String> f26824O;

    /* renamed from: P */
    private String f26825P;

    /* renamed from: Q */
    private long f26826Q;

    /* renamed from: a */
    private long f26827a = -1;

    /* renamed from: b */
    private String f26828b;

    /* renamed from: com.instabug.survey.models.b$a */
    /* compiled from: Question */
    public enum C10085a {
        TEXT(0),
        MCQ(1),
        STAR_RATE(2),
        NPS(3),
        STORE_RATING(4),
        NOT_AVAILABLE(-1);
        
        private int type;

        static {
            boolean[] e;
            e[4] = true;
        }

        private C10085a(int i) {
            boolean[] e = m46920e();
            this.type = i;
            e[2] = true;
        }

        /* renamed from: d */
        public int mo36220d() {
            boolean[] e = m46920e();
            int i = this.type;
            e[3] = true;
            return i;
        }
    }

    public C10084b() {
        boolean[] i = m46908i();
        i[0] = true;
    }

    /* renamed from: a */
    public static ArrayList<C10084b> m46905a(JSONArray jSONArray) throws JSONException {
        boolean[] i = m46908i();
        ArrayList<C10084b> arrayList = new ArrayList<>();
        i[1] = true;
        i[2] = true;
        int i2 = 0;
        while (i2 < jSONArray.length()) {
            i[3] = true;
            C10084b bVar = new C10084b();
            i[4] = true;
            bVar.fromJson(jSONArray.getJSONObject(i2).toString());
            i[5] = true;
            arrayList.add(bVar);
            i2++;
            i[6] = true;
        }
        i[7] = true;
        return arrayList;
    }

    /* renamed from: b */
    public static JSONArray m46906b(ArrayList<C10084b> arrayList) throws JSONException {
        boolean[] i = m46908i();
        JSONArray jSONArray = new JSONArray();
        i[8] = true;
        i[9] = true;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            i[10] = true;
            jSONArray.put(new JSONObject(((C10084b) arrayList.get(i2)).toJson()));
            i2++;
            i[11] = true;
        }
        i[12] = true;
        return jSONArray;
    }

    /* renamed from: i */
    private static /* synthetic */ boolean[] m46908i() {
        boolean[] zArr = f26822R;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1628617981044132517L, "com/instabug/survey/models/Question", 69);
        f26822R = a;
        return a;
    }

    /* renamed from: c */
    public void mo36214c(String str) {
        boolean[] i = m46908i();
        this.f26825P = str;
        i[22] = true;
        if (str == null) {
            i[23] = true;
        } else if (TextUtils.isEmpty(str)) {
            i[24] = true;
        } else {
            i[25] = true;
            m46907b(System.currentTimeMillis() / 1000);
            i[26] = true;
        }
        i[27] = true;
    }

    /* renamed from: d */
    public String mo36215d() {
        boolean[] i = m46908i();
        String str = this.f26828b;
        i[15] = true;
        return str;
    }

    /* renamed from: e */
    public C10085a mo36216e() {
        boolean[] i = m46908i();
        C10085a aVar = this.f26823N;
        i[17] = true;
        return aVar;
    }

    /* renamed from: f */
    public ArrayList<String> mo36217f() {
        boolean[] i = m46908i();
        ArrayList<String> arrayList = this.f26824O;
        i[19] = true;
        return arrayList;
    }

    public void fromJson(String str) throws JSONException {
        boolean[] i = m46908i();
        InstabugSDKLogger.m46622d(this, str);
        i[38] = true;
        JSONObject jSONObject = new JSONObject(str);
        i[39] = true;
        String str2 = "id";
        if (!jSONObject.has(str2)) {
            i[40] = true;
        } else {
            i[41] = true;
            mo36210a(jSONObject.getLong(str2));
            i[42] = true;
        }
        String str3 = "title";
        if (!jSONObject.has(str3)) {
            i[43] = true;
        } else {
            i[44] = true;
            mo36213b(jSONObject.getString(str3));
            i[45] = true;
        }
        String str4 = "type";
        if (!jSONObject.has(str4)) {
            i[46] = true;
        } else {
            i[47] = true;
            int i2 = jSONObject.getInt(str4);
            if (i2 == 0) {
                mo36211a(C10085a.TEXT);
                i[49] = true;
            } else if (i2 == 1) {
                mo36211a(C10085a.MCQ);
                i[50] = true;
            } else if (i2 == 2) {
                mo36211a(C10085a.STAR_RATE);
                i[51] = true;
            } else if (i2 == 3) {
                mo36211a(C10085a.NPS);
                i[52] = true;
            } else if (i2 != 4) {
                i[48] = true;
            } else {
                mo36211a(C10085a.STORE_RATING);
                i[53] = true;
            }
        }
        String str5 = "options";
        if (!jSONObject.has(str5)) {
            i[54] = true;
        } else {
            i[55] = true;
            JSONArray jSONArray = jSONObject.getJSONArray(str5);
            i[56] = true;
            ArrayList arrayList = new ArrayList();
            i[57] = true;
            int i3 = 0;
            i[58] = true;
            while (i3 < jSONArray.length()) {
                i[59] = true;
                arrayList.add(jSONArray.getString(i3));
                i3++;
                i[60] = true;
            }
            mo36212a(arrayList);
            i[61] = true;
        }
        String str6 = "answer";
        if (!jSONObject.has(str6)) {
            i[62] = true;
        } else {
            i[63] = true;
            mo36214c(jSONObject.getString(str6));
            i[64] = true;
        }
        String str7 = "answered_at";
        if (!jSONObject.has(str7)) {
            i[65] = true;
        } else {
            i[66] = true;
            m46907b(jSONObject.getLong(str7));
            i[67] = true;
        }
        i[68] = true;
    }

    /* renamed from: g */
    public String mo36218g() {
        boolean[] i = m46908i();
        String str = this.f26825P;
        i[21] = true;
        return str;
    }

    /* renamed from: h */
    public long mo36219h() {
        boolean[] i = m46908i();
        long j = this.f26826Q;
        i[28] = true;
        return j;
    }

    public String toJson() throws JSONException {
        boolean[] i = m46908i();
        JSONObject jSONObject = new JSONObject();
        i[30] = true;
        JSONObject put = jSONObject.put("id", mo36209a());
        i[31] = true;
        JSONObject put2 = put.put("title", mo36215d());
        i[32] = true;
        JSONObject put3 = put2.put("type", mo36216e().mo36220d());
        JSONArray jSONArray = new JSONArray(this.f26824O);
        i[33] = true;
        JSONObject put4 = put3.put("options", jSONArray);
        i[34] = true;
        JSONObject put5 = put4.put("answer", mo36218g());
        i[35] = true;
        put5.put("answered_at", mo36219h());
        i[36] = true;
        String jSONObject2 = jSONObject.toString();
        i[37] = true;
        return jSONObject2;
    }

    /* renamed from: b */
    public void mo36213b(String str) {
        boolean[] i = m46908i();
        this.f26828b = str;
        i[16] = true;
    }

    /* renamed from: b */
    private void m46907b(long j) {
        boolean[] i = m46908i();
        this.f26826Q = j;
        i[29] = true;
    }

    /* renamed from: a */
    public long mo36209a() {
        boolean[] i = m46908i();
        long j = this.f26827a;
        i[13] = true;
        return j;
    }

    /* renamed from: a */
    public void mo36210a(long j) {
        boolean[] i = m46908i();
        this.f26827a = j;
        i[14] = true;
    }

    /* renamed from: a */
    public void mo36211a(C10085a aVar) {
        boolean[] i = m46908i();
        this.f26823N = aVar;
        i[18] = true;
    }

    /* renamed from: a */
    public void mo36212a(ArrayList<String> arrayList) {
        boolean[] i = m46908i();
        this.f26824O = arrayList;
        i[20] = true;
    }
}
