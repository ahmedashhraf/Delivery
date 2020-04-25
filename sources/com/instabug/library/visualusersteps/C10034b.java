package com.instabug.library.visualusersteps;

import com.instabug.library.model.C9953d.C9954a;
import com.instabug.library.model.State;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

@SuppressFBWarnings({"NM_METHOD_NAMING_CONVENTION"})
/* renamed from: com.instabug.library.visualusersteps.b */
/* compiled from: VisualUserStep */
public class C10034b implements Serializable {

    /* renamed from: T */
    private static transient /* synthetic */ boolean[] f26708T;

    /* renamed from: N */
    private String f26709N;

    /* renamed from: O */
    private String f26710O;

    /* renamed from: P */
    private C9954a f26711P;

    /* renamed from: Q */
    private long f26712Q;

    /* renamed from: R */
    private String f26713R;

    /* renamed from: S */
    private String f26714S;

    /* renamed from: a */
    private String f26715a;

    /* renamed from: b */
    private String f26716b;

    /* renamed from: com.instabug.library.visualusersteps.b$b */
    /* compiled from: VisualUserStep */
    public static final class C10036b {

        /* renamed from: i */
        private static transient /* synthetic */ boolean[] f26717i;

        /* renamed from: a */
        private String f26718a;

        /* renamed from: b */
        private String f26719b;

        /* renamed from: c */
        private String f26720c;

        /* renamed from: d */
        private String f26721d;

        /* renamed from: e */
        private C9954a f26722e;

        /* renamed from: f */
        private long f26723f;

        /* renamed from: g */
        private String f26724g;

        /* renamed from: h */
        private String f26725h;

        /* synthetic */ C10036b(C9954a aVar, C10035a aVar2) {
            boolean[] b = m46698b();
            this(aVar);
            b[18] = true;
        }

        /* renamed from: a */
        static /* synthetic */ String m46696a(C10036b bVar) {
            boolean[] b = m46698b();
            String str = bVar.f26718a;
            b[10] = true;
            return str;
        }

        /* renamed from: b */
        static /* synthetic */ String m46697b(C10036b bVar) {
            boolean[] b = m46698b();
            String str = bVar.f26719b;
            b[11] = true;
            return str;
        }

        /* renamed from: b */
        private static /* synthetic */ boolean[] m46698b() {
            boolean[] zArr = f26717i;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-3656402473959470859L, "com/instabug/library/visualusersteps/VisualUserStep$Builder", 19);
            f26717i = a;
            return a;
        }

        /* renamed from: c */
        static /* synthetic */ String m46699c(C10036b bVar) {
            boolean[] b = m46698b();
            String str = bVar.f26720c;
            b[12] = true;
            return str;
        }

        /* renamed from: d */
        static /* synthetic */ String m46700d(C10036b bVar) {
            boolean[] b = m46698b();
            String str = bVar.f26721d;
            b[13] = true;
            return str;
        }

        /* renamed from: e */
        static /* synthetic */ C9954a m46701e(C10036b bVar) {
            boolean[] b = m46698b();
            C9954a aVar = bVar.f26722e;
            b[14] = true;
            return aVar;
        }

        /* renamed from: f */
        static /* synthetic */ long m46702f(C10036b bVar) {
            boolean[] b = m46698b();
            long j = bVar.f26723f;
            b[15] = true;
            return j;
        }

        /* renamed from: g */
        static /* synthetic */ String m46703g(C10036b bVar) {
            boolean[] b = m46698b();
            String str = bVar.f26724g;
            b[16] = true;
            return str;
        }

        /* renamed from: h */
        static /* synthetic */ String m46704h(C10036b bVar) {
            boolean[] b = m46698b();
            String str = bVar.f26725h;
            b[17] = true;
            return str;
        }

        private C10036b(C9954a aVar) {
            boolean[] b = m46698b();
            b[0] = true;
            this.f26723f = System.currentTimeMillis();
            this.f26722e = aVar;
            b[1] = true;
        }

        /* renamed from: a */
        public C10036b mo36069a(String str) {
            boolean[] b = m46698b();
            this.f26718a = str;
            b[2] = true;
            return this;
        }

        /* renamed from: b */
        public C10036b mo36071b(String str) {
            boolean[] b = m46698b();
            this.f26719b = str;
            b[3] = true;
            return this;
        }

        /* renamed from: c */
        public C10036b mo36072c(String str) {
            boolean[] b = m46698b();
            this.f26720c = str;
            b[4] = true;
            return this;
        }

