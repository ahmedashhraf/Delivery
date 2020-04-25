package com.instabug.library.sessionprofiler.model.timeline;

import androidx.annotation.C0224v0;
import com.amplitude.api.C2876e;
import com.instabug.library.model.State;
import com.instabug.library.util.DeviceStateProvider;
import java.io.Serializable;
import java.util.LinkedList;
import org.jivesoftware.smackx.bookmarks.Bookmarks;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.sessionprofiler.model.timeline.c */
/* compiled from: SessionProfilerTimeline */
public class C9987c implements Serializable {

    /* renamed from: R */
    private static transient /* synthetic */ boolean[] f26553R;

    /* renamed from: N */
    private LinkedList<C9988d> f26554N;

    /* renamed from: O */
    private LinkedList<C9988d> f26555O;

    /* renamed from: P */
    private LinkedList<C9988d> f26556P;

    /* renamed from: Q */
    private long f26557Q;

    /* renamed from: a */
    private LinkedList<C9988d> f26558a = new LinkedList<>();

    /* renamed from: b */
    private LinkedList<C9988d> f26559b;

    public C9987c() {
        boolean[] f = m46420f();
        f[0] = true;
        f[1] = true;
        this.f26559b = new LinkedList<>();
        f[2] = true;
        this.f26555O = new LinkedList<>();
        f[3] = true;
        this.f26556P = new LinkedList<>();
        f[4] = true;
        this.f26554N = new LinkedList<>();
        f[5] = true;
        this.f26557Q = DeviceStateProvider.getTotalStorage();
        f[6] = true;
    }

    /* renamed from: e */
    private long m46419e() {
        boolean[] f = m46420f();
        long j = this.f26557Q;
        f[11] = true;
        return j;
    }

