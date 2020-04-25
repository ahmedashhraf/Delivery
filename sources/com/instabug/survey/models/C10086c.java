package com.instabug.survey.models;

import com.google.firebase.analytics.FirebaseAnalytics.C5854b;
import com.instabug.library.internal.storage.cache.Cacheable;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.models.c */
/* compiled from: SurveyEvent */
public class C10086c implements Cacheable, Serializable {

    /* renamed from: O */
    private static transient /* synthetic */ boolean[] f26829O;

    /* renamed from: N */
    int f26830N;

    /* renamed from: a */
    C10087a f26831a;

    /* renamed from: b */
    long f26832b;

    /* renamed from: com.instabug.survey.models.c$a */
    /* compiled from: SurveyEvent */
    public enum C10087a {
        SHOW("show"),
        DISMISS("dismiss"),
        SUBMIT("submit"),
        RATE("rate"),
        UNDEFINED("undefined");
        
        private final String event;

        static {
            boolean[] d;
            d[4] = true;
        }

        private C10087a(String str) {
            boolean[] d = m46931d();
            this.event = str;
            d[2] = true;
        }

        public String toString() {
            boolean[] d = m46931d();
            String str = this.event;
            d[3] = true;
            return str;
        }
    }

    public C10086c() {
        m46924f()[0] = true;
    }