        /* renamed from: d */
        public C10036b mo36073d(String str) {
            boolean[] b = m46698b();
            this.f26721d = str;
            b[5] = true;
            return this;
        }

        /* renamed from: e */
        public C10036b mo36074e(String str) {
            boolean[] b = m46698b();
            this.f26724g = str;
            b[7] = true;
            return this;
        }

        /* renamed from: f */
        public C10036b mo36075f(String str) {
            boolean[] b = m46698b();
            this.f26725h = str;
            b[8] = true;
            return this;
        }

        /* renamed from: a */
        public C10036b mo36068a(long j) {
            boolean[] b = m46698b();
            this.f26723f = j;
            b[6] = true;
            return this;
        }

        /* renamed from: a */
        public C10034b mo36070a() {
            boolean[] b = m46698b();
            C10034b bVar = new C10034b(this, null);
            b[9] = true;
            return bVar;
        }
    }

    /* synthetic */ C10034b(C10036b bVar, C10035a aVar) {
        boolean[] l = m46680l();
        this(bVar);
        l[150] = true;
    }

    /* renamed from: a */
    public static C10036b m46674a(C9954a aVar) {
        boolean[] l = m46680l();
        C10036b bVar = new C10036b(aVar, null);
        l[9] = true;
        return bVar;
    }

    /* renamed from: g */
    private void m46679g(String str) {
        boolean[] l = m46680l();
        this.f26716b = str;
        l[133] = true;
    }

    /* renamed from: l */
    private static /* synthetic */ boolean[] m46680l() {
        boolean[] zArr = f26708T;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-8720134224742289964L, "com/instabug/library/visualusersteps/VisualUserStep", C13959t.f40933n2);
        f26708T = a;
        return a;
    }

    /* renamed from: b */
    public void mo36054b(String str) {
        boolean[] l = m46680l();
        this.f26715a = str;
        l[131] = true;
    }

    /* renamed from: c */
    public void mo36055c(String str) {
        boolean[] l = m46680l();
        this.f26709N = str;
        l[135] = true;
    }

    /* renamed from: d */
    public String mo36056d() {
        boolean[] l = m46680l();
        String str = this.f26715a;
        l[130] = true;
        return str;
    }

    /* renamed from: e */
    public String mo36058e() {
        boolean[] l = m46680l();
        String str = this.f26716b;
        l[132] = true;
        return str;
    }

    /* renamed from: f */
    public String mo36060f() {
        boolean[] l = m46680l();
        String str = this.f26709N;
        l[134] = true;
        return str;
    }

    /* renamed from: h */
    public C9954a mo36063h() {
        boolean[] l = m46680l();
        C9954a aVar = this.f26711P;
        l[141] = true;
        return aVar;
    }

    /* renamed from: i */
    public long mo36064i() {
        boolean[] l = m46680l();
        long j = this.f26712Q;
        l[143] = true;
        return j;
    }

    /* renamed from: j */
    public String mo36065j() {
        boolean[] l = m46680l();
        String str = this.f26713R;
        l[145] = true;
        return str;
    }

    /* renamed from: k */
    public String mo36066k() {
        boolean[] l = m46680l();
        String str = this.f26714S;
        l[147] = true;
        return str;
    }

    public String toString() {
        boolean[] l = m46680l();
        StringBuilder sb = new StringBuilder();
        sb.append("VisualUserStep{parentScreenId='");
        sb.append(this.f26715a);
        sb.append('\'');
        sb.append(", screenName='");
        sb.append(this.f26716b);
        sb.append('\'');
        sb.append(", screenshotId='");
        sb.append(this.f26709N);
        sb.append('\'');
        sb.append(", screenId='");
        sb.append(this.f26710O);
        sb.append('\'');
        sb.append(", eventType='");
        sb.append(this.f26711P);
        sb.append('\'');
        sb.append(", date=");
        sb.append(this.f26712Q);
        sb.append(", view='");
        sb.append(this.f26713R);
        sb.append('\'');
        sb.append('}');
        String sb2 = sb.toString();
        l[149] = true;
        return sb2;
    }

    private C10034b(C10036b bVar) {
        boolean[] l = m46680l();
        l[0] = true;
        mo36054b(C10036b.m46696a(bVar));
        l[1] = true;
        m46679g(C10036b.m46697b(bVar));
        l[2] = true;
        mo36055c(C10036b.m46699c(bVar));
        l[3] = true;
        mo36057d(C10036b.m46700d(bVar));
        l[4] = true;
        m46678b(C10036b.m46701e(bVar));
        l[5] = true;
        mo36053a(C10036b.m46702f(bVar));
        l[6] = true;
        mo36059e(C10036b.m46703g(bVar));
        l[7] = true;
        mo36061f(C10036b.m46704h(bVar));
        l[8] = true;
    }

    /* renamed from: a */
    public static ArrayList<C10034b> m46677a(JSONArray jSONArray) throws JSONException {
        boolean[] l = m46680l();
        ArrayList<C10034b> arrayList = new ArrayList<>();
        l[10] = true;
        if (jSONArray == null) {
            l[11] = true;
        } else if (jSONArray.length() <= 0) {
            l[12] = true;
        } else {
            l[13] = true;
            int i = 0;
            l[14] = true;
            while (i < jSONArray.length()) {
                l[16] = true;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                l[17] = true;
                C10034b a = m46675a(jSONObject);
                l[18] = true;
                arrayList.add(a);
                i++;
                l[19] = true;
            }
            l[15] = true;
        }
        l[20] = true;
        return arrayList;
    }

    /* renamed from: d */
    public void mo36057d(String str) {
        boolean[] l = m46680l();
        this.f26710O = str;
        l[140] = true;
    }

    /* renamed from: e */
    public void mo36059e(String str) {
        boolean[] l = m46680l();
        this.f26713R = str;
        l[146] = true;
    }

    /* renamed from: f */
    public void mo36061f(String str) {
        boolean[] l = m46680l();
        this.f26714S = str;
        l[148] = true;
    }

    /* renamed from: b */
    private void m46678b(C9954a aVar) {
        boolean[] l = m46680l();
        this.f26711P = aVar;
        l[142] = true;
    }

    /* renamed from: g */
    public String mo36062g() {
        boolean[] l = m46680l();
        String str = this.f26710O;
        l[139] = true;
        return str;
    }

    /* renamed from: a */
    public static C10034b m46675a(JSONObject jSONObject) throws JSONException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean[] l = m46680l();
        C9954a aVar = C9954a.UNKNOWN;
        l[21] = true;
        String str7 = "event_type";
        if (!jSONObject.has(str7)) {
            l[22] = true;
        } else {
            Object obj = JSONObject.NULL;
            l[23] = true;
            if (obj.toString().equals(jSONObject.getString(str7))) {
                l[24] = true;
            } else {
                l[25] = true;
                String upperCase = jSONObject.getString(str7).toUpperCase();
                l[26] = true;
                aVar = C9954a.valueOf(upperCase);
                l[27] = true;
            }
        }
        l[28] = true;
        String str8 = "screen_name";
        String str9 = null;
        if (!jSONObject.has(str8)) {
            l[29] = true;
            str = null;
        } else {
            l[30] = true;
            str = jSONObject.getString(str8);
            l[31] = true;
        }
        l[32] = true;
        String str10 = "screen_identifier";
        if (!jSONObject.has(str10)) {
            l[33] = true;
            str2 = null;
        } else {
            l[34] = true;
            str2 = jSONObject.getString(str10);
            l[35] = true;
        }
        l[36] = true;
        String str11 = "screenshot_identifier";
        if (!jSONObject.has(str11)) {
            l[37] = true;
            str3 = null;
        } else {
            l[38] = true;
            str3 = jSONObject.getString(str11);
            l[39] = true;
        }
        l[40] = true;
        String str12 = "date";
        if (!jSONObject.has(str12)) {
            l[41] = true;
            str4 = null;
        } else {
            l[42] = true;
            str4 = jSONObject.getString(str12);
            l[43] = true;
        }
        l[44] = true;
        String str13 = "parent_screen_identifier";
        if (!jSONObject.has(str13)) {
            l[45] = true;
            str5 = null;
        } else {
            l[46] = true;
            str5 = jSONObject.getString(str13);
            l[47] = true;
        }
        l[48] = true;
        String str14 = "view";
        if (!jSONObject.has(str14)) {
            l[49] = true;
            str6 = null;
        } else {
            l[50] = true;
            str6 = jSONObject.getString(str14);
            l[51] = true;
        }
        l[52] = true;
        String str15 = State.KEY_ORIENTATION;
        String str16 = "landscape";
        String str17 = "portrait";
        if (!jSONObject.has(str15)) {
            l[53] = true;
        } else {
            l[54] = true;
            String string = jSONObject.getString(str15);
            l[55] = true;
            char c = 65535;
            int hashCode = string.hashCode();
            if (hashCode != 729267099) {
                if (hashCode != 1430647483) {
                    l[56] = true;
                } else if (!string.equals(str16)) {
                    l[57] = true;
                } else {
                    c = 0;
                    l[58] = true;
                }
            } else if (!string.equals(str17)) {
                l[59] = true;
            } else {
                c = 2;
                l[60] = true;
            }
            if (c != 0) {
                l[62] = true;
                str9 = str17;
            } else {
                l[61] = true;
                str9 = str16;
            }
        }
        C10036b a = m46674a(aVar);
        l[63] = true;
        C10036b b = a.mo36071b(str);
        l[64] = true;
        C10036b c2 = b.mo36072c(str3);
        l[65] = true;
        C10036b a2 = c2.mo36068a(Long.parseLong(str4));
        l[66] = true;
        C10036b a3 = a2.mo36069a(str5);
        l[67] = true;
        C10036b e = a3.mo36074e(str6);
        l[68] = true;
        C10036b f = e.mo36075f(str9);
        l[69] = true;
        C10036b d = f.mo36073d(str2);
        l[70] = true;
        C10034b a4 = d.mo36070a();
        l[71] = true;
        return a4;
    }

    /* renamed from: a */
    public static String m46676a(ArrayList<C10034b> arrayList) {
        boolean[] l = m46680l();
        JSONArray jSONArray = new JSONArray();
        l[72] = true;
        if (arrayList == null) {
            l[73] = true;
        } else if (arrayList.size() <= 0) {
            l[74] = true;
        } else {
            l[75] = true;
            Iterator it = arrayList.iterator();
            l[76] = true;
            while (it.hasNext()) {
                C10034b bVar = (C10034b) it.next();
                l[78] = true;
                jSONArray.put(bVar.mo36052a());
                l[79] = true;
            }
            l[77] = true;
        }
        String jSONArray2 = jSONArray.toString();
        l[80] = true;
        return jSONArray2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051 A[Catch:{ JSONException -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056 A[Catch:{ JSONException -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0086 A[Catch:{ JSONException -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b A[Catch:{ JSONException -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb A[Catch:{ JSONException -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c0 A[Catch:{ JSONException -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f0 A[Catch:{ JSONException -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f5 A[Catch:{ JSONException -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0138 A[Catch:{ JSONException -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x013d A[Catch:{ JSONException -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x016d A[Catch:{ JSONException -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0172 A[Catch:{ JSONException -> 0x019f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo36052a() {
        /*
            r8 = this;
            boolean[] r0 = m46680l()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r2 = 81
            r3 = 1
            r0[r2] = r3     // Catch:{ JSONException -> 0x019f }
            java.lang.String r2 = "parent_screen_identifier"
            r4 = 82
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
            java.lang.String r4 = r8.mo36056d()     // Catch:{ JSONException -> 0x019f }
            java.lang.String r5 = "null"
            if (r4 != 0) goto L_0x0021
            r4 = 83
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
            goto L_0x002f
        L_0x0021:
            java.lang.String r4 = r8.mo36056d()     // Catch:{ JSONException -> 0x019f }
            boolean r4 = r4.equals(r5)     // Catch:{ JSONException -> 0x019f }
            if (r4 == 0) goto L_0x0036
            r4 = 84
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
        L_0x002f:
            java.lang.Object r4 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x019f }
            r6 = 85
            r0[r6] = r3     // Catch:{ JSONException -> 0x019f }
            goto L_0x0042
        L_0x0036:
            r4 = 86
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
            java.lang.String r4 = r8.mo36056d()     // Catch:{ JSONException -> 0x019f }
            r6 = 87
            r0[r6] = r3     // Catch:{ JSONException -> 0x019f }
        L_0x0042:
            r1.put(r2, r4)     // Catch:{ JSONException -> 0x019f }
            java.lang.String r2 = "screen_name"
            r4 = 88
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
            java.lang.String r4 = r8.mo36058e()     // Catch:{ JSONException -> 0x019f }
            if (r4 != 0) goto L_0x0056
            r4 = 89
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
            goto L_0x0064
        L_0x0056:
            java.lang.String r4 = r8.mo36058e()     // Catch:{ JSONException -> 0x019f }
            boolean r4 = r4.equals(r5)     // Catch:{ JSONException -> 0x019f }
            if (r4 == 0) goto L_0x006b
            r4 = 90
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
        L_0x0064:
            java.lang.Object r4 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x019f }
            r6 = 91
            r0[r6] = r3     // Catch:{ JSONException -> 0x019f }
            goto L_0x0077
        L_0x006b:
            r4 = 92
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
            java.lang.String r4 = r8.mo36058e()     // Catch:{ JSONException -> 0x019f }
            r6 = 93
            r0[r6] = r3     // Catch:{ JSONException -> 0x019f }
        L_0x0077:
            r1.put(r2, r4)     // Catch:{ JSONException -> 0x019f }
            java.lang.String r2 = "screenshot_identifier"
            r4 = 94
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
            java.lang.String r4 = r8.mo36060f()     // Catch:{ JSONException -> 0x019f }
            if (r4 != 0) goto L_0x008b
            r4 = 95
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
            goto L_0x009d
        L_0x008b:
            java.lang.String r4 = r8.mo36060f()     // Catch:{ JSONException -> 0x019f }
            r6 = 96
            r0[r6] = r3     // Catch:{ JSONException -> 0x019f }
            boolean r4 = r4.equals(r5)     // Catch:{ JSONException -> 0x019f }
            if (r4 == 0) goto L_0x00a4
            r4 = 97
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
        L_0x009d:
            java.lang.Object r4 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x019f }
            r6 = 98
            r0[r6] = r3     // Catch:{ JSONException -> 0x019f }
            goto L_0x00ac
        L_0x00a4:
            java.lang.String r4 = r8.mo36060f()     // Catch:{ JSONException -> 0x019f }
            r6 = 99
            r0[r6] = r3     // Catch:{ JSONException -> 0x019f }
        L_0x00ac:
            r1.put(r2, r4)     // Catch:{ JSONException -> 0x019f }
            java.lang.String r2 = "screen_identifier"
            r4 = 100
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
            java.lang.String r4 = r8.mo36062g()     // Catch:{ JSONException -> 0x019f }
            if (r4 != 0) goto L_0x00c0
            r4 = 101(0x65, float:1.42E-43)
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
            goto L_0x00ce
        L_0x00c0:
            java.lang.String r4 = r8.mo36062g()     // Catch:{ JSONException -> 0x019f }
            boolean r4 = r4.equals(r5)     // Catch:{ JSONException -> 0x019f }
            if (r4 == 0) goto L_0x00d5
            r4 = 102(0x66, float:1.43E-43)
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
        L_0x00ce:
            java.lang.Object r4 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x019f }
            r6 = 103(0x67, float:1.44E-43)
            r0[r6] = r3     // Catch:{ JSONException -> 0x019f }
            goto L_0x00e1
        L_0x00d5:
            r4 = 104(0x68, float:1.46E-43)
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
            java.lang.String r4 = r8.mo36062g()     // Catch:{ JSONException -> 0x019f }
            r6 = 105(0x69, float:1.47E-43)
            r0[r6] = r3     // Catch:{ JSONException -> 0x019f }
        L_0x00e1:
            r1.put(r2, r4)     // Catch:{ JSONException -> 0x019f }
            java.lang.String r2 = "event_type"
            r4 = 106(0x6a, float:1.49E-43)
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
            com.instabug.library.model.d$a r4 = r8.mo36063h()     // Catch:{ JSONException -> 0x019f }
            if (r4 != 0) goto L_0x00f5
            r4 = 107(0x6b, float:1.5E-43)
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
            goto L_0x0101
        L_0x00f5:
            com.instabug.library.model.d$a r4 = r8.mo36063h()     // Catch:{ JSONException -> 0x019f }
            com.instabug.library.model.d$a r6 = com.instabug.library.model.C9953d.C9954a.UNKNOWN     // Catch:{ JSONException -> 0x019f }
            if (r4 != r6) goto L_0x0108
            r4 = 108(0x6c, float:1.51E-43)
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
        L_0x0101:
            java.lang.Object r4 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x019f }
            r6 = 109(0x6d, float:1.53E-43)
            r0[r6] = r3     // Catch:{ JSONException -> 0x019f }
            goto L_0x011c
        L_0x0108:
            r4 = 110(0x6e, float:1.54E-43)
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
            com.instabug.library.model.d$a r4 = r8.mo36063h()     // Catch:{ JSONException -> 0x019f }
            java.lang.String r4 = r4.toString()     // Catch:{ JSONException -> 0x019f }
            java.lang.String r4 = r4.toLowerCase()     // Catch:{ JSONException -> 0x019f }
            r6 = 111(0x6f, float:1.56E-43)
            r0[r6] = r3     // Catch:{ JSONException -> 0x019f }
        L_0x011c:
            r1.put(r2, r4)     // Catch:{ JSONException -> 0x019f }
            r2 = 112(0x70, float:1.57E-43)
            r0[r2] = r3     // Catch:{ JSONException -> 0x019f }
            java.lang.String r2 = "date"
            long r6 = r8.mo36064i()     // Catch:{ JSONException -> 0x019f }
            r1.put(r2, r6)     // Catch:{ JSONException -> 0x019f }
            r2 = 113(0x71, float:1.58E-43)
            r0[r2] = r3     // Catch:{ JSONException -> 0x019f }
            java.lang.String r2 = "view"
            java.lang.String r4 = r8.mo36065j()     // Catch:{ JSONException -> 0x019f }
            if (r4 != 0) goto L_0x013d
            r4 = 114(0x72, float:1.6E-43)
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
            goto L_0x014b
        L_0x013d:
            java.lang.String r4 = r8.mo36065j()     // Catch:{ JSONException -> 0x019f }
            boolean r4 = r4.equals(r5)     // Catch:{ JSONException -> 0x019f }
            if (r4 == 0) goto L_0x0152
            r4 = 115(0x73, float:1.61E-43)
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
        L_0x014b:
            java.lang.Object r4 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x019f }
            r6 = 116(0x74, float:1.63E-43)
            r0[r6] = r3     // Catch:{ JSONException -> 0x019f }
            goto L_0x015e
        L_0x0152:
            r4 = 117(0x75, float:1.64E-43)
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
            java.lang.String r4 = r8.mo36065j()     // Catch:{ JSONException -> 0x019f }
            r6 = 118(0x76, float:1.65E-43)
            r0[r6] = r3     // Catch:{ JSONException -> 0x019f }
        L_0x015e:
            r1.put(r2, r4)     // Catch:{ JSONException -> 0x019f }
            r2 = 119(0x77, float:1.67E-43)
            r0[r2] = r3     // Catch:{ JSONException -> 0x019f }
            java.lang.String r2 = "orientation"
            java.lang.String r4 = r8.mo36066k()     // Catch:{ JSONException -> 0x019f }
            if (r4 != 0) goto L_0x0172
            r4 = 120(0x78, float:1.68E-43)
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
            goto L_0x0184
        L_0x0172:
            r4 = 121(0x79, float:1.7E-43)
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
            java.lang.String r4 = r8.mo36066k()     // Catch:{ JSONException -> 0x019f }
            boolean r4 = r4.equals(r5)     // Catch:{ JSONException -> 0x019f }
            if (r4 == 0) goto L_0x018b
            r4 = 122(0x7a, float:1.71E-43)
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
        L_0x0184:
            java.lang.Object r4 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x019f }
            r5 = 123(0x7b, float:1.72E-43)
            r0[r5] = r3     // Catch:{ JSONException -> 0x019f }
            goto L_0x0197
        L_0x018b:
            r4 = 124(0x7c, float:1.74E-43)
            r0[r4] = r3     // Catch:{ JSONException -> 0x019f }
            java.lang.String r4 = r8.mo36066k()     // Catch:{ JSONException -> 0x019f }
            r5 = 125(0x7d, float:1.75E-43)
            r0[r5] = r3     // Catch:{ JSONException -> 0x019f }
        L_0x0197:
            r1.put(r2, r4)     // Catch:{ JSONException -> 0x019f }
            r2 = 126(0x7e, float:1.77E-43)
            r0[r2] = r3
            goto L_0x01ab
        L_0x019f:
            r2 = move-exception
            r4 = 127(0x7f, float:1.78E-43)
            r0[r4] = r3
            r2.printStackTrace()
            r2 = 128(0x80, float:1.794E-43)
            r0[r2] = r3
        L_0x01ab:
            r2 = 129(0x81, float:1.81E-43)
            r0[r2] = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.visualusersteps.C10034b.mo36052a():org.json.JSONObject");
    }

    /* renamed from: a */
    public void mo36053a(long j) {
        boolean[] l = m46680l();
        this.f26712Q = j;
        l[144] = true;
    }
}