    /* renamed from: f */
    private static /* synthetic */ boolean[] m46420f() {
        boolean[] zArr = f26553R;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3764927063103533957L, "com/instabug/library/sessionprofiler/model/timeline/SessionProfilerTimeline", 72);
        f26553R = a;
        return a;
    }

    /* renamed from: a */
    public void mo35596a(float f, boolean z) {
        boolean[] f2 = m46420f();
        this.f26558a.add(new BatteryState(f, z));
        f2[7] = true;
    }

    /* renamed from: b */
    public void mo35600b(C9985a aVar) {
        boolean[] f = m46420f();
        this.f26556P.add(aVar);
        f[10] = true;
    }

    /* renamed from: d */
    public JSONObject mo35601d() {
        String str = "battery";
        boolean[] f = m46420f();
        m46418a(this.f26558a, 30.0f);
        f[35] = true;
        m46418a(this.f26559b, 30.0f);
        f[36] = true;
        m46418a(this.f26554N, 30.0f);
        f[37] = true;
        m46418a(this.f26555O, 120.0f);
        f[38] = true;
        m46418a(this.f26556P, 120.0f);
        f[39] = true;
        JSONObject jSONObject = new JSONObject();
        try {
            f[40] = true;
            f[41] = true;
            f[42] = true;
            JSONObject put = jSONObject.put("version", 1).put(C2876e.f10125d0, "Android");
            LinkedList<C9988d> linkedList = this.f26558a;
            f[43] = true;
            JSONObject put2 = put.put(str, m46417a(linkedList));
            String str2 = State.KEY_ORIENTATION;
            LinkedList<C9988d> linkedList2 = this.f26554N;
            f[44] = true;
            JSONObject put3 = put2.put(str2, m46417a(linkedList2));
            LinkedList<C9988d> linkedList3 = this.f26558a;
            f[45] = true;
            LinkedList<C9988d> linkedList4 = this.f26559b;
            f[46] = true;
            LinkedList<C9988d> linkedList5 = this.f26555O;
            f[47] = true;
            JSONObject put4 = put3.put(str, m46417a(linkedList3)).put("connectivity", m46417a(linkedList4)).put("memory", m46417a(linkedList5));
            String str3 = Bookmarks.ELEMENT;
            LinkedList<C9988d> linkedList6 = this.f26556P;
            f[48] = true;
            f[49] = true;
            long e = m46419e();
            f[50] = true;
            put4.put(str3, m46417a(linkedList6).put("total", e));
            f[51] = true;
        } catch (JSONException e2) {
            f[52] = true;
            e2.printStackTrace();
            f[53] = true;
        }
        f[54] = true;
        return jSONObject;
    }

    /* renamed from: a */
    public void mo35597a(ConnectivityState connectivityState) {
        boolean[] f = m46420f();
        this.f26559b.add(connectivityState);
        f[8] = true;
    }

    /* renamed from: a */
    public void mo35598a(C9985a aVar) {
        boolean[] f = m46420f();
        this.f26555O.add(aVar);
        f[9] = true;
    }

    /* renamed from: a */
    public void mo35599a(C9986b bVar) {
        boolean[] f = m46420f();
        this.f26554N.add(bVar);
        f[12] = true;
    }

    /* renamed from: a */
    public C9987c mo35595a() {
        boolean[] f = m46420f();
        C9987c cVar = new C9987c();
        f[13] = true;
        cVar.f26558a = m46416a(this.f26558a, 30);
        f[14] = true;
        cVar.f26559b = m46416a(this.f26559b, 30);
        f[15] = true;
        cVar.f26554N = m46416a(this.f26554N, 30);
        f[16] = true;
        cVar.f26555O = m46416a(this.f26555O, 120);
        f[17] = true;
        cVar.f26556P = m46416a(this.f26556P, 120);
        cVar.f26557Q = this.f26557Q;
        f[18] = true;
        return cVar;
    }

    @C0224v0
    /* renamed from: a */
    public static void m46418a(LinkedList<C9988d> linkedList, float f) {
        boolean[] f2 = m46420f();
        f2[19] = true;
        int i = 0;
        while (i < linkedList.size()) {
            long j = (long) ((((float) i) / f) * 60000.0f);
            f2[20] = true;
            double d = (double) j;
            Double.isNaN(d);
            double round = (double) Math.round(d / 10.0d);
            Double.isNaN(round);
            double d2 = round / 100.0d;
            f2[21] = true;
            ((C9988d) linkedList.get(i)).setTime(d2);
            i++;
            f2[22] = true;
        }
        f2[23] = true;
    }

    @C0224v0
    /* renamed from: a */
    public static LinkedList<C9988d> m46416a(LinkedList<C9988d> linkedList, int i) {
        boolean[] f = m46420f();
        LinkedList<C9988d> linkedList2 = new LinkedList<>();
        f[24] = true;
        if (linkedList.size() <= i) {
            f[25] = true;
            linkedList2.addAll(linkedList);
            f[26] = true;
            return linkedList2;
        }
        int i2 = 0;
        f[27] = true;
        while (true) {
            if (i2 >= i) {
                f[28] = true;
                break;
            }
            f[29] = true;
            C9988d dVar = (C9988d) linkedList.pollLast();
            if (dVar == null) {
                f[30] = true;
                break;
            }
            f[31] = true;
            linkedList2.addFirst(dVar);
            i2++;
            f[32] = true;
        }
        linkedList.clear();
        f[33] = true;
        linkedList.addAll(linkedList2);
        f[34] = true;
        return linkedList2;
    }

    /* renamed from: a */
    private JSONObject m46417a(LinkedList<C9988d> linkedList) throws JSONException {
        boolean[] f = m46420f();
        JSONObject jSONObject = new JSONObject();
        f[55] = true;
        jSONObject.put("timeline", C9988d.toJSONArray(linkedList));
        f[56] = true;
        return jSONObject;
    }

    /* renamed from: a */
    public static C9987c m46415a(JSONObject jSONObject) {
        String str = "timeline";
        boolean[] f = m46420f();
        C9987c cVar = new C9987c();
        try {
            f[57] = true;
            f[58] = true;
            JSONArray jSONArray = jSONObject.getJSONObject("battery").getJSONArray(str);
            f[59] = true;
            cVar.f26558a = BatteryState.fromJSONArray(jSONArray);
            f[60] = true;
            JSONArray jSONArray2 = jSONObject.getJSONObject("connectivity").getJSONArray(str);
            f[61] = true;
            cVar.f26559b = ConnectivityState.fromJSONArray(jSONArray2);
            String str2 = State.KEY_ORIENTATION;
            f[62] = true;
            JSONArray jSONArray3 = jSONObject.getJSONObject(str2).getJSONArray(str);
            f[63] = true;
            cVar.f26554N = C9986b.m46413a(jSONArray3);
            f[64] = true;
            JSONArray jSONArray4 = jSONObject.getJSONObject("memory").getJSONArray(str);
            f[65] = true;
            cVar.f26555O = C9985a.m46409a(jSONArray4);
            String str3 = Bookmarks.ELEMENT;
            f[66] = true;
            JSONArray jSONArray5 = jSONObject.getJSONObject(str3).getJSONArray(str);
            f[67] = true;
            cVar.f26556P = C9985a.m46409a(jSONArray5);
            f[68] = true;
        } catch (JSONException e) {
            f[69] = true;
            e.printStackTrace();
            f[70] = true;
        }
        f[71] = true;
        return cVar;
    }
}