    /* renamed from: f */
    private static /* synthetic */ boolean[] m46924f() {
        boolean[] zArr = f26829O;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-2855290981370778555L, "com/instabug/survey/models/SurveyEvent", 50);
        f26829O = a;
        return a;
    }

    /* renamed from: a */
    public C10087a mo36221a() {
        boolean[] f = m46924f();
        C10087a aVar = this.f26831a;
        f[2] = true;
        return aVar;
    }

    /* renamed from: d */
    public long mo36225d() {
        boolean[] f = m46924f();
        long j = this.f26832b;
        f[4] = true;
        return j;
    }

    /* renamed from: e */
    public int mo36226e() {
        boolean[] f = m46924f();
        int i = this.f26830N;
        f[6] = true;
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void fromJson(java.lang.String r8) throws org.json.JSONException {
        /*
            r7 = this;
            boolean[] r0 = m46924f()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r8)
            r8 = 1
            r2 = 28
            r0[r2] = r8
            java.lang.String r2 = "event_type"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x001c
            r2 = 29
            r0[r2] = r8
            goto L_0x00a8
        L_0x001c:
            r3 = 30
            r0[r3] = r8
            java.lang.String r2 = r1.getString(r2)
            r3 = 31
            r0[r3] = r8
            r3 = -1
            int r4 = r2.hashCode()
            r5 = -891535336(0xffffffffcadc4018, float:-7217164.0)
            r6 = 2
            if (r4 == r5) goto L_0x0068
            r5 = 3493088(0x354ce0, float:4.894859E-39)
            if (r4 == r5) goto L_0x0055
            r5 = 1671672458(0x63a3b28a, float:6.039369E21)
            if (r4 == r5) goto L_0x0042
            r2 = 32
            r0[r2] = r8
            goto L_0x0074
        L_0x0042:
            java.lang.String r4 = "dismiss"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x004f
            r2 = 35
            r0[r2] = r8
            goto L_0x0074
        L_0x004f:
            r2 = 36
            r0[r2] = r8
            r2 = 1
            goto L_0x007b
        L_0x0055:
            java.lang.String r4 = "rate"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0062
            r2 = 37
            r0[r2] = r8
            goto L_0x0074
        L_0x0062:
            r2 = 38
            r0[r2] = r8
            r2 = 2
            goto L_0x007b
        L_0x0068:
            java.lang.String r4 = "submit"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0076
            r2 = 33
            r0[r2] = r8
        L_0x0074:
            r2 = -1
            goto L_0x007b
        L_0x0076:
            r2 = 0
            r3 = 34
            r0[r3] = r8
        L_0x007b:
            if (r2 == 0) goto L_0x009f
            if (r2 == r8) goto L_0x0095
            if (r2 == r6) goto L_0x008b
            com.instabug.survey.models.c$a r2 = com.instabug.survey.models.C10086c.C10087a.UNDEFINED
            r7.mo36224a(r2)
            r2 = 42
            r0[r2] = r8
            goto L_0x00a8
        L_0x008b:
            com.instabug.survey.models.c$a r2 = com.instabug.survey.models.C10086c.C10087a.RATE
            r7.mo36224a(r2)
            r2 = 41
            r0[r2] = r8
            goto L_0x00a8
        L_0x0095:
            com.instabug.survey.models.c$a r2 = com.instabug.survey.models.C10086c.C10087a.DISMISS
            r7.mo36224a(r2)
            r2 = 40
            r0[r2] = r8
            goto L_0x00a8
        L_0x009f:
            com.instabug.survey.models.c$a r2 = com.instabug.survey.models.C10086c.C10087a.SUBMIT
            r7.mo36224a(r2)
            r2 = 39
            r0[r2] = r8
        L_0x00a8:
            java.lang.String r2 = "index"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x00b5
            r2 = 43
            r0[r2] = r8
            goto L_0x00c4
        L_0x00b5:
            r3 = 44
            r0[r3] = r8
            int r2 = r1.getInt(r2)
            r7.mo36222a(r2)
            r2 = 45
            r0[r2] = r8
        L_0x00c4:
            java.lang.String r2 = "timestamp"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x00d1
            r1 = 46
            r0[r1] = r8
            goto L_0x00e0
        L_0x00d1:
            r3 = 47
            r0[r3] = r8
            long r1 = r1.getLong(r2)
            r7.mo36223a(r1)
            r1 = 48
            r0[r1] = r8
        L_0x00e0:
            r1 = 49
            r0[r1] = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.survey.models.C10086c.fromJson(java.lang.String):void");
    }

    public String toJson() throws JSONException {
        boolean[] f = m46924f();
        JSONObject jSONObject = new JSONObject();
        f[23] = true;
        jSONObject.put("event_type", mo36221a().toString());
        f[24] = true;
        jSONObject.put(C5854b.f16918Y, mo36226e());
        f[25] = true;
        jSONObject.put("timestamp", this.f26832b);
        f[26] = true;
        String jSONObject2 = jSONObject.toString();
        f[27] = true;
        return jSONObject2;
    }

    /* renamed from: a */
    public void mo36224a(C10087a aVar) {
        boolean[] f = m46924f();
        this.f26831a = aVar;
        f[3] = true;
    }

    public C10086c(C10087a aVar, long j, int i) {
        boolean[] f = m46924f();
        this.f26831a = aVar;
        this.f26832b = j;
        this.f26830N = i;
        f[1] = true;
    }

    /* renamed from: a */
    public void mo36223a(long j) {
        boolean[] f = m46924f();
        this.f26832b = j;
        f[5] = true;
    }

    /* renamed from: a */
    public void mo36222a(int i) {
        boolean[] f = m46924f();
        this.f26830N = i;
        f[7] = true;
    }

    /* renamed from: a */
    public static ArrayList<C10086c> m46922a(JSONArray jSONArray) throws JSONException {
        boolean[] f = m46924f();
        ArrayList<C10086c> arrayList = new ArrayList<>();
        f[8] = true;
        f[9] = true;
        int i = 0;
        while (i < jSONArray.length()) {
            f[10] = true;
            C10086c cVar = new C10086c();
            f[11] = true;
            cVar.fromJson(jSONArray.getJSONObject(i).toString());
            f[12] = true;
            arrayList.add(cVar);
            i++;
            f[13] = true;
        }
        f[14] = true;
        return arrayList;
    }

    /* renamed from: a */
    public static JSONArray m46923a(ArrayList<C10086c> arrayList) throws JSONException {
        boolean[] f = m46924f();
        JSONArray jSONArray = new JSONArray();
        f[15] = true;
        f[16] = true;
        int i = 0;
        while (i < arrayList.size()) {
            f[17] = true;
            if (arrayList.get(i) == null) {
                f[18] = true;
            } else {
                f[19] = true;
                jSONArray.put(new JSONObject(((C10086c) arrayList.get(i)).toJson()));
                f[20] = true;
            }
            i++;
            f[21] = true;
        }
        f[22] = true;
        return jSONArray;
    }
}
